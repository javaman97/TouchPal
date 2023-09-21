package com.cootek.p042a.p043a;

import com.cootek.p042a.p043a.C0905h;
import com.cootek.smartinput5.engine.Settings;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;

/* renamed from: com.cootek.a.a.f */
/* compiled from: PerfDataConfig */
public class C0902f {

    /* renamed from: a */
    public static final boolean f2419a = true;

    /* renamed from: b */
    public static final boolean f2420b = false;

    /* renamed from: c */
    static final String f2421c = "\n";

    /* renamed from: d */
    static final int f2422d = 10;

    /* renamed from: e */
    static final int f2423e = 3;

    /* renamed from: f */
    static final int f2424f = 0;

    /* renamed from: g */
    static final int[] f2425g = {1, 10, 50, 100, 200, SearchStatusData.RESPONSE_STATUS_SERVER_ERROR, 1000, 2000, 9999};

    /* renamed from: a */
    static void m4914a() {
        C0904g.m4916a().mo3406a(C0903a.CLICK);
        C0904g.m4916a().mo3406a(C0903a.INIT);
        C0904g.m4916a().mo3406a(C0903a.SHOW_KEYBOARD);
        C0904g.m4916a().mo3406a(C0903a.HIDE_KEYBOARD);
    }

    /* renamed from: com.cootek.a.a.f$a */
    /* compiled from: PerfDataConfig */
    public enum C0903a {
        INIT(1500, 5, new C0898b[]{C0898b.PROCESS_EVENT, C0898b.KBD_DRAW, C0898b.KBD_BUF_DRAW, C0898b.CANDBAR_DRAW, C0898b.CANDBAR_BUF_DRAW, C0898b.UPDATE_RESULT, C0898b.INIT_FUNCTION_MANAGER, C0898b.ON_CREATE, C0898b.ON_CREATE_INPUT_VIEW, C0898b.ON_START_INPUT, C0898b.ON_START_INPUT_VIEW, C0898b.ON_WINDOW_SHOWN}),
        CLICK(200, 3, new C0898b[]{C0898b.PROCESS_EVENT, C0898b.KBD_DRAW, C0898b.KBD_BUF_DRAW, C0898b.CANDBAR_DRAW, C0898b.CANDBAR_BUF_DRAW, C0898b.UPDATE_RESULT}, 3, C0898b.m4901b()),
        SHOW_KEYBOARD(400, 3, new C0898b[]{C0898b.PROCESS_EVENT, C0898b.KBD_DRAW, C0898b.KBD_BUF_DRAW, C0898b.CANDBAR_DRAW, C0898b.CANDBAR_BUF_DRAW, C0898b.UPDATE_RESULT, C0898b.ON_START_INPUT_VIEW, C0898b.ON_WINDOW_SHOWN}),
        HIDE_KEYBOARD(Settings.SUPER_DICT_DOWNLOADED, 3, new C0898b[]{C0898b.PROCESS_EVENT, C0898b.KBD_DRAW, C0898b.KBD_BUF_DRAW, C0898b.CANDBAR_DRAW, C0898b.CANDBAR_BUF_DRAW, C0898b.UPDATE_RESULT, C0898b.ON_FINISH_INPUT, C0898b.ON_FINISH_INPUT_VIEW, C0898b.ON_WINDOW_HIDDEN});
        

        /* renamed from: e */
        private C0905h.C0907b f2431e;

        private C0903a(int i, int i2, C0898b[] bVarArr) {
            this(r9, r10, i, i2, bVarArr, 0, (C0898b[]) null);
        }

        private C0903a(int i, int i2, C0898b[] bVarArr, int i3, C0898b[] bVarArr2) {
            C0905h.C0907b bVar = new C0905h.C0907b();
            bVar.f2448a = name();
            bVar.f2449b = i;
            bVar.f2450c = i2;
            bVar.f2451d = i3;
            bVar.f2453f = bVarArr;
            bVar.f2454g = bVarArr2;
            bVar.f2452e = C0902f.f2425g;
            this.f2431e = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0905h.C0907b mo3403a() {
            return this.f2431e;
        }
    }
}
