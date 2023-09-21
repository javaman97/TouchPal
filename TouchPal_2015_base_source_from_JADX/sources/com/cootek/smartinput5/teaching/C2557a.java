package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.cootek.smartinput5.teaching.p065a.C2559a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.a */
/* compiled from: TeachingTipBase */
public abstract class C2557a {

    /* renamed from: a */
    protected Context f10967a;

    /* renamed from: b */
    private PopupWindow f10968b;

    /* renamed from: c */
    private PopupWindow f10969c;

    /* renamed from: d */
    private ViewGroup f10970d;

    /* renamed from: e */
    private ViewGroup f10971e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SoftKeyboardView f10972f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public FunctionBar f10973g;

    /* renamed from: h */
    private View f10974h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public RectF f10975i;

    /* renamed from: j */
    private final LayoutInflater f10976j;

    /* renamed from: k */
    private String f10977k = null;

    /* renamed from: l */
    private Handler f10978l;

    /* renamed from: m */
    private final String f10979m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f10980n;

    /* renamed from: o */
    private C2558a f10981o;

    /* renamed from: com.cootek.smartinput5.teaching.a$a */
    /* compiled from: TeachingTipBase */
    public interface C2558a {
        /* renamed from: a */
        void mo8362a(String str);

        /* renamed from: b */
        void mo8363b(String str);

        /* renamed from: c */
        void mo8364c(String str);

        /* renamed from: d */
        void mo8365d(String str);
    }

    /* renamed from: w */
    public abstract int mo8347w();

    public C2557a(Context context, String str) {
        this.f10967a = context;
        this.f10979m = str;
        this.f10978l = new Handler();
        this.f10976j = (LayoutInflater) this.f10967a.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public final void mo8394a() {
        this.f10978l.postDelayed(new C2582b(this), 50);
    }

    /* renamed from: a */
    public void mo8397a(C2558a aVar) {
        this.f10981o = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8398b() {
        if (this.f10981o != null) {
            this.f10981o.mo8363b(this.f10979m);
        }
    }

    /* renamed from: c */
    public String mo8386c() {
        return null;
    }

    /* renamed from: d */
    public TextWatcher mo8339d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8395a(int i, int i2, int i3, int i4) {
        if (this.f10975i != null) {
            this.f10975i.set((float) i, (float) i2, (float) i3, (float) i4);
        }
        if (this.f10974h != null) {
            this.f10974h.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8396a(View view) {
        if (view != null && this.f10970d != null) {
            this.f10970d.addView(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8399e() {
        return false;
    }

    /* renamed from: f */
    public String mo8340f() {
        return null;
    }

    /* renamed from: g */
    public String mo8341g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8342h() {
        if (this.f10981o != null) {
            this.f10981o.mo8362a(this.f10979m);
        }
    }

    /* renamed from: x */
    private void m11381x() {
        Drawable a = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.wizard_highlight);
        this.f10975i = new RectF();
        this.f10974h = new C2583c(this, this.f10967a, a);
        this.f10974h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.f10970d.addView(this.f10974h);
    }

    /* renamed from: y */
    private void m11382y() {
        this.f10969c = new PopupWindow(this.f10967a);
        this.f10970d = (ViewGroup) this.f10976j.inflate(R.layout.wizard_popup, (ViewGroup) null);
        int g = this.f10972f.getKeyboard().mo9134g();
        if (mo8399e()) {
            g += this.f10973g.getHeight();
        }
        this.f10969c.setHeight(g);
        this.f10969c.setWidth(this.f10972f.getKeyboard().mo9192n());
        this.f10969c.setBackgroundDrawable(new ColorDrawable(0));
        this.f10969c.setContentView(this.f10970d);
        m11381x();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m11383z() {
        m11382y();
        try {
            this.f10969c.showAtLocation(this.f10972f, 83, 0, C2835M.m13017a(this.f10972f));
        } catch (RuntimeException e) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m11369A() {
        m11370B();
        m11371C();
        try {
            this.f10968b.showAtLocation(this.f10972f, 83, 0, C2835M.m13017a(this.f10972f));
        } catch (RuntimeException e) {
        }
    }

    /* renamed from: B */
    private void m11370B() {
        this.f10971e = (ViewGroup) this.f10976j.inflate(R.layout.wizard_popup, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        this.f10971e.setLayoutParams(layoutParams);
    }

    /* renamed from: C */
    private void m11371C() {
        this.f10968b = new PopupWindow(this.f10967a);
        this.f10968b.setBackgroundDrawable(new ColorDrawable(0));
        this.f10968b.setContentView(this.f10971e);
        DisplayMetrics displayMetrics = this.f10967a.getResources().getDisplayMetrics();
        int i = displayMetrics.heightPixels;
        if (this.f10972f != null) {
            Rect rect = new Rect();
            this.f10972f.getWindowVisibleDisplayFrame(rect);
            i = rect.height();
        }
        int i2 = displayMetrics.widthPixels;
        this.f10968b.setHeight(i);
        this.f10968b.setWidth(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo8400i() {
        if (this.f10969c != null) {
            return this.f10969c.getHeight();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo8401j() {
        if (this.f10969c != null) {
            return this.f10969c.getWidth();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Runnable mo8343k() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Runnable mo8344l() {
        return null;
    }

    /* renamed from: m */
    public void mo8402m() {
        this.f10980n = true;
        if (this.f10969c != null) {
            try {
                this.f10969c.dismiss();
            } catch (Exception e) {
            }
        }
        if (this.f10968b != null) {
            try {
                this.f10968b.dismiss();
            } catch (Exception e2) {
            }
        }
        mo8406t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8403n() {
        if (this.f10981o != null) {
            this.f10981o.mo8364c(this.f10979m);
        }
    }

    /* renamed from: o */
    public void mo8404o() {
        mo8395a(0, 0, 0, 0);
        Runnable k = mo8343k();
        if (k != null) {
            k.run();
        }
        if (this.f10981o != null) {
            this.f10981o.mo8365d(this.f10979m);
        }
    }

    /* renamed from: p */
    public void mo8405p() {
        Runnable l = mo8344l();
        if (l != null) {
            l.run();
        }
        mo8404o();
        mo8342h();
    }

    /* renamed from: a */
    private void m11374a(int i, String str) {
        Settings.getInstance().setIntSetting(3, i, 1, C1368X.m6320c().mo5835h().getLanguageCategory(str, 1), (Config) null, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo8356q() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo8345r() {
        return C1549b.f4791a;
    }

    /* renamed from: s */
    public void mo8355s() {
        String r = mo8345r();
        int q = mo8356q();
        if (!TextUtils.isEmpty(r)) {
            if (!Settings.getInstance().isLanguageEnabled(r)) {
                Settings.getInstance().setLanguageEnabled(r, true);
            }
            Settings.getInstance().setStringSetting(10, r);
        }
        if (q != -1) {
            m11374a(q, r);
        }
        Settings.getInstance().setBoolSetting(Settings.ONE_HANDED_LAYOUT, false);
        Settings.getInstance().setBoolSetting(Settings.SHOW_AUTO_SPACE_TIP, false);
        if (Engine.getInstance().getWidgetManager().mo9630ad().mo9266x() != 0) {
            Settings.getInstance().setIntSetting(256, 0);
        }
    }

    /* renamed from: t */
    public void mo8406t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public TextView mo8390a(Context context, int i) {
        return mo8391a(context, mo8392a(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public TextView mo8391a(Context context, String str) {
        return C2559a.m11426a(context, str, (int) R.drawable.mission_textview_background);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8392a(int i) {
        return C1974m.m9063a(this.f10967a, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8393a(int i, Object... objArr) {
        return C1974m.m9064a(this.f10967a, i, objArr);
    }

    /* renamed from: u */
    public boolean mo8346u() {
        return true;
    }

    /* renamed from: v */
    public String mo8407v() {
        return this.f10979m;
    }
}
