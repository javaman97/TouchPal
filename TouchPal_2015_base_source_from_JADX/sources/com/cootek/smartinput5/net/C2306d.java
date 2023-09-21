package com.cootek.smartinput5.net;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2209a;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.net.d */
/* compiled from: Activator */
final class C2306d extends C2209a.C2210a {
    C2306d(String str, int i) {
        super(str, i, (C2236b) null);
    }

    /* renamed from: a */
    public boolean mo7763a(Context context) {
        if (!TextUtils.isEmpty(C2188Q.m9853a().mo7683c()) && Settings.getInstance().getIntSetting(200) != 0) {
            return false;
        }
        return true;
    }
}
