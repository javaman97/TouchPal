package android.support.p001v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.h */
/* compiled from: ActionProvider */
public abstract class C0468h {

    /* renamed from: a */
    private static final String f1076a = "ActionProvider(support)";

    /* renamed from: b */
    private final Context f1077b;

    /* renamed from: c */
    private C0469a f1078c;

    /* renamed from: d */
    private C0470b f1079d;

    /* renamed from: android.support.v4.view.h$a */
    /* compiled from: ActionProvider */
    public interface C0469a {
        /* renamed from: a */
        void mo1617a(boolean z);
    }

    /* renamed from: android.support.v4.view.h$b */
    /* compiled from: ActionProvider */
    public interface C0470b {
        /* renamed from: a */
        void mo1618a(boolean z);
    }

    /* renamed from: b */
    public abstract View mo1611b();

    public C0468h(Context context) {
        this.f1077b = context;
    }

    /* renamed from: a */
    public Context mo1605a() {
        return this.f1077b;
    }

    /* renamed from: a */
    public View mo1606a(MenuItem menuItem) {
        return mo1611b();
    }

    /* renamed from: c */
    public boolean mo1612c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1613d() {
        return true;
    }

    /* renamed from: e */
    public void mo1614e() {
        if (this.f1079d != null && mo1612c()) {
            this.f1079d.mo1618a(mo1613d());
        }
    }

    /* renamed from: f */
    public boolean mo1615f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo1616g() {
        return false;
    }

    /* renamed from: a */
    public void mo1609a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo1610a(boolean z) {
        if (this.f1078c != null) {
            this.f1078c.mo1617a(z);
        }
    }

    /* renamed from: a */
    public void mo1607a(C0469a aVar) {
        this.f1078c = aVar;
    }

    /* renamed from: a */
    public void mo1608a(C0470b bVar) {
        if (!(this.f1079d == null || bVar == null)) {
            Log.w(f1076a, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1079d = bVar;
    }
}
