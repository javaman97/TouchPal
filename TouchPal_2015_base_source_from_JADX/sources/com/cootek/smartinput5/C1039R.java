package com.cootek.smartinput5;

import android.os.Handler;
import android.os.Message;
import android.speech.tts.TextToSpeech;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.R */
/* compiled from: TouchPalAccessibilityService */
class C1039R extends Handler {

    /* renamed from: a */
    final /* synthetic */ TouchPalAccessibilityService f2856a;

    C1039R(TouchPalAccessibilityService touchPalAccessibilityService) {
        this.f2856a = touchPalAccessibilityService;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f2856a.speakContents != null && this.f2856a.speakContents.size() != 0) {
                    String str = "";
                    while (true) {
                        str = str + " " + ((CharSequence) this.f2856a.speakContents.poll()).toString();
                        if (this.f2856a.speakContents.isEmpty()) {
                            this.f2856a.mTts.speak(str, 1, (HashMap) null);
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 2:
                this.f2856a.mTts.stop();
                return;
            case 3:
                TextToSpeech unused = this.f2856a.mTts = new TextToSpeech(this.f2856a.mContext, new C1040S(this));
                return;
            case 4:
                this.f2856a.mTts.shutdown();
                return;
            default:
                return;
        }
    }
}
