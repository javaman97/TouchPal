package android.support.p001v4.view;

import android.support.p001v4.view.C0393Z;
import android.view.View;

/* renamed from: android.support.v4.view.aa */
/* compiled from: ViewPropertyAnimatorCompat */
class C0451aa implements C0458ah {

    /* renamed from: a */
    final /* synthetic */ Runnable f1059a;

    /* renamed from: b */
    final /* synthetic */ C0393Z.C0395b f1060b;

    C0451aa(C0393Z.C0395b bVar, Runnable runnable) {
        this.f1060b = bVar;
        this.f1059a = runnable;
    }

    /* renamed from: a */
    public void mo1567a(View view) {
    }

    /* renamed from: b */
    public void mo1568b(View view) {
        this.f1059a.run();
        this.f1060b.mo1267a(view, (C0458ah) null);
    }

    /* renamed from: c */
    public void mo1569c(View view) {
    }
}
