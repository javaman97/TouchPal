package com.cootek.smartinput5.net;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2377y;
import java.util.UUID;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.net.A */
/* compiled from: IdentifyInfo */
final class C2167A extends C2377y.C2379a {
    C2167A(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7614a(Context context) {
        return UUID.randomUUID().toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7613a() {
        return Settings.UUID;
    }
}
