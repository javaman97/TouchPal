package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.os.Bundle;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.b */
public class C4207b {
    /* renamed from: b */
    private static SearchResultFragment m17682b(String str) {
        try {
            return (SearchResultFragment) C4207b.class.getClassLoader().loadClass(str).newInstance();
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(str + " does not extend SearchResultFragment.");
        } catch (Exception e2) {
            throw new RuntimeException(" Problem Loading " + str + " " + e2.getMessage());
        }
    }

    /* renamed from: a */
    public static List<SearchResultFragment> m17678a(Context context, List<Bundle> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle next : list) {
            String string = next.getString(SearchActivity.TAB_CLASS_NAME_KEY);
            SearchResultFragment b = m17682b(string);
            if (b != null) {
                if (m17679a(b) && m17681a((List<SearchResultFragment>) arrayList, b)) {
                    throw new IllegalArgumentException("Duplicated Yahoo verticals are not allowed: " + string);
                } else if (b.isAvailable(context)) {
                    Bundle bundle = next.getBundle(SearchActivity.TAB_ARGUMENTS_KEY);
                    if (bundle != null) {
                        b.setArguments(bundle);
                    }
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m17681a(List<SearchResultFragment> list, SearchResultFragment searchResultFragment) {
        for (SearchResultFragment searchResultFragment2 : list) {
            if (searchResultFragment2.getClass() == searchResultFragment.getClass()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m17680a(String str) {
        return m17679a(m17682b(str));
    }

    /* renamed from: a */
    private static boolean m17679a(SearchResultFragment searchResultFragment) {
        return searchResultFragment != null && (searchResultFragment instanceof ContentFragment);
    }
}
