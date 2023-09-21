package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.control.K */
/* compiled from: PopupPreview */
public class C2833K {

    /* renamed from: g */
    private static final String f12712g = "PopupPreview";

    /* renamed from: j */
    private static Rect f12713j = new Rect();

    /* renamed from: k */
    private static int[] f12714k = new int[2];

    /* renamed from: s */
    private static final int f12715s = 0;

    /* renamed from: t */
    private static final int f12716t = 100;

    /* renamed from: a */
    protected Context f12717a;

    /* renamed from: b */
    protected View f12718b;

    /* renamed from: c */
    protected PopupWindow f12719c;

    /* renamed from: d */
    protected FrameLayout f12720d;

    /* renamed from: e */
    protected Preview f12721e;

    /* renamed from: f */
    protected View f12722f;

    /* renamed from: h */
    private final int f12723h;

    /* renamed from: i */
    private Drawable f12724i = new ColorDrawable(0);

    /* renamed from: l */
    private int f12725l;

    /* renamed from: m */
    private int f12726m;

    /* renamed from: n */
    private int f12727n;

    /* renamed from: o */
    private Rect f12728o = new Rect();

    /* renamed from: p */
    private boolean f12729p = false;

    /* renamed from: q */
    private boolean f12730q = false;

    /* renamed from: r */
    private int f12731r = 0;

    /* renamed from: u */
    private int f12732u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f12733v;

    /* renamed from: w */
    private Handler f12734w = new C2834L(this);

    public C2833K(Context context) {
        this.f12717a = context;
        this.f12723h = (int) (4.0f * this.f12717a.getResources().getDisplayMetrics().density);
        C1602bh n = C1368X.m6320c().mo5841n();
        this.f12725l = n.mo6265c((int) R.dimen.preview_width);
        this.f12726m = n.mo6265c((int) R.dimen.preview_height);
        this.f12727n = n.mo6265c((int) R.dimen.preview_offset);
        this.f12719c = new PopupWindow(context);
        this.f12719c.setWidth(this.f12725l);
        this.f12719c.setHeight(this.f12726m);
        this.f12719c.setBackgroundDrawable(this.f12724i);
        this.f12719c.setTouchable(false);
        try {
            this.f12721e = new Preview(context);
        } catch (Exception e) {
        }
        this.f12720d = new FrameLayout(context);
        this.f12720d.setBackgroundDrawable(n.mo6249a((int) R.drawable.bg_popup_preview_ctrl));
        this.f12720d.addView(this.f12721e);
        this.f12719c.setContentView(this.f12720d);
        this.f12732u = context.getResources().getDisplayMetrics().widthPixels;
        if (mo9315b()) {
            this.f12731r = R.style.PopupAnimation;
        }
    }

    /* renamed from: a */
    public void mo9304a(View view) {
        this.f12718b = view;
    }

    /* renamed from: a */
    public void mo9294a() {
        mo9306a(false, false);
    }

    /* renamed from: a */
    public void mo9305a(boolean z) {
        mo9306a(z, false);
    }

    /* renamed from: a */
    public void mo9306a(boolean z, boolean z2) {
        boolean z3 = true;
        if (this.f12719c != null) {
            this.f12731r = 0;
            if (mo9315b()) {
                this.f12731r = R.style.PopupAnimation;
                z = true;
            } else if (!mo9317c()) {
                this.f12731r = R.style.PopupNormalAnimation;
                z = true;
            }
            if (mo9318d()) {
                if (Build.VERSION.SDK_INT <= 15) {
                    z3 = z;
                }
                this.f12733v = z3;
                if (z2 || !mo9317c()) {
                    m12976c(z3);
                } else {
                    this.f12734w.sendEmptyMessageDelayed(0, 100);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12976c(boolean z) {
        if (z) {
            try {
                this.f12719c.dismiss();
            } catch (Exception e) {
            }
            this.f12729p = false;
        } else if (mo9318d()) {
            if (Build.VERSION.SDK_INT > 13) {
                if (this.f12730q) {
                    if (this.f12722f != null) {
                        this.f12720d.removeView(this.f12722f);
                    }
                } else if (this.f12721e != null) {
                    this.f12721e.setText("");
                    this.f12721e.setForeDrawable((Drawable) null);
                }
            }
            this.f12719c.update(0, 0);
            this.f12729p = false;
        }
        mo9295a(0);
    }

    /* renamed from: b */
    public boolean mo9315b() {
        return HighFreqSettings.getInstance().previewLevel == 2;
    }

    /* renamed from: c */
    public boolean mo9317c() {
        return HighFreqSettings.getInstance().previewLevel == 0;
    }

    /* renamed from: d */
    public boolean mo9318d() {
        return this.f12719c.isShowing() && this.f12729p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9313b(View view) {
        if (view != null) {
            if (this.f12722f != null) {
                this.f12720d.removeView(this.f12722f);
            }
            this.f12722f = view;
            this.f12720d.addView(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9314b(boolean z) {
        this.f12730q = z;
        if (z) {
            if (this.f12721e != null) {
                this.f12721e.setVisibility(8);
            }
            if (this.f12722f != null) {
                this.f12722f.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f12721e != null) {
            this.f12721e.setVisibility(0);
        }
        if (this.f12722f != null) {
            this.f12722f.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo9319e() {
        return this.f12730q;
    }

    /* renamed from: a */
    public void mo9295a(int i) {
        if (this.f12721e != null) {
            this.f12721e.setFlag(i);
        }
    }

    /* renamed from: b */
    public void mo9307b(int i) {
        if (this.f12721e != null) {
            this.f12721e.setKeyType(i);
        }
    }

    /* renamed from: c */
    public static Rect m12975c(View view) {
        view.getLocationInWindow(f12714k);
        f12713j.set(f12714k[0], f12714k[1], f12714k[0] + view.getWidth(), f12714k[1] + view.getHeight());
        return f12713j;
    }

    /* renamed from: a */
    public static Rect m12972a(View view, int i, int i2, int i3, int i4) {
        view.getLocationInWindow(f12714k);
        f12713j.set(i, i2, i + i3, i2 + i4);
        f12713j.offset(f12714k[0], f12714k[1]);
        return f12713j;
    }

    /* renamed from: a */
    public void mo9301a(Rect rect, String str) {
        if (rect != null && !TextUtils.isEmpty(str)) {
            mo9312b(rect, str, false);
        }
    }

    /* renamed from: a */
    public void mo9303a(Rect rect, String str, boolean z) {
        if (rect != null && !TextUtils.isEmpty(str)) {
            mo9312b(rect, str, z);
        }
    }

    /* renamed from: a */
    public void mo9302a(Rect rect, String str, Drawable drawable, int[] iArr) {
        if (rect != null && !TextUtils.isEmpty(str) && drawable != null) {
            mo9311b(rect, str, drawable, iArr);
        }
    }

    /* renamed from: a */
    public void mo9300a(Rect rect, View view) {
        if (rect != null && view != null) {
            mo9310b(rect, view);
        }
    }

    /* renamed from: a */
    public void mo9297a(Rect rect, Drawable drawable) {
        mo9298a(rect, drawable, (int[]) null);
    }

    /* renamed from: a */
    public void mo9298a(Rect rect, Drawable drawable, int[] iArr) {
        if (rect != null && drawable != null) {
            mo9308b(rect, drawable, iArr);
        }
    }

    /* renamed from: a */
    public void mo9299a(Rect rect, Drawable drawable, int[] iArr, int i, int i2) {
        if (rect != null && drawable != null) {
            mo9309b(rect, drawable, iArr, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9311b(Rect rect, String str, Drawable drawable, int[] iArr) {
        mo9320f();
        mo9314b(false);
        if (this.f12721e != null) {
            this.f12721e.setTextSizeLarge(false);
            this.f12721e.setText(str);
            this.f12721e.setIconWithMainTitle(true);
            int a = (int) C2829G.m12926a((Paint) this.f12721e.getPaint(), str);
            int paddingLeft = this.f12721e.getPaddingLeft() - a;
            int paddingRight = this.f12721e.getPaddingRight() + a;
            this.f12721e.measure(0, 0);
            this.f12721e.invalidate();
            int abs = (Math.abs(a) * 2) + ((int) this.f12721e.getPaint().measureText(str, 0, str.length()));
            int measuredWidth = this.f12721e.getMeasuredWidth();
            int measuredHeight = this.f12721e.getMeasuredHeight();
            this.f12721e.setForeDrawable(drawable);
            if (iArr != null) {
                this.f12721e.setForeDrawableState(iArr);
            }
            int max = Math.max(abs, measuredWidth);
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            this.f12721e.getPaint().getFontMetricsInt(fontMetricsInt);
            Rect rect2 = new Rect();
            this.f12721e.getPaint().getTextBounds(str, 0, str.length(), rect2);
            this.f12721e.setPadding(paddingLeft, (-Math.abs((rect2.top - fontMetricsInt.top) - (fontMetricsInt.bottom - rect2.bottom))) / 2, paddingRight, 0);
            mo9296a(rect, max, measuredHeight);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9312b(Rect rect, String str, boolean z) {
        mo9320f();
        mo9314b(false);
        if (this.f12721e != null) {
            this.f12721e.setTextSizeLarge(z);
            this.f12721e.mo9361a();
            if (!z && Build.VERSION.SDK_INT == 15) {
                this.f12720d.removeView(this.f12721e);
                int flag = this.f12721e.getFlag();
                int keyType = this.f12721e.getKeyType();
                this.f12721e = new Preview(this.f12717a);
                this.f12721e.setFlag(flag);
                this.f12721e.setKeyType(keyType);
                this.f12721e.mo9361a();
                this.f12720d.addView(this.f12721e);
            }
            this.f12721e.setText(str);
            TextPaint paint = this.f12721e.getPaint();
            int a = (int) C2829G.m12926a((Paint) paint, str);
            int paddingLeft = this.f12721e.getPaddingLeft() - a;
            int paddingRight = this.f12721e.getPaddingRight() + a;
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            paint.getFontMetricsInt(fontMetricsInt);
            Rect rect2 = new Rect();
            paint.getTextBounds(str, 0, 1, rect2);
            int paddingTop = this.f12721e.getPaddingTop();
            int i = fontMetricsInt.ascent + this.f12723h;
            int i2 = fontMetricsInt.descent - this.f12723h;
            int i3 = i - rect2.top;
            int i4 = rect2.bottom - i2;
            if (i3 > 0 && i4 > 0) {
                paddingTop = i3 - i4;
            } else if (i4 > 0 || i3 > 0) {
                if (i3 > 0) {
                    paddingTop = i3;
                } else {
                    paddingTop = -i4;
                }
            }
            this.f12721e.setPadding(paddingLeft, paddingTop, paddingRight, 0);
            this.f12721e.measure(0, 0);
            mo9296a(rect, this.f12721e.getMeasuredWidth() + (Math.abs(a) * 2), 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9310b(Rect rect, View view) {
        mo9320f();
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        mo9313b(view);
        mo9314b(true);
        view.measure(0, 0);
        mo9296a(rect, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9308b(Rect rect, Drawable drawable, int[] iArr) {
        mo9320f();
        if (this.f12721e != null) {
            this.f12721e.setTextSizeLarge(false);
            if (!TextUtils.isEmpty(this.f12721e.getText())) {
                this.f12721e.setText("");
            }
            mo9314b(false);
            this.f12721e.setForeDrawable(drawable);
            if (iArr != null) {
                this.f12721e.setForeDrawableState(iArr);
            }
            this.f12721e.measure(0, 0);
            this.f12721e.invalidate();
            mo9296a(rect, this.f12721e.getMeasuredWidth(), this.f12721e.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9309b(Rect rect, Drawable drawable, int[] iArr, int i, int i2) {
        mo9320f();
        if (this.f12721e != null) {
            this.f12721e.setTextSizeLarge(false);
            if (!TextUtils.isEmpty(this.f12721e.getText())) {
                this.f12721e.setText("");
            }
            mo9314b(false);
            this.f12721e.mo9362a(drawable, i, i2);
            if (iArr != null) {
                this.f12721e.setForeDrawableState(iArr);
            }
            this.f12721e.measure(0, 0);
            this.f12721e.invalidate();
            mo9296a(rect, this.f12721e.getMeasuredWidth(), this.f12721e.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9296a(Rect rect, int i, int i2) {
        this.f12734w.removeMessages(0);
        this.f12728o.set(rect);
        int max = Math.max(this.f12720d.getPaddingLeft() + i + this.f12720d.getPaddingRight(), this.f12725l);
        this.f12719c.setWidth(max);
        int paddingTop = this.f12720d.getPaddingTop() + i2 + this.f12720d.getPaddingBottom();
        if (paddingTop < this.f12726m) {
            paddingTop = this.f12726m;
        }
        this.f12719c.setHeight(paddingTop);
        int width = this.f12719c.getWidth();
        int centerX = rect.centerX() - (width >> 1);
        if (centerX + width > this.f12732u) {
            centerX = this.f12732u - width;
        } else if (centerX < 0) {
            centerX = 0;
        }
        int height = (rect.top - this.f12727n) - this.f12719c.getHeight();
        if (!mo9317c()) {
            this.f12719c.setAnimationStyle(this.f12731r);
        } else {
            this.f12719c.setAnimationStyle(0);
        }
        if (this.f12719c.isShowing()) {
            this.f12719c.update(centerX, height, max, paddingTop);
        } else if (!(this.f12718b == null || this.f12718b.getWindowToken() == null)) {
            try {
                this.f12719c.showAtLocation(this.f12718b, 0, centerX, height);
            } catch (RuntimeException e) {
            }
        }
        this.f12729p = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo9320f() {
        if (this.f12721e != null) {
            this.f12721e.setForeDrawable((Drawable) null);
            this.f12721e.forceLayout();
            this.f12721e.setPadding(0, 0, 0, C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.preview_flag_padding));
        }
    }

    /* renamed from: c */
    public void mo9316c(int i) {
        if (mo9315b()) {
            this.f12731r = i;
        } else {
            this.f12731r = 0;
        }
    }
}
