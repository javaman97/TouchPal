package com.cootek.smartinput5.p049e;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.e.a */
/* compiled from: NextwordPopup */
public class C1250a {

    /* renamed from: a */
    public static final int f3965a = -1;

    /* renamed from: b */
    public static final int f3966b = 0;

    /* renamed from: c */
    public static final int f3967c = 1;

    /* renamed from: d */
    public static final int f3968d = 2;

    /* renamed from: e */
    public static final int f3969e = 1;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static int f3970q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static int f3971r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static int f3972s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static int f3973t;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f3974f;

    /* renamed from: g */
    private boolean f3975g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f3976h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f3977i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f3978j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f3979k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f3980l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f3981m;

    /* renamed from: n */
    private int f3982n;

    /* renamed from: o */
    private int f3983o;

    /* renamed from: p */
    private int f3984p = -1;

    /* renamed from: u */
    private C1251a[] f3985u;

    public C1250a(Context context) {
        this.f3974f = context;
        this.f3976h = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.candidate_textsize);
        this.f3977i = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_nor_text_color);
        this.f3978j = this.f3974f.getResources().getDisplayMetrics().widthPixels;
        this.f3979k = Engine.getInstance().getWidgetManager().mo9637b().getHeight();
        this.f3980l = (int) (((double) Engine.getInstance().getWidgetManager().mo9651i().mo9718d()) * Engine.getInstance().getWidgetManager().mo9630ad().mo9251i());
        f3970q = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wave_nextword_min_width);
        f3971r = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wave_nextword_bottom_margin);
        f3972s = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.wave_nextword_side_margin);
        f3973t = f3971r - 20;
        this.f3985u = new C1251a[1];
        for (int i = 0; i < 1; i++) {
            this.f3985u[i] = new C1251a(i);
        }
    }

    /* renamed from: a */
    public void mo4607a(ArrayList<CandidateItem> arrayList, int i, int i2) {
        if (arrayList != null && arrayList.size() > 0) {
            this.f3975g = true;
            this.f3982n = i;
            this.f3983o = i2 > f3971r - this.f3980l ? i2 : f3971r - this.f3980l;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < arrayList.size() && i4 < 1) {
                    this.f3985u[i4].mo4614a(arrayList.get(i4), i, i2);
                    if (i4 == 0) {
                        this.f3981m = this.f3985u[i4].mo4615b();
                    }
                    i3 = i4 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4606a() {
        for (C1251a dismiss : this.f3985u) {
            dismiss.dismiss();
        }
        this.f3975g = false;
        this.f3981m = 0;
        this.f3982n = -1;
        this.f3983o = -1;
        this.f3984p = -1;
    }

    /* renamed from: a */
    public boolean mo4608a(int i, int i2) {
        if (!this.f3975g) {
            return false;
        }
        if (this.f3982n == -1 && this.f3983o == -1) {
            return false;
        }
        int i3 = i - this.f3982n;
        int i4 = this.f3983o - i2;
        if (i4 < f3973t) {
            return false;
        }
        if (i4 >= f3971r && Math.abs(i3) <= this.f3985u[0].mo4615b()) {
            return m6047a(0);
        }
        if (i3 < (-f3972s)) {
            return m6047a(1);
        }
        if (i3 > f3972s) {
            return m6047a(2);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m6047a(int i) {
        if (i < 0 || i >= 1 || !this.f3985u[i].isShowing()) {
            return false;
        }
        this.f3984p = i;
        return true;
    }

    /* renamed from: b */
    public CandidateItem mo4609b() {
        if (this.f3984p < 0 || this.f3984p >= 1 || !this.f3985u[this.f3984p].isShowing()) {
            return null;
        }
        return this.f3985u[this.f3984p].mo4611a();
    }

    /* renamed from: c */
    public Rect mo4610c() {
        if (this.f3984p < 0 || this.f3984p >= 1 || !this.f3985u[this.f3984p].isShowing()) {
            return null;
        }
        return this.f3985u[this.f3984p].mo4616c();
    }

    /* renamed from: com.cootek.smartinput5.e.a$a */
    /* compiled from: NextwordPopup */
    private class C1251a extends PopupWindow {

        /* renamed from: b */
        private TextView f3987b;

        /* renamed from: c */
        private CandidateItem f3988c;

        /* renamed from: d */
        private int f3989d;

        /* renamed from: e */
        private int f3990e;

        /* renamed from: f */
        private int f3991f;

        /* renamed from: g */
        private int f3992g;

        /* renamed from: h */
        private int f3993h;

        /* renamed from: i */
        private int f3994i;

        /* renamed from: j */
        private int f3995j;

        public C1251a(int i) {
            super(C1250a.this.f3974f);
            this.f3989d = i;
            switch (this.f3989d) {
                case 0:
                    this.f3995j = C1250a.f3971r;
                    this.f3994i = 0;
                    break;
                case 1:
                    this.f3995j = C1250a.f3973t;
                    this.f3994i = C1250a.f3972s;
                    break;
                case 2:
                    this.f3995j = C1250a.f3973t;
                    this.f3994i = -C1250a.f3972s;
                    break;
            }
            setBackgroundDrawable((Drawable) null);
            setWidth(-2);
            setHeight(-2);
            setTouchable(false);
            this.f3987b = new TextView(C1250a.this.f3974f);
            this.f3987b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            if (this.f3989d == 0) {
                this.f3987b.setTextSize(0, (float) (C1250a.this.f3976h + 5));
            } else {
                this.f3987b.setTextSize(0, (float) C1250a.this.f3976h);
            }
            this.f3987b.setGravity(17);
            this.f3987b.setTextColor(C1250a.this.f3977i);
            this.f3987b.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.wave_third_word_bg));
            this.f3987b.setMinWidth(C1250a.f3970q);
            this.f3987b.setPadding(10, 0, 10, 0);
            setContentView(this.f3987b);
        }

        /* renamed from: a */
        public void mo4613a(CandidateItem candidateItem) {
            this.f3988c = candidateItem;
            this.f3987b.setText(this.f3988c.word);
            this.f3987b.measure(0, 0);
            this.f3990e = this.f3987b.getMeasuredWidth();
            this.f3991f = this.f3987b.getMeasuredHeight();
        }

        /* renamed from: a */
        public CandidateItem mo4611a() {
            return this.f3988c;
        }

        /* renamed from: b */
        public int mo4615b() {
            return this.f3990e;
        }

        /* renamed from: c */
        public Rect mo4616c() {
            return new Rect(this.f3992g, this.f3993h - this.f3991f, this.f3992g + this.f3990e, this.f3993h);
        }

        /* renamed from: a */
        public void mo4614a(CandidateItem candidateItem, int i, int i2) {
            mo4613a(candidateItem);
            mo4612a(i, i2);
        }

        /* renamed from: a */
        public void mo4612a(int i, int i2) {
            SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
            if (g != null && g.getWindowToken() != null) {
                this.f3992g = (i - (this.f3990e / 2)) - (Integer.signum(this.f3994i) * ((Math.abs(this.f3994i) + (this.f3990e / 2)) + (C1250a.this.f3981m / 2)));
                this.f3993h = i2 - this.f3995j;
                int l = Engine.getInstance().getWidgetManager().mo9630ad().mo9254l() + this.f3992g;
                int i3 = this.f3993h;
                if (this.f3989d == 1 && this.f3992g < 0) {
                    return;
                }
                if (this.f3989d != 2 || this.f3990e + l <= C1250a.this.f3978j) {
                    if (Engine.getInstance().getIms().isFullscreenMode()) {
                        i3 = ((C1250a.this.f3979k - ((g.getHeight() + Engine.getInstance().getWidgetManager().mo9630ad().mo9256n()) + C1250a.this.f3980l)) + i2) - this.f3995j;
                    }
                    try {
                        showAtLocation(g, 51, l, i3);
                    } catch (RuntimeException e) {
                    }
                }
            }
        }

        public void dismiss() {
            try {
                super.dismiss();
            } catch (Exception e) {
            }
            this.f3990e = 0;
            this.f3992g = -1;
            this.f3993h = -1;
        }
    }
}
