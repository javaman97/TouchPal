package android.support.p001v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: android.support.v4.app.ap */
/* compiled from: TaskStackBuilderJellybean */
class C0149ap {
    C0149ap() {
    }

    /* renamed from: a */
    public static PendingIntent m584a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
        return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
    }
}
