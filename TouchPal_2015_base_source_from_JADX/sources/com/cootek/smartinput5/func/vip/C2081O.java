package com.cootek.smartinput5.func.vip;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.util.Date;

/* renamed from: com.cootek.smartinput5.func.vip.O */
/* compiled from: VipRenewChecker */
public class C2081O extends C2220ah {
    public C2081O(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.VIP_RENEW_CHECK_NEXT_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.VIP_RENEW_CHECK_NEXT_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        C1617br.m7367a().mo6328a((C1617br.C1618a) new C2082P(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m9483e() {
        int i;
        long c = C1617br.m7367a().mo6336c();
        long time = new Date().getTime();
        if (time == 0 || c == 0) {
            i = 0;
        } else {
            i = (int) Math.ceil((double) ((((time / 1000) - c) / 3600) / 24));
        }
        int intSetting = Settings.getInstance().getIntSetting(Settings.VIP_RENEW_REMINDER);
        C2089Q q = new C2089Q();
        if (i < 10 || intSetting != 0 || !q.mo7466d()) {
            return false;
        }
        Settings.getInstance().setIntSetting(Settings.VIP_RENEW_REMINDER, 1);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9484g() {
        Notification notification = new Notification();
        notification.icon = R.drawable.icon_small;
        notification.flags = 16;
        notification.defaults = 2;
        Context b = C1368X.m6313b();
        Intent intent = new Intent(b, VipRenewActivity.class);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        notification.setLatestEventInfo(b, C1974m.m9063a(b, (int) R.string.vip_renew_notification_title), (CharSequence) null, PendingIntent.getActivity(b, R.string.app_name, intent, Engine.EXCEPTION_WARN));
        ((NotificationManager) b.getSystemService("notification")).notify(Settings.VIP_RENEW_REMINDER, notification);
        if (b != null) {
            C1246d.m6010a(b).mo4591a(C1246d.f3870ch, "SHOW", C1246d.f3933e);
        }
    }
}
