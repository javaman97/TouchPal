package android.support.p001v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.f */
/* compiled from: CursorFilter */
class C0559f extends Filter {

    /* renamed from: a */
    C0560a f1410a;

    /* renamed from: android.support.v4.widget.f$a */
    /* compiled from: CursorFilter */
    interface C0560a {
        /* renamed from: a */
        Cursor mo1917a();

        /* renamed from: a */
        Cursor mo1918a(CharSequence charSequence);

        /* renamed from: a */
        void mo1922a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo1687c(Cursor cursor);
    }

    C0559f(C0560a aVar) {
        this.f1410a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1410a.mo1687c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f1410a.mo1918a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f1410a.mo1917a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f1410a.mo1922a((Cursor) filterResults.values);
        }
    }
}
