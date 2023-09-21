package android.support.p001v4.view;

import android.view.MenuItem;

/* renamed from: android.support.v4.view.u */
/* compiled from: MenuItemCompatIcs */
class C0502u {

    /* renamed from: android.support.v4.view.u$b */
    /* compiled from: MenuItemCompatIcs */
    interface C0504b {
        /* renamed from: a */
        boolean mo1657a(MenuItem menuItem);

        /* renamed from: b */
        boolean mo1658b(MenuItem menuItem);
    }

    C0502u() {
    }

    /* renamed from: a */
    public static boolean m2860a(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    /* renamed from: b */
    public static boolean m2861b(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    /* renamed from: c */
    public static boolean m2862c(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    /* renamed from: a */
    public static MenuItem m2859a(MenuItem menuItem, C0504b bVar) {
        return menuItem.setOnActionExpandListener(new C0503a(bVar));
    }

    /* renamed from: android.support.v4.view.u$a */
    /* compiled from: MenuItemCompatIcs */
    static class C0503a implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private C0504b f1128a;

        public C0503a(C0504b bVar) {
            this.f1128a = bVar;
        }

        /* renamed from: a */
        public boolean mo1659a(MenuItem menuItem) {
            return this.f1128a.mo1657a(menuItem);
        }

        /* renamed from: b */
        public boolean mo1660b(MenuItem menuItem) {
            return this.f1128a.mo1658b(menuItem);
        }
    }
}
