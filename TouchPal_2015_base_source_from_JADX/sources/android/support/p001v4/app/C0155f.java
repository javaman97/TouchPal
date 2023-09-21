package android.support.p001v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: android.support.v4.app.f */
/* compiled from: ActivityCompatJB */
class C0155f {
    C0155f() {
    }

    /* renamed from: a */
    public static void m599a(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* renamed from: a */
    public static void m598a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: a */
    public static void m597a(Activity activity) {
        activity.finishAffinity();
    }
}
