package com.cootek.smartinput5.daemon;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.net.cmd.C2261Q;

/* renamed from: com.cootek.smartinput5.daemon.a */
/* compiled from: DaemonManager */
final class C1248a extends Handler {
    C1248a() {
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                boolean unused = DaemonManager.f3960b = true;
                try {
                    String l = C2225al.m10078l(DaemonManager.f3961c);
                    String locale = C1368X.m6313b().getResources().getConfiguration().locale.toString();
                    long longSetting = Settings.getInstance().getLongSetting(Settings.IME_CUR_VERSION_INSTALL_TIME);
                    DaemonManager.init(C2225al.m10053a(DaemonManager.f3961c, C2258O.UNINSITALL_SURVEY) + C2261Q.f9786ag, DaemonManager.m6043c(DaemonManager.f3961c), DaemonManager.m6037a(), l, locale, Settings.getInstance().getLongSetting(Settings.FIRST_INSTALL_TIME), longSetting, DaemonManager.m6042b());
                    return;
                } catch (UnsatisfiedLinkError e) {
                    boolean unused2 = DaemonManager.f3960b = false;
                    return;
                }
            default:
                return;
        }
    }
}
