package android.support.p001v4.widget;

import android.support.p001v4.widget.C0599x;
import android.widget.SearchView;

/* renamed from: android.support.v4.widget.y */
/* compiled from: SearchViewCompatHoneycomb */
final class C0602y implements SearchView.OnQueryTextListener {

    /* renamed from: a */
    final /* synthetic */ C0599x.C0601b f1443a;

    C0602y(C0599x.C0601b bVar) {
        this.f1443a = bVar;
    }

    public boolean onQueryTextSubmit(String str) {
        return this.f1443a.mo2027a(str);
    }

    public boolean onQueryTextChange(String str) {
        return this.f1443a.mo2028b(str);
    }
}
