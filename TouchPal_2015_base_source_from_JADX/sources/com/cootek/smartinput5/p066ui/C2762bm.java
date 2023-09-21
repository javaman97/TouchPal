package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.ui.bm */
/* compiled from: NewGuidePiledViewManager */
public class C2762bm {

    /* renamed from: a */
    private FrameLayout.LayoutParams f12323a = new FrameLayout.LayoutParams(-1, -2, 17);

    /* renamed from: b */
    private ArrayList<String> f12324b = new ArrayList<>();

    /* renamed from: c */
    private FrameLayout f12325c;

    /* renamed from: d */
    private ImageView f12326d;

    /* renamed from: e */
    private ArrayList<String> f12327e = new ArrayList<>();

    /* renamed from: f */
    private HashMap<String, View> f12328f = new HashMap<>();

    /* renamed from: g */
    private View f12329g;

    public C2762bm(FrameLayout frameLayout) {
        this.f12325c = frameLayout;
    }

    /* renamed from: a */
    public void mo9051a(HashMap<String, View> hashMap) {
        if (hashMap == null) {
            throw new NullPointerException();
        }
        m12615e();
        m12614b(hashMap);
    }

    /* renamed from: e */
    private void m12615e() {
        Iterator<String> it = this.f12327e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            this.f12325c.removeView(this.f12328f.get(next));
            this.f12328f.remove(next);
        }
        this.f12327e.clear();
    }

    /* renamed from: b */
    private void m12614b(HashMap<String, View> hashMap) {
        for (Map.Entry next : hashMap.entrySet()) {
            if (!this.f12328f.containsKey(next.getKey())) {
                if (((String) next.getKey()).equalsIgnoreCase("way_tip") || ((String) next.getKey()).equalsIgnoreCase("space_tip")) {
                    this.f12325c.addView((View) next.getValue());
                } else {
                    this.f12325c.addView((View) next.getValue(), this.f12323a);
                }
                this.f12328f.put((String) next.getKey(), (View) next.getValue());
                if (!this.f12327e.contains((String) next.getKey())) {
                    this.f12327e.add((String) next.getKey());
                }
            }
        }
    }

    /* renamed from: a */
    public View mo9046a(String str) {
        return this.f12328f.get(str);
    }

    /* renamed from: b */
    public void mo9053b(String str) {
        View a = mo9046a(str);
        if (a != null) {
            a.setVisibility(0);
            this.f12325c.bringChildToFront(a);
        }
    }

    /* renamed from: a */
    public View mo9045a() {
        return this.f12325c.getChildAt(this.f12325c.getChildCount() - 1);
    }

    /* renamed from: a */
    public void mo9049a(String str, boolean z) {
        mo9050a(str, z, false);
    }

    /* renamed from: a */
    public void mo9050a(String str, boolean z, boolean z2) {
        View view = this.f12328f.get(str);
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000);
            alphaAnimation.setFillAfter(true);
            if (z) {
                Iterator<String> it = this.f12324b.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setFillAfter(true);
                    alphaAnimation2.setDuration(1000);
                    this.f12328f.get(next).startAnimation(alphaAnimation2);
                    m12613a(this.f12327e, next);
                }
                this.f12324b.clear();
            }
            if (z2) {
                alphaAnimation.setAnimationListener(new C2763bn(this, view));
            } else {
                alphaAnimation.setAnimationListener(new C2764bo(this, view));
                this.f12327e.remove(str);
                m12613a(this.f12324b, str);
            }
            view.startAnimation(alphaAnimation);
        }
    }

    /* renamed from: c */
    public void mo9055c(String str) {
        View view = this.f12328f.get(str);
        if (view != null && this.f12324b.contains(view)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
            this.f12324b.remove(view);
            m12613a(this.f12327e, str);
        }
    }

    /* renamed from: a */
    private void m12613a(ArrayList<String> arrayList, String str) {
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
    }

    /* renamed from: a */
    public void mo9048a(View view, FrameLayout.LayoutParams layoutParams) {
        view.setVisibility(0);
        if (!(this.f12329g == null || this.f12329g.getParent() == null)) {
            ((ViewGroup) this.f12329g.getParent()).removeView(this.f12329g);
        }
        this.f12329g = view;
        this.f12325c.addView(view, layoutParams);
    }

    /* renamed from: b */
    public void mo9052b() {
        if (this.f12329g != null) {
            this.f12325c.removeView(this.f12329g);
            this.f12329g = null;
        }
    }

    /* renamed from: a */
    public void mo9047a(View view) {
        view.setVisibility(0);
        this.f12326d = (ImageView) view;
        this.f12325c.addView(this.f12326d, 0, this.f12323a);
    }

    /* renamed from: c */
    public void mo9054c() {
        if (this.f12326d != null) {
            this.f12326d.setVisibility(8);
        }
    }

    /* renamed from: d */
    public View mo9056d() {
        return this.f12326d;
    }
}
