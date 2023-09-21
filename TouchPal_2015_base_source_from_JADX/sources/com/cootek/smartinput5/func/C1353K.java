package com.cootek.smartinput5.func;

import com.cootek.smartinput5.engine.Settings;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.K */
/* compiled from: EmojiWhiteList */
public enum C1353K {
    WECHAT("com.tencent.mm"),
    WEIBO("com.sina.weibo"),
    QQ("com.tencent.mobileqq"),
    WHATSAPP("com.whatsapp"),
    MOMO("com.immomo.momo"),
    GOOGLE_TALK("com.google.android.talk"),
    LINE("jp.naver.line.android"),
    XIAOMI("xiaomi");
    

    /* renamed from: i */
    private static HashMap<String, C1353K> f4179i;

    /* renamed from: j */
    private final String f4181j;

    static {
        int i;
        f4179i = new HashMap<>();
        for (C1353K k : values()) {
            f4179i.put(k.mo5751a(), k);
        }
    }

    private C1353K(String str) {
        this.f4181j = str;
    }

    /* renamed from: a */
    public String mo5751a() {
        return this.f4181j;
    }

    /* renamed from: b */
    public int mo5752b() {
        return 1;
    }

    /* renamed from: c */
    public boolean mo5753c() {
        return Settings.getInstance().getBoolSetting(Settings.DISPLAY_EMOJI_BY_SYSTEM);
    }

    /* renamed from: a */
    public static C1353K m6220a(String str) {
        return f4179i.get(str);
    }
}
