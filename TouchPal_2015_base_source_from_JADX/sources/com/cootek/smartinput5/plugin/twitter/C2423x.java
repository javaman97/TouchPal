package com.cootek.smartinput5.plugin.twitter;

/* renamed from: com.cootek.smartinput5.plugin.twitter.x */
/* compiled from: TwitterTask */
public class C2423x {

    /* renamed from: a */
    private static Runnable f10608a;

    /* renamed from: b */
    private static Runnable f10609b;

    /* renamed from: a */
    public static boolean m11066a() {
        return f10608a != null;
    }

    /* renamed from: a */
    public static void m11065a(Runnable runnable, Runnable runnable2) {
        f10608a = runnable;
        f10609b = runnable2;
    }

    /* renamed from: b */
    public static void m11067b() {
        f10609b.run();
    }

    /* renamed from: c */
    public static void m11068c() {
        f10608a.run();
        f10608a = null;
    }
}
