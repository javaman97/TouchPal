package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.p066ui.settings.C2991aG;
import com.cootek.smartinput5.p066ui.settings.C3146cm;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.settings.el */
/* compiled from: VoiceChoiceAdapter */
public class C3227el extends C3146cm implements C2991aG {

    /* renamed from: c */
    private final String f14292c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C1389aD.C1391b> f14293d;

    public C3227el(Context context, C2991aG.C2992a aVar) {
        super(context, 0);
        super.mo10304a((C3146cm.C3147a) new C3228em(this, aVar));
    }

    /* renamed from: c */
    private String m14465c() {
        return C1368X.m6320c().mo5842o().mo5914D();
    }

    /* renamed from: a */
    public String mo10067a() {
        return m14465c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c A[LOOP:1: B:14:0x0076->B:16:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098 A[LOOP:2: B:18:0x0090->B:20:0x0098, LOOP_END] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] mo10072d() {
        /*
            r8 = this;
            r1 = 0
            android.content.Context r0 = r8.f14185a
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131625737(0x7f0e0709, float:1.887869E38)
            java.lang.String r0 = r0.getString(r2)
            com.cootek.smartinput5.func.X r2 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.aD r2 = r2.mo5842o()
            java.util.ArrayList r3 = r2.mo5911A()
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r2 = r8.f14293d
            if (r2 == 0) goto L_0x0023
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r2 = r8.f14293d
            r2.clear()
        L_0x0023:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8.f14293d = r2
            com.cootek.smartinput5.func.aD$b r4 = new com.cootek.smartinput5.func.aD$b
            java.lang.String r2 = ""
            r5 = 0
            r4.<init>(r2, r0, r5)
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r2 = 293(0x125, float:4.1E-43)
            java.lang.String r5 = r0.getStringSetting(r2)
            r2 = 1
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00a8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.Iterator r6 = r0.iterator()
        L_0x004c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r6.next()
            com.cootek.smartinput5.func.aD$b r0 = (com.cootek.smartinput5.func.C1389aD.C1391b) r0
            java.lang.String r7 = r0.f4400a
            boolean r7 = android.text.TextUtils.equals(r5, r7)
            if (r7 == 0) goto L_0x004c
            r3.remove(r0)
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r2 = r8.f14293d
            r2.add(r0)
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r0 = r8.f14293d
            r0.add(r4)
            r0 = r1
        L_0x006e:
            if (r0 == 0) goto L_0x0075
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r0 = r8.f14293d
            r0.add(r4)
        L_0x0075:
            r0 = r1
        L_0x0076:
            int r2 = r3.size()
            if (r0 >= r2) goto L_0x0088
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r2 = r8.f14293d
            java.lang.Object r4 = r3.get(r0)
            r2.add(r4)
            int r0 = r0 + 1
            goto L_0x0076
        L_0x0088:
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r0 = r8.f14293d
            int r0 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r0]
        L_0x0090:
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r0 = r8.f14293d
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00a7
            java.util.ArrayList<com.cootek.smartinput5.func.aD$b> r0 = r8.f14293d
            java.lang.Object r0 = r0.get(r1)
            com.cootek.smartinput5.func.aD$b r0 = (com.cootek.smartinput5.func.C1389aD.C1391b) r0
            java.lang.String r0 = r0.f4401b
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0090
        L_0x00a7:
            return r2
        L_0x00a8:
            r0 = r2
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.settings.C3227el.mo10072d():java.lang.String[]");
    }

    /* renamed from: e */
    public String mo10069b() {
        return m14465c();
    }

    /* renamed from: a */
    public View mo10066a(int i, View view, LinearLayout linearLayout) {
        return super.getView(i, view, linearLayout);
    }
}
