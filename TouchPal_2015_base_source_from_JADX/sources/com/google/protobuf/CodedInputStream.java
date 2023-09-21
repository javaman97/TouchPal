package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class CodedInputStream {
    private static final int BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private int sizeLimit;
    private int totalBytesRetired;

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        CodedInputStream codedInputStream = new CodedInputStream(bArr, i, i2);
        try {
            codedInputStream.pushLimit(i2);
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = readRawVarint32();
        if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public boolean skipField(int i) throws IOException {
        switch (WireFormat.getTagWireType(i)) {
            case 0:
                readInt32();
                return true;
            case 1:
                readRawLittleEndian64();
                return true;
            case 2:
                skipRawBytes(readRawVarint32());
                return true;
            case 3:
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                readRawLittleEndian32();
                return true;
            default:
                throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void skipMessage() throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.readTag()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.skipField(r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.skipMessage():void");
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public boolean readBool() throws IOException {
        return readRawVarint32() != 0;
    }

    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > this.bufferSize - this.bufferPos || readRawVarint32 <= 0) {
            return new String(readRawBytes(readRawVarint32), Utils.UTF8);
        }
        String str = new String(this.buffer, this.bufferPos, readRawVarint32, Utils.UTF8);
        this.bufferPos = readRawVarint32 + this.bufferPos;
        return str;
    }

    public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    @Deprecated
    public void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
        readGroup(i, builder, (ExtensionRegistryLite) null);
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    public ByteString readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (readRawVarint32 > this.bufferSize - this.bufferPos || readRawVarint32 <= 0) {
            return ByteString.copyFrom(readRawBytes(readRawVarint32));
        }
        ByteString copyFrom = ByteString.copyFrom(this.buffer, this.bufferPos, readRawVarint32);
        this.bufferPos = readRawVarint32 + this.bufferPos;
        return copyFrom;
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public int readRawVarint32() throws IOException {
        byte readRawByte = readRawByte();
        if (readRawByte >= 0) {
            return readRawByte;
        }
        byte b = readRawByte & Byte.MAX_VALUE;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= 0) {
            return b | (readRawByte2 << 7);
        }
        byte b2 = b | ((readRawByte2 & Byte.MAX_VALUE) << 7);
        byte readRawByte3 = readRawByte();
        if (readRawByte3 >= 0) {
            return b2 | (readRawByte3 << 14);
        }
        byte b3 = b2 | ((readRawByte3 & Byte.MAX_VALUE) << 14);
        byte readRawByte4 = readRawByte();
        if (readRawByte4 >= 0) {
            return b3 | (readRawByte4 << 21);
        }
        byte b4 = b3 | ((readRawByte4 & Byte.MAX_VALUE) << 21);
        byte readRawByte5 = readRawByte();
        byte b5 = b4 | (readRawByte5 << 28);
        if (readRawByte5 >= 0) {
            return b5;
        }
        for (int i = 0; i < 5; i++) {
            if (readRawByte() >= 0) {
                return b5;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) != 0) {
            i &= 127;
            int i2 = 7;
            while (true) {
                if (i2 < 32) {
                    int read = inputStream.read();
                    if (read != -1) {
                        i |= (read & 127) << i2;
                        if ((read & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                } else {
                    while (i2 < 64) {
                        int read2 = inputStream.read();
                        if (read2 == -1) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        } else if ((read2 & 128) != 0) {
                            i2 += 7;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
            }
        }
        return i;
    }

    public long readRawVarint64() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte readRawByte = readRawByte();
            j |= ((long) (readRawByte & Byte.MAX_VALUE)) << i;
            if ((readRawByte & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readRawLittleEndian32() throws IOException {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        byte readRawByte = readRawByte();
        byte readRawByte2 = readRawByte();
        return ((((long) readRawByte2) & 255) << 8) | (((long) readRawByte) & 255) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
    }

    public static int decodeZigZag32(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    private CodedInputStream(byte[] bArr, int i, int i2) {
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.buffer = bArr;
        this.bufferSize = i + i2;
        this.bufferPos = i;
        this.totalBytesRetired = -i;
        this.input = null;
    }

    private CodedInputStream(InputStream inputStream) {
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
    }

    public int setRecursionLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
        }
        int i2 = this.recursionLimit;
        this.recursionLimit = i;
        return i2;
    }

    public int setSizeLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Size limit cannot be negative: " + i);
        }
        int i2 = this.sizeLimit;
        this.sizeLimit = i;
        return i2;
    }

    public void resetSizeCounter() {
        this.totalBytesRetired = -this.bufferPos;
    }

    public int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.totalBytesRetired + this.bufferPos + i;
        int i3 = this.currentLimit;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i2;
        recomputeBufferSizeAfterLimit();
        return i3;
    }

    private void recomputeBufferSizeAfterLimit() {
        this.bufferSize += this.bufferSizeAfterLimit;
        int i = this.totalBytesRetired + this.bufferSize;
        if (i > this.currentLimit) {
            this.bufferSizeAfterLimit = i - this.currentLimit;
            this.bufferSize -= this.bufferSizeAfterLimit;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int getBytesUntilLimit() {
        if (this.currentLimit == Integer.MAX_VALUE) {
            return -1;
        }
        return this.currentLimit - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !refillBuffer(false);
    }

    public int getTotalBytesRead() {
        return this.totalBytesRetired + this.bufferPos;
    }

    private boolean refillBuffer(boolean z) throws IOException {
        if (this.bufferPos < this.bufferSize) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        } else if (this.totalBytesRetired + this.bufferSize != this.currentLimit) {
            this.totalBytesRetired += this.bufferSize;
            this.bufferPos = 0;
            this.bufferSize = this.input == null ? -1 : this.input.read(this.buffer);
            if (this.bufferSize == 0 || this.bufferSize < -1) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.bufferSize + "\nThe InputStream implementation is buggy.");
            } else if (this.bufferSize == -1) {
                this.bufferSize = 0;
                if (!z) {
                    return false;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else {
                recomputeBufferSizeAfterLimit();
                int i = this.totalBytesRetired + this.bufferSize + this.bufferSizeAfterLimit;
                if (i <= this.sizeLimit && i >= 0) {
                    return true;
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
        } else if (!z) {
            return false;
        } else {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(true);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public byte[] readRawBytes(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (this.totalBytesRetired + this.bufferPos + i > this.currentLimit) {
            skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.bufferPos);
            throw InvalidProtocolBufferException.truncatedMessage();
        } else if (i <= this.bufferSize - this.bufferPos) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, this.bufferPos, bArr, 0, i);
            this.bufferPos += i;
            return bArr;
        } else if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i2 = this.bufferSize - this.bufferPos;
            System.arraycopy(this.buffer, this.bufferPos, bArr2, 0, i2);
            this.bufferPos = this.bufferSize;
            refillBuffer(true);
            while (i - i2 > this.bufferSize) {
                System.arraycopy(this.buffer, 0, bArr2, i2, this.bufferSize);
                i2 += this.bufferSize;
                this.bufferPos = this.bufferSize;
                refillBuffer(true);
            }
            System.arraycopy(this.buffer, 0, bArr2, i2, i - i2);
            this.bufferPos = i - i2;
            return bArr2;
        } else {
            int i3 = this.bufferPos;
            int i4 = this.bufferSize;
            this.totalBytesRetired += this.bufferSize;
            this.bufferPos = 0;
            this.bufferSize = 0;
            ArrayList arrayList = new ArrayList();
            int i5 = i - (i4 - i3);
            while (i5 > 0) {
                byte[] bArr3 = new byte[Math.min(i5, 4096)];
                int i6 = 0;
                while (i6 < bArr3.length) {
                    int read = this.input == null ? -1 : this.input.read(bArr3, i6, bArr3.length - i6);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i6 += read;
                }
                arrayList.add(bArr3);
                i5 -= bArr3.length;
            }
            byte[] bArr4 = new byte[i];
            int i7 = i4 - i3;
            System.arraycopy(this.buffer, i3, bArr4, 0, i7);
            Iterator it = arrayList.iterator();
            while (true) {
                int i8 = i7;
                if (!it.hasNext()) {
                    return bArr4;
                }
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i8, bArr5.length);
                i7 = bArr5.length + i8;
            }
        }
    }

    public void skipRawBytes(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (this.totalBytesRetired + this.bufferPos + i > this.currentLimit) {
            skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.bufferPos);
            throw InvalidProtocolBufferException.truncatedMessage();
        } else if (i <= this.bufferSize - this.bufferPos) {
            this.bufferPos += i;
        } else {
            int i2 = this.bufferSize - this.bufferPos;
            this.bufferPos = this.bufferSize;
            refillBuffer(true);
            while (i - i2 > this.bufferSize) {
                i2 += this.bufferSize;
                this.bufferPos = this.bufferSize;
                refillBuffer(true);
            }
            this.bufferPos = i - i2;
        }
    }
}
