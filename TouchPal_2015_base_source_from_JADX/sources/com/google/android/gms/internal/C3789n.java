package com.google.android.gms.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.n */
public final class C3789n {

    /* renamed from: bX */
    private final String f15889bX;

    public C3789n(String str) {
        this.f15889bX = (String) C3802s.m16678d(str);
    }

    /* renamed from: a */
    public void mo12386a(String str, String str2) {
        if (mo12391l(3)) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public void mo12387a(String str, String str2, Throwable th) {
        if (mo12391l(6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: b */
    public void mo12388b(String str, String str2) {
        if (mo12391l(5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: c */
    public void mo12389c(String str, String str2) {
        if (mo12391l(6)) {
            Log.e(str, str2);
        }
    }

    /* renamed from: d */
    public void mo12390d(String str, String str2) {
        if (mo12391l(4)) {
        }
    }

    /* renamed from: l */
    public boolean mo12391l(int i) {
        return Log.isLoggable(this.f15889bX, i);
    }
}
