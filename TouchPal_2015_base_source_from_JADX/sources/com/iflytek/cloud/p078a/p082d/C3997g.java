package com.iflytek.cloud.p078a.p082d;

import android.content.Context;
import android.media.AudioManager;
import com.baidu.pcs.BaiduPCSClient;

/* renamed from: com.iflytek.cloud.a.d.g */
public class C3997g {

    /* renamed from: a */
    private static int f16348a = 0;

    /* renamed from: a */
    public static boolean m17048a(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        try {
            ((AudioManager) context.getSystemService(BaiduPCSClient.Type_Stream_Audio)).requestAudioFocus(onAudioFocusChangeListener, 3, 2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m17049b(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        try {
            ((AudioManager) context.getSystemService(BaiduPCSClient.Type_Stream_Audio)).abandonAudioFocus(onAudioFocusChangeListener);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
