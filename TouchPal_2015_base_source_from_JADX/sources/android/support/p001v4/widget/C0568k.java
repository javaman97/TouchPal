package android.support.p001v4.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p001v4.view.C0333F;
import android.support.p001v4.view.C0388X;
import android.support.p001v4.view.C0399a;
import android.support.p001v4.view.p017a.C0404a;
import android.support.p001v4.view.p017a.C0409c;
import android.support.p001v4.view.p017a.C0418g;
import android.support.p001v4.view.p017a.C0429l;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: android.support.v4.widget.k */
/* compiled from: ExploreByTouchHelper */
public abstract class C0568k extends C0399a {

    /* renamed from: b */
    public static final int f1414b = Integer.MIN_VALUE;

    /* renamed from: c */
    private static final String f1415c = View.class.getName();

    /* renamed from: d */
    private final Rect f1416d = new Rect();

    /* renamed from: e */
    private final Rect f1417e = new Rect();

    /* renamed from: f */
    private final Rect f1418f = new Rect();

    /* renamed from: g */
    private final int[] f1419g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f1420h;

    /* renamed from: i */
    private final View f1421i;

    /* renamed from: j */
    private C0570a f1422j;

    /* renamed from: k */
    private int f1423k = Integer.MIN_VALUE;

    /* renamed from: l */
    private int f1424l = Integer.MIN_VALUE;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1961a(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1963a(int i, C0418g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1964a(int i, AccessibilityEvent accessibilityEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1965a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo1967a(int i, int i2, Bundle bundle);

    public C0568k(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f1421i = view;
        this.f1420h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    public C0429l mo1296a(View view) {
        if (this.f1422j == null) {
            this.f1422j = new C0570a();
        }
        return this.f1422j;
    }

    /* renamed from: a */
    public boolean mo1968a(MotionEvent motionEvent) {
        boolean z = true;
        if (!this.f1420h.isEnabled() || !C0409c.m1953b(this.f1420h)) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 7:
            case 9:
                int a = mo1961a(motionEvent.getX(), motionEvent.getY());
                m3265b(a);
                if (a == Integer.MIN_VALUE) {
                    z = false;
                }
                return z;
            case 10:
                if (this.f1423k == Integer.MIN_VALUE) {
                    return false;
                }
                m3265b(Integer.MIN_VALUE);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public boolean mo1966a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f1420h.isEnabled() || (parent = this.f1421i.getParent()) == null) {
            return false;
        }
        return C0388X.m1753a(parent, this.f1421i, m3264b(i, i2));
    }

    /* renamed from: b */
    public void mo1969b() {
        mo1962a(-1);
    }

    /* renamed from: a */
    public void mo1962a(int i) {
        mo1966a(i, 2048);
    }

    /* renamed from: c */
    public int mo1970c() {
        return this.f1423k;
    }

    /* renamed from: b */
    private void m3265b(int i) {
        if (this.f1424l != i) {
            int i2 = this.f1424l;
            this.f1424l = i;
            mo1966a(i, 128);
            mo1966a(i2, 256);
        }
    }

    /* renamed from: b */
    private AccessibilityEvent m3264b(int i, int i2) {
        switch (i) {
            case -1:
                return m3267c(i2);
            default:
                return m3268c(i, i2);
        }
    }

    /* renamed from: c */
    private AccessibilityEvent m3267c(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        C0333F.m1349b(this.f1421i, obtain);
        return obtain;
    }

    /* renamed from: c */
    private AccessibilityEvent m3268c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName(f1415c);
        mo1964a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setPackageName(this.f1421i.getContext().getPackageName());
            C0404a.m1936b(obtain).mo1478a(this.f1421i, i);
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C0418g m3271d(int i) {
        switch (i) {
            case -1:
                return m3270d();
            default:
                return m3273e(i);
        }
    }

    /* renamed from: d */
    private C0418g m3270d() {
        C0418g a = C0418g.m1984a(this.f1421i);
        C0333F.m1339a(this.f1421i, a);
        LinkedList linkedList = new LinkedList();
        mo1965a((List<Integer>) linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            a.mo1344c(this.f1421i, ((Integer) it.next()).intValue());
        }
        return a;
    }

    /* renamed from: e */
    private C0418g m3273e(int i) {
        C0418g b = C0418g.m1987b();
        b.mo1369j(true);
        b.mo1337b((CharSequence) f1415c);
        mo1963a(i, b);
        if (b.mo1385v() == null && b.mo1386w() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.mo1329a(this.f1417e);
        if (this.f1417e.isEmpty()) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int e = b.mo1354e();
        if ((e & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((e & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else {
            b.mo1330a((CharSequence) this.f1421i.getContext().getPackageName());
            b.mo1336b(this.f1421i, i);
            b.mo1350d(this.f1421i);
            if (this.f1423k == i) {
                b.mo1360f(true);
                b.mo1348d(128);
            } else {
                b.mo1360f(false);
                b.mo1348d(64);
            }
            if (m3262a(this.f1417e)) {
                b.mo1355e(true);
                b.mo1334b(this.f1417e);
            }
            this.f1421i.getLocationOnScreen(this.f1419g);
            int i2 = this.f1419g[0];
            int i3 = this.f1419g[1];
            this.f1416d.set(this.f1417e);
            this.f1416d.offset(i2, i3);
            b.mo1349d(this.f1416d);
            return b;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m3266b(int i, int i2, Bundle bundle) {
        switch (i) {
            case -1:
                return m3261a(i2, bundle);
            default:
                return m3269c(i, i2, bundle);
        }
    }

    /* renamed from: a */
    private boolean m3261a(int i, Bundle bundle) {
        return C0333F.m1346a(this.f1421i, i, bundle);
    }

    /* renamed from: c */
    private boolean m3269c(int i, int i2, Bundle bundle) {
        switch (i2) {
            case 64:
            case 128:
                return m3272d(i, i2, bundle);
            default:
                return mo1967a(i, i2, bundle);
        }
    }

    /* renamed from: d */
    private boolean m3272d(int i, int i2, Bundle bundle) {
        switch (i2) {
            case 64:
                return m3275g(i);
            case 128:
                return m3276h(i);
            default:
                return false;
        }
    }

    /* renamed from: a */
    private boolean m3262a(Rect rect) {
        if (rect == null || rect.isEmpty()) {
            return false;
        }
        if (this.f1421i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f1421i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (C0333F.m1361f(view) <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        if (!this.f1421i.getLocalVisibleRect(this.f1418f)) {
            return false;
        }
        return rect.intersect(this.f1418f);
    }

    /* renamed from: f */
    private boolean m3274f(int i) {
        return this.f1423k == i;
    }

    /* renamed from: g */
    private boolean m3275g(int i) {
        if (!this.f1420h.isEnabled() || !C0409c.m1953b(this.f1420h) || m3274f(i)) {
            return false;
        }
        this.f1423k = i;
        this.f1421i.invalidate();
        mo1966a(i, 32768);
        return true;
    }

    /* renamed from: h */
    private boolean m3276h(int i) {
        if (!m3274f(i)) {
            return false;
        }
        this.f1423k = Integer.MIN_VALUE;
        this.f1421i.invalidate();
        mo1966a(i, 65536);
        return true;
    }

    /* renamed from: android.support.v4.widget.k$a */
    /* compiled from: ExploreByTouchHelper */
    private class C0570a extends C0429l {
        private C0570a() {
        }

        /* renamed from: a */
        public C0418g mo1454a(int i) {
            return C0568k.this.m3271d(i);
        }

        /* renamed from: a */
        public boolean mo1457a(int i, int i2, Bundle bundle) {
            return C0568k.this.m3266b(i, i2, bundle);
        }
    }
}
