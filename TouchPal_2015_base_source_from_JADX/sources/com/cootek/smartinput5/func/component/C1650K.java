package com.cootek.smartinput5.func.component;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.cmd.C2259P;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.component.K */
/* compiled from: HotWordIndexer */
class C1650K extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1648J f5373a;

    C1650K(C1648J j) {
        this.f5373a = j;
    }

    public void handleMessage(Message message) {
        String str;
        String str2;
        super.handleMessage(message);
        int i = message.what;
        if (message.obj == null || !(message.obj instanceof HashMap)) {
            str = null;
            str2 = null;
        } else {
            HashMap hashMap = (HashMap) message.obj;
            str2 = (String) hashMap.get("fileId");
            str = (String) hashMap.get("filePath");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f5373a.m7560h();
        } else if (i == 200) {
            C1368X.m6320c().mo5845r().mo5566a(str2, new File(str));
            this.f5373a.m7544a(str2, true);
            this.f5373a.mo4601a((C2259P) null);
        } else if (i == -2 || i == -1) {
            this.f5373a.m7560h();
        }
    }
}
