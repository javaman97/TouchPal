package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.net.Uri;
import com.yahoo.mobile.client.share.search.data.SearchQuery;

public interface IUrlBuilder {
    Uri buildUrl(Context context, SearchQuery searchQuery);
}
