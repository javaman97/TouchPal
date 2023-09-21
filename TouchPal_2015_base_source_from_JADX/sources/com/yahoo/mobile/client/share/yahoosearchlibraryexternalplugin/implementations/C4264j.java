package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import com.android.volley.C0840s;
import com.yahoo.mobile.client.share.search.interfaces.INetworkAsync;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.j */
final class C4264j implements C0840s.C0842b<T> {

    /* renamed from: a */
    final /* synthetic */ INetworkAsync.Listener f17424a;

    /* renamed from: b */
    final /* synthetic */ C4260h f17425b;

    C4264j(C4260h hVar, INetworkAsync.Listener listener) {
        this.f17425b = hVar;
        this.f17424a = listener;
    }

    /* renamed from: a */
    public final void mo3103a(T t) {
        if (this.f17424a != null) {
            this.f17424a.onResponse(t);
        }
    }
}
