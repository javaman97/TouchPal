package com.cootek.smartinput5.plugin.typingrace;

import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.Q */
/* compiled from: Settings */
public class C2441Q {

    /* renamed from: a */
    public static final String f10636a = "SERVER_USER_TOKEN";

    /* renamed from: b */
    private static C2441Q f10637b;

    /* renamed from: c */
    private HashMap<String, Object> f10638c = new HashMap<>();

    private C2441Q() {
    }

    /* renamed from: a */
    public static C2441Q m11074a() {
        if (f10637b == null) {
            f10637b = new C2441Q();
        }
        return f10637b;
    }

    /* renamed from: a */
    public Object mo8211a(String str) {
        return this.f10638c.get(str);
    }

    /* renamed from: a */
    public void mo8212a(String str, Object obj) {
        this.f10638c.put(str, obj);
    }
}
