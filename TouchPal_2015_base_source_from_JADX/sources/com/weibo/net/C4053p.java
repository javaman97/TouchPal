package com.weibo.net;

import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.weibo.net.p */
/* compiled from: Token */
public class C4053p {

    /* renamed from: a */
    protected String f16498a = "";

    /* renamed from: b */
    protected String[] f16499b = null;

    /* renamed from: c */
    protected SecretKeySpec f16500c;

    /* renamed from: d */
    private String f16501d = "";

    /* renamed from: e */
    private String f16502e = "";

    /* renamed from: f */
    private long f16503f = 0;

    /* renamed from: g */
    private String f16504g = "";

    public C4053p() {
    }

    /* renamed from: a */
    public String mo14995a() {
        return this.f16501d;
    }

    /* renamed from: b */
    public String mo14999b() {
        return this.f16502e;
    }

    /* renamed from: a */
    public void mo14997a(String str) {
        this.f16502e = str;
    }

    /* renamed from: c */
    public long mo15001c() {
        return this.f16503f;
    }

    /* renamed from: a */
    public void mo14996a(long j) {
        this.f16503f = j;
    }

    /* renamed from: b */
    public void mo15000b(String str) {
        if (str != null && !str.equals("0")) {
            mo14996a(System.currentTimeMillis() + ((long) (Integer.parseInt(str) * 1000)));
        }
    }

    /* renamed from: c */
    public void mo15002c(String str) {
        this.f16501d = str;
    }

    /* renamed from: d */
    public void mo15004d(String str) {
        this.f16504g = str;
    }

    /* renamed from: d */
    public String mo15003d() {
        return this.f16504g;
    }

    /* renamed from: e */
    public String mo15005e() {
        return this.f16498a;
    }

    public C4053p(String str) {
        this.f16499b = str.split(C2261Q.f9808n);
        this.f16498a = mo15006e(C2409j.f10553k);
        this.f16501d = mo15006e(C2409j.f10554l);
    }

    public C4053p(String str, String str2) {
        this.f16501d = str;
        this.f16498a = str2;
    }

    /* renamed from: e */
    public String mo15006e(String str) {
        for (String str2 : this.f16499b) {
            if (str2.startsWith(str + '=')) {
                return str2.split("=")[1].trim();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14998a(SecretKeySpec secretKeySpec) {
        this.f16500c = secretKeySpec;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public SecretKeySpec mo15007f() {
        return this.f16500c;
    }
}
