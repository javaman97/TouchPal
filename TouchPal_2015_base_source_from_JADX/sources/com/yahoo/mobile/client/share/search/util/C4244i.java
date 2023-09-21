package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import com.yahoo.mobile.client.share.search.interfaces.INetworkAsync;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.util.i */
public class C4244i {

    /* renamed from: a */
    public static final String f17340a = C4244i.class.getSimpleName();

    /* renamed from: b */
    protected Context f17341b;

    public C4244i(Context context) {
        this.f17341b = context;
    }

    /* renamed from: a */
    public final void mo15879a() {
        C4129c.m17444i().getNetwork(this.f17341b).requestAsync("https://m.search.yahoo.com/v1/tpc.gif?" + System.currentTimeMillis(), 0, (Map<String, String>) null, (byte[]) null, (INetworkAsync.Listener) null, (INetworkAsync.Parser) null, 0, "SUGGEST_QUEUE");
    }
}
