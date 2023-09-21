package com.yahoo.mobile.client.share.search.data.contentmanager;

import android.view.View;
import android.widget.BaseAdapter;
import com.yahoo.mobile.client.share.search.data.SearchQuery;

public interface IListViewAdapterHandler {
    void onShowRowView(BaseAdapter baseAdapter, int i, View view, SearchQuery searchQuery);
}
