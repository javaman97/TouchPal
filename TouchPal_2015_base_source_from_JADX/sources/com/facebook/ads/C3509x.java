package com.facebook.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.support.p001v4.content.C0213m;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.C3395d;
import com.facebook.ads.internal.C3404f;
import com.facebook.ads.internal.C3458i;
import com.facebook.ads.internal.adapters.C3351A;
import com.facebook.ads.internal.adapters.C3369i;
import com.facebook.ads.internal.adapters.C3370j;
import com.facebook.ads.internal.adapters.C3388z;
import com.facebook.ads.internal.p074e.C3400c;
import com.facebook.ads.internal.p077h.C3445l;
import com.facebook.ads.internal.view.C3493k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.x */
public class C3509x implements C3338b {

    /* renamed from: a */
    private static final C3395d f15171a = C3395d.ADS;

    /* renamed from: b */
    private static final String f15172b = C3509x.class.getSimpleName();

    /* renamed from: c */
    private static WeakHashMap<View, WeakReference<C3509x>> f15173c = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f15174d;

    /* renamed from: e */
    private final String f15175e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3345i f15176f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3502q f15177g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3458i f15178h;

    /* renamed from: i */
    private volatile boolean f15179i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3351A f15180j;

    /* renamed from: k */
    private C3400c f15181k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View f15182l;

    /* renamed from: m */
    private List<View> f15183m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public View.OnTouchListener f15184n;

    /* renamed from: o */
    private C3370j f15185o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3388z f15186p;

    /* renamed from: q */
    private C3513d f15187q;

    /* renamed from: r */
    private C3514e f15188r;

    /* renamed from: s */
    private C3493k f15189s;

    /* renamed from: com.facebook.ads.x$a */
    public static class C3510a {

        /* renamed from: a */
        private final String f15190a;

        /* renamed from: b */
        private final int f15191b;

        /* renamed from: c */
        private final int f15192c;

        private C3510a(String str, int i, int i2) {
            this.f15190a = str;
            this.f15191b = i;
            this.f15192c = i2;
        }

        /* renamed from: a */
        public static C3510a m15298a(JSONObject jSONObject) {
            String optString;
            if (jSONObject == null || (optString = jSONObject.optString("url")) == null) {
                return null;
            }
            return new C3510a(optString, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        }

        /* renamed from: a */
        public String mo10878a() {
            return this.f15190a;
        }

        /* renamed from: b */
        public int mo10879b() {
            return this.f15191b;
        }

        /* renamed from: c */
        public int mo10880c() {
            return this.f15192c;
        }
    }

    /* renamed from: com.facebook.ads.x$b */
    public enum C3511b {
        NONE(0),
        ICON(1),
        IMAGE(2);
        

        /* renamed from: d */
        public static final EnumSet<C3511b> f15196d = null;

        /* renamed from: e */
        private final long f15198e;

        static {
            f15196d = EnumSet.allOf(C3511b.class);
        }

        private C3511b(long j) {
            this.f15198e = j;
        }

        /* renamed from: a */
        public long mo10881a() {
            return this.f15198e;
        }
    }

    /* renamed from: com.facebook.ads.x$c */
    public static class C3512c {

        /* renamed from: a */
        private final double f15199a;

        /* renamed from: b */
        private final double f15200b;

        private C3512c(double d, double d2) {
            this.f15199a = d;
            this.f15200b = d2;
        }

        /* renamed from: a */
        public static C3512c m15303a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            double optDouble = jSONObject.optDouble("value", 0.0d);
            double optDouble2 = jSONObject.optDouble("scale", 0.0d);
            if (optDouble == 0.0d || optDouble2 == 0.0d) {
                return null;
            }
            return new C3512c(optDouble, optDouble2);
        }

        /* renamed from: a */
        public double mo10882a() {
            return this.f15199a;
        }

        /* renamed from: b */
        public double mo10883b() {
            return this.f15200b;
        }
    }

    /* renamed from: com.facebook.ads.x$d */
    private class C3513d implements View.OnClickListener, View.OnTouchListener {

        /* renamed from: b */
        private int f15202b;

        /* renamed from: c */
        private int f15203c;

        /* renamed from: d */
        private int f15204d;

        /* renamed from: e */
        private int f15205e;

        /* renamed from: f */
        private float f15206f;

        /* renamed from: g */
        private float f15207g;

        /* renamed from: h */
        private int f15208h;

        /* renamed from: i */
        private int f15209i;

        /* renamed from: j */
        private boolean f15210j;

        private C3513d() {
        }

        /* synthetic */ C3513d(C3509x xVar, C3516y yVar) {
            this();
        }

        /* renamed from: a */
        public Map<String, Object> mo10884a() {
            HashMap hashMap = new HashMap();
            hashMap.put("clickX", Integer.valueOf(this.f15202b));
            hashMap.put("clickY", Integer.valueOf(this.f15203c));
            hashMap.put("width", Integer.valueOf(this.f15204d));
            hashMap.put("height", Integer.valueOf(this.f15205e));
            hashMap.put("adPositionX", Float.valueOf(this.f15206f));
            hashMap.put("adPositionY", Float.valueOf(this.f15207g));
            hashMap.put("visibleWidth", Integer.valueOf(this.f15209i));
            hashMap.put("visibleHeight", Integer.valueOf(this.f15208h));
            return hashMap;
        }

        public void onClick(View view) {
            if (C3509x.this.f15176f != null) {
                C3509x.this.f15176f.mo7022b(C3509x.this);
            }
            if (!this.f15210j) {
                Log.e("FBAudienceNetworkLog", "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
            }
            C3509x.this.f15180j.mo10586b(mo10884a());
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && C3509x.this.f15182l != null) {
                this.f15204d = C3509x.this.f15182l.getWidth();
                this.f15205e = C3509x.this.f15182l.getHeight();
                int[] iArr = new int[2];
                C3509x.this.f15182l.getLocationInWindow(iArr);
                this.f15206f = (float) iArr[0];
                this.f15207g = (float) iArr[1];
                Rect rect = new Rect();
                C3509x.this.f15182l.getGlobalVisibleRect(rect);
                this.f15209i = rect.width();
                this.f15208h = rect.height();
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                this.f15202b = (((int) motionEvent.getX()) + iArr2[0]) - iArr[0];
                this.f15203c = (iArr2[1] + ((int) motionEvent.getY())) - iArr[1];
                this.f15210j = true;
            }
            if (C3509x.this.f15184n != null) {
                return C3509x.this.f15184n.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.facebook.ads.x$e */
    private class C3514e extends BroadcastReceiver {

        /* renamed from: b */
        private boolean f15212b;

        private C3514e() {
        }

        /* synthetic */ C3514e(C3509x xVar, C3516y yVar) {
            this();
        }

        /* renamed from: a */
        public void mo10887a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.facebook.ads.native.impression:" + C3509x.this.f15180j.mo10596l());
            intentFilter.addAction("com.facebook.ads.native.click:" + C3509x.this.f15180j.mo10596l());
            C0213m.m882a(C3509x.this.f15174d).mo695a(this, intentFilter);
            this.f15212b = true;
        }

        /* renamed from: b */
        public void mo10888b() {
            if (this.f15212b) {
                try {
                    C0213m.m882a(C3509x.this.f15174d).mo694a((BroadcastReceiver) this);
                } catch (Exception e) {
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            String str = intent.getAction().split(":")[0];
            if ("com.facebook.ads.native.impression".equals(str)) {
                C3509x.this.f15186p.mo10636a();
            } else if ("com.facebook.ads.native.click".equals(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("mil", true);
                C3509x.this.f15180j.mo10586b(hashMap);
            }
        }
    }

    /* renamed from: com.facebook.ads.x$f */
    private class C3515f extends C3369i {
        private C3515f() {
        }

        /* synthetic */ C3515f(C3509x xVar, C3516y yVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo10524a() {
            return false;
        }

        /* renamed from: b */
        public void mo10611b() {
            if (C3509x.this.f15177g != null) {
                C3509x.this.f15177g.mo10559e(C3509x.this);
            }
            if ((C3509x.this.f15176f instanceof C3502q) && C3509x.this.f15176f != C3509x.this.f15177g) {
                ((C3502q) C3509x.this.f15176f).mo10559e(C3509x.this);
            }
        }

        /* renamed from: c */
        public void mo10638c() {
        }
    }

    public C3509x(Context context, C3351A a, C3400c cVar) {
        this(context, (String) null);
        this.f15181k = cVar;
        this.f15179i = true;
        this.f15180j = a;
    }

    public C3509x(Context context, String str) {
        this.f15183m = new ArrayList();
        this.f15174d = context;
        this.f15175e = str;
    }

    C3509x(C3509x xVar) {
        this(xVar.f15174d, (String) null);
        this.f15181k = xVar.f15181k;
        this.f15179i = true;
        this.f15180j = xVar.f15180j;
    }

    /* renamed from: a */
    public static void m15264a(C3510a aVar, ImageView imageView) {
        if (aVar != null && imageView != null) {
            new C3445l(imageView).execute(new String[]{aVar.mo10878a()});
        }
    }

    /* renamed from: a */
    private void m15265a(List<View> list, View view) {
        list.add(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m15265a(list, viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: b */
    private void m15267b(View view) {
        this.f15183m.add(view);
        view.setOnClickListener(this.f15187q);
        view.setOnTouchListener(this.f15187q);
    }

    /* renamed from: p */
    private void m15275p() {
        for (View next : this.f15183m) {
            next.setOnClickListener((View.OnClickListener) null);
            next.setOnTouchListener((View.OnTouchListener) null);
        }
        this.f15183m.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m15276q() {
        if (this.f15180j != null && this.f15180j.mo10587c()) {
            this.f15188r = new C3514e(this, (C3516y) null);
            this.f15188r.mo10887a();
            this.f15186p = new C3388z(this.f15174d, new C3326C(this), this.f15180j);
        }
    }

    /* renamed from: a */
    public void mo10516a() {
        mo10864a((EnumSet<C3511b>) EnumSet.of(C3511b.NONE));
    }

    /* renamed from: a */
    public void mo10859a(View.OnTouchListener onTouchListener) {
        this.f15184n = onTouchListener;
    }

    /* renamed from: a */
    public void mo10860a(View view) {
        ArrayList arrayList = new ArrayList();
        m15265a((List<View>) arrayList, view);
        mo10861a(view, (List<View>) arrayList);
    }

    /* renamed from: a */
    public void mo10861a(View view, List<View> list) {
        if (view == null) {
            throw new IllegalArgumentException("Must provide a View");
        } else if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("Invalid set of clickable views");
        } else if (!mo10865c()) {
            Log.e(f15172b, "Ad not loaded");
        } else {
            if (this.f15182l != null) {
                Log.w(f15172b, "Native Ad was already registered with a View. Auto unregistering and proceeding.");
                mo10877o();
            }
            if (f15173c.containsKey(view)) {
                Log.w(f15172b, "View already registered with a NativeAd. Auto unregistering and proceeding.");
                ((C3509x) f15173c.get(view).get()).mo10877o();
            }
            this.f15187q = new C3513d(this, (C3516y) null);
            this.f15182l = view;
            if (view instanceof ViewGroup) {
                this.f15189s = new C3493k(view.getContext(), new C3324A(this));
                ((ViewGroup) view).addView(this.f15189s);
            }
            for (View b : list) {
                m15267b(b);
            }
            this.f15186p = new C3388z(this.f15174d, new C3515f(this, (C3516y) null), this.f15180j);
            int i = 1;
            if (this.f15181k != null) {
                i = this.f15181k.mo10695e();
            } else if (!(this.f15178h == null || this.f15178h.mo10789b() == null)) {
                i = this.f15178h.mo10789b().mo10695e();
            }
            this.f15185o = new C3370j(this.f15174d, this.f15182l, i, new C3325B(this));
            this.f15185o.mo10639a();
            f15173c.put(view, new WeakReference(this));
        }
    }

    /* renamed from: a */
    public void mo10862a(C3345i iVar) {
        this.f15176f = iVar;
    }

    @Deprecated
    /* renamed from: a */
    public void mo10863a(C3502q qVar) {
        this.f15177g = qVar;
    }

    /* renamed from: a */
    public void mo10864a(EnumSet<C3511b> enumSet) {
        if (this.f15179i) {
            throw new IllegalStateException("loadAd cannot be called more than once");
        }
        this.f15179i = true;
        this.f15178h = new C3458i(this.f15174d, this.f15175e, C3404f.NATIVE_UNKNOWN, (C3496k) null, f15171a, 1);
        this.f15178h.mo10680a(new C3516y(this, enumSet));
        this.f15178h.mo10790c();
    }

    /* renamed from: b */
    public void mo10517b() {
        if (this.f15188r != null) {
            this.f15188r.mo10888b();
            this.f15188r = null;
        }
        if (this.f15178h != null) {
            this.f15178h.mo10792e();
            this.f15178h = null;
        }
    }

    /* renamed from: c */
    public boolean mo10865c() {
        return this.f15180j != null;
    }

    /* renamed from: d */
    public C3510a mo10866d() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10588d();
    }

    /* renamed from: e */
    public C3510a mo10867e() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10589e();
    }

    /* renamed from: f */
    public String mo10868f() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10590f();
    }

    /* renamed from: g */
    public String mo10869g() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10591g();
    }

    /* renamed from: h */
    public String mo10870h() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10592h();
    }

    /* renamed from: i */
    public String mo10871i() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10593i();
    }

    /* renamed from: j */
    public String mo10872j() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10594j();
    }

    /* renamed from: k */
    public C3512c mo10873k() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10595k();
    }

    /* renamed from: l */
    public String mo10874l() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10596l();
    }

    /* renamed from: m */
    public C3510a mo10875m() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10597m();
    }

    /* renamed from: n */
    public String mo10876n() {
        if (!mo10865c()) {
            return null;
        }
        return this.f15180j.mo10598n();
    }

    /* renamed from: o */
    public void mo10877o() {
        if (this.f15182l != null) {
            if (!f15173c.containsKey(this.f15182l) || f15173c.get(this.f15182l).get() != this) {
                throw new IllegalStateException("View not registered with this NativeAd");
            }
            if ((this.f15182l instanceof ViewGroup) && this.f15189s != null) {
                ((ViewGroup) this.f15182l).removeView(this.f15189s);
                this.f15189s = null;
            }
            f15173c.remove(this.f15182l);
            m15275p();
            this.f15182l = null;
            if (this.f15185o != null) {
                this.f15185o.mo10640b();
                this.f15185o = null;
            }
            this.f15186p = null;
        }
    }
}
