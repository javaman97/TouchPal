package com.cootek.smartinput5.func.resource.p055ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.cootek.smartinput.utilities.C0993b;
import com.cootek.smartinput5.func.resource.C1974m;

/* renamed from: com.cootek.smartinput5.func.resource.ui.b */
/* compiled from: TouchPalCustomizeActivity */
public class C1976b extends Activity {
    /* access modifiers changed from: protected */
    public String getResString(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* access modifiers changed from: protected */
    public String getResString(int i, Object... objArr) {
        return C1974m.m9064a((Context) this, i, objArr);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Thread.setDefaultUncaughtExceptionHandler(new C0993b(this));
        } catch (IllegalAccessException | SecurityException e) {
        }
    }
}
