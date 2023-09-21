package com.cootek.smartinput5.p066ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.mainentrance.C1859m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.aJ */
/* compiled from: InstalledSkinFragment */
public class C2995aJ extends C3041b {

    /* renamed from: a */
    private static final String f13820a = "InstalledSkinActivity";

    /* renamed from: b */
    private LinearLayout f13821b = null;

    /* renamed from: c */
    private C1859m f13822c;

    /* renamed from: a */
    public void mo10075a(C1859m mVar) {
        this.f13822c = mVar;
        if (this.f13822c != null) {
            this.f13822c.mo6901c();
        }
    }

    /* renamed from: a */
    private View m14195a(LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.local_skin, (ViewGroup) null);
        this.f13821b = (LinearLayout) inflate.findViewById(R.id.skin_list_container);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo10077c() {
        if (!C1368X.m6324d() || this.f13822c == null) {
            return null;
        }
        this.f13822c.mo6957g();
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10076a(Object obj) {
        mo10149a(m14195a(mo10148a()));
        if (this.f13822c != null && this.f13821b != null) {
            this.f13821b.removeAllViews();
            this.f13821b.addView(this.f13822c.mo6900b());
        }
    }
}
