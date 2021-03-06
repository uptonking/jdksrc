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

import jdk.internal.misc.Unsafe;
import jdk.internal.vm.annotation.ForceInline;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Objects;

import static java.lang.invoke.MethodHandleStatics.UNSAFE;

// -- This file was mechanically generated: Do not edit! -- //

final class VarHandleByteArrayAsDoubles extends VarHandleByteArrayBase {

    static final int ALIGN = Double.BYTES - 1;

    @ForceInline
    static long convEndian(boolean big, double v) {
        long rv = Double.doubleToRawLongBits(v);
        return big == BE ? rv : Long.reverseBytes(rv);
    }

    @ForceInline
    static double convEndian(boolean big, long rv) {
        rv = big == BE ? rv : Long.reverseBytes(rv);
        return Double.longBitsToDouble(rv);
    }


    private static class ByteArrayViewVarHandle extends VarHandle {
        final boolean be;

        ByteArrayViewVarHandle(Class<? extends ByteArrayViewVarHandle> implSubType,
                               Class<?> arrayType, Class<?> component, boolean be) {
            super(VarForm.createFromStatic(implSubType),
                  arrayType, component, int.class);
            this.be = be;
        }
    }

    static final class ArrayHandle extends ByteArrayViewVarHandle {

        ArrayHandle(boolean be) {
            super(ArrayHandle.class, byte[].class, double.class, be);
        }

        @ForceInline
        static int index(byte[] ba, int index) {
            return Objects.checkIndex(index, ba.length - ALIGN, null);
        }

        @ForceInline
        static long address(byte[] ba, int index) {
            long address = ((long) index) + Unsafe.ARRAY_BYTE_BASE_OFFSET;
            if ((address & ALIGN) != 0)
                throw newIllegalStateExceptionForMisalignedAccess(index);
            return address;
        }

        @ForceInline
        static double get(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            long rawValue = UNSAFE.getLongUnaligned(
                    ba,
                    ((long) index(ba, index)) + Unsafe.ARRAY_BYTE_BASE_OFFSET,
                    handle.be);
            return Double.longBitsToDouble(rawValue);
        }

        @ForceInline
        static void set(ArrayHandle handle, Object oba, int index, double value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putLongUnaligned(
                    ba,
                    ((long) index(ba, index)) + Unsafe.ARRAY_BYTE_BASE_OFFSET,
                    Double.doubleToRawLongBits(value),
                    handle.be);
        }

        @ForceInline
        static double getVolatile(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getLongVolatile(
                                      ba,
                                      address(ba, index(ba, index))));
        }

        @ForceInline
        static void setVolatile(ArrayHandle handle, Object oba, int index, double value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putLongVolatile(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static double getAcquire(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getLongAcquire(
                                      ba,
                                      address(ba, index(ba, index))));
        }

        @ForceInline
        static void setRelease(ArrayHandle handle, Object oba, int index, double value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putLongRelease(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static double getOpaque(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getLongOpaque(
                                      ba,
                                      address(ba, index(ba, index))));
        }

        @ForceInline
        static void setOpaque(ArrayHandle handle, Object oba, int index, double value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putLongOpaque(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static boolean compareAndSet(ArrayHandle handle, Object oba, int index, double expected, double value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.compareAndSwapLong(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static double compareAndExchangeVolatile(ArrayHandle handle, Object oba, int index, double expected, double value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeLongVolatile(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static double compareAndExchangeAcquire(ArrayHandle handle, Object oba, int index, double expected, double value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeLongAcquire(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static double compareAndExchangeRelease(ArrayHandle handle, Object oba, int index, double expected, double value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeLongRelease(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static boolean weakCompareAndSet(ArrayHandle handle, Object oba, int index, double expected, double value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.weakCompareAndSwapLong(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(ArrayHandle handle, Object oba, int index, double expected, double value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.weakCompareAndSwapLongAcquire(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(ArrayHandle handle, Object oba, int index, double expected, double value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.weakCompareAndSwapLongRelease(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static double getAndSet(ArrayHandle handle, Object oba, int index, double value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getAndSetLong(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, value)));
        }
    }


    static final class ByteBufferHandle extends ByteArrayViewVarHandle {

        ByteBufferHandle(boolean be) {
            super(ByteBufferHandle.class, ByteBuffer.class, double.class, be);
        }

        @ForceInline
        static int index(ByteBuffer bb, int index) {
            return Objects.checkIndex(index, UNSAFE.getInt(bb, BUFFER_LIMIT) - ALIGN, null);
        }

        @ForceInline
        static int indexRO(ByteBuffer bb, int index) {
            if (UNSAFE.getBoolean(bb, BYTE_BUFFER_IS_READ_ONLY))
                throw new ReadOnlyBufferException();
            return Objects.checkIndex(index, UNSAFE.getInt(bb, BUFFER_LIMIT) - ALIGN, null);
        }

        @ForceInline
        static long address(ByteBuffer bb, int index) {
            long address = ((long) index) + UNSAFE.getLong(bb, BUFFER_ADDRESS);
            if ((address & ALIGN) != 0)
                throw newIllegalStateExceptionForMisalignedAccess(index);
            return address;
        }

        @ForceInline
        static double get(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            long rawValue = UNSAFE.getLongUnaligned(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    ((long) index(bb, index)) + UNSAFE.getLong(bb, BUFFER_ADDRESS),
                    handle.be);
            return Double.longBitsToDouble(rawValue);
        }

        @ForceInline
        static void set(ByteBufferHandle handle, Object obb, int index, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putLongUnaligned(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    ((long) indexRO(bb, index)) + UNSAFE.getLong(bb, BUFFER_ADDRESS),
                    Double.doubleToRawLongBits(value),
                    handle.be);
        }

        @ForceInline
        static double getVolatile(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getLongVolatile(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, index(bb, index))));
        }

        @ForceInline
        static void setVolatile(ByteBufferHandle handle, Object obb, int index, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putLongVolatile(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static double getAcquire(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getLongAcquire(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, index(bb, index))));
        }

        @ForceInline
        static void setRelease(ByteBufferHandle handle, Object obb, int index, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putLongRelease(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static double getOpaque(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getLongOpaque(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, index(bb, index))));
        }

        @ForceInline
        static void setOpaque(ByteBufferHandle handle, Object obb, int index, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putLongOpaque(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static boolean compareAndSet(ByteBufferHandle handle, Object obb, int index, double expected, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.compareAndSwapLong(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static double compareAndExchangeVolatile(ByteBufferHandle handle, Object obb, int index, double expected, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeLongVolatile(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static double compareAndExchangeAcquire(ByteBufferHandle handle, Object obb, int index, double expected, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeLongAcquire(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static double compareAndExchangeRelease(ByteBufferHandle handle, Object obb, int index, double expected, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeLongRelease(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static boolean weakCompareAndSet(ByteBufferHandle handle, Object obb, int index, double expected, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.weakCompareAndSwapLong(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(ByteBufferHandle handle, Object obb, int index, double expected, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.weakCompareAndSwapLongAcquire(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(ByteBufferHandle handle, Object obb, int index, double expected, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.weakCompareAndSwapLongRelease(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static double getAndSet(ByteBufferHandle handle, Object obb, int index, double value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getAndSetLong(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, value)));
        }
    }
}
