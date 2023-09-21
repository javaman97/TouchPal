package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.teaching.p065a.C2559a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.p */
/* compiled from: TeachingTipHandwrite */
public class C2596p extends C2557a {

    /* renamed from: b */
    private Handler f11124b = new Handler();

    /* renamed from: c */
    private final int f11125c = 10;

    /* renamed from: d */
    private boolean f11126d = false;

    public C2596p(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8399e() {
        return true;
    }

    /* renamed from: s */
    public void mo8355s() {
        super.mo8355s();
        if (!Settings.getInstance().getBoolSetting(48)) {
            C2559a.m11436c(true);
            this.f11126d = true;
        }
    }

    /* renamed from: t */
    public void mo8406t() {
        super.mo8406t();
        if (this.f11126d) {
            this.f11126d = false;
            C2559a.m11436c(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo8345r() {
        return C1549b.f4831b;
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return new C2597q(this);
    }

    /* renamed from: f */
    public String mo8340f() {
        return mo8392a((int) R.string.mission_handwrite_content);
    }

    /* renamed from: g */
    public String mo8341g() {
        return mo8392a((int) R.string.mission_handwrite_content_highlight);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        super.mo8342h();
        this.f11124b.postDelayed(new C2598r(this), 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m11533x() {
        TextView a = mo8390a(this.f10967a, (int) R.string.wizard_tips_pinying_handwrite_mix);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        a.setLayoutParams(layoutParams);
        Rect y = m11534y();
        View a2 = C2559a.m11420a(this.f10967a, y);
        Animation a3 = C2559a.m11422a(this.f10967a, (Runnable) new C2599s(this, a));
        a2.setAnimation(a3);
        mo8395a(y.left, y.top, y.right, y.bottom);
        mo8396a((View) a);
        mo8396a(a2);
        a2.startAnimation(a3);
    }

    /* renamed from: y */
    private Rect m11534y() {
        Rect rect = new Rect();
        if (Engine.getInstance().getWidgetManager().mo9650h() != null) {
            Rect handwriteRect = Engine.getInstance().getWidgetManager().mo9650h().getHandwriteRect();
            rect.set(handwriteRect.left, handwriteRect.top, handwriteRect.right, handwriteRect.bottom);
        }
        return rect;
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_handwrite;
    }

    /* renamed from: u */
    public boolean mo8346u() {
        if (C1368X.m6324d()) {
            C1389aD o = C1368X.m6320c().mo5842o();
            if (!o.mo5960o(C1549b.f4831b) || !o.mo5954l(C1549b.f4831b).mo6156f()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
