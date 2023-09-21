package com.yahoo.mobile.client.share.search.data.contentmanager;

import android.content.Context;
import com.yahoo.mobile.client.share.search.commands.C4111e;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.settings.C4129c;

/* renamed from: com.yahoo.mobile.client.share.search.data.contentmanager.c */
public final class C4123c extends ContentManager {
    public C4123c(ContentManager.IContentHandler iContentHandler, Context context) {
        super(iContentHandler, context);
    }

    public final SearchCommand getNewCommandInstance(SearchQuery searchQuery) {
        return new C4111e(this.f16736c, searchQuery, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15306a(String str) throws IllegalArgumentException {
        return str;
    }

    /* renamed from: b */
    public final void mo15318b(SearchQuery searchQuery) throws NullPointerException, IllegalArgumentException {
        if (C4129c.m17450o()) {
            super.loadQuery(searchQuery);
        }
    }
}
