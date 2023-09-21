package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.teaching.p065a.C2559a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.d */
/* compiled from: TeachingTipCurve */
public class C2584d extends C2557a {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static String f11077n;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Path f11078b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Paint f11079c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View f11080d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f11081e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long[] f11082f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float[][] f11083g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f11084h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f11085i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f11086j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MoveContrail f11087k = new MoveContrail();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f11088l = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Runnable f11089m;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Runnable f11090o = new C2595o(this);

    /* renamed from: p */
    private Runnable f11091p = new C2587g(this);

    /* renamed from: j */
    static /* synthetic */ int m11512j(C2584d dVar) {
        int i = dVar.f11081e;
        dVar.f11081e = i + 1;
        return i;
    }

    public C2584d(Context context, String str) {
        super(context, str);
        f11077n = mo8341g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo8356q() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo8345r() {
        return C1549b.f4791a;
    }

    /* renamed from: s */
    public void mo8355s() {
        super.mo8355s();
        Settings.getInstance().setBoolSetting(53, false);
        Settings.getInstance().setBoolSetting(31, true);
        Settings.getInstance().setBoolSetting(Settings.CURVE_ENABLED_UI, true);
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return new C2585e(this);
    }

    /* renamed from: f */
    public String mo8340f() {
        return mo8392a((int) R.string.mission_use_curve);
    }

    /* renamed from: g */
    public String mo8341g() {
        return mo8392a((int) R.string.mission_everyone_loves);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        super.mo8342h();
        this.f11086j = false;
        m11520z();
        m11497b(0);
    }

    /* renamed from: b */
    private void m11497b(int i) {
        m11509g(i);
        this.f11089m = new C2588h(this, i);
        this.f11088l.postDelayed(this.f11090o, 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11499c(int i) {
        Rect a = C2559a.m11419a(Engine.getInstance().getWidgetManager().mo9646f().mo9182b("sk_sp"), i);
        View a2 = C2559a.m11420a(this.f10967a, a);
        TextView a3 = mo8391a(this.f10967a, mo8392a((int) R.string.wizard_tips_curve_press_candidate));
        TextView a4 = mo8391a(this.f10967a, mo8392a((int) R.string.wizard_tips_curve_press_word));
        TextView a5 = mo8391a(this.f10967a, mo8392a((int) R.string.wizard_tips_curve_press_space));
        TextView a6 = mo8391a(this.f10967a, mo8392a((int) R.string.wizard_tips_curve_slide_replace));
        Drawable a7 = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.teaching_hand);
        ImageView imageView = new ImageView(this.f10967a);
        imageView.setBackgroundDrawable(a7);
        imageView.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = a.left + (a.width() / 4);
        layoutParams.topMargin = a.top;
        imageView.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.topMargin = (mo8400i() / 3) + i;
        a6.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        layoutParams3.topMargin = mo8400i() / 3;
        a3.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = mo8400i() / 3;
        a4.setLayoutParams(layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = mo8400i() / 3;
        layoutParams5.addRule(14);
        a5.setLayoutParams(layoutParams5);
        a3.setVisibility(4);
        a4.setVisibility(4);
        a5.setVisibility(4);
        a6.setVisibility(4);
        mo8396a((View) a6);
        mo8396a((View) a3);
        mo8396a((View) a4);
        mo8396a((View) a5);
        mo8396a((View) imageView);
        mo8396a(a2);
        a5.startAnimation(C2559a.m11421a(this.f10967a, a5, (Runnable) null, new C2593m(this, a, imageView, a2, C2559a.m11422a(this.f10967a, (Runnable) new C2592l(this, imageView, a4, C2559a.m11421a(this.f10967a, a4, new C2591k(this, a3, C2559a.m11421a(this.f10967a, a3, new C2590j(this, a6, C2559a.m11421a(this.f10967a, a6, new C2589i(this, i), (Runnable) null)), (Runnable) null)), (Runnable) null))))));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m11502d(int i) {
        m11507f(i);
        this.f11089m = new C2594n(this, i);
        this.f11088l.postDelayed(this.f11090o, 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11504e(int i) {
        C2559a.m11438e();
        mo8398b();
    }

    /* renamed from: f */
    private void m11507f(int i) {
        this.f11081e = 0;
        this.f11083g = new float[][]{C2559a.m11431a("w", 1, i), C2559a.m11431a("h", 1, i), C2559a.m11431a("o", 1, i)};
        this.f11082f = new long[]{300, 300};
        this.f11084h = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m11519y() {
        this.f11085i = true;
        this.f11078b.reset();
        this.f11087k.clear();
    }

    /* renamed from: g */
    private void m11509g(int i) {
        this.f11081e = 0;
        this.f11083g = new float[][]{C2559a.m11431a("w", 1, i), C2559a.m11431a("h", 1, i), C2559a.m11431a("a", 1, i), C2559a.m11431a("t", 1, i)};
        this.f11082f = new long[]{300, 400, 400};
        this.f11084h = i;
    }

    /* renamed from: z */
    private void m11520z() {
        this.f11078b = new Path();
        this.f11079c = new Paint();
        this.f11079c.setStyle(Paint.Style.STROKE);
        this.f11079c.setAntiAlias(true);
        this.f11079c.setDither(true);
        this.f11079c.setStrokeJoin(Paint.Join.ROUND);
        this.f11079c.setStrokeCap(Paint.Cap.ROUND);
        this.f11079c.setStrokeWidth(this.f10967a.getResources().getDisplayMetrics().density * 3.9f);
        this.f11079c.setColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.tutorial_curve_path_color));
        this.f11080d = new C2586f(this, this.f10967a);
        mo8396a(this.f11080d);
    }

    /* renamed from: m */
    public void mo8402m() {
        super.mo8402m();
        this.f11086j = true;
    }

    /* renamed from: w */
    public int mo8347w() {
        return R.string.teaching_tip_curve;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Runnable mo8343k() {
        return this.f11091p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Runnable mo8344l() {
        return this.f11091p;
    }
}
