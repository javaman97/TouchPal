package com.cootek.smartinput5.net;

import android.os.Message;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.ad */
/* compiled from: SingleFileDownloader */
class C2216ad implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2214ac f9378a;

    C2216ad(C2214ac acVar) {
        this.f9378a = acVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2373x unused = this.f9378a.f9365x = null;
        C2243D d = (C2243D) p;
        if (p.f9746O == 200) {
            String unused2 = this.f9378a.f9366y = this.f9378a.m9993a(d.f9522h);
            if (this.f9378a.f9366y != null) {
                this.f9378a.m9995a(this.f9378a.f9360s, this.f9378a.f9366y, d.f9523i);
                return;
            }
            return;
        }
        this.f9378a.f9355n.sendMessage(Message.obtain(this.f9378a.f9355n, -2, this.f9378a.f9361t));
        String unused3 = this.f9378a.f9353C = C1246d.f3947s;
        String unused4 = this.f9378a.f9354D = "QUERY_VERSION_FAILED_" + p.f9746O;
        this.f9378a.m10011l();
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        if (this.f9378a.f9358q) {
            this.f9378a.f9355n.sendMessage(Message.obtain(this.f9378a.f9355n, -2, this.f9378a.f9361t));
            String unused = this.f9378a.f9353C = C1246d.f3947s;
            String unused2 = this.f9378a.f9354D = "FORCE_STOP";
        } else {
            this.f9378a.f9355n.sendMessage(Message.obtain(this.f9378a.f9355n, -1, this.f9378a.f9361t));
            String unused3 = this.f9378a.f9353C = C1246d.f3941m;
            String unused4 = this.f9378a.f9354D = "";
        }
        this.f9378a.m10011l();
    }
}
