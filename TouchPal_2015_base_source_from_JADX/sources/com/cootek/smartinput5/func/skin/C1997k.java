package com.cootek.smartinput5.func.skin;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.p001v4.app.C0062Q;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.nativeads.C1875a;
import com.cootek.smartinput5.func.nativeads.C1884i;
import com.cootek.smartinput5.func.nativeads.C1886k;
import com.cootek.smartinput5.func.nativeads.C1888m;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.func.nativeads.C1901x;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import com.facebook.ads.C3345i;
import com.facebook.ads.C3509x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.skin.k */
/* compiled from: SponsorThemeManager */
public class C1997k {

    /* renamed from: a */
    private static final String f6841a = "606141872785367_858974260835459";

    /* renamed from: b */
    private static C1997k f6842b;

    /* renamed from: c */
    private Context f6843c = C1368X.m6313b();

    /* renamed from: d */
    private String f6844d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ConcurrentHashMap<Long, C1875a> f6845e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private ConcurrentHashMap<String, C1888m> f6846f = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C1997k m9167a() {
        if (f6842b == null) {
            f6842b = new C1997k();
        }
        return f6842b;
    }

    private C1997k() {
    }

    /* renamed from: a */
    public void mo7300a(String str) {
        if (!TextUtils.isEmpty(str) && C1368X.m6320c().mo5841n().mo6284l(str) != null) {
            this.f6844d = str;
        }
    }

    /* renamed from: a */
    public void mo7299a(C1888m mVar) {
        if (!TextUtils.isEmpty(mVar.f6258f)) {
            this.f6846f.put(mVar.f6258f, mVar);
        }
    }

    /* renamed from: b */
    public void mo7303b(String str) {
        if (this.f6846f.containsKey(str)) {
            this.f6846f.get(str).mo6998b();
            this.f6846f.remove(str);
        }
    }

    /* renamed from: b */
    public void mo7302b() {
        if (!mo7305c()) {
            this.f6844d = null;
        } else if (TextUtils.isEmpty(this.f6844d)) {
        } else {
            if (Settings.getInstance().getStringSetting(80).equalsIgnoreCase(this.f6844d)) {
                this.f6844d = null;
                return;
            }
            m9171c(this.f6844d);
            this.f6844d = null;
        }
    }

    /* renamed from: c */
    private void m9171c(String str) {
        if (C1368X.m6320c().mo5841n().mo6284l(str) != null) {
            mo7301a(str, System.currentTimeMillis(), true);
        }
    }

    /* renamed from: a */
    public void mo7301a(String str, long j, boolean z) {
        if (!C1884i.m8660d()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C1899v.f6362a, 1);
                jSONObject.put(C1899v.f6378b, FacebookAdsActivity.f6799c);
                C1896t.m8712a().mo7035a(C1901x.sponsor_theme.mo7045a(), jSONObject.toString(), new C1998l(this, j, z, str));
            } catch (JSONException e) {
            }
        } else {
            C3509x xVar = new C3509x(this.f6843c, f6841a);
            xVar.mo10862a((C3345i) new C1999m(this, j, xVar, z, str));
            xVar.mo10516a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9170a(String str, long j, C1875a aVar) {
        C1601bg l = C1368X.m6320c().mo5841n().mo6284l(str);
        if (l != null) {
            Intent intent = new Intent(SponsorThemeReceiver.ACTION_SHOW_FACEBOOK_ADS);
            intent.putExtra(SponsorThemeReceiver.EXTRA_PKG_NAME, str);
            intent.putExtra(SponsorThemeReceiver.EXTRA_SKIN_NAME, l.f5100d);
            intent.putExtra(SponsorThemeReceiver.EXTRA_ADS_TIMESTAMP, j);
            PendingIntent broadcast = PendingIntent.getBroadcast(C1368X.m6313b(), str.hashCode(), intent, Engine.EXCEPTION_ERROR);
            C0062Q.C0070d dVar = new C0062Q.C0070d(C1368X.m6313b());
            dVar.mo260a(broadcast);
            dVar.mo254a((int) R.drawable.icon_small);
            dVar.mo288d(true);
            NotificationManager notificationManager = (NotificationManager) C1368X.m6313b().getSystemService("notification");
            Notification c = dVar.mo282c();
            c.flags |= 2;
            RemoteViews remoteViews = new RemoteViews(this.f6843c.getPackageName(), R.layout.ads_notification_layout);
            int a = C1368X.m6320c().mo5838k().mo6236a(l.f5932a, (int) R.drawable.icon);
            if (a > 0) {
                try {
                    remoteViews.setImageViewBitmap(R.id.icon, ((BitmapDrawable) l.f5932a.getResources().getDrawable(a)).getBitmap());
                    remoteViews.setTextViewText(R.id.apply, C1974m.m9063a(this.f6843c, (int) R.string.apply));
                    remoteViews.setTextViewText(R.id.title, l.f5100d);
                    String str2 = null;
                    if (aVar.mo7000c() == 0) {
                        str2 = ((C1888m) aVar).f6316m;
                    } else if (aVar.mo7000c() == 1) {
                        str2 = ((C1886k) aVar).mo7019d().mo10868f();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        remoteViews.setTextViewText(R.id.content, C1974m.m9064a(this.f6843c, (int) R.string.theme_sponsored_by, str2));
                    }
                    remoteViews.setTextViewText(R.id.time, new SimpleDateFormat("HH:mm").format(new Date()));
                    c.contentView = remoteViews;
                    notificationManager.notify(str.hashCode(), c);
                } catch (Resources.NotFoundException e) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7298a(Intent intent) {
        String stringExtra = intent.getStringExtra(SponsorThemeReceiver.EXTRA_PKG_NAME);
        String stringExtra2 = intent.getStringExtra(SponsorThemeReceiver.EXTRA_SKIN_NAME);
        long longExtra = intent.getLongExtra(SponsorThemeReceiver.EXTRA_ADS_TIMESTAMP, 0);
        if (stringExtra != null && this.f6845e.containsKey(Long.valueOf(longExtra))) {
            if (!Settings.getInstance().getStringSetting(80).equalsIgnoreCase(stringExtra)) {
                if (Engine.isInitialized()) {
                    Engine.getInstance().getIms().requestHideSelf(0);
                }
                Settings.getInstance().setStringSetting(80, stringExtra);
                Settings.getInstance().writeBack();
                C1368X.m6320c().mo5841n().mo6258a(stringExtra, false, true);
            }
            Intent intent2 = new Intent(this.f6843c, FacebookAdsActivity.class);
            intent2.addFlags(Engine.EXCEPTION_ERROR);
            intent2.putExtra(FacebookAdsActivity.f6797a, stringExtra2);
            intent2.putExtra(FacebookAdsActivity.f6798b, longExtra);
            this.f6843c.startActivity(intent2);
            C1246d.m6010a(this.f6843c).mo4591a(C1246d.f3891dB, "show_sponsor_theme_ads_notification", C1246d.f3908db);
        }
    }

    /* renamed from: a */
    public C1875a mo7297a(long j) {
        if (j == 0 || !this.f6845e.containsKey(Long.valueOf(j))) {
            return null;
        }
        C1875a aVar = this.f6845e.get(Long.valueOf(j));
        this.f6845e.remove(Long.valueOf(j));
        return aVar;
    }

    /* renamed from: b */
    public boolean mo7304b(long j) {
        return this.f6845e.containsKey(Long.valueOf(j));
    }

    /* renamed from: c */
    public boolean mo7305c() {
        if (C1617br.m7367a().mo6335b()) {
            return false;
        }
        return true;
    }
}
