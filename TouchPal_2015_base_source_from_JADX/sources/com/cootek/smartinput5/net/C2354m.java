package com.cootek.smartinput5.net;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.component.C1648J;
import com.cootek.smartinput5.func.p053c.C1632c;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.plugin.messagepal.C2389f;
import com.cootek.smartinput5.urlnavigator.C3274n;

/* renamed from: com.cootek.smartinput5.net.m */
/* compiled from: BackgroundNetworkChecker */
public class C2354m extends C2220ah implements C1648J.C1649a {

    /* renamed from: a */
    private static final String f10346a = "BackgroundNetworkChecker";

    /* renamed from: b */
    private static final String f10347b = "version_updater";

    /* renamed from: c */
    private static final String f10348c = "paopao_news";

    /* renamed from: d */
    private static final String f10349d = "user_data_collect";

    /* renamed from: e */
    private static final String f10350e = "typing_speed_upload";

    /* renamed from: f */
    private static final String f10351f = "recommend_updater";

    /* renamed from: g */
    private static final String f10352g = "advertise_updater";

    /* renamed from: h */
    private static final String f10353h = "message_updater";

    /* renamed from: i */
    private static final String f10354i = "hot_word";

    public C2354m(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(90);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        switch (Settings.getInstance().getIntSetting(105)) {
            case -1:
                return 0.5f;
            case 0:
                return -1.0f;
            case 7:
                return 7.0f;
            case 30:
                return 30.0f;
            default:
                return 1.0f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(90, i);
    }

    /* renamed from: a */
    private boolean m10730a(String str) {
        if (!C1368X.m6324d()) {
            return false;
        }
        return C1132b.m5654a(C1368X.m6313b()).mo4393a(C1135d.CATEGORY_BACKGROUND_NETWORK_CHECKER, str, (Boolean) true).booleanValue();
    }

    /* renamed from: k */
    private void m10732k() {
        if (Settings.getInstance().getIntSetting(105) != -1 || C2188Q.m9853a().mo7685e()) {
            if (m10730a(f10347b)) {
                new C2226am(m10733l()).mo7754a();
            }
            if (m10730a(f10348c)) {
                C2203V.m9931a(m10733l()).mo7721a();
            }
            if (m10730a(f10349d)) {
                C1246d.m6010a(m10733l()).mo4587a();
            }
            if (m10730a(f10350e)) {
                C1368X.m6320c().mo5822H().mo6204f();
            }
            if (C1593bR.m7162a().f5076b) {
                if (m10730a(f10351f)) {
                    C3274n.m14529a(m10733l()).mo10467b();
                }
                if (m10730a(f10352g)) {
                    new C2310h(m10733l()).mo7914a();
                }
                if (m10730a(f10353h)) {
                    C2389f.m10925a(m10733l()).mo8092c();
                }
            }
        }
    }

    /* renamed from: l */
    private Context m10733l() {
        return C1368X.m6313b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        if (!C2188Q.m9853a().mo7685e() && ((C1593bR.m7162a().f5076b && Settings.getInstance().getIntSetting(105) == -1) || (C1593bR.m7162a().f5075a && Settings.getInstance().getBoolSetting(Settings.CLOUD_SERVICE_WIFI_ONLY)))) {
            mo6538f();
        } else if (!m10734m()) {
            mo6467d();
        } else if (m10730a(f10354i)) {
            C1648J.m7531a().mo6459a((C1648J.C1649a) this, true);
            if (!C1648J.m7531a().mo6461b()) {
                C1648J.m7531a().mo6463d();
            }
        }
    }

    /* renamed from: h */
    public boolean mo6479h() {
        C1648J.m7531a().mo6459a((C1648J.C1649a) this, true);
        if (!C1648J.m7531a().mo6462c()) {
            C1648J.m7531a().mo6460a(true);
        }
        return super.mo6479h();
    }

    /* renamed from: b */
    private void m10731b(String str) {
        C1632c v = C1368X.m6320c().mo5849v();
        v.mo6416a(v.mo6414a().mo6405a(str));
        C1246d.m6010a(m10733l()).mo4591a("HOTWORD/NOTIFICATION", "SHOW", C1246d.f3836c);
    }

    /* renamed from: d */
    public void mo6467d() {
        mo7752i();
        m10732k();
    }

    /* renamed from: e */
    public void mo6457e() {
        mo6538f();
    }

    /* renamed from: g_ */
    public void mo6470g_() {
        mo6538f();
    }

    /* renamed from: a */
    public void mo6466a(String str, boolean z, boolean z2) {
        if (z) {
            m10731b(str);
        }
        if (z2 && Settings.isInitialized()) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_HOTWORD_PAOPAO, true);
        }
    }

    /* renamed from: g */
    public void mo6469g() {
    }

    /* renamed from: m */
    private boolean m10734m() {
        return Settings.getInstance().getBoolSetting(Settings.UPDATE_LIVE_WORDS);
    }
}
