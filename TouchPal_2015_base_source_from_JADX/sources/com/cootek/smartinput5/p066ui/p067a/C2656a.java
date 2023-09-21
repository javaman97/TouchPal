package com.cootek.smartinput5.p066ui.p067a;

import android.content.Context;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput5.p066ui.p068b.C2716a;

/* renamed from: com.cootek.smartinput5.ui.a.a */
/* compiled from: AbsExtensionGuidePoint */
public abstract class C2656a extends C2716a implements C2659d {

    /* renamed from: a */
    private String f11971a = null;

    public C2656a(Context context, String str) {
        super(context, str);
    }

    public C2656a(Context context, String str, String str2) {
        super(context, str);
        this.f11971a = str2;
    }

    /* renamed from: c */
    public String mo8889c() {
        return this.f11971a;
    }

    /* renamed from: d */
    public void mo8890d() {
        if (this.f11971a != null) {
            PresentationManager.shown(this.f11971a);
        }
        super.mo8890d();
    }

    /* renamed from: e */
    public void mo8891e() {
        if (this.f11971a != null) {
            PresentationManager.clicked(this.f11971a);
        }
        super.mo8891e();
    }
}
