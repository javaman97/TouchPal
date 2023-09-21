package android.support.p001v4.app;

import android.os.Parcelable;
import android.support.p001v4.view.C0510x;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.A */
/* compiled from: FragmentPagerAdapter */
public abstract class C0032A extends C0510x {

    /* renamed from: a */
    private static final String f13a = "FragmentPagerAdapter";

    /* renamed from: b */
    private static final boolean f14b = false;

    /* renamed from: c */
    private final C0173s f15c;

    /* renamed from: d */
    private C0036E f16d = null;

    /* renamed from: e */
    private Fragment f17e = null;

    /* renamed from: a */
    public abstract Fragment mo10a(int i);

    public C0032A(C0173s sVar) {
        this.f15c = sVar;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f16d == null) {
            this.f16d = this.f15c.mo542a();
        }
        long b = mo11b(i);
        Fragment a = this.f15c.mo546a(m37a(viewGroup.getId(), b));
        if (a != null) {
            this.f16d.mo50e(a);
        } else {
            a = mo10a(i);
            this.f16d.mo36a(viewGroup.getId(), a, m37a(viewGroup.getId(), b));
        }
        if (a != this.f17e) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f16d == null) {
            this.f16d = this.f15c.mo542a();
        }
        this.f16d.mo49d((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f17e) {
            if (this.f17e != null) {
                this.f17e.setMenuVisibility(false);
                this.f17e.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f17e = fragment;
        }
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f16d != null) {
            this.f16d.mo54i();
            this.f16d = null;
            this.f15c.mo557c();
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public Parcelable saveState() {
        return null;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public long mo11b(int i) {
        return (long) i;
    }

    /* renamed from: a */
    private static String m37a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
