package com.yahoo.mobile.client.share.search.data.contentmanager;

import android.content.Context;
import com.yahoo.mobile.client.share.search.commands.C4113f;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;

/* renamed from: com.yahoo.mobile.client.share.search.data.contentmanager.d */
public class C4124d extends ContentManager {

    /* renamed from: d */
    private static final String f16739d = C4124d.class.getSimpleName();

    public C4124d(ContentManager.IContentHandler iContentHandler, Context context) {
        super(iContentHandler, context);
    }

    public SearchCommand getNewCommandInstance(SearchQuery searchQuery) {
        return new C4113f(this.f16736c, searchQuery, this);
    }

    public void loadQuery(IQuery iQuery) throws NullPointerException, IllegalArgumentException {
        SearchQuery.Builder builder = new SearchQuery.Builder((SearchQuery) iQuery);
        builder.setCount(30);
        super.loadQuery(new SearchQuery(builder));
    }
}
