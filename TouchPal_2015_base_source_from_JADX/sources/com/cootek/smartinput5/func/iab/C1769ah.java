package com.cootek.smartinput5.func.iab;

import android.content.Context;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.vip.PurchaseVipActivity;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2238A;
import com.cootek.smartinput5.net.cmd.C2245F;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.iab.ah */
/* compiled from: Utils */
public class C1769ah {

    /* renamed from: a */
    private static final String f5761a = "Utils";

    /* renamed from: com.cootek.smartinput5.func.iab.ah$a */
    /* compiled from: Utils */
    public interface C1770a {
        /* renamed from: a */
        void mo6764a(int i, int i2, C2238A.C2239a aVar);
    }

    /* renamed from: com.cootek.smartinput5.func.iab.ah$b */
    /* compiled from: Utils */
    public interface C1771b {
        /* renamed from: a */
        void mo6765a(int i, int i2, C2245F.C2246a aVar);
    }

    /* renamed from: a */
    public static String m8125a(Context context, int i) {
        return C1974m.m9064a(context, (int) R.string.error_code_string, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static String m8126a(Context context, C2259P p) {
        int i = 0;
        if (p != null) {
            i = p.f9746O;
        }
        return m8131b(context, i);
    }

    /* renamed from: b */
    public static String m8131b(Context context, int i) {
        return C1974m.m9063a(context, (int) R.string.iab_error_server_error) + m8125a(context, i);
    }

    /* renamed from: a */
    public static C2373x m8122a(Context context, C1770a aVar) {
        C2238A a = new C2238A();
        a.f9464b = PurchaseVipActivity.f8895a;
        C2373x xVar = new C2373x(a);
        xVar.mo8060a((C2373x.C2376b) new C1772ai(context, aVar));
        return xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8133b(Context context, C2259P p, C1770a aVar) {
        C2238A.C2239a aVar2;
        ArrayList<C2238A.C2239a> j;
        if (p != null) {
            int i = p.f9746O;
            int i2 = p.f9748Q;
            if (i == 200 && i2 == 0 && (j = ((C2238A) p).mo7771j()) != null) {
                Iterator<C2238A.C2239a> it = j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aVar2 = it.next();
                    if ("purchase_success".equals(aVar2.f9473h)) {
                        break;
                    }
                }
            }
            aVar2 = null;
            if (aVar != null) {
                aVar.mo6764a(i, i2, aVar2);
            }
        }
    }

    /* renamed from: a */
    public static C2373x m8123a(Context context, C1771b bVar) {
        C2245F f = new C2245F();
        f.f9567b = PurchaseVipActivity.f8895a;
        C2373x xVar = new C2373x(f);
        xVar.mo8060a((C2373x.C2376b) new C1773aj(context, bVar));
        return xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8134b(Context context, C2259P p, C1771b bVar) {
        C2245F.C2246a aVar;
        int i;
        ArrayList<C2245F.C2246a> m;
        int i2 = 0;
        if (p != null) {
            int i3 = p.f9746O;
            int i4 = p.f9748Q;
            if (i3 != 200 || i4 != 0 || (m = ((C2245F) p).mo7787m()) == null || m.size() <= 0) {
                i2 = i4;
                aVar = null;
                i = i3;
            } else {
                int intValue = C1132b.m5654a(context).mo4397a(C1135d.VIP_GOODS_INDEX, (Integer) 0).intValue();
                if (intValue < 0 || intValue >= m.size()) {
                    intValue = 0;
                }
                i2 = i4;
                aVar = m.get(intValue);
                i = i3;
            }
        } else {
            aVar = null;
            i = 0;
        }
        if (bVar != null) {
            bVar.mo6765a(i, i2, aVar);
        }
    }

    /* renamed from: a */
    public static String m8128a(ArrayList<C1754V> arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append(m8124a() + C0911j.f2473c);
        sb.append(m8132b(arrayList) + C0911j.f2473c);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m8132b(ArrayList<C1754V> arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n================Purchase info============\n\n");
        if (arrayList != null) {
            Iterator<C1754V> it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(m8127a(it.next()));
                sb.append("\n--------------------------------\n");
            }
        }
        sb.append("\n\n=========================================\n");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m8127a(C1754V v) {
        StringBuilder sb = new StringBuilder();
        sb.append("productId: " + v.mo6726c());
        sb.append("\norderId: " + v.mo6724a());
        sb.append("\npackageName: " + v.mo6725b());
        sb.append("\npurchaseTime: " + v.mo6727d());
        sb.append("\npurchaseState: " + v.mo6728e());
        sb.append("\ndeveloperPayload: " + v.mo6729f());
        sb.append("\npurchaseToken: " + v.mo6730g());
        sb.append("\nsignature: " + v.mo6731h());
        return sb.toString();
    }

    /* renamed from: a */
    private static String m8124a() {
        return "user: " + C1617br.m7367a().mo6340g().mo7964d();
    }
}
