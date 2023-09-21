package android.support.p001v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.p000a.C0017r;
import android.support.p001v4.content.C0203i;
import android.util.Log;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: android.support.v4.app.L */
/* compiled from: NavUtils */
public class C0052L {

    /* renamed from: a */
    public static final String f109a = "android.support.PARENT_ACTIVITY";

    /* renamed from: b */
    private static final String f110b = "NavUtils";

    /* renamed from: c */
    private static final C0053a f111c;

    /* renamed from: android.support.v4.app.L$a */
    /* compiled from: NavUtils */
    interface C0053a {
        /* renamed from: a */
        Intent mo217a(Activity activity);

        /* renamed from: a */
        String mo218a(Context context, ActivityInfo activityInfo);

        /* renamed from: a */
        boolean mo219a(Activity activity, Intent intent);

        /* renamed from: b */
        void mo220b(Activity activity, Intent intent);
    }

    /* renamed from: android.support.v4.app.L$b */
    /* compiled from: NavUtils */
    static class C0054b implements C0053a {
        C0054b() {
        }

        /* renamed from: a */
        public Intent mo217a(Activity activity) {
            String c = C0052L.m145c(activity);
            if (c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, c);
            try {
                return C0052L.m143b((Context) activity, componentName) == null ? C0203i.m842a(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(C0052L.f110b, "getParentActivityIntent: bad parentActivityName '" + c + "' in manifest");
                return null;
            }
        }

        /* renamed from: a */
        public boolean mo219a(Activity activity, Intent intent) {
            String action = activity.getIntent().getAction();
            return action != null && !action.equals("android.intent.action.MAIN");
        }

        /* renamed from: b */
        public void mo220b(Activity activity, Intent intent) {
            intent.addFlags(Engine.CHANGE_LOCAL_CLOUD_SEARCH);
            activity.startActivity(intent);
            activity.finish();
        }

        /* renamed from: a */
        public String mo218a(Context context, ActivityInfo activityInfo) {
            if (activityInfo.metaData == null) {
                return null;
            }
            String string = activityInfo.metaData.getString(C0052L.f109a);
            if (string == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
            return string;
        }
    }

    /* renamed from: android.support.v4.app.L$c */
    /* compiled from: NavUtils */
    static class C0055c extends C0054b {
        C0055c() {
        }

        /* renamed from: a */
        public Intent mo217a(Activity activity) {
            Intent a = C0056M.m159a(activity);
            if (a == null) {
                return mo221b(activity);
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Intent mo221b(Activity activity) {
            return super.mo217a(activity);
        }

        /* renamed from: a */
        public boolean mo219a(Activity activity, Intent intent) {
            return C0056M.m161a(activity, intent);
        }

        /* renamed from: b */
        public void mo220b(Activity activity, Intent intent) {
            C0056M.m162b(activity, intent);
        }

        /* renamed from: a */
        public String mo218a(Context context, ActivityInfo activityInfo) {
            String a = C0056M.m160a(activityInfo);
            if (a == null) {
                return super.mo218a(context, activityInfo);
            }
            return a;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f111c = new C0055c();
        } else {
            f111c = new C0054b();
        }
    }

    /* renamed from: a */
    public static boolean m141a(Activity activity, Intent intent) {
        return f111c.mo219a(activity, intent);
    }

    /* renamed from: a */
    public static void m140a(Activity activity) {
        Intent b = m142b(activity);
        if (b == null) {
            throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified." + " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> " + " element in your manifest?)");
        }
        m144b(activity, b);
    }

    /* renamed from: b */
    public static void m144b(Activity activity, Intent intent) {
        f111c.mo220b(activity, intent);
    }

    /* renamed from: b */
    public static Intent m142b(Activity activity) {
        return f111c.mo217a(activity);
    }

    /* renamed from: a */
    public static Intent m139a(Context context, Class<?> cls) throws PackageManager.NameNotFoundException {
        String b = m143b(context, new ComponentName(context, cls));
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, b);
        return m143b(context, componentName) == null ? C0203i.m842a(componentName) : new Intent().setComponent(componentName);
    }

    /* renamed from: a */
    public static Intent m138a(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String b = m143b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return m143b(context, componentName2) == null ? C0203i.m842a(componentName2) : new Intent().setComponent(componentName2);
    }

    @C0017r
    /* renamed from: c */
    public static String m145c(Activity activity) {
        try {
            return m143b((Context) activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @C0017r
    /* renamed from: b */
    public static String m143b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        return f111c.mo218a(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }

    private C0052L() {
    }
}
