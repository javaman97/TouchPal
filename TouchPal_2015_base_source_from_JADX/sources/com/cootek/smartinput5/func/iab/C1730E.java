package com.cootek.smartinput5.func.iab;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1356N;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1767ag;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.iab.google.C1786f;
import com.cootek.smartinput5.func.iab.google.C1787g;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2250J;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2286j;
import com.cootek.smartinput5.net.cmd.C2291n;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.iab.E */
/* compiled from: IabHelper */
public class C1730E extends C1753U implements C1356N.C1357a, C1617br.C1620c {

    /* renamed from: A */
    private static final int f5642A = 2;

    /* renamed from: C */
    private static ArrayList<C1746T.C1747a> f5643C = new ArrayList<>();

    /* renamed from: E */
    private static C1730E f5644E = null;

    /* renamed from: J */
    private static int f5645J = 0;

    /* renamed from: M */
    private static final String f5646M = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApKy5hAzRYV5hY6qnkRMEVjiBmWf/krYT1ub4VdkjheHI2022F5We2VRCfRGpSwsOOyG4lWZSc82JZ+Y5vcMNgy8fsT3Nu05cjLQqfg+zTlVc6bUVqWdJLNLvqIxvcDHhIxK4ia15zhdPEhDOsoVqcE+XB0L+vl1oOW3vcJFoKE39ChxLwPMD1JXLlQOAxOhtl/xyOQptAkR619PVUVlmpJK4T25uo1v6G2aVuomvs394xq82vbdrx5qOn6G6+zOfU0ISrD4P1UgXnAvJfIdy31iz5jWmbNyQa3LoMLF4t7BzEEzaKI7t9d4nqPrpDlnuYFx8Nw1fyco/kpxO4lOh5wIDAQAB";

    /* renamed from: a */
    static final String f5647a = "IabHelper";

    /* renamed from: b */
    public static final int f5648b = 1000;

    /* renamed from: c */
    public static final String f5649c = "Google";

    /* renamed from: d */
    public static final String f5650d = "web";

    /* renamed from: e */
    public static final String f5651e = "channel_product_id";

    /* renamed from: f */
    public static final String f5652f = "channel_product_type";

    /* renamed from: g */
    public static final String f5653g = "trans_id";

    /* renamed from: h */
    public static final String f5654h = "status";

    /* renamed from: i */
    public static final String f5655i = "channel_name";

    /* renamed from: j */
    public static final String f5656j = "channel_account";

    /* renamed from: k */
    public static final String f5657k = "goods_id";

    /* renamed from: l */
    public static final String f5658l = "update_order_in_foreground";

    /* renamed from: m */
    public static final String f5659m = "order_id";

    /* renamed from: n */
    public static final String f5660n = "goods_id";

    /* renamed from: o */
    public static final String f5661o = "type";

    /* renamed from: p */
    public static final String f5662p = "start_purchase";

    /* renamed from: q */
    public static final String f5663q = "purchase_success";

    /* renamed from: r */
    public static final String f5664r = "purchase_cancel";

    /* renamed from: s */
    public static final String f5665s = "refund_success";

    /* renamed from: t */
    public static final String f5666t = "not_purchased";

    /* renamed from: u */
    static final String f5667u = "keyPurchaseDataJson";

    /* renamed from: v */
    static final String f5668v = "keyPurchaseDataSignatrue";

    /* renamed from: w */
    static final String f5669w = "keyPurchaseType";

    /* renamed from: x */
    public static final String f5670x = "com.android.vending";

    /* renamed from: y */
    private static final int f5671y = 0;

    /* renamed from: z */
    private static final int f5672z = 1;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Context f5673B;

    /* renamed from: D */
    private Activity f5674D;

    /* renamed from: F */
    private int f5675F;

    /* renamed from: G */
    private boolean f5676G;

    /* renamed from: H */
    private String f5677H;

    /* renamed from: I */
    private int f5678I;

    /* renamed from: K */
    private boolean f5679K;

    /* renamed from: L */
    private ArrayList<String> f5680L;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f5681N;

    /* renamed from: O */
    private C1786f f5682O;

    /* renamed from: com.cootek.smartinput5.func.iab.E$a */
    /* compiled from: IabHelper */
    public interface C1731a {
        /* renamed from: a */
        int mo6691a();
    }

    private C1730E(Context context) {
        this.f5675F = 0;
        this.f5676G = false;
        this.f5679K = false;
        this.f5681N = false;
        this.f5682O = new C1736J(this);
        this.f5675F = 0;
        C1356N.m6227a().mo5755a((C1356N.C1357a) this);
        C1617br.m7367a().mo6329a((C1617br.C1620c) this);
        this.f5680L = new ArrayList<>();
        C1787g.m8208a(context);
        C1787g.m8212b().mo6785a(this.f5682O);
    }

    /* renamed from: a */
    public static void m7962a(Context context) {
        f5645J++;
        if (f5644E == null) {
            f5644E = new C1730E(context.getApplicationContext());
        }
        f5644E.f5673B = context;
    }

    /* renamed from: c */
    public static boolean m8004c() {
        return f5644E != null;
    }

    /* renamed from: d */
    public static C1730E m8005d() {
        return f5644E;
    }

    /* renamed from: e */
    public void mo6685e() {
        m7982a(true);
    }

    /* renamed from: b */
    public void mo6684b(Context context) {
        boolean z = true;
        this.f5673B = context;
        if (this.f5675F != 1) {
            mo6722g();
            m7982a(false);
        } else {
            this.f5675F = 0;
            z = false;
        }
        if (!z) {
            m8008i();
        }
    }

    /* renamed from: g */
    public boolean mo6687g(String str) {
        if (!C1787g.m8211a()) {
            return false;
        }
        try {
            if (C1787g.m8212b().mo6780a(str) == 0) {
                return true;
            }
            return false;
        } catch (RemoteException e) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo6674a(Activity activity, String str) {
        C1779g.m8170a(str, f5650d);
        this.f5674D = activity;
        this.f5673B = activity;
        Intent k = m8010k();
        k.putExtra(PurchaseChannelChooseActivity.PURCHASE_TRADE, str);
        if (this.f5674D != null) {
            try {
                this.f5674D.startActivityForResult(k, 1000);
            } catch (ActivityNotFoundException e) {
            }
        }
    }

    /* renamed from: a */
    public void mo6673a(Activity activity, int i, String str, JSONObject jSONObject) {
        C1779g.m8165a(i, str);
        this.f5674D = activity;
        this.f5673B = activity;
        m7961a(i, str, jSONObject);
    }

    /* renamed from: b */
    public void mo6683b(Activity activity, int i, String str, JSONObject jSONObject) {
        this.f5674D = activity;
        this.f5673B = activity;
        m7961a(i, str, jSONObject);
    }

    /* renamed from: a */
    private void m7961a(int i, String str, JSONObject jSONObject) {
        if ("Google".equals(str)) {
            m7994b(i, str, jSONObject);
        } else if (f5650d.equals(str)) {
            m7959a(i);
        }
    }

    /* renamed from: a */
    public void mo6675a(Context context, int i, C1746T.C1752f fVar) {
        this.f5673B = context;
        C1779g.m8173b(i);
        C2286j jVar = new C2286j();
        jVar.mo7867a(i);
        new C2373x(jVar).mo8060a((C2373x.C2376b) new C1732F(this, fVar, i));
    }

    /* renamed from: a */
    public void mo6679a(String str, C1746T.C1750d dVar) {
        new C1763ac(str, dVar).execute(new String[0]);
    }

    /* renamed from: a */
    public void mo6680a(String str, String str2, C1746T.C1751e eVar) {
        if (!mo6721f(str2)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            mo6681a(str, (ArrayList<String>) arrayList, eVar);
        } else if (eVar != null) {
            eVar.mo5746b(0);
        }
    }

    /* renamed from: a */
    public static void m7972a(C1746T.C1747a aVar) {
        if (aVar != null && !f5643C.contains(aVar)) {
            f5643C.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m7996b(C1746T.C1747a aVar) {
        if (f5643C.contains(aVar)) {
            f5643C.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo6676a(C1754V v, C1746T.C1749c cVar) {
        new C1776d(v, cVar).execute(new String[0]);
    }

    /* renamed from: a */
    public void mo6682a(String str, JSONArray jSONArray, C1746T.C1748b bVar) {
        C1767ag agVar;
        boolean z = false;
        if (jSONArray != null) {
            try {
                agVar = m7950a(str, jSONArray);
            } catch (JSONException e) {
                agVar = null;
            }
            if (agVar != null) {
                z = true;
                mo6679a(agVar.f5755b, (C1746T.C1750d) new C1737K(this, agVar, bVar));
            }
        }
        if (!z) {
            m7981a((JSONArray) null, bVar);
        }
    }

    /* renamed from: a */
    public void mo6681a(String str, ArrayList<String> arrayList, C1746T.C1751e eVar) {
        new C1764ad(str, arrayList, eVar).execute(new String[0]);
    }

    /* renamed from: a */
    public void mo6668a(int i, int i2, Intent intent) {
        String str;
        int i3;
        String stringExtra;
        JSONObject jSONObject;
        if (i == 1000) {
            String str2 = "not_purchased";
            if (i2 == -1 && (stringExtra = intent.getStringExtra(PurchaseChannelChooseActivity.PURCHASE_RESULT)) != null) {
                try {
                    jSONObject = new JSONObject(stringExtra);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    if (jSONObject.has("status")) {
                        str2 = jSONObject.optString("status");
                    }
                    if (jSONObject.has("goods_id")) {
                        str = str2;
                        i3 = jSONObject.optInt("goods_id");
                        mo6670a(i3, str);
                    }
                }
            }
            str = str2;
            i3 = 0;
            mo6670a(i3, str);
        }
    }

    /* renamed from: f */
    public void mo6686f() {
        f5645J--;
        C1789h.m8227a().mo6797c();
        if (f5645J <= 0) {
            if (C1787g.m8211a()) {
                C1787g.m8212b().mo6788b(this.f5682O);
                C1787g.m8212b().mo6790d();
            }
            f5643C.clear();
            this.f5675F = 0;
            f5644E = null;
        }
    }

    /* renamed from: b */
    private void m7992b(int i, String str) {
        Iterator<C1746T.C1747a> it = f5643C.iterator();
        while (it.hasNext()) {
            it.next().onPurchaseFinished(i, str);
        }
        this.f5678I = 0;
    }

    /* renamed from: h */
    private void m8007h() {
        Iterator<C1746T.C1747a> it = f5643C.iterator();
        while (it.hasNext()) {
            it.next().onSetupFinished();
        }
    }

    /* renamed from: i */
    private void m8008i() {
        Iterator<C1746T.C1747a> it = f5643C.iterator();
        while (it.hasNext()) {
            it.next().onUpdateFinished();
        }
    }

    /* renamed from: a */
    private boolean m7988a(String str, String str2, String str3) {
        return !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && C1765ae.m8111a(str, str2, str3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6671a(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x001d
            r1 = 0
            java.lang.String r2 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApKy5hAzRYV5hY6qnkRMEVjiBmWf/krYT1ub4VdkjheHI2022F5We2VRCfRGpSwsOOyG4lWZSc82JZ+Y5vcMNgy8fsT3Nu05cjLQqfg+zTlVc6bUVqWdJLNLvqIxvcDHhIxK4ia15zhdPEhDOsoVqcE+XB0L+vl1oOW3vcJFoKE39ChxLwPMD1JXLlQOAxOhtl/xyOQptAkR619PVUVlmpJK4T25uo1v6G2aVuomvs394xq82vbdrx5qOn6G6+zOfU0ISrD4P1UgXnAvJfIdy31iz5jWmbNyQa3LoMLF4t7BzEEzaKI7t9d4nqPrpDlnuYFx8Nw1fyco/kpxO4lOh5wIDAQAB"
            boolean r2 = r4.m7988a((java.lang.String) r2, (java.lang.String) r6, (java.lang.String) r7)
            if (r2 == 0) goto L_0x0019
            com.cootek.smartinput5.func.iab.V r2 = new com.cootek.smartinput5.func.iab.V     // Catch:{ JSONException -> 0x002b }
            r2.<init>(r6, r7)     // Catch:{ JSONException -> 0x002b }
            r0 = 1
            int r1 = r4.f5678I     // Catch:{ JSONException -> 0x0033 }
            com.cootek.smartinput5.func.iab.C1779g.m8162a((int) r1)     // Catch:{ JSONException -> 0x0033 }
            r1 = r0
            r0 = r2
        L_0x0019:
            if (r1 != 0) goto L_0x001d
            r5 = -10014(0xffffffffffffd8e2, float:NaN)
        L_0x001d:
            boolean r1 = m8004c()
            if (r1 == 0) goto L_0x002a
            com.cootek.smartinput5.func.iab.E r1 = m8005d()
            r1.mo6669a((int) r5, (com.cootek.smartinput5.func.iab.C1754V) r0, (java.lang.String) r8)
        L_0x002a:
            return
        L_0x002b:
            r2 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x002f:
            r3 = r0
            r0 = r1
            r1 = r3
            goto L_0x0019
        L_0x0033:
            r1 = move-exception
            r1 = r2
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.iab.C1730E.mo6671a(int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6669a(int i, C1754V v, String str) {
        if (i == 0 && v != null) {
            mo6718c(v);
        }
        m7960a(i, v, str, this.f5679K);
    }

    /* renamed from: a */
    public void mo6678a(String str, int i) {
        mo6679a(str, (C1746T.C1750d) new C1738L(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ArrayList<C2250J.C2251a> m7956a(ArrayList<C1754V> arrayList) {
        Object a;
        if (arrayList == null) {
            return null;
        }
        ArrayList<C2250J.C2251a> arrayList2 = new ArrayList<>();
        Iterator<C1754V> it = arrayList.iterator();
        while (it.hasNext()) {
            C1754V next = it.next();
            if (!(next == null || (a = m7951a(next, (String) f5659m)) == null || mo6689i((String) a))) {
                C2250J.C2251a aVar = new C2250J.C2251a((String) a, m7989b(next), "Google");
                aVar.mo7818a(next);
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7983a(boolean z, int i, String str, C1746T.C1752f fVar) {
        if (fVar != null) {
            fVar.mo6710a(z, i, str);
        }
    }

    /* renamed from: a */
    private C1767ag m7950a(String str, JSONArray jSONArray) throws JSONException {
        String str2;
        String str3;
        String str4;
        String str5;
        C1767ag agVar = new C1767ag(str);
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && jSONObject.has(f5651e)) {
                    String string = jSONObject.getString(f5651e);
                    if (jSONObject.has("trans_id")) {
                        str2 = jSONObject.getString("trans_id");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has("status")) {
                        str3 = jSONObject.getString("status");
                    } else {
                        str3 = null;
                    }
                    if (jSONObject.has(f5655i)) {
                        str4 = jSONObject.getString(f5655i);
                    } else {
                        str4 = null;
                    }
                    if (jSONObject.has(f5656j)) {
                        str5 = jSONObject.getString(f5656j);
                    } else {
                        str5 = null;
                    }
                    C1767ag.C1768a aVar = new C1767ag.C1768a();
                    aVar.f5756a = str2;
                    aVar.f5757b = str3;
                    aVar.f5758c = str4;
                    aVar.f5759d = str5;
                    aVar.f5760e = string;
                    agVar.mo6763a(aVar);
                }
            }
        }
        return agVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6667a(String str, ArrayList<String> arrayList, C1753U u) {
        C1766af afVar;
        Bundle bundle = new Bundle();
        int a = m7948a(str, arrayList, bundle);
        if (a == 0) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList<String> stringArrayList = bundle.getStringArrayList(C1778f.f5810ad);
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    try {
                        afVar = new C1766af(it.next());
                    } catch (JSONException e) {
                        afVar = null;
                    }
                    if (afVar != null) {
                        arrayList2.add(afVar);
                    }
                }
                a = 0;
            } else {
                a = C1778f.f5844v;
            }
            u.mo6714a((Collection<C1766af>) arrayList2);
        }
        return a;
    }

    /* renamed from: a */
    private int m7948a(String str, ArrayList<String> arrayList, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList(C1778f.f5820an, arrayList);
        return m7946a(str, bundle2, bundle);
    }

    /* renamed from: a */
    private void m7959a(int i) {
        if (this.f5674D != null) {
            Intent k = m8010k();
            k.putExtra(PurchaseChannelChooseActivity.PURCHASE_GOODS_ID, i);
            try {
                this.f5674D.startActivityForResult(k, 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    private ArrayList<String> m8009j() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (mo6687g(C1778f.f5818al) || mo6687g(C1778f.f5819am)) {
            arrayList.add("Google");
        }
        return arrayList;
    }

    /* renamed from: k */
    private Intent m8010k() {
        Intent intent = new Intent();
        intent.setClass(this.f5673B, PurchaseChannelChooseActivity.class);
        intent.putExtra(PurchaseChannelChooseActivity.AUTH_TOKEN, C2188Q.m9853a().mo7683c());
        intent.putStringArrayListExtra(PurchaseChannelChooseActivity.PURCHASE_LOCAL_SUPPORTED_CHANNELS, m8009j());
        return intent;
    }

    /* renamed from: b */
    private void m7994b(int i, String str, JSONObject jSONObject) {
        boolean z = false;
        C1779g.m8172a(false, i);
        if (jSONObject != null && jSONObject.has(f5651e) && jSONObject.has(f5652f)) {
            z = true;
            String optString = jSONObject.optString(f5651e);
            String optString2 = jSONObject.optString(f5652f);
            this.f5679K = jSONObject.optBoolean(f5658l);
            m7993b(i, str, optString, optString2);
        }
        if (!z) {
            C1794k.m8255a(this.f5673B, i, (int) C1778f.f5845w);
        }
    }

    /* renamed from: a */
    public static Object m7951a(C1754V v, String str) {
        JSONObject jSONObject;
        if (v == null || TextUtils.isEmpty(v.mo6729f())) {
            return null;
        }
        try {
            jSONObject = new JSONObject(v.mo6729f());
        } catch (JSONException e) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.opt(str);
        }
        return null;
    }

    /* renamed from: a */
    private String m7952a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("goods_id", i);
            jSONObject.put(f5659m, str);
            jSONObject.put("type", str2);
        } catch (JSONException e) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    private void m7993b(int i, String str, String str2, String str3) {
        C2291n nVar = new C2291n();
        nVar.f10044d = str;
        nVar.f10043c = i;
        C2373x xVar = new C2373x(nVar);
        m7976a(C1974m.m9063a(this.f5673B, (int) R.string.purchase_creating_order), (DialogInterface.OnCancelListener) new C1740N(this, xVar), true);
        xVar.mo8060a((C2373x.C2376b) new C1741O(this, str2, str3, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7977a(String str, String str2, int i, C2259P p) {
        boolean z = false;
        if (p != null) {
            C2291n nVar = (C2291n) p;
            if (m7987a(nVar)) {
                this.f5681N = false;
                m7976a(C1974m.m9063a(this.f5673B, (int) R.string.purchase_creating_order), (DialogInterface.OnCancelListener) new C1742P(this), true);
                mo6679a(str2, (C1746T.C1750d) new C1743Q(this, str, str2, i, nVar));
                z = true;
            } else {
                C1794k.m8258a(this.f5673B, i, (C2259P) nVar);
                z = true;
            }
        }
        if (!z) {
            C1794k.m8255a(this.f5673B, i, (int) C1778f.f5846x);
        }
    }

    /* renamed from: a */
    private boolean m7987a(C2291n nVar) {
        boolean z;
        if (nVar == null) {
            return false;
        }
        boolean z2 = nVar.f9746O == 200;
        if (nVar.f9748Q == 0 || nVar.f9748Q == 4003) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = "start_purchase".equals(nVar.f10041a);
        if (!z2 || !z || !equals) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo6672a(Activity activity, int i, String str, String str2, String str3) {
        C1779g.m8172a(true, i);
        this.f5674D = activity;
        JSONObject b = m7991b(str2, str3);
        if (b != null) {
            String optString = b.optString(f5651e);
            String optString2 = b.optString(f5652f);
            this.f5679K = b.optBoolean(f5658l, true);
            m7978a(optString, optString2, i, str);
            return;
        }
        C1794k.m8255a(this.f5673B, i, (int) C1778f.f5845w);
    }

    /* renamed from: b */
    private JSONObject m7991b(String str, String str2) {
        if ("Google".equals(str)) {
            return m8011l(str2);
        }
        return null;
    }

    /* renamed from: l */
    private JSONObject m8011l(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null) {
            for (String has : new String[]{f5651e, f5652f}) {
                if (!jSONObject.has(has)) {
                    return null;
                }
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7978a(String str, String str2, int i, String str3) {
        this.f5677H = str3;
        this.f5678I = i;
        String a = m7952a(i, str3, str2);
        C1754V d = mo6719d(str);
        if (d != null) {
            C1794k.m8262a(this.f5673B, i, str2, str3, d);
            return;
        }
        boolean z = true;
        int i2 = C1778f.f5847y;
        C1789h.m8227a().mo6796b();
        if (!TextUtils.isEmpty(a)) {
            try {
                C1787g.m8212b().mo6784a(this.f5674D, str, str2, a);
            } catch (RemoteException e) {
                z = false;
            }
        } else {
            i2 = C1778f.f5792M;
            z = false;
        }
        if (!z) {
            C1794k.m8255a(this.f5673B, i, i2);
            mo6688h(str3);
        }
    }

    /* renamed from: h */
    public void mo6688h(String str) {
        m7979a(str, f5664r, "Google", (String) null, (C1754V) null, false);
    }

    /* renamed from: a */
    private int m7946a(String str, Bundle bundle, Bundle bundle2) {
        int i = 0;
        Bundle bundle3 = null;
        try {
            bundle3 = C1787g.m8212b().mo6781a(str, bundle);
        } catch (RemoteException e) {
            i = C1778f.f5848z;
        }
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6665a(C1754V v) {
        if (v == null) {
            return 6;
        }
        try {
            return C1787g.m8212b().mo6787b(v.mo6730g());
        } catch (RemoteException e) {
            return C1778f.f5781B;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6666a(String str, C1753U u) {
        return m7947a(str, (String) null, u);
    }

    /* renamed from: a */
    private String m7953a(ArrayList<String> arrayList, int i) {
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i);
    }

    /* renamed from: a */
    private int m7947a(String str, String str2, C1753U u) {
        Bundle bundle;
        C1754V v;
        if (u == null) {
            return C1778f.f5785F;
        }
        try {
            bundle = C1787g.m8212b().mo6782a(str, str2);
        } catch (RemoteException e) {
            bundle = null;
        }
        if (bundle == null) {
            return C1778f.f5784E;
        }
        int i = bundle.getInt(C1778f.f5809ac);
        if (i != 0) {
            return i;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(C1778f.f5816aj);
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(C1778f.f5814ah);
        String string = bundle.getString(C1778f.f5817ak);
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str3 = stringArrayList.get(i2);
                String a = m7953a(stringArrayList2, i2);
                if (m7988a(f5646M, str3, a) && str3 != null) {
                    try {
                        v = new C1754V(str3, a);
                    } catch (JSONException e2) {
                        v = null;
                    }
                    u.mo6718c(v);
                }
            }
        }
        if (string != null) {
            m7947a(str, string, u);
        }
        return i;
    }

    /* renamed from: a */
    private void m7982a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        this.f5676G = z;
        this.f5675F = 1;
        if (!C1787g.m8212b().mo6791e()) {
            if (Settings.isInitialized()) {
                z2 = Settings.getInstance().getBoolSetting(Settings.BIND_GOOGLE_SERVICE_FAILED);
            } else {
                z2 = false;
            }
            if (!z2) {
                m7999b(true);
                z3 = C1787g.m8212b().mo6789c();
            } else {
                z3 = false;
            }
            if (!z3) {
                m7999b(false);
                m8012l();
            }
        } else {
            z4 = false;
        }
        if (!z4) {
            m8012l();
        }
    }

    /* renamed from: a */
    private void m7960a(int i, C1754V v, String str, boolean z) {
        boolean z2;
        boolean z3 = i == 0;
        String str2 = f5664r;
        if (z3) {
            str2 = "purchase_success";
            z2 = z;
        } else {
            z2 = false;
        }
        m7979a(this.f5677H, str2, "Google", (String) null, v, z2);
        if (z2) {
            return;
        }
        if (!z3) {
            C1794k.m8256a(this.f5673B, this.f5678I, i, str);
        } else {
            mo6670a(this.f5678I, "purchase_success");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7973a(C1767ag agVar, C1746T.C1748b bVar) {
        C2250J a;
        boolean z = false;
        if (!(agVar == null || (a = agVar.mo6762a()) == null)) {
            z = true;
            new C2373x(a).mo8060a((C2373x.C2376b) new C1744R(this, bVar));
        }
        if (!z) {
            m7981a((JSONArray) null, bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public JSONArray m7958a(C2259P p) {
        JSONArray jSONArray = null;
        if (p != null) {
            C2250J j = (C2250J) p;
            ArrayList<C2250J.C2252b> j2 = j.mo7816j();
            if (j2 != null && j2.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<C2250J.C2252b> it = j2.iterator();
                while (it.hasNext()) {
                    C2250J.C2252b next = it.next();
                    if (next.mo7820a() == 0 || next.mo7820a() == 4001) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", next.mo7821b());
                            jSONObject.put("goods_id", next.mo7822c());
                        } catch (JSONException e) {
                        }
                        jSONArray2.put(jSONObject);
                    }
                }
                jSONArray = jSONArray2;
            }
            m7998b(j);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private void m7979a(String str, String str2, String str3, String str4, C1754V v, boolean z) {
        C2250J.C2251a aVar = new C2250J.C2251a(str, m7989b(v), str3);
        aVar.mo7819a(str4);
        aVar.mo7818a(v);
        mo6677a(aVar, z);
    }

    /* renamed from: b */
    public static String m7989b(C1754V v) {
        if (v == null) {
            return f5664r;
        }
        switch (v.mo6728e()) {
            case 0:
                return "purchase_success";
            case 1:
                return f5664r;
            case 2:
                return "refund_success";
            default:
                return f5664r;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6677a(C2250J.C2251a aVar, boolean z) {
        if (z) {
            C1789h.m8227a().mo6795a(this.f5673B, (C1789h.C1791b) new C1745S(this));
        }
        m7974a(aVar, (C2373x.C2376b) new C1733G(this, z, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7975a(C2259P p, C2250J.C2251a aVar) {
        if (m8001b(p)) {
            mo6670a(this.f5678I, "purchase_success");
        } else {
            C1794k.m8260a(this.f5673B, this.f5678I, p, aVar);
        }
    }

    /* renamed from: b */
    private boolean m8001b(C2259P p) {
        if (p == null || p.f9746O != 200) {
            return false;
        }
        if (p.f9748Q == 0 || p.f9748Q == 4001) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m7986a(C2250J j) {
        return j != null && j.f9746O == 200 && j.f9748Q == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7998b(C2250J j) {
        ArrayList<C2250J.C2252b> j2;
        if (m7986a(j) && (j2 = j.mo7816j()) != null) {
            mo6679a(C1778f.f5818al, (C1746T.C1750d) new C1734H(this, j2));
        }
    }

    /* renamed from: a */
    private boolean m7985a(C2250J.C2252b bVar) {
        return bVar != null && "purchase_success".equals(bVar.mo7821b()) && (bVar.mo7820a() == 0 || bVar.mo7820a() == 4001);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7997b(C2250J.C2252b bVar) {
        if (bVar == null) {
            return;
        }
        if (m7985a(bVar)) {
            C1754V c = m8002c(bVar);
            if (c != null && C1778f.f5818al.equals(m7951a(c, "type"))) {
                mo6676a(c, (C1746T.C1749c) null);
            }
        } else if (bVar.mo7820a() == 4002) {
            m8014m(bVar.mo7823d());
        }
    }

    /* renamed from: c */
    private C1754V m8002c(C2250J.C2252b bVar) {
        if (!(bVar == null || mo6715b() == null)) {
            for (C1754V next : mo6715b()) {
                if (next != null && TextUtils.equals((String) m7951a(next, f5659m), bVar.mo7823d())) {
                    return next;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ArrayList<C1754V> m7990b(int i) {
        Object a;
        ArrayList<C1754V> arrayList = new ArrayList<>();
        if (mo6715b() != null) {
            for (C1754V next : mo6715b()) {
                if (!(next == null || (a = m7951a(next, "goods_id")) == null || ((Integer) a).intValue() != i)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m7974a(C2250J.C2251a aVar, C2373x.C2376b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        m7980a((ArrayList<C2250J.C2251a>) arrayList, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7980a(ArrayList<C2250J.C2251a> arrayList, C2373x.C2376b bVar) {
        C2250J j = new C2250J();
        j.mo7815a(arrayList);
        new C2373x(j).mo8060a(bVar);
    }

    /* renamed from: a */
    private void m7976a(String str, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        C1789h.m8227a().mo6795a(this.f5673B, (C1789h.C1791b) new C1735I(this, z, str, onCancelListener));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7981a(JSONArray jSONArray, C1746T.C1748b bVar) {
        if (bVar != null) {
            bVar.mo5745a(jSONArray);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6670a(int i, String str) {
        C1789h.m8227a().mo6796b();
        m7992b(i, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m8012l() {
        this.f5675F = 2;
        if (this.f5676G) {
            m8007h();
        } else {
            m8008i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m8013m() {
        Iterator<C1746T.C1747a> it = f5643C.iterator();
        while (it.hasNext()) {
            it.next().onServiceDisconnected();
        }
    }

    /* renamed from: m */
    private void m8014m(String str) {
        if (str != null && !this.f5680L.contains(str)) {
            this.f5680L.add(str);
        }
    }

    /* renamed from: i */
    public boolean mo6689i(String str) {
        return this.f5680L.contains(str);
    }

    /* renamed from: j */
    public void mo6690j(String str) {
        this.f5680L.remove(str);
    }

    /* renamed from: a */
    public void mo5759a(String str) {
        if (Settings.isInitialized() && "com.android.vending".equals(str)) {
            m7999b(false);
        }
    }

    /* renamed from: b */
    public void mo5760b(String str) {
        if (Settings.isInitialized() && "com.android.vending".equals(str)) {
            m7999b(false);
        }
    }

    /* renamed from: a */
    public void mo6058a(String str, String str2) {
        this.f5680L.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7999b(boolean z) {
        if (Settings.isInitialized()) {
            Settings.getInstance().setBoolSetting(Settings.BIND_GOOGLE_SERVICE_FAILED, z);
        }
    }
}
