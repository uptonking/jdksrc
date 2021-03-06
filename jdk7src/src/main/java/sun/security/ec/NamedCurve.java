/*
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.security.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Pattern;

import java.security.spec.*;

import sun.security.util.ObjectIdentifier;
import sun.security.util.DerOutputStream;

/**
 * Repository for well-known Elliptic Curve parameters. It is used by both
 * the SunPKCS11 and SunJSSE code.
 *
 * @since   1.6
 * @author  Andreas Sterbenz
 */
public final class NamedCurve extends ECParameterSpec {

    // friendly name for toString() output
    private final String name;

    // well known OID
    private final ObjectIdentifier oid;

    // encoded form (as NamedCurve identified via OID)
    private final byte[] encoded;

    private NamedCurve(String name, ObjectIdentifier oid, EllipticCurve curve,
            ECPoint g, BigInteger n, int h) throws IOException {
        super(curve, g, n, h);
        this.name = name;
        this.oid = oid;

        DerOutputStream out = new DerOutputStream();
        out.putOID(oid);
        encoded = out.toByteArray();
    }

    // Return a NamedCurve for the specified OID/name or null if unknown.
    // Used by SunJSSE and SunPKCS11.
    public static ECParameterSpec getECParameterSpec(String name) {
        NamedCurve spec = oidMap.get(name);
        return (spec != null) ? spec : nameMap.get(name);
    }

    // Return a NamedCurve for the specified OID or null if unknown.
    static ECParameterSpec getECParameterSpec(ObjectIdentifier oid) {
        return getECParameterSpec(oid.toString());
    }

    // Return EC parameters for the specified field size. If there are known
    // NIST recommended parameters for the given length, they are returned.
    // Otherwise, if there are multiple matches for the given size, an
    // arbitrary one is returns.
    // If no parameters are known, the method returns null.
    // NOTE that this method returns both prime and binary curves.
    // Used by SunPKCS11.
    public static ECParameterSpec getECParameterSpec(int length) {
        return lengthMap.get(length);
    }

    // Used by unit tests.
    public static Collection<? extends ECParameterSpec> knownECParameterSpecs() {
        return Collections.unmodifiableCollection(oidMap.values());
    }

    byte[] getEncoded() {
        return encoded.clone();
    }

    ObjectIdentifier getObjectIdentifier() {
        return oid;
    }

    public String toString() {
        return name + " (" + oid + ")";
    }

    private static final Map<String,NamedCurve> oidMap =
                                        new LinkedHashMap<String,NamedCurve>();
    private static final Map<String,NamedCurve> nameMap =
                                        new HashMap<String,NamedCurve>();
    private static final Map<Integer,NamedCurve> lengthMap =
                                        new HashMap<Integer,NamedCurve>();

    private static BigInteger bi(String s) {
        return new BigInteger(s, 16);
    }

    private static Pattern SPLIT_PATTERN = Pattern.compile(",|\\[|\\]");

    private static void add(String name, String soid, int type, String sfield,
            String a, String b, String x, String y, String n, int h) {
        BigInteger p = bi(sfield);
        ECField field;
        if ((type == P) || (type == PD)) {
            field = new ECFieldFp(p);
        } else if ((type == B) || (type == BD)) {
            field = new ECFieldF2m(p.bitLength() - 1, p);
        } else {
            throw new RuntimeException("Invalid type: " + type);
        }

        EllipticCurve curve = new EllipticCurve(field, bi(a), bi(b));
        ECPoint g = new ECPoint(bi(x), bi(y));

        try {
            ObjectIdentifier oid = new ObjectIdentifier(soid);
            NamedCurve params = new NamedCurve(name, oid, curve, g, bi(n), h);
            if (oidMap.put(soid, params) != null) {
                throw new RuntimeException("Duplication oid: " + soid);
            }
            String[] commonNames = SPLIT_PATTERN.split(name);
            for (String commonName : commonNames) {
                if (nameMap.put(commonName.trim(), params) != null) {
                    throw new RuntimeException("Duplication name: " + commonName);
                }
            }
            int len = field.getFieldSize();
            if ((type == PD) || (type == BD) || (lengthMap.get(len) == null)) {
                // add entry if none present for this field size or if
                // the curve is marked as a default curve.
                lengthMap.put(len, params);
            }
        } catch (IOException e) {
            throw new RuntimeException("Internal error", e);
        }
    }

    private final static int P  = 1; // prime curve
    private final static int B  = 2; // binary curve
    private final static int PD = 5; // prime curve, mark as default
    private final static int BD = 6; // binary curve, mark as default

    static {
        /* SEC2 prime curves */
        add("secp256r1 [NIST P-256, X9.62 prime256v1]", "1.2.840.10045.3.1.7", PD,
            "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF",
            "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC",
            "5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B",
            "6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296",
            "4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5",
            "FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551",
            1);

        add("secp384r1 [NIST P-384]", "1.3.132.0.34", PD,
            "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF",
            "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC",
            "B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF",
            "AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7",
            "3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F",
            "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973",
            1);

        add("secp521r1 [NIST P-521]", "1.3.132.0.35", PD,
            "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF",
            "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC",
            "0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00",
            "00C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66",
            "011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650",
            "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409",
            1);

        SPLIT_PATTERN = null;
    }

}
