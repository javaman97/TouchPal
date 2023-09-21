package com.cootek.smartinput5.net;

import android.os.AsyncTask;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.net.cmd.C2268c;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;

/* renamed from: com.cootek.smartinput5.net.x */
/* compiled from: HttpTask */
public class C2373x {

    /* renamed from: a */
    public C2259P f10444a;

    /* renamed from: b */
    private C2375a f10445b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2376b f10446c;

    /* renamed from: com.cootek.smartinput5.net.x$b */
    /* compiled from: HttpTask */
    public interface C2376b {
        /* renamed from: a */
        void mo4601a(C2259P p);

        /* renamed from: b */
        void mo4602b(C2259P p);
    }

    public C2373x(C2259P p) {
        this.f10444a = p;
    }

    /* renamed from: a */
    public int mo8059a() {
        return mo8062c();
    }

    /* renamed from: a */
    public void mo8060a(C2376b bVar) {
        this.f10446c = bVar;
        if (this.f10445b != null) {
            mo8061b();
        }
        this.f10445b = new C2375a();
        this.f10445b.execute(new String[0]);
    }

    /* renamed from: b */
    public void mo8061b() {
        if (this.f10445b != null && this.f10445b.getStatus() != AsyncTask.Status.FINISHED) {
            this.f10445b.cancel(true);
        }
    }

    /* renamed from: a */
    private boolean m10886a(boolean z, C2268c.C2269a aVar) {
        C2209a.C2210a aVar2;
        C2209a a = C2209a.m9956a();
        if (!z) {
            aVar2 = C2209a.C2210a.CHECK_TOKEN;
        } else {
            aVar2 = C2209a.C2210a.DIRECTLY;
        }
        switch (a.mo7727a(C1368X.m6313b(), aVar2, false, aVar)) {
            case 1:
                if (!(a.mo7729c() == 200 && a.mo7730d() == 0)) {
                    return false;
                }
            case 2:
                return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo8062c() {
        if (this.f10444a.mo7767b()) {
            C2268c.C2269a aVar = C2268c.C2269a.CNT;
            aVar.mo7841a(this.f10444a.mo7780l());
            if (!m10886a(false, aVar)) {
                return SearchStatusData.RESPONSE_STATUS_REVOKED;
            }
        }
        int h_ = this.f10444a.mo7830h_();
        if (!m10885a(this.f10444a)) {
            return h_;
        }
        C2268c.C2269a aVar2 = C2268c.C2269a.CR;
        aVar2.mo7841a(this.f10444a.mo7780l() + "(" + this.f10444a.f9748Q + ")");
        if (m10886a(true, aVar2)) {
            return this.f10444a.mo7830h_();
        }
        return h_;
    }

    /* renamed from: a */
    private boolean m10885a(C2259P p) {
        if (p == null) {
            return false;
        }
        switch (p.f9746O) {
            case SearchStatusData.RESPONSE_STATUS_REVOKED /*401*/:
                return true;
            default:
                switch (p.f9748Q) {
                    case 1001:
                    case 1002:
                    case C2261Q.f9803i:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* renamed from: com.cootek.smartinput5.net.x$a */
    /* compiled from: HttpTask */
    private class C2375a extends AsyncTask<String, Integer, Object> {
        private C2375a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object doInBackground(String... strArr) {
            C2373x.this.mo8062c();
            return null;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            C2373x.this.f10444a.mo7833r();
            if (C2373x.this.f10446c != null) {
                C2373x.this.f10446c.mo4602b(C2373x.this.f10444a);
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            if (C2373x.this.f10446c != null) {
                C2373x.this.f10446c.mo4601a(C2373x.this.f10444a);
            }
        }
    }
}
