package android.support.p001v4.widget;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import android.widget.SearchView;
import com.cootek.smartinput5.p066ui.EnterKey;

/* renamed from: android.support.v4.widget.x */
/* compiled from: SearchViewCompatHoneycomb */
class C0599x {

    /* renamed from: android.support.v4.widget.x$a */
    /* compiled from: SearchViewCompatHoneycomb */
    interface C0600a {
        /* renamed from: a */
        boolean mo2029a();
    }

    /* renamed from: android.support.v4.widget.x$b */
    /* compiled from: SearchViewCompatHoneycomb */
    interface C0601b {
        /* renamed from: a */
        boolean mo2027a(String str);

        /* renamed from: b */
        boolean mo2028b(String str);
    }

    C0599x() {
    }

    /* renamed from: a */
    public static View m3467a(Context context) {
        return new SearchView(context);
    }

    /* renamed from: a */
    public static void m3472a(View view, ComponentName componentName) {
        SearchView searchView = (SearchView) view;
        searchView.setSearchableInfo(((SearchManager) searchView.getContext().getSystemService(EnterKey.SEARCH)).getSearchableInfo(componentName));
    }

    /* renamed from: a */
    public static Object m3470a(C0601b bVar) {
        return new C0602y(bVar);
    }

    /* renamed from: a */
    public static void m3476a(Object obj, Object obj2) {
        ((SearchView) obj).setOnQueryTextListener((SearchView.OnQueryTextListener) obj2);
    }

    /* renamed from: a */
    public static Object m3469a(C0600a aVar) {
        return new C0603z(aVar);
    }

    /* renamed from: b */
    public static void m3478b(Object obj, Object obj2) {
        ((SearchView) obj).setOnCloseListener((SearchView.OnCloseListener) obj2);
    }

    /* renamed from: a */
    public static CharSequence m3468a(View view) {
        return ((SearchView) view).getQuery();
    }

    /* renamed from: a */
    public static void m3474a(View view, CharSequence charSequence, boolean z) {
        ((SearchView) view).setQuery(charSequence, z);
    }

    /* renamed from: a */
    public static void m3473a(View view, CharSequence charSequence) {
        ((SearchView) view).setQueryHint(charSequence);
    }

    /* renamed from: a */
    public static void m3475a(View view, boolean z) {
        ((SearchView) view).setIconified(z);
    }

    /* renamed from: b */
    public static boolean m3479b(View view) {
        return ((SearchView) view).isIconified();
    }

    /* renamed from: b */
    public static void m3477b(View view, boolean z) {
        ((SearchView) view).setSubmitButtonEnabled(z);
    }

    /* renamed from: c */
    public static boolean m3481c(View view) {
        return ((SearchView) view).isSubmitButtonEnabled();
    }

    /* renamed from: c */
    public static void m3480c(View view, boolean z) {
        ((SearchView) view).setQueryRefinementEnabled(z);
    }

    /* renamed from: d */
    public static boolean m3482d(View view) {
        return ((SearchView) view).isQueryRefinementEnabled();
    }

    /* renamed from: a */
    public static void m3471a(View view, int i) {
        ((SearchView) view).setMaxWidth(i);
    }
}
