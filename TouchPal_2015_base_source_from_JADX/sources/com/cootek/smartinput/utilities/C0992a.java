package com.cootek.smartinput.utilities;

import android.view.inputmethod.InputConnection;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput.utilities.a */
/* compiled from: ApiWrapper */
public class C0992a {

    /* renamed from: a */
    private static final long f2604a = 250;

    /* renamed from: b */
    private static boolean f2605b = true;

    /* renamed from: a */
    public static void m5153a() {
        Settings.getInstance().setBoolSetting(Settings.API_INPUT_CONNECTION_DISABLED, false);
        f2605b = true;
    }

    /* renamed from: a */
    public static CharSequence m5152a(InputConnection inputConnection, int i, int i2, boolean z) {
        return inputConnection.getTextBeforeCursor(i, i2);
    }

    /* renamed from: b */
    public static CharSequence m5154b(InputConnection inputConnection, int i, int i2, boolean z) {
        return inputConnection.getTextAfterCursor(i, i2);
    }

    /* renamed from: a */
    public static int m5151a(InputConnection inputConnection, int i, boolean z) {
        return inputConnection.getCursorCapsMode(i);
    }
}
