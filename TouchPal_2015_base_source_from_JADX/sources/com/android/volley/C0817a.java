package com.android.volley;

import android.content.Intent;

/* renamed from: com.android.volley.a */
/* compiled from: AuthFailureError */
public class C0817a extends C0883x {

    /* renamed from: b */
    private Intent f2149b;

    public C0817a() {
    }

    public C0817a(Intent intent) {
        this.f2149b = intent;
    }

    public C0817a(C0830l lVar) {
        super(lVar);
    }

    public C0817a(String str) {
        super(str);
    }

    public C0817a(String str, Exception exc) {
        super(str, exc);
    }

    /* renamed from: a */
    public Intent mo3026a() {
        return this.f2149b;
    }

    public String getMessage() {
        if (this.f2149b != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
