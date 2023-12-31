package org.apache.http.entity.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

public class HttpMultipart {
    private static final ByteArrayBuffer CR_LF = encode(MIME.DEFAULT_CHARSET, "\r\n");
    private static final ByteArrayBuffer FIELD_SEP = encode(MIME.DEFAULT_CHARSET, ": ");
    private static final ByteArrayBuffer TWO_DASHES = encode(MIME.DEFAULT_CHARSET, "--");
    private final String boundary;
    private final Charset charset;
    private final HttpMultipartMode mode;
    private final List<FormBodyPart> parts;
    private final String subType;

    private static ByteArrayBuffer encode(Charset charset2, String str) {
        ByteBuffer encode = charset2.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    private static void writeBytes(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) throws IOException {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    private static void writeBytes(String str, Charset charset2, OutputStream outputStream) throws IOException {
        writeBytes(encode(charset2, str), outputStream);
    }

    private static void writeBytes(String str, OutputStream outputStream) throws IOException {
        writeBytes(encode(MIME.DEFAULT_CHARSET, str), outputStream);
    }

    private static void writeField(MinimalField minimalField, OutputStream outputStream) throws IOException {
        writeBytes(minimalField.getName(), outputStream);
        writeBytes(FIELD_SEP, outputStream);
        writeBytes(minimalField.getBody(), outputStream);
        writeBytes(CR_LF, outputStream);
    }

    private static void writeField(MinimalField minimalField, Charset charset2, OutputStream outputStream) throws IOException {
        writeBytes(minimalField.getName(), charset2, outputStream);
        writeBytes(FIELD_SEP, outputStream);
        writeBytes(minimalField.getBody(), charset2, outputStream);
        writeBytes(CR_LF, outputStream);
    }

    public HttpMultipart(String str, Charset charset2, String str2, HttpMultipartMode httpMultipartMode) {
        if (str == null) {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        } else if (str2 == null) {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        } else {
            this.subType = str;
            this.charset = charset2 == null ? MIME.DEFAULT_CHARSET : charset2;
            this.boundary = str2;
            this.parts = new ArrayList();
            this.mode = httpMultipartMode;
        }
    }

    public HttpMultipart(String str, Charset charset2, String str2) {
        this(str, charset2, str2, HttpMultipartMode.STRICT);
    }

    public HttpMultipart(String str, String str2) {
        this(str, (Charset) null, str2);
    }

    public String getSubType() {
        return this.subType;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public HttpMultipartMode getMode() {
        return this.mode;
    }

    public List<FormBodyPart> getBodyParts() {
        return this.parts;
    }

    public void addBodyPart(FormBodyPart formBodyPart) {
        if (formBodyPart != null) {
            this.parts.add(formBodyPart);
        }
    }

    public String getBoundary() {
        return this.boundary;
    }

    private void doWriteTo(HttpMultipartMode httpMultipartMode, OutputStream outputStream, boolean z) throws IOException {
        ByteArrayBuffer encode = encode(this.charset, getBoundary());
        for (FormBodyPart next : this.parts) {
            writeBytes(TWO_DASHES, outputStream);
            writeBytes(encode, outputStream);
            writeBytes(CR_LF, outputStream);
            Header header = next.getHeader();
            switch (httpMultipartMode) {
                case STRICT:
                    Iterator<MinimalField> it = header.iterator();
                    while (it.hasNext()) {
                        writeField(it.next(), outputStream);
                    }
                    break;
                case BROWSER_COMPATIBLE:
                    writeField(next.getHeader().getField(MIME.CONTENT_DISPOSITION), this.charset, outputStream);
                    if (next.getBody().getFilename() != null) {
                        writeField(next.getHeader().getField("Content-Type"), this.charset, outputStream);
                        break;
                    }
                    break;
            }
            writeBytes(CR_LF, outputStream);
            if (z) {
                next.getBody().writeTo(outputStream);
            }
            writeBytes(CR_LF, outputStream);
        }
        writeBytes(TWO_DASHES, outputStream);
        writeBytes(encode, outputStream);
        writeBytes(TWO_DASHES, outputStream);
        writeBytes(CR_LF, outputStream);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        doWriteTo(this.mode, outputStream, true);
    }

    public long getTotalLength() {
        long j = 0;
        for (FormBodyPart body : this.parts) {
            long contentLength = body.getBody().getContentLength();
            if (contentLength < 0) {
                return -1;
            }
            j = contentLength + j;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            doWriteTo(this.mode, byteArrayOutputStream, false);
            return ((long) byteArrayOutputStream.toByteArray().length) + j;
        } catch (IOException e) {
            return -1;
        }
    }
}
