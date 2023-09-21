package android.support.p001v4.p007d.p008a;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.d.a.a */
/* compiled from: DisplayManagerCompat */
public abstract class C0226a {

    /* renamed from: a */
    public static final String f582a = "android.hardware.display.category.PRESENTATION";

    /* renamed from: b */
    private static final WeakHashMap<Context, C0226a> f583b = new WeakHashMap<>();

    /* renamed from: a */
    public abstract Display mo715a(int i);

    /* renamed from: a */
    public abstract Display[] mo716a();

    /* renamed from: a */
    public abstract Display[] mo717a(String str);

    C0226a() {
    }

    /* renamed from: a */
    public static C0226a m913a(Context context) {
        C0226a aVar;
        synchronized (f583b) {
            aVar = f583b.get(context);
            if (aVar == null) {
                if (Build.VERSION.SDK_INT >= 17) {
                    aVar = new C0227a(context);
                } else {
                    aVar = new C0228b(context);
                }
                f583b.put(context, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: android.support.v4.d.a.a$b */
    /* compiled from: DisplayManagerCompat */
    private static class C0228b extends C0226a {

        /* renamed from: b */
        private final WindowManager f585b;

        public C0228b(Context context) {
            this.f585b = (WindowManager) context.getSystemService("window");
        }

        /* renamed from: a */
        public Display mo715a(int i) {
            Display defaultDisplay = this.f585b.getDefaultDisplay();
            if (defaultDisplay.getDisplayId() == i) {
                return defaultDisplay;
            }
            return null;
        }

        /* renamed from: a */
        public Display[] mo716a() {
            return new Display[]{this.f585b.getDefaultDisplay()};
        }

        /* renamed from: a */
        public Display[] mo717a(String str) {
            return str == null ? mo716a() : new Display[0];
        }
    }

    /* renamed from: android.support.v4.d.a.a$a */
    /* compiled from: DisplayManagerCompat */
    private static class C0227a extends C0226a {

        /* renamed from: b */
        private final Object f584b;

        public C0227a(Context context) {
            this.f584b = C0229b.m924a(context);
        }

        /* renamed from: a */
        public Display mo715a(int i) {
            return C0229b.m923a(this.f584b, i);
        }

        /* renamed from: a */
        public Display[] mo716a() {
            return C0229b.m925a(this.f584b);
        }

        /* renamed from: a */
        public Display[] mo717a(String str) {
            return C0229b.m926a(this.f584b, str);
        }
    }
}
