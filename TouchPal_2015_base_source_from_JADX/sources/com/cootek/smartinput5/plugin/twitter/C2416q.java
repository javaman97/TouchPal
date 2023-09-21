package com.cootek.smartinput5.plugin.twitter;

import com.cootek.smartinput5.net.cmd.C2261Q;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.cootek.smartinput5.plugin.twitter.q */
/* compiled from: Token */
public class C2416q {

    /* renamed from: a */
    protected String f10567a = "";

    /* renamed from: b */
    protected String[] f10568b = null;

    /* renamed from: c */
    protected SecretKeySpec f10569c;

    /* renamed from: d */
    private String f10570d = "";

    /* renamed from: e */
    private String f10571e = "";

    public C2416q() {
    }

    /* renamed from: a */
    public void mo8151a(String str) {
        this.f10570d = str;
    }

    /* renamed from: a */
    public String mo8150a() {
        return this.f10570d;
    }

    /* renamed from: b */
    public void mo8154b(String str) {
        this.f10571e = str;
    }

    /* renamed from: b */
    public String mo8153b() {
        return this.f10571e;
    }

    /* renamed from: c */
    public void mo8156c(String str) {
        this.f10567a = str;
    }

    /* renamed from: c */
    public String mo8155c() {
        return this.f10567a;
    }

    public C2416q(String str) {
        this.f10568b = str.split(C2261Q.f9808n);
        this.f10567a = C2409j.m11010a(C2409j.f10553k, this.f10568b);
        this.f10570d = C2409j.m11010a(C2409j.f10554l, this.f10568b);
    }

    public C2416q(String str, String str2) {
        this.f10570d = str;
        this.f10567a = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8152a(SecretKeySpec secretKeySpec) {
        this.f10569c = secretKeySpec;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public SecretKeySpec mo8157d() {
        return this.f10569c;
    }
}
