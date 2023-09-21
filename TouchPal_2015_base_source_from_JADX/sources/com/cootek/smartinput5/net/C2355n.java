package com.cootek.smartinput5.net;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.cloke.CloudFeedback;
import com.cootek.smartinput5.engine.cloke.CloudParameters;
import com.cootek.smartinput5.engine.cloke.CloudResult;
import com.cootek.smartinput5.engine.cloke.CloudResultList;
import com.cootek.smartinput5.engine.cloke.SearchResultProtos;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2289l;
import com.cootek.smartinput5.net.cmd.C2290m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.p023a.p024a.p032b.p037d.C0781a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.cootek.smartinput5.net.n */
/* compiled from: CloudInputProcessor */
public class C2355n {

    /* renamed from: a */
    public static final int f10355a = 0;

    /* renamed from: b */
    public static final int f10356b = 1;

    /* renamed from: c */
    public static final int f10357c = 2;

    /* renamed from: p */
    private static final int f10358p = 5;

    /* renamed from: q */
    private static final int f10359q = 5;

    /* renamed from: A */
    private C2357b f10360A;

    /* renamed from: B */
    private C2290m f10361B;

    /* renamed from: C */
    private C2358c f10362C;

    /* renamed from: D */
    private C2373x f10363D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public CloudFeedback f10364E;

    /* renamed from: d */
    Handler f10365d;

    /* renamed from: e */
    private final String f10366e;

    /* renamed from: f */
    private int f10367f;

    /* renamed from: g */
    private final int f10368g;

    /* renamed from: h */
    private final int f10369h;

    /* renamed from: i */
    private final int f10370i;

    /* renamed from: j */
    private final int f10371j;

    /* renamed from: k */
    private final int f10372k;

    /* renamed from: l */
    private boolean f10373l;

    /* renamed from: m */
    private boolean f10374m;

    /* renamed from: n */
    private Queue<CloudFeedback> f10375n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Queue<CloudFeedback> f10376o;

    /* renamed from: r */
    private LinkedList<C2373x> f10377r;

    /* renamed from: s */
    private LinkedList<C2373x> f10378s;

    /* renamed from: t */
    private final int f10379t;

    /* renamed from: u */
    private final int f10380u;

    /* renamed from: v */
    private final int f10381v;

    /* renamed from: w */
    private final int f10382w;

    /* renamed from: x */
    private C2373x f10383x;

    /* renamed from: y */
    private C2373x.C2376b f10384y;

    /* renamed from: z */
    private C2289l f10385z;

    public C2355n() {
        this.f10366e = "CloudInputProcessor";
        this.f10367f = 3;
        this.f10368g = Settings.SUPER_DICT_DOWNLOADED;
        this.f10369h = 200;
        this.f10370i = 100;
        this.f10371j = C0781a.f1973a;
        this.f10372k = 1500;
        this.f10373l = false;
        this.f10374m = false;
        this.f10375n = new ConcurrentLinkedQueue();
        this.f10376o = new ConcurrentLinkedQueue();
        this.f10377r = new LinkedList<>();
        this.f10378s = new LinkedList<>();
        this.f10379t = 1;
        this.f10380u = 2;
        this.f10381v = 3;
        this.f10382w = 4;
        this.f10365d = new C2359o(this);
        this.f10383x = null;
        this.f10384y = null;
        this.f10360A = null;
        this.f10362C = null;
        this.f10363D = null;
        this.f10385z = new C2289l();
        this.f10383x = new C2373x(this.f10385z);
        this.f10384y = new C2356a();
        this.f10362C = new C2358c(this, (C2359o) null);
        this.f10361B = new C2290m();
        this.f10363D = new C2373x(this.f10361B);
        this.f10360A = new C2357b();
        if (this.f10360A != null) {
            C2188Q.m9853a().mo7682b(this.f10360A);
            C2188Q.m9853a().mo7679a((C2188Q.C2189a) this.f10360A);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.n$b */
    /* compiled from: CloudInputProcessor */
    class C2357b implements C2188Q.C2189a {
        C2357b() {
        }

        /* renamed from: a */
        public void mo7690a() {
            if (!C2188Q.m9853a().mo7686f() || !C2188Q.m9853a().mo7685e()) {
                C2355n.this.mo7985b();
            } else {
                C2355n.this.mo7986c();
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.net.n$a */
    /* compiled from: CloudInputProcessor */
    class C2356a implements C2373x.C2376b {
        C2356a() {
        }

        /* renamed from: a */
        public void mo4601a(C2259P p) {
            if (Engine.isInitialized()) {
                if (((C2289l) p).mo7892n()) {
                    C2355n.this.m10748a((C2289l) p);
                }
                Engine.getInstance().getClokeManager().onClokeSearchEnd();
                if (p.f9746O == 200) {
                    C2289l lVar = (C2289l) p;
                    if (lVar.mo7892n()) {
                        C2355n.this.m10746a(lVar.f10017e, lVar.mo7893o());
                    } else {
                        C2355n.this.m10747a(lVar.f10016d);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo4602b(C2259P p) {
            if (p != null && ((C2289l) p).mo7892n()) {
                C2355n.this.m10748a((C2289l) p);
            }
            Engine.getInstance().getClokeManager().onClokeSearchEnd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.cootek.smartinput5.engine.cloke.CloudResult[][]} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m10746a(com.cootek.smartinput5.engine.cloke.ArcticSearchResult.SearchResult r18, int r19) {
        /*
            r17 = this;
            com.cootek.smartinput5.engine.Engine r1 = com.cootek.smartinput5.engine.Engine.getInstance()
            int r1 = r1.getCloudInputType()
            if (r18 == 0) goto L_0x000d
            r2 = 2
            if (r1 == r2) goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            java.util.List r13 = r18.getResultListList()
            if (r13 == 0) goto L_0x000d
            int r1 = r13.size()
            if (r1 == 0) goto L_0x000d
            int r1 = r13.size()
            com.cootek.smartinput5.engine.cloke.CloudResultList[] r14 = new com.cootek.smartinput5.engine.cloke.CloudResultList[r1]
            r1 = 0
            r10 = r1
        L_0x0022:
            int r1 = r13.size()
            if (r10 >= r1) goto L_0x00c5
            java.lang.Object r1 = r13.get(r10)
            r7 = r1
            com.cootek.smartinput5.engine.cloke.ArcticSearchResult$SearchResult$ResultList r7 = (com.cootek.smartinput5.engine.cloke.ArcticSearchResult.SearchResult.ResultList) r7
            java.util.List r15 = r7.getResultList()
            r1 = 0
            com.cootek.smartinput5.engine.cloke.CloudResult[][] r1 = (com.cootek.smartinput5.engine.cloke.CloudResult[][]) r1
            if (r15 == 0) goto L_0x00b5
            int r2 = r15.size()
            if (r2 <= 0) goto L_0x00b5
            if (r19 <= 0) goto L_0x00b5
            int r1 = r15.size()
            r0 = r19
            int[] r1 = new int[]{r1, r0}
            java.lang.Class<com.cootek.smartinput5.engine.cloke.CloudResult> r2 = com.cootek.smartinput5.engine.cloke.CloudResult.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            r8 = r1
            com.cootek.smartinput5.engine.cloke.CloudResult[][] r8 = (com.cootek.smartinput5.engine.cloke.CloudResult[][]) r8
            r1 = 0
            r11 = r1
        L_0x0055:
            int r1 = r15.size()
            if (r11 >= r1) goto L_0x00b4
            java.lang.Object r1 = r15.get(r11)
            r9 = r1
            com.cootek.smartinput5.engine.cloke.ArcticSearchResult$SearchResult$ResultList$Result r9 = (com.cootek.smartinput5.engine.cloke.ArcticSearchResult.SearchResult.ResultList.Result) r9
            r12 = r8[r11]
            r16 = 0
            com.cootek.smartinput5.engine.cloke.CloudResult r1 = new com.cootek.smartinput5.engine.cloke.CloudResult
            java.lang.String r2 = r9.getCandidate()
            java.lang.String r3 = r9.getEvidence()
            java.lang.String r4 = ""
            int r5 = r9.getTag()
            int r6 = r9.getPriority()
            r1.<init>(r2, r3, r4, r5, r6)
            r12[r16] = r1
            com.cootek.smartinput5.engine.cloke.ArcticSearchResult$SearchResult$ResultList$Result r2 = r9.getDeepResult()
            r1 = 1
            r9 = r1
            r12 = r2
        L_0x0086:
            r0 = r19
            if (r9 >= r0) goto L_0x00b0
            if (r12 == 0) goto L_0x00b0
            r16 = r8[r11]
            com.cootek.smartinput5.engine.cloke.CloudResult r1 = new com.cootek.smartinput5.engine.cloke.CloudResult
            java.lang.String r2 = r12.getCandidate()
            java.lang.String r3 = r12.getEvidence()
            java.lang.String r4 = ""
            int r5 = r12.getTag()
            int r6 = r12.getPriority()
            r1.<init>(r2, r3, r4, r5, r6)
            r16[r9] = r1
            com.cootek.smartinput5.engine.cloke.ArcticSearchResult$SearchResult$ResultList$Result r2 = r12.getDeepResult()
            int r1 = r9 + 1
            r9 = r1
            r12 = r2
            goto L_0x0086
        L_0x00b0:
            int r1 = r11 + 1
            r11 = r1
            goto L_0x0055
        L_0x00b4:
            r1 = r8
        L_0x00b5:
            com.cootek.smartinput5.engine.cloke.CloudResultList r2 = new com.cootek.smartinput5.engine.cloke.CloudResultList
            java.lang.String r3 = r7.getHistory()
            r2.<init>(r3, r1)
            r14[r10] = r2
            int r1 = r10 + 1
            r10 = r1
            goto L_0x0022
        L_0x00c5:
            java.lang.String r1 = r18.getCommonHistory()
            com.cootek.smartinput5.engine.Engine r2 = com.cootek.smartinput5.engine.Engine.getInstance()
            java.lang.String r3 = ""
            r2.fireCloudResultOperation(r3, r1, r14)
            com.cootek.smartinput5.engine.Engine r1 = com.cootek.smartinput5.engine.Engine.getInstance()
            r1.processEvent()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.C2355n.m10746a(com.cootek.smartinput5.engine.cloke.ArcticSearchResult$SearchResult, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10747a(SearchResultProtos.SearchResult searchResult) {
        int resultCount;
        int cloudInputType = Engine.getInstance().getCloudInputType();
        if (searchResult != null && cloudInputType == 1 && (resultCount = searchResult.getResultCount()) != 0) {
            CloudResult[][] cloudResultArr = (CloudResult[][]) Array.newInstance(CloudResult.class, new int[]{resultCount, 1});
            for (int i = 0; i < resultCount; i++) {
                SearchResultProtos.SearchResult.Result result = searchResult.getResult(i);
                cloudResultArr[i][0] = new CloudResult(result.getCandidate(), result.getEvidence(), result.getTag(), 0, 0);
            }
            searchResult.getReference();
            Engine.getInstance().fireCloudResultOperation(Uri.encode(searchResult.getReference()), "", new CloudResultList[]{new CloudResultList("", cloudResultArr)});
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: a */
    public void mo7984a() {
        this.f10365d.removeMessages(3);
        this.f10365d.removeMessages(1);
        this.f10365d.removeMessages(2);
        this.f10365d.removeMessages(4);
        this.f10383x.mo8061b();
        m10756b(0);
    }

    /* renamed from: b */
    public void mo7985b() {
        m10774t();
    }

    /* renamed from: c */
    public void mo7986c() {
        mo7985b();
        m10771q();
    }

    /* renamed from: d */
    public void mo7987d() {
        int cloudInputType = Engine.getInstance().getCloudInputType();
        if (cloudInputType != 0) {
            if (cloudInputType == 2) {
                if (HighFreqSettings.getInstance().arcticCloudInputEnable && C1617br.m7367a().mo6335b()) {
                    if (!HighFreqSettings.getInstance().cloudServiceWifiOnly || C2188Q.m9853a().mo7685e()) {
                        m10745a(1, 100, cloudInputType);
                    }
                }
            } else if (cloudInputType == 1) {
                boolean z = false;
                if ((Engine.getInstance().getClokeManager().getCloudSearchStrategy() & 1) != 0) {
                    int intSetting = Settings.getInstance().getIntSetting(Settings.CLOKE_ENABLE_MODE);
                    if (intSetting == 0 && C2188Q.m9853a().mo7685e()) {
                        z = true;
                    } else if (intSetting == 1 && C2188Q.m9853a().mo7686f()) {
                        z = true;
                    }
                }
                if (z) {
                    m10756b(1);
                    if (m10764j()) {
                        m10745a(1, (int) Settings.SUPER_DICT_DOWNLOADED, cloudInputType);
                    } else if (m10765k()) {
                        m10745a(3, (int) Settings.SUPER_DICT_DOWNLOADED, cloudInputType);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo7988e() {
        this.f10365d.removeMessages(4);
        this.f10365d.sendMessageDelayed(this.f10365d.obtainMessage(4), 200);
    }

    /* renamed from: j */
    private boolean m10764j() {
        return m10766l() || (this.f10373l && this.f10374m);
    }

    /* renamed from: k */
    private boolean m10765k() {
        return this.f10373l && C2188Q.m9853a().mo7686f();
    }

    /* renamed from: a */
    private void m10745a(int i, int i2, int i3) {
        this.f10365d.removeMessages(i);
        Message obtainMessage = this.f10365d.obtainMessage(i);
        obtainMessage.arg1 = i3;
        this.f10365d.sendMessageDelayed(obtainMessage, (long) i2);
    }

    /* renamed from: f */
    public void mo7989f() {
        this.f10374m = true;
        m10745a(1, 0, 1);
    }

    /* renamed from: l */
    private boolean m10766l() {
        this.f10367f = HighFreqSettings.getInstance().clokeEnableMode;
        this.f10373l = false;
        switch (this.f10367f) {
            case 0:
                if (C2188Q.m9853a().mo7685e()) {
                    return true;
                }
                if (!C1368X.m6324d()) {
                    return false;
                }
                this.f10373l = C1132b.m5654a(C1368X.m6313b()).mo4392a(C1135d.MANUAL_CLOUD_SEARCH, (Boolean) true).booleanValue();
                return false;
            case 1:
                return true;
            case 2:
                this.f10373l = true;
                return false;
            default:
                return false;
        }
    }

    /* renamed from: m */
    private boolean m10767m() {
        this.f10367f = HighFreqSettings.getInstance().clokeEnableMode;
        switch (this.f10367f) {
            case 0:
                if (!C2188Q.m9853a().mo7686f() || !C2188Q.m9853a().mo7685e()) {
                    return false;
                }
                return true;
            case 1:
                if (C2188Q.m9853a().mo7686f()) {
                    return true;
                }
                break;
            case 2:
                return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10754a(int i) {
        C2289l lVar;
        C2373x xVar;
        if (i == 0) {
            return false;
        }
        boolean z = i == 2;
        CloudParameters cloudParameters = Engine.getInstance().getCloudParameters((String) null, new CloudParameters());
        if (cloudParameters == null) {
            return false;
        }
        String encode = Uri.encode(cloudParameters.key_string);
        if (z) {
            C2373x u = m10775u();
            C2373x xVar2 = u;
            lVar = (C2289l) u.f10444a;
            xVar = xVar2;
        } else {
            lVar = this.f10385z;
            xVar = null;
        }
        lVar.mo7891m();
        lVar.mo7879a(encode);
        lVar.mo7882b(cloudParameters.history);
        lVar.mo7884c(cloudParameters.stroke_filter);
        lVar.mo7887e(cloudParameters.filter);
        lVar.mo7886d(cloudParameters.shuangpin_config);
        lVar.mo7867a(cloudParameters.options);
        lVar.mo7889g(Settings.getInstance().getStringSetting(88));
        lVar.mo7880a(z);
        if (z) {
            lVar.mo7881b(3);
            lVar.mo7883c(3);
            lVar.mo7885d(2);
            m10753a(xVar);
        } else {
            this.f10383x.mo8060a(this.f10384y);
        }
        return true;
    }

    /* renamed from: b */
    private void m10756b(int i) {
        Engine.getInstance().getWidgetManager().mo9597B().mo8874a(i);
    }

    /* renamed from: g */
    public void mo7990g() {
        CloudFeedback cloudFeedback = Engine.getInstance().getCloudFeedback(new CloudFeedback());
        if (!TextUtils.isEmpty(cloudFeedback.reference) && !TextUtils.isEmpty(cloudFeedback.selected)) {
            this.f10375n.offer(cloudFeedback);
            if (m10767m()) {
                m10771q();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m10768n() {
        this.f10365d.sendMessageDelayed(this.f10365d.obtainMessage(2), (long) m10769o());
    }

    /* renamed from: o */
    private int m10769o() {
        if ((Engine.getInstance().getClokeManager().getCloudSearchStrategy() & 2) != 0) {
            return 1500;
        }
        return C0781a.f1973a;
    }

    /* renamed from: h */
    public void mo7991h() {
        Handler handler = this.f10365d;
        getClass();
        handler.removeMessages(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m10770p() {
        Handler handler = this.f10365d;
        getClass();
        handler.removeMessages(2);
    }

    /* renamed from: com.cootek.smartinput5.net.n$c */
    /* compiled from: CloudInputProcessor */
    private class C2358c implements C2373x.C2376b {
        private C2358c() {
        }

        /* synthetic */ C2358c(C2355n nVar, C2359o oVar) {
            this();
        }

        /* renamed from: a */
        public void mo4601a(C2259P p) {
            if (C2355n.this.m10761c(p.f9746O)) {
                C2355n.this.f10376o.offer(C2355n.this.f10364E);
            }
            C2355n.this.m10773s();
        }

        /* renamed from: b */
        public void mo4602b(C2259P p) {
        }
    }

    /* renamed from: q */
    private void m10771q() {
        m10772r();
        m10773s();
    }

    /* renamed from: r */
    private void m10772r() {
        while (!this.f10376o.isEmpty()) {
            this.f10375n.offer(this.f10376o.poll());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m10773s() {
        this.f10364E = this.f10375n.poll();
        if (this.f10364E != null) {
            this.f10361B.mo7896j();
            this.f10361B.mo7894a(this.f10364E.reference);
            this.f10361B.mo7895b(this.f10364E.selected);
            this.f10363D.mo8060a((C2373x.C2376b) this.f10362C);
        }
    }

    /* renamed from: t */
    private void m10774t() {
        this.f10363D.mo8061b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m10761c(int i) {
        switch (i) {
            case 502:
            case 503:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: i */
    public void mo7992i() {
        this.f10374m = false;
    }

    /* renamed from: u */
    private C2373x m10775u() {
        if (this.f10378s.size() > 0) {
            return this.f10378s.poll();
        }
        return new C2373x(new C2289l());
    }

    /* renamed from: a */
    private void m10753a(C2373x xVar) {
        if (xVar != null) {
            if (this.f10377r.size() >= 5) {
                C2373x poll = this.f10377r.poll();
                poll.mo8061b();
                m10758b(poll);
            }
            xVar.mo8060a(this.f10384y);
            this.f10377r.offer(xVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10748a(C2289l lVar) {
        if (this.f10377r != null && lVar != null && lVar.mo7892n()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = new ArrayList(this.f10377r).iterator();
            while (it.hasNext()) {
                C2373x xVar = (C2373x) it.next();
                if (xVar.f10444a == lVar) {
                    arrayList.add(xVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2373x xVar2 = (C2373x) it2.next();
                m10758b(xVar2);
                this.f10377r.remove(xVar2);
            }
        }
    }

    /* renamed from: b */
    private void m10758b(C2373x xVar) {
        if (this.f10378s != null && xVar != null && this.f10378s.size() < 5) {
            this.f10378s.offer(xVar);
        }
    }
}
