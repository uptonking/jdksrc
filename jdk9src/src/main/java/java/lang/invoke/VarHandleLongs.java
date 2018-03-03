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

final class VarHandleLongs {

    static class FieldInstanceReadOnly extends VarHandle {
        final long fieldOffset;
        final Class<?> receiverType;

        FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset) {
            this(receiverType, fieldOffset, FieldInstanceReadOnly.class);
        }

        protected FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset,
                                        Class<? extends FieldInstanceReadOnly> handle) {
            super(VarForm.createFromStatic(handle), receiverType, long.class);
            this.fieldOffset = fieldOffset;
            this.receiverType = receiverType;
        }

        @ForceInline
        static long get(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getLong(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static long getVolatile(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getLongVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static long getOpaque(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getLongOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static long getAcquire(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getLongAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }
    }

    static class FieldInstanceReadWrite extends FieldInstanceReadOnly {

        FieldInstanceReadWrite(Class<?> receiverType, long fieldOffset) {
            super(receiverType, fieldOffset, FieldInstanceReadWrite.class);
        }

        @ForceInline
        static void set(FieldInstanceReadWrite handle, Object holder, long value) {
            UNSAFE.putLong(Objects.requireNonNull(handle.receiverType.cast(holder)),
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldInstanceReadWrite handle, Object holder, long value) {
            UNSAFE.putLongVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldInstanceReadWrite handle, Object holder, long value) {
            UNSAFE.putLongOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldInstanceReadWrite handle, Object holder, long value) {
            UNSAFE.putLongRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                    handle.fieldOffset,
                                    value);
        }

        @ForceInline
        static boolean compareAndSet(FieldInstanceReadWrite handle, Object holder, long expected, long value) {
            return UNSAFE.compareAndSwapLong(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static long compareAndExchangeVolatile(FieldInstanceReadWrite handle, Object holder, long expected, long value) {
            return UNSAFE.compareAndExchangeLongVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static long compareAndExchangeAcquire(FieldInstanceReadWrite handle, Object holder, long expected, long value) {
            return UNSAFE.compareAndExchangeLongAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static long compareAndExchangeRelease(FieldInstanceReadWrite handle, Object holder, long expected, long value) {
            return UNSAFE.compareAndExchangeLongRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSet(FieldInstanceReadWrite handle, Object holder, long expected, long value) {
            return UNSAFE.weakCompareAndSwapLong(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(FieldInstanceReadWrite handle, Object holder, long expected, long value) {
            return UNSAFE.weakCompareAndSwapLongAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(FieldInstanceReadWrite handle, Object holder, long expected, long value) {
            return UNSAFE.weakCompareAndSwapLongRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static long getAndSet(FieldInstanceReadWrite handle, Object holder, long value) {
            return UNSAFE.getAndSetLong(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                          handle.fieldOffset,
                                          value);
        }

        @ForceInline
        static long getAndAdd(FieldInstanceReadWrite handle, Object holder, long value) {
            return UNSAFE.getAndAddLong(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                       handle.fieldOffset,
                                       value);
        }

        @ForceInline
        static long addAndGet(FieldInstanceReadWrite handle, Object holder, long value) {
            return UNSAFE.getAndAddLong(Objects.requireNonNull(handle.receiverType.cast(holder)),
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
            super(VarForm.createFromStatic(handle), null, long.class);
            this.base = base;
            this.fieldOffset = fieldOffset;
        }

        @ForceInline
        static long get(FieldStaticReadOnly handle) {
            return UNSAFE.getLong(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static long getVolatile(FieldStaticReadOnly handle) {
            return UNSAFE.getLongVolatile(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static long getOpaque(FieldStaticReadOnly handle) {
            return UNSAFE.getLongOpaque(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static long getAcquire(FieldStaticReadOnly handle) {
            return UNSAFE.getLongAcquire(handle.base,
                                 handle.fieldOffset);
        }
    }

    static class FieldStaticReadWrite extends FieldStaticReadOnly {

        FieldStaticReadWrite(Object base, long fieldOffset) {
            super(base, fieldOffset, FieldStaticReadWrite.class);
        }

        @ForceInline
        static void set(FieldStaticReadWrite handle, long value) {
            UNSAFE.putLong(handle.base,
                             handle.fieldOffset,
                             value);
        }

        @ForceInline
        static void setVolatile(FieldStaticReadWrite handle, long value) {
            UNSAFE.putLongVolatile(handle.base,
                                     handle.fieldOffset,
                                     value);
        }

        @ForceInline
        static void setOpaque(FieldStaticReadWrite handle, long value) {
            UNSAFE.putLongOpaque(handle.base,
                                   handle.fieldOffset,
                                   value);
        }

        @ForceInline
        static void setRelease(FieldStaticReadWrite handle, long value) {
            UNSAFE.putLongRelease(handle.base,
                                    handle.fieldOffset,
                                    value);
        }

        @ForceInline
        static boolean compareAndSet(FieldStaticReadWrite handle, long expected, long value) {
            return UNSAFE.compareAndSwapLong(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }


        @ForceInline
        static long compareAndExchangeVolatile(FieldStaticReadWrite handle, long expected, long value) {
            return UNSAFE.compareAndExchangeLongVolatile(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static long compareAndExchangeAcquire(FieldStaticReadWrite handle, long expected, long value) {
            return UNSAFE.compareAndExchangeLongAcquire(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static long compareAndExchangeRelease(FieldStaticReadWrite handle, long expected, long value) {
            return UNSAFE.compareAndExchangeLongRelease(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSet(FieldStaticReadWrite handle, long expected, long value) {
            return UNSAFE.weakCompareAndSwapLong(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(FieldStaticReadWrite handle, long expected, long value) {
            return UNSAFE.weakCompareAndSwapLongAcquire(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(FieldStaticReadWrite handle, long expected, long value) {
            return UNSAFE.weakCompareAndSwapLongRelease(handle.base,
                                               handle.fieldOffset,
                                               expected,
                                               value);
        }

        @ForceInline
        static long getAndSet(FieldStaticReadWrite handle, long value) {
            return UNSAFE.getAndSetLong(handle.base,
                                          handle.fieldOffset,
                                          value);
        }

        @ForceInline
        static long getAndAdd(FieldStaticReadWrite handle, long value) {
            return UNSAFE.getAndAddLong(handle.base,
                                       handle.fieldOffset,
                                       value);
        }

        @ForceInline
        static long addAndGet(FieldStaticReadWrite handle, long value) {
            return UNSAFE.getAndAddLong(handle.base,
                                       handle.fieldOffset,
                                       value) + value;
        }
    }


    static final class Array extends VarHandle {
        final int abase;
        final int ashift;

        Array(int abase, int ashift) {
            super(VarForm.createFromStatic(Array.class),
                  long[].class, long.class, int.class);
            this.abase = abase;
            this.ashift = ashift;
        }

        @ForceInline
        static long get(Array handle, Object oarray, int index) {
            long[] array = (long[]) oarray;
            return array[index];
        }

        @ForceInline
        static void set(Array handle, Object oarray, int index, long value) {
            long[] array = (long[]) oarray;
            array[index] = value;
        }

        @ForceInline
        static long getVolatile(Array handle, Object oarray, int index) {
            long[] array = (long[]) oarray;
            return UNSAFE.getLongVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setVolatile(Array handle, Object oarray, int index, long value) {
            long[] array = (long[]) oarray;
            UNSAFE.putLongVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static long getOpaque(Array handle, Object oarray, int index) {
            long[] array = (long[]) oarray;
            return UNSAFE.getLongOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setOpaque(Array handle, Object oarray, int index, long value) {
            long[] array = (long[]) oarray;
            UNSAFE.putLongOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static long getAcquire(Array handle, Object oarray, int index) {
            long[] array = (long[]) oarray;
            return UNSAFE.getLongAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setRelease(Array handle, Object oarray, int index, long value) {
            long[] array = (long[]) oarray;
            UNSAFE.putLongRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static boolean compareAndSet(Array handle, Object oarray, int index, long expected, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.compareAndSwapLong(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static long compareAndExchangeVolatile(Array handle, Object oarray, int index, long expected, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.compareAndExchangeLongVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static long compareAndExchangeAcquire(Array handle, Object oarray, int index, long expected, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.compareAndExchangeLongAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static long compareAndExchangeRelease(Array handle, Object oarray, int index, long expected, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.compareAndExchangeLongRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static boolean weakCompareAndSet(Array handle, Object oarray, int index, long expected, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.weakCompareAndSwapLong(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(Array handle, Object oarray, int index, long expected, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.weakCompareAndSwapLongAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(Array handle, Object oarray, int index, long expected, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.weakCompareAndSwapLongRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    expected,
                    value);
        }

        @ForceInline
        static long getAndSet(Array handle, Object oarray, int index, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.getAndSetLong(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static long getAndAdd(Array handle, Object oarray, int index, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.getAndAddLong(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value);
        }

        @ForceInline
        static long addAndGet(Array handle, Object oarray, int index, long value) {
            long[] array = (long[]) oarray;
            return UNSAFE.getAndAddLong(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    value) + value;
        }
    }
}
