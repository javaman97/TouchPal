package android.support.p001v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.b */
/* compiled from: ActionBarDrawerToggleHoneycomb */
class C0150b {

    /* renamed from: a */
    private static final String f375a = "ActionBarDrawerToggleHoneycomb";

    /* renamed from: b */
    private static final int[] f376b = {16843531};

    C0150b() {
    }

    /* renamed from: a */
    public static Object m587a(Object obj, Activity activity, Drawable drawable, int i) {
        Object obj2;
        if (obj == null) {
            obj2 = new C0151a(activity);
        } else {
            obj2 = obj;
        }
        C0151a aVar = (C0151a) obj2;
        if (aVar.f377a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f377a.invoke(actionBar, new Object[]{drawable});
                aVar.f378b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.w(f375a, "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (aVar.f379c != null) {
            aVar.f379c.setImageDrawable(drawable);
        } else {
            Log.w(f375a, "Couldn't set home-as-up indicator");
        }
        return obj2;
    }

    /* renamed from: a */
    public static Object m586a(Object obj, Activity activity, int i) {
        Object obj2;
        if (obj == null) {
            obj2 = new C0151a(activity);
        } else {
            obj2 = obj;
        }
        C0151a aVar = (C0151a) obj2;
        if (aVar.f377a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f378b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w(f375a, "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return obj2;
    }

    /* renamed from: a */
    public static Drawable m585a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f376b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: android.support.v4.app.b$a */
    /* compiled from: ActionBarDrawerToggleHoneycomb */
    private static class C0151a {

        /* renamed from: a */
        public Method f377a;

        /* renamed from: b */
        public Method f378b;

        /* renamed from: c */
        public ImageView f379c;

        C0151a(Activity activity) {
            try {
                this.f377a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f378b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException e) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View view = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (view instanceof ImageView) {
                            this.f379c = (ImageView) view;
                        }
                    }
                }
            }
        }
    }
}
