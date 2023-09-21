package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p047c.C1194T;
import com.cootek.smartinput5.p066ui.control.C2862g;
import com.cootek.smartinput5.p066ui.p067a.C2656a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.r */
/* compiled from: PluginPanelItem */
public class C1950r extends C2656a {

    /* renamed from: a */
    public static final float f6621a = 1.2f;

    /* renamed from: b */
    public static final float f6622b = 1.0f;

    /* renamed from: c */
    public String f6623c;

    /* renamed from: d */
    public String f6624d;

    /* renamed from: e */
    public Drawable f6625e;

    /* renamed from: f */
    public int f6626f = -1;

    /* renamed from: g */
    public View.OnClickListener f6627g;

    /* renamed from: h */
    protected int f6628h = -2;

    /* renamed from: i */
    protected int f6629i = -2;

    /* renamed from: j */
    protected ImageView f6630j;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Context f6631l;

    /* renamed from: m */
    private double f6632m;

    /* renamed from: n */
    private View f6633n = null;

    /* renamed from: o */
    private TextView f6634o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C1937f f6635p;

    /* renamed from: q */
    private float f6636q = -1.0f;

    /* renamed from: r */
    private float f6637r = -1.0f;

    /* renamed from: s */
    private float f6638s = -1.0f;

    /* renamed from: t */
    private float f6639t = -1.0f;

    /* renamed from: u */
    private float f6640u = -1.0f;

    public C1950r(Context context, String str) {
        super(context, str);
        this.f6631l = context;
    }

    public C1950r(Context context, String str, String str2) {
        super(context, str, str2);
        this.f6631l = context;
    }

    /* renamed from: f_ */
    public void mo7123f_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7113a(Context context) {
        this.f6635p = Engine.getInstance().getWidgetManager().mo9617W();
        if (this.f6633n == null) {
            this.f6633n = ((LayoutInflater) this.f6631l.getSystemService("layout_inflater")).inflate(R.layout.plugin_panel_item, (ViewGroup) null);
        }
        LinearLayout linearLayout = (LinearLayout) this.f6633n.findViewById(R.id.root);
        linearLayout.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.plugin_tab_item_bg_ctrl));
        if (this.f6637r == -1.0f) {
            this.f6637r = (float) linearLayout.getPaddingLeft();
        }
        if (this.f6638s == -1.0f) {
            this.f6638s = (float) linearLayout.getPaddingTop();
        }
        if (this.f6639t == -1.0f) {
            this.f6639t = (float) linearLayout.getPaddingRight();
        }
        if (this.f6640u == -1.0f) {
            this.f6640u = (float) linearLayout.getPaddingBottom();
        }
        linearLayout.setPadding((int) (((double) this.f6637r) * this.f6632m), (int) (((double) this.f6638s) * this.f6632m), (int) (((double) this.f6639t) * this.f6632m), (int) (((double) this.f6640u) * this.f6632m));
        this.f6630j = (ImageView) this.f6633n.findViewById(R.id.icon_frame);
        this.f6630j.setBackgroundDrawable(this.f6625e);
        RelativeLayout relativeLayout = (RelativeLayout) this.f6633n.findViewById(R.id.icon_panel);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f6628h, this.f6628h);
        }
        layoutParams.width = this.f6628h;
        layoutParams.height = this.f6628h;
        relativeLayout.setLayoutParams(layoutParams);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C1951s(this));
            if (!this.f6635p.mo7134i()) {
                linearLayout.setOnLongClickListener(new C1952t(this));
            }
        }
        this.f6634o = (TextView) this.f6633n.findViewById(R.id.title);
        this.f6634o.setText(this.f6624d);
        if (this.f6636q == -1.0f) {
            this.f6636q = this.f6634o.getTextSize();
        }
        this.f6634o.setTextSize(0, (float) (((double) this.f6636q) * this.f6632m));
        this.f6634o.setTextColor(m8955m());
        mo7164b();
        return this.f6633n;
    }

    /* renamed from: m */
    private int m8955m() {
        return Engine.getInstance().getWidgetManager().mo9617W().mo7125a();
    }

    /* renamed from: a */
    private void m8951a(View view, int i, int i2) {
        Drawable drawable = null;
        if (C1368X.m6324d()) {
            drawable = C1368X.m6320c().mo5841n().mo6249a(i);
        }
        m8952a(view, drawable, i2);
    }

    /* renamed from: a */
    private void m8952a(View view, Drawable drawable, int i) {
        String str = null;
        if (i > 0) {
            str = String.valueOf(i);
        }
        m8953a(view, drawable, str);
    }

    /* renamed from: a */
    private void m8953a(View view, Drawable drawable, String str) {
        View findViewById = view.findViewById(R.id.guide_point_tag);
        if (findViewById != null) {
            findViewById.setBackgroundDrawable(drawable);
            TextView textView = (TextView) view.findViewById(R.id.number_tag);
            if (textView == null) {
                return;
            }
            if (str != null) {
                mo8976a(textView, str);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.addRule(11);
                }
                textView.setVisibility(0);
                textView.setText(str);
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7117a(Context context, View view) {
        m8951a(view, (int) R.drawable.new_tag, 0);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo7120b(Context context, View view) {
        m8953a(view, (Drawable) null, (String) null);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo7121c(Context context, View view) {
        m8953a(view, (Drawable) null, "");
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7116a(Context context, int i, View view) {
        m8952a(view, (Drawable) null, i);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public View mo7122d(Context context, View view) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7118a(Context context, View view, boolean z) {
        return view;
    }

    /* renamed from: a */
    public void mo7163a(int i, int i2, double d) {
        this.f12124k = null;
        this.f6628h = i;
        this.f6629i = i2;
        this.f6632m = d;
    }

    /* renamed from: b */
    public void mo7164b() {
        int m = m8955m();
        boolean i = Engine.getInstance().getWidgetManager().mo9617W().mo7134i();
        if (this.f6630j != null && this.f6623c != null) {
            boolean b = C1194T.m5771a(this.f6623c).mo4456d().mo4469b();
            if (i) {
                C1368X.m6320c();
                Animation loadAnimation = AnimationUtils.loadAnimation(C1368X.m6313b(), R.anim.plugin_icon_shake);
                loadAnimation.reset();
                loadAnimation.setFillAfter(true);
                this.f6630j.startAnimation(loadAnimation);
                if (b) {
                    this.f6630j.getBackground().setAlpha(255);
                    this.f6634o.setTextColor(m);
                    return;
                }
                this.f6630j.getBackground().setAlpha(76);
                this.f6634o.setTextColor(C2862g.m13249a(m, 76));
                return;
            }
            this.f6630j.getBackground().setAlpha(255);
            this.f6634o.setTextColor(m);
            this.f6630j.clearAnimation();
        }
    }
}
