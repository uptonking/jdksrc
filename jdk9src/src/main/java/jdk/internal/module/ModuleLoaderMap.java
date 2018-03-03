/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
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

package jdk.internal.module;

import java.lang.module.Configuration;
import java.lang.module.ResolvedModule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import jdk.internal.loader.ClassLoaders;


/**
 * The module to class loader map.  The list of boot modules and platform modules
 * are generated at build time.
 */
final class ModuleLoaderMap {
    /*
     * The list of boot modules and platform modules are generated at build time.
     */
    private static final String[] BOOT_MODULES
        = new String[] { "java.base",
            "java.compiler",
            "java.datatransfer",
            "java.desktop",
            "java.httpclient",
            "java.instrument",
            "java.logging",
            "java.management",
            "java.naming",
            "java.prefs",
            "java.rmi",
            "java.scripting",
            "java.security.jgss",
            "java.security.sasl",
            "java.smartcardio",
            "java.sql",
            "java.sql.rowset",
            "java.xml",
            "java.xml.crypto",
            "jdk.charsets",
            "jdk.httpserver",
            "jdk.management",
            "jdk.naming.rmi",
            "jdk.sctp",
            "jdk.security.auth",
            "jdk.security.jgss",
            "jdk.unsupported",
            "jdk.vm.ci" };
    private static final String[] PLATFORM_MODULES
        = new String[] { "java.activation",
            "java.annotations.common",
            "java.compact1",
            "java.compact2",
            "java.compact3",
            "java.corba",
            "java.se",
            "java.se.ee",
            "java.transaction",
            "java.xml.bind",
            "java.xml.ws",
            "jdk.accessibility",
            "jdk.crypto.ec",
            "jdk.crypto.pkcs11",
            "jdk.dynalink",
            "jdk.jsobject",
            "jdk.localedata",
            "jdk.naming.dns",
            "jdk.scripting.nashorn",
            "jdk.xml.dom",
            "jdk.zipfs" };

    /**
     * Returns the function to map modules in the given configuration to the
     * built-in class loaders.
     */
    static Function<String, ClassLoader> mappingFunction(Configuration cf) {

        Set<String> bootModules = new HashSet<>(BOOT_MODULES.length);
        for (String mn : BOOT_MODULES) {
            bootModules.add(mn);
        }

        Set<String> platformModules = new HashSet<>(PLATFORM_MODULES.length);
        for (String mn : PLATFORM_MODULES) {
            platformModules.add(mn);
        }

        ClassLoader platformClassLoader = ClassLoaders.platformClassLoader();
        ClassLoader appClassLoader = ClassLoaders.appClassLoader();

        Map<String, ClassLoader> map = new HashMap<>();

        for (ResolvedModule resolvedModule : cf.modules()) {
            String mn = resolvedModule.name();
            if (!bootModules.contains(mn)) {
                if (platformModules.contains(mn)) {
                    map.put(mn, platformClassLoader);
                } else {
                    map.put(mn, appClassLoader);
                }
            }
        }

        return new Function<String, ClassLoader> () {
            @Override
            public ClassLoader apply(String mn) {
                return map.get(mn);
            }
        };
    }
}
