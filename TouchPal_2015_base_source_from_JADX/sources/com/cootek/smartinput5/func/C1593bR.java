package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.p066ui.settings.LanguageListActivity;
import com.cootek.smartinput5.p066ui.settings.LanguageListActivityInte;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.bR */
/* compiled from: VersionContentProvider */
public class C1593bR {

    /* renamed from: A */
    public static final int f5047A = 22;

    /* renamed from: B */
    public static final int f5048B = 23;

    /* renamed from: C */
    public static final int f5049C = 0;

    /* renamed from: D */
    public static final int f5050D = 0;

    /* renamed from: E */
    public static final int f5051E = 1;

    /* renamed from: F */
    private static C1593bR f5052F = null;

    /* renamed from: e */
    public static final int f5053e = 0;

    /* renamed from: f */
    public static final int f5054f = 1;

    /* renamed from: g */
    public static final int f5055g = 2;

    /* renamed from: h */
    public static final int f5056h = 3;

    /* renamed from: i */
    public static final int f5057i = 4;

    /* renamed from: j */
    public static final int f5058j = 5;

    /* renamed from: k */
    public static final int f5059k = 6;

    /* renamed from: l */
    public static final int f5060l = 7;

    /* renamed from: m */
    public static final int f5061m = 8;

    /* renamed from: n */
    public static final int f5062n = 9;

    /* renamed from: o */
    public static final int f5063o = 10;

    /* renamed from: p */
    public static final int f5064p = 11;

    /* renamed from: q */
    public static final int f5065q = 12;

    /* renamed from: r */
    public static final int f5066r = 13;

    /* renamed from: s */
    public static final int f5067s = 14;

    /* renamed from: t */
    public static final int f5068t = 15;

    /* renamed from: u */
    public static final int f5069u = 16;

    /* renamed from: v */
    public static final int f5070v = 17;

    /* renamed from: w */
    public static final int f5071w = 18;

    /* renamed from: x */
    public static final int f5072x = 19;

    /* renamed from: y */
    public static final int f5073y = 20;

    /* renamed from: z */
    public static final int f5074z = 21;

    /* renamed from: a */
    public final boolean f5075a = true;

    /* renamed from: b */
    public final boolean f5076b = false;

    /* renamed from: c */
    public final boolean f5077c = true;

    /* renamed from: d */
    public final boolean f5078d = false;

    private C1593bR() {
    }

    /* renamed from: a */
    public static C1593bR m7162a() {
        if (f5052F == null) {
            f5052F = new C1593bR();
        }
        return f5052F;
    }

    /* renamed from: b */
    public static void m7164b() {
        f5052F = null;
    }

    /* renamed from: a */
    public int mo6232a(int i) {
        if (this.f5075a) {
            return m7166d(i);
        }
        return m7167e(i);
    }

    /* renamed from: d */
    private int m7166d(int i) {
        switch (i) {
            case 0:
                return R.string.app_id_ime_international;
            case 1:
                return R.string.optpage_touchpal_cloud_title;
            case 2:
                return R.string.optpage_mixedlang_inte;
            case 4:
                return 8;
            case 5:
                return R.string.paopao_more_cells_title;
            case 6:
                return R.string.paopao_more_cells_summary;
            case 7:
                return R.string.onestop_download_title;
            case 8:
                return R.string.follow_twitter_title;
            case 9:
                return R.string.ime_server_url_china_http;
            case 10:
                return R.string.download_url_shortcut_plugin_international;
            case 11:
                return R.string.webview_url_skin_international;
            case 12:
                return R.string.recommender_url_international;
            case 13:
                return R.string.download_hotword_url_international;
            case 14:
                return R.string.webview_url_speed_international;
            case 15:
                return R.string.smartinput_download_url_international;
            case 16:
                return R.string.app_name_international;
            case 17:
                return R.string.webview_wave_guide_international;
            case 18:
                return R.string.webview_pinyincurve_guide_international;
            case 19:
                return R.string.ime_server_url_china_http;
            case 20:
                return R.string.optpage_sharewithfriend_message_short_international;
            case 21:
                return R.string.wrong_update_dialog_msg_international;
            case 22:
                return R.string.ime_default_cdn_url_international;
            case 23:
                return R.string.webpage_zip_common_international;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    private int m7167e(int i) {
        switch (i) {
            case 0:
                return R.string.app_id_ime_mainland;
            case 1:
                return R.string.optpage_dictionary_management;
            case 2:
                return R.string.optpage_mixedlang;
            case 3:
                return 8;
            case 5:
                return R.string.paopao_more_cells_title_mainland;
            case 6:
                return R.string.paopao_more_cells_summary_mainland;
            case 7:
                return R.string.onestop_download_title_mainland;
            case 8:
                return R.string.follow_weibo_title;
            case 9:
                return R.string.ime_server_url_http_mainland;
            case 10:
                return R.string.download_url_shortcut_plugin_mainland;
            case 11:
                return R.string.webview_url_skin_mainland;
            case 12:
                return R.string.recommender_url_mainland;
            case 13:
                return R.string.download_hotword_url_mainland;
            case 14:
                return R.string.webview_url_speed_mainland;
            case 15:
                return R.string.smartinput_download_url_mainland;
            case 16:
                return R.string.app_name_mainland;
            case 17:
                return R.string.webview_wave_guide_mainland;
            case 18:
                return R.string.webview_pinyincurve_guide_mainland;
            case 19:
                return R.string.cootek_server_url_http_mainland;
            case 20:
                return R.string.optpage_sharewithfriend_message_short_mainland;
            case 21:
                return R.string.wrong_update_dialog_msg_mainland;
            case 22:
                return R.string.ime_default_cdn_url_mainland;
            case 23:
                return R.string.webpage_zip_common_mainland;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public String mo6233a(Context context, int i) {
        if (this.f5075a) {
            return m7163b(context, i);
        }
        return m7165c(context, i);
    }

    /* renamed from: b */
    private String m7163b(Context context, int i) {
        switch (i) {
            case 0:
                return "touchpal_keyboard.feedback@cootek.cn";
            case 1:
                return "UA-44448382-1";
            default:
                return null;
        }
    }

    /* renamed from: c */
    private String m7165c(Context context, int i) {
        switch (i) {
            case 0:
                return "touchpal_keyboard.feedback@cootek.cn";
            case 1:
                return "UA-44448382-5";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public Class mo6234b(int i) {
        if (this.f5075a) {
            return m7168f(i);
        }
        return m7169g(i);
    }

    /* renamed from: f */
    private Class m7168f(int i) {
        switch (i) {
            case 0:
                return LanguageListActivityInte.class;
            default:
                return null;
        }
    }

    /* renamed from: g */
    private Class m7169g(int i) {
        switch (i) {
            case 0:
                return LanguageListActivity.class;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public boolean mo6235c(int i) {
        if (this.f5075a) {
            return m7170h(i);
        }
        return m7171i(i);
    }

    /* renamed from: h */
    private boolean m7170h(int i) {
        return false;
    }

    /* renamed from: i */
    private boolean m7171i(int i) {
        return false;
    }
}
