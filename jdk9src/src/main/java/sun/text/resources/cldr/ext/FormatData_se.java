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

public class FormatData_se extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "o\u0111\u0111ajagem\u00e1nnu",
               "guovvam\u00e1nnu",
               "njuk\u010dam\u00e1nnu",
               "cuo\u014bom\u00e1nnu",
               "miessem\u00e1nnu",
               "geassem\u00e1nnu",
               "suoidnem\u00e1nnu",
               "borgem\u00e1nnu",
               "\u010dak\u010dam\u00e1nnu",
               "golggotm\u00e1nnu",
               "sk\u00e1bmam\u00e1nnu",
               "juovlam\u00e1nnu",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "o\u0111\u0111j",
               "guov",
               "njuk",
               "cuo",
               "mies",
               "geas",
               "suoi",
               "borg",
               "\u010dak\u010d",
               "golg",
               "sk\u00e1b",
               "juov",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "O",
               "G",
               "N",
               "C",
               "M",
               "G",
               "S",
               "B",
               "\u010c",
               "G",
               "S",
               "J",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "sotnabeaivi",
               "vuoss\u00e1rga",
               "ma\u014b\u014beb\u00e1rga",
               "gaskavahkku",
               "duorasdat",
               "bearjadat",
               "l\u00e1vvardat",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "sotn",
               "vuos",
               "ma\u014b",
               "gask",
               "duor",
               "bear",
               "l\u00e1v",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "S",
               "V",
               "M",
               "G",
               "D",
               "B",
               "L",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "i\u0111itbeaivet",
               "eahketbeaivet",
            };
        final String[] metaValue_Eras = new String[] {
               "o.Kr.",
               "m.Kr.",
            };
        final String metaValue_calendarname_gregorian = "gregoria kaleander";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "j\u00e1hki" },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "field.zone", "\u00e1igeav\u00e1dat" },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "narrow.Eras", metaValue_Eras },
            { "Eras", metaValue_Eras },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "roc.DayNames", metaValue_DayNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "long.Eras",
                new String[] {
                    "ovdal Kristtusa",
                    "ma\u014b\u014bel Kristtusa",
                }
            },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "field.weekday", "v\u00e1hkkubeaivi" },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u2212",
                    "\u00d710^",
                    "\u2030",
                    "\u221e",
                    "\u00a4\u00a4\u00a4",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "minuhtta" },
            { "field.era", "\u00e9ra" },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "beaivi r\u00e1idod\u00e1ssi" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "field.month", "m\u00e1nnu" },
            { "field.second", "sekunda" },
            { "roc.MonthNames", metaValue_MonthNames },
            { "field.week", "v\u00e1hkku" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                }
            },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "field.hour", "diibmu" },
            { "calendarname.buddhist", "buddhista kaleander" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
