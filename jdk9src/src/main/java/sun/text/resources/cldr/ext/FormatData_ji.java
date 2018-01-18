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

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_ji extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u05d9\u05d0\u05b7\u05e0\u05d5\u05d0\u05b7\u05e8",
               "\u05e4\u05bf\u05e2\u05d1\u05e8\u05d5\u05d0\u05b7\u05e8",
               "\u05de\u05e2\u05e8\u05e5",
               "\u05d0\u05b7\u05e4\u05bc\u05e8\u05d9\u05dc",
               "\u05de\u05d9\u05d9",
               "\u05d9\u05d5\u05e0\u05d9",
               "\u05d9\u05d5\u05dc\u05d9",
               "\u05d0\u05d5\u05d9\u05d2\u05d5\u05e1\u05d8",
               "\u05e1\u05e2\u05e4\u05bc\u05d8\u05e2\u05de\u05d1\u05e2\u05e8",
               "\u05d0\u05e7\u05d8\u05d0\u05d1\u05e2\u05e8",
               "\u05e0\u05d0\u05d5\u05d5\u05e2\u05de\u05d1\u05e2\u05e8",
               "\u05d3\u05e2\u05e6\u05e2\u05de\u05d1\u05e2\u05e8",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "\u05d6\u05d5\u05e0\u05d8\u05d9\u05e7",
               "\u05de\u05d0\u05b8\u05e0\u05d8\u05d9\u05e7",
               "\u05d3\u05d9\u05e0\u05e1\u05d8\u05d9\u05e7",
               "\u05de\u05d9\u05d8\u05d5\u05d5\u05d0\u05da",
               "\u05d3\u05d0\u05e0\u05e2\u05e8\u05e9\u05d8\u05d9\u05e7",
               "\u05e4\u05bf\u05e8\u05f2\u05b7\u05d8\u05d9\u05e7",
               "\u05e9\u05d1\u05ea",
            };
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "roc.DayAbbreviations", metaValue_DayNames },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayNames },
            { "field.zone", "\u05e6\u05f2\u05b7\u05d8\u05d6\u05d0\u05e0\u05e2" },
            { "DayNames", metaValue_DayNames },
            { "field.second", "\u05e1\u05e2\u05e7\u05d5\u05e0\u05d3\u05e2" },
            { "roc.MonthNames", metaValue_MonthNames },
            { "field.week", "\u05d5\u05d5\u05d0\u05da" },
            { "DayAbbreviations", metaValue_DayNames },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "roc.DayNames", metaValue_DayNames },
            { "standalone.DayAbbreviations", metaValue_DayNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "islamic.DayNames", metaValue_DayNames },
            { "DatePatterns",
                new String[] {
                    "EEEE, d\u05d8\u05df MMMM y",
                    "d\u05d8\u05df MMMM y",
                    "d\u05d8\u05df MMM y",
                    "dd/MM/yy",
                }
            },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "buddhist.DayAbbreviations", metaValue_DayNames },
            { "field.weekday", "\u05d8\u05d0\u05b8\u05d2 \u05d0\u05d9\u05df \u05d3\u05e2\u05e8 \u05d5\u05d5\u05d0\u05da" },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "standalone.DayNames", metaValue_DayNames },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "field.hour", "\u05e9\u05e2\u05d4" },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "\u05de\u05d9\u05e0\u05d5\u05d8" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "islamic.DayAbbreviations", metaValue_DayNames },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u05d9\u05d0\u05b7\u05e0",
                    "\u05e4\u05bf\u05e2\u05d1",
                    "\u05de\u05e2\u05e8\u05e5",
                    "\u05d0\u05b7\u05e4\u05bc\u05e8",
                    "\u05de\u05d9\u05d9",
                    "\u05d9\u05d5\u05e0\u05d9",
                    "\u05d9\u05d5\u05dc\u05d9",
                    "\u05d0\u05d5\u05d9\u05d2\u05d5\u05e1\u05d8",
                    "\u05e1\u05e2\u05e4\u05bc",
                    "\u05d0\u05e7\u05d8",
                    "\u05e0\u05d0\u05d5\u05d5",
                    "\u05d3\u05e2\u05e6",
                    "",
                }
            },
        };
        return data;
    }
}
