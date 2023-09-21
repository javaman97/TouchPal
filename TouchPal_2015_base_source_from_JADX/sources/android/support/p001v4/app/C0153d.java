package android.support.p001v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p000a.C0017r;
import android.support.p001v4.content.C0194b;

/* renamed from: android.support.v4.app.d */
/* compiled from: ActivityCompat */
public class C0153d extends C0194b {
    /* renamed from: a */
    public static boolean m593a(Activity activity) {
        if (Build.VERSION.SDK_INT < 11) {
            return false;
        }
        C0154e.m595a(activity);
        return true;
    }

    /* renamed from: a */
    public static void m592a(Activity activity, Intent intent, @C0017r Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0155f.m599a(activity, intent, bundle);
        } else {
            activity.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m591a(Activity activity, Intent intent, int i, @C0017r Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0155f.m598a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: b */
    public static void m594b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0155f.m597a(activity);
        } else {
            activity.finish();
        }
    }
}
