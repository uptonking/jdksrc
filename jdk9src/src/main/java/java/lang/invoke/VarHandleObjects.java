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

final class VarHandleObjects {

    static class FieldInstanceReadOnly extends VarHandle {
        final long fieldOffset;
        final Class<?> receiverType;
        final Class<?> fieldType;

        FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset, Class<?> fieldType) {
            this(receiverType, fieldOffset, fieldType, FieldInstanceReadOnly.class);
        }

        protected FieldInstanceReadOnly(Class<?> receiverType, long fieldOffset, Class<?> fieldType,
                                        Class<? extends FieldInstanceReadOnly> handle) {
            super(VarForm.createFromStatic(handle), receiverType, fieldType);
            this.fieldOffset = fieldOffset;
            this.receiverType = receiverType;
            this.fieldType = fieldType;
        }

        @ForceInline
        static Object get(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getObject(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static Object getVolatile(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getObjectVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static Object getOpaque(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getObjectOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }

        @ForceInline
        static Object getAcquire(FieldInstanceReadOnly handle, Object holder) {
            return UNSAFE.getObjectAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                 handle.fieldOffset);
        }
    }

    static class FieldInstanceReadWrite extends FieldInstanceReadOnly {

        FieldInstanceReadWrite(Class<?> receiverType, long fieldOffset, Class<?> fieldType) {
            super(receiverType, fieldOffset, fieldType, FieldInstanceReadWrite.class);
        }

        @ForceInline
        static void set(FieldInstanceReadWrite handle, Object holder, Object value) {
            UNSAFE.putObject(Objects.requireNonNull(handle.receiverType.cast(holder)),
                             handle.fieldOffset,
                             handle.fieldType.cast(value));
        }

        @ForceInline
        static void setVolatile(FieldInstanceReadWrite handle, Object holder, Object value) {
            UNSAFE.putObjectVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                     handle.fieldOffset,
                                     handle.fieldType.cast(value));
        }

        @ForceInline
        static void setOpaque(FieldInstanceReadWrite handle, Object holder, Object value) {
            UNSAFE.putObjectOpaque(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                   handle.fieldOffset,
                                   handle.fieldType.cast(value));
        }

        @ForceInline
        static void setRelease(FieldInstanceReadWrite handle, Object holder, Object value) {
            UNSAFE.putObjectRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                    handle.fieldOffset,
                                    handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean compareAndSet(FieldInstanceReadWrite handle, Object holder, Object expected, Object value) {
            return UNSAFE.compareAndSwapObject(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeVolatile(FieldInstanceReadWrite handle, Object holder, Object expected, Object value) {
            return UNSAFE.compareAndExchangeObjectVolatile(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeAcquire(FieldInstanceReadWrite handle, Object holder, Object expected, Object value) {
            return UNSAFE.compareAndExchangeObjectAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeRelease(FieldInstanceReadWrite handle, Object holder, Object expected, Object value) {
            return UNSAFE.compareAndExchangeObjectRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSet(FieldInstanceReadWrite handle, Object holder, Object expected, Object value) {
            return UNSAFE.weakCompareAndSwapObject(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(FieldInstanceReadWrite handle, Object holder, Object expected, Object value) {
            return UNSAFE.weakCompareAndSwapObjectAcquire(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(FieldInstanceReadWrite handle, Object holder, Object expected, Object value) {
            return UNSAFE.weakCompareAndSwapObjectRelease(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static Object getAndSet(FieldInstanceReadWrite handle, Object holder, Object value) {
            return UNSAFE.getAndSetObject(Objects.requireNonNull(handle.receiverType.cast(holder)),
                                          handle.fieldOffset,
                                          handle.fieldType.cast(value));
        }
    }


    static class FieldStaticReadOnly extends VarHandle {
        final Object base;
        final long fieldOffset;
        final Class<?> fieldType;

        FieldStaticReadOnly(Object base, long fieldOffset, Class<?> fieldType) {
            this(base, fieldOffset, fieldType, FieldStaticReadOnly.class);
        }

        protected FieldStaticReadOnly(Object base, long fieldOffset, Class<?> fieldType,
                                      Class<? extends FieldStaticReadOnly> handle) {
            super(VarForm.createFromStatic(handle), null, fieldType);
            this.base = base;
            this.fieldOffset = fieldOffset;
            this.fieldType = fieldType;
        }

        @ForceInline
        static Object get(FieldStaticReadOnly handle) {
            return UNSAFE.getObject(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static Object getVolatile(FieldStaticReadOnly handle) {
            return UNSAFE.getObjectVolatile(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static Object getOpaque(FieldStaticReadOnly handle) {
            return UNSAFE.getObjectOpaque(handle.base,
                                 handle.fieldOffset);
        }

        @ForceInline
        static Object getAcquire(FieldStaticReadOnly handle) {
            return UNSAFE.getObjectAcquire(handle.base,
                                 handle.fieldOffset);
        }
    }

    static class FieldStaticReadWrite extends FieldStaticReadOnly {

        FieldStaticReadWrite(Object base, long fieldOffset, Class<?> fieldType) {
            super(base, fieldOffset, fieldType, FieldStaticReadWrite.class);
        }

        @ForceInline
        static void set(FieldStaticReadWrite handle, Object value) {
            UNSAFE.putObject(handle.base,
                             handle.fieldOffset,
                             handle.fieldType.cast(value));
        }

        @ForceInline
        static void setVolatile(FieldStaticReadWrite handle, Object value) {
            UNSAFE.putObjectVolatile(handle.base,
                                     handle.fieldOffset,
                                     handle.fieldType.cast(value));
        }

        @ForceInline
        static void setOpaque(FieldStaticReadWrite handle, Object value) {
            UNSAFE.putObjectOpaque(handle.base,
                                   handle.fieldOffset,
                                   handle.fieldType.cast(value));
        }

        @ForceInline
        static void setRelease(FieldStaticReadWrite handle, Object value) {
            UNSAFE.putObjectRelease(handle.base,
                                    handle.fieldOffset,
                                    handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean compareAndSet(FieldStaticReadWrite handle, Object expected, Object value) {
            return UNSAFE.compareAndSwapObject(handle.base,
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }


        @ForceInline
        static Object compareAndExchangeVolatile(FieldStaticReadWrite handle, Object expected, Object value) {
            return UNSAFE.compareAndExchangeObjectVolatile(handle.base,
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeAcquire(FieldStaticReadWrite handle, Object expected, Object value) {
            return UNSAFE.compareAndExchangeObjectAcquire(handle.base,
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeRelease(FieldStaticReadWrite handle, Object expected, Object value) {
            return UNSAFE.compareAndExchangeObjectRelease(handle.base,
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSet(FieldStaticReadWrite handle, Object expected, Object value) {
            return UNSAFE.weakCompareAndSwapObject(handle.base,
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(FieldStaticReadWrite handle, Object expected, Object value) {
            return UNSAFE.weakCompareAndSwapObjectAcquire(handle.base,
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(FieldStaticReadWrite handle, Object expected, Object value) {
            return UNSAFE.weakCompareAndSwapObjectRelease(handle.base,
                                               handle.fieldOffset,
                                               handle.fieldType.cast(expected),
                                               handle.fieldType.cast(value));
        }

        @ForceInline
        static Object getAndSet(FieldStaticReadWrite handle, Object value) {
            return UNSAFE.getAndSetObject(handle.base,
                                          handle.fieldOffset,
                                          handle.fieldType.cast(value));
        }
    }


    static final class Array extends VarHandle {
        final int abase;
        final int ashift;
        final Class<?> arrayType;
        final Class<?> componentType;

        Array(int abase, int ashift, Class<?> arrayType) {
            super(VarForm.createFromStatic(Array.class),
                  arrayType, arrayType.getComponentType(), int.class);
            this.abase = abase;
            this.ashift = ashift;
            this.arrayType = arrayType;
            this.componentType = arrayType.getComponentType();
        }

        @ForceInline
        static Object get(Array handle, Object oarray, int index) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return array[index];
        }

        @ForceInline
        static void set(Array handle, Object oarray, int index, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            array[index] = handle.componentType.cast(value);
        }

        @ForceInline
        static Object getVolatile(Array handle, Object oarray, int index) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.getObjectVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setVolatile(Array handle, Object oarray, int index, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            UNSAFE.putObjectVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(value));
        }

        @ForceInline
        static Object getOpaque(Array handle, Object oarray, int index) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.getObjectOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setOpaque(Array handle, Object oarray, int index, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            UNSAFE.putObjectOpaque(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(value));
        }

        @ForceInline
        static Object getAcquire(Array handle, Object oarray, int index) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.getObjectAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase);
        }

        @ForceInline
        static void setRelease(Array handle, Object oarray, int index, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            UNSAFE.putObjectRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(value));
        }

        @ForceInline
        static boolean compareAndSet(Array handle, Object oarray, int index, Object expected, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.compareAndSwapObject(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(expected),
                    handle.componentType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeVolatile(Array handle, Object oarray, int index, Object expected, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.compareAndExchangeObjectVolatile(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(expected),
                    handle.componentType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeAcquire(Array handle, Object oarray, int index, Object expected, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.compareAndExchangeObjectAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(expected),
                    handle.componentType.cast(value));
        }

        @ForceInline
        static Object compareAndExchangeRelease(Array handle, Object oarray, int index, Object expected, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.compareAndExchangeObjectRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(expected),
                    handle.componentType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSet(Array handle, Object oarray, int index, Object expected, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.weakCompareAndSwapObject(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(expected),
                    handle.componentType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(Array handle, Object oarray, int index, Object expected, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.weakCompareAndSwapObjectAcquire(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(expected),
                    handle.componentType.cast(value));
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(Array handle, Object oarray, int index, Object expected, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.weakCompareAndSwapObjectRelease(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(expected),
                    handle.componentType.cast(value));
        }

        @ForceInline
        static Object getAndSet(Array handle, Object oarray, int index, Object value) {
            Object[] array = (Object[]) handle.arrayType.cast(oarray);
            return UNSAFE.getAndSetObject(array,
                    (((long) Objects.checkIndex(index, array.length, AIOOBE_SUPPLIER)) << handle.ashift) + handle.abase,
                    handle.componentType.cast(value));
        }
    }
}
