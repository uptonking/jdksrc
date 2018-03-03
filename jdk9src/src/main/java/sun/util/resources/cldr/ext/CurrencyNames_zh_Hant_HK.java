/*
 * Copyright (c) 2012, 2016, Oracle and/or its affiliates. All rights reserved.
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

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2015 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.util.resources.cldr.ext;

import sun.util.resources.OpenListResourceBundle;

public class CurrencyNames_zh_Hant_HK extends OpenListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "KRW", "\u20a9" },
            { "USD", "US$" },
            { "aed", "\u963f\u62c9\u4f2f\u806f\u5408\u914b\u9577\u570b\u8fea\u723e\u6c57" },
            { "awg", "\u963f\u9b6f\u5df4\u76fe" },
            { "azn", "\u4e9e\u585e\u62dc\u7586\u99ac\u7d0d\u7279" },
            { "bad", "\u6ce2\u65af\u5c3c\u4e9e-\u8d6b\u585e\u54e5\u7dad\u7d0d\u7b2c\u7d0d\u723e" },
            { "bam", "\u6ce2\u65af\u5c3c\u4e9e-\u8d6b\u585e\u54e5\u7dad\u7d0d\u53ef\u8f49\u63db\u99ac\u514b" },
            { "crc", "\u54e5\u65af\u9054\u9ece\u52a0\u79d1\u90ce" },
            { "etb", "\u57c3\u585e\u4fc4\u6bd4\u4e9e\u6bd4\u723e" },
            { "gel", "\u683c\u9b6f\u5409\u4e9e\u62c9\u91cc" },
            { "hkd", "\u6e2f\u5143" },
            { "itl", "\u610f\u5927\u5229\u91cc\u62c9" },
            { "lrd", "\u5229\u6bd4\u5229\u4e9e\u5143" },
            { "mur", "\u6bdb\u91cc\u88d8\u65af\u76e7\u5e03" },
            { "mzn", "\u83ab\u6851\u6bd4\u514b\u6885\u8482\u5361\u723e" },
            { "ngn", "\u5c3c\u65e5\u5229\u4e9e\u5948\u62c9" },
            { "rwf", "\u76e7\u65fa\u9054\u6cd5\u90ce" },
            { "sar", "\u6c99\u7279\u963f\u62c9\u4f2f\u91cc\u4e9e\u723e" },
            { "xaf", "\u4e2d\u975e\u6cd5\u90ce" },
            { "xof", "\u591a\u54e5\u975e\u6d32\u5171\u540c\u9ad4\u6cd5\u90ce" },
            { "xpf", "\u592a\u5e73\u6d0b\u6cd5\u90ce" },
        };
        return data;
    }
}
