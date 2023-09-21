package android.support.p001v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;

/* renamed from: android.support.v4.widget.SearchViewCompatIcs */
class SearchViewCompatIcs {
    SearchViewCompatIcs() {
    }

    /* renamed from: android.support.v4.widget.SearchViewCompatIcs$MySearchView */
    public static class MySearchView extends SearchView {
        public MySearchView(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void mo1814a() {
            setQuery("", false);
            super.onActionViewCollapsed();
        }
    }

    /* renamed from: a */
    public static View m3060a(Context context) {
        return new MySearchView(context);
    }

    /* renamed from: a */
    public static void m3061a(View view, int i) {
        ((SearchView) view).setImeOptions(i);
    }

    /* renamed from: b */
    public static void m3062b(View view, int i) {
        ((SearchView) view).setInputType(i);
    }
}
