package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.P */
/* compiled from: ExplicitCloudPopup */
public class C2629P extends PopupWindow {

    /* renamed from: a */
    boolean f11481a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f11482b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ArrayList<String> f11483c;

    /* renamed from: d */
    private C2630a f11484d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LinearLayout f11485e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f11486f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f11487g;

    /* renamed from: h */
    private int f11488h;

    /* renamed from: i */
    private int f11489i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f11490j;

    /* renamed from: k */
    private int f11491k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f11492l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f11493m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f11494n;

    /* renamed from: o */
    private int f11495o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f11496p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f11497q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ColorStateList f11498r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public LinearLayout.LayoutParams f11499s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2629P(Context context, View view, View view2) {
        super(context);
        boolean z = false;
        this.f11482b = context;
        this.f11485e = (LinearLayout) view;
        this.f11486f = (ImageView) view2;
        this.f11497q = context.getResources().getDimensionPixelSize(R.dimen.bihua_composition_height);
        this.f11490j = context.getResources().getDimensionPixelSize(R.dimen.explicit_cloud_popup_min_width);
        this.f11488h = context.getResources().getDimensionPixelSize(R.dimen.explicit_cloud_popup_max_width);
        this.f11489i = context.getResources().getDisplayMetrics().widthPixels;
        this.f11493m = context.getResources().getDimensionPixelOffset(R.dimen.explicit_cloud_popup_text_padding_side);
        this.f11494n = context.getResources().getDimensionPixelOffset(R.dimen.explicit_cloud_popup_text_padding_top);
        this.f11492l = context.getResources().getDimensionPixelOffset(R.dimen.explicit_cloud_popup_arrow_offset);
        this.f11498r = context.getResources().getColorStateList(R.color.explicit_cloud_popup_text_color);
        this.f11481a = context.getResources().getConfiguration().orientation == 1 ? true : z;
        this.f11499s = new LinearLayout.LayoutParams(-1, -2);
        this.f11499s.leftMargin = this.f11493m;
        this.f11499s.rightMargin = this.f11493m;
        setTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        setTouchInterceptor(new C2631Q(this));
        setAnimationStyle(R.style.ExplicitCloudPopupAnimation);
    }

    /* renamed from: a */
    public void mo8673a(String[] strArr, int i, int i2) {
        this.f11495o = i;
        this.f11496p = i2;
        this.f11487g = strArr.length;
        this.f11483c = new ArrayList<>();
        for (int i3 = 0; i3 < this.f11487g; i3++) {
            this.f11483c.add(strArr[i3]);
        }
        this.f11484d = new C2630a(this.f11482b);
        this.f11484d.measure(View.MeasureSpec.makeMeasureSpec(this.f11488h, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setWidth(this.f11484d.getMeasuredWidth());
        setHeight(this.f11484d.getMeasuredHeight());
        setContentView(this.f11484d);
    }

    /* renamed from: a */
    public void mo8672a(View view) {
        SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        View b = Engine.getInstance().getWidgetManager().mo9651i().mo9716b();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (getWidth() / 2 < rect.right - (rect.width() / 2) && getWidth() / 2 < (this.f11489i - rect.right) + (rect.width() / 2)) {
            this.f11491k = (rect.right - (rect.width() / 2)) - (getWidth() / 2);
        } else if (getWidth() / 2 >= rect.right - (rect.width() / 2)) {
            this.f11491k = 0;
        } else {
            if (getWidth() / 2 >= (rect.width() / 2) + (this.f11489i - rect.right)) {
                this.f11491k = this.f11489i - getWidth();
            }
        }
        this.f11484d.mo8675a(this.f11495o - this.f11491k);
        this.f11484d.mo8676b(R.drawable.explicit_cloud_popup_arrow_up);
        this.f11491k = ad.mo9254l() + this.f11491k;
        try {
            showAtLocation(g, 83, this.f11491k, C2835M.m13018a(g, b));
        } catch (RuntimeException e) {
        }
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.P$a */
    /* compiled from: ExplicitCloudPopup */
    private class C2630a extends LinearLayout {

        /* renamed from: b */
        private TextView f11501b;

        /* renamed from: c */
        private ImageView f11502c;

        /* renamed from: d */
        private LinearLayout f11503d;

        public C2630a(Context context) {
            super(context);
            setOrientation(1);
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, C2629P.this.f11497q + C2629P.this.f11492l));
            linearLayout.setOnClickListener(new C2632R(this, C2629P.this));
            this.f11501b = new TextView(context);
            this.f11501b.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            this.f11501b.setOnClickListener(new C2633S(this, C2629P.this));
            this.f11502c = new ImageView(context);
            this.f11502c.setLayoutParams(new LinearLayout.LayoutParams(C2629P.this.f11496p, -1));
            this.f11502c.setOnClickListener(new C2639T(this, C2629P.this));
            linearLayout.addView(this.f11501b);
            linearLayout.addView(this.f11502c);
            this.f11503d = new LinearLayout(context);
            if (C2629P.this.f11481a) {
                this.f11503d.setOrientation(1);
            } else {
                this.f11503d.setOrientation(0);
            }
            this.f11503d.setGravity(17);
            this.f11503d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.f11503d.setPadding(0, 4, 0, 4);
            this.f11503d.setBackgroundResource(R.drawable.bg_explicit_cloud_popup);
            for (int i = 0; i < C2629P.this.f11487g; i++) {
                TextView textView = new TextView(context);
                textView.setText((CharSequence) C2629P.this.f11483c.get(i));
                textView.setLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.START);
                if (C2629P.this.f11481a) {
                    C2629P.this.f11499s.width = -1;
                    textView.setLayoutParams(C2629P.this.f11499s);
                } else {
                    C2629P.this.f11499s.width = -2;
                    textView.setLayoutParams(C2629P.this.f11499s);
                }
                textView.setPadding(C2629P.this.f11493m, C2629P.this.f11494n, C2629P.this.f11493m, C2629P.this.f11494n);
                textView.setTextColor(C2629P.this.f11498r);
                textView.setTextSize(0, (float) C2629P.this.f11482b.getResources().getDimensionPixelSize(R.dimen.bihua_composition_size));
                textView.setMinimumWidth(C2629P.this.f11490j);
                textView.setGravity(17);
                textView.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_explicit_cloud_popup_text));
                textView.setOnClickListener(new C2648U(this, C2629P.this, i));
                this.f11503d.addView(textView);
                if (i != C2629P.this.f11487g - 1) {
                    ImageView imageView = new ImageView(context);
                    if (C2629P.this.f11481a) {
                        imageView.setBackgroundResource(R.drawable.explicit_cloud_popup_line_por);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    } else {
                        imageView.setBackgroundResource(R.drawable.explicit_cloud_popup_line_land);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
                    }
                    this.f11503d.addView(imageView);
                }
            }
            addView(this.f11503d);
            addView(linearLayout);
        }

        /* renamed from: a */
        public void mo8675a(int i) {
            this.f11501b.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        }

        /* renamed from: b */
        public void mo8676b(int i) {
            this.f11502c.setBackgroundResource(i);
        }
    }
}
