package com.facebook.ads.internal.p069a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.cootek.smartinput5.engine.Engine;
import com.facebook.ads.internal.p077h.C3432c;

/* renamed from: com.facebook.ads.internal.a.d */
public class C3350d extends C3347a {

    /* renamed from: a */
    private static final String f14666a = C3350d.class.getSimpleName();

    /* renamed from: b */
    private final Context f14667b;

    /* renamed from: c */
    private final Uri f14668c;

    public C3350d(Context context, Uri uri) {
        this.f14667b = context;
        this.f14668c = uri;
    }

    /* renamed from: a */
    public C3432c.C3433a mo10576a() {
        return C3432c.C3433a.OPEN_LINK;
    }

    /* renamed from: b */
    public void mo10578b() {
        mo10577a(this.f14667b, this.f14668c);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f14668c.getQueryParameter("link")));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        try {
            this.f14667b.startActivity(intent);
        } catch (Exception e) {
            Log.d(f14666a, "Failed to open market url: " + this.f14668c.toString(), e);
        }
    }
}
