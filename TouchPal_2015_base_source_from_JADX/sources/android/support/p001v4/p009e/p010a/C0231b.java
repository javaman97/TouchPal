package android.support.p001v4.p009e.p010a;

import android.support.p001v4.view.C0468h;
import android.support.p001v4.view.C0494r;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.e.a.b */
/* compiled from: SupportMenuItem */
public interface C0231b extends MenuItem {

    /* renamed from: a */
    public static final int f590a = 0;

    /* renamed from: b */
    public static final int f591b = 1;

    /* renamed from: c */
    public static final int f592c = 2;

    /* renamed from: d */
    public static final int f593d = 4;

    /* renamed from: e */
    public static final int f594e = 8;

    /* renamed from: a */
    C0231b mo718a(C0468h hVar);

    /* renamed from: a */
    C0231b mo719a(C0494r.C0499e eVar);

    /* renamed from: a */
    C0468h mo720a();

    /* renamed from: a */
    MenuItem mo721a(int i);

    /* renamed from: b */
    boolean mo722b();

    /* renamed from: c */
    boolean mo723c();

    /* renamed from: d */
    boolean mo724d();

    View getActionView();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    void setShowAsAction(int i);
}
