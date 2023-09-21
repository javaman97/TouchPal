package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import com.android.volley.C0840s;
import com.android.volley.C0883x;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.interfaces.INetworkAsync;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.i */
final class C4263i implements C0840s.C0841a {

    /* renamed from: a */
    final /* synthetic */ INetworkAsync.Listener f17422a;

    /* renamed from: b */
    final /* synthetic */ C4260h f17423b;

    C4263i(C4260h hVar, INetworkAsync.Listener listener) {
        this.f17423b = hVar;
        this.f17422a = listener;
    }

    /* renamed from: a */
    public final void mo3102a(C0883x xVar) {
        if (this.f17422a != null) {
            this.f17422a.onError(new SearchError(-1, 4, xVar));
        }
    }
}
