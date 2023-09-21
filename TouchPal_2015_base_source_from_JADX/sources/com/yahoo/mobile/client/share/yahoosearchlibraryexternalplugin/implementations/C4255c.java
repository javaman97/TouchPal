package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.c */
final class C4255c implements ComponentCallbacks {

    /* renamed from: a */
    final /* synthetic */ C4252b f17414a;

    C4255c(C4252b bVar) {
        this.f17414a = bVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        this.f17414a.f17405a.mo2926d();
    }
}
