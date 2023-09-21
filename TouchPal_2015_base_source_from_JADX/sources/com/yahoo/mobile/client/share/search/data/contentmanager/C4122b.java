package com.yahoo.mobile.client.share.search.data.contentmanager;

import android.content.Context;
import android.text.TextUtils;
import com.yahoo.mobile.client.share.search.commands.C4109d;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;
import com.yahoo.mobile.client.share.search.settings.C4129c;

/* renamed from: com.yahoo.mobile.client.share.search.data.contentmanager.b */
public class C4122b extends ContentManager {

    /* renamed from: d */
    private static final String f16738d = C4122b.class.getSimpleName();

    public C4122b(ContentManager.IContentHandler iContentHandler, Context context) {
        super(iContentHandler, context);
    }

    public SearchCommand getNewCommandInstance(SearchQuery searchQuery) {
        return new C4109d(this.f16736c, searchQuery, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15306a(String str) throws IllegalArgumentException {
        return str;
    }

    public void loadQuery(IQuery iQuery) throws NullPointerException, IllegalArgumentException {
        SearchQuery searchQuery = (SearchQuery) iQuery;
        if (mo15307a(searchQuery) && C4129c.m17441f()) {
            String queryString = searchQuery.getQueryString();
            if (C4129c.m17440e() || !TextUtils.isEmpty(queryString)) {
                super.loadQuery(iQuery);
                return;
            }
            cancelBackgroundTasks();
            this.f16735b.onContentReceived(this, (SearchResponseData) null, searchQuery);
        }
    }
}
