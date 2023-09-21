package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3802s;
import java.util.Collections;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    public static final String EXTRA_ACTIVITY_RESULT = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";

    /* renamed from: ab */
    private final int f15913ab;

    /* renamed from: fp */
    List<DetectedActivity> f15914fp;

    /* renamed from: fq */
    long f15915fq;

    /* renamed from: fr */
    long f15916fr;

    public ActivityRecognitionResult(int i, List<DetectedActivity> list, long j, long j2) {
        this.f15913ab = 1;
        this.f15914fp = list;
        this.f15915fq = j;
        this.f15916fr = j2;
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this((List<DetectedActivity>) Collections.singletonList(detectedActivity), j, j2);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        C3802s.m16676b(list != null && list.size() > 0, (Object) "Must have at least 1 detected activity");
        this.f15913ab = 1;
        this.f15914fp = list;
        this.f15915fq = j;
        this.f15916fr = j2;
    }

    public static ActivityRecognitionResult extractResult(Intent intent) {
        if (!hasResult(intent)) {
            return null;
        }
        return (ActivityRecognitionResult) intent.getExtras().get(EXTRA_ACTIVITY_RESULT);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra(EXTRA_ACTIVITY_RESULT);
    }

    public int describeContents() {
        return 0;
    }

    public int getActivityConfidence(int i) {
        for (DetectedActivity next : this.f15914fp) {
            if (next.getType() == i) {
                return next.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.f15916fr;
    }

    public DetectedActivity getMostProbableActivity() {
        return this.f15914fp.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.f15914fp;
    }

    public long getTime() {
        return this.f15915fq;
    }

    /* renamed from: i */
    public int mo12455i() {
        return this.f15913ab;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.f15914fp + ", timeMillis=" + this.f15915fq + ", elapsedRealtimeMillis=" + this.f15916fr + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        ActivityRecognitionResultCreator.m16705a(this, parcel, i);
    }
}
