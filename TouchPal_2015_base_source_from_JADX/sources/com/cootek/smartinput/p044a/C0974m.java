package com.cootek.smartinput.p044a;

import android.content.Context;

/* renamed from: com.cootek.smartinput.a.m */
/* compiled from: ImeRecognitionListenerStub */
public class C0974m {

    /* renamed from: a */
    private C0973l f2509a;

    public C0974m(Context context) {
        if (!C0978q.m5062a(context)) {
            return;
        }
        if (C0978q.m5067c()) {
            this.f2509a = new C0965d(context);
        } else {
            this.f2509a = new C0962b(context);
        }
    }

    /* renamed from: a */
    public void mo3995a(C0976o oVar) {
        if (this.f2509a != null) {
            this.f2509a.mo3951a(oVar);
        }
    }

    /* renamed from: a */
    public void mo3994a(C0975n nVar) {
        if (this.f2509a != null) {
            this.f2509a.mo3950a(nVar);
        }
    }

    /* renamed from: a */
    public void mo3996a(C0977p pVar) {
        if (this.f2509a != null) {
            this.f2509a.mo3952a(pVar);
        }
    }

    /* renamed from: a */
    public void mo3993a(C0964c cVar) {
        if (this.f2509a != null) {
            this.f2509a.mo3949a(cVar);
        }
    }

    /* renamed from: a */
    public void mo3997a(C0979r rVar) {
        if (this.f2509a != null) {
            rVar.mo4008a(this.f2509a);
        }
    }

    /* renamed from: b */
    public void mo3998b(C0979r rVar) {
        if (this.f2509a != null) {
            rVar.mo4019h();
            this.f2509a.mo3958d();
        }
    }

    /* renamed from: c */
    public void mo3999c(C0979r rVar) {
        if (this.f2509a != null) {
            this.f2509a.mo3959e();
            rVar.mo4020i();
        }
    }

    /* renamed from: a */
    public int mo3992a() {
        if (this.f2509a == null) {
            return 0;
        }
        return this.f2509a.mo3946a();
    }
}
