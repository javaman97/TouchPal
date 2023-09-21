package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchHistoryCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.p098c.C4095c;

/* renamed from: com.yahoo.mobile.client.share.search.commands.b */
public final class C4106b extends SearchHistoryCommand {

    /* renamed from: a */
    private final C4095c f16617a;

    public C4106b(Context context) {
        super(context, new SearchQuery(new SearchQuery.Builder()), SearchHistoryCommand.SearchHistoryActionEnum.DELETE_ALL);
        this.f16617a = new C4095c(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15086a(int i) {
        if (this.f16592e != null) {
            this.f16592e.onSearchTaskError(this, new SearchError(getCommandType(), i, (Object) null), this.f16593f);
        }
    }

    public final void onCompleted(SearchResponseData searchResponseData) {
        this.f16617a.mo15075a();
        super.onCompleted(searchResponseData);
    }
}
