package com.cootek.smartinput5.func.iab;

import android.os.AsyncTask;
import com.cootek.smartinput5.func.iab.C1746T;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.iab.ad */
/* compiled from: QuerySkuDetailsTask */
class C1764ad extends AsyncTask<String, Integer, Integer> {

    /* renamed from: a */
    private C1746T.C1751e f5741a;

    /* renamed from: b */
    private ArrayList<String> f5742b;

    /* renamed from: c */
    private String f5743c;

    /* renamed from: d */
    private C1753U f5744d = new C1753U();

    public C1764ad(String str, ArrayList<String> arrayList, C1746T.C1751e eVar) {
        this.f5742b = arrayList;
        this.f5741a = eVar;
        this.f5743c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer doInBackground(String... strArr) {
        if (C1730E.m8004c()) {
            return Integer.valueOf(C1730E.m8005d().mo6667a(this.f5743c, this.f5742b, this.f5744d));
        }
        return Integer.valueOf(C1778f.f5780A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        super.onPostExecute(num);
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6712a(this.f5744d);
        }
        if (this.f5741a != null) {
            this.f5741a.mo5746b(num.intValue());
        }
    }
}
