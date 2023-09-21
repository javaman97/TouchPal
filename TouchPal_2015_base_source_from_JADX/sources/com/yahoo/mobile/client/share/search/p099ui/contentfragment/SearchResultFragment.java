package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.support.p001v4.app.Fragment;
import com.yahoo.mobile.client.share.search.interfaces.IQueryManager;
import com.yahoo.mobile.client.share.search.interfaces.ISearchVertical;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.SearchResultFragment */
public abstract class SearchResultFragment extends Fragment implements ISearchVertical, IScrollable {
    public abstract IQueryManager getContentManager();

    public abstract String getLabel(Context context);

    public abstract void moveBackgroundWithParallax(int i, boolean z, Context context);

    public abstract void setBottomPadding(int i);

    public abstract void setTopPadding(int i);

    public String getVerticalId() {
        return toString();
    }

    public void setBackgroundColor(int i) {
    }

    public boolean isAvailable(Context context) {
        return true;
    }
}
