package android.support.p001v4.p011f;

import android.view.KeyEvent;

/* renamed from: android.support.v4.f.c */
/* compiled from: TransportMediator */
class C0235c implements C0237e {

    /* renamed from: a */
    final /* synthetic */ C0234b f615a;

    C0235c(C0234b bVar) {
        this.f615a = bVar;
    }

    /* renamed from: a */
    public void mo747a(KeyEvent keyEvent) {
        keyEvent.dispatch(this.f615a.f614t);
    }

    /* renamed from: a */
    public void mo745a(int i) {
        this.f615a.f607b.mo772a(i);
    }

    /* renamed from: a */
    public long mo744a() {
        return this.f615a.f607b.mo779e();
    }

    /* renamed from: a */
    public void mo746a(long j) {
        this.f615a.f607b.mo773a(j);
    }
}
