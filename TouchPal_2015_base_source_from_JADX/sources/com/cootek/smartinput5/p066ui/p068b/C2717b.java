package com.cootek.smartinput5.p066ui.p068b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.ui.b.b */
/* compiled from: GuidePointLocalConstId */
public enum C2717b {
    LOGO_FUNC_BAR,
    voice,
    edit,
    f12128d,
    f12129e,
    message_pal,
    dialer,
    typing_race,
    url_navigator,
    quick_switcher,
    PLUGIN_LANGUAGE,
    PLUGIN_SHARE,
    PLUGIN_CHT_CHS_CONVERT,
    PLUGIN_CLIPBOARD,
    PLUGIN_EDIT,
    PLUGIN_MORE,
    PLUGIN_PREDICTION,
    PLUGIN_RESIZE_KEYBOARD,
    PLUGIN_HOT_WORD,
    PLUGIN_VOICE,
    MORE_SKIN,
    MORE_ONLINE_STORE,
    hw_mask;
    

    /* renamed from: x */
    private static Map<String, C2717b> f12148x;

    static {
        int i;
        f12148x = new HashMap();
        for (C2717b bVar : values()) {
            f12148x.put(bVar.toString(), bVar);
        }
    }

    /* renamed from: a */
    public static boolean m12487a(String str) {
        return m12488b(str) != null;
    }

    /* renamed from: b */
    public static C2717b m12488b(String str) {
        return f12148x.get(str);
    }
}
