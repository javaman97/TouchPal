package com.cootek.smartinput5.func;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.func.ac */
/* compiled from: FuncManager */
class C1421ac implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ File f4551a;

    /* renamed from: b */
    final /* synthetic */ C1368X f4552b;

    C1421ac(C1368X x, File file) {
        this.f4552b = x;
        this.f4551a = file;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2243D d = (C2243D) p;
        if (p.f9746O == 200) {
            this.f4552b.f4276b = C2243D.m10187a(d.f9522h);
            if (!C2188Q.m9853a().mo7686f()) {
                return;
            }
            if (C2188Q.m9853a().mo7685e()) {
                this.f4552b.m6294a(this.f4551a);
            } else {
                m6661a();
            }
        }
    }

    /* renamed from: a */
    private void m6661a() {
        if (!TextUtils.isEmpty(this.f4552b.f4276b)) {
            Notification notification = new Notification();
            notification.icon = R.drawable.icon_small;
            notification.flags = 16;
            Intent intent = new Intent(OemSkinDownloadReceiver.ACTION_OEM_SKIN_DOWNLOAD);
            intent.setAction(OemSkinDownloadReceiver.ACTION_OEM_SKIN_DOWNLOAD);
            intent.putExtra("url", this.f4552b.f4276b);
            intent.putExtra(OemSkinDownloadReceiver.TARGET_FILE, this.f4551a.getAbsolutePath());
            PendingIntent broadcast = PendingIntent.getBroadcast(C1368X.f4254i, R.string.app_name, intent, Engine.EXCEPTION_WARN);
            String a = C1974m.m9063a(C1368X.f4254i, (int) R.string.paopao_oem_skin_available);
            notification.tickerText = a;
            notification.setLatestEventInfo(C1368X.f4254i, a, C1974m.m9063a(C1368X.f4254i, (int) R.string.super_dict_notification_sub_title), broadcast);
            ((NotificationManager) C1368X.f4254i.getSystemService("notification")).notify(Settings.UPDATE_OEM, notification);
            C1246d.m6010a(C1368X.f4254i).mo4591a("OEM_SKIN_SKIN_UPDATENOTIFICATION", "SHOW", C1246d.f3836c);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
