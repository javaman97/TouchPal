package com.weibo.net;

/* renamed from: com.weibo.net.e */
/* compiled from: DialogError */
public class C4042e extends Throwable {

    /* renamed from: a */
    private static final long f16487a = 1;

    /* renamed from: b */
    private int f16488b;

    /* renamed from: c */
    private String f16489c;

    public C4042e(String str, int i, String str2) {
        super(str);
        this.f16488b = i;
        this.f16489c = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo14985a() {
        return this.f16488b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo14986b() {
        return this.f16489c;
    }
}
