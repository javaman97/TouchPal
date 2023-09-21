package android.support.p001v4.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.p000a.C0017r;
import android.support.p001v4.view.C0333F;
import android.support.p001v4.view.C0476j;
import android.support.p001v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.a */
/* compiled from: ActionBarDrawerToggle */
public class C0097a implements DrawerLayout.C0521c {

    /* renamed from: a */
    private static final C0099a f271a;

    /* renamed from: b */
    private static final float f272b = 0.33333334f;

    /* renamed from: c */
    private static final int f273c = 16908332;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Activity f274d;

    /* renamed from: e */
    private final C0103e f275e;

    /* renamed from: f */
    private final DrawerLayout f276f;

    /* renamed from: g */
    private boolean f277g = true;

    /* renamed from: h */
    private Drawable f278h;

    /* renamed from: i */
    private Drawable f279i;

    /* renamed from: j */
    private C0105g f280j;

    /* renamed from: k */
    private final int f281k;

    /* renamed from: l */
    private final int f282l;

    /* renamed from: m */
    private final int f283m;

    /* renamed from: n */
    private Object f284n;

    /* renamed from: android.support.v4.app.a$a */
    /* compiled from: ActionBarDrawerToggle */
    private interface C0099a {
        /* renamed from: a */
        Drawable mo361a(Activity activity);

        /* renamed from: a */
        Object mo362a(Object obj, Activity activity, int i);

        /* renamed from: a */
        Object mo363a(Object obj, Activity activity, Drawable drawable, int i);
    }

    /* renamed from: android.support.v4.app.a$e */
    /* compiled from: ActionBarDrawerToggle */
    public interface C0103e {
        @C0017r
        /* renamed from: a */
        Drawable mo364a();

        /* renamed from: a */
        void mo365a(int i);

        /* renamed from: a */
        void mo366a(Drawable drawable, int i);
    }

    /* renamed from: android.support.v4.app.a$f */
    /* compiled from: ActionBarDrawerToggle */
    public interface C0104f {
        @C0017r
        /* renamed from: a */
        C0103e mo367a();
    }

    /* renamed from: android.support.v4.app.a$b */
    /* compiled from: ActionBarDrawerToggle */
    private static class C0100b implements C0099a {
        private C0100b() {
        }

        /* renamed from: a */
        public Drawable mo361a(Activity activity) {
            return null;
        }

        /* renamed from: a */
        public Object mo363a(Object obj, Activity activity, Drawable drawable, int i) {
            return obj;
        }

        /* renamed from: a */
        public Object mo362a(Object obj, Activity activity, int i) {
            return obj;
        }
    }

    /* renamed from: android.support.v4.app.a$c */
    /* compiled from: ActionBarDrawerToggle */
    private static class C0101c implements C0099a {
        private C0101c() {
        }

        /* renamed from: a */
        public Drawable mo361a(Activity activity) {
            return C0150b.m585a(activity);
        }

        /* renamed from: a */
        public Object mo363a(Object obj, Activity activity, Drawable drawable, int i) {
            return C0150b.m587a(obj, activity, drawable, i);
        }

        /* renamed from: a */
        public Object mo362a(Object obj, Activity activity, int i) {
            return C0150b.m586a(obj, activity, i);
        }
    }

    /* renamed from: android.support.v4.app.a$d */
    /* compiled from: ActionBarDrawerToggle */
    private static class C0102d implements C0099a {
        private C0102d() {
        }

        /* renamed from: a */
        public Drawable mo361a(Activity activity) {
            return C0152c.m588a(activity);
        }

        /* renamed from: a */
        public Object mo363a(Object obj, Activity activity, Drawable drawable, int i) {
            return C0152c.m590a(obj, activity, drawable, i);
        }

        /* renamed from: a */
        public Object mo362a(Object obj, Activity activity, int i) {
            return C0152c.m589a(obj, activity, i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            f271a = new C0102d();
        } else if (i >= 11) {
            f271a = new C0101c();
        } else {
            f271a = new C0100b();
        }
    }

    public C0097a(Activity activity, DrawerLayout drawerLayout, int i, int i2, int i3) {
        this.f274d = activity;
        if (activity instanceof C0104f) {
            this.f275e = ((C0104f) activity).mo367a();
        } else {
            this.f275e = null;
        }
        this.f276f = drawerLayout;
        this.f281k = i;
        this.f282l = i2;
        this.f283m = i3;
        this.f278h = mo360c();
        this.f279i = activity.getResources().getDrawable(i);
        this.f280j = new C0105g(this.f279i);
        this.f280j.mo370b(f272b);
    }

    /* renamed from: a */
    public void mo349a() {
        if (this.f276f.mo1739g((int) C0476j.f1112c)) {
            this.f280j.mo369a(1.0f);
        } else {
            this.f280j.mo369a(0.0f);
        }
        if (this.f277g) {
            mo352a((Drawable) this.f280j, this.f276f.mo1739g((int) C0476j.f1112c) ? this.f283m : this.f282l);
        }
    }

    /* renamed from: a */
    public void mo355a(boolean z) {
        if (z != this.f277g) {
            if (z) {
                mo352a((Drawable) this.f280j, this.f276f.mo1739g((int) C0476j.f1112c) ? this.f283m : this.f282l);
            } else {
                mo352a(this.f278h, 0);
            }
            this.f277g = z;
        }
    }

    /* renamed from: b */
    public boolean mo359b() {
        return this.f277g;
    }

    /* renamed from: a */
    public void mo351a(Configuration configuration) {
        this.f278h = mo360c();
        this.f279i = this.f274d.getResources().getDrawable(this.f281k);
        mo349a();
    }

    /* renamed from: a */
    public boolean mo356a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != f273c || !this.f277g) {
            return false;
        }
        if (this.f276f.mo1745h((int) C0476j.f1112c)) {
            this.f276f.mo1737f((int) C0476j.f1112c);
        } else {
            this.f276f.mo1736e((int) C0476j.f1112c);
        }
        return true;
    }

    /* renamed from: a */
    public void mo354a(View view, float f) {
        float min;
        float a = this.f280j.mo368a();
        if (f > 0.5f) {
            min = Math.max(a, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            min = Math.min(a, f * 2.0f);
        }
        this.f280j.mo369a(min);
    }

    /* renamed from: a */
    public void mo353a(View view) {
        this.f280j.mo369a(1.0f);
        if (this.f277g) {
            mo357b(this.f283m);
        }
    }

    /* renamed from: b */
    public void mo358b(View view) {
        this.f280j.mo369a(0.0f);
        if (this.f277g) {
            mo357b(this.f282l);
        }
    }

    /* renamed from: a */
    public void mo350a(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Drawable mo360c() {
        if (this.f275e != null) {
            return this.f275e.mo364a();
        }
        return f271a.mo361a(this.f274d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo352a(Drawable drawable, int i) {
        if (this.f275e != null) {
            this.f275e.mo366a(drawable, i);
        } else {
            this.f284n = f271a.mo363a(this.f284n, this.f274d, drawable, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo357b(int i) {
        if (this.f275e != null) {
            this.f275e.mo365a(i);
        } else {
            this.f284n = f271a.mo362a(this.f284n, this.f274d, i);
        }
    }

    /* renamed from: android.support.v4.app.a$g */
    /* compiled from: ActionBarDrawerToggle */
    private class C0105g extends InsetDrawable implements Drawable.Callback {

        /* renamed from: a */
        final /* synthetic */ C0097a f285a;

        /* renamed from: b */
        private final boolean f286b;

        /* renamed from: c */
        private final Rect f287c;

        /* renamed from: d */
        private float f288d;

        /* renamed from: e */
        private float f289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C0105g(C0097a aVar, Drawable drawable) {
            super(drawable, 0);
            boolean z = false;
            this.f285a = aVar;
            this.f286b = Build.VERSION.SDK_INT > 18 ? true : z;
            this.f287c = new Rect();
        }

        /* renamed from: a */
        public void mo369a(float f) {
            this.f288d = f;
            invalidateSelf();
        }

        /* renamed from: a */
        public float mo368a() {
            return this.f288d;
        }

        /* renamed from: b */
        public void mo370b(float f) {
            this.f289e = f;
            invalidateSelf();
        }

        public void draw(Canvas canvas) {
            int i = 1;
            copyBounds(this.f287c);
            canvas.save();
            boolean z = C0333F.m1369i(this.f285a.f274d.getWindow().getDecorView()) == 1;
            if (z) {
                i = -1;
            }
            int width = this.f287c.width();
            canvas.translate(((float) i) * (-this.f289e) * ((float) width) * this.f288d, 0.0f);
            if (z && !this.f286b) {
                canvas.translate((float) width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }
}
