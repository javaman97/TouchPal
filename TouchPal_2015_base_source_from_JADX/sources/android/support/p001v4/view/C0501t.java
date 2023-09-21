package android.support.p001v4.view;

import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.view.t */
/* compiled from: MenuItemCompatHoneycomb */
class C0501t {
    C0501t() {
    }

    /* renamed from: a */
    public static void m2857a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* renamed from: a */
    public static MenuItem m2855a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    /* renamed from: b */
    public static MenuItem m2858b(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    /* renamed from: a */
    public static View m2856a(MenuItem menuItem) {
        return menuItem.getActionView();
    }
}
