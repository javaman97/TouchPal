package com.cootek.smartinput5.p066ui.control;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.cootek.smartinput5.ui.control.A */
/* compiled from: KeyboardZoomBackPad */
public class C2822A {

    /* renamed from: a */
    public static final int f12610a = 0;

    /* renamed from: b */
    public static final int f12611b = 1;

    /* renamed from: c */
    public static final int f12612c = 2;

    /* renamed from: d */
    private static final int f12613d = 0;

    /* renamed from: e */
    private static final int f12614e = 1;

    /* renamed from: f */
    private static final int f12615f = 2;

    /* renamed from: g */
    private static final int f12616g = 4;

    /* renamed from: h */
    private static final int f12617h = 8;

    /* renamed from: i */
    private boolean f12618i = true;

    /* renamed from: j */
    private RelativeLayout f12619j = null;

    /* renamed from: k */
    private LinearLayout f12620k;

    /* renamed from: l */
    private LinearLayout f12621l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2826E f12622m;

    /* renamed from: n */
    private MotionEvent f12623n = null;

    /* renamed from: o */
    private Context f12624o;

    /* renamed from: p */
    private Method f12625p;

    public C2822A(Context context) {
        this.f12624o = context;
    }

    /* renamed from: d */
    private void m12843d() {
        this.f12619j = (RelativeLayout) ((LayoutInflater) this.f12624o.getSystemService("layout_inflater")).inflate(R.layout.keyboard_zoom_back_pad, (ViewGroup) null);
        this.f12622m = Engine.getInstance().getWidgetManager().mo9630ad();
        if (Engine.getInstance().getWidgetManager().mo9637b() != null && ((ViewGroup) Engine.getInstance().getWidgetManager().mo9637b().getParent()) != null) {
            ((ViewGroup) Engine.getInstance().getWidgetManager().mo9637b().getParent()).addView(this.f12619j, new ViewGroup.LayoutParams(this.f12624o.getResources().getDisplayMetrics().widthPixels, this.f12622m.mo9261s()));
            m12854o();
            m12844e();
            m12851l();
            Engine.getInstance().getWidgetManager().mo9637b().bringToFront();
        }
    }

    /* renamed from: a */
    public void mo9215a() {
        if (this.f12619j != null && this.f12619j.getParent() != null) {
            ((ViewGroup) this.f12619j.getParent()).removeView(this.f12619j);
            this.f12619j = null;
            this.f12620k = null;
            this.f12621l = null;
        }
    }

    /* renamed from: e */
    private void m12844e() {
        m12845f();
        m12849j();
        m12850k();
        m12855p();
    }

    /* renamed from: f */
    private void m12845f() {
        this.f12619j.setOnTouchListener(new C2823B(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12834a(MotionEvent motionEvent) {
        boolean z = true;
        if (!Engine.isInitialized()) {
            return false;
        }
        if (m12841b(motionEvent)) {
            motionEvent = MotionEvent.obtain(this.f12623n);
            motionEvent.setAction(1);
        } else {
            z = false;
        }
        return m12835a(motionEvent, z);
    }

    /* renamed from: a */
    private boolean m12835a(MotionEvent motionEvent, boolean z) {
        View c;
        MotionEvent b = m12839b(motionEvent, z);
        if (b == null || (c = m12842c(motionEvent)) == null) {
            return false;
        }
        return c.dispatchTouchEvent(b);
    }

    @SuppressLint({"Recycle"})
    /* renamed from: b */
    private MotionEvent m12839b(MotionEvent motionEvent, boolean z) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int a = m12833a(x, y);
        if (a == 0) {
            return m12846g();
        }
        float b = m12838b(x, a);
        float a2 = m12832a(y, a);
        if (b == -1.0f || a2 == -1.0f) {
            return m12846g();
        }
        if (!z && motionEvent.getAction() == 0) {
            this.f12623n = MotionEvent.obtain(motionEvent);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(b, a2);
        return obtain;
    }

    /* renamed from: b */
    private boolean m12841b(MotionEvent motionEvent) {
        boolean z;
        if (this.f12623n == null || motionEvent == null || !Engine.isInitialized() || !((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
            return false;
        }
        int d = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        float y = this.f12623n.getY();
        float y2 = motionEvent.getY();
        boolean z2 = y < ((float) d);
        if (y2 < ((float) d)) {
            z = true;
        } else {
            z = false;
        }
        return z2 ^ z;
    }

    /* renamed from: g */
    private MotionEvent m12846g() {
        MotionEvent motionEvent = null;
        if (this.f12623n != null) {
            MotionEvent motionEvent2 = this.f12623n;
            this.f12623n = null;
            motionEvent = m12839b(motionEvent2, true);
            if (motionEvent != null) {
                motionEvent.setAction(1);
            }
        }
        return motionEvent;
    }

    /* renamed from: a */
    private int m12833a(float f, float f2) {
        int i = 0;
        if (f <= 0.0f || f2 <= 0.0f) {
            return 0;
        }
        if (f <= 0.0f || f > ((float) this.f12622m.mo9254l())) {
            int t = this.f12622m.mo9262t() + this.f12622m.mo9254l();
            int B = this.f12622m.mo9227B();
            if (f >= ((float) t) && f <= ((float) B)) {
                i = 2;
            }
        } else {
            i = 1;
        }
        if (f2 >= ((float) this.f12622m.mo9261s())) {
            return i | 4;
        }
        if (f2 > 0.0f && (i & 1) == 0 && (i & 2) == 0) {
            return i | 8;
        }
        return i;
    }

    /* renamed from: a */
    private float m12832a(float f, int i) {
        float s;
        float i2 = (float) m12848i();
        Engine instance = Engine.getInstance();
        if (f > ((float) this.f12622m.mo9261s()) && f < i2 + ((float) this.f12622m.mo9261s())) {
            int d = instance.getWidgetManager().mo9651i().mo9718d();
            if (((TouchPalIME) instance.getIms()).isCandidatesViewShown()) {
                s = (float) ((this.f12622m.mo9261s() - d) - 10);
            } else {
                s = (float) (this.f12622m.mo9261s() - 10);
            }
            return s;
        } else if (!((TouchPalIME) instance.getIms()).isCandidatesViewShown()) {
            return f;
        } else {
            int d2 = instance.getWidgetManager().mo9651i().mo9718d();
            if (f > ((float) d2)) {
                return f - ((float) d2);
            }
            return f;
        }
    }

    /* renamed from: b */
    private float m12838b(float f, int i) {
        float f2 = 0.0f;
        int h = m12847h();
        if ((i & 1) != 0) {
            int l = this.f12622m.mo9254l() - h;
            int l2 = this.f12622m.mo9254l();
            if (f <= ((float) l) || f >= ((float) l2)) {
                f2 = -1.0f;
            }
            return f2;
        } else if ((i & 2) != 0) {
            float t = (f - ((float) this.f12622m.mo9262t())) - ((float) this.f12622m.mo9254l());
            if (t <= 0.0f || t >= ((float) h)) {
                return -1.0f;
            }
            return (float) (this.f12622m.mo9262t() - 5);
        } else if ((i & 4) == 0 && (i & 8) == 0) {
            return -1.0f;
        } else {
            return f - ((float) this.f12622m.mo9254l());
        }
    }

    /* renamed from: c */
    private View m12842c(MotionEvent motionEvent) {
        if (!((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
            return Engine.getInstance().getWidgetManager().mo9643e();
        }
        if (motionEvent.getY() < ((float) Engine.getInstance().getWidgetManager().mo9651i().mo9718d())) {
            return Engine.getInstance().getIms().getWindow().findViewById(16908317);
        }
        return Engine.getInstance().getWidgetManager().mo9643e();
    }

    /* renamed from: h */
    private int m12847h() {
        return this.f12622m.mo9262t() / 8;
    }

    /* renamed from: i */
    private int m12848i() {
        return this.f12622m.mo9261s() / 8;
    }

    /* renamed from: j */
    private void m12849j() {
        this.f12620k = (LinearLayout) this.f12619j.findViewById(R.id.keyboard_zoom_left_pad);
        RelativeLayout relativeLayout = (RelativeLayout) this.f12619j.findViewById(R.id.left_button_pad);
        Button button = (Button) this.f12619j.findViewById(R.id.left_button);
        if (this.f12620k != null && relativeLayout != null && button != null) {
            m12852m();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams.width = m12856q() / 15;
            layoutParams.height = m12856q() / 8;
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            button.setLayoutParams(layoutParams);
            button.setOnClickListener(new C2824C(this));
        }
    }

    /* renamed from: k */
    private void m12850k() {
        this.f12621l = (LinearLayout) this.f12619j.findViewById(R.id.keyboard_zoom_right_pad);
        RelativeLayout relativeLayout = (RelativeLayout) this.f12619j.findViewById(R.id.right_button_pad);
        Button button = (Button) this.f12619j.findViewById(R.id.right_button);
        if (this.f12621l != null && relativeLayout != null && button != null) {
            m12853n();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams.width = m12856q() / 15;
            layoutParams.height = m12856q() / 8;
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            button.setLayoutParams(layoutParams);
            button.setOnClickListener(new C2825D(this));
        }
    }

    /* renamed from: l */
    private void m12851l() {
        int s = this.f12622m.mo9261s() + this.f12622m.mo9256n();
        ViewGroup.LayoutParams layoutParams = this.f12619j.getLayoutParams();
        layoutParams.height = s;
        this.f12619j.setLayoutParams(layoutParams);
        m12852m();
        m12853n();
        this.f12619j.setVisibility(0);
    }

    /* renamed from: m */
    private void m12852m() {
        int i;
        boolean z = false;
        if (this.f12622m.mo9264v()) {
            i = 0;
        } else {
            i = 4;
        }
        if (i != this.f12620k.getVisibility()) {
            this.f12620k.setVisibility(i);
            LinearLayout linearLayout = this.f12620k;
            if (i != 4) {
                z = true;
            }
            linearLayout.setFocusable(z);
        }
    }

    /* renamed from: n */
    private void m12853n() {
        int i;
        boolean z = false;
        if (this.f12622m.mo9265w()) {
            i = 0;
        } else {
            i = 4;
        }
        if (i != this.f12621l.getVisibility()) {
            this.f12621l.setVisibility(i);
            LinearLayout linearLayout = this.f12621l;
            if (i != 4) {
                z = true;
            }
            linearLayout.setFocusable(z);
        }
    }

    /* renamed from: o */
    private void m12854o() {
        Class<ViewGroup> cls = ViewGroup.class;
        try {
            this.f12625p = cls.getMethod("setMotionEventSplittingEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            this.f12625p = null;
        }
    }

    /* renamed from: p */
    private void m12855p() {
        if (this.f12625p != null && this.f12619j != null && this.f12619j.getParent() != null) {
            try {
                this.f12625p.invoke((ViewGroup) this.f12619j.getParent(), new Object[]{false});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            }
        }
    }

    /* renamed from: b */
    public void mo9219b() {
        if (this.f12619j == null) {
            m12843d();
        } else {
            m12851l();
        }
    }

    /* renamed from: a */
    public void mo9218a(boolean z) {
        if (this.f12619j == null) {
            m12843d();
        }
        Button button = (Button) this.f12619j.findViewById(R.id.left_button);
        Button button2 = (Button) this.f12619j.findViewById(R.id.right_button);
        int i = z ? 0 : 4;
        button.setVisibility(i);
        button2.setVisibility(i);
    }

    /* renamed from: a */
    public void mo9217a(Drawable drawable) {
        if (this.f12619j == null) {
            m12843d();
        }
        this.f12619j.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo9216a(int i) {
        if (this.f12619j == null) {
            m12843d();
        }
        this.f12619j.setBackgroundColor(i);
    }

    /* renamed from: b */
    public void mo9220b(boolean z) {
        this.f12618i = z;
    }

    /* renamed from: q */
    private int m12856q() {
        return this.f12624o.getResources().getDisplayMetrics().widthPixels;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m12857r() {
        return Engine.getInstance().getDialogManager().isWizardTipsDialogShowing() || C1368X.m6320c().mo5850w().mo8418g();
    }

    /* renamed from: c */
    public View mo9221c() {
        return this.f12619j;
    }
}
