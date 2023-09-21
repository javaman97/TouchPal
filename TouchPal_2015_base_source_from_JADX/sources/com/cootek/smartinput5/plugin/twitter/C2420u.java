package com.cootek.smartinput5.plugin.twitter;

import com.cootek.smartinput5.plugin.twitter.TwitterDialog;

/* renamed from: com.cootek.smartinput5.plugin.twitter.u */
/* compiled from: TwitterDialog */
class C2420u extends Thread {

    /* renamed from: a */
    final /* synthetic */ String f10601a;

    /* renamed from: b */
    final /* synthetic */ TwitterDialog.C2399a f10602b;

    C2420u(TwitterDialog.C2399a aVar, String str) {
        this.f10602b = aVar;
        this.f10601a = str;
    }

    public void run() {
        TwitterDialog.this.m10987a(this.f10601a);
        TwitterDialog.this.finish();
    }
}
