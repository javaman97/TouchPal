package android.support.p001v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.app.c */
/* compiled from: ActionBarDrawerToggleJellybeanMR2 */
class C0152c {

    /* renamed from: a */
    private static final String f380a = "ActionBarDrawerToggleImplJellybeanMR2";

    /* renamed from: b */
    private static final int[] f381b = {16843531};

    C0152c() {
    }

    /* renamed from: a */
    public static Object m590a(Object obj, Activity activity, Drawable drawable, int i) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
        return obj;
    }

    /* renamed from: a */
    public static Object m589a(Object obj, Activity activity, int i) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
        return obj;
    }

    /* renamed from: a */
    public static Drawable m588a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f381b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
}
