package android.support.p001v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

/* renamed from: android.support.v4.app.M */
/* compiled from: NavUtilsJB */
class C0056M {
    C0056M() {
    }

    /* renamed from: a */
    public static Intent m159a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* renamed from: a */
    public static boolean m161a(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    /* renamed from: b */
    public static void m162b(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* renamed from: a */
    public static String m160a(ActivityInfo activityInfo) {
        return activityInfo.parentActivityName;
    }
}
