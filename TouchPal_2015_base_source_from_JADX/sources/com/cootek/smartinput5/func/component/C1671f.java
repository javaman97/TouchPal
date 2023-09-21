package com.cootek.smartinput5.func.component;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1579bD;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2262a;
import com.cootek.smartinput5.net.cmd.C2265b;
import com.cootek.smartinput5.net.cmd.C2270d;
import com.cootek.smartinput5.net.cmd.C2273e;
import com.cootek.smartinput5.net.cmd.C2276f;
import com.cootek.smartinput5.net.cmd.C2279g;
import com.cootek.smartinput5.net.cmd.C2282h;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.component.f */
/* compiled from: CloudBackupSync */
public class C1671f extends C2220ah implements C2373x.C2376b {

    /* renamed from: a */
    public static final int f5457a = 5;

    /* renamed from: b */
    public static final String f5458b = "CloudBackupSync";

    /* renamed from: c */
    public static final int f5459c = 1006;

    /* renamed from: d */
    public static final int f5460d = 1007;

    /* renamed from: e */
    public static final int f5461e = 3004;

    /* renamed from: f */
    public static final int f5462f = -1;

    /* renamed from: g */
    public static final int f5463g = -2;

    /* renamed from: h */
    public static final int f5464h = 360;

    /* renamed from: i */
    public static final int f5465i = 3;

    /* renamed from: u */
    private static Boolean f5466u = Boolean.FALSE;

    /* renamed from: j */
    private ProgressDialog f5467j;

    /* renamed from: k */
    private AlertDialog f5468k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Context f5469l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f5470m = true;

    /* renamed from: n */
    private String f5471n;

    /* renamed from: o */
    private String f5472o;

    /* renamed from: p */
    private boolean f5473p;

    /* renamed from: q */
    private C1672a f5474q;

    /* renamed from: r */
    private ArrayList<C2373x> f5475r;

    /* renamed from: s */
    private ArrayList<C2373x> f5476s;

    /* renamed from: t */
    private StringBuilder f5477t;

    /* renamed from: com.cootek.smartinput5.func.component.f$a */
    /* compiled from: CloudBackupSync */
    public interface C1672a {
        /* renamed from: a */
        C1671f mo6487a();

        /* renamed from: a */
        String mo6488a(String str);

        /* renamed from: a */
        void mo6489a(int i);

        /* renamed from: a */
        void mo6490a(long j, String str);

        /* renamed from: a */
        void mo6491a(Context context);

        /* renamed from: a */
        void mo6492a(C2262a aVar, StringBuilder sb);

        /* renamed from: a */
        void mo6493a(C2265b bVar);

        /* renamed from: a */
        void mo6494a(C2265b bVar, StringBuilder sb);

        /* renamed from: a */
        void mo6495a(C2270d dVar, StringBuilder sb);

        /* renamed from: a */
        void mo6496a(C2273e eVar, StringBuilder sb);

        /* renamed from: a */
        void mo6497a(C2276f fVar, StringBuilder sb);

        /* renamed from: a */
        void mo6498a(C2279g gVar, StringBuilder sb);

        /* renamed from: a */
        void mo6499a(C2282h hVar, StringBuilder sb);

        /* renamed from: a */
        void mo6500a(C2282h hVar, StringBuilder sb, boolean z);

        /* renamed from: a */
        void mo6501a(String str, int i, StringBuilder sb);

        /* renamed from: a */
        void mo6502a(String str, Bundle bundle);

        /* renamed from: a */
        void mo6503a(String str, StringBuilder sb);

        /* renamed from: a */
        void mo6504a(boolean z);

        /* renamed from: a */
        boolean mo6506a(StringBuilder sb);

        /* renamed from: b */
        String mo6507b(String str);

        /* renamed from: b */
        void mo6508b(long j, String str);

        /* renamed from: b */
        void mo6509b(String str, StringBuilder sb);

        /* renamed from: b */
        void mo6510b(boolean z);

        /* renamed from: b */
        String[] mo6512b();

        /* renamed from: c */
        void mo6513c();

        /* renamed from: c */
        void mo6514c(String str, StringBuilder sb);

        /* renamed from: d */
        boolean mo6515d();

        /* renamed from: e */
        void mo6516e();

        /* renamed from: f */
        void mo6517f();
    }

    public C1671f(Context context, C2220ah.C2221a aVar) {
        super(aVar);
        this.f5469l = context;
        m7711k();
    }

    public C1671f(C2220ah.C2221a aVar) {
        super(aVar);
        m7711k();
    }

    /* renamed from: k */
    private void m7711k() {
        this.f5475r = new ArrayList<>();
        this.f5476s = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo6528a(C1672a aVar) {
        this.f5474q = aVar;
    }

    /* renamed from: d */
    public static synchronized boolean m7707d() {
        boolean booleanValue;
        synchronized (C1671f.class) {
            booleanValue = f5466u.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    private static synchronized void m7691a(Boolean bool) {
        synchronized (C1671f.class) {
            f5466u = bool;
        }
    }

    /* renamed from: a */
    public void mo6531a(boolean z, C2276f.C2277a aVar) {
        C2276f fVar = new C2276f(aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        m7696a(z, false, (ArrayList<C2259P>) arrayList);
    }

    /* renamed from: a */
    public void mo6532a(boolean z, C2279g.C2280a aVar) {
        C2279g gVar = new C2279g(aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(gVar);
        m7696a(z, false, (ArrayList<C2259P>) arrayList);
    }

    /* renamed from: a */
    public void mo6533a(boolean z, ArrayList<C2282h.C2283a> arrayList) {
        C2282h hVar = new C2282h(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(hVar);
        m7696a(z, false, (ArrayList<C2259P>) arrayList2);
    }

    /* renamed from: com.cootek.smartinput5.func.component.f$b */
    /* compiled from: CloudBackupSync */
    public class C1673b {
        public C1673b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6540a() {
        }
    }

    /* renamed from: b */
    public void mo6536b(boolean z, ArrayList<C2270d.C2271a> arrayList) {
        C1674g gVar = new C1674g(this, arrayList, z);
        if (z) {
            m7695a(z, (C1673b) gVar);
        } else {
            gVar.mo6540a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7696a(boolean z, boolean z2, ArrayList<C2259P> arrayList) {
        String a;
        String a2;
        if (!C2188Q.m9853a().mo7686f()) {
            mo6538f();
            m7682a((int) R.string.vi_need_network, z, (DialogInterface.OnClickListener) new C1676i(this), (int) R.string.network_setting, (DialogInterface.OnClickListener) new C1677j(this), 17039360);
        } else if (m7707d()) {
            mo6538f();
            m7681a((int) R.string.sync_userdata_on_the_fly, z);
        } else {
            this.f5473p = z;
            this.f5477t = new StringBuilder();
            try {
                this.f5470m = false;
                if (z) {
                    if (z2) {
                        a = C1974m.m9063a(this.f5469l, (int) R.string.optpage_clear_backup);
                        a2 = C1974m.m9063a(this.f5469l, (int) R.string.clear_userdata_message);
                    } else {
                        a = C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_title);
                        a2 = C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_message);
                    }
                    try {
                        this.f5467j = ProgressDialog.show(this.f5469l, a, a2, true, true);
                    } catch (Exception e) {
                    }
                    this.f5467j.setOnCancelListener(new C1678k(this));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            m7712l();
            m7691a(Boolean.TRUE);
            m7694a(arrayList);
        }
    }

    /* renamed from: a */
    public void mo6529a(String str) {
        this.f5471n = str;
    }

    /* renamed from: b */
    public void mo6535b(String str) {
        this.f5472o = str;
    }

    /* renamed from: l */
    private void m7712l() {
        this.f5475r.clear();
        this.f5476s.clear();
        this.f5474q.mo6516e();
    }

    /* renamed from: a */
    private void m7694a(ArrayList<C2259P> arrayList) {
        C1246d.m6010a(this.f5469l).mo4591a("CLOUD_SYNC/cloud_sync_start", this.f5473p ? C1246d.f3748aR : C1246d.f3749aS, C1246d.f3933e);
        Iterator<C2259P> it = arrayList.iterator();
        while (it.hasNext()) {
            m7705d(it.next());
        }
        m7713m();
    }

    /* renamed from: c */
    private void m7703c(C2259P p) {
        Iterator<C2373x> it = this.f5476s.iterator();
        while (it.hasNext()) {
            C2373x next = it.next();
            if (next.f10444a == p) {
                this.f5476s.remove(next);
                return;
            }
        }
    }

    /* renamed from: d */
    private void m7705d(C2259P p) {
        this.f5475r.add(new C2373x(p));
    }

    /* renamed from: e */
    private void m7708e(C2259P p) {
        this.f5475r.add(0, new C2373x(p));
    }

    /* renamed from: m */
    private void m7713m() {
        int size = this.f5475r.size();
        if (size != 0) {
            if (size > 3) {
                size = 3;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.f5475r.get(i));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2373x xVar = (C2373x) it.next();
                this.f5475r.remove(xVar);
                xVar.mo8060a((C2373x.C2376b) this);
                this.f5476s.add(xVar);
            }
            arrayList.clear();
        }
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        boolean z = true;
        m7703c(p);
        int i = p.f9748Q;
        switch (i) {
            case 1006:
                m7706d(this.f5473p);
                break;
            case f5460d /*1007*/:
                m7710f(this.f5473p);
                break;
            case f5461e /*3004*/:
                m7709e(this.f5473p);
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            m7698b(i);
            m7704c(this.f5473p);
            m7691a(Boolean.FALSE);
            return;
        }
        if (p instanceof C2282h) {
            m7690a((C2282h) p);
        } else if (p instanceof C2276f) {
            m7688a((C2276f) p);
        } else if (p instanceof C2262a) {
            m7684a((C2262a) p);
        } else if (p instanceof C2273e) {
            m7687a((C2273e) p);
        } else if (p instanceof C2279g) {
            m7689a((C2279g) p);
        } else if (p instanceof C2265b) {
            m7685a((C2265b) p);
        } else if (p instanceof C2270d) {
            m7686a((C2270d) p);
        }
        if (!this.f5475r.isEmpty() || !this.f5476s.isEmpty()) {
            m7713m();
            return;
        }
        m7702c(this.f5469l);
        m7715o();
        m7692a(this.f5477t.toString(), this.f5473p);
        m7691a(Boolean.FALSE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7690a(com.cootek.smartinput5.net.cmd.C2282h r9) {
        /*
            r8 = this;
            r2 = 0
            com.cootek.smartinput5.func.component.f$a r0 = r8.f5474q
            java.lang.StringBuilder r1 = r8.f5477t
            r0.mo6499a((com.cootek.smartinput5.net.cmd.C2282h) r9, (java.lang.StringBuilder) r1)
            java.util.ArrayList r0 = r9.mo7863j()
            if (r0 == 0) goto L_0x007c
            java.util.Iterator r4 = r0.iterator()
        L_0x0013:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r4.next()
            com.cootek.smartinput5.net.cmd.h$b r0 = (com.cootek.smartinput5.net.cmd.C2282h.C2284b) r0
            java.lang.String r5 = r0.f9991a
            int r1 = r0.f9992b
            switch(r1) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0062;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0013
        L_0x0027:
            java.lang.String r6 = r0.f9993c
            java.lang.String r0 = "size"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004d }
            r1.<init>(r6)     // Catch:{ JSONException -> 0x004d }
            boolean r7 = r1.has(r0)     // Catch:{ JSONException -> 0x004d }
            if (r7 == 0) goto L_0x0051
            long r0 = r1.getLong(r0)     // Catch:{ JSONException -> 0x004d }
        L_0x003a:
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0053
            r6 = -2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0013
            com.cootek.smartinput5.func.component.f$a r0 = r8.f5474q
            r1 = 5
            java.lang.StringBuilder r6 = r8.f5477t
            r0.mo6501a((java.lang.String) r5, (int) r1, (java.lang.StringBuilder) r6)
            goto L_0x0013
        L_0x004d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0051:
            r0 = r2
            goto L_0x003a
        L_0x0053:
            java.lang.String r0 = r8.f5472o
            com.cootek.smartinput5.net.cmd.f$a r0 = r8.mo6526a((java.lang.String) r5, (java.lang.String) r0, (java.lang.String) r6)
            com.cootek.smartinput5.net.cmd.f r1 = new com.cootek.smartinput5.net.cmd.f
            r1.<init>(r0)
            r8.m7705d((com.cootek.smartinput5.net.cmd.C2259P) r1)
            goto L_0x0013
        L_0x0062:
            com.cootek.smartinput5.net.cmd.g$a r0 = r8.mo6537c((java.lang.String) r5)
            com.cootek.smartinput5.net.cmd.g r1 = new com.cootek.smartinput5.net.cmd.g
            r1.<init>(r0)
            r8.m7705d((com.cootek.smartinput5.net.cmd.C2259P) r1)
            goto L_0x0013
        L_0x006f:
            com.cootek.smartinput5.func.component.f$a r0 = r8.f5474q
            java.lang.StringBuilder r1 = r8.f5477t
            java.util.ArrayList<com.cootek.smartinput5.net.x> r2 = r8.f5475r
            boolean r2 = r2.isEmpty()
            r0.mo6500a((com.cootek.smartinput5.net.cmd.C2282h) r9, (java.lang.StringBuilder) r1, (boolean) r2)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.component.C1671f.m7690a(com.cootek.smartinput5.net.cmd.h):void");
    }

    /* renamed from: a */
    private void m7688a(C2276f fVar) {
        C2276f.C2278b j = fVar.mo7852j();
        if (j != null) {
            Bundle b = C0997e.m5186b(this.f5469l, j.f9953a);
            String string = b.getString("md5");
            long j2 = b.getLong("size");
            if (j2 > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(fVar.mo7854l_().f9952e);
                    if (jSONObject.has("size") && jSONObject.getLong("size") != j2) {
                        fVar.mo7853k();
                    }
                } catch (JSONException e) {
                    fVar.mo7853k();
                    e.printStackTrace();
                }
            } else {
                fVar.mo7853k();
            }
            if (fVar.mo7852j() != null) {
                C2262a.C2263a aVar = new C2262a.C2263a();
                aVar.f9829a = j.f9954b;
                aVar.f9830b = j.f9955c;
                aVar.f9832d = j.f9953a;
                aVar.f9831c = j.f9956d;
                aVar.f9833e = string;
                aVar.f9834f = j2;
                m7708e((C2259P) new C2262a(aVar));
            }
        }
        this.f5474q.mo6497a(fVar, this.f5477t);
    }

    /* renamed from: a */
    private void m7684a(C2262a aVar) {
        this.f5474q.mo6492a(aVar, this.f5477t);
        C2262a.C2264b f = aVar.mo7835f();
        if (f != null) {
            C2273e.C2274a aVar2 = new C2273e.C2274a();
            aVar2.f9931a = f.f9835a;
            aVar2.f9932b = f.f9836b;
            aVar2.f9933c = f.f9837c;
            aVar2.f9934d = f.f9838d;
            m7708e((C2259P) new C2273e(aVar2));
        }
    }

    /* renamed from: a */
    private void m7687a(C2273e eVar) {
        this.f5474q.mo6496a(eVar, this.f5477t);
        C2273e.C2275b j = eVar.mo7847j();
        if (j != null) {
            String str = j.f9935a;
            String str2 = j.f9936b;
            if (str2 != null && str2 != "") {
                try {
                    this.f5474q.mo6490a((long) Double.parseDouble(str2), str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private void m7689a(C2279g gVar) {
        this.f5474q.mo6498a(gVar, this.f5477t);
        C2279g.C2281b j = gVar.mo7858j();
        if (j != null) {
            C2265b.C2266a aVar = new C2265b.C2266a();
            aVar.f9850b = j.f9969b;
            aVar.f9852d = j.f9971d;
            aVar.f9849a = j.f9968a;
            aVar.f9851c = j.f9970c;
            aVar.f9853e = j.f9972e;
            C2265b bVar = new C2265b(aVar);
            this.f5474q.mo6493a(bVar);
            m7708e((C2259P) bVar);
        }
    }

    /* renamed from: a */
    private void m7685a(C2265b bVar) {
        this.f5474q.mo6494a(bVar, this.f5477t);
        C2265b.C2267b f = bVar.mo7837f();
        boolean b = m7701b(bVar);
        if (f == null || !b) {
            bVar.mo7838g();
            return;
        }
        String str = f.f9854a;
        String str2 = f.f9856c;
        if (str2 != null && str2 != "") {
            try {
                this.f5474q.mo6508b((long) Double.parseDouble(str2), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m7686a(C2270d dVar) {
        this.f5474q.mo6495a(dVar, this.f5477t);
        C2270d.C2272b j = dVar.mo7842j();
        if (j != null) {
            String str = j.f9921b;
            switch (j.f9920a) {
                case 0:
                    this.f5474q.mo6514c(str, this.f5477t);
                    return;
                case 1:
                    this.f5474q.mo6503a(str, this.f5477t);
                    return;
                case 2:
                    this.f5474q.mo6509b(str, this.f5477t);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: e */
    public void mo6457e() {
        m7714n();
        this.f5470m = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m7714n() {
        Iterator<C2373x> it = this.f5475r.iterator();
        while (it.hasNext()) {
            it.next().mo8061b();
        }
        this.f5475r.clear();
        Iterator<C2373x> it2 = this.f5476s.iterator();
        while (it2.hasNext()) {
            it2.next().mo8061b();
        }
        this.f5476s.clear();
        m7704c(this.f5473p);
        m7698b(-1);
        m7691a(Boolean.FALSE);
        C1246d.m6010a(this.f5469l).mo4591a(C1246d.f3738aH, C1246d.f3746aP, C1246d.f3933e);
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }

    /* renamed from: a */
    private void m7692a(String str, boolean z) {
        m7693a(str, z, (DialogInterface.OnClickListener) null, 17039370, (DialogInterface.OnClickListener) null, 17039360);
    }

    /* renamed from: a */
    private void m7682a(int i, boolean z, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2, int i3) {
        m7693a(C1974m.m9063a(this.f5469l, i), z, onClickListener, i2, onClickListener2, i3);
    }

    /* renamed from: a */
    private void m7693a(String str, boolean z, DialogInterface.OnClickListener onClickListener, int i, DialogInterface.OnClickListener onClickListener2, int i2) {
        if (z && this.f5469l != null) {
            AlertDialog.Builder positiveButton = new C2894d.C2895a(this.f5469l).setTitle(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_title)).setMessage(str).setPositiveButton(C1974m.m9063a(this.f5469l, i), onClickListener);
            if (onClickListener2 != null) {
                positiveButton.setNegativeButton(C1974m.m9063a(this.f5469l, i2), onClickListener2);
            }
            m7704c(z);
            this.f5468k = positiveButton.create();
            try {
                this.f5468k.show();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: c */
    private void m7704c(boolean z) {
        if (z && this.f5467j != null && this.f5467j.isShowing()) {
            try {
                this.f5467j.dismiss();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    private void m7681a(int i, boolean z) {
        if (z) {
            try {
                new C2894d.C2895a(this.f5469l).setTitle(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_title)).setMessage(C1974m.m9063a(this.f5469l, i)).create().show();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    private void m7695a(boolean z, C1673b bVar) {
        if (z) {
            AlertDialog.Builder negativeButton = new C2894d.C2895a(this.f5469l).setTitle(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_title)).setMessage(C1974m.m9063a(this.f5469l, (int) R.string.clear_userdata_confirm)).setOnCancelListener(new C1680m(this)).setPositiveButton(C1974m.m9063a(this.f5469l, 17039370), new C1679l(this, bVar)).setNegativeButton(C1974m.m9063a(this.f5469l, 17039360), (DialogInterface.OnClickListener) null);
            m7704c(z);
            try {
                negativeButton.create().show();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: d */
    private void m7706d(boolean z) {
        if (z) {
            AlertDialog.Builder positiveButton = new C2894d.C2895a(this.f5469l).setTitle(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_title)).setMessage(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_need_login)).setOnCancelListener(new C1682o(this)).setPositiveButton(C1974m.m9063a(this.f5469l, 17039370), new C1681n(this));
            m7704c(z);
            try {
                positiveButton.create().show();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: e */
    private void m7709e(boolean z) {
        if (z) {
            AlertDialog.Builder message = new C2894d.C2895a(this.f5469l).setTitle(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_title)).setMessage(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_on_the_fly));
            m7704c(z);
            try {
                message.create().show();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: f */
    private void m7710f(boolean z) {
        if (z) {
            AlertDialog.Builder positiveButton = new C2894d.C2895a(this.f5469l).setTitle(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_title)).setMessage(C1974m.m9063a(this.f5469l, (int) R.string.sync_userdata_need_tobe_vip)).setOnCancelListener(new C1675h(this)).setPositiveButton(C1974m.m9063a(this.f5469l, 17039370), new C1683p(this));
            m7704c(z);
            try {
                positiveButton.create().show();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    public void mo6527a(Context context) {
        if (m7707d()) {
            mo6538f();
        } else if (!Settings.getInstance().getBoolSetting(260)) {
            C1017y.m5228d(f5458b, "Cloud Backup Sync is not enabled!");
            mo6538f();
        } else {
            m7702c(this.f5469l);
            if (!C2188Q.m9853a().mo7686f()) {
                mo6538f();
            } else if (!C2188Q.m9853a().mo7685e() && Settings.getInstance().getBoolSetting(Settings.CLOUD_SERVICE_WIFI_ONLY)) {
                mo6538f();
            } else if (!C1617br.m7367a().mo6335b()) {
                mo6538f();
            } else {
                this.f5474q.mo6504a(false);
            }
        }
    }

    /* renamed from: o */
    private void m7715o() {
        if (this.f5474q.mo6506a(this.f5477t)) {
            mo7752i();
        }
    }

    /* renamed from: p */
    private void m7716p() {
        m7698b(-2);
    }

    /* renamed from: b */
    private void m7698b(int i) {
        mo6538f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo6538f() {
        super.mo6538f();
        Settings.getInstance().setIntSetting(Settings.CLOUD_SERVICE_SYNC_NEXT_TIME, ((int) (System.currentTimeMillis() / Utils.MINUTE_MILLIS)) + 360);
    }

    /* renamed from: b */
    private boolean m7701b(C2265b bVar) {
        C2265b.C2266a i;
        boolean z = true;
        if (!TextUtils.isEmpty(bVar.f9845e) && C1368X.m6324d()) {
            String str = bVar.f9845e;
            int a = C1579bD.m7094a(str);
            C1579bD L = C1368X.m6320c().mo5826L();
            L.mo6211a(str + C1684q.f5492a, 3, a);
            if (L.mo6218h()) {
                z = false;
                m7700b("DICT_RECOVERY/DICT_ERROR_ON_CLOUD_SYNC_RESTORE", C1246d.f3707D, C1246d.f3836c);
                L.mo6211a(str, 3, a);
                if (!L.mo6218h() && (i = bVar.mo7839i()) != null) {
                    m7700b("CLOUD_SYNC/backup_after_check_image", C1246d.f3707D, C1246d.f3933e);
                    String str2 = i.f9849a;
                    m7705d((C2259P) new C2276f(mo6526a(str2, this.f5472o, this.f5474q.mo6507b(str2))));
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m7700b(String str, String str2, String str3) {
        if (C1368X.m6324d()) {
            C1246d.m6010a(this.f5469l).mo4591a(str, str2, str3);
        }
    }

    /* renamed from: c */
    private void m7702c(Context context) {
        File file;
        if (this.f5474q.mo6515d()) {
            if (!Engine.isInitialized() || Engine.getInstance().getUsrDicChecker().mo6519a()) {
                boolean isInitialized = Engine.isInitialized();
                if (isInitialized) {
                    C1368X.m6320c().mo5835h().release();
                }
                String[] b = this.f5474q.mo6512b();
                ArrayList arrayList = new ArrayList();
                for (String str : b) {
                    String a = this.f5474q.mo6488a(str);
                    String str2 = a + C1684q.f5492a;
                    try {
                        File a2 = C1466av.m6848a(context);
                        File a3 = C1358O.m6234a(C1358O.f4202m);
                        if (a3 != null) {
                            file = new File(a3, str2);
                        } else {
                            file = new File(a2, str2);
                        }
                        if (file != null && file.exists()) {
                            C0997e.m5173a(file, new File(a2, a));
                            file.delete();
                            arrayList.add(str);
                        }
                    } catch (Exception e) {
                        C1017y.m5213a(f5458b, e.toString());
                    }
                }
                if (isInitialized) {
                    C1368X.m6320c().mo5835h().init();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    this.f5474q.mo6502a(str3, C0997e.m5186b(this.f5469l, str3));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo6534b(Context context) {
        if (context != null) {
            this.f5469l = context;
        }
    }

    /* renamed from: g */
    public boolean mo6539g() {
        return this.f5473p;
    }

    /* renamed from: a */
    public void mo6530a(boolean z) {
        this.f5473p = z;
        if (!z) {
            m7704c(true);
        }
    }

    /* renamed from: a */
    public C2276f.C2277a mo6526a(String str, String str2, String str3) {
        C2276f.C2277a aVar = new C2276f.C2277a();
        aVar.f9948a = str;
        aVar.f9949b = this.f5471n;
        aVar.f9950c = str2;
        aVar.f9951d = "";
        if (str3 == null) {
            aVar.f9952e = "{}";
        } else {
            aVar.f9952e = str3;
        }
        return aVar;
    }

    /* renamed from: c */
    public C2279g.C2280a mo6537c(String str) {
        C2279g.C2280a aVar = new C2279g.C2280a();
        aVar.f9966a = str;
        aVar.f9967b = this.f5471n;
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.CLOUD_SERVICE_SYNC_NEXT_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 3.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.CLOUD_SERVICE_SYNC_NEXT_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        mo6527a(C1368X.m6313b());
    }
}
