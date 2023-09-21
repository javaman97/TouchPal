package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.cootek.smartinput5.p066ui.control.C2833K;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;
import java.util.Arrays;

/* renamed from: com.cootek.smartinput5.ui.TopPageView */
public class TopPageView extends View implements C2826E.C2827a {

    /* renamed from: a */
    private static final int f11662a = -1;

    /* renamed from: b */
    private static final int f11663b = -1;

    /* renamed from: d */
    protected static final int f11664d = 1;

    /* renamed from: e */
    protected static final int f11665e = 2;

    /* renamed from: f */
    protected static final int f11666f = 4;

    /* renamed from: h */
    protected static final int f11667h = 10;

    /* renamed from: s */
    private static final int f11668s = 6;

    /* renamed from: t */
    private static final int f11669t = 12;

    /* renamed from: u */
    private static final String f11670u = "TopPageView";

    /* renamed from: A */
    private final Paint f11671A;

    /* renamed from: B */
    private boolean f11672B;

    /* renamed from: C */
    private int f11673C;

    /* renamed from: D */
    private int f11674D;

    /* renamed from: E */
    private int f11675E;

    /* renamed from: F */
    private int f11676F;

    /* renamed from: G */
    private C2826E f11677G;

    /* renamed from: H */
    private final boolean[] f11678H = new boolean[10];

    /* renamed from: I */
    private final int[] f11679I = new int[10];

    /* renamed from: J */
    private final int[] f11680J = new int[10];

    /* renamed from: K */
    private final int[] f11681K = new int[10];

    /* renamed from: L */
    private boolean f11682L;

    /* renamed from: M */
    private boolean f11683M;

    /* renamed from: N */
    private boolean f11684N;

    /* renamed from: O */
    private boolean f11685O;

    /* renamed from: c */
    private String f11686c;

    /* renamed from: g */
    protected int f11687g;

    /* renamed from: i */
    protected int f11688i;

    /* renamed from: j */
    protected C2728bH f11689j;

    /* renamed from: k */
    protected int f11690k;

    /* renamed from: l */
    protected C2640a f11691l;

    /* renamed from: m */
    protected C2727bG f11692m;

    /* renamed from: n */
    protected boolean f11693n;

    /* renamed from: o */
    private int f11694o;

    /* renamed from: p */
    private int f11695p = -1;

    /* renamed from: q */
    private final Drawable f11696q;

    /* renamed from: r */
    private Drawable f11697r;

    /* renamed from: v */
    private final Drawable f11698v;

    /* renamed from: w */
    private final Drawable f11699w;

    /* renamed from: x */
    private final int f11700x;

    /* renamed from: y */
    private final int f11701y;

    /* renamed from: z */
    private final int f11702z;

    /* renamed from: com.cootek.smartinput5.ui.TopPageView$a */
    protected interface C2640a {
        /* renamed from: a */
        void mo8800a();

        /* renamed from: a */
        void mo8801a(int i);

        /* renamed from: b */
        void mo8802b();

        /* renamed from: b */
        void mo8803b(int i);
    }

    public TopPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1602bh n = C1368X.m6320c().mo5841n();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.TopView);
        this.f11684N = obtainStyledAttributes.getBoolean(1, true);
        this.f11693n = obtainStyledAttributes.getBoolean(2, true);
        if (obtainStyledAttributes.getResourceId(4, 0) > 0) {
            this.f11697r = n.mo6250a(obtainStyledAttributes.getResourceId(4, 0), C2726bF.FUNCTION_BAR_DIVIDER_LINE);
            this.f11697r.setBounds(0, 0, this.f11697r.getIntrinsicWidth(), Engine.getInstance().getWidgetManager().mo9651i().mo9718d());
        }
        obtainStyledAttributes.recycle();
        this.f11677G = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f11677G.mo9238a((C2826E.C2827a) this);
        this.f11696q = n.mo6249a((int) R.drawable.candidate_h);
        if (this.f11684N) {
            this.f11698v = n.mo6249a((int) R.drawable.key_fun_prev_f);
            this.f11699w = n.mo6249a((int) R.drawable.key_fun_next_f);
        } else {
            this.f11698v = null;
            this.f11699w = null;
        }
        this.f11700x = n.mo6248a((int) R.color.candidate_normal, C2787cK.CANDIDATE_NORMAL);
        this.f11701y = n.mo6248a((int) R.color.candidate_default, C2787cK.CANDIDATE_HIGHLIGHT);
        this.f11702z = n.mo6248a((int) R.color.candidate_selected, C2787cK.CANDIDATE_SELECTED);
        this.f11671A = new Paint();
        this.f11671A.setColor(this.f11700x);
        this.f11671A.setAntiAlias(true);
        C1602bh.C1605c m = n.mo6287m();
        if (m.f5164a) {
            this.f11671A.setShadowLayer((float) m.f5166c, (float) m.f5167d, (float) m.f5168e, m.f5165b);
        }
        mo8794i();
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setBackgroundDrawable(n.mo6250a((int) R.drawable.candidate_bar, C2726bF.CANDIDATE_BG));
    }

    /* renamed from: h */
    public boolean mo8671h() {
        this.f11688i = (int) (((double) ((((((((float) Settings.getInstance().getIntSetting(123)) / 10.0f) + 1.0f) - 1.0f) / 2.0f) + 1.0f) * C1368X.m6313b().getResources().getDimension(R.dimen.min_candidate_width))) * this.f11677G.mo9250h());
        return false;
    }

    /* renamed from: c */
    public void mo8538c() {
        mo8794i();
    }

    /* renamed from: p_ */
    public void mo8556p_() {
    }

    /* renamed from: i */
    public void mo8794i() {
        Resources resources = C1368X.m6313b().getResources();
        float intSetting = (((float) Settings.getInstance().getIntSetting(123)) / 10.0f) + 1.0f;
        float f = ((intSetting - 1.0f) / 2.0f) + 1.0f;
        this.f11687g = (int) (((double) (((float) resources.getDimensionPixelSize(R.dimen.candidate_gap)) * f)) * this.f11677G.mo9250h());
        this.f11674D = (int) (((double) (((float) resources.getDimensionPixelSize(R.dimen.candidate_small_textsize)) * intSetting)) * this.f11677G.mo9250h());
        int dimensionPixelSize = (int) (((double) resources.getDimensionPixelSize(R.dimen.candidate_textsize)) * this.f11677G.mo9250h());
        this.f11673C = (int) (intSetting * ((float) dimensionPixelSize));
        this.f11675E = (int) (((float) dimensionPixelSize) * f);
        this.f11671A.setStrokeWidth(0.0f);
        this.f11671A.setTextAlign(Paint.Align.CENTER);
        this.f11671A.setTypeface(C1624bv.m7418a());
        this.f11676F = this.f11677G.mo9262t() / (resources.getInteger(R.integer.chs_candidate_max_words) + 1);
        this.f11688i = (int) (((double) (resources.getDimension(R.dimen.min_candidate_width) * f)) * this.f11677G.mo9250h());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (Engine.isInitialized()) {
            setMeasuredDimension(Engine.getInstance().getWidgetManager().mo9630ad().mo9262t(), Engine.getInstance().getWidgetManager().mo9651i().mo9718d());
        }
    }

    /* renamed from: a */
    private int mo8475a() {
        int i;
        int i2;
        int i3;
        String displayString;
        boolean z;
        float f;
        float max;
        int height = getHeight();
        if (this.f11684N) {
            i2 = height / 2;
            i = height / 2;
        } else {
            i = 0;
            i2 = 0;
        }
        Paint paint = this.f11671A;
        int width = (getWidth() - i2) - i;
        int i4 = 0;
        int i5 = 0;
        while (i5 < width && i4 < 10) {
            C2727bG e = mo8792e(i4);
            if (e == null) {
                break;
            }
            if (this.f11693n) {
                displayString = ((i4 + 1) % 10) + e.getDisplayString();
            } else {
                displayString = e.getDisplayString();
            }
            int length = displayString.length();
            if (e.getDisplayString().length() <= 6 || !C2829G.m12929a(e.getDisplayString().charAt(0))) {
                z = false;
            } else {
                z = true;
            }
            float b = (float) mo8642b(i4);
            paint.setTextSize((float) this.f11673C);
            if (b != -1.0f) {
                f = b;
            } else if (z) {
                paint.setTextSize((float) this.f11675E);
                f = paint.measureText(displayString, 0, 7);
            } else {
                f = paint.measureText(displayString, 0, length);
            }
            this.f11679I[i4] = (int) f;
            if (mo8671h()) {
                max = Math.max(f, (float) this.f11688i);
            } else {
                max = Math.max(Math.max(f, (float) this.f11688i) + (((float) this.f11687g) * mo8793f(i4) * 2.0f), (float) this.f11676F);
            }
            int i6 = (int) max;
            this.f11678H[i4] = z;
            this.f11680J[i4] = i6;
            i4++;
            i5 = i6 + i5;
        }
        if (i4 == 1) {
            i3 = i4;
        } else if (i5 > width) {
            int i7 = width - (i5 - this.f11680J[i4 - 1]);
            i3 = i4 - 1;
            if (i3 != 0) {
                int i8 = i7 / i3;
                for (int i9 = 0; i9 < i3 - 1; i9++) {
                    int[] iArr = this.f11680J;
                    iArr[i9] = iArr[i9] + i8;
                }
                int i10 = i7 - ((i3 - 1) * i8);
                int[] iArr2 = this.f11680J;
                int i11 = i3 - 1;
                iArr2[i11] = i10 + iArr2[i11];
            }
        } else {
            if (i5 < width && i4 != 0) {
                int i12 = width - i5;
                int i13 = i12 / i4;
                for (int i14 = 0; i14 < i4 - 1; i14++) {
                    int[] iArr3 = this.f11680J;
                    iArr3[i14] = iArr3[i14] + i13;
                }
                int i15 = i12 - ((i4 - 1) * i13);
                int[] iArr4 = this.f11680J;
                int i16 = i4 - 1;
                iArr4[i16] = i15 + iArr4[i16];
            }
            i3 = i4;
        }
        for (int i17 = 0; i17 < i3; i17++) {
            this.f11681K[i17] = i2;
            i2 += this.f11680J[i17];
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        C2727bG e;
        if (canvas != null) {
            super.onDraw(canvas);
        }
        int height = getHeight();
        if (this.f11684N) {
            i = height / 2;
        } else {
            i = 0;
        }
        Paint paint = this.f11671A;
        int i2 = this.f11695p;
        if (this.f11690k == 0) {
            this.f11690k = mo8475a();
            if (this.f11690k != 0) {
                mo8637c(this.f11690k - 1);
            }
        }
        if (canvas != null && this.f11684N) {
            if (i2 != -1 && i2 < i) {
                this.f11696q.setBounds(0, 0, i, height);
                this.f11696q.draw(canvas);
                this.f11686c = null;
                this.f11694o = -1;
                this.f11682L = true;
            }
            if (mo8638e()) {
                int intrinsicWidth = this.f11698v.getIntrinsicWidth();
                int intrinsicHeight = this.f11698v.getIntrinsicHeight();
                int i3 = (i - intrinsicWidth) / 2;
                int i4 = (height - intrinsicHeight) / 2;
                canvas.translate((float) i3, (float) i4);
                this.f11698v.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.f11698v.draw(canvas);
                canvas.translate((float) (-i3), (float) (-i4));
            }
        }
        int i5 = 0;
        int i6 = i;
        while (i5 < this.f11690k && (e = mo8792e(i5)) != null) {
            String str = "" + ((i5 + 1) % 10);
            String displayString = e.getDisplayString();
            int i7 = this.f11680J[i5];
            if (canvas != null) {
                boolean z = i2 != -1 && i2 >= i6 && i2 < i6 + i7 && e.getTag() != -1;
                int a = mo8641a(canvas, i5, i6, 0, i7, height, z);
                if (e.getTag() != 0) {
                    paint.setColor(this.f11701y);
                } else {
                    paint.setColor(this.f11700x);
                }
                if (!((a & 2) != 0 || i5 == 0 || this.f11697r == null)) {
                    canvas.translate((float) i6, 0.0f);
                    this.f11697r.draw(canvas);
                    canvas.translate((float) (-i6), 0.0f);
                }
                if (i2 != -1) {
                    if (z) {
                        if ((a & 1) == 0) {
                            canvas.translate((float) i6, 0.0f);
                            this.f11696q.setBounds(0, 0, i7, height);
                            this.f11696q.draw(canvas);
                            canvas.translate((float) (-i6), 0.0f);
                        }
                        this.f11686c = displayString;
                        this.f11694o = i5;
                        paint.setColor(this.f11702z);
                    }
                    mo8498o_();
                }
                if ((a & 4) == 0) {
                    paint.setTextSize((float) this.f11673C);
                    int descent = (int) paint.descent();
                    int textSize = ((int) ((((float) height) + paint.getTextSize()) - ((float) descent))) / 2;
                    int length = displayString.length();
                    Paint.Align textAlign = paint.getTextAlign();
                    if (this.f11678H[i5]) {
                        paint.setTextSize((float) this.f11675E);
                        int i8 = this.f11679I[i5];
                        paint.setTextAlign(Paint.Align.LEFT);
                        if (length > 12) {
                            displayString = displayString.substring(0, 11) + "..";
                        }
                        int i9 = ((i7 - i8) / 2) + i6 + (i8 / 7);
                        canvas.drawText(displayString, 0, 6, (float) i9, (float) ((textSize * 2) / 3), paint);
                        canvas.drawText(displayString, 6, displayString.length(), (float) i9, (float) ((textSize * 4) / 3), paint);
                        if (this.f11693n && mo8640g()) {
                            paint.setTextSize((float) this.f11674D);
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, 0, str.length(), (float) (((i7 - i8) / 2) + i6), (float) (descent + textSize), paint);
                        }
                    } else {
                        int i10 = this.f11679I[i5];
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(displayString, 0, length, (float) (((i7 + i10) / 2) + i6), (float) textSize, paint);
                        if (this.f11693n && mo8640g()) {
                            paint.setTextSize((float) this.f11674D);
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, 0, str.length(), (float) (((i7 - i10) / 2) + i6), (float) (descent + textSize), paint);
                        }
                    }
                    paint.setTextAlign(textAlign);
                }
            }
            i6 += i7;
            i5++;
        }
        if (canvas != null && this.f11684N) {
            int width = getWidth() - i;
            canvas.translate((float) width, 0.0f);
            if (i2 != -1 && i2 > width) {
                this.f11696q.setBounds(0, 0, i, height);
                this.f11696q.draw(canvas);
                this.f11686c = null;
                this.f11694o = -1;
                this.f11683M = true;
            }
            if (mo8639f()) {
                int intrinsicWidth2 = this.f11699w.getIntrinsicWidth();
                int intrinsicHeight2 = this.f11699w.getIntrinsicHeight();
                int i11 = (i - intrinsicWidth2) / 2;
                int i12 = (height - intrinsicHeight2) / 2;
                canvas.translate((float) i11, (float) i12);
                this.f11699w.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
                this.f11699w.draw(canvas);
                canvas.translate((float) (-i11), (float) (-i12));
            }
            canvas.translate((float) (-width), 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2727bG mo8792e(int i) {
        C2727bG a = this.f11689j.mo9003a(i);
        if (a == null && i == this.f11689j.mo9002a()) {
            return this.f11692m;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8791a(boolean z) {
        mo8478b();
        invalidate();
        requestLayout();
    }

    /* renamed from: b */
    private void mo8478b() {
        this.f11695p = -1;
        this.f11685O = false;
        this.f11686c = null;
        this.f11694o = -1;
        this.f11690k = 0;
        Arrays.fill(this.f11678H, false);
        Arrays.fill(this.f11680J, 0);
        Arrays.fill(this.f11681K, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                Engine.getInstance().feedback();
                this.f11695p = (int) motionEvent.getX();
                invalidate();
                return true;
            case 1:
                if (!this.f11685O && !this.f11672B) {
                    if (this.f11682L) {
                        this.f11691l.mo8800a();
                    } else if (this.f11683M) {
                        this.f11691l.mo8802b();
                    } else if (this.f11686c != null) {
                        this.f11691l.mo8801a(this.f11694o);
                    }
                }
                this.f11685O = false;
                this.f11686c = null;
                this.f11694o = -1;
                this.f11682L = false;
                this.f11683M = false;
                requestLayout();
                mo8795j();
                invalidate();
                return true;
            default:
                return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public float mo8793f(int i) {
        return 1.0f;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o_ */
    public void mo8498o_() {
        if (this.f11694o >= 0 && Settings.getInstance().getIntSetting(Settings.PREVIEW_LEVEL) != 0) {
            C2833K x = Engine.getInstance().getWidgetManager().mo9667x();
            x.mo9295a(0);
            x.mo9301a(C2833K.m12972a(getParent() == null ? this : (View) getParent(), this.f11681K[this.f11694o] - getScrollX(), getTop(), this.f11680J[this.f11694o], getHeight()), this.f11689j.mo9003a(this.f11694o).getDisplayString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo8795j() {
        this.f11695p = -1;
        Engine.getInstance().getWidgetManager().mo9667x().mo9294a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8637c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8638e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8639f() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo8640g() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo8642b(int i) {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo8641a(Canvas canvas, int i, int i2, int i3, int i4, int i5, boolean z) {
        return 0;
    }
}
