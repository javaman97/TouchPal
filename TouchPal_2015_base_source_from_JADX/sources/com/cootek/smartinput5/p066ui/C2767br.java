package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1413aW;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p066ui.p067a.C2657b;
import com.cootek.smartinput5.p066ui.p067a.C2658c;
import com.cootek.smartinput5.p066ui.p067a.C2659d;
import com.cootek.smartinput5.p066ui.p067a.C2660e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.br */
/* compiled from: PluginBar */
public class C2767br implements C2660e {

    /* renamed from: f */
    private static int f12336f = -1;

    /* renamed from: g */
    private static int f12337g = -1;

    /* renamed from: a */
    private Hashtable<String, C2770bu> f12338a = new Hashtable<>();

    /* renamed from: b */
    private ArrayList<String> f12339b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f12340c;

    /* renamed from: d */
    private LinearLayout f12341d;

    /* renamed from: e */
    private boolean f12342e = true;

    /* renamed from: h */
    private ArrayList<Integer> f12343h;

    public C2767br(Context context) {
        this.f12340c = context;
    }

    /* renamed from: a */
    public void mo9067a(ArrayList<C1199d> arrayList) {
        int i;
        this.f12343h = new ArrayList<>();
        Hashtable<String, C2770bu> hashtable = new Hashtable<>();
        this.f12339b.clear();
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (i2 == size - 1) {
                    C2657b.m12328a(this.f12340c, this);
                }
                C1199d dVar = arrayList.get(i2);
                if (dVar != null) {
                    C2770bu buVar = new C2770bu(this.f12340c, dVar.mo4454b());
                    if (!dVar.mo4456d().mo4469b()) {
                        if (dVar.mo4459g()) {
                            if (!dVar.mo4455c().equals(C1411aV.f4486m)) {
                                i = i3;
                                i2++;
                                i3 = i;
                            }
                        }
                    }
                    int a = dVar.mo4457e().mo4467a(C1411aV.f4490q);
                    if (a <= 0) {
                        i = i3;
                    } else {
                        buVar.mo9080a(C1368X.m6320c().mo5841n().mo6250a(a, C2726bF.PLUGIN_BAR));
                        buVar.mo9083a((String) null);
                        m12634a(buVar, dVar);
                        String i4 = buVar.mo8984i();
                        if (!this.f12338a.containsKey(i4)) {
                            this.f12343h.add(Integer.valueOf(i3));
                        }
                        hashtable.put(i4, buVar);
                        this.f12339b.add(i4);
                        i = i3 + 1;
                    }
                    i2++;
                    i3 = i;
                }
                i = i3;
                i2++;
                i3 = i;
            }
            this.f12338a = hashtable;
        }
    }

    /* renamed from: a */
    private void m12634a(C2770bu buVar, C1199d dVar) {
        buVar.mo9081a((View.OnClickListener) new C2768bs(this, buVar, dVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m12638j() {
        if (Engine.isInitialized() && Engine.getInstance().getWidgetManager() != null && Engine.getInstance().getWidgetManager().mo9650h() != null) {
            Engine.getInstance().getWidgetManager().mo9650h().mo8542g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m12639k() {
        if (Engine.isInitialized() && Engine.getInstance().getWidgetManager() != null && Engine.getInstance().getWidgetManager().mo9650h() != null) {
            Engine.getInstance().getWidgetManager().mo9650h().mo8551n();
        }
    }

    /* renamed from: a */
    public void mo9068a(boolean z) {
        this.f12342e = z;
        for (C2770bu a : this.f12338a.values()) {
            a.mo9084a(z);
        }
    }

    /* renamed from: a */
    public void mo9064a() {
        for (C2770bu next : this.f12338a.values()) {
            next.mo8979c(m12635a(next));
        }
    }

    /* renamed from: a */
    public View mo9063a(Context context, int i) {
        C2770bu buVar;
        if (this.f12341d == null) {
            this.f12341d = new LinearLayout(context);
            this.f12341d.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        }
        this.f12341d.removeAllViews();
        int size = this.f12339b.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = this.f12339b.get(i2);
            if (!(str == null || (buVar = this.f12338a.get(str)) == null)) {
                buVar.mo9084a(this.f12342e);
                buVar.mo8981f();
                buVar.mo8979c(m12635a(buVar));
                View a = buVar.mo9079a(i);
                if (buVar.mo7164b() && f12336f < i2) {
                    f12336f = i2;
                }
                if (a != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -1);
                    if (a.getParent() != null) {
                        ((ViewGroup) a.getParent()).removeView(a);
                    }
                    this.f12341d.addView(a, layoutParams);
                    buVar.mo8890d();
                }
            }
        }
        return this.f12341d;
    }

    /* renamed from: d */
    public int mo9071d() {
        return f12336f;
    }

    /* renamed from: a */
    public void mo9065a(int i) {
        f12337g = i;
    }

    /* renamed from: e */
    public void mo9072e() {
        f12337g = -1;
        f12336f = -1;
    }

    /* renamed from: f */
    public boolean mo9073f() {
        return f12336f > f12337g;
    }

    /* renamed from: a */
    public void mo9066a(String str) {
        int indexOf = this.f12339b.indexOf(str);
        if (indexOf != -1 && this.f12341d.getChildAt(indexOf) != null) {
            this.f12338a.remove(str);
            this.f12341d.removeViewAt(indexOf);
        }
    }

    /* renamed from: g */
    public int mo9074g() {
        return this.f12338a.size();
    }

    /* renamed from: a */
    private boolean m12635a(C2770bu buVar) {
        if (buVar != null) {
            return C1413aW.m6631d(buVar.mo8984i());
        }
        return false;
    }

    /* renamed from: a */
    public void mo7170a(Collection<C2659d> collection) {
        Iterator<C2659d> it = collection.iterator();
        while (it.hasNext()) {
            C2770bu buVar = (C2770bu) it.next();
            String c = buVar.mo8889c();
            this.f12338a.put(c, buVar);
            this.f12339b.add(c);
        }
    }

    /* renamed from: b */
    public void mo7171b() {
    }

    /* renamed from: c */
    public C2658c mo7172c() {
        return C2658c.FUNCTION_BAR_PLUGIN_LIST;
    }

    /* renamed from: b */
    public int mo9069b(String str) {
        int i;
        int i2 = 0;
        int size = this.f12339b.size();
        int i3 = 0;
        while (i2 < size) {
            if (TextUtils.equals(str, this.f12339b.get(i2))) {
                i = i2;
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        return i3;
    }

    /* renamed from: b */
    public Rect mo9070b(int i) {
        Rect rect = new Rect();
        if (this.f12341d != null) {
            this.f12341d.measure(0, 0);
            if (i < this.f12341d.getChildCount()) {
                View childAt = this.f12341d.getChildAt(i);
                int height = childAt.getHeight();
                int width = childAt.getWidth();
                rect.left = i * width;
                rect.right = width + rect.left;
                rect.top = 0;
                rect.bottom = height;
            }
        }
        return rect;
    }

    /* renamed from: a */
    public C2659d mo7167a(Context context, ExtensionStaticToast extensionStaticToast) {
        Bitmap decodeFile;
        if (extensionStaticToast == null || (decodeFile = BitmapFactory.decodeFile(extensionStaticToast.getImagePath())) == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeFile);
        C2770bu buVar = new C2770bu(context, extensionStaticToast.getGuidePointId(), extensionStaticToast.getId());
        buVar.mo9083a(extensionStaticToast.getDisplay());
        buVar.mo9080a((Drawable) bitmapDrawable);
        buVar.mo9081a((View.OnClickListener) new C2769bt(this, extensionStaticToast));
        return buVar;
    }

    /* renamed from: h */
    public void mo9075h() {
        for (C2770bu g : this.f12338a.values()) {
            g.mo8982g();
        }
    }

    /* renamed from: i */
    public void mo9076i() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        Iterator<Integer> it = this.f12343h.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (this.f12341d.getChildAt(intValue) == null) {
                break;
            }
            this.f12341d.getChildAt(intValue).startAnimation(alphaAnimation);
        }
        this.f12343h.clear();
    }
}
