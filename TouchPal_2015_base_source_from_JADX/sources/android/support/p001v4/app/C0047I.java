package android.support.p001v4.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v4.app.I */
/* compiled from: ListFragment */
class C0047I implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0045G f83a;

    C0047I(C0045G g) {
        this.f83a = g;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f83a.mo179a((ListView) adapterView, view, i, j);
    }
}
