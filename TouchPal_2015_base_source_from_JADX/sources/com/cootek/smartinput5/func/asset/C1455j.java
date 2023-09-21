package com.cootek.smartinput5.func.asset;

import android.content.res.AssetFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.cootek.smartinput5.func.asset.j */
/* compiled from: InternalAssetFileInfo */
public class C1455j implements C1444a {

    /* renamed from: a */
    private final AssetFileDescriptor f4656a;

    /* renamed from: b */
    private final InputStream f4657b;

    /* renamed from: c */
    private final String f4658c;

    public C1455j(AssetFileDescriptor assetFileDescriptor, InputStream inputStream, String str) {
        this.f4656a = assetFileDescriptor;
        this.f4657b = inputStream;
        this.f4658c = str;
    }

    public void close() throws IOException {
        if (this.f4657b != null) {
            try {
                this.f4657b.close();
            } catch (IOException e) {
            }
        }
        if (this.f4656a != null) {
            try {
                this.f4656a.close();
            } catch (IOException e2) {
            }
        }
    }

    /* renamed from: a */
    public long mo6094a() {
        if (this.f4656a != null) {
            return this.f4656a.getLength();
        }
        return 0;
    }

    /* renamed from: b */
    public FileDescriptor mo6095b() {
        if (this.f4656a != null) {
            return this.f4656a.getFileDescriptor();
        }
        return null;
    }

    /* renamed from: c */
    public InputStream mo6096c() {
        return this.f4657b;
    }

    /* renamed from: d */
    public String mo6097d() {
        return this.f4658c;
    }
}
