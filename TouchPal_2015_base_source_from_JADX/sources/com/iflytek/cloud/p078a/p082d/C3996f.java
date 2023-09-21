package com.iflytek.cloud.p078a.p082d;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: com.iflytek.cloud.a.d.f */
public class C3996f {

    /* renamed from: a */
    public static int f16346a = 9;

    /* renamed from: b */
    public static int f16347b = 14;

    /* renamed from: a */
    public static boolean m17046a(Context context, Boolean bool, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (!bool.booleanValue() || Build.VERSION.SDK_INT < f16346a) {
            return false;
        }
        C3997g.m17048a(context, onAudioFocusChangeListener);
        return false;
    }

    /* renamed from: b */
    public static boolean m17047b(Context context, Boolean bool, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (!bool.booleanValue() || Build.VERSION.SDK_INT < f16346a) {
            return false;
        }
        return C3997g.m17049b(context, onAudioFocusChangeListener);
    }
}
