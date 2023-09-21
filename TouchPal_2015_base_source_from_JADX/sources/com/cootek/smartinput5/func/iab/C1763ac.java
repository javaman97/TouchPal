package com.cootek.smartinput5.func.iab;

import android.os.AsyncTask;
import com.cootek.smartinput5.func.iab.C1746T;

/* renamed from: com.cootek.smartinput5.func.iab.ac */
/* compiled from: QueryPurchaseTask */
class C1763ac extends AsyncTask<String, Integer, Integer> {

    /* renamed from: a */
    private C1746T.C1750d f5738a;

    /* renamed from: b */
    private C1753U f5739b = new C1753U();

    /* renamed from: c */
    private String f5740c;

    public C1763ac(String str, C1746T.C1750d dVar) {
        this.f5738a = dVar;
        this.f5740c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer doInBackground(String... strArr) {
        if (C1730E.m8004c()) {
            return Integer.valueOf(C1730E.m8005d().mo6666a(this.f5740c, this.f5739b));
        }
        return Integer.valueOf(C1778f.f5780A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        super.onPostExecute(num);
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6712a(this.f5739b);
        }
        if (this.f5738a != null) {
            this.f5738a.mo5743a(num.intValue());
        }
    }
}
