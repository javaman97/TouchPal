package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.p047c.C1194T;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p066ui.p067a.C2656a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.bu */
/* compiled from: PluginButtonItem */
public class C2770bu extends C2656a {

    /* renamed from: a */
    private static final float f12349a = 0.25f;

    /* renamed from: b */
    private static final String f12350b = "tbutton";

    /* renamed from: c */
    private Context f12351c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12352d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View.OnClickListener f12353e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View.OnLongClickListener f12354f;

    /* renamed from: g */
    private C1199d f12355g;

    /* renamed from: h */
    private String f12356h;

    /* renamed from: i */
    private Drawable f12357i;

    /* renamed from: j */
    private int f12358j;

    public C2770bu(Context context, String str) {
        super(context, str);
        this.f12351c = context;
        this.f12355g = C1194T.m5771a(str);
    }

    public C2770bu(Context context, String str, String str2) {
        super(context, str, str2);
        this.f12351c = context;
        this.f12355g = C1194T.m5771a(str);
    }

    /* renamed from: a */
    public void mo9083a(String str) {
        this.f12356h = str;
    }

    /* renamed from: a */
    public void mo9080a(Drawable drawable) {
        this.f12357i = drawable;
    }

    /* renamed from: a */
    public void mo9084a(boolean z) {
        this.f12352d = z;
    }

    /* renamed from: a */
    public void mo9081a(View.OnClickListener onClickListener) {
        this.f12353e = onClickListener;
    }

    /* renamed from: a */
    public void mo9082a(View.OnLongClickListener onLongClickListener) {
        this.f12354f = onLongClickListener;
    }

    /* renamed from: f_ */
    public void mo7123f_() {
    }

    /* renamed from: a */
    public View mo9079a(int i) {
        this.f12358j = i;
        return mo8981f();
    }

    /* renamed from: b */
    public boolean mo7164b() {
        int k = mo8986k();
        if (k == 0 || k == -1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7113a(Context context) {
        return m12658a(m12665m());
    }

    /* renamed from: a */
    private void m12659a(View view, int i, int i2) {
        Drawable drawable = null;
        if (C1368X.m6324d()) {
            drawable = C1368X.m6320c().mo5841n().mo6249a(i);
        }
        m12660a(view, drawable, i2);
    }

    /* renamed from: a */
    private void m12660a(View view, Drawable drawable, int i) {
        String str = null;
        if (i > 0) {
            str = String.valueOf(i);
        }
        m12661a(view, drawable, str);
    }

    /* renamed from: a */
    private void m12661a(View view, Drawable drawable, String str) {
        View findViewById = view.findViewById(R.id.guide_point_tag);
        if (findViewById != null) {
            findViewById.setBackgroundDrawable(drawable);
            TextView textView = (TextView) view.findViewById(R.id.number_tag);
            if (textView != null) {
                mo8976a(textView, str);
                if (str != null) {
                    textView.setVisibility(0);
                    textView.setText(str);
                    return;
                }
                textView.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo7120b(Context context, View view) {
        m12661a(view, (Drawable) null, (String) null);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7117a(Context context, View view) {
        m12661a(view, (Drawable) null, (String) null);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo7121c(Context context, View view) {
        m12661a(view, (Drawable) null, (String) null);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public View mo7122d(Context context, View view) {
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7116a(Context context, int i, View view) {
        m12660a(view, (Drawable) null, i);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7118a(Context context, View view, boolean z) {
        View findViewWithTag;
        if (!(view == null || (findViewWithTag = view.findViewWithTag(f12350b)) == null)) {
            TButton tButton = (TButton) findViewWithTag;
            String c = this.f12355g.mo4455c();
            tButton.setBackgroundHighlighted(c.equals("func") || c.equals(C1411aV.f4486m));
            int a = this.f12355g.mo4457e().mo4467a(C1411aV.f4490q);
            if (a > 0) {
                tButton.setForegroundDrawable(C1368X.m6320c().mo5841n().mo6250a(a, C2726bF.PLUGIN_BAR));
            }
            tButton.setSelected(z);
            tButton.refreshDrawableState();
        }
        return view;
    }

    /* renamed from: a */
    private View m12658a(View view) {
        RelativeLayout relativeLayout;
        LayoutInflater layoutInflater = (LayoutInflater) this.f12351c.getSystemService("layout_inflater");
        try {
            relativeLayout = new RelativeLayout(this.f12351c);
        } catch (NullPointerException e) {
            relativeLayout = null;
        }
        if (relativeLayout == null) {
            return view;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout.addView(view, layoutParams);
        View inflate = layoutInflater.inflate(R.layout.guide_point_tag_view, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) inflate.findViewById(R.id.number_tag).getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) (((float) this.f12358j) * 0.25f);
            layoutParams2.addRule(11);
        }
        relativeLayout.addView(inflate, layoutParams);
        return relativeLayout;
    }

    /* renamed from: m */
    private View m12665m() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f12351c.getSystemService("layout_inflater");
        TButton tButton = new TButton(this.f12351c);
        tButton.setWidth(this.f12358j);
        if (this.f12357i != null) {
            tButton.setForegroundDrawable(this.f12357i);
        }
        tButton.setTag(f12350b);
        tButton.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_shortcut_item));
        tButton.setFocusable(false);
        String c = this.f12355g.mo4455c();
        tButton.setBackgroundHighlighted(c.equals("func") || c.equals(C1411aV.f4486m));
        tButton.setSelected(false);
        tButton.refreshDrawableState();
        tButton.setOnClickListener(new C2771bv(this));
        tButton.setOnLongClickListener(new C2772bw(this));
        return tButton;
    }
}
