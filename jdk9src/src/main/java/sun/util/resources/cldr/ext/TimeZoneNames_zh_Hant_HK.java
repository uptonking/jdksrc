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

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_zh_Hant_HK extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] New_Caledonia = new String[] {
               "\u65b0\u5580\u91cc\u591a\u5c3c\u4e9e\u6a19\u6e96\u6642\u9593",
               "NCT",
               "\u65b0\u5580\u91cc\u591a\u5c3c\u4e9e\u590f\u4ee4\u6642\u9593",
               "NCST",
               "\u65b0\u5580\u91cc\u591a\u5c3c\u4e9e\u6642\u9593",
               "NCT",
            };
        final String[] Cocos = new String[] {
               "\u53ef\u53ef\u65af\u7fa4\u5cf6\u6642\u9593",
               "CCT",
               "Cocos Islands Summer Time",
               "CCST",
               "Cocos Islands Time",
               "CCT",
            };
        final String[] Solomon = new String[] {
               "\u6240\u7f85\u9580\u7fa4\u5cf6\u6642\u9593",
               "SBT",
               "Solomon Is. Summer Time",
               "SBST",
               "Solomon Is. Time",
               "SBT",
            };
        final String[] Georgia = new String[] {
               "\u683c\u9b6f\u5409\u4e9e\u6a19\u6e96\u6642\u9593",
               "GET",
               "\u683c\u9b6f\u5409\u4e9e\u590f\u4ee4\u6642\u9593",
               "GEST",
               "\u683c\u9b6f\u5409\u4e9e\u6642\u9593",
               "GET",
            };
        final String[] Mauritius = new String[] {
               "\u6bdb\u91cc\u88d8\u65af\u6a19\u6e96\u6642\u9593",
               "MUT",
               "\u6bdb\u91cc\u88d8\u65af\u590f\u4ee4\u6642\u9593",
               "MUST",
               "\u6bdb\u91cc\u88d8\u65af\u6642\u9593",
               "MUT",
            };
        final String[] Pitcairn = new String[] {
               "\u76ae\u7279\u5eb7\u6642\u9593",
               "PST",
               "Pitcairn Daylight Time",
               "PDT",
               "Pitcairn Time",
               "PT",
            };
        final String[] Azerbaijan = new String[] {
               "\u4e9e\u585e\u62dc\u7586\u6a19\u6e96\u6642\u9593",
               "AZT",
               "\u4e9e\u585e\u62dc\u7586\u590f\u4ee4\u6642\u9593",
               "AZST",
               "\u4e9e\u585e\u62dc\u7586\u6642\u9593",
               "AZT",
            };
        final String[] Maldives = new String[] {
               "\u99ac\u723e\u4ee3\u592b\u6642\u9593",
               "MVT",
               "Maldives Summer Time",
               "MVST",
               "Maldives Time",
               "MVT",
            };
        final Object[][] data = new Object[][] {
            { "Indian/Mauritius", Mauritius },
            { "Indian/Cocos", Cocos },
            { "Pacific/Pitcairn", Pitcairn },
            { "Pacific/Noumea", New_Caledonia },
            { "Asia/Tbilisi", Georgia },
            { "Pacific/Guadalcanal", Solomon },
            { "Indian/Maldives", Maldives },
            { "Asia/Baku", Azerbaijan },
        };
        return data;
    }
}
