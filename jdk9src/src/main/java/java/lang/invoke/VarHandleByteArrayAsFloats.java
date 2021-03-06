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

final class VarHandleByteArrayAsFloats extends VarHandleByteArrayBase {

    static final int ALIGN = Float.BYTES - 1;

    @ForceInline
    static int convEndian(boolean big, float v) {
        int rv = Float.floatToRawIntBits(v);
        return big == BE ? rv : Integer.reverseBytes(rv);
    }

    @ForceInline
    static float convEndian(boolean big, int rv) {
        rv = big == BE ? rv : Integer.reverseBytes(rv);
        return Float.intBitsToFloat(rv);
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
            super(ArrayHandle.class, byte[].class, float.class, be);
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
        static float get(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            int rawValue = UNSAFE.getIntUnaligned(
                    ba,
                    ((long) index(ba, index)) + Unsafe.ARRAY_BYTE_BASE_OFFSET,
                    handle.be);
            return Float.intBitsToFloat(rawValue);
        }

        @ForceInline
        static void set(ArrayHandle handle, Object oba, int index, float value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putIntUnaligned(
                    ba,
                    ((long) index(ba, index)) + Unsafe.ARRAY_BYTE_BASE_OFFSET,
                    Float.floatToRawIntBits(value),
                    handle.be);
        }

        @ForceInline
        static float getVolatile(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getIntVolatile(
                                      ba,
                                      address(ba, index(ba, index))));
        }

        @ForceInline
        static void setVolatile(ArrayHandle handle, Object oba, int index, float value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putIntVolatile(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static float getAcquire(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getIntAcquire(
                                      ba,
                                      address(ba, index(ba, index))));
        }

        @ForceInline
        static void setRelease(ArrayHandle handle, Object oba, int index, float value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putIntRelease(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static float getOpaque(ArrayHandle handle, Object oba, int index) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getIntOpaque(
                                      ba,
                                      address(ba, index(ba, index))));
        }

        @ForceInline
        static void setOpaque(ArrayHandle handle, Object oba, int index, float value) {
            byte[] ba = (byte[]) oba;
            UNSAFE.putIntOpaque(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static boolean compareAndSet(ArrayHandle handle, Object oba, int index, float expected, float value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.compareAndSwapInt(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static float compareAndExchangeVolatile(ArrayHandle handle, Object oba, int index, float expected, float value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeIntVolatile(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static float compareAndExchangeAcquire(ArrayHandle handle, Object oba, int index, float expected, float value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeIntAcquire(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static float compareAndExchangeRelease(ArrayHandle handle, Object oba, int index, float expected, float value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeIntRelease(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static boolean weakCompareAndSet(ArrayHandle handle, Object oba, int index, float expected, float value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.weakCompareAndSwapInt(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(ArrayHandle handle, Object oba, int index, float expected, float value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.weakCompareAndSwapIntAcquire(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(ArrayHandle handle, Object oba, int index, float expected, float value) {
            byte[] ba = (byte[]) oba;
            return UNSAFE.weakCompareAndSwapIntRelease(
                    ba,
                    address(ba, index(ba, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static float getAndSet(ArrayHandle handle, Object oba, int index, float value) {
            byte[] ba = (byte[]) oba;
            return convEndian(handle.be,
                              UNSAFE.getAndSetInt(
                                      ba,
                                      address(ba, index(ba, index)),
                                      convEndian(handle.be, value)));
        }
    }


    static final class ByteBufferHandle extends ByteArrayViewVarHandle {

        ByteBufferHandle(boolean be) {
            super(ByteBufferHandle.class, ByteBuffer.class, float.class, be);
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
        static float get(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            int rawValue = UNSAFE.getIntUnaligned(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    ((long) index(bb, index)) + UNSAFE.getLong(bb, BUFFER_ADDRESS),
                    handle.be);
            return Float.intBitsToFloat(rawValue);
        }

        @ForceInline
        static void set(ByteBufferHandle handle, Object obb, int index, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putIntUnaligned(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    ((long) indexRO(bb, index)) + UNSAFE.getLong(bb, BUFFER_ADDRESS),
                    Float.floatToRawIntBits(value),
                    handle.be);
        }

        @ForceInline
        static float getVolatile(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getIntVolatile(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, index(bb, index))));
        }

        @ForceInline
        static void setVolatile(ByteBufferHandle handle, Object obb, int index, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putIntVolatile(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static float getAcquire(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getIntAcquire(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, index(bb, index))));
        }

        @ForceInline
        static void setRelease(ByteBufferHandle handle, Object obb, int index, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putIntRelease(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static float getOpaque(ByteBufferHandle handle, Object obb, int index) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getIntOpaque(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, index(bb, index))));
        }

        @ForceInline
        static void setOpaque(ByteBufferHandle handle, Object obb, int index, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            UNSAFE.putIntOpaque(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, value));
        }

        @ForceInline
        static boolean compareAndSet(ByteBufferHandle handle, Object obb, int index, float expected, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.compareAndSwapInt(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static float compareAndExchangeVolatile(ByteBufferHandle handle, Object obb, int index, float expected, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeIntVolatile(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static float compareAndExchangeAcquire(ByteBufferHandle handle, Object obb, int index, float expected, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeIntAcquire(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static float compareAndExchangeRelease(ByteBufferHandle handle, Object obb, int index, float expected, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.compareAndExchangeIntRelease(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, expected), convEndian(handle.be, value)));
        }

        @ForceInline
        static boolean weakCompareAndSet(ByteBufferHandle handle, Object obb, int index, float expected, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.weakCompareAndSwapInt(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetAcquire(ByteBufferHandle handle, Object obb, int index, float expected, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.weakCompareAndSwapIntAcquire(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static boolean weakCompareAndSetRelease(ByteBufferHandle handle, Object obb, int index, float expected, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return UNSAFE.weakCompareAndSwapIntRelease(
                    UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                    address(bb, indexRO(bb, index)),
                    convEndian(handle.be, expected), convEndian(handle.be, value));
        }

        @ForceInline
        static float getAndSet(ByteBufferHandle handle, Object obb, int index, float value) {
            ByteBuffer bb = (ByteBuffer) obb;
            return convEndian(handle.be,
                              UNSAFE.getAndSetInt(
                                      UNSAFE.getObject(bb, BYTE_BUFFER_HB),
                                      address(bb, indexRO(bb, index)),
                                      convEndian(handle.be, value)));
        }
    }
}
