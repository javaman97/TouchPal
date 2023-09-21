package com.yahoo.mobile.client.share.search.data.contentmanager;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;
import com.yahoo.mobile.client.share.search.commands.C4107c;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;

/* renamed from: com.yahoo.mobile.client.share.search.data.contentmanager.a */
public final class C4121a extends ContentManager {
    public C4121a(ContentManager.IContentHandler iContentHandler, Context context) {
        super(iContentHandler, context);
    }

    public final SearchCommand getNewCommandInstance(SearchQuery searchQuery) {
        return new C4107c(this.f16736c, searchQuery, this);
    }

    public final void loadQuery(IQuery iQuery) throws NullPointerException, IllegalArgumentException {
        SearchQuery searchQuery = (SearchQuery) iQuery;
        SearchQuery.Builder builder = new SearchQuery.Builder(searchQuery);
        if (searchQuery.getOffset() > 0) {
            builder.setCount(Settings.SHOW_PRIVACY_POLICY);
        } else {
            builder.setCount(C4107c.f16618a);
        }
        super.loadQuery(new SearchQuery(builder));
    }
}
