package com.yahoo.mobile.client.share.search.data.contentmanager;

import android.content.Context;
import com.yahoo.mobile.client.share.search.commands.C4115g;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4213f;

/* renamed from: com.yahoo.mobile.client.share.search.data.contentmanager.e */
public final class C4125e extends ContentManager {

    /* renamed from: d */
    public static final String f16740d = C4213f.class.getSimpleName();

    /* renamed from: e */
    private boolean f16741e = true;

    /* renamed from: f */
    private boolean f16742f = true;

    public C4125e(ContentManager.IContentHandler iContentHandler, Context context, boolean z, boolean z2) {
        super(iContentHandler, context);
        this.f16741e = z;
        this.f16742f = z2;
    }

    public final SearchCommand getNewCommandInstance(SearchQuery searchQuery) {
        return new C4115g(this.f16736c, new SearchQuery(new SearchQuery.Builder(searchQuery).showMoreImagesLink(this.f16741e).showMoreVideosLink(this.f16742f)), this);
    }
}
