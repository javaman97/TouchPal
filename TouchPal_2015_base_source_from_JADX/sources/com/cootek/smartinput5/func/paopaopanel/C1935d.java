package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.p067a.C2656a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.d */
/* compiled from: MorePanelItem */
public class C1935d extends C2656a {

    /* renamed from: d */
    private static final float f6555d = 1.0f;

    /* renamed from: a */
    public String f6556a;

    /* renamed from: b */
    public Drawable f6557b;

    /* renamed from: c */
    public View.OnClickListener f6558c;

    /* renamed from: e */
    private Context f6559e;

    /* renamed from: f */
    private float f6560f = 1.0f;

    public C1935d(Context context, String str) {
        super(context, str);
        this.f6559e = context;
    }

    public C1935d(Context context, String str, String str2) {
        super(context, str, str2);
        this.f6559e = context;
    }

    /* renamed from: a */
    public void mo7119a(float f) {
        this.f6560f = f;
        this.f12124k = null;
        mo8982g();
    }

    /* renamed from: f_ */
    public void mo7123f_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7113a(Context context) {
        View inflate = ((LayoutInflater) this.f6559e.getSystemService("layout_inflater")).inflate(R.layout.more_panel_item, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.root);
        linearLayout.setPadding((int) (((float) linearLayout.getPaddingLeft()) * this.f6560f), (int) (((float) linearLayout.getPaddingTop()) * this.f6560f), (int) (((float) linearLayout.getPaddingRight()) * this.f6560f), (int) (((float) linearLayout.getPaddingBottom()) * this.f6560f));
        ((ImageView) inflate.findViewById(R.id.icon_frame)).setBackgroundDrawable(this.f6557b);
        View findViewById = inflate.findViewById(R.id.img_frame);
        findViewById.measure(0, 0);
        double d = (double) this.f6560f;
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int measuredWidth = (int) (((double) findViewById.getMeasuredWidth()) * d);
        int measuredHeight = (int) (d * ((double) findViewById.getMeasuredHeight()));
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(measuredWidth, measuredHeight);
        }
        layoutParams.width = measuredWidth;
        layoutParams.height = measuredHeight;
        findViewById.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        int i = (int) (((float) measuredHeight) * 1.0f);
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(-1, i);
        }
        layoutParams2.height = i;
        linearLayout.setLayoutParams(layoutParams2);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C1936e(this));
        }
        ((TextView) inflate.findViewById(R.id.title)).setText(this.f6556a);
        return inflate;
    }

    /* renamed from: a */
    private void m8863a(View view, int i, int i2) {
        Drawable drawable = null;
        if (C1368X.m6324d()) {
            drawable = C1368X.m6320c().mo5841n().mo6249a(i);
        }
        m8864a(view, drawable, i2);
    }

    /* renamed from: a */
    private void m8864a(View view, Drawable drawable, int i) {
        String str = null;
        if (i > 0) {
            str = String.valueOf(i);
        }
        m8865a(view, drawable, str);
    }

    /* renamed from: a */
    private void m8865a(View view, Drawable drawable, String str) {
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
        m8863a(view, (int) R.drawable.new_tag, 0);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo7120b(Context context, View view) {
        m8865a(view, (Drawable) null, (String) null);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo7121c(Context context, View view) {
        m8865a(view, (Drawable) null, "");
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7116a(Context context, int i, View view) {
        m8864a(view, (Drawable) null, i);
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
}
