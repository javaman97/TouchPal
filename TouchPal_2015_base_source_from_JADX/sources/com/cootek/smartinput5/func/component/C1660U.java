package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.os.Handler;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.google.android.gms.games.GamesClient;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.component.U */
/* compiled from: SysUserDicImporter */
public class C1660U {

    /* renamed from: a */
    private final int f5398a = 30;

    /* renamed from: b */
    private final int f5399b = GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE;

    /* renamed from: c */
    private C1663X f5400c;

    /* renamed from: d */
    private List<String> f5401d;

    /* renamed from: e */
    private Context f5402e;

    /* renamed from: f */
    private int f5403f;

    /* renamed from: g */
    private Handler f5404g;

    /* renamed from: h */
    private Runnable f5405h;

    public C1660U(Context context) {
        this.f5402e = context;
        this.f5403f = 0;
        this.f5400c = C1663X.m7611a(this.f5402e);
        this.f5404g = new Handler();
        this.f5405h = new C1661V(this);
    }

    /* renamed from: a */
    public void mo6483a() {
        if (!Settings.getInstance().getBoolSetting(Settings.IMPORT_SYS_USER_DIC_ENABLE)) {
            return;
        }
        if (!Settings.getInstance().getBoolSetting(Settings.SYS_USER_DIC_IMPORTED)) {
            if (C1368X.m6324d()) {
                if (Engine.isInitialized()) {
                    Engine.getInstance().getUsrDicChecker().mo6518a(1, false);
                }
                m7609b();
            }
        } else if (this.f5401d != null) {
            this.f5401d.clear();
            this.f5401d = null;
        }
    }

    /* renamed from: b */
    private void m7609b() {
        if (Engine.isInitialized() && !Engine.getInstance().getIms().isInputViewShown()) {
            if (this.f5403f == 0) {
                this.f5401d = this.f5400c.mo6486a();
            } else if (this.f5401d != null) {
                int i = (this.f5403f - 1) * 30;
                int i2 = this.f5403f * 30;
                if (this.f5401d.size() > i) {
                    Okinawa h = C1368X.m6320c().mo5835h();
                    h.fireTransactionOperation(1);
                    int i3 = i;
                    while (true) {
                        if (i3 >= i2) {
                            break;
                        } else if (i3 >= this.f5401d.size()) {
                            Settings.getInstance().setBoolSetting(Settings.SYS_USER_DIC_IMPORTED, true);
                            this.f5403f = -1;
                            break;
                        } else {
                            h.fireAddUserwordOperation("", this.f5401d.get(i3), 3);
                            i3++;
                        }
                    }
                    h.fireTransactionOperation(2);
                    h.processEvent();
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getUsrDicChecker().mo6518a(1, true);
                    }
                } else {
                    Settings.getInstance().setBoolSetting(Settings.SYS_USER_DIC_IMPORTED, true);
                    this.f5403f = -1;
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getUsrDicChecker().mo6518a(1, true);
                    }
                }
            } else {
                this.f5403f = -1;
            }
            this.f5403f++;
            this.f5404g.postDelayed(this.f5405h, 3000);
        }
    }
}
