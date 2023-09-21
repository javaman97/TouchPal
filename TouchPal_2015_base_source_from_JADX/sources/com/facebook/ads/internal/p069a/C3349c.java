package com.facebook.ads.internal.p069a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.cootek.smartinput5.engine.Engine;
import com.facebook.ads.internal.p077h.C3432c;
import com.facebook.ads.internal.p077h.C3438g;
import com.facebook.ads.internal.p077h.C3443j;
import com.facebook.ads.internal.p077h.C3456v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.c */
public class C3349c extends C3347a {

    /* renamed from: a */
    private static final String f14663a = C3349c.class.getSimpleName();

    /* renamed from: b */
    private final Context f14664b;

    /* renamed from: c */
    private final Uri f14665c;

    public C3349c(Context context, Uri uri) {
        this.f14664b = context;
        this.f14665c = uri;
    }

    /* renamed from: a */
    private Intent m14738a(C3443j jVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(Engine.EXCEPTION_ERROR);
        if (!C3456v.m15103a(jVar.mo10766a()) && !C3456v.m15103a(jVar.mo10767b())) {
            intent.setComponent(new ComponentName(jVar.mo10766a(), jVar.mo10767b()));
        }
        if (!C3456v.m15103a(jVar.mo10768c())) {
            intent.setData(Uri.parse(jVar.mo10768c()));
        }
        return intent;
    }

    /* renamed from: b */
    private Intent m14739b(C3443j jVar) {
        if (C3456v.m15103a(jVar.mo10766a())) {
            return null;
        }
        if (!C3438g.m15060a(this.f14664b, jVar.mo10766a())) {
            return null;
        }
        String c = jVar.mo10768c();
        if (!C3456v.m15103a(c) && (c.startsWith("tel:") || c.startsWith("telprompt:"))) {
            return new Intent("android.intent.action.CALL", Uri.parse(c));
        }
        PackageManager packageManager = this.f14664b.getPackageManager();
        if (C3456v.m15103a(jVar.mo10767b()) && C3456v.m15103a(c)) {
            return packageManager.getLaunchIntentForPackage(jVar.mo10766a());
        }
        Intent a = m14738a(jVar);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(a, 65536);
        if (a.getComponent() == null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo.packageName.equals(jVar.mo10766a())) {
                    a.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    break;
                }
            }
        }
        if (queryIntentActivities.isEmpty() || a.getComponent() == null) {
            return null;
        }
        return a;
    }

    /* renamed from: f */
    private List<C3443j> m14740f() {
        String queryParameter = this.f14665c.getQueryParameter("appsite_data");
        if (C3456v.m15103a(queryParameter) || "[]".equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray("android");
            if (optJSONArray == null) {
                return arrayList;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                C3443j a = C3443j.m15078a(optJSONArray.optJSONObject(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            Log.w(f14663a, "Error parsing appsite_data", e);
            return arrayList;
        }
    }

    /* renamed from: a */
    public C3432c.C3433a mo10576a() {
        return C3432c.C3433a.OPEN_STORE;
    }

    /* renamed from: b */
    public void mo10578b() {
        mo10577a(this.f14664b, this.f14665c);
        List<Intent> d = mo10580d();
        if (d != null) {
            for (Intent startActivity : d) {
                try {
                    this.f14664b.startActivity(startActivity);
                    return;
                } catch (Exception e) {
                    Log.d(f14663a, "Failed to open app intent, falling back", e);
                }
            }
        }
        mo10581e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Uri mo10579c() {
        String queryParameter = this.f14665c.getQueryParameter("store_url");
        if (!C3456v.m15103a(queryParameter)) {
            return Uri.parse(queryParameter);
        }
        return Uri.parse(String.format("market://details?id=%s", new Object[]{this.f14665c.getQueryParameter("store_id")}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<Intent> mo10580d() {
        List<C3443j> f = m14740f();
        ArrayList arrayList = new ArrayList();
        if (f != null) {
            for (C3443j b : f) {
                Intent b2 = m14739b(b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo10581e() {
        Intent intent = new Intent("android.intent.action.VIEW", mo10579c());
        intent.addFlags(Engine.EXCEPTION_ERROR);
        try {
            this.f14664b.startActivity(intent);
        } catch (Exception e) {
            Log.d(f14663a, "Failed to open market url: " + this.f14665c.toString(), e);
            String queryParameter = this.f14665c.getQueryParameter("store_url_web_fallback");
            if (queryParameter != null && queryParameter.length() > 0) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(queryParameter));
                intent2.addFlags(Engine.EXCEPTION_ERROR);
                try {
                    this.f14664b.startActivity(intent2);
                } catch (Exception e2) {
                    Log.d(f14663a, "Failed to open fallback url: " + queryParameter, e2);
                }
            }
        }
    }
}
