package com.cootek.smartinput5.p066ui;

import android.content.Context;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1389aD;

/* renamed from: com.cootek.smartinput5.ui.ak */
/* compiled from: FuncExtralPopupManager */
public class C2699ak implements CandidateManager.ICandidateListener {

    /* renamed from: a */
    public static float f12081a = 0.65f;

    /* renamed from: b */
    public static float f12082b = 0.5f;

    /* renamed from: c */
    public static float f12083c = 0.2f;

    /* renamed from: d */
    public static float f12084d = 0.2f;

    /* renamed from: e */
    public static float f12085e = 0.1f;

    /* renamed from: f */
    public static float f12086f = 0.125f;

    /* renamed from: g */
    public static float f12087g = 0.125f;

    /* renamed from: h */
    public static float f12088h = 0.08f;

    /* renamed from: i */
    public static float f12089i = 0.4f;

    /* renamed from: j */
    public static float f12090j = 0.4f;

    /* renamed from: k */
    public static int f12091k = 0;

    /* renamed from: l */
    public static int f12092l = 1;

    /* renamed from: m */
    private Context f12093m;

    /* renamed from: n */
    private C2752be f12094n = null;

    public C2699ak(Context context) {
        this.f12093m = context;
    }

    /* renamed from: a */
    public void mo8954a() {
        if (Engine.getInstance().getWidgetManager().mo9648g() != null) {
            Engine.getInstance().getCandidateManager().registerCandidateListener(this);
            if (C1389aD.m6470y(Engine.getInstance().getCurrentLanguageId())) {
                m12454d();
                m12455e();
            }
        }
    }

    /* renamed from: d */
    private void m12454d() {
        if (this.f12094n == null) {
            this.f12094n = new C2752be(this.f12093m);
        }
        if (this.f12094n != null) {
            this.f12094n.mo9026a();
        }
    }

    /* renamed from: e */
    private void m12455e() {
        if (Engine.isInitialized()) {
            mo8955a(Engine.getInstance().getWidgetManager().mo9648g());
        }
    }

    /* renamed from: a */
    public void mo8955a(SoftKeyboardView softKeyboardView) {
        if (this.f12094n != null && softKeyboardView != null) {
            this.f12094n.mo9027a(softKeyboardView, 83);
        }
    }

    /* renamed from: b */
    public void mo8956b() {
        if (this.f12094n != null && this.f12094n.isShowing()) {
            this.f12094n.dismiss();
        }
    }

    /* renamed from: c */
    public boolean mo8957c() {
        if (this.f12094n == null || !this.f12094n.isShowing()) {
            return false;
        }
        return true;
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        if (Engine.isInitialized() && mo8957c()) {
            Engine.getInstance().getWidgetManager().mo9650h().mo8542g();
        }
    }
}
