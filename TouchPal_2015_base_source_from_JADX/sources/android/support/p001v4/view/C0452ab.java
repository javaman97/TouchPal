package android.support.p001v4.view;

import android.support.p001v4.view.C0393Z;
import android.view.View;

/* renamed from: android.support.v4.view.ab */
/* compiled from: ViewPropertyAnimatorCompat */
class C0452ab implements C0458ah {

    /* renamed from: a */
    final /* synthetic */ Runnable f1061a;

    /* renamed from: b */
    final /* synthetic */ C0393Z.C0395b f1062b;

    C0452ab(C0393Z.C0395b bVar, Runnable runnable) {
        this.f1062b = bVar;
        this.f1061a = runnable;
    }

    /* renamed from: a */
    public void mo1567a(View view) {
        this.f1061a.run();
        this.f1062b.mo1267a(view, (C0458ah) null);
    }

    /* renamed from: b */
    public void mo1568b(View view) {
    }

    /* renamed from: c */
    public void mo1569c(View view) {
    }
}
