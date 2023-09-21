package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.i */
public class C3776i implements DialogInterface.OnClickListener {

    /* renamed from: bm */
    private final Activity f15846bm;

    /* renamed from: bn */
    private final int f15847bn;
    private final Intent mIntent;

    public C3776i(Activity activity, Intent intent, int i) {
        this.f15846bm = activity;
        this.mIntent = intent;
        this.f15847bn = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.mIntent != null) {
                this.f15846bm.startActivityForResult(this.mIntent, this.f15847bn);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
