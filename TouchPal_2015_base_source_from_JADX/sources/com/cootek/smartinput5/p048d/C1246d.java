package com.cootek.smartinput5.p048d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2305z;
import com.cootek.usage.UsageRecorder;
import com.emoji.keyboard.touchpal.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.d.d */
/* compiled from: UserDataCollect */
public class C1246d {

    /* renamed from: A */
    public static final String f3704A = "NOPE";

    /* renamed from: B */
    public static final String f3705B = "USED";

    /* renamed from: C */
    public static final String f3706C = "INSTALL";

    /* renamed from: D */
    public static final String f3707D = "OCCURRED";

    /* renamed from: E */
    public static final String f3708E = "SAMPLING";

    /* renamed from: F */
    public static final String f3709F = "FIRST_OCCURRED";

    /* renamed from: G */
    public static final String f3710G = "NOTHING";

    /* renamed from: H */
    public static final String f3711H = "AUTO";

    /* renamed from: I */
    public static final String f3712I = "MANUAL";

    /* renamed from: J */
    public static final String f3713J = "ADD_SHORTCUT_INPUT";

    /* renamed from: K */
    public static final String f3714K = "CUSTOMIZED_SYMBOL";

    /* renamed from: L */
    public static final String f3715L = "AMBIGUIOUS_PINYIN";

    /* renamed from: M */
    public static final String f3716M = "CURVE_KEYBOARD";

    /* renamed from: N */
    public static final String f3717N = "HELP_OR_RELATED/VERSION_UPDATE";

    /* renamed from: O */
    public static final String f3718O = "ENABLE_";

    /* renamed from: P */
    public static final String f3719P = "DOWNLOAD_CELLDIC";

    /* renamed from: Q */
    public static final String f3720Q = "ENABLE_CELLDIC";

    /* renamed from: R */
    public static final String f3721R = "IMPORT_CONTACT";

    /* renamed from: S */
    public static final String f3722S = "CLEAR_CONTACT";

    /* renamed from: T */
    public static final String f3723T = "UPDATE_HOTWORD";

    /* renamed from: U */
    public static final String f3724U = "USERWORD_BACKUP";

    /* renamed from: V */
    public static final String f3725V = "USERWORD_RESTORE";

    /* renamed from: W */
    public static final String f3726W = "PAOPAO_CLICKED";

    /* renamed from: X */
    public static final String f3727X = "INSTALL_MODE";

    /* renamed from: Y */
    public static final String f3728Y = "HELP/HELP";

    /* renamed from: Z */
    public static final String f3729Z = "FIRST_INSTALL_VERSION";

    /* renamed from: a */
    public static final String f3730a = "/SETTING/";

    /* renamed from: aA */
    public static final String f3731aA = "TRAD_SIMP_CHS_CONVERT/";

    /* renamed from: aB */
    public static final String f3732aB = "OUTPUT_DEFAULT";

    /* renamed from: aC */
    public static final String f3733aC = "OUTPUT_SIMP_CHS";

    /* renamed from: aD */
    public static final String f3734aD = "OUTPUT_TRAD_CHS";

    /* renamed from: aE */
    public static final String f3735aE = "HOTWORD/";

    /* renamed from: aF */
    public static final String f3736aF = "NOTIFICATION";

    /* renamed from: aG */
    public static final String f3737aG = "DIALOG";

    /* renamed from: aH */
    public static final String f3738aH = "CLOUD_SYNC/";

    /* renamed from: aI */
    public static final String f3739aI = "synclist";

    /* renamed from: aJ */
    public static final String f3740aJ = "backup_info";

    /* renamed from: aK */
    public static final String f3741aK = "as3_backup";

    /* renamed from: aL */
    public static final String f3742aL = "backup_confirm";

    /* renamed from: aM */
    public static final String f3743aM = "restore_info";

    /* renamed from: aN */
    public static final String f3744aN = "as3_restore";

    /* renamed from: aO */
    public static final String f3745aO = "cloud_sync_start";

    /* renamed from: aP */
    public static final String f3746aP = "cloud_sync_cancel";

    /* renamed from: aQ */
    public static final String f3747aQ = "cloud_sync_clear";

    /* renamed from: aR */
    public static final String f3748aR = "mannual_sync";

    /* renamed from: aS */
    public static final String f3749aS = "auto_sync";

    /* renamed from: aT */
    public static final String f3750aT = "backup_after_check_image";

    /* renamed from: aU */
    public static final String f3751aU = "EDIT_ENTRANCE";

    /* renamed from: aV */
    public static final String f3752aV = "CLIPBOARD_ENTRANCE";

    /* renamed from: aW */
    public static final String f3753aW = "CLIPBOARD_OPERATION";

    /* renamed from: aX */
    public static final String f3754aX = "CLIPBOARD_PURCHASE";

    /* renamed from: aY */
    public static final String f3755aY = "edit_launch";

    /* renamed from: aZ */
    public static final String f3756aZ = "edit_quit";

    /* renamed from: aa */
    public static final String f3757aa = "NUMBER_KEYBOARD";

    /* renamed from: ab */
    public static final String f3758ab = "ABC_KEYBOARD";

    /* renamed from: ac */
    public static final String f3759ac = "PAOPAO_CLICK";

    /* renamed from: ad */
    public static final String f3760ad = "OPEN_KEYBOARD";

    /* renamed from: ae */
    public static final String f3761ae = "ALTER_KEYBOARD";

    /* renamed from: af */
    public static final String f3762af = "MORE";

    /* renamed from: ag */
    public static final String f3763ag = "EMOJI_PANEL/";

    /* renamed from: ah */
    public static final String f3764ah = "LOGIN/";

    /* renamed from: ai */
    public static final String f3765ai = "3P_LOGIN/";

    /* renamed from: aj */
    public static final String f3766aj = "LOGIN/GOOGLE";

    /* renamed from: ak */
    public static final String f3767ak = "LOCAL_AUTH";

    /* renamed from: al */
    public static final String f3768al = "WEB_AUTH";

    /* renamed from: am */
    public static final String f3769am = "ADD_ACCOUNT";

    /* renamed from: an */
    public static final String f3770an = "EMAIL_LOGIN";

    /* renamed from: ao */
    public static final String f3771ao = "FIND_PWD";

    /* renamed from: ap */
    public static final String f3772ap = "PWD_INVALID";

    /* renamed from: aq */
    public static final String f3773aq = "CLICK_EMAIL_BTN";

    /* renamed from: ar */
    public static final String f3774ar = "ENTER_SHOW_CLOUD_PAGE";

    /* renamed from: as */
    public static final String f3775as = "CLICK_SHOW_CLOUD_LOGIN_BTN";

    /* renamed from: at */
    public static final String f3776at = "ACTIVE_GUIDE/";

    /* renamed from: au */
    public static final String f3777au = "ACTIVE_GUIDE/NEW_USER/";

    /* renamed from: av */
    public static final String f3778av = "ACTIVE_GUIDE/OLD_USER/";

    /* renamed from: aw */
    public static final String f3779aw = "STEP_";

    /* renamed from: ax */
    public static final String f3780ax = "INSTALLED_IME_PACKAGES_INFO/";

    /* renamed from: ay */
    public static final String f3781ay = "INSTALLED_IME_PACKAGES_INFO/INSTALLED_IME_PACKAGES/";

    /* renamed from: az */
    public static final String f3782az = "INSTALLED_IME_PACKAGES_INFO/LAST_DEFAULT_IME_PACKAGE_NAME/";

    /* renamed from: b */
    public static final String f3783b = "/UI/";

    /* renamed from: bA */
    public static final String f3784bA = "NETWORK_COLLECT";

    /* renamed from: bB */
    public static final String f3785bB = "JS_DOWNLOAD/";

    /* renamed from: bC */
    public static final String f3786bC = "NATIVE_ADS/";

    /* renamed from: bD */
    public static final String f3787bD = "REFERRER/";

    /* renamed from: bE */
    public static final String f3788bE = "RATE_US/";

    /* renamed from: bF */
    public static final String f3789bF = "OEM_SKIN_SKIN_UPDATE";

    /* renamed from: bG */
    public static final String f3790bG = "PREF_ITEM";

    /* renamed from: bH */
    public static final String f3791bH = "PAGE/";

    /* renamed from: bI */
    public static final String f3792bI = "SHARE_BUTTON";

    /* renamed from: bJ */
    public static final String f3793bJ = "LATER_BUTTON";

    /* renamed from: bK */
    public static final String f3794bK = "RATE_BUTTON/";

    /* renamed from: bL */
    public static final String f3795bL = "ACTION_FLOW/";

    /* renamed from: bM */
    public static final String f3796bM = "STATES/";

    /* renamed from: bN */
    public static final String f3797bN = "JOIN_BETA/";

    /* renamed from: bO */
    public static final String f3798bO = "DICT_RECOVERY/";

    /* renamed from: bP */
    public static final String f3799bP = "JAVA_CRASH";

    /* renamed from: bQ */
    public static final String f3800bQ = "NATIVE_CRASH_WHEN_DICT_INIT";

    /* renamed from: bR */
    public static final String f3801bR = "NATIVE_CRASH_NOISE_UPGRADE_PKG";

    /* renamed from: bS */
    public static final String f3802bS = "JAVA_CRASH_WHEN_KEYBOARD_SHOWN";

    /* renamed from: bT */
    public static final String f3803bT = "NATIVE_CRASH_WHEN_KEYBOARD_SHOWN";

    /* renamed from: bU */
    public static final String f3804bU = "DICT_ERROR_ON_DICT_INIT_FAILED";

    /* renamed from: bV */
    public static final String f3805bV = "DICT_ERROR_ON_NATIVE_CRASH";

    /* renamed from: bW */
    public static final String f3806bW = "DICT_ERROR_ON_DAILY_CHECK";

    /* renamed from: bX */
    public static final String f3807bX = "DICT_ERROR_ON_CLOUD_SYNC_RESTORE";

    /* renamed from: bY */
    public static final String f3808bY = "USER_DICT_REBUILD";

    /* renamed from: bZ */
    public static final String f3809bZ = "USER_DICT_REPORT";

    /* renamed from: ba */
    public static final String f3810ba = "edit_key_back";
    @Deprecated

    /* renamed from: bb */
    public static final String f3811bb = "edit_clipboard_quit";

    /* renamed from: bc */
    public static final String f3812bc = "clipboard_launch";

    /* renamed from: bd */
    public static final String f3813bd = "clipboard_key_back";

    /* renamed from: be */
    public static final String f3814be = "clipboard_system_back";

    /* renamed from: bf */
    public static final String f3815bf = "other";

    /* renamed from: bg */
    public static final String f3816bg = "home";

    /* renamed from: bh */
    public static final String f3817bh = "end";

    /* renamed from: bi */
    public static final String f3818bi = "space";

    /* renamed from: bj */
    public static final String f3819bj = "clipboard_menu_click";

    /* renamed from: bk */
    public static final String f3820bk = "clipboard_menu_longclick";

    /* renamed from: bl */
    public static final String f3821bl = "clipboard_paste";

    /* renamed from: bm */
    public static final String f3822bm = "clipboard_lock";

    /* renamed from: bn */
    public static final String f3823bn = "clipboard_unlock";

    /* renamed from: bo */
    public static final String f3824bo = "clipboard_remove";

    /* renamed from: bp */
    public static final String f3825bp = "clipboard_remove_ok";

    /* renamed from: bq */
    public static final String f3826bq = "clipboard_remove_cancel";

    /* renamed from: br */
    public static final String f3827br = "clipboard_full";

    /* renamed from: bs */
    public static final String f3828bs = "clipboard_not_full";

    /* renamed from: bt */
    public static final String f3829bt = "IAB/";

    /* renamed from: bu */
    public static final String f3830bu = "LOAD_CHANNEL/";

    /* renamed from: bv */
    public static final String f3831bv = "PURCHASE/";

    /* renamed from: bw */
    public static final String f3832bw = "UPDATE";

    /* renamed from: bx */
    public static final String f3833bx = "DIALOG/";

    /* renamed from: by */
    public static final String f3834by = "CREATE_ORDER/";

    /* renamed from: bz */
    public static final String f3835bz = "PERF_COLLECT";

    /* renamed from: c */
    public static final String f3836c = "/STATISTIC/";

    /* renamed from: cA */
    public static final String f3837cA = "SHARE_ITEM_CLICKED";

    /* renamed from: cB */
    public static final String f3838cB = "SHARE_IN_OPTIONS_CLICKED";

    /* renamed from: cC */
    public static final String f3839cC = "/UI/DRAWER/";

    /* renamed from: cD */
    public static final String f3840cD = "DRAWER_OPENED";

    /* renamed from: cE */
    public static final String f3841cE = "DRAWER_START_PIN_MODE";

    /* renamed from: cF */
    public static final String f3842cF = "/UI/SKIN_PAGE/";

    /* renamed from: cG */
    public static final String f3843cG = "SKIN_PAGE_TAB_SELECTED";

    /* renamed from: cH */
    public static final String f3844cH = "SKIN_PAGE_TAB_CLICKED";

    /* renamed from: cI */
    public static final String f3845cI = "SKIN_PAGE_UPDATE";

    /* renamed from: cJ */
    public static final String f3846cJ = "SKIN_PAGE_SHARE_WITH_DIALOG";

    /* renamed from: cK */
    public static final String f3847cK = "SKIN_PAGE_SHARE_AFTER_ENABLED";

    /* renamed from: cL */
    public static final String f3848cL = "SKIN_PAGE_EDIT_SKIN";

    /* renamed from: cM */
    public static final String f3849cM = "SKIN_PAGE_REMOVE_SKIN";

    /* renamed from: cN */
    public static final String f3850cN = "SKIN_PAGE_TO_SHOP";

    /* renamed from: cO */
    public static final String f3851cO = "SKIN_PAGE_TO_CUSTOMISE";

    /* renamed from: cP */
    public static final String f3852cP = "SKIN_PAGE_LOAD_FAILED";

    /* renamed from: cQ */
    public static final String f3853cQ = "SKIN_PAGE_DOWNLOAD_SKIN";

    /* renamed from: cR */
    public static final String f3854cR = "local_skin_tab";

    /* renamed from: cS */
    public static final String f3855cS = "pop_skin_tab";

    /* renamed from: cT */
    public static final String f3856cT = "enabled_skin_shared";

    /* renamed from: cU */
    public static final String f3857cU = "enabled_custom_skin_shared";

    /* renamed from: cV */
    public static final String f3858cV = "disabled_skin_shared";

    /* renamed from: cW */
    public static final String f3859cW = "disabled_custom_skin_shared";

    /* renamed from: cX */
    public static final String f3860cX = "skin_removed";

    /* renamed from: cY */
    public static final String f3861cY = "custom_skin_removed";

    /* renamed from: cZ */
    public static final String f3862cZ = "ENTER_GUESS_EMOJI";

    /* renamed from: ca */
    public static final String f3863ca = "FILE_DOWNLOAD";

    /* renamed from: cb */
    public static final String f3864cb = "USERINPUT";

    /* renamed from: cc */
    public static final String f3865cc = "RECORD_USER_PATTERN";

    /* renamed from: cd */
    public static final String f3866cd = "SHOW_CANDIDATE_ON_STARTINPUT";

    /* renamed from: ce */
    public static final String f3867ce = "/COMMERCIAL/VIP_PURCHASE/";

    /* renamed from: cf */
    public static final String f3868cf = "/COMMERCIAL/VIP_RENEW/";

    /* renamed from: cg */
    public static final String f3869cg = "/COMMERCIAL/VIP_ACCOUNT/";

    /* renamed from: ch */
    public static final String f3870ch = "STATISTIC_PROMPT/";

    /* renamed from: ci */
    public static final String f3871ci = "STATISTIC_PAGE/";

    /* renamed from: cj */
    public static final String f3872cj = "STATISTIC_BUTTON/";

    /* renamed from: ck */
    public static final String f3873ck = "STATISTIC_BACK";

    /* renamed from: cl */
    public static final String f3874cl = "STATISTIC_SHARE";

    /* renamed from: cm */
    public static final String f3875cm = "INFO_CANCEL/";

    /* renamed from: cn */
    public static final String f3876cn = "INFO_CANCEL_START";

    /* renamed from: co */
    public static final String f3877co = "INFO_CANCEL_CONFIRM1";

    /* renamed from: cp */
    public static final String f3878cp = "INFO_CANCEL_CONFIRM2";

    /* renamed from: cq */
    public static final String f3879cq = "INFO_CANCEL_SUCCEED";

    /* renamed from: cr */
    public static final String f3880cr = "SUBSCRIBE/";

    /* renamed from: cs */
    public static final String f3881cs = "SUBSCRIBE_CLICK";

    /* renamed from: ct */
    public static final String f3882ct = "SUBSCRIBE_SUCCEED";

    /* renamed from: cu */
    public static final String f3883cu = "TRY_FEATURE";

    /* renamed from: cv */
    public static final String f3884cv = "ACCOUNT_TYPE";

    /* renamed from: cw */
    public static final String f3885cw = "DRAWER_PLUGIN_CLICKED";

    /* renamed from: cx */
    public static final String f3886cx = "FUNC_PLUGIN_CLICKED";

    /* renamed from: cy */
    public static final String f3887cy = "PLUGIN_PINNED";

    /* renamed from: cz */
    public static final String f3888cz = "SHARE/";

    /* renamed from: d */
    public static final String f3889d = "/PRODUCTS/";

    /* renamed from: dA */
    public static final String f3890dA = "yahoo_search_enter_from_candidate";

    /* renamed from: dB */
    public static final String f3891dB = "SHOW_SPONSOR_THEME_ADS";

    /* renamed from: dC */
    public static final String f3892dC = "show_sponsor_theme_ads_notification";

    /* renamed from: dD */
    public static final String f3893dD = "show_sponsor_theme_ads_notification";

    /* renamed from: dE */
    private static final String f3894dE = "UserDataCollect";

    /* renamed from: dF */
    private static C1246d f3895dF = null;

    /* renamed from: dG */
    private static boolean f3896dG = false;

    /* renamed from: dK */
    private static final String f3897dK = "statistic_usage_config";

    /* renamed from: dL */
    private static final String f3898dL = "cloke_input_probability";

    /* renamed from: dM */
    private static final String f3899dM = "arctic_input_probability";

    /* renamed from: dN */
    private static final String f3900dN = "ime_pattern_probability";

    /* renamed from: dO */
    private static final String f3901dO = (C1593bR.m7162a().f5075a ? "international" : "mainland");

    /* renamed from: dP */
    private static final String f3902dP = ("usage_ime_" + f3901dO);

    /* renamed from: dQ */
    private static final String f3903dQ = ("ime_pattern_" + f3901dO);

    /* renamed from: dR */
    private static final String f3904dR = "app_crash";

    /* renamed from: dS */
    private static final String f3905dS = "ime_client_status";

    /* renamed from: dT */
    private static final String f3906dT = "path_noah_crash";

    /* renamed from: da */
    public static final String f3907da = "VISIBLE_STATUS/";

    /* renamed from: db */
    public static final String f3908db = "/COMMERCIAL//NATIVE_ADS";

    /* renamed from: dc */
    public static final String f3909dc = "NATIVE_ADS_SHOWN";

    /* renamed from: dd */
    public static final String f3910dd = "NATIVE_ADS_CLICKED";

    /* renamed from: de */
    public static final String f3911de = "NATIVE_ADS_INSTALLED";

    /* renamed from: df */
    public static final String f3912df = "NATIVE_ADS_ALREADY_INSTALLED";

    /* renamed from: dg */
    public static final String f3913dg = "NATIVE_ADS_LOADED";

    /* renamed from: dh */
    public static final String f3914dh = "FACEBOOK_ADS_LOADED";

    /* renamed from: di */
    public static final String f3915di = "DEFAULT_ADS_LOADED";

    /* renamed from: dj */
    public static final String f3916dj = "FACEBOOK_APP_INSTALLED";

    /* renamed from: dk */
    public static final String f3917dk = "SHOWN_ADS_CATEGORY";

    /* renamed from: dl */
    public static final String f3918dl = "ads_category_native";

    /* renamed from: dm */
    public static final String f3919dm = "ads_category_default";

    /* renamed from: dn */
    public static final String f3920dn = "ads_category_facebook";

    /* renamed from: do */
    public static final String f3921do = "no_ads_shown";

    /* renamed from: dp */
    public static final String f3922dp = "CURRENT_DEFAULT_IME";

    /* renamed from: dq */
    public static final String f3923dq = "/COMMERCIAL/YAHOO_SEARCH/";

    /* renamed from: dr */
    public static final String f3924dr = "YAHOO_SEARCH_LAUNCHED";

    /* renamed from: ds */
    public static final String f3925ds = "YAHOO_SEARCH_RESULT_REDIRECT";

    /* renamed from: dt */
    public static final String f3926dt = "YAHOO_SEARCH_OPEN_TRANSLATOR";

    /* renamed from: du */
    public static final String f3927du = "YAHOO_SEARCH_CLICK_TAB";

    /* renamed from: dv */
    public static final String f3928dv = "YAHOO_SEARCH_ENTER";

    /* renamed from: dw */
    public static final String f3929dw = "YAHOO_SEARCH_SHARE_RESULT";

    /* renamed from: dx */
    public static final String f3930dx = "yahoo_search_share_image_result";

    /* renamed from: dy */
    public static final String f3931dy = "yahoo_search_share_web_result";

    /* renamed from: dz */
    public static final String f3932dz = "yahoo_search_enter_from_funcbar";

    /* renamed from: e */
    public static final String f3933e = "/COMMERCIAL/";

    /* renamed from: f */
    public static final String f3934f = "/PERFORMANCE/";

    /* renamed from: g */
    public static final String f3935g = "/WEBPAGE/";

    /* renamed from: h */
    public static final String f3936h = "/PATTERN/";

    /* renamed from: i */
    public static final String f3937i = "/UNINSTALL_SURVERY/";

    /* renamed from: j */
    public static final String f3938j = "SHOW";

    /* renamed from: k */
    public static final String f3939k = "CLICK";

    /* renamed from: l */
    public static final String f3940l = "SEND";

    /* renamed from: m */
    public static final String f3941m = "CANCEL";

    /* renamed from: n */
    public static final String f3942n = "ENTER";

    /* renamed from: o */
    public static final String f3943o = "GOOGLE";

    /* renamed from: p */
    public static final String f3944p = "OPERATION";

    /* renamed from: q */
    public static final String f3945q = "START";

    /* renamed from: r */
    public static final String f3946r = "SUCCESS";

    /* renamed from: s */
    public static final String f3947s = "FAILED";

    /* renamed from: t */
    public static final String f3948t = "LOAD";

    /* renamed from: u */
    public static final String f3949u = "STAY";

    /* renamed from: v */
    public static final String f3950v = "BROWSE";

    /* renamed from: w */
    public static final String f3951w = "FINISH";

    /* renamed from: x */
    public static final String f3952x = "TIME";

    /* renamed from: y */
    public static final String f3953y = "REGISTER";

    /* renamed from: z */
    public static final String f3954z = "TRY";

    /* renamed from: dH */
    private double f3955dH = 0.1d;

    /* renamed from: dI */
    private double f3956dI = 0.05d;

    /* renamed from: dJ */
    private double f3957dJ = 1.0d;

    public C1246d(Context context) {
        f3896dG = context.getResources().getBoolean(R.bool.ENABLE_TOUCHPAL_USER_DATA_COLLECT);
        m6018i();
        m6020k();
    }

    /* renamed from: a */
    public static C1246d m6010a(Context context) {
        if (f3895dF == null) {
            f3895dF = new C1246d(context);
        }
        return f3895dF;
    }

    /* renamed from: a */
    public void mo4593a(String str, Map<String, Object> map, String str2) {
        if (m6016g()) {
            mo4592a(f3902dP, str2 + str, map);
        }
    }

    /* renamed from: a */
    public void mo4591a(String str, String str2, String str3) {
        if (m6016g()) {
            mo4599c(f3902dP, str3 + str, str2);
        }
    }

    /* renamed from: a */
    public void mo4594a(String str, boolean z, String str2) {
        mo4591a(str, z ? "TRUE" : "FALSE", str2);
    }

    /* renamed from: a */
    public void mo4588a(String str, int i, String str2) {
        mo4591a(str, String.valueOf(i), str2);
    }

    /* renamed from: a */
    public void mo4589a(String str, long j, String str2) {
        mo4591a(str, String.valueOf(j), str2);
    }

    /* renamed from: b */
    public void mo4597b(String str, String str2, String str3) {
        if (m6016g()) {
            mo4599c(f3905dS, str3 + str, str2);
        }
    }

    /* renamed from: a */
    public void mo4590a(String str, String str2) {
        if (m6016g()) {
            HashMap hashMap = new HashMap();
            hashMap.put("manufacturer", Build.MANUFACTURER);
            hashMap.put("device", Build.MODEL);
            hashMap.put("os_name", "Android");
            hashMap.put("os_version", Build.VERSION.RELEASE);
            hashMap.put("abstract", str);
            hashMap.put("detail", str2);
            mo4592a(f3904dR, f3906dT, (Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    public void mo4595a(Map<String, Object> map) {
        if (m6016g() && m6017h()) {
            mo4592a(f3903dQ, f3936h, map);
        }
    }

    /* renamed from: e */
    private void m6014e() {
        Okinawa h = C1368X.m6320c().mo5835h();
        int statisticDataCount = h.getStatisticDataCount();
        for (int i = 0; i < statisticDataCount; i++) {
            String statisticDataPath = h.getStatisticDataPath(i);
            String statisticDataValue = h.getStatisticDataValue(statisticDataPath);
            if (!TextUtils.isEmpty(statisticDataPath) && !TextUtils.isEmpty(statisticDataValue)) {
                mo4599c(f3902dP, f3836c + statisticDataPath, statisticDataValue);
            }
        }
    }

    /* renamed from: a */
    public void mo4587a() {
        if (f3896dG && Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE)) {
            m6014e();
            mo4600d();
            m6015f();
        }
    }

    /* renamed from: f */
    private void m6015f() {
        C2305z zVar = new C2305z();
        zVar.f10165a = f3897dK;
        new C2373x(zVar).mo8060a((C2373x.C2376b) new C1247e(this));
    }

    /* renamed from: g */
    private boolean m6016g() {
        if (!Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE) || !f3896dG) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public double mo4596b() {
        return this.f3955dH;
    }

    /* renamed from: c */
    public double mo4598c() {
        return this.f3956dI;
    }

    /* renamed from: h */
    private boolean m6017h() {
        return Math.random() < this.f3957dJ;
    }

    /* renamed from: i */
    private void m6018i() {
        String stringSetting = Settings.getInstance().getStringSetting(Settings.STATISTIC_USAGE_CONFIG);
        if (!TextUtils.isEmpty(stringSetting)) {
            try {
                JSONObject jSONObject = new JSONObject(stringSetting);
                this.f3955dH = jSONObject.optDouble(f3898dL, this.f3955dH);
                this.f3956dI = jSONObject.optDouble(f3899dM, this.f3956dI);
                this.f3957dJ = jSONObject.optDouble(f3900dN, this.f3957dJ);
            } catch (JSONException e) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m6019j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f3898dL, this.f3955dH);
            jSONObject.put(f3899dM, this.f3956dI);
            jSONObject.put(f3900dN, this.f3957dJ);
            Settings.getInstance().setStringSetting(Settings.STATISTIC_USAGE_CONFIG, jSONObject.toString());
        } catch (JSONException e) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6013a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f3955dH = jSONObject.optDouble(f3898dL, this.f3955dH);
            this.f3956dI = jSONObject.optDouble(f3899dM, this.f3956dI);
            this.f3957dJ = jSONObject.optDouble(f3900dN, this.f3957dJ);
        }
    }

    /* renamed from: k */
    private void m6020k() {
        try {
            UsageRecorder.initialize(new C1245c());
        } catch (IllegalArgumentException e) {
        }
    }

    /* renamed from: c */
    public void mo4599c(String str, String str2, String str3) {
        try {
            UsageRecorder.record(str, str2, str3);
        } catch (IllegalArgumentException | IllegalStateException e) {
        }
    }

    /* renamed from: a */
    public void mo4592a(String str, String str2, Map<String, Object> map) {
        try {
            UsageRecorder.record(str, str2, (Map) map);
        } catch (IllegalArgumentException | IllegalStateException e) {
        }
    }

    /* renamed from: d */
    public void mo4600d() {
        try {
            UsageRecorder.send();
        } catch (IllegalStateException e) {
        }
    }
}
