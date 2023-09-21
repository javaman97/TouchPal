package com.cootek.smartinput5.func.component;

import android.database.ContentObserver;
import android.os.Handler;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.func.component.W */
/* compiled from: SysUserDicObserver */
public class C1662W extends ContentObserver {
    public C1662W(Handler handler) {
        super(handler);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        Settings.getInstance().setBoolSetting(Settings.SYS_USER_DIC_IMPORTED, false);
        C1368X.m6320c().mo5818D().mo6483a();
    }
}
