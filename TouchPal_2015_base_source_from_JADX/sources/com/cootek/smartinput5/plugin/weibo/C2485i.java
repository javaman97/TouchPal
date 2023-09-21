package com.cootek.smartinput5.plugin.weibo;

/* renamed from: com.cootek.smartinput5.plugin.weibo.i */
/* compiled from: WeiboTask */
public class C2485i {

    /* renamed from: a */
    private static Runnable f10763a;

    /* renamed from: b */
    private static Runnable f10764b;

    /* renamed from: a */
    public static boolean m11181a() {
        return f10763a != null;
    }

    /* renamed from: a */
    public static void m11180a(Runnable runnable, Runnable runnable2) {
        f10763a = runnable;
        f10764b = runnable2;
    }

    /* renamed from: b */
    public static void m11182b() {
        f10764b.run();
    }

    /* renamed from: c */
    public static void m11183c() {
        f10763a.run();
        f10763a = null;
    }
}
