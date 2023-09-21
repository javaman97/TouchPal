package com.cootek.smartinput5;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.accessibility.AccessibilityEvent;
import com.cootek.smartinput5.func.C1372a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TouchPalAccessibilityService extends AccessibilityService {
    private static final int MESSAGE_SHUTDOWN_TTS = 4;
    private static final int MESSAGE_SPEAK = 1;
    private static final int MESSAGE_START_TTS = 3;
    private static final int MESSAGE_STOP_SPEAK = 2;
    private static final String[] PACKAGE_NAMES = {C1372a.f4299a};
    private static final String TAG = "TouchPalAccessibilityService";
    public static final int TOUCHPAL_ACCESSIBILITY_SERVICE_FLAG = 2;
    private static boolean enabled;
    private final int INTERESTED_EVENT_TYPE = 4;
    Context mContext;
    private Handler mHandler;
    /* access modifiers changed from: private */
    public TextToSpeech mTts;
    /* access modifiers changed from: private */
    public Queue<CharSequence> speakContents;

    public static boolean isEnabled() {
        return enabled;
    }

    public void onCreate() {
        super.onCreate();
        this.mHandler = new C1039R(this);
        this.speakContents = new ConcurrentLinkedQueue();
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        for (CharSequence offer : accessibilityEvent.getText()) {
            this.speakContents.offer(offer);
        }
        if (accessibilityEvent.getEventType() == 4) {
            this.mHandler.obtainMessage(1).sendToTarget();
        }
    }

    public void onInterrupt() {
        this.mHandler.obtainMessage(2).sendToTarget();
    }

    public void onServiceConnected() {
        enabled = true;
        this.mContext = this;
        this.mHandler.sendEmptyMessage(3);
        AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
        accessibilityServiceInfo.eventTypes = 4;
        accessibilityServiceInfo.packageNames = PACKAGE_NAMES;
        accessibilityServiceInfo.feedbackType = 1;
        accessibilityServiceInfo.notificationTimeout = 80;
        accessibilityServiceInfo.flags = 2;
        setServiceInfo(accessibilityServiceInfo);
    }

    public boolean onUnbind(Intent intent) {
        enabled = false;
        if (this.speakContents != null) {
            this.speakContents.clear();
        }
        this.mHandler.sendEmptyMessage(4);
        return false;
    }
}
