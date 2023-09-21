package com.cootek.smartinput5.net;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2305z;

/* renamed from: com.cootek.smartinput5.net.ai */
/* compiled from: UploadInfoChecker */
public class C2222ai extends C2220ah {

    /* renamed from: a */
    private static final String f9387a = "upload_info_control_file";

    public C2222ai(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.UPLOAD_INFO_NEXT_QUERY_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 7.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.UPLOAD_INFO_NEXT_QUERY_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        if (Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE) && C2188Q.m9853a().mo7685e()) {
            C2305z zVar = new C2305z();
            zVar.f10165a = f9387a;
            new C2373x(zVar).mo8060a((C2373x.C2376b) new C2223aj(this));
        }
    }
}
