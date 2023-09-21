package android.support.p001v4.app;

import android.view.View;

/* renamed from: android.support.v4.app.m */
/* compiled from: Fragment */
class C0165m implements C0172r {

    /* renamed from: a */
    final /* synthetic */ Fragment f421a;

    C0165m(Fragment fragment) {
        this.f421a = fragment;
    }

    /* renamed from: a */
    public View mo501a(int i) {
        if (this.f421a.mView != null) {
            return this.f421a.mView.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }
}
