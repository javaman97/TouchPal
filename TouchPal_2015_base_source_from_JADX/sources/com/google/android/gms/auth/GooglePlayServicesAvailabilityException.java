package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {

    /* renamed from: y */
    private final int f15234y;

    GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.f15234y = i;
    }

    public int getConnectionStatusCode() {
        return this.f15234y;
    }
}
