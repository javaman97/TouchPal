package android.support.p001v4.widget;

import android.view.View;
import android.widget.ListPopupWindow;

/* renamed from: android.support.v4.widget.m */
/* compiled from: ListPopupWindowCompatKitKat */
class C0575m {
    C0575m() {
    }

    /* renamed from: a */
    public static View.OnTouchListener m3294a(Object obj, View view) {
        return ((ListPopupWindow) obj).createDragToOpenListener(view);
    }
}
