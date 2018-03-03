/*
 * Copyright (c) 1999, 2016, Oracle and/or its affiliates. All rights reserved.
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

package java.lang;

import java.io.PrintStream;

class VersionProps {


    private static final String launcher_name =
        "openjdk";

    private static final String java_version =
        "9-internal";

    private static final String java_runtime_name =
        "OpenJDK Runtime Environment";

    private static final String java_runtime_version =
        "9-internal+0-2016-04-14-195246.buildd.src";

    static {
        init();
    }

    public static void init() {
        System.setProperty("java.version", java_version);
        System.setProperty("java.runtime.version", java_runtime_version);
        System.setProperty("java.runtime.name", java_runtime_name);
    }

    /**
     * In case you were wondering this method is called by java -version.
     * Sad that it prints to stderr; would be nicer if default printed on
     * stdout.
     */
    public static void print() {
        print(System.err);
    }

    /**
     * This is the same as print except that it adds an extra line-feed
     * at the end, typically used by the -showversion in the launcher
     */
    public static void println() {
        print(System.err);
        System.err.println();
    }

    /**
     * Give a stream, it will print version info on it.
     */
    public static void print(PrintStream ps) {
        boolean isHeadless = false;

        /* Report that we're running headless if the property is true */
        String headless = System.getProperty("java.awt.headless");
        if ( (headless != null) && (headless.equalsIgnoreCase("true")) ) {
            isHeadless = true;
        }

        /* First line: platform version. */
        ps.println(launcher_name + " version \"" + java_version + "\"");

        /* Second line: runtime version (ie, libraries). */

        String jdk_debug_level = System.getProperty("jdk.debug", "release");
        /* Debug level is not printed for "release" builds */
        if ("release".equals(jdk_debug_level)) {
            jdk_debug_level = "";
        } else {
            jdk_debug_level = jdk_debug_level + " ";
        }

        ps.print(java_runtime_name + " (" + jdk_debug_level + "build " + java_runtime_version);

        if (java_runtime_name.indexOf("Embedded") != -1 && isHeadless) {
            // embedded builds report headless state
            ps.print(", headless");
        }
        ps.println(')');

        /* Third line: JVM information. */
        String java_vm_name    = System.getProperty("java.vm.name");
        String java_vm_version = System.getProperty("java.vm.version");
        String java_vm_info    = System.getProperty("java.vm.info");
        ps.println(java_vm_name + " (" + jdk_debug_level + "build " + java_vm_version + ", " +
                   java_vm_info + ")");
    }

}