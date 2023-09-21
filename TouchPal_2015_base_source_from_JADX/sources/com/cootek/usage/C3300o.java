package com.cootek.usage;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;

/* renamed from: com.cootek.usage.o */
final class C3300o {

    /* renamed from: a */
    String f14523a;

    /* renamed from: b */
    long f14524b;

    /* renamed from: c */
    long f14525c;

    /* renamed from: d */
    boolean f14526d;

    C3300o() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("strategy name: ").append(this.f14523a).append(", wifi interval: ").append(this.f14524b / Utils.MINUTE_MILLIS).append(", mobile interval: ").append(this.f14525c / Utils.MINUTE_MILLIS).append(", encrypt: ").append(this.f14526d);
        return sb.toString();
    }
}
