package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.os.Handler;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.google.android.gms.games.GamesClient;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.component.s */
/* compiled from: ContactImporter */
public class C1686s {

    /* renamed from: a */
    private final int f5503a = 30;

    /* renamed from: b */
    private final int f5504b = GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE;

    /* renamed from: c */
    private ContactProvider f5505c;

    /* renamed from: d */
    private Context f5506d;

    /* renamed from: e */
    private List<String> f5507e;

    /* renamed from: f */
    private int f5508f;

    /* renamed from: g */
    private Handler f5509g;

    /* renamed from: h */
    private Runnable f5510h;

    public C1686s(Context context) {
        this.f5506d = context;
        this.f5505c = ContactProvider.createContactProvider();
        this.f5508f = 0;
        this.f5510h = new C1687t(this);
        this.f5509g = new Handler();
    }

    /* renamed from: a */
    public void mo6559a() {
        if (!Settings.getInstance().getBoolSetting(Settings.ONCE_CLEAR_CONTACT)) {
            if (!Settings.getInstance().getBoolSetting(Settings.CONTACT_IMPORTED)) {
                if (C1368X.m6324d()) {
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getUsrDicChecker().mo6518a(0, false);
                    }
                    m7782c();
                }
            } else if (this.f5507e != null) {
                this.f5507e.clear();
                this.f5507e = null;
            }
        }
    }

    /* renamed from: c */
    private void m7782c() {
        if (Engine.isInitialized() && !Engine.getInstance().getIms().isInputViewShown()) {
            if (this.f5508f == 0) {
                this.f5507e = this.f5505c.getContactNames(this.f5506d, (String) null);
            } else if (this.f5507e != null) {
                int i = (this.f5508f - 1) * 30;
                int i2 = this.f5508f * 30;
                if (this.f5507e.size() > i) {
                    Okinawa h = C1368X.m6320c().mo5835h();
                    h.fireTransactionOperation(1);
                    int i3 = i;
                    while (true) {
                        if (i3 >= i2) {
                            break;
                        } else if (i3 >= this.f5507e.size()) {
                            Settings.getInstance().setBoolSetting(Settings.CONTACT_IMPORTED, true);
                            this.f5508f = -1;
                            break;
                        } else {
                            h.fireAddUserwordOperation("", this.f5507e.get(i3), 5);
                            i3++;
                        }
                    }
                    h.fireTransactionOperation(2);
                    h.processEvent();
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getUsrDicChecker().mo6518a(0, true);
                    }
                } else {
                    Settings.getInstance().setBoolSetting(Settings.CONTACT_IMPORTED, true);
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getUsrDicChecker().mo6518a(0, true);
                    }
                    this.f5508f = -1;
                }
            } else {
                this.f5508f = -1;
            }
            this.f5508f++;
            if (this.f5509g != null) {
                this.f5509g.postDelayed(this.f5510h, 3000);
            }
        }
    }

    /* renamed from: b */
    public void mo6560b() {
        if (this.f5507e != null) {
            this.f5507e.clear();
            this.f5507e = null;
        }
        this.f5508f = 0;
    }
}
