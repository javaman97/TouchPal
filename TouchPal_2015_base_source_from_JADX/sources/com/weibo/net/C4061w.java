package com.weibo.net;

/* renamed from: com.weibo.net.w */
/* compiled from: WeiboException */
public class C4061w extends Exception {

    /* renamed from: a */
    private static final long f16541a = 475022994858770424L;

    /* renamed from: b */
    private int f16542b = -1;

    public C4061w(String str) {
        super(str);
    }

    public C4061w(Exception exc) {
        super(exc);
    }

    public C4061w(String str, int i) {
        super(str);
        this.f16542b = i;
    }

    public C4061w(String str, Exception exc) {
        super(str, exc);
    }

    public C4061w(String str, Exception exc, int i) {
        super(str, exc);
        this.f16542b = i;
    }

    /* renamed from: a */
    public int mo15031a() {
        return this.f16542b;
    }

    public C4061w() {
    }

    public C4061w(String str, Throwable th) {
        super(str, th);
    }

    public C4061w(Throwable th) {
        super(th);
    }

    public C4061w(int i) {
        this.f16542b = i;
    }

    /* renamed from: a */
    public void mo15032a(int i) {
        this.f16542b = i;
    }
}
