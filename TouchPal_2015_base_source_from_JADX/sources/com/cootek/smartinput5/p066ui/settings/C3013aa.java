package com.cootek.smartinput5.p066ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.support.p001v4.p009e.p010a.C0230a;
import android.support.p001v4.view.C0333F;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.aa */
/* compiled from: ColorPickerDialog */
public class C3013aa extends Dialog {

    /* renamed from: a */
    Context f13895a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3014a f13896b;

    /* renamed from: c */
    private int f13897c;

    /* renamed from: d */
    private int f13898d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f13899e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3015b f13900f;

    /* renamed from: com.cootek.smartinput5.ui.settings.aa$b */
    /* compiled from: ColorPickerDialog */
    public interface C3015b {
        /* renamed from: a */
        void mo9983a(int i);
    }

    public C3013aa(Context context, C3015b bVar) {
        this(context, C0333F.f835s, bVar);
    }

    public C3013aa(Context context, int i, C3015b bVar) {
        super(context, R.style.ColorPickerDialog);
        this.f13895a = context;
        this.f13900f = bVar;
        this.f13899e = i;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        WindowManager windowManager = getWindow().getWindowManager();
        this.f13898d = (int) (((float) windowManager.getDefaultDisplay().getHeight()) * 0.5f);
        this.f13897c = (int) (((float) windowManager.getDefaultDisplay().getWidth()) * 0.7f);
        this.f13896b = new C3014a(this.f13895a, this.f13898d, this.f13897c);
        this.f13896b.setBackgroundColor(0);
        setContentView(m14259c());
    }

    /* renamed from: c */
    private View m14259c() {
        LinearLayout linearLayout = new LinearLayout(this.f13895a);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this.f13895a);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f13897c, this.f13898d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setWeightSum(2.0f);
        Button b = m14258b((int) R.string.cancel);
        Button b2 = m14258b((int) R.string.ok);
        b.setOnClickListener(new C3016ab(this));
        b2.setOnClickListener(new C3017ac(this));
        linearLayout2.addView(b);
        linearLayout2.addView(b2);
        linearLayout.setBackgroundResource(R.drawable.vip_feature_item_bg);
        linearLayout.addView(this.f13896b);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* renamed from: b */
    private Button m14258b(int i) {
        Button button = new Button(this.f13895a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i2 = this.f13897c / 40;
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i2;
        layoutParams.rightMargin = i2;
        button.setLayoutParams(layoutParams);
        button.setText(C1974m.m9063a(getContext(), i));
        button.setGravity(17);
        button.setTextColor(-1);
        button.setTextSize(0, (float) this.f13895a.getResources().getDimensionPixelSize(R.dimen.colorpicker_btn_textsize));
        button.setBackgroundResource(R.drawable.custom_skin_btn_ctrl);
        return button;
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.aa$a */
    /* compiled from: ColorPickerDialog */
    private class C3014a extends View {

        /* renamed from: b */
        private Paint f13902b;

        /* renamed from: c */
        private Paint f13903c;

        /* renamed from: d */
        private Paint f13904d;

        /* renamed from: e */
        private Paint f13905e;

        /* renamed from: f */
        private Shader f13906f;

        /* renamed from: g */
        private float f13907g;

        /* renamed from: h */
        private float f13908h;

        /* renamed from: i */
        private float f13909i;

        /* renamed from: j */
        private float f13910j;

        /* renamed from: k */
        private final int[] f13911k;

        /* renamed from: l */
        private final int[] f13912l;

        /* renamed from: m */
        private int f13913m;

        /* renamed from: n */
        private int f13914n;

        /* renamed from: o */
        private RectF f13915o;

        /* renamed from: p */
        private float f13916p;

        /* renamed from: q */
        private float f13917q;

        /* renamed from: r */
        private int f13918r;

        /* renamed from: s */
        private boolean f13919s = true;

        /* renamed from: t */
        private boolean f13920t;

        /* renamed from: u */
        private boolean f13921u;

        /* renamed from: v */
        private boolean f13922v;

        public C3014a(Context context, int i, int i2) {
            super(context);
            this.f13913m = i;
            this.f13914n = i2;
            setMinimumHeight(i);
            setMinimumWidth(i2);
            this.f13911k = new int[]{C0230a.f588c, -65281, -16776961, -16711681, -16711936, -256, C0230a.f588c};
            SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, this.f13911k, (float[]) null);
            this.f13902b = new Paint(1);
            this.f13902b.setShader(sweepGradient);
            this.f13902b.setStyle(Paint.Style.STROKE);
            this.f13902b.setStrokeWidth(((float) (i2 / 2)) * 0.25f);
            this.f13916p = ((float) (i2 / 2)) * 0.625f;
            this.f13903c = new Paint(1);
            this.f13903c.setColor(C3013aa.this.f13899e);
            this.f13903c.setStrokeWidth(5.0f);
            this.f13917q = ((float) (i2 / 2)) * 0.25f;
            this.f13904d = new Paint(1);
            this.f13904d.setColor(Color.parseColor("#33000000"));
            this.f13904d.setStrokeWidth(4.0f);
            this.f13912l = new int[]{-16777216, this.f13903c.getColor(), -1};
            this.f13905e = new Paint(1);
            this.f13905e.setStrokeWidth(5.0f);
            this.f13918r = i2 / 8;
            this.f13907g = (-this.f13916p) - (this.f13902b.getStrokeWidth() * 0.5f);
            this.f13908h = (float) ((i2 / 2) - (this.f13918r / 2));
            this.f13909i = this.f13916p + (this.f13902b.getStrokeWidth() * 0.5f);
            this.f13910j = this.f13908h + ((float) this.f13918r);
            this.f13915o = new RectF(-this.f13916p, -this.f13916p, this.f13916p, this.f13916p);
            this.f13913m = this.f13914n + this.f13918r;
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            canvas.translate((float) (this.f13914n / 2), (float) (this.f13914n / 2));
            canvas.drawCircle(0.0f, 0.0f, this.f13917q, this.f13903c);
            if (this.f13921u || this.f13922v) {
                int color = this.f13903c.getColor();
                this.f13903c.setStyle(Paint.Style.STROKE);
                if (this.f13921u) {
                    this.f13903c.setAlpha(255);
                } else if (this.f13922v) {
                    this.f13903c.setAlpha(Settings.CURVE_ENABLED_UI);
                }
                canvas.drawCircle(0.0f, 0.0f, this.f13917q + this.f13903c.getStrokeWidth(), this.f13903c);
                this.f13903c.setStyle(Paint.Style.FILL);
                this.f13903c.setColor(color);
            }
            canvas.drawOval(this.f13915o, this.f13902b);
            if (this.f13919s) {
                this.f13912l[1] = this.f13903c.getColor();
            }
            this.f13906f = new LinearGradient(this.f13907g, 0.0f, this.f13909i, 0.0f, this.f13912l, (float[]) null, Shader.TileMode.MIRROR);
            this.f13905e.setShader(this.f13906f);
            canvas.drawRect(this.f13907g, this.f13908h, this.f13909i, this.f13910j, this.f13905e);
            float strokeWidth = this.f13904d.getStrokeWidth() / 2.0f;
            canvas.drawLine(this.f13907g - strokeWidth, this.f13908h, this.f13907g - strokeWidth, this.f13910j, this.f13904d);
            Canvas canvas2 = canvas;
            canvas2.drawLine(this.f13907g - (strokeWidth * 2.0f), this.f13908h - strokeWidth, (strokeWidth * 2.0f) + this.f13909i, this.f13908h - strokeWidth, this.f13904d);
            canvas.drawLine(this.f13909i + strokeWidth, this.f13908h, this.f13909i + strokeWidth, this.f13910j, this.f13904d);
            Canvas canvas3 = canvas;
            canvas3.drawLine(this.f13907g - (strokeWidth * 2.0f), this.f13910j + strokeWidth, (strokeWidth * 2.0f) + this.f13909i, this.f13910j + strokeWidth, this.f13904d);
            super.onDraw(canvas);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX() - ((float) (this.f13914n / 2));
            float y = (motionEvent.getY() - ((float) (this.f13913m / 2))) + ((float) this.f13918r);
            boolean a = m14269a(x, y, this.f13916p + (this.f13902b.getStrokeWidth() / 2.0f), this.f13916p - (this.f13902b.getStrokeWidth() / 2.0f));
            boolean a2 = m14268a(x, y, this.f13917q);
            boolean a3 = m14267a(x, y);
            switch (motionEvent.getAction()) {
                case 0:
                    this.f13919s = a;
                    this.f13920t = a3;
                    this.f13921u = a2;
                    break;
                case 1:
                    if (this.f13921u && a2 && C3013aa.this.f13900f != null) {
                        C3013aa.this.f13900f.mo9983a(this.f13903c.getColor());
                        C3013aa.this.dismiss();
                    }
                    if (this.f13919s) {
                        this.f13919s = false;
                    }
                    if (this.f13920t) {
                        this.f13920t = false;
                    }
                    if (this.f13921u) {
                        this.f13921u = false;
                    }
                    if (this.f13922v) {
                        this.f13922v = false;
                    }
                    invalidate();
                    break;
                case 2:
                    break;
            }
            if (this.f13919s && a) {
                float atan2 = (float) (((double) ((float) Math.atan2((double) y, (double) x))) / 6.283185307179586d);
                if (atan2 < 0.0f) {
                    atan2 += 1.0f;
                }
                this.f13903c.setColor(m14266a(this.f13911k, atan2));
            } else if (this.f13920t && a3) {
                this.f13903c.setColor(m14270b(this.f13912l, x));
            }
            if ((this.f13921u && a2) || (this.f13922v && a2)) {
                this.f13921u = true;
                this.f13922v = false;
            } else if (this.f13921u || this.f13922v) {
                this.f13921u = false;
                this.f13922v = true;
            } else {
                this.f13921u = false;
                this.f13922v = false;
            }
            invalidate();
            return true;
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(this.f13914n, this.f13913m);
        }

        /* renamed from: a */
        public void mo10120a() {
            C3013aa.this.f13900f.mo9983a(this.f13903c.getColor());
            C3013aa.this.dismiss();
        }

        /* renamed from: a */
        private boolean m14269a(float f, float f2, float f3, float f4) {
            double d = ((double) f4) * 3.141592653589793d * ((double) f4);
            double d2 = ((double) ((f * f) + (f2 * f2))) * 3.141592653589793d;
            if (d2 >= ((double) f3) * 3.141592653589793d * ((double) f3) || d2 <= d) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m14268a(float f, float f2, float f3) {
            if (((double) ((f * f) + (f2 * f2))) * 3.141592653589793d < ((double) f3) * 3.141592653589793d * ((double) f3)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m14267a(float f, float f2) {
            if (f > this.f13909i || f < this.f13907g || f2 > this.f13910j || f2 < this.f13908h) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private int m14266a(int[] iArr, float f) {
            if (f <= 0.0f) {
                return iArr[0];
            }
            if (f >= 1.0f) {
                return iArr[iArr.length - 1];
            }
            float length = ((float) (iArr.length - 1)) * f;
            int i = (int) length;
            float f2 = length - ((float) i);
            int i2 = iArr[i];
            int i3 = iArr[i + 1];
            return Color.argb(m14265a(Color.alpha(i2), Color.alpha(i3), f2), m14265a(Color.red(i2), Color.red(i3), f2), m14265a(Color.green(i2), Color.green(i3), f2), m14265a(Color.blue(i2), Color.blue(i3), f2));
        }

        /* renamed from: b */
        private int m14270b(int[] iArr, float f) {
            int i;
            int i2;
            float f2;
            if (f < 0.0f) {
                i = iArr[0];
                i2 = iArr[1];
                f2 = (this.f13909i + f) / this.f13909i;
            } else {
                i = iArr[1];
                i2 = iArr[2];
                f2 = f / this.f13909i;
            }
            return Color.argb(m14265a(Color.alpha(i), Color.alpha(i2), f2), m14265a(Color.red(i), Color.red(i2), f2), m14265a(Color.green(i), Color.green(i2), f2), m14265a(Color.blue(i), Color.blue(i2), f2));
        }

        /* renamed from: a */
        private int m14265a(int i, int i2, float f) {
            return Math.round(((float) (i2 - i)) * f) + i;
        }
    }

    /* renamed from: a */
    public int mo10115a() {
        return this.f13899e;
    }

    /* renamed from: a */
    public void mo10116a(int i) {
        this.f13899e = i;
    }

    /* renamed from: b */
    public C3015b mo10118b() {
        return this.f13900f;
    }

    /* renamed from: a */
    public void mo10117a(C3015b bVar) {
        this.f13900f = bVar;
    }
}
