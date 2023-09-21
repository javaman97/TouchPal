package com.cootek.smartinput5.p048d;

import android.content.Context;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.net.cmd.C2268c;
import com.cootek.usage.AbsUsageAssist;

/* renamed from: com.cootek.smartinput5.d.c */
/* compiled from: UsageAssist */
public class C1245c extends AbsUsageAssist {
    /* access modifiers changed from: protected */
    public Context getContext() {
        return C1368X.m6313b();
    }

    /* access modifiers changed from: protected */
    public String getToken() {
        return C2188Q.m9853a().mo7683c();
    }

    /* access modifiers changed from: protected */
    public boolean isDebugMode() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onTokenInvalid() {
        C2209a.m9956a().mo7727a(getContext(), C2209a.C2210a.DIRECTLY, true, C2268c.C2269a.UA);
    }

    /* access modifiers changed from: protected */
    public String getServerAddress() {
        int o = C2225al.m10081o(getContext());
        String[] split = C2225al.m10062b(getContext(), o).split(":");
        return split[0] + C2258O.STATISTIC_USAGE.mo7826b(o);
    }

    /* access modifiers changed from: protected */
    public int getHttpPort() {
        String[] split = C2225al.m10062b(getContext(), C2225al.m10081o(getContext())).split(":");
        if (split.length > 1) {
            return Integer.parseInt(split[split.length - 1]);
        }
        return 80;
    }

    /* access modifiers changed from: protected */
    public void onStrategyUpdate(boolean z) {
    }

    /* access modifiers changed from: protected */
    public int getVersionCode() {
        return C1368X.m6319c(getContext());
    }

    /* access modifiers changed from: protected */
    public int getInfoInterval(int i) {
        if (i == 3) {
            return 7;
        }
        return super.getInfoInterval(i);
    }
}
