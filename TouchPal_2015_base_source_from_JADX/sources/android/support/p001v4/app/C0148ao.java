package android.support.p001v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: android.support.v4.app.ao */
/* compiled from: TaskStackBuilderHoneycomb */
class C0148ao {
    C0148ao() {
    }

    /* renamed from: a */
    public static PendingIntent m583a(Context context, int i, Intent[] intentArr, int i2) {
        return PendingIntent.getActivities(context, i, intentArr, i2);
    }
}
