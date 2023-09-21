package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.cootek.smartinput5.func.resource.C1974m;

/* renamed from: com.cootek.smartinput5.ui.aU */
/* compiled from: KeyboardDialogWidget */
public class C2681aU {

    /* renamed from: a */
    private Context f12016a;

    /* renamed from: b */
    private C2682a f12017b;

    /* renamed from: com.cootek.smartinput5.ui.aU$a */
    /* compiled from: KeyboardDialogWidget */
    public interface C2682a {
        /* renamed from: a */
        void mo8924a();

        /* renamed from: a */
        void mo8925a(View view);

        /* renamed from: a */
        void mo8657a(String str);

        /* renamed from: b_ */
        void mo8926b_();

        /* renamed from: c_ */
        boolean mo8927c_();

        /* renamed from: g */
        Button mo8658g();

        /* renamed from: h */
        Button mo8659h();
    }

    public C2681aU(Context context, boolean z, boolean z2) {
        this.f12016a = context;
        if (mo8931f()) {
            this.f12017b = new C2724bD(this.f12016a, z, z2);
        } else {
            this.f12017b = new C2625L(this.f12016a, z, z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8918a(View view) {
        this.f12017b.mo8925a(view);
        this.f12017b.mo8924a();
    }

    /* renamed from: f */
    private boolean mo8931f() {
        return C2773bx.m12686e();
    }

    /* renamed from: a */
    public void mo8912a() {
        if (this.f12017b != null) {
            this.f12017b.mo8926b_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8916a(int i) {
        return C1974m.m9063a(this.f12016a, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8917a(int i, Object... objArr) {
        return C1974m.m9064a(this.f12016a, i, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Context mo8920b() {
        return this.f12016a;
    }

    /* renamed from: c */
    public boolean mo8921c() {
        return this.f12017b.mo8927c_();
    }

    /* renamed from: a */
    public void mo8919a(String str) {
        this.f12017b.mo8657a(str);
    }

    /* renamed from: d */
    public Button mo8922d() {
        return this.f12017b.mo8658g();
    }

    /* renamed from: e */
    public Button mo8923e() {
        return this.f12017b.mo8659h();
    }
}
