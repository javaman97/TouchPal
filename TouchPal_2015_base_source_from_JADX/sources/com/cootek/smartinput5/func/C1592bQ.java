package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p052b.C1550c;
import java.util.StringTokenizer;

/* renamed from: com.cootek.smartinput5.func.bQ */
/* compiled from: V4Settings */
public enum C1592bQ {
    DEFAULT_LANGUAGE_WESTERN(10, (int) null, 3, 3, -1, (int) null, (int) null),
    PREVIOUS_LANGUAGE(11, (int) null, 3, 3, -1, (int) null, (int) null),
    KEY_PRESS_SOUND(72, 0, 1, 1, -1, (int) null, (int) null),
    KEY_PRESS_VIBRATION(73, 0, 1, 1, -1, (int) null, (int) null),
    LAYOUT_PORTRAIT_CHS(3, (int) null, 1, 1, 1, new String[]{C1549b.f4831b, C1549b.f4834e, C1549b.f4833d}, new Config(1)),
    LAYOUT_LANDSCAPE_CHS(3, (int) null, 1, 1, 1, new String[]{C1549b.f4831b, C1549b.f4834e, C1549b.f4833d}, new Config(2)),
    LAYOUT_PORTRAIT_WESTERN(3, (int) null, 1, 1, 1, new String[]{"western"}, new Config(1)),
    LAYOUT_LANDSCAPE_WESTERN(3, (int) null, 1, 1, 1, new String[]{"western"}, new Config(2)),
    SHOW_POPUP(Settings.PREVIEW_LEVEL, false, 2, 1, -1, (int) null, (int) null),
    KEYBOARD_HEIGHT(Settings.KEYBOARD_HEIGHT_NORMAL, 1, 1, 1, -1, (int) null, (int) null),
    MIXED_LANGUAGE_INPUT(12, false, 2, 2, -1, (int) null, (int) null);
    

    /* renamed from: l */
    public static boolean f5037l;

    /* renamed from: m */
    private int f5039m;

    /* renamed from: n */
    private Object f5040n;

    /* renamed from: o */
    private int f5041o;

    /* renamed from: p */
    private int f5042p;

    /* renamed from: q */
    private Object f5043q;

    /* renamed from: r */
    private int f5044r;

    /* renamed from: s */
    private String[] f5045s;

    /* renamed from: t */
    private Config f5046t;

    static {
        f5037l = false;
    }

    private C1592bQ(int i, Object obj, int i2, int i3, int i4, String[] strArr, Config config) {
        this.f5039m = i;
        this.f5040n = obj;
        this.f5041o = i2;
        this.f5042p = i3;
        this.f5044r = i4;
        this.f5045s = strArr;
        this.f5046t = config;
    }

    /* renamed from: a */
    public void mo6231a(String str, SharedPreferences sharedPreferences, Context context) {
        if (!sharedPreferences.contains(str) && this.f5040n != null) {
            this.f5043q = this.f5040n;
        } else if (sharedPreferences.contains(str)) {
            switch (this.f5041o) {
                case 1:
                    this.f5043q = Integer.valueOf(sharedPreferences.getInt(str, 0));
                    break;
                case 2:
                    this.f5043q = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                    break;
                case 3:
                    this.f5043q = sharedPreferences.getString(str, (String) null);
                    break;
                case 4:
                    this.f5043q = Long.valueOf(sharedPreferences.getLong(str, 0));
                    break;
                default:
                    return;
            }
        } else {
            return;
        }
        if (this.f5039m == 10 || this.f5039m == 11) {
            if (this.f5043q != null) {
                String str2 = (String) this.f5043q;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (C2119x.f8996b.equalsIgnoreCase(str2)) {
                    this.f5043q = C1549b.f4791a;
                    f5037l = true;
                } else {
                    C1550c[] e = C1550c.m7002e(context);
                    String nextToken = new StringTokenizer(str2, "/").nextToken();
                    int length = e.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            C1550c cVar = e[i];
                            String c = cVar.mo6193c(context);
                            if (!TextUtils.isEmpty(c) && c.equalsIgnoreCase(nextToken)) {
                                this.f5043q = cVar.mo6190a();
                                f5037l = true;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (this.f5039m == 3) {
            if (C2119x.f9001g.indexOfKey(((Integer) this.f5043q).intValue()) >= 0) {
                this.f5043q = Integer.valueOf(C2119x.f9001g.get(((Integer) this.f5043q).intValue()));
            } else {
                this.f5043q = null;
            }
        }
        if (this.f5039m == 193) {
            if (C2119x.f9002h.containsKey(this.f5043q)) {
                this.f5043q = C2119x.f9002h.get(this.f5043q);
            } else {
                this.f5043q = null;
            }
        }
        if (this.f5039m == 254 && this.f5043q != null) {
            this.f5043q = Integer.valueOf(C2119x.m9657a(((Integer) this.f5043q).intValue()));
        }
    }

    /* renamed from: a */
    public void mo6230a() {
        if (this.f5043q != null) {
            switch (this.f5042p) {
                case 1:
                    if (this.f5044r < 0 || this.f5045s == null || this.f5045s.length <= 0) {
                        Settings.getInstance().setIntSetting(this.f5039m, ((Integer) this.f5043q).intValue());
                        return;
                    }
                    for (String intSetting : this.f5045s) {
                        Settings.getInstance().setIntSetting(this.f5039m, ((Integer) this.f5043q).intValue(), this.f5044r, intSetting, this.f5046t, false);
                    }
                    return;
                case 2:
                    if (this.f5044r < 0 || this.f5045s == null || this.f5045s.length <= 0) {
                        Settings.getInstance().setBoolSetting(this.f5039m, ((Boolean) this.f5043q).booleanValue());
                        return;
                    }
                    for (String boolSetting : this.f5045s) {
                        Settings.getInstance().setBoolSetting(this.f5039m, ((Boolean) this.f5043q).booleanValue(), this.f5044r, boolSetting, this.f5046t, false);
                    }
                    return;
                case 3:
                    if (this.f5044r < 0 || this.f5045s == null || this.f5045s.length <= 0) {
                        Settings.getInstance().setStringSetting(this.f5039m, (String) this.f5043q);
                        return;
                    }
                    for (String stringSetting : this.f5045s) {
                        Settings.getInstance().setStringSetting(this.f5039m, (String) this.f5043q, this.f5044r, stringSetting, this.f5046t, false);
                    }
                    return;
                case 4:
                    if (this.f5044r < 0 || this.f5045s == null || this.f5045s.length <= 0) {
                        Settings.getInstance().setLongSetting(this.f5039m, ((Long) this.f5043q).longValue());
                        return;
                    }
                    for (String longSetting : this.f5045s) {
                        Settings.getInstance().setLongSetting(this.f5039m, ((Long) this.f5043q).longValue(), this.f5044r, longSetting, this.f5046t, false);
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static void m7158a(SharedPreferences sharedPreferences, Context context) {
        for (C1592bQ bQVar : values()) {
            bQVar.mo6231a(bQVar.name(), sharedPreferences, context);
        }
    }

    /* renamed from: b */
    public static void m7159b() {
        for (C1592bQ a : values()) {
            a.mo6230a();
        }
    }
}
