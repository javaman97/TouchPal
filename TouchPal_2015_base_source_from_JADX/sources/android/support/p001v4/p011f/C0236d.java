package android.support.p001v4.p011f;

import android.view.KeyEvent;

/* renamed from: android.support.v4.f.d */
/* compiled from: TransportMediator */
class C0236d implements KeyEvent.Callback {

    /* renamed from: a */
    final /* synthetic */ C0234b f616a;

    C0236d(C0234b bVar) {
        this.f616a = bVar;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (C0234b.m945a(i)) {
            return this.f616a.f607b.mo774a(i, keyEvent);
        }
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (C0234b.m945a(i)) {
            return this.f616a.f607b.mo776b(i, keyEvent);
        }
        return false;
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }
}
