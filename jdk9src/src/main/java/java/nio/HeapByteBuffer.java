/*
 * Copyright (c) 2000, 2016, Oracle and/or its affiliates. All rights reserved.
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

// -- This file was mechanically generated: Do not edit! -- //

package java.nio;

import jdk.internal.misc.Unsafe;

/**

 * A read/write HeapByteBuffer.






 */

class HeapByteBuffer
    extends ByteBuffer
{

    // For speed these fields are actually declared in X-Buffer;
    // these declarations are here as documentation
    /*

    protected final byte[] hb;
    protected final int offset;

    */



    // Cached unsafe-access object
    private static final Unsafe unsafe = Bits.unsafe();

    // Cached array base offset
    private static final long arrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);



    HeapByteBuffer(int cap, int lim) {            // package-private

        super(-1, 0, lim, cap, new byte[cap], 0);
        /*
        hb = new byte[cap];
        offset = 0;
        */





        this.address = arrayBaseOffset;

    }

    HeapByteBuffer(byte[] buf, int off, int len) { // package-private

        super(-1, off, off + len, buf.length, buf, 0);
        /*
        hb = buf;
        offset = 0;
        */





        this.address = arrayBaseOffset;

    }

    protected HeapByteBuffer(byte[] buf,
                                   int mark, int pos, int lim, int cap,
                                   int off)
    {

        super(mark, pos, lim, cap, buf, off);
        /*
        hb = buf;
        offset = off;
        */





        this.address = arrayBaseOffset + off;

    }

    public ByteBuffer slice() {
        return new HeapByteBuffer(hb,
                                        -1,
                                        0,
                                        this.remaining(),
                                        this.remaining(),
                                        this.position() + offset);
    }


    ByteBuffer slice(int pos, int lim) {
        assert (pos >= 0);
        assert (pos <= lim);
        int rem = lim - pos;
        return new HeapByteBuffer(hb,
                                        -1,
                                        0,
                                        rem,
                                        rem,
                                        pos + offset);
    }


    public ByteBuffer duplicate() {
        return new HeapByteBuffer(hb,
                                        this.markValue(),
                                        this.position(),
                                        this.limit(),
                                        this.capacity(),
                                        offset);
    }

    public ByteBuffer asReadOnlyBuffer() {

        return new HeapByteBufferR(hb,
                                     this.markValue(),
                                     this.position(),
                                     this.limit(),
                                     this.capacity(),
                                     offset);



    }



    protected int ix(int i) {
        return i + offset;
    }


    private long byteOffset(long i) {
        return address + i;
    }


    public byte get() {
        return hb[ix(nextGetIndex())];
    }

    public byte get(int i) {
        return hb[ix(checkIndex(i))];
    }







    public ByteBuffer get(byte[] dst, int offset, int length) {
        checkBounds(offset, length, dst.length);
        if (length > remaining())
            throw new BufferUnderflowException();
        System.arraycopy(hb, ix(position()), dst, offset, length);
        position(position() + length);
        return this;
    }

    public boolean isDirect() {
        return false;
    }



    public boolean isReadOnly() {
        return false;
    }

    public ByteBuffer put(byte x) {

        hb[ix(nextPutIndex())] = x;
        return this;



    }

    public ByteBuffer put(int i, byte x) {

        hb[ix(checkIndex(i))] = x;
        return this;



    }

    public ByteBuffer put(byte[] src, int offset, int length) {

        checkBounds(offset, length, src.length);
        if (length > remaining())
            throw new BufferOverflowException();
        System.arraycopy(src, offset, hb, ix(position()), length);
        position(position() + length);
        return this;



    }

    public ByteBuffer put(ByteBuffer src) {

        if (src instanceof HeapByteBuffer) {
            if (src == this)
                throw createSameBufferException();
            HeapByteBuffer sb = (HeapByteBuffer)src;
            int n = sb.remaining();
            if (n > remaining())
                throw new BufferOverflowException();
            System.arraycopy(sb.hb, sb.ix(sb.position()),
                             hb, ix(position()), n);
            sb.position(sb.position() + n);
            position(position() + n);
        } else if (src.isDirect()) {
            int n = src.remaining();
            if (n > remaining())
                throw new BufferOverflowException();
            src.get(hb, ix(position()), n);
            position(position() + n);
        } else {
            super.put(src);
        }
        return this;



    }

    public ByteBuffer compact() {

        System.arraycopy(hb, ix(position()), hb, ix(0), remaining());
        position(remaining());
        limit(capacity());
        discardMark();
        return this;



    }





    byte _get(int i) {                          // package-private
        return hb[i];
    }

    void _put(int i, byte b) {                  // package-private

        hb[i] = b;



    }

    // char



    public char getChar() {
        return unsafe.getCharUnaligned(hb, byteOffset(nextGetIndex(2)), bigEndian);
    }

    public char getChar(int i) {
        return unsafe.getCharUnaligned(hb, byteOffset(checkIndex(i, 2)), bigEndian);
    }



    public ByteBuffer putChar(char x) {

        unsafe.putCharUnaligned(hb, byteOffset(nextPutIndex(2)), x, bigEndian);
        return this;



    }

    public ByteBuffer putChar(int i, char x) {

        unsafe.putCharUnaligned(hb, byteOffset(checkIndex(i, 2)), x, bigEndian);
        return this;



    }

    public CharBuffer asCharBuffer() {
        int size = this.remaining() >> 1;
        int off = offset + position();
        return (bigEndian
                ? (CharBuffer)(new ByteBufferAsCharBufferB(this,
                                                               -1,
                                                               0,
                                                               size,
                                                               size,
                                                               off))
                : (CharBuffer)(new ByteBufferAsCharBufferL(this,
                                                               -1,
                                                               0,
                                                               size,
                                                               size,
                                                               off)));
    }


    // short



    public short getShort() {
        return unsafe.getShortUnaligned(hb, byteOffset(nextGetIndex(2)), bigEndian);
    }

    public short getShort(int i) {
        return unsafe.getShortUnaligned(hb, byteOffset(checkIndex(i, 2)), bigEndian);
    }



    public ByteBuffer putShort(short x) {

        unsafe.putShortUnaligned(hb, byteOffset(nextPutIndex(2)), x, bigEndian);
        return this;



    }

    public ByteBuffer putShort(int i, short x) {

        unsafe.putShortUnaligned(hb, byteOffset(checkIndex(i, 2)), x, bigEndian);
        return this;



    }

    public ShortBuffer asShortBuffer() {
        int size = this.remaining() >> 1;
        int off = offset + position();
        return (bigEndian
                ? (ShortBuffer)(new ByteBufferAsShortBufferB(this,
                                                                 -1,
                                                                 0,
                                                                 size,
                                                                 size,
                                                                 off))
                : (ShortBuffer)(new ByteBufferAsShortBufferL(this,
                                                                 -1,
                                                                 0,
                                                                 size,
                                                                 size,
                                                                 off)));
    }


    // int



    public int getInt() {
        return unsafe.getIntUnaligned(hb, byteOffset(nextGetIndex(4)), bigEndian);
    }

    public int getInt(int i) {
        return unsafe.getIntUnaligned(hb, byteOffset(checkIndex(i, 4)), bigEndian);
    }



    public ByteBuffer putInt(int x) {

        unsafe.putIntUnaligned(hb, byteOffset(nextPutIndex(4)), x, bigEndian);
        return this;



    }

    public ByteBuffer putInt(int i, int x) {

        unsafe.putIntUnaligned(hb, byteOffset(checkIndex(i, 4)), x, bigEndian);
        return this;



    }

    public IntBuffer asIntBuffer() {
        int size = this.remaining() >> 2;
        int off = offset + position();
        return (bigEndian
                ? (IntBuffer)(new ByteBufferAsIntBufferB(this,
                                                             -1,
                                                             0,
                                                             size,
                                                             size,
                                                             off))
                : (IntBuffer)(new ByteBufferAsIntBufferL(this,
                                                             -1,
                                                             0,
                                                             size,
                                                             size,
                                                             off)));
    }


    // long



    public long getLong() {
        return unsafe.getLongUnaligned(hb, byteOffset(nextGetIndex(8)), bigEndian);
    }

    public long getLong(int i) {
        return unsafe.getLongUnaligned(hb, byteOffset(checkIndex(i, 8)), bigEndian);
    }



    public ByteBuffer putLong(long x) {

        unsafe.putLongUnaligned(hb, byteOffset(nextPutIndex(8)), x, bigEndian);
        return this;



    }

    public ByteBuffer putLong(int i, long x) {

        unsafe.putLongUnaligned(hb, byteOffset(checkIndex(i, 8)), x, bigEndian);
        return this;



    }

    public LongBuffer asLongBuffer() {
        int size = this.remaining() >> 3;
        int off = offset + position();
        return (bigEndian
                ? (LongBuffer)(new ByteBufferAsLongBufferB(this,
                                                               -1,
                                                               0,
                                                               size,
                                                               size,
                                                               off))
                : (LongBuffer)(new ByteBufferAsLongBufferL(this,
                                                               -1,
                                                               0,
                                                               size,
                                                               size,
                                                               off)));
    }


    // float



    public float getFloat() {
        int x = unsafe.getIntUnaligned(hb, byteOffset(nextGetIndex(4)), bigEndian);
        return Float.intBitsToFloat(x);
    }

    public float getFloat(int i) {
        int x = unsafe.getIntUnaligned(hb, byteOffset(checkIndex(i, 4)), bigEndian);
        return Float.intBitsToFloat(x);
    }



    public ByteBuffer putFloat(float x) {

        int y = Float.floatToRawIntBits(x);
        unsafe.putIntUnaligned(hb, byteOffset(nextPutIndex(4)), y, bigEndian);
        return this;



    }

    public ByteBuffer putFloat(int i, float x) {

        int y = Float.floatToRawIntBits(x);
        unsafe.putIntUnaligned(hb, byteOffset(checkIndex(i, 4)), y, bigEndian);
        return this;



    }

    public FloatBuffer asFloatBuffer() {
        int size = this.remaining() >> 2;
        int off = offset + position();
        return (bigEndian
                ? (FloatBuffer)(new ByteBufferAsFloatBufferB(this,
                                                                 -1,
                                                                 0,
                                                                 size,
                                                                 size,
                                                                 off))
                : (FloatBuffer)(new ByteBufferAsFloatBufferL(this,
                                                                 -1,
                                                                 0,
                                                                 size,
                                                                 size,
                                                                 off)));
    }


    // double



    public double getDouble() {
        long x = unsafe.getLongUnaligned(hb, byteOffset(nextGetIndex(8)), bigEndian);
        return Double.longBitsToDouble(x);
    }

    public double getDouble(int i) {
        long x = unsafe.getLongUnaligned(hb, byteOffset(checkIndex(i, 8)), bigEndian);
        return Double.longBitsToDouble(x);
    }



    public ByteBuffer putDouble(double x) {

        long y = Double.doubleToRawLongBits(x);
        unsafe.putLongUnaligned(hb, byteOffset(nextPutIndex(8)), y, bigEndian);
        return this;



    }

    public ByteBuffer putDouble(int i, double x) {

        long y = Double.doubleToRawLongBits(x);
        unsafe.putLongUnaligned(hb, byteOffset(checkIndex(i, 8)), y, bigEndian);
        return this;



    }

    public DoubleBuffer asDoubleBuffer() {
        int size = this.remaining() >> 3;
        int off = offset + position();
        return (bigEndian
                ? (DoubleBuffer)(new ByteBufferAsDoubleBufferB(this,
                                                                   -1,
                                                                   0,
                                                                   size,
                                                                   size,
                                                                   off))
                : (DoubleBuffer)(new ByteBufferAsDoubleBufferL(this,
                                                                   -1,
                                                                   0,
                                                                   size,
                                                                   size,
                                                                   off)));
    }











































}
