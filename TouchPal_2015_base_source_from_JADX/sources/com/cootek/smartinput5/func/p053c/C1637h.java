package com.cootek.smartinput5.func.p053c;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.mainentrance.MainEntranceActivity;
import com.cootek.smartinput5.p066ui.settings.RateUsActivity;
import com.cootek.smartinput5.p066ui.settings.TouchPalUpdateActivity;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.c.h */
/* compiled from: PaopaoNotificationGenerator */
public class C1637h {

    /* renamed from: a */
    public static final String f5316a = "com.cootek.smartinputv5.action.paopao_notification.run";

    /* renamed from: b */
    private Context f5317b;

    /* renamed from: com.cootek.smartinput5.func.c.h$a */
    /* compiled from: PaopaoNotificationGenerator */
    public class C1638a {

        /* renamed from: a */
        int f5318a;

        /* renamed from: b */
        Notification f5319b = new Notification();

        public C1638a() {
            this.f5319b.icon = R.drawable.icon_small;
        }
    }

    public C1637h(Context context) {
        this.f5317b = context;
    }

    /* renamed from: a */
    public C1638a mo6438a(C1631b bVar) {
        if (bVar.f5285b == 1073741825) {
            return m7497b(bVar);
        }
        if (bVar.f5285b == 1073741827) {
            return m7498c(bVar);
        }
        if (bVar.f5285b == 1073741833) {
            return m7499d(bVar);
        }
        return null;
    }

    /* renamed from: b */
    private C1638a m7497b(C1631b bVar) {
        C1638a aVar = new C1638a();
        aVar.f5318a = bVar.f5285b;
        aVar.f5319b.tickerText = bVar.f5287k;
        aVar.f5319b.defaults = 1;
        aVar.f5319b.flags = 16;
        Intent intent = new Intent(this.f5317b, TouchPalUpdateActivity.class);
        intent.setAction(f5316a);
        intent.putExtra("HAS_UPDATE", true);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        aVar.f5319b.setLatestEventInfo(this.f5317b, bVar.f5287k, bVar.f5288l, PendingIntent.getActivity(this.f5317b, bVar.f5285b, intent, Engine.EXCEPTION_WARN));
        return aVar;
    }

    /* renamed from: c */
    private C1638a m7498c(C1631b bVar) {
        C1638a aVar = new C1638a();
        aVar.f5318a = bVar.f5285b;
        aVar.f5319b.tickerText = bVar.f5287k;
        aVar.f5319b.flags = 16;
        Intent intent = new Intent(this.f5317b, MainEntranceActivity.class);
        intent.putExtra("tabNumber", 1);
        intent.putExtra("fromNotification", true);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        aVar.f5319b.setLatestEventInfo(this.f5317b, bVar.f5287k, bVar.f5288l, PendingIntent.getActivity(this.f5317b, bVar.f5285b, intent, Engine.EXCEPTION_WARN));
        return aVar;
    }

    /* renamed from: d */
    private C1638a m7499d(C1631b bVar) {
        C1638a aVar = new C1638a();
        aVar.f5318a = bVar.f5285b;
        aVar.f5319b.tickerText = bVar.f5287k;
        aVar.f5319b.flags = 16;
        Intent intent = new Intent(this.f5317b, RateUsActivity.class);
        intent.putExtra("fromNotification", true);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        aVar.f5319b.setLatestEventInfo(this.f5317b, bVar.f5287k, bVar.f5288l, PendingIntent.getActivity(this.f5317b, bVar.f5285b, intent, Engine.EXCEPTION_WARN));
        return aVar;
    }
}
