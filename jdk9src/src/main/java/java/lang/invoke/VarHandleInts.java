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

final class VarHandleInts {

    static class FieldInstanceReadOnly extends VarHandle {
        final long fieldOffset;
        final Class<?> receiverType;

        FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset) {
            this(receiverType, fieldOffset, FieldInstanceReadOnly.class);
        }

        protected FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset,
                                        Class<? extends FieldInstanceReadOnly> handle) {
            super(VarForm.createFromStatic(handle), receiverType, int.class);
            this.fieldOffset = fieldOffset;
            this.receiverType = receiverType;
        }

        @ForceInline
        static int get(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getInt(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static int getVolatile(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getIntVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static int getOpaque(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getIntOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static int getAcquire(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getIntAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }
    }

    static class FieldInstanceReadWrite extends FieldInstanceReadOnly {

        FieldInstanceReadWrite(Class<?> receiverType, long fieldOffset) {
            super(receiverType, fieldOffset, FieldInstanceReadWrite.class);
        }

        @ForceInline
        static void set(FieldInstanceReadWrite handle, Object holder, int value) {
            UNSAFE.putInt(Objects.requireNonNull(handle.receiverType.cast(holder)),
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldInstanceReadWrite handle, Object holder, int value) {
            UNSAFE.putIntVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldInstanceReadWrite handle, Object holder, int value) {
            UNSAFE.putIntOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldInstanceReadWrite handle, Object holder, int value) {
            UNSAFE.putIntRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                    handle.fieldOffset,
                                    value);
        }

        @ForceInline
        static boolean compareAndSet(FieldInstanceReadWrite handle, Object holder, int expected, int value) {
            return UNSAFE.compareAndSwapInt(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static int compareAndExchangeVolatile(FieldInstanceReadWrite handle, Object holder, int expected, int value) {
            return UNSAFE.compareAndExchangeIntVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static int compareAndExchangeAcquire(FieldInstanceReadWrite handle, Object holder, int expected, int value) {
            return UNSAFE.compareAndExchangeIntAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static int compareAndExchangeRelease(FieldInstanceReadWrite handle, Object holder, int expected, int value) {
            return UNSAFE.compareAndExchangeIntRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSet(FieldInstanceReadWrite handle, Object holder, int expected, int value) {
            return UNSAFE.weakCompareAndSwapInt(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(FieldInstanceReadWrite handle, Object holder, int expected, int value) {
            return UNSAFE.weakCompareAndSwapIntAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(FieldInstanceReadWrite handle, Object holder, int expected, int value) {
            return UNSAFE.weakCompareAndSwapIntRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static int getAndSet(FieldInstanceReadWrite handle, Object holder, int value) {
            return UNSAFE.getAndSetInt(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                          handle.fieldOffset,
                                          value);
        }

        @ForceInline
        static int getAndAdd(FieldInstanceReadWrite handle, Object holder, int value) {
            return UNSAFE.getAndAddInt(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                       handle.fieldOffset,
                                       value);
        }

        @ForceInline
        static int addAndGet(FieldInstanceReadWrite handle, Object holder, int value) {
            return UNSAFE.getAndAddInt(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                       handle.fieldOffset,
                                       value) + value;
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
            super(VarForm.createFromStatic(handle), null, int.class);
            this.base = base;
            this.fieldOffset = fieldOffset;
        }

        @ForceInline
        static int get(FieldStaticReadOnly handle) {
            return UNSAFE.getInt(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static int getVolatile(FieldStaticReadOnly handle) {
            return UNSAFE.getIntVolatile(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static int getOpaque(FieldStaticReadOnly handle) {
            return UNSAFE.getIntOpaque(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static int getAcquire(FieldStaticReadOnly handle) {
            return UNSAFE.getIntAcquire(handle.base,
                                 handle.fieldOffset);
        }
    }

    static class FieldStaticReadWrite extends FieldStaticReadOnly {

        FieldStaticReadWrite(Object base, long fieldOffset) {
            super(base, fieldOffset, FieldStaticReadWrite.class);
        }

        @ForceInline
        static void set(FieldStaticReadWrite handle, int value) {
            UNSAFE.putInt(handle.base,
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldStaticReadWrite handle, int value) {
            UNSAFE.putIntVolatile(handle.base,
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldStaticReadWrite handle, int value) {
            UNSAFE.putIntOpaque(handle.base,
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldStaticReadWrite handle, int value) {
            UNSAFE.putIntRelease(handle.base,
                                    handle.fieldOffset,
                                    value);
        }

        @ForceInline
        static boolean compareAndSet(FieldStaticReadWrite handle, int expected, int value) {
            return UNSAFE.compareAndSwapInt(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }


        @ForceInline
        static int compareAndExchangeVolatile(FieldStaticReadWrite handle, int expected, int value) {
            return UNSAFE.compareAndExchangeIntVolatile(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static int compareAndExchangeAcquire(FieldStaticReadWrite handle, int expected, int value) {
            return UNSAFE.compareAndExchangeIntAcquire(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static int compareAndExchangeRelease(FieldStaticReadWrite handle, int expected, int value) {
            return UNSAFE.compareAndExchangeIntRelease(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSet(FieldStaticReadWrite handle, int expected, int value) {
            return UNSAFE.weakCompareAndSwapInt(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(FieldStaticReadWrite handle, int expected, int value) {
            return UNSAFE.weakCompareAndSwapIntAcquire(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(FieldStaticReadWrite handle, int expected, int value) {
            return UNSAFE.weakCompareAndSwapIntRelease(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static int getAndSet(FieldStaticReadWrite handle, int value) {
            return UNSAFE.getAndSetInt(handle.base,
                                          handle.fieldOffset,
                                          value);
        }

        @ForceInline
        static int getAndAdd(FieldStaticReadWrite handle, int value) {
            return UNSAFE.getAndAddInt(handle.base,
                                       handle.fieldOffset,
                                       value);
        }

        @ForceInline
        static int addAndGet(FieldStaticReadWrite handle, int value) {
            return UNSAFE.getAndAddInt(handle.base,
                                       handle.fieldOffset,
                                       value) + value;
        }
    }


    static final class Array extends VarHandle {
        final int abase;
        final int ashift;

        Array(int abase, int ashift) {
            super(VarForm.createFromStatic(Array.class),
                  int[].class, int.class, int.class);
            this.abase = abase;
            this.ashift = ashift;
        }

        @ForceInline
        static int get(Array handle, Object oarray, int index) {
            int[] array = (int[]) oarray;
            return array[index];
        }

        @ForceInline
        static void set(Array handle, Object oarray, int index, int value) {
            int[] array = (int[]) oarray;
            array[index] = value;
        }

        @ForceInline
        static int getVolatile(Array handle, Object oarray, int index) {
            int[] array = (int[]) oarray;
            return UNSAFE.getIntVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setVolatile(Array handle, Object oarray, int index, int value) {
            int[] array = (int[]) oarray;
            UNSAFE.putIntVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static int getOpaque(Array handle, Object oarray, int index) {
            int[] array = (int[]) oarray;
            return UNSAFE.getIntOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setOpaque(Array handle, Object oarray, int index, int value) {
            int[] array = (int[]) oarray;
            UNSAFE.putIntOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static int getAcquire(Array handle, Object oarray, int index) {
            int[] array = (int[]) oarray;
            return UNSAFE.getIntAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setRelease(Array handle, Object oarray, int index, int value) {
            int[] array = (int[]) oarray;
            UNSAFE.putIntRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static boolean compareAndSet(Array handle, Object oarray, int index, int expected, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.compareAndSwapInt(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static int compareAndExchangeVolatile(Array handle, Object oarray, int index, int expected, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.compareAndExchangeIntVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static int compareAndExchangeAcquire(Array handle, Object oarray, int index, int expected, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.compareAndExchangeIntAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static int compareAndExchangeRelease(Array handle, Object oarray, int index, int expected, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.compareAndExchangeIntRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static boolean weakCompareAndSet(Array handle, Object oarray, int index, int expected, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.weakCompareAndSwapInt(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(Array handle, Object oarray, int index, int expected, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.weakCompareAndSwapIntAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(Array handle, Object oarray, int index, int expected, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.weakCompareAndSwapIntRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static int getAndSet(Array handle, Object oarray, int index, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.getAndSetInt(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static int getAndAdd(Array handle, Object oarray, int index, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.getAndAddInt(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static int addAndGet(Array handle, Object oarray, int index, int value) {
            int[] array = (int[]) oarray;
            return UNSAFE.getAndAddInt(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value) + value;
        }
    }
}
