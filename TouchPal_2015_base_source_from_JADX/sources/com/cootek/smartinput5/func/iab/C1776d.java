package com.cootek.smartinput5.func.iab;

import android.os.AsyncTask;
import com.cootek.smartinput5.func.iab.C1746T;

/* renamed from: com.cootek.smartinput5.func.iab.d */
/* compiled from: ConsumeTask */
class C1776d extends AsyncTask<String, Integer, Integer> {

    /* renamed from: a */
    private C1746T.C1749c f5778a;

    /* renamed from: b */
    private final C1754V f5779b;

    public C1776d(C1754V v, C1746T.C1749c cVar) {
        this.f5778a = cVar;
        this.f5779b = v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer doInBackground(String... strArr) {
        int i = C1778f.f5780A;
        if (C1730E.m8004c()) {
            i = C1730E.m8005d().mo6665a(this.f5779b);
        }
        return Integer.valueOf(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        super.onPostExecute(num);
        if (num.intValue() == 0 && C1730E.m8004c()) {
            C1730E.m8005d().mo6723k(this.f5779b.mo6726c());
        }
        if (this.f5778a != null) {
            this.f5778a.mo5744a(num.intValue(), this.f5779b);
        }
    }
}
