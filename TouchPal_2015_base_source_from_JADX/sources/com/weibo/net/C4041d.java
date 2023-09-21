package com.weibo.net;

import android.content.Context;
import com.weibo.net.C4039c;

/* renamed from: com.weibo.net.d */
/* compiled from: AsyncWeiboRunner */
class C4041d extends Thread {

    /* renamed from: a */
    final /* synthetic */ Context f16481a;

    /* renamed from: b */
    final /* synthetic */ String f16482b;

    /* renamed from: c */
    final /* synthetic */ C4062x f16483c;

    /* renamed from: d */
    final /* synthetic */ String f16484d;

    /* renamed from: e */
    final /* synthetic */ C4039c.C4040a f16485e;

    /* renamed from: f */
    final /* synthetic */ C4039c f16486f;

    C4041d(C4039c cVar, Context context, String str, C4062x xVar, String str2, C4039c.C4040a aVar) {
        this.f16486f = cVar;
        this.f16481a = context;
        this.f16482b = str;
        this.f16483c = xVar;
        this.f16484d = str2;
        this.f16485e = aVar;
    }

    public void run() {
        try {
            C4054q.m17229a((C4043f) new C4045h());
            this.f16485e.mo8208a(this.f16486f.f16480a.mo15016a(this.f16481a, this.f16482b, this.f16483c, this.f16484d, this.f16486f.f16480a.mo15024b()));
        } catch (C4061w e) {
            this.f16485e.mo8206a(e);
        }
    }
}
