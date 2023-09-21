package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.paopaopanel.C1933b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.List;

/* renamed from: com.cootek.smartinput5.ui.bh */
/* compiled from: LayoutSelectorView */
public class C2756bh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f12294a;

    /* renamed from: b */
    private LinearLayout f12295b;

    /* renamed from: c */
    private C1933b f12296c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LayoutInflater f12297d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f12298e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f12299f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2757a[] f12300g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f12301h;

    public C2756bh(Context context) {
        this.f12294a = context;
        m12571b();
    }

    /* renamed from: b */
    private void m12571b() {
        int color = this.f12294a.getResources().getColor(R.color.layout_selector_background_color);
        this.f12297d = (LayoutInflater) this.f12294a.getSystemService("layout_inflater");
        this.f12295b = new LinearLayout(this.f12294a);
        this.f12295b.setBackgroundDrawable(new ColorDrawable(color));
        this.f12296c = new C1933b();
    }

    /* renamed from: c */
    private void m12573c() {
        int height = Engine.getInstance().getWidgetManager().mo9648g().getHeight();
        this.f12299f = Engine.getInstance().getWidgetManager().mo9648g().getWidth();
        this.f12298e = height - ((int) (((float) height) * C2699ak.f12081a));
    }

    /* renamed from: d */
    private void m12575d() {
        m12573c();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.width = this.f12299f;
        layoutParams.height = this.f12298e;
        this.f12295b.setLayoutParams(layoutParams);
        this.f12295b.removeAllViews();
        this.f12300g = m12577e();
        if (this.f12300g != null) {
            for (C2757a a : this.f12300g) {
                this.f12295b.addView(a.mo9034a());
            }
        }
    }

    /* renamed from: a */
    public View mo9033a() {
        m12575d();
        return this.f12295b;
    }

    /* renamed from: e */
    private C2757a[] m12577e() {
        List<Integer> a = this.f12296c.mo7115a(Engine.getInstance().getCurrentLanguageId());
        this.f12301h = a.size();
        C2757a[] aVarArr = new C2757a[this.f12301h];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= aVarArr.length) {
                break;
            }
            int intValue = a.get(i2).intValue();
            aVarArr[i2] = m12569a(intValue);
            if (intValue == C1933b.m8860a()) {
                aVarArr[i2].mo9035a(true);
            }
            i = i2 + 1;
        }
        if (aVarArr.length < 2) {
            return null;
        }
        return aVarArr;
    }

    /* renamed from: a */
    private C2757a m12569a(int i) {
        int i2;
        int i3;
        switch (i) {
            case 1:
                i2 = R.string.optpage_phonepad;
                i3 = R.drawable.selector_subtype_btn_phonepad_ctrl;
                break;
            case 2:
                i2 = R.string.optpage_fullqwerty;
                i3 = R.drawable.selector_subtype_btn_full_ctrl;
                break;
            case 3:
                i2 = R.string.optpage_tplus;
                i3 = R.drawable.selector_subtype_btn_tplus_ctrl;
                break;
            default:
                i3 = -1;
                i2 = -1;
                break;
        }
        if (i2 == -1) {
            return null;
        }
        return new C2757a(i, C1974m.m9063a(this.f12294a, i2), i3);
    }

    /* renamed from: com.cootek.smartinput5.ui.bh$a */
    /* compiled from: LayoutSelectorView */
    private class C2757a {

        /* renamed from: b */
        private int f12303b;

        /* renamed from: c */
        private int f12304c;

        /* renamed from: d */
        private int f12305d;

        /* renamed from: e */
        private int f12306e;

        /* renamed from: f */
        private int f12307f;

        /* renamed from: g */
        private String f12308g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f12309h;

        /* renamed from: i */
        private View f12310i;

        /* renamed from: j */
        private TextView f12311j;

        /* renamed from: k */
        private ImageView f12312k;

        public C2757a(int i, String str, int i2) {
            m12581b();
            this.f12309h = i;
            this.f12308g = str;
            this.f12307f = i2;
        }

        /* renamed from: a */
        public void mo9035a(boolean z) {
            this.f12310i.setSelected(z);
        }

        /* renamed from: b */
        private void m12581b() {
            this.f12310i = C2756bh.this.f12297d.inflate(R.layout.layout_selector_item, (ViewGroup) null);
            this.f12311j = (TextView) this.f12310i.findViewById(R.id.title);
            this.f12312k = (ImageView) this.f12310i.findViewById(R.id.image);
            this.f12304c = C2756bh.this.f12298e;
            this.f12303b = C2756bh.this.f12299f / C2756bh.this.f12301h;
        }

        /* renamed from: c */
        private void m12582c() {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = (int) (((float) this.f12303b) * C2699ak.f12087g);
            int i2 = (int) (((float) this.f12304c) * C2699ak.f12088h);
            this.f12305d = this.f12303b - (i * 2);
            this.f12306e = this.f12303b - (i * 2);
            ViewGroup.LayoutParams layoutParams2 = this.f12312k.getLayoutParams();
            int i3 = (int) (((float) this.f12304c) * C2699ak.f12089i);
            layoutParams2.height = i3;
            layoutParams2.width = this.f12306e;
            this.f12312k.setPadding(0, i3 / 5, 0, i3 / 10);
            this.f12312k.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.f12311j.getLayoutParams();
            layoutParams3.height = (int) (((float) this.f12304c) * C2699ak.f12090j);
            layoutParams3.width = this.f12305d;
            this.f12311j.setLayoutParams(layoutParams3);
            layoutParams.width = this.f12303b - (i * 2);
            layoutParams.height = this.f12304c - (i2 * 2);
            layoutParams.setMargins(i, i2, i, 0);
            this.f12310i.setLayoutParams(layoutParams);
        }

        /* renamed from: d */
        private void m12583d() {
            this.f12312k.setImageResource(this.f12307f);
            this.f12311j.setText(this.f12308g);
            this.f12311j.setTextSize(0, (float) C1584bI.m7122a(this.f12305d, (int) (((float) this.f12304c) * C2699ak.f12090j), this.f12308g, this.f12311j, R.dimen.layout_selector_text_size));
        }

        /* renamed from: a */
        public View mo9034a() {
            m12582c();
            m12583d();
            this.f12310i.setOnClickListener(new C2758bi(this));
            return this.f12310i;
        }
    }
}
