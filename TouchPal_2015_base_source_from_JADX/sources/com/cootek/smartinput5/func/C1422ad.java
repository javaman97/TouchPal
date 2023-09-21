package com.cootek.smartinput5.func;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.component.C1645G;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.cmd.C2245F;
import com.cootek.smartinput5.net.login.C2339l;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.ad */
/* compiled from: GoodsManager */
public class C1422ad implements C1617br.C1620c {

    /* renamed from: A */
    private static final String f4553A = "cootek.smartinput.android.skin.";

    /* renamed from: E */
    private static Handler f4554E = new C1429ae(Looper.getMainLooper());

    /* renamed from: a */
    public static final int f4555a = 0;

    /* renamed from: b */
    public static final int f4556b = 1;

    /* renamed from: c */
    public static final int f4557c = 2;

    /* renamed from: d */
    public static final String f4558d = "not_purchased";

    /* renamed from: e */
    public static final String f4559e = "start_purchase";

    /* renamed from: f */
    public static final String f4560f = "purchase_success";

    /* renamed from: g */
    public static final String f4561g = "start_refund";

    /* renamed from: h */
    public static final String f4562h = "refund_success";

    /* renamed from: i */
    public static final String f4563i = "purchase_expired";

    /* renamed from: j */
    public static final int f4564j = 1;

    /* renamed from: k */
    public static final int f4565k = 2;

    /* renamed from: l */
    public static final String f4566l = "goods_info";

    /* renamed from: m */
    public static final String f4567m = "goods_appId";

    /* renamed from: n */
    public static final String f4568n = "goods_pkgname";

    /* renamed from: o */
    public static final String f4569o = "goods_status";

    /* renamed from: p */
    public static final String f4570p = "goods_type";

    /* renamed from: q */
    public static final String f4571q = "goods_expire";

    /* renamed from: r */
    public static final String f4572r = "goods_writeback";

    /* renamed from: v */
    private static final String f4573v = "GoodsManager";

    /* renamed from: y */
    private static final boolean f4574y = false;

    /* renamed from: z */
    private static final boolean f4575z = false;

    /* renamed from: B */
    private C1427d f4576B = new C1427d(this, (C1429ae) null);

    /* renamed from: C */
    private Messenger f4577C;

    /* renamed from: D */
    private IPCManager f4578D;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f4579F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f4580G = false;

    /* renamed from: s */
    private ArrayList<C2245F.C2246a> f4581s;

    /* renamed from: t */
    private HashMap<String, HashMap<String, C1424a>> f4582t;

    /* renamed from: u */
    private boolean f4583u = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C1645G f4584w;

    /* renamed from: x */
    private Context f4585x;

    /* renamed from: com.cootek.smartinput5.func.ad$c */
    /* compiled from: GoodsManager */
    public enum C1426c {
        TYPE_ERROR,
        TYPE_LANGUAGE,
        TYPE_CELLDICT,
        TYPE_SKIN,
        TYPE_EMOJI
    }

    /* renamed from: com.cootek.smartinput5.func.ad$e */
    /* compiled from: GoodsManager */
    public enum C1428e {
        NotExist,
        ShouldPurchase,
        Expired,
        Normal
    }

    /* renamed from: com.cootek.smartinput5.func.ad$a */
    /* compiled from: GoodsManager */
    public static class C1424a implements Serializable {

        /* renamed from: a */
        public String f4587a;

        /* renamed from: b */
        public C1428e f4588b;

        public String toString() {
            return "appId: " + this.f4587a + ", status: " + this.f4588b;
        }
    }

    /* renamed from: com.cootek.smartinput5.func.ad$b */
    /* compiled from: GoodsManager */
    public static class C1425b implements Serializable {

        /* renamed from: a */
        public boolean f4589a;

        /* renamed from: b */
        public ArrayList<C2245F.C2246a> f4590b;

        /* renamed from: c */
        public HashMap<String, HashMap<String, C1424a>> f4591c;

        public C1425b(boolean z, ArrayList<C2245F.C2246a> arrayList, HashMap<String, HashMap<String, C1424a>> hashMap) {
            this.f4589a = z;
            this.f4590b = arrayList;
            this.f4591c = hashMap;
        }
    }

    /* renamed from: h */
    private void m6683h() {
        if (this.f4578D != null && this.f4577C == null) {
            this.f4577C = new Messenger(f4554E);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.f4577C;
            try {
                this.f4578D.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    public C1422ad(Context context) {
        this.f4585x = context;
        m6684i();
    }

    /* renamed from: i */
    private void m6684i() {
        this.f4584w = new C1645G((C2220ah.C2221a) null);
        if (C1368X.m6324d()) {
            this.f4578D = C1368X.m6320c().mo5839l();
            this.f4578D.bindService();
            m6683h();
        }
        C1730E.m7972a((C1746T.C1747a) this.f4576B);
        C1617br.m7367a().mo6329a((C1617br.C1620c) this);
        m6687l();
    }

    /* renamed from: a */
    public boolean mo6063a(String str) {
        return mo6064a(str, (C1426c) null, 0);
    }

    /* renamed from: a */
    public boolean mo6064a(String str, C1426c cVar, int i) {
        C1428e b;
        switch (i) {
            case 1:
                b = m6664a(str, cVar);
                break;
            case 2:
                b = m6674b(str, cVar);
                break;
            default:
                b = m6680c(str);
                break;
        }
        if (b == C1428e.Expired || b == C1428e.ShouldPurchase) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C1428e m6664a(String str, C1426c cVar) {
        if (TextUtils.isEmpty(str)) {
            return C1428e.NotExist;
        }
        String a = m6666a(cVar);
        if (!str.startsWith(a)) {
            return C1428e.NotExist;
        }
        String substring = str.substring(a.length());
        if (TextUtils.isEmpty(substring)) {
            return C1428e.NotExist;
        }
        return m6680c(substring);
    }

    /* renamed from: b */
    private C1428e m6674b(String str, C1426c cVar) {
        if (TextUtils.isEmpty(str)) {
            return C1428e.NotExist;
        }
        String b = m6676b(cVar);
        if (!str.startsWith(b)) {
            return C1428e.NotExist;
        }
        String substring = str.substring(b.length());
        C1017y.m5228d(f4573v, "appId: " + substring);
        if (TextUtils.isEmpty(substring)) {
            return C1428e.NotExist;
        }
        return m6680c(substring);
    }

    /* renamed from: a */
    private static String m6666a(C1426c cVar) {
        switch (cVar) {
            case TYPE_LANGUAGE:
                return C2197U.f9277o;
            case TYPE_CELLDICT:
                return "cootek.smartinput.android.celldict.";
            case TYPE_SKIN:
                return f4553A;
            case TYPE_EMOJI:
                return C2197U.f9278p;
            default:
                return C2197U.f9279q;
        }
    }

    /* renamed from: b */
    private static String m6676b(C1426c cVar) {
        switch (cVar) {
            case TYPE_LANGUAGE:
                return C1811k.f5992j;
            case TYPE_CELLDICT:
                return C1811k.f5995m;
            case TYPE_SKIN:
                return C1811k.f5994l;
            case TYPE_EMOJI:
                return C1811k.f5996n;
            default:
                return C1811k.f5997o;
        }
    }

    /* renamed from: b */
    private static C1426c m6673b(String str) {
        C1426c cVar = C1426c.TYPE_ERROR;
        if (str.contains(".language.")) {
            return C1426c.TYPE_LANGUAGE;
        }
        if (str.contains(".celldict.")) {
            return C1426c.TYPE_CELLDICT;
        }
        if (str.contains(".skin.")) {
            return C1426c.TYPE_SKIN;
        }
        if (str.contains(".emoji.")) {
            return C1426c.TYPE_EMOJI;
        }
        return cVar;
    }

    /* renamed from: c */
    private C1428e m6680c(String str) {
        C1424a aVar;
        if (TextUtils.isEmpty(str)) {
            return C1428e.NotExist;
        }
        String j = m6685j();
        if (this.f4582t == null || TextUtils.isEmpty(j) || !this.f4582t.containsKey(j)) {
            Iterator<C2245F.C2246a> it = this.f4581s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String e = it.next().mo7792e();
                if (e != null && e.endsWith(str)) {
                    if (this.f4583u) {
                        return C1428e.ShouldPurchase;
                    }
                }
            }
            return C1428e.NotExist;
        }
        HashMap hashMap = this.f4582t.get(j);
        if (!TextUtils.isEmpty(str)) {
            aVar = (C1424a) hashMap.get(str);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return C1428e.NotExist;
        }
        if (this.f4583u) {
            return aVar.f4588b;
        }
        return C1428e.Normal;
    }

    /* renamed from: a */
    public void mo6060a(boolean z) {
        if (!C1593bR.m7162a().f5076b) {
            new Handler().post(new C1430af(this, z));
        }
    }

    /* renamed from: a */
    public void mo6061a(int[] iArr, String[] strArr) {
        boolean z;
        if (iArr != null && strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if ("start_purchase".equals(strArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.f4579F = false;
                this.f4580G = false;
                this.f4584w.mo6453a((C1746T.C1750d) new C1431ag(this, iArr, strArr), (C1746T.C1750d) new C1432ah(this, iArr, strArr));
                return;
            }
            m6678b(iArr, strArr);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6678b(int[] iArr, String[] strArr) {
        boolean z;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            String str = strArr[i];
            if (i == length - 1) {
                z = true;
            } else {
                z = false;
            }
            m6677b(i2, str, z);
        }
    }

    /* renamed from: a */
    public void mo6056a(int i, String str, boolean z) {
        if ("start_purchase".equals(str)) {
            this.f4579F = false;
            this.f4580G = false;
            this.f4584w.mo6453a((C1746T.C1750d) new C1433ai(this, i, str, z), (C1746T.C1750d) new C1434aj(this, i, str, z));
            return;
        }
        m6677b(i, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6677b(int i, String str, boolean z) {
        m6667a(i, this.f4584w.mo6451a(i, str), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6667a(int i, C1428e eVar, boolean z) {
        C2245F.C2246a aVar;
        String str = null;
        if (this.f4581s != null) {
            Iterator<C2245F.C2246a> it = this.f4581s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aVar = it.next();
                if (i == aVar.mo7788a()) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            if (!aVar.mo7807t()) {
                str = aVar.mo7792e();
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            mo6057a(str, eVar, 0, z);
            if (z) {
                mo6071g();
            }
        }
    }

    /* renamed from: a */
    public void mo6057a(String str, C1428e eVar, long j, boolean z) {
        String j2 = m6685j();
        if (!TextUtils.isEmpty(j2)) {
            C1426c b = m6673b(str);
            if (b != C1426c.TYPE_ERROR) {
                String a = m6666a(b);
                if (str.startsWith(a)) {
                    str = str.substring(a.length());
                }
            }
            C1424a aVar = new C1424a();
            aVar.f4587a = str;
            aVar.f4588b = eVar;
            HashMap hashMap = this.f4582t.get(j2);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, aVar);
            this.f4582t.put(j2, hashMap);
            if (z) {
                m6686k();
            }
        }
    }

    /* renamed from: j */
    private String m6685j() {
        C1617br a = C1617br.m7367a();
        if (!a.mo6337d()) {
            return null;
        }
        return String.format("%s_%s", new Object[]{a.mo6340g().mo7964d(), a.mo6340g().mo7963c()});
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0019 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6059a(java.util.ArrayList<com.cootek.smartinput5.net.cmd.C2245F.C2246a> r7, java.util.ArrayList<com.cootek.smartinput5.func.C1422ad.C1424a> r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0009
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            r6.f4581s = r0
        L_0x0009:
            java.lang.String r3 = r6.m6685j()
            if (r8 == 0) goto L_0x0060
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0060
            java.util.Iterator r4 = r8.iterator()
        L_0x0019:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r4.next()
            com.cootek.smartinput5.func.ad$a r0 = (com.cootek.smartinput5.func.C1422ad.C1424a) r0
            java.lang.String r1 = r0.f4587a
            com.cootek.smartinput5.func.ad$c r2 = m6673b((java.lang.String) r1)
            com.cootek.smartinput5.func.ad$c r5 = com.cootek.smartinput5.func.C1422ad.C1426c.TYPE_ERROR
            if (r2 == r5) goto L_0x0064
            java.lang.String r2 = m6666a((com.cootek.smartinput5.func.C1422ad.C1426c) r2)
            boolean r5 = r1.startsWith(r2)
            if (r5 == 0) goto L_0x0064
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            r2 = r1
        L_0x0042:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0019
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, com.cootek.smartinput5.func.ad$a>> r1 = r6.f4582t
            java.lang.Object r1 = r1.get(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 != 0) goto L_0x0057
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0057:
            r1.put(r2, r0)
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, com.cootek.smartinput5.func.ad$a>> r0 = r6.f4582t
            r0.put(r3, r1)
            goto L_0x0019
        L_0x0060:
            r6.m6686k()
            return
        L_0x0064:
            r2 = r1
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1422ad.mo6059a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: k */
    private void m6686k() {
        File a = C1466av.m6849a(this.f4585x, f4566l);
        HashMap hashMap = new HashMap();
        if (this.f4582t != null) {
            hashMap.putAll(this.f4582t);
        }
        ArrayList arrayList = new ArrayList();
        if (this.f4581s != null) {
            arrayList.addAll(this.f4581s);
        }
        C0997e.m5175a(a, (Object) new C1425b(this.f4583u, arrayList, hashMap));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m6687l() {
        Object b = C0997e.m5187b(C1466av.m6849a(this.f4585x, f4566l));
        if (b != null) {
            C1425b bVar = (C1425b) b;
            this.f4581s = bVar.f4590b;
            this.f4582t = bVar.f4591c;
            this.f4583u = bVar.f4589a;
            return;
        }
        this.f4581s = new ArrayList<>();
        this.f4582t = new HashMap<>();
        this.f4583u = false;
    }

    /* renamed from: a */
    public boolean mo6062a() {
        String j = m6685j();
        if (!TextUtils.isEmpty(j) && this.f4582t != null && this.f4582t.containsKey(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo6065b(boolean z) {
        this.f4583u = z;
    }

    /* renamed from: b */
    public boolean mo6066b() {
        return this.f4583u;
    }

    /* renamed from: c */
    public void mo6067c() {
        if (this.f4582t != null) {
            this.f4582t.clear();
        }
        if (this.f4581s != null) {
            this.f4581s.clear();
        }
        m6686k();
    }

    /* renamed from: d */
    public void mo6068d() {
        if (this.f4582t != null) {
            this.f4582t.clear();
        }
        m6686k();
    }

    /* renamed from: e */
    public void mo6069e() {
        String j = m6685j();
        if (!TextUtils.isEmpty(j)) {
            if (this.f4582t != null) {
                this.f4582t.remove(j);
            }
            m6686k();
        }
    }

    /* renamed from: f */
    public void mo6070f() {
        if (this.f4578D != null) {
            this.f4578D.destroy();
        }
        C1730E.m7996b((C1746T.C1747a) this.f4576B);
        C1617br.m7367a().mo6334b((C1617br.C1620c) this);
    }

    /* renamed from: com.cootek.smartinput5.func.ad$d */
    /* compiled from: GoodsManager */
    private class C1427d implements C1617br.C1618a, C1746T.C1747a {
        private C1427d() {
        }

        /* synthetic */ C1427d(C1422ad adVar, C1429ae aeVar) {
            this();
        }

        public void onSetupFinished() {
        }

        /* renamed from: a */
        public void mo6073a(boolean z) {
        }

        public void onServiceDisconnected() {
        }

        public void onPurchaseFinished(int i, String str) {
            if ("purchase_success".equals(str)) {
                C1422ad.this.m6667a(i, C1428e.Normal, true);
            }
        }

        public void onUpdateFinished() {
        }
    }

    /* renamed from: g */
    public void mo6071g() {
        C1368X.m6320c().mo5839l().notifyOtherProcesses(Message.obtain((Handler) null, 11));
    }

    /* renamed from: a */
    public void mo6058a(String str, String str2) {
        if (str == null) {
            return;
        }
        if (C2339l.f10311k.equals(str2)) {
            mo6068d();
            mo6071g();
            return;
        }
        mo6060a(true);
    }
}
