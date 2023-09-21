package com.cootek.smartinput5.teaching.p065a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2618H;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.teaching.C2531C;
import com.cootek.smartinput5.teaching.C2540L;
import com.cootek.smartinput5.teaching.C2544P;
import com.cootek.smartinput5.teaching.C2553W;
import com.cootek.smartinput5.teaching.C2557a;
import com.cootek.smartinput5.teaching.C2584d;
import com.cootek.smartinput5.teaching.C2596p;
import com.cootek.smartinput5.teaching.C2600t;
import com.cootek.smartinput5.teaching.C2604x;
import com.emoji.keyboard.touchpal.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.teaching.a.f */
/* compiled from: TeachingMissionManager */
public class C2564f {

    /* renamed from: a */
    public static final String f11021a = C1135d.mission_del_slide_left.toString();
    @Deprecated

    /* renamed from: b */
    public static final String f11022b = "mission_prediction";

    /* renamed from: c */
    public static final String f11023c = C1135d.mission_curve.toString();
    @Deprecated

    /* renamed from: d */
    public static final String f11024d = "mission_smiley";

    /* renamed from: e */
    public static final String f11025e = C1135d.mission_symbol_gesture.toString();

    /* renamed from: f */
    public static final String f11026f = C1135d.mission_stroke_filter.toString();
    @Deprecated

    /* renamed from: g */
    public static final String f11027g = "mission_handwrite";
    @Deprecated

    /* renamed from: h */
    public static final String f11028h = "mission_switch_language";

    /* renamed from: i */
    public static final int f11029i = 0;

    /* renamed from: j */
    public static final int f11030j = 1;

    /* renamed from: k */
    public static final int f11031k = 2;

    /* renamed from: l */
    private static final int f11032l = 200;

    /* renamed from: m */
    private static final int f11033m = 10;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static Handler f11034p;

    /* renamed from: u */
    private static int f11035u = 0;

    /* renamed from: n */
    private Context f11036n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2557a f11037o = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f11038q;

    /* renamed from: r */
    private WeakReference<Activity> f11039r;

    /* renamed from: s */
    private C2618H f11040s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ArrayList<C2557a> f11041t;

    /* renamed from: v */
    private boolean f11042v = false;

    /* renamed from: g */
    static /* synthetic */ int m11477g(C2564f fVar) {
        int i = fVar.f11038q;
        fVar.f11038q = i + 1;
        return i;
    }

    public C2564f(Context context) {
        this.f11036n = context;
        f11034p = new Handler();
        this.f11041t = new ArrayList<>();
    }

    /* renamed from: a */
    private boolean m11468a(String str, String str2) {
        return TextUtils.equals(str, str2);
    }

    /* renamed from: a */
    public C2557a mo8419a(String str) {
        boolean a = C1132b.m5662a();
        if (m11468a(str, f11021a)) {
            if (!a || C1132b.m5654a(this.f11036n).mo4406b(C1135d.mission_del_slide_left.toString()).booleanValue()) {
                return new C2553W(this.f11036n, str);
            }
            return null;
        } else if (m11468a(str, f11022b)) {
            return new C2600t(this.f11036n, str);
        } else {
            if (m11468a(str, f11023c)) {
                if (!a || C1132b.m5654a(this.f11036n).mo4406b(C1135d.mission_curve.toString()).booleanValue()) {
                    return new C2584d(this.f11036n, str);
                }
                return null;
            } else if (m11468a(str, f11024d)) {
                return new C2604x(this.f11036n, str);
            } else {
                if (m11468a(str, f11025e)) {
                    if (!a || C1132b.m5654a(this.f11036n).mo4406b(C1135d.mission_symbol_gesture.toString()).booleanValue()) {
                        return new C2544P(this.f11036n, str);
                    }
                    return null;
                } else if (m11468a(str, f11026f)) {
                    if (!a || C1132b.m5654a(this.f11036n).mo4406b(C1135d.mission_stroke_filter.toString()).booleanValue()) {
                        return new C2531C(this.f11036n, str);
                    }
                    return null;
                } else if (m11468a(str, f11027g)) {
                    return new C2596p(this.f11036n, str);
                } else {
                    if (m11468a(str, f11028h)) {
                        return new C2540L(this.f11036n, str);
                    }
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo8420a(String str, C2557a.C2558a aVar, Activity activity) {
        this.f11042v = false;
        this.f11039r = new WeakReference<>(activity);
        if (this.f11037o != null) {
            this.f11037o.mo8402m();
        }
        this.f11037o = mo8419a(str);
        if (this.f11037o != null) {
            this.f11037o.mo8397a(aVar);
        }
        m11480i();
        if (this.f11037o != null) {
            m11479h();
        } else {
            mo8421a(false);
        }
    }

    /* renamed from: a */
    public boolean mo8422a() {
        return this.f11037o != null;
    }

    /* renamed from: b */
    public void mo8423b() {
        if (this.f11040s != null) {
            this.f11040s.mo8576b();
            this.f11040s = null;
        }
    }

    /* renamed from: a */
    public void mo8421a(boolean z) {
        if (!z || f11035u != 2) {
            m11476f();
        } else {
            m11478g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m11476f() {
        Activity activity;
        mo8423b();
        if (this.f11037o != null) {
            this.f11037o.mo8406t();
            this.f11037o.mo8402m();
            this.f11037o = null;
        }
        Iterator<C2557a> it = this.f11041t.iterator();
        while (it.hasNext()) {
            it.next().mo8402m();
        }
        this.f11041t.clear();
        if (!(this.f11039r == null || (activity = (Activity) this.f11039r.get()) == null)) {
            activity.finish();
        }
        m11466a(0);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
    }

    /* renamed from: g */
    private void m11478g() {
        C2618H h = new C2618H(this.f11036n);
        h.mo8580b(C1974m.m9063a(this.f11036n, (int) R.string.mission_exit_confirm_message));
        h.mo8574a(C1974m.m9063a(this.f11036n, (int) R.string.mission_exit_yes), (View.OnClickListener) new C2565g(this));
        h.mo8581b(C1974m.m9063a(this.f11036n, (int) R.string.mission_exit_no), (View.OnClickListener) null);
        this.f11040s = h;
        h.mo8567a();
    }

    /* renamed from: h */
    private void m11479h() {
        this.f11038q = 0;
        f11034p.postDelayed(new C2566h(this), 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m11480i() {
        if (!this.f11042v && this.f11037o != null && Engine.isInitialized()) {
            this.f11042v = true;
            this.f11037o.mo8355s();
        }
        ((InputMethodManager) this.f11036n.getSystemService("input_method")).toggleSoftInput(2, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m11481j() {
        try {
            if (!Engine.isInitialized()) {
                return false;
            }
            SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
            if (g.getWindowToken() == null || !g.isShown()) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m11466a(int i) {
        f11035u = i;
    }

    /* renamed from: c */
    public static boolean m11470c() {
        return f11035u != 0;
    }

    /* renamed from: d */
    public C2557a mo8424d() {
        return this.f11037o;
    }
}
