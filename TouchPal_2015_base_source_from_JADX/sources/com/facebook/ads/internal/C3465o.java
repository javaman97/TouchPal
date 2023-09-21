package com.facebook.ads.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.cootek.smartinput5.engine.Engine;
import com.facebook.ads.C3344h;
import com.facebook.ads.internal.adapters.C3353a;
import com.facebook.ads.internal.adapters.C3365e;
import com.facebook.ads.internal.adapters.C3366f;
import com.facebook.ads.internal.p073d.C3396a;
import com.facebook.ads.internal.p077h.C3456v;

/* renamed from: com.facebook.ads.internal.o */
class C3465o implements C3366f {

    /* renamed from: a */
    final /* synthetic */ Runnable f15043a;

    /* renamed from: b */
    final /* synthetic */ C3458i f15044b;

    C3465o(C3458i iVar, Runnable runnable) {
        this.f15044b = iVar;
        this.f15043a = runnable;
    }

    /* renamed from: a */
    public void mo10627a(C3365e eVar) {
        this.f15044b.m15121j();
        this.f15044b.f15020f.removeCallbacks(this.f15043a);
        C3353a unused = this.f15044b.f15026l = eVar;
        this.f15044b.f14795a.mo10670a();
        this.f15044b.m15129n();
    }

    /* renamed from: a */
    public void mo10628a(C3365e eVar, C3344h hVar) {
        this.f15044b.m15121j();
        this.f15044b.f15020f.removeCallbacks(this.f15043a);
        this.f15044b.m15107a((C3353a) eVar);
        this.f15044b.m15127m();
    }

    /* renamed from: a */
    public void mo10629a(C3365e eVar, String str, boolean z) {
        this.f15044b.m15121j();
        this.f15044b.f14795a.mo10674b();
        boolean z2 = !C3456v.m15103a(str);
        C3396a.m14938b("Clickthrough event with playerHandles=" + z + " and url " + (z2 ? "defined" : "not defined"));
        if (!z) {
            C3396a.m14937a("Adapter handles click, ignoring click url.");
        } else if (z2) {
            C3396a.m14938b("Intent url=" + str);
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(this.f15044b.f15029o.f14840f instanceof Activity)) {
                C3396a.m14938b("Context is not instance of Activity");
                intent.addFlags(Engine.EXCEPTION_ERROR);
            }
            intent.setData(Uri.parse(str));
            this.f15044b.f15029o.f14840f.startActivity(intent);
        }
    }

    /* renamed from: b */
    public void mo10630b(C3365e eVar) {
        this.f15044b.m15121j();
        this.f15044b.f14795a.mo10675c();
    }

    /* renamed from: c */
    public void mo10631c(C3365e eVar) {
        this.f15044b.m15121j();
        this.f15044b.f14795a.mo10676d();
    }

    /* renamed from: d */
    public void mo10632d(C3365e eVar) {
        this.f15044b.m15121j();
        this.f15044b.f14795a.mo10677e();
    }
}
