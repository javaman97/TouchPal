package com.android.volley.toolbox;

import java.util.Comparator;

/* renamed from: com.android.volley.toolbox.e */
/* compiled from: ByteArrayPool */
final class C0849e implements Comparator<byte[]> {
    C0849e() {
    }

    /* renamed from: a */
    public int compare(byte[] bArr, byte[] bArr2) {
        return bArr.length - bArr2.length;
    }
}
