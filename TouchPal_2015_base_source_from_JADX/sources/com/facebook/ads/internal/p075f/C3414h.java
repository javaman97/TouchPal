package com.facebook.ads.internal.p075f;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: com.facebook.ads.internal.f.h */
class C3414h implements HttpEntity {

    /* renamed from: d */
    private static final char[] f14899d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: a */
    ByteArrayOutputStream f14900a = new ByteArrayOutputStream();

    /* renamed from: b */
    boolean f14901b = false;

    /* renamed from: c */
    boolean f14902c = false;

    /* renamed from: e */
    private String f14903e = null;

    public C3414h() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            stringBuffer.append(f14899d[random.nextInt(f14899d.length)]);
        }
        this.f14903e = stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo10735a() {
        if (!this.f14902c) {
            try {
                this.f14900a.write(("--" + this.f14903e + "\r\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.f14902c = true;
    }

    /* renamed from: a */
    public void mo10736a(String str, String str2) {
        mo10735a();
        try {
            this.f14900a.write(("Content-Disposition: form-data; name=\"" + str + "\"\r\n\r\n").getBytes());
            this.f14900a.write(str2.getBytes());
            this.f14900a.write(("\r\n--" + this.f14903e + "\r\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo10737a(String str, String str2, InputStream inputStream, String str3, boolean z) {
        mo10735a();
        try {
            this.f14900a.write(("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + str2 + "\"\r\n").getBytes());
            this.f14900a.write(("Content-Type: " + str3 + "\r\n").getBytes());
            this.f14900a.write("Content-Transfer-Encoding: binary\r\n\r\n".getBytes());
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                this.f14900a.write(bArr, 0, read);
            }
            if (!z) {
                this.f14900a.write(("\r\n--" + this.f14903e + "\r\n").getBytes());
            }
            this.f14900a.flush();
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            try {
                inputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void mo10738a(String str, String str2, InputStream inputStream, boolean z) {
        mo10737a(str, str2, inputStream, "application/octet-stream", z);
    }

    /* renamed from: b */
    public void mo10739b() {
        if (!this.f14901b) {
            try {
                this.f14900a.write(("\r\n--" + this.f14903e + "--\r\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f14901b = true;
        }
    }

    public void consumeContent() {
        if (isStreaming()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f14900a.toByteArray());
    }

    public Header getContentEncoding() {
        return null;
    }

    public long getContentLength() {
        mo10739b();
        return (long) this.f14900a.toByteArray().length;
    }

    public Header getContentType() {
        return new BasicHeader("Content-Type", "multipart/form-data; boundary=" + this.f14903e);
    }

    public boolean isChunked() {
        return false;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.f14900a.toByteArray());
    }
}
