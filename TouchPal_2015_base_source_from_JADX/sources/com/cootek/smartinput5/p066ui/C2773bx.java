package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.emoji.keyboard.touchpal.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.cootek.smartinput5.ui.bx */
/* compiled from: PopupDialog */
public class C2773bx {

    /* renamed from: a */
    private static float f12361a = 0.875f;

    /* renamed from: b */
    private static float f12362b = 0.875f;

    /* renamed from: c */
    private static float f12363c = 0.75f;

    /* renamed from: d */
    private static float f12364d = 0.75f;

    /* renamed from: k */
    private static final String f12365k = "setLayoutInScreenEnabled";

    /* renamed from: e */
    private PopupWindow f12366e;

    /* renamed from: f */
    private Context f12367f;

    /* renamed from: g */
    private View f12368g;

    /* renamed from: h */
    private View f12369h = ((RelativeLayout) ((LayoutInflater) mo9094f().getSystemService("layout_inflater")).inflate(R.layout.popup_dialog_frame, (ViewGroup) null));

    /* renamed from: i */
    private BottomBtnsFrame f12370i;

    /* renamed from: j */
    private TextView f12371j;

    public C2773bx(Context context, boolean z, boolean z2) {
        this.f12367f = context;
        this.f12369h.setOnTouchListener(new C2774by(this));
        BottomBtnsFrame bottomBtnsFrame = (BottomBtnsFrame) this.f12369h.findViewById(R.id.buttons_frame);
        if (bottomBtnsFrame != null) {
            if (!z2) {
                bottomBtnsFrame.setVisibility(8);
            } else {
                this.f12370i = bottomBtnsFrame;
            }
        }
        if (!z) {
            View findViewById = this.f12369h.findViewById(R.id.title_frame);
            if (findViewById != null) {
                findViewById.setVisibility(8);
                return;
            }
            return;
        }
        this.f12371j = (TextView) this.f12369h.findViewById(R.id.title);
    }

    /* renamed from: a */
    public void mo8657a(String str) {
        if (this.f12371j != null) {
            this.f12371j.setText(str);
        }
    }

    /* renamed from: d */
    public BottomBtnsFrame mo9093d() {
        return this.f12370i;
    }

    /* renamed from: a */
    public void mo9089a() {
        m12685b(this.f12368g);
    }

    /* renamed from: a */
    public void mo9090a(View view) {
        this.f12368g = view;
    }

    /* renamed from: b */
    private void m12685b(View view) {
        SoftKeyboardView g;
        if (view != null) {
            this.f12366e = new PopupWindow(this.f12367f);
            ((RelativeLayout) this.f12369h.findViewById(R.id.content_frame)).addView(view);
            View findViewById = this.f12369h.findViewById(R.id.display_frame);
            findViewById.setOnTouchListener(new C2775bz(this));
            boolean a = m12683a(this.f12366e);
            this.f12366e.setContentView(this.f12369h);
            this.f12366e.setOutsideTouchable(true);
            Rect a2 = m12682a(a);
            this.f12366e.setAnimationStyle(R.style.PopupNormalAnimation);
            this.f12366e.setWidth(a2.width());
            this.f12366e.setHeight(a2.height());
            this.f12366e.setBackgroundDrawable(new ColorDrawable(0));
            int[] a3 = m12684a(a2);
            int i = a3[0];
            int i2 = a3[1];
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -2);
            if (findViewById != null) {
                layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.width = i;
            }
            findViewById.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), 0);
            Rect a4 = m12681a(i, i2, a2, findViewById.getMeasuredHeight());
            int width = (a2.width() - a4.width()) / 2;
            int height = (a2.height() - a4.height()) / 2;
            layoutParams.setMargins(width, height, width, height);
            findViewById.setLayoutParams(layoutParams);
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            if (widgetManager != null && (g = widgetManager.mo9648g()) != null) {
                if (a) {
                    try {
                        this.f12366e.showAtLocation(g, 51, a2.left, a2.top);
                    } catch (Exception e) {
                        return;
                    }
                } else {
                    this.f12366e.showAtLocation(g, 83, 0, 0);
                }
                C2721bA.m12494a().mo8989a(this);
            }
        }
    }

    /* renamed from: a */
    private Rect m12682a(boolean z) {
        Window window;
        Rect rect = null;
        if (z) {
            if (!(!Engine.isInitialized() || Engine.getInstance().getIms() == null || Engine.getInstance().getIms().getWindow() == null || (window = Engine.getInstance().getIms().getWindow().getWindow()) == null || window.getDecorView() == null)) {
                rect = new Rect();
                window.getDecorView().getWindowVisibleDisplayFrame(rect);
            }
            if (rect != null) {
                return rect;
            }
            Rect rect2 = new Rect();
            DisplayMetrics displayMetrics = this.f12367f.getResources().getDisplayMetrics();
            rect2.left = 0;
            rect2.right = displayMetrics.widthPixels;
            rect2.top = 0;
            rect2.bottom = displayMetrics.heightPixels;
            return rect2;
        }
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        Rect rect3 = new Rect();
        rect3.left = 0;
        rect3.top = 0;
        rect3.right = ad.mo9227B();
        rect3.bottom = ad.mo9226A();
        return rect3;
    }

    /* renamed from: a */
    private boolean m12683a(PopupWindow popupWindow) {
        Class<?> cls = popupWindow.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod(f12365k, new Class[]{Boolean.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(popupWindow, new Object[]{true});
            return true;
        } catch (SecurityException e) {
            return false;
        } catch (NoSuchMethodException e2) {
            return false;
        } catch (IllegalArgumentException e3) {
            return false;
        } catch (IllegalAccessException e4) {
            return false;
        } catch (InvocationTargetException e5) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m12686e() {
        boolean z = true;
        try {
            if (PopupWindow.class.getDeclaredMethod(f12365k, new Class[]{Boolean.TYPE}) == null) {
                z = false;
            }
            return z;
        } catch (NoSuchMethodException | SecurityException e) {
            return false;
        }
    }

    /* renamed from: a */
    private int[] m12684a(Rect rect) {
        int width;
        int height;
        int[] iArr = new int[2];
        if (rect.width() > rect.height()) {
            width = (int) (((float) rect.width()) * f12363c);
            height = (int) (((float) rect.height()) * f12364d);
        } else {
            width = (int) (((float) rect.width()) * f12361a);
            height = (int) (((float) rect.height()) * f12362b);
        }
        iArr[0] = width;
        iArr[1] = height;
        return iArr;
    }

    /* renamed from: a */
    private Rect m12681a(int i, int i2, Rect rect, int i3) {
        Rect rect2 = new Rect();
        if (i3 <= i2) {
            i2 = i3;
        }
        int width = (rect.width() - i) / 2;
        int height = (rect.height() - i2) / 2;
        rect2.set(width, height, width + i, height + i2);
        return rect2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo9087a(int i) {
        return C1974m.m9063a(this.f12367f, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo9088a(int i, Object... objArr) {
        return C1974m.m9064a(this.f12367f, i, objArr);
    }

    /* renamed from: b_ */
    public void mo9091b_() {
        if (this.f12366e != null && this.f12366e.isShowing()) {
            this.f12366e.dismiss();
            this.f12366e = null;
        }
        C2721bA.m12494a().mo8990b(this);
    }

    /* renamed from: c_ */
    public boolean mo9092c_() {
        if (this.f12366e != null) {
            return this.f12366e.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public Context mo9094f() {
        return this.f12367f;
    }
}
