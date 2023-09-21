package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.cootek.smartinput5.p048d.C1246d;
import com.google.android.gms.internal.C3799r;

public final class ConnectionResult {

    /* renamed from: B */
    public static final ConnectionResult f15235B = new ConnectionResult(0, (PendingIntent) null);
    public static final int DEVELOPER_ERROR = 10;
    public static final int INTERNAL_ERROR = 8;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    private final PendingIntent mPendingIntent;

    /* renamed from: p */
    private final int f15236p;

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this.f15236p = i;
        this.mPendingIntent = pendingIntent;
    }

    /* renamed from: f */
    private String m15331f() {
        switch (this.f15236p) {
            case 0:
                return C1246d.f3946r;
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                return "unknown status code " + this.f15236p;
        }
    }

    public int getErrorCode() {
        return this.f15236p;
    }

    public PendingIntent getResolution() {
        return this.mPendingIntent;
    }

    public boolean hasResolution() {
        return (this.f15236p == 0 || this.mPendingIntent == null) ? false : true;
    }

    public boolean isSuccess() {
        return this.f15236p == 0;
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public String toString() {
        return C3799r.m16670c(this).mo12413a("statusCode", m15331f()).mo12413a("resolution", this.mPendingIntent).toString();
    }
}
