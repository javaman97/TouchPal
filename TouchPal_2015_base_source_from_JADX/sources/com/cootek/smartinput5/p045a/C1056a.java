package com.cootek.smartinput5.p045a;

import android.content.Context;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1358O;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.a.a */
/* compiled from: ActionFlowCollector */
public class C1056a {

    /* renamed from: A */
    public static final String f2940A = "PREMIUM_LOGIN";

    /* renamed from: B */
    public static final String f2941B = "SETTING_IMPORT_CONTACT";

    /* renamed from: C */
    public static final String f2942C = "SETTING_SMS_ONLY_IMPORT_OUTGOING";

    /* renamed from: D */
    public static final String f2943D = "SETTING_SMS_ONLY_IMPORT_OUTGOING";

    /* renamed from: E */
    public static final String f2944E = "SETTING_LEARN_TWITTER";

    /* renamed from: F */
    public static final String f2945F = "SETTING_USERWORD_BACKUP";

    /* renamed from: G */
    public static final String f2946G = "SETTING_USERWORD_RESTORE";

    /* renamed from: H */
    public static final String f2947H = "SETTING_CLEAR_USERWORD";

    /* renamed from: I */
    public static final String f2948I = "SETTING_LOCALE_LANGUAGE_SHOW";

    /* renamed from: J */
    public static final String f2949J = "SETTING_LOCALE_LANGUAGE_DOWNLOAD";

    /* renamed from: K */
    public static final String f2950K = "SETTING_LOCALE_LANGUAGE_DOWNLOAD";

    /* renamed from: L */
    public static final String f2951L = "SETTING_ACTIVATE_TOUCHPAL_NOTIFI_SHOW";

    /* renamed from: M */
    public static final String f2952M = "SETTING_ACTIVATE_TOUCHPAL_NOTIFI_CLICK";

    /* renamed from: N */
    public static final String f2953N = "SETTING_EXTRACT_START";

    /* renamed from: O */
    public static final String f2954O = "SETTING_EXTRACT_END";

    /* renamed from: P */
    public static final String f2955P = "KEYBOARD_EMOJI_WORK_FINE_CLICK";

    /* renamed from: Q */
    public static final String f2956Q = "KEYBOARD_EMOJI_WORK_WRONG_CLICK";

    /* renamed from: R */
    public static final String f2957R = "KEYBOARD_EMOJI_OPEN_CLICK";

    /* renamed from: S */
    public static final String f2958S = "KEYBOARD_EMOJI_OPEN_END";

    /* renamed from: T */
    public static final String f2959T = "LANGUAGE_AUTO_UPDATE";

    /* renamed from: U */
    public static final String f2960U = "SETTING_JAVA_CRASH";

    /* renamed from: V */
    public static final String f2961V = "SETTING_NATIVE_CRASH";

    /* renamed from: W */
    public static final String f2962W = "SETTING_PKG_DOWNLOADED_";

    /* renamed from: X */
    public static final String f2963X = "KEYBOARD_HIDDEN_END";

    /* renamed from: Y */
    public static final String f2964Y = "KEYBOARD_HIDDEN_START";

    /* renamed from: Z */
    public static final String f2965Z = "SETTING_SWITCH_LANGUAGE_";

    /* renamed from: a */
    public static final String f2966a = "settings";

    /* renamed from: aa */
    public static final String f2967aa = "SETTING_PLUGIN_";

    /* renamed from: ab */
    private static final String f2968ab = "ActionFlowCollector";

    /* renamed from: ac */
    private static final int f2969ac = 100;

    /* renamed from: ad */
    private static C1056a f2970ad = null;

    /* renamed from: b */
    public static final String f2971b = "actions_head";

    /* renamed from: c */
    public static final String f2972c = "actions_tail";

    /* renamed from: d */
    public static final String f2973d = "states";

    /* renamed from: e */
    public static final String[] f2974e = {C1358O.f4211v, C1358O.f4212w, "settings", "states"};

    /* renamed from: f */
    public static final String f2975f = "SETTING_ENABLE_TOUCHPAL";

    /* renamed from: g */
    public static final String f2976g = "SETTING_SELECT_TOUCHPAL";

    /* renamed from: h */
    public static final String f2977h = "KEYBOARD_SHOW_START";

    /* renamed from: i */
    public static final String f2978i = "KEYBOARD_SHOW_END";

    /* renamed from: j */
    public static final String f2979j = "KEYBOARD_STARTINPUT";

    /* renamed from: k */
    public static final String f2980k = "KEYBOARD_LOGO";

    /* renamed from: l */
    public static final String f2981l = "LANGUAGE_ENTER_LANGUAGE_LIST";

    /* renamed from: m */
    public static final String f2982m = "LANGUAGE_DOWNLOAD_";

    /* renamed from: n */
    public static final String f2983n = "KEYBOARD_SUBTYPE_";

    /* renamed from: o */
    public static final String f2984o = "KEYBOARD_LAYOUT_";

    /* renamed from: p */
    public static final String f2985p = "SKIN_POPULAR";

    /* renamed from: q */
    public static final String f2986q = "SKIN_LOCAL";

    /* renamed from: r */
    public static final String f2987r = "SKIN_LOCAL_CLICK";

    /* renamed from: s */
    public static final String f2988s = "SKIN_LOCAL_ENABLE";

    /* renamed from: t */
    public static final String f2989t = "SKIN_POPULAR_DOWNLOAD";

    /* renamed from: u */
    public static final String f2990u = "SKIN_STOER_DOWNLOAD";

    /* renamed from: v */
    public static final String f2991v = "LANGUAGE_STORE_DOWNLOAD";

    /* renamed from: w */
    public static final String f2992w = "LANGUAGE_SUBDIC_STORE_DOWNLOAD";

    /* renamed from: x */
    public static final String f2993x = "MORE_STORE_DOWNLOAD_EMOJI";

    /* renamed from: y */
    public static final String f2994y = "MORE_STORE_DOWNLOAD_APPS";

    /* renamed from: z */
    public static final String f2995z = "PREMIUM_FREE_TRIAL";

    /* renamed from: ae */
    private File f2996ae;

    /* renamed from: af */
    private File f2997af;

    /* renamed from: ag */
    private JSONArray f2998ag;

    /* renamed from: ah */
    private JSONArray f2999ah;

    /* renamed from: ai */
    private ArrayList<JSONObject> f3000ai;

    /* renamed from: aj */
    private boolean f3001aj = false;

    /* renamed from: ak */
    private boolean f3002ak = false;

    private C1056a() {
        File a = C1358O.m6234a(C1358O.f4204o);
        this.f2996ae = new File(a, C1358O.f4211v);
        this.f2997af = new File(a, C1358O.f4212w);
        try {
            if (!this.f2996ae.exists()) {
                this.f2996ae.createNewFile();
            }
            if (!this.f2997af.exists()) {
                this.f2997af.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String d = C0997e.m5192d(this.f2997af);
        String d2 = C0997e.m5192d(this.f2996ae);
        this.f3000ai = new ArrayList<>();
        if (d != null && d2 != null) {
            try {
                this.f2998ag = new JSONObject(d2).optJSONArray(f2971b);
                this.f2999ah = new JSONObject(d).optJSONArray(f2972c);
                if (this.f2998ag == null) {
                    this.f2998ag = new JSONArray();
                }
                if (this.f2999ah == null) {
                    this.f2999ah = new JSONArray();
                }
                for (int i = 0; i < this.f2999ah.length(); i++) {
                    this.f3000ai.add(this.f2999ah.getJSONObject(i));
                }
                Collections.sort(this.f3000ai, new C1057b(this));
            } catch (JSONException e2) {
                this.f2998ag = new JSONArray();
                this.f2999ah = new JSONArray();
            }
        }
    }

    /* renamed from: a */
    public static C1056a m5588a() {
        if (f2970ad == null) {
            f2970ad = new C1056a();
        }
        return f2970ad;
    }

    /* renamed from: a */
    public void mo4264a(String str, Context context) {
        mo4265a(str, context, true);
    }

    /* renamed from: a */
    public void mo4265a(String str, Context context, boolean z) {
        if (context != null) {
            System.currentTimeMillis();
            JSONObject b = new C1063f(str, context).mo4278b();
            if (b == null) {
                return;
            }
            if (this.f2998ag != null && this.f2998ag.length() < 100) {
                this.f3001aj = true;
                this.f2998ag.put(b);
            } else if (this.f2999ah != null) {
                this.f3002ak = true;
                this.f2999ah.put(b);
                this.f3000ai.add(b);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo4266b() {
        JSONArray jSONArray;
        if (this.f3001aj) {
            try {
                FileWriter fileWriter = new FileWriter(this.f2996ae);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f2971b, this.f2998ag);
                fileWriter.append(jSONObject.toString());
                fileWriter.flush();
                fileWriter.close();
                this.f3001aj = false;
            } catch (IOException | JSONException e) {
            }
        }
        if (this.f3002ak) {
            if (this.f2999ah == null || this.f3000ai.size() > 100) {
                jSONArray = new JSONArray();
                for (int size = this.f3000ai.size() - 100; size < this.f3000ai.size(); size++) {
                    jSONArray.put(this.f3000ai.get(size));
                }
            } else {
                jSONArray = this.f2999ah;
            }
            try {
                FileWriter fileWriter2 = new FileWriter(this.f2997af);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(f2972c, jSONArray);
                fileWriter2.append(jSONObject2.toString());
                fileWriter2.flush();
                fileWriter2.close();
                this.f3002ak = false;
            } catch (IOException | JSONException e2) {
            }
        }
        if (this.f3001aj || this.f3002ak) {
            m5590d();
        }
        m5589c();
    }

    /* renamed from: c */
    private void m5589c() {
        new C1058c(this).run();
    }

    /* renamed from: d */
    private void m5590d() {
        f2970ad = null;
    }
}
