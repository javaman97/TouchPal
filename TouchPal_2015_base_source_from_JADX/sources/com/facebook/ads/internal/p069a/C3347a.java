package com.facebook.ads.internal.p069a;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.internal.p077h.C3432c;
import com.facebook.ads.internal.p077h.C3439h;
import com.facebook.ads.internal.p077h.C3451q;
import com.facebook.ads.internal.p077h.C3456v;

/* renamed from: com.facebook.ads.internal.a.a */
public abstract class C3347a {
    /* renamed from: a */
    public abstract C3432c.C3433a mo10576a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10577a(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("native_click_report_url");
        if (!C3456v.m15103a(queryParameter)) {
            new C3451q().execute(new String[]{queryParameter});
            C3439h.m15067a(context, "Click logged");
        }
    }

    /* renamed from: b */
    public abstract void mo10578b();
}
