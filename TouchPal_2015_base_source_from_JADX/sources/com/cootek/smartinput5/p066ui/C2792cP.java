package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1574bA;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.emoji.keyboard.touchpal.R;
import com.google.android.gms.games.GamesClient;
import com.p023a.p024a.p032b.p037d.C0781a;

/* renamed from: com.cootek.smartinput5.ui.cP */
/* compiled from: TypingSpeedBar */
public class C2792cP implements C1574bA.C1575a, C2826E.C2827a {

    /* renamed from: a */
    private static final String f12403a = "TypingSpeedBar";

    /* renamed from: b */
    private Context f12404b;

    /* renamed from: c */
    private PopupWindow f12405c;

    /* renamed from: d */
    private FrameLayout f12406d;

    /* renamed from: e */
    private ClipDrawable f12407e;

    /* renamed from: f */
    private C2826E f12408f;

    /* renamed from: g */
    private boolean f12409g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f12410h;

    /* renamed from: i */
    private Runnable f12411i;

    public C2792cP(Context context) {
        this.f12404b = context;
    }

    /* renamed from: e */
    private void m12710e() {
        this.f12410h = new Handler();
        this.f12411i = new C2793cQ(this);
        this.f12405c = new PopupWindow(this.f12404b);
        this.f12405c.setBackgroundDrawable(new ColorDrawable(0));
        this.f12405c.setTouchable(false);
        this.f12406d = (FrameLayout) ((LayoutInflater) this.f12404b.getSystemService("layout_inflater")).inflate(R.layout.typing_speed_bar, (ViewGroup) null);
        this.f12407e = (ClipDrawable) C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.progress_speed_ctrl);
        this.f12406d.setForeground(this.f12407e);
        this.f12406d.setForegroundGravity(87);
        this.f12405c.setContentView(this.f12406d);
        this.f12408f = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f12409g = true;
    }

    /* renamed from: a */
    public void mo9119a() {
        if (Settings.getInstance().getBoolSetting(84)) {
            if (!this.f12409g) {
                m12710e();
            }
            this.f12410h.postDelayed(this.f12411i, 50);
        }
    }

    /* renamed from: b */
    public void mo9120b() {
        if (this.f12409g) {
            this.f12410h.removeCallbacks(this.f12411i);
            try {
                this.f12405c.dismiss();
            } catch (Exception e) {
            }
            this.f12406d.removeAllViews();
            this.f12407e.setLevel(0);
            C1368X.m6320c().mo5822H().mo6206h();
            C1368X.m6320c().mo5822H().mo6197a();
            this.f12408f.mo9242b((C2826E.C2827a) this);
        }
    }

    /* renamed from: a */
    public void mo6207a(int i) {
        if (i < 10) {
            this.f12407e.setLevel((i * GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE) / 10);
        } else if (i < 20) {
            this.f12407e.setLevel((((i - 10) * 2000) / 10) + GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
        } else if (i < 40) {
            this.f12407e.setLevel((((i - 20) * GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE) / 20) + C0781a.f1973a);
        } else {
            this.f12407e.setLevel((((i - 40) * 2000) / 20) + 8000);
        }
    }

    /* renamed from: c */
    public void mo8538c() {
    }

    /* renamed from: p_ */
    public void mo8556p_() {
        m12711f();
    }

    /* renamed from: f */
    private void m12711f() {
        if (this.f12405c.isShowing()) {
            int l = this.f12408f.mo9254l();
            int[] iArr = new int[2];
            Engine.getInstance().getWidgetManager().mo9651i().mo9716b().getLocationInWindow(iArr);
            this.f12405c.update(l, iArr[1], -1, -1, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m12712g() {
        View b = Engine.getInstance().getWidgetManager().mo9651i().mo9716b();
        if (b != null) {
            int[] iArr = new int[2];
            b.getLocationInWindow(iArr);
            this.f12405c.setWidth(b.getWidth());
            this.f12405c.setHeight(b.getHeight());
            try {
                this.f12405c.showAtLocation(b, 0, iArr[0] + this.f12408f.mo9254l(), iArr[1]);
            } catch (RuntimeException e) {
            }
            C1368X.m6320c().mo5822H().mo6198a((C1574bA.C1575a) this);
            this.f12408f.mo9238a((C2826E.C2827a) this);
        }
    }
}
