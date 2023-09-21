package com.cootek.smartinput5.func.nativeads;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/* renamed from: com.cootek.smartinput5.func.nativeads.o */
/* compiled from: NativeAds */
class C1891o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6333a;

    /* renamed from: b */
    final /* synthetic */ C1888m f6334b;

    C1891o(C1888m mVar, String str) {
        this.f6334b = mVar;
        this.f6333a = str;
    }

    public void run() {
        try {
            new DefaultHttpClient().execute(new HttpGet(this.f6333a));
        } catch (IOException | ClientProtocolException e) {
        }
    }
}
