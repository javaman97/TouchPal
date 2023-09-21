package android.support.p001v4.view;

import android.os.Build;
import android.support.p001v4.p009e.p010a.C0231b;
import android.support.p001v4.view.C0502u;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.view.r */
/* compiled from: MenuItemCompat */
public class C0494r {

    /* renamed from: a */
    public static final int f1119a = 0;

    /* renamed from: b */
    public static final int f1120b = 1;

    /* renamed from: c */
    public static final int f1121c = 2;

    /* renamed from: d */
    public static final int f1122d = 4;

    /* renamed from: e */
    public static final int f1123e = 8;

    /* renamed from: f */
    static final C0498d f1124f;

    /* renamed from: g */
    private static final String f1125g = "MenuItemCompat";

    /* renamed from: android.support.v4.view.r$d */
    /* compiled from: MenuItemCompat */
    interface C0498d {
        /* renamed from: a */
        MenuItem mo1647a(MenuItem menuItem, C0499e eVar);

        /* renamed from: a */
        MenuItem mo1648a(MenuItem menuItem, View view);

        /* renamed from: a */
        View mo1649a(MenuItem menuItem);

        /* renamed from: a */
        void mo1650a(MenuItem menuItem, int i);

        /* renamed from: b */
        MenuItem mo1651b(MenuItem menuItem, int i);

        /* renamed from: b */
        boolean mo1652b(MenuItem menuItem);

        /* renamed from: c */
        boolean mo1653c(MenuItem menuItem);

        /* renamed from: d */
        boolean mo1654d(MenuItem menuItem);
    }

    /* renamed from: android.support.v4.view.r$e */
    /* compiled from: MenuItemCompat */
    public interface C0499e {
        /* renamed from: a */
        boolean mo1655a(MenuItem menuItem);

        /* renamed from: b */
        boolean mo1656b(MenuItem menuItem);
    }

    /* renamed from: android.support.v4.view.r$a */
    /* compiled from: MenuItemCompat */
    static class C0495a implements C0498d {
        C0495a() {
        }

        /* renamed from: a */
        public void mo1650a(MenuItem menuItem, int i) {
        }

        /* renamed from: a */
        public MenuItem mo1648a(MenuItem menuItem, View view) {
            return menuItem;
        }

        /* renamed from: b */
        public MenuItem mo1651b(MenuItem menuItem, int i) {
            return menuItem;
        }

        /* renamed from: a */
        public View mo1649a(MenuItem menuItem) {
            return null;
        }

        /* renamed from: b */
        public boolean mo1652b(MenuItem menuItem) {
            return false;
        }

        /* renamed from: c */
        public boolean mo1653c(MenuItem menuItem) {
            return false;
        }

        /* renamed from: d */
        public boolean mo1654d(MenuItem menuItem) {
            return false;
        }

        /* renamed from: a */
        public MenuItem mo1647a(MenuItem menuItem, C0499e eVar) {
            return menuItem;
        }
    }

    /* renamed from: android.support.v4.view.r$b */
    /* compiled from: MenuItemCompat */
    static class C0496b implements C0498d {
        C0496b() {
        }

        /* renamed from: a */
        public void mo1650a(MenuItem menuItem, int i) {
            C0501t.m2857a(menuItem, i);
        }

        /* renamed from: a */
        public MenuItem mo1648a(MenuItem menuItem, View view) {
            return C0501t.m2855a(menuItem, view);
        }

        /* renamed from: b */
        public MenuItem mo1651b(MenuItem menuItem, int i) {
            return C0501t.m2858b(menuItem, i);
        }

        /* renamed from: a */
        public View mo1649a(MenuItem menuItem) {
            return C0501t.m2856a(menuItem);
        }

        /* renamed from: b */
        public boolean mo1652b(MenuItem menuItem) {
            return false;
        }

        /* renamed from: c */
        public boolean mo1653c(MenuItem menuItem) {
            return false;
        }

        /* renamed from: d */
        public boolean mo1654d(MenuItem menuItem) {
            return false;
        }

        /* renamed from: a */
        public MenuItem mo1647a(MenuItem menuItem, C0499e eVar) {
            return menuItem;
        }
    }

    /* renamed from: android.support.v4.view.r$c */
    /* compiled from: MenuItemCompat */
    static class C0497c extends C0496b {
        C0497c() {
        }

        /* renamed from: b */
        public boolean mo1652b(MenuItem menuItem) {
            return C0502u.m2860a(menuItem);
        }

        /* renamed from: c */
        public boolean mo1653c(MenuItem menuItem) {
            return C0502u.m2861b(menuItem);
        }

        /* renamed from: d */
        public boolean mo1654d(MenuItem menuItem) {
            return C0502u.m2862c(menuItem);
        }

        /* renamed from: a */
        public MenuItem mo1647a(MenuItem menuItem, C0499e eVar) {
            if (eVar == null) {
                return C0502u.m2859a(menuItem, (C0502u.C0504b) null);
            }
            return C0502u.m2859a(menuItem, new C0500s(this, eVar));
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            f1124f = new C0497c();
        } else if (i >= 11) {
            f1124f = new C0496b();
        } else {
            f1124f = new C0495a();
        }
    }

    /* renamed from: a */
    public static void m2817a(MenuItem menuItem, int i) {
        if (menuItem instanceof C0231b) {
            ((C0231b) menuItem).setShowAsAction(i);
        } else {
            f1124f.mo1650a(menuItem, i);
        }
    }

    /* renamed from: a */
    public static MenuItem m2815a(MenuItem menuItem, View view) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).setActionView(view);
        }
        return f1124f.mo1648a(menuItem, view);
    }

    /* renamed from: b */
    public static MenuItem m2819b(MenuItem menuItem, int i) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).setActionView(i);
        }
        return f1124f.mo1651b(menuItem, i);
    }

    /* renamed from: a */
    public static View m2816a(MenuItem menuItem) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).getActionView();
        }
        return f1124f.mo1649a(menuItem);
    }

    /* renamed from: a */
    public static MenuItem m2813a(MenuItem menuItem, C0468h hVar) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).mo718a(hVar);
        }
        Log.w(f1125g, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static C0468h m2818b(MenuItem menuItem) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).mo720a();
        }
        Log.w(f1125g, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    /* renamed from: c */
    public static boolean m2820c(MenuItem menuItem) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).mo722b();
        }
        return f1124f.mo1652b(menuItem);
    }

    /* renamed from: d */
    public static boolean m2821d(MenuItem menuItem) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).mo723c();
        }
        return f1124f.mo1653c(menuItem);
    }

    /* renamed from: e */
    public static boolean m2822e(MenuItem menuItem) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).mo724d();
        }
        return f1124f.mo1654d(menuItem);
    }

    /* renamed from: a */
    public static MenuItem m2814a(MenuItem menuItem, C0499e eVar) {
        if (menuItem instanceof C0231b) {
            return ((C0231b) menuItem).mo719a(eVar);
        }
        return f1124f.mo1647a(menuItem, eVar);
    }
}
