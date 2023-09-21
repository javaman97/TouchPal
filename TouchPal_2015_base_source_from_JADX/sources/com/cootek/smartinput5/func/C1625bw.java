package com.cootek.smartinput5.func;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.bw */
/* compiled from: TouchPalVibrator */
public class C1625bw {

    /* renamed from: a */
    public static final int f5217a = 0;

    /* renamed from: b */
    public static final int f5218b = 1;

    /* renamed from: c */
    public static final int f5219c = 2;

    /* renamed from: d */
    public static final int f5220d = 3;

    /* renamed from: e */
    public static final int f5221e = 4;

    /* renamed from: f */
    public static final int f5222f = 5;

    /* renamed from: g */
    public static final int f5223g = 6;

    /* renamed from: h */
    public static final int f5224h = 7;

    /* renamed from: i */
    public static final int f5225i = 8;

    /* renamed from: j */
    public static final int f5226j = 9;

    /* renamed from: k */
    public static final int f5227k = -1;

    /* renamed from: l */
    public static final int f5228l = 48;

    /* renamed from: m */
    public static final int f5229m = 100;

    /* renamed from: n */
    public static final int f5230n = 10;

    /* renamed from: o */
    public static final HashMap<String, String> f5231o = new HashMap<>();

    /* renamed from: r */
    private static final String[] f5232r = {"MODEL=Nexus S:BRAND=google,5", "MODEL=Galaxy Nexus:BRAND=google,5", "MODEL=Nexus 4:BRAND=google,8", "MODEL=Nexus 10:BRAND=google,16", "MODEL=GT-I(9100[GMPT]?|9108|9210T?):MANUFACTURER=samsung,8", "MODEL=SGH-(I9[27]7R?|I927|T989D?):MANUFACTURER=samsung,8", "MODEL=SHW-M250[KLS]?|SPH-D710|SCH-R760:MANUFACTURER=samsung,8", "MODEL=ISW11SC|SC-02C:MANUFACTURER=samsung,8", "MODEL=(SAMSUNG-)?GT-I(930[05][NT]?|9308):MANUFACTURER=samsung,8", "MODEL=(SAMSUNG-)?SGH-(T999[V]?|I747[M]?|N064|N035):MANUFACTURER=samsung,8", "MODEL=(SAMSUNG-)?SCH-(J021|R530|I535|I939):MANUFACTURER=samsung,8", "MODEL=(SAMSUNG-)?(SCL21|SC-06D|SC-03E):MANUFACTURER=samsung,8", "MODEL=(SAMSUNG-)?(SHV-210[KLS]?|SPH-L710):MANUFACTURER=samsung,8", "MODEL=(SAMSUNG-)?GT-I(950[0258][G]?):MANUFACTURER=samsung,7", "MODEL=(SAMSUNG-)?SGH-(I337|M919|N045):MANUFACTURER=samsung,7", "MODEL=(SAMSUNG-)?SCH-(I545|I959|R970):MANUFACTURER=samsung,7", "MODEL=(SAMSUNG-)?SPH-(L720):MANUFACTURER=samsung,7", "MODEL=(SAMSUNG-)?(SC-04E):MANUFACTURER=samsung,7", "MODEL=(SAMSUNG-)?(SHV-E300[KLS]?):MANUFACTURER=samsung,7", "MODEL=LG-E97[013]|LS970|L-01E:MANUFACTURER=LGE,15", "MODEL=HTC One X:MANUFACTURER=HTC,20", "MODEL=HTC One:MANUFACTURER=HTC,15", "MODEL=HTL22:MANUFACTURER=HTC,15", "MODEL=XT907:MANUFACTURER=motorola,30", "MODEL=XT1035:MANUFACTURER=motorola,18", "MODEL=C6603|C6806:MANUFACTURER=Sony,35"};

    /* renamed from: s */
    private static final String[] f5233s = {"MODEL", Build.MODEL, "BRAND", Build.BRAND, "MANUFACTURER", Build.MANUFACTURER};

    /* renamed from: p */
    private Vibrator f5234p;

    /* renamed from: q */
    private int[] f5235q = new int[9];

    /* renamed from: t */
    private int f5236t;

    public C1625bw(Context context) {
        this.f5234p = (Vibrator) context.getSystemService("vibrator");
        Arrays.fill(this.f5235q, -1);
        m7426c();
        this.f5236t = mo6380b();
    }

    /* renamed from: a */
    public void mo6378a(int i) {
        try {
            this.f5234p.vibrate((long) i);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void mo6379a(boolean z) {
        C2917du widgetManager;
        SoftKeyboardView g;
        if (!HighFreqSettings.getInstance().applySystemVibrate || !Engine.isInitialized() || (widgetManager = Engine.getInstance().getWidgetManager()) == null || (g = widgetManager.mo9648g()) == null) {
            int intSetting = Settings.getInstance().getIntSetting(Settings.VIBRATE_TIME);
            if (z) {
                intSetting = 5;
            } else if (intSetting == 0) {
                return;
            }
            mo6378a(intSetting);
            return;
        }
        try {
            if (this.f5236t > 0) {
                mo6378a(this.f5236t);
            } else {
                g.performHapticFeedback(3, 2);
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void mo6377a() {
        if (this.f5234p != null) {
            this.f5234p.cancel();
        }
    }

    /* renamed from: b */
    public int mo6380b() {
        for (int i = 0; i < f5232r.length; i++) {
            int indexOf = f5232r[i].indexOf(",");
            if (m7425a(f5232r[i].substring(0, indexOf))) {
                return Integer.parseInt(f5232r[i].substring(indexOf + 1));
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static boolean m7425a(String str) {
        String str2;
        boolean z;
        String[] split = str.split(":");
        boolean z2 = true;
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str3 = split[i];
            int indexOf = str3.indexOf(61);
            if (indexOf < 0 || (str2 = f5231o.get(str3.substring(0, indexOf))) == null) {
                return false;
            }
            if (!str2.matches(str3.substring(indexOf + 1))) {
                z = false;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        return z2;
    }

    /* renamed from: c */
    private void m7426c() {
        int length = (f5233s.length + 1) / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            f5231o.put(f5233s[i2], f5233s[i2 + 1]);
        }
    }
}
