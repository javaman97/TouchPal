package com.cootek.smartinput5.p066ui.control;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;

/* renamed from: com.cootek.smartinput5.ui.control.M */
/* compiled from: PopupUtils */
public class C2835M {
    /* renamed from: a */
    public static int m13017a(View view) {
        View decorView;
        int height;
        if (!Engine.isInitialized() || view == null || (decorView = Engine.getInstance().getIms().getWindow().getWindow().getDecorView()) == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (view instanceof SoftKeyboardView) {
            height = ((SoftKeyboardView) view).getKeyboard().mo9134g();
        } else {
            height = view.getHeight();
        }
        return (decorView.getBottom() - iArr[1]) - height;
    }

    /* renamed from: a */
    public static int m13018a(SoftKeyboardView softKeyboardView, View view) {
        if (softKeyboardView == null || !Engine.isInitialized()) {
            return 0;
        }
        View decorView = Engine.getInstance().getIms().getWindow().getWindow().getDecorView();
        int[] iArr = new int[2];
        if (view == null || view.getVisibility() != 0) {
            softKeyboardView.getLocationInWindow(iArr);
        } else {
            view.getLocationInWindow(iArr);
        }
        return decorView.getBottom() - iArr[1];
    }
}
