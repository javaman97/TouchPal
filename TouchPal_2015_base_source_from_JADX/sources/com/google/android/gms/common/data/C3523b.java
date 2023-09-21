package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.C3799r;
import com.google.android.gms.internal.C3802s;

/* renamed from: com.google.android.gms.common.data.b */
public abstract class C3523b {

    /* renamed from: S */
    protected final C3525d f15258S;

    /* renamed from: V */
    protected final int f15259V;

    /* renamed from: W */
    private final int f15260W;

    public C3523b(C3525d dVar, int i) {
        this.f15258S = (C3525d) C3802s.m16678d(dVar);
        C3802s.m16672a(i >= 0 && i < dVar.getCount());
        this.f15259V = i;
        this.f15260W = dVar.mo10981e(this.f15259V);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10964a(String str, CharArrayBuffer charArrayBuffer) {
        this.f15258S.mo10975a(str, this.f15259V, this.f15260W, charArrayBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Uri mo10965d(String str) {
        return this.f15258S.mo10983f(str, this.f15259V, this.f15260W);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo10966e(String str) {
        return this.f15258S.mo10984g(str, this.f15259V, this.f15260W);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3523b)) {
            return false;
        }
        C3523b bVar = (C3523b) obj;
        return C3799r.m16669a(Integer.valueOf(bVar.f15259V), Integer.valueOf(this.f15259V)) && C3799r.m16669a(Integer.valueOf(bVar.f15260W), Integer.valueOf(this.f15260W)) && bVar.f15258S == this.f15258S;
    }

    /* access modifiers changed from: protected */
    public boolean getBoolean(String str) {
        return this.f15258S.mo10979d(str, this.f15259V, this.f15260W);
    }

    /* access modifiers changed from: protected */
    public byte[] getByteArray(String str) {
        return this.f15258S.mo10982e(str, this.f15259V, this.f15260W);
    }

    /* access modifiers changed from: protected */
    public int getInteger(String str) {
        return this.f15258S.mo10976b(str, this.f15259V, this.f15260W);
    }

    /* access modifiers changed from: protected */
    public long getLong(String str) {
        return this.f15258S.mo10974a(str, this.f15259V, this.f15260W);
    }

    /* access modifiers changed from: protected */
    public String getString(String str) {
        return this.f15258S.mo10977c(str, this.f15259V, this.f15260W);
    }

    public int hashCode() {
        return C3799r.hashCode(Integer.valueOf(this.f15259V), Integer.valueOf(this.f15260W), this.f15258S);
    }

    public boolean isDataValid() {
        return !this.f15258S.isClosed();
    }
}
