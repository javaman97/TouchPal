package com.cootek.smartinput5.net;

import android.content.Context;
import com.cootek.smartinput5.net.C2364s;

/* renamed from: com.cootek.smartinput5.net.ab */
/* compiled from: SimpleDownloader */
public class C2212ab extends C2197U {

    /* renamed from: u */
    private C2213a f9336u;

    /* renamed from: com.cootek.smartinput5.net.ab$a */
    /* compiled from: SimpleDownloader */
    public interface C2213a {
        /* renamed from: a */
        void mo4115a();

        /* renamed from: a */
        void mo4116a(int i, int i2, int i3);

        /* renamed from: b */
        void mo4117b();

        /* renamed from: c */
        void mo4118c();

        /* renamed from: d */
        void mo4119d();
    }

    public C2212ab(Context context, C2213a aVar) {
        super(context);
        this.f9336u = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7646a(int i) {
        super.mo7646a(i);
        if (this.f9336u != null) {
            this.f9336u.mo4115a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7647a(int i, int i2, int i3, int i4) {
        super.mo7647a(i, i2, i3, i4);
        if (this.f9336u != null) {
            this.f9336u.mo4116a(i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7655b(int i) {
        super.mo7655b(i);
        if (this.f9336u != null) {
            this.f9336u.mo4117b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7659c(int i) {
        super.mo7659c(i);
        if (this.f9336u != null) {
            this.f9336u.mo4118c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7668h() {
        super.mo7668h();
        if (this.f9336u != null) {
            this.f9336u.mo4119d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7649a(C2364s.C2365a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7656b(C2364s.C2365a aVar) {
    }
}
