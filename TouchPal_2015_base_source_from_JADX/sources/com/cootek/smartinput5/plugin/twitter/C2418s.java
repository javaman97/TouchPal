package com.cootek.smartinput5.plugin.twitter;

import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: com.cootek.smartinput5.plugin.twitter.s */
/* compiled from: Twitter */
class C2418s extends Thread {

    /* renamed from: a */
    final /* synthetic */ C2417r f10598a;

    C2418s(C2417r rVar) {
        this.f10598a = rVar;
    }

    public void run() {
        if (this.f10598a.f10595w != null) {
            this.f10598a.f10595w.abort();
            HttpUriRequest unused = this.f10598a.f10595w = null;
        }
    }
}
