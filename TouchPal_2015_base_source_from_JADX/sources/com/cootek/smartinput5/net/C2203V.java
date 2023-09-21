package com.cootek.smartinput5.net;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.p053c.C1631b;
import com.cootek.smartinput5.func.p053c.C1632c;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2293p;
import com.cootek.smartinput5.net.cmd.C2304y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.net.V */
/* compiled from: PaopaoNewsChecker */
public class C2203V {

    /* renamed from: a */
    private static C2203V f9303a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f9304b;

    /* renamed from: c */
    private C2204a f9305c;

    /* renamed from: a */
    public static C2203V m9931a(Context context) {
        if (f9303a == null) {
            f9303a = new C2203V(context);
        }
        return f9303a;
    }

    public C2203V(Context context) {
        this.f9304b = context;
    }

    /* renamed from: a */
    public void mo7721a() {
        if (Settings.isInitialized() && Settings.getInstance().getBoolSetting(76)) {
            new C2373x(new C2293p()).mo8060a((C2373x.C2376b) new C2205W(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9932a(int i) {
        this.f9305c = new C2204a(this, (C2205W) null);
        int intSetting = Settings.getInstance().getIntSetting(89);
        this.f9305c.execute(new Integer[]{Integer.valueOf(intSetting), Integer.valueOf(i)});
    }

    /* renamed from: com.cootek.smartinput5.net.V$a */
    /* compiled from: PaopaoNewsChecker */
    private class C2204a extends AsyncTask<Integer, Integer, Object[]> {
        private C2204a() {
        }

        /* synthetic */ C2204a(C2203V v, C2205W w) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object[] doInBackground(Integer... numArr) {
            int intValue = numArr[0].intValue();
            String a = C2225al.m10051a(C2203V.this.f9304b);
            String str = "mainland";
            if (C1593bR.m7162a().f5075a) {
                str = "international";
            } else if (C1593bR.m7162a().f5076b) {
                str = "mainland";
            }
            ArrayList arrayList = new ArrayList();
            for (int intValue2 = numArr[1].intValue(); intValue2 >= intValue; intValue2--) {
                C2304y yVar = new C2304y();
                yVar.f10154c = intValue2;
                yVar.f10155d = a;
                yVar.f10156e = str;
                yVar.mo7830h_();
                if (yVar.f9746O == 200) {
                    arrayList.add(yVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            C1632c v = C1368X.m6320c().mo5849v();
            int g = v.mo6430g();
            for (int i = 0; i < g; i++) {
                C1631b c = v.mo6421c(i);
                if (!v.mo6420b(c) && c.f5285b < intValue) {
                    C2304y yVar2 = new C2304y();
                    yVar2.f10154c = c.f5285b;
                    yVar2.f10155d = a;
                    yVar2.f10156e = str;
                    yVar2.mo7830h_();
                    if (yVar2.f9746O == 200 && yVar2.f10157k == 4) {
                        arrayList2.add(Integer.valueOf(c.f5285b));
                    }
                }
            }
            return new Object[]{arrayList, arrayList2};
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Object[] objArr) {
            super.onPostExecute(objArr);
            if (C1368X.m6324d()) {
                ArrayList arrayList = objArr[0];
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C2304y yVar = (C2304y) it.next();
                        if (yVar.f10157k != 4 && TextUtils.isEmpty(yVar.f10162p)) {
                            if (!TextUtils.isEmpty(yVar.f10161o)) {
                                boolean b = C1811k.m8322a().mo6823b(yVar.f10161o);
                                C1368X.m6320c().mo5816B().mo6050a(yVar.f10161o, b);
                                if (b) {
                                }
                            }
                            C1631b bVar = new C1631b();
                            bVar.f5285b = yVar.f10154c;
                            bVar.f5287k = yVar.f10158l;
                            bVar.f5288l = yVar.f10159m;
                            bVar.f5289m = yVar.f10160n;
                            bVar.f5290n = yVar.f10161o;
                            bVar.f5291o = yVar.f10163q;
                            if (TextUtils.isEmpty(bVar.f5291o)) {
                                switch (yVar.f10157k) {
                                    case 1:
                                        bVar.f5286j = 2;
                                        break;
                                    case 2:
                                        bVar.f5286j = 5;
                                        break;
                                    case 3:
                                        bVar.f5286j = 3;
                                        break;
                                    default:
                                        bVar.f5286j = 1;
                                        break;
                                }
                            } else {
                                bVar.f5286j = 3;
                            }
                            bVar.f5296x = 2;
                            if (bVar.f5286j == 5 || bVar.f5286j == 3 || bVar.f5286j == 2) {
                                bVar.f5296x |= 1;
                            } else {
                                bVar.f5296x |= 4;
                            }
                            C1368X.m6320c().mo5849v().mo6416a(bVar);
                        }
                    }
                    Settings.getInstance().setIntSetting(89, ((C2304y) arrayList.get(0)).f10154c + 1);
                }
                ArrayList arrayList2 = objArr[1];
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C1368X.m6320c().mo5849v().mo6424d(((Integer) it2.next()).intValue());
                    }
                }
            }
        }
    }
}
