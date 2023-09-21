package android.support.p001v4.p015j;

import android.support.p000a.C0016q;
import android.support.p000a.C0017r;
import com.cootek.smartinput5.engine.Settings;
import java.util.Locale;

/* renamed from: android.support.v4.j.f */
/* compiled from: TextUtilsCompat */
public class C0297f {

    /* renamed from: a */
    public static final Locale f744a = new Locale("", "");

    /* renamed from: b */
    private static String f745b = "Arab";

    /* renamed from: c */
    private static String f746c = "Hebr";

    @C0016q
    /* renamed from: a */
    public static String m1176a(@C0016q String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case Settings.STATISTIC_ENABLED /*34*/:
                    sb.append("&quot;");
                    break;
                case Settings.SYMBOL_LOCK /*38*/:
                    sb.append("&amp;");
                    break;
                case Settings.TOUCH_CORRECT /*39*/:
                    sb.append("&#39;");
                    break;
                case Settings.TRAD_SIMP_CONVERT_STRATEGY /*60*/:
                    sb.append("&lt;");
                    break;
                case Settings.EMOJI_PREDICTION /*62*/:
                    sb.append("&gt;");
                    break;
                default:
                    sb.append(charAt);
                    break;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int m1175a(@C0017r Locale locale) {
        if (locale != null && !locale.equals(f744a)) {
            String a = C0283b.m1150a(C0283b.m1151b(locale.toString()));
            if (a == null) {
                return m1177b(locale);
            }
            if (a.equalsIgnoreCase(f745b) || a.equalsIgnoreCase(f746c)) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static int m1177b(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }
}
