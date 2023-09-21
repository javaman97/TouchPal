package com.yahoo.mobile.client.share.search.interfaces;

import android.app.Activity;
import android.content.Context;
import java.util.Map;

public interface IInstrument {
    void activityOnPause(Context context);

    void activityOnResume(Context context);

    void activityOnStart(Activity activity);

    void activityOnStop(Activity activity);

    String getApplicationSpaceId();

    void logDurationEvent(String str, long j, Map<String, String> map);

    void logEvent(String str, long j, boolean z, Map<String, Object> map);
}
