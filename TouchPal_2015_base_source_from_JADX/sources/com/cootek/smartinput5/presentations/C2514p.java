package com.cootek.smartinput5.presentations;

import android.view.inputmethod.EditorInfo;
import com.cootek.presentation.sdk.INativeAppInfo;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import java.io.File;

/* renamed from: com.cootek.smartinput5.presentations.p */
/* compiled from: NativeAppInfoHandler */
public class C2514p implements INativeAppInfo {

    /* renamed from: a */
    public static final String f10826a = "NativeAppInfoHandler";

    /* renamed from: b */
    private EditorInfo f10827b;

    public int getIntSetting(String str) {
        Object valueByKey = Settings.getInstance().getValueByKey(str);
        if (valueByKey != null) {
            return ((Integer) valueByKey).intValue();
        }
        return 0;
    }

    public String getStringSetting(String str) {
        Object valueByKey = Settings.getInstance().getValueByKey(str);
        if (valueByKey != null) {
            return (String) valueByKey;
        }
        return null;
    }

    public long getLongSetting(String str) {
        Object valueByKey = Settings.getInstance().getValueByKey(str);
        if (valueByKey != null) {
            return ((Long) valueByKey).longValue();
        }
        return 0;
    }

    public boolean getBoolSetting(String str) {
        Object valueByKey = Settings.getInstance().getValueByKey(str);
        if (valueByKey != null) {
            return ((Boolean) valueByKey).booleanValue();
        }
        return false;
    }

    public long getFirstInstallTimestamp() {
        return Settings.getInstance().getLongSetting(Settings.FIRST_INSTALL_TIME);
    }

    public int getInitialQuietDays() {
        if (C1368X.m6324d()) {
            return C1132b.m5654a(C1368X.m6313b()).mo4397a(C1135d.FIRST_PRESENTATION_UPDATE_INTERVAL_DAYS, (Integer) 0).intValue();
        }
        return 0;
    }

    public EditorInfo getCurrentEditorInfo() {
        return this.f10827b;
    }

    /* renamed from: a */
    public void mo8309a(EditorInfo editorInfo) {
        if (editorInfo != null) {
            this.f10827b = editorInfo;
        }
    }

    public String getLocalConfigFilePath() {
        File a = C1466av.m6849a(C1368X.m6313b(), C1466av.f4708q);
        if (a == null || !a.exists()) {
            return null;
        }
        return a.getAbsolutePath();
    }

    public boolean canExtend(String str, String str2) {
        return C2503g.m11234a(str, str2, C2506h.EXTENSION);
    }

    public boolean canPointHolderShow(String str, String str2, String str3) {
        return C2503g.m11235a(str, str2, str3, C2506h.GUIDE_POINT_HODLER);
    }

    public boolean canPointSelfShow(String str, String str2) {
        return C2503g.m11234a(str, str2, C2506h.GUIDE_POINT_SELF);
    }

    public int getInitialMobileQuietDays() {
        return 0;
    }

    public long getUpdateCheckInterval() {
        return 3600000;
    }
}
