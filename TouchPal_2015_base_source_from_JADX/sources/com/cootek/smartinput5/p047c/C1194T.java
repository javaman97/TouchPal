package com.cootek.smartinput5.p047c;

import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.c.T */
/* compiled from: PluginWidgetItem */
public enum C1194T {
    WIDGET_PREDICTION(C1219x.class),
    WIDGET_EDIT(C1207l.class),
    WIDGET_CLIPBOARD(C1204i.class),
    WIDGET_RESIZE_KEYBOARD(C1175A.class),
    WIDGET_CHT_CHS_CONVERT(C1201f.class),
    WIDGET_MORE(C1216u.class),
    WIDGET_TRENDS(C1188N.class),
    WIDGET_LANGUAGE(C1213r.class),
    WIDGET_SKIN(C1181G.class),
    WIDGET_SHARE(C1178D.class),
    WIDGET_STORE(C1184J.class),
    WIDGET_VOICE(C1191Q.class),
    WIDGET_HW_MASK(C1210o.class);
    

    /* renamed from: o */
    private static HashMap<String, C1199d> f3554o;

    /* renamed from: n */
    private C1199d f3556n;

    static {
        int i;
        f3554o = new HashMap<>();
        for (C1194T t : values()) {
            f3554o.put(t.mo4465a().mo4454b(), t.mo4465a());
        }
    }

    private C1194T(Class<?> cls) {
        this.f3556n = null;
        try {
            this.f3556n = (C1199d) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public C1199d mo4465a() {
        return this.f3556n;
    }

    /* renamed from: a */
    public static C1199d m5771a(String str) {
        return f3554o.get(str);
    }
}
