/*
 * Copyright (c) 2015, 2016, Oracle and/or its affiliates. All rights reserved.
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
package java.lang.invoke;

import java.util.Objects;
import jdk.internal.vm.annotation.ForceInline;

import static java.lang.invoke.MethodHandleStatics.UNSAFE;

// -- This file was mechanically generated: Do not edit! -- //

final class VarHandleBooleans {

    static class FieldInstanceReadOnly extends VarHandle {
        final long fieldOffset;
        final Class<?> receiverType;

        FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset) {
            this(receiverType, fieldOffset, FieldInstanceReadOnly.class);
        }

        protected FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset,
                                        Class<? extends FieldInstanceReadOnly> handle) {
            super(VarForm.createFromStatic(handle), receiverType, boolean.class);
            this.fieldOffset = fieldOffset;
            this.receiverType = receiverType;
        }

        @ForceInline
        static boolean get(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getBoolean(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static boolean getVolatile(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getBooleanVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static boolean getOpaque(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getBooleanOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static boolean getAcquire(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getBooleanAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }
    }

    static class FieldInstanceReadWrite extends FieldInstanceReadOnly {

        FieldInstanceReadWrite(Class<?> receiverType, long fieldOffset) {
            super(receiverType, fieldOffset, FieldInstanceReadWrite.class);
        }

        @ForceInline
        static void set(FieldInstanceReadWrite handle, Object holder, boolean value) {
            UNSAFE.putBoolean(Objects.requireNonNull(handle.receiverType.cast(holder)),
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldInstanceReadWrite handle, Object holder, boolean value) {
            UNSAFE.putBooleanVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldInstanceReadWrite handle, Object holder, boolean value) {
            UNSAFE.putBooleanOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldInstanceReadWrite handle, Object holder, boolean value) {
            UNSAFE.putBooleanRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                    handle.fieldOffset,
                                    value);
        }
    }


    static class FieldStaticReadOnly extends VarHandle {
        final Object base;
        final long fieldOffset;

        FieldStaticReadOnly(Object base, long fieldOffset) {
            this(base, fieldOffset, FieldStaticReadOnly.class);
        }

        protected FieldStaticReadOnly(Object base, long fieldOffset,
                                      Class<? extends FieldStaticReadOnly> handle) {
            super(VarForm.createFromStatic(handle), null, boolean.class);
            this.base = base;
            this.fieldOffset = fieldOffset;
        }

        @ForceInline
        static boolean get(FieldStaticReadOnly handle) {
            return UNSAFE.getBoolean(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static boolean getVolatile(FieldStaticReadOnly handle) {
            return UNSAFE.getBooleanVolatile(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static boolean getOpaque(FieldStaticReadOnly handle) {
            return UNSAFE.getBooleanOpaque(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static boolean getAcquire(FieldStaticReadOnly handle) {
            return UNSAFE.getBooleanAcquire(handle.base,
                                 handle.fieldOffset);
        }
    }

    static class FieldStaticReadWrite extends FieldStaticReadOnly {

        FieldStaticReadWrite(Object base, long fieldOffset) {
            super(base, fieldOffset, FieldStaticReadWrite.class);
        }

        @ForceInline
        static void set(FieldStaticReadWrite handle, boolean value) {
            UNSAFE.putBoolean(handle.base,
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldStaticReadWrite handle, boolean value) {
            UNSAFE.putBooleanVolatile(handle.base,
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldStaticReadWrite handle, boolean value) {
            UNSAFE.putBooleanOpaque(handle.base,
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldStaticReadWrite handle, boolean value) {
            UNSAFE.putBooleanRelease(handle.base,
                                    handle.fieldOffset,
                                    value);
        }
    }


    static final class Array extends VarHandle {
        final int abase;
        final int ashift;

        Array(int abase, int ashift) {
            super(VarForm.createFromStatic(Array.class),
                  boolean[].class, boolean.class, int.class);
            this.abase = abase;
            this.ashift = ashift;
        }

        @ForceInline
        static boolean get(Array handle, Object oarray, int index) {
            boolean[] array = (boolean[]) oarray;
            return array[index];
        }

        @ForceInline
        static void set(Array handle, Object oarray, int index, boolean value) {
            boolean[] array = (boolean[]) oarray;
            array[index] = value;
        }

        @ForceInline
        static boolean getVolatile(Array handle, Object oarray, int index) {
            boolean[] array = (boolean[]) oarray;
            return UNSAFE.getBooleanVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setVolatile(Array handle, Object oarray, int index, boolean value) {
            boolean[] array = (boolean[]) oarray;
            UNSAFE.putBooleanVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static boolean getOpaque(Array handle, Object oarray, int index) {
            boolean[] array = (boolean[]) oarray;
            return UNSAFE.getBooleanOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setOpaque(Array handle, Object oarray, int index, boolean value) {
            boolean[] array = (boolean[]) oarray;
            UNSAFE.putBooleanOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static boolean getAcquire(Array handle, Object oarray, int index) {
            boolean[] array = (boolean[]) oarray;
            return UNSAFE.getBooleanAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setRelease(Array handle, Object oarray, int index, boolean value) {
            boolean[] array = (boolean[]) oarray;
            UNSAFE.putBooleanRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }
    }
}
