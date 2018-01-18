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

final class VarHandleShorts {

    static class FieldInstanceReadOnly extends VarHandle {
        final long fieldOffset;
        final Class<?> receiverType;

        FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset) {
            this(receiverType, fieldOffset, FieldInstanceReadOnly.class);
        }

        protected FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset,
                                        Class<? extends FieldInstanceReadOnly> handle) {
            super(VarForm.createFromStatic(handle), receiverType, short.class);
            this.fieldOffset = fieldOffset;
            this.receiverType = receiverType;
        }

        @ForceInline
        static short get(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getShort(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static short getVolatile(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getShortVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static short getOpaque(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getShortOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static short getAcquire(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getShortAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }
    }

    static class FieldInstanceReadWrite extends FieldInstanceReadOnly {

        FieldInstanceReadWrite(Class<?> receiverType, long fieldOffset) {
            super(receiverType, fieldOffset, FieldInstanceReadWrite.class);
        }

        @ForceInline
        static void set(FieldInstanceReadWrite handle, Object holder, short value) {
            UNSAFE.putShort(Objects.requireNonNull(handle.receiverType.cast(holder)),
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldInstanceReadWrite handle, Object holder, short value) {
            UNSAFE.putShortVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldInstanceReadWrite handle, Object holder, short value) {
            UNSAFE.putShortOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldInstanceReadWrite handle, Object holder, short value) {
            UNSAFE.putShortRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
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
            super(VarForm.createFromStatic(handle), null, short.class);
            this.base = base;
            this.fieldOffset = fieldOffset;
        }

        @ForceInline
        static short get(FieldStaticReadOnly handle) {
            return UNSAFE.getShort(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static short getVolatile(FieldStaticReadOnly handle) {
            return UNSAFE.getShortVolatile(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static short getOpaque(FieldStaticReadOnly handle) {
            return UNSAFE.getShortOpaque(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static short getAcquire(FieldStaticReadOnly handle) {
            return UNSAFE.getShortAcquire(handle.base,
                                 handle.fieldOffset);
        }
    }

    static class FieldStaticReadWrite extends FieldStaticReadOnly {

        FieldStaticReadWrite(Object base, long fieldOffset) {
            super(base, fieldOffset, FieldStaticReadWrite.class);
        }

        @ForceInline
        static void set(FieldStaticReadWrite handle, short value) {
            UNSAFE.putShort(handle.base,
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldStaticReadWrite handle, short value) {
            UNSAFE.putShortVolatile(handle.base,
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldStaticReadWrite handle, short value) {
            UNSAFE.putShortOpaque(handle.base,
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldStaticReadWrite handle, short value) {
            UNSAFE.putShortRelease(handle.base,
                                    handle.fieldOffset,
                                    value);
        }
    }


    static final class Array extends VarHandle {
        final int abase;
        final int ashift;

        Array(int abase, int ashift) {
            super(VarForm.createFromStatic(Array.class),
                  short[].class, short.class, int.class);
            this.abase = abase;
            this.ashift = ashift;
        }

        @ForceInline
        static short get(Array handle, Object oarray, int index) {
            short[] array = (short[]) oarray;
            return array[index];
        }

        @ForceInline
        static void set(Array handle, Object oarray, int index, short value) {
            short[] array = (short[]) oarray;
            array[index] = value;
        }

        @ForceInline
        static short getVolatile(Array handle, Object oarray, int index) {
            short[] array = (short[]) oarray;
            return UNSAFE.getShortVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setVolatile(Array handle, Object oarray, int index, short value) {
            short[] array = (short[]) oarray;
            UNSAFE.putShortVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static short getOpaque(Array handle, Object oarray, int index) {
            short[] array = (short[]) oarray;
            return UNSAFE.getShortOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setOpaque(Array handle, Object oarray, int index, short value) {
            short[] array = (short[]) oarray;
            UNSAFE.putShortOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static short getAcquire(Array handle, Object oarray, int index) {
            short[] array = (short[]) oarray;
            return UNSAFE.getShortAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setRelease(Array handle, Object oarray, int index, short value) {
            short[] array = (short[]) oarray;
            UNSAFE.putShortRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }
    }
}
