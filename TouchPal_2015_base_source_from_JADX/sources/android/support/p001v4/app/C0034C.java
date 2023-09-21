package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.view.C0510x;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.C */
/* compiled from: FragmentStatePagerAdapter */
public abstract class C0034C extends C0510x {
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentStatePagerAdapter";
    private C0036E mCurTransaction = null;
    private Fragment mCurrentPrimaryItem = null;
    private final C0173s mFragmentManager;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private ArrayList<Fragment.SavedState> mSavedState = new ArrayList<>();

    public abstract Fragment getItem(int i);

    public C0034C(C0173s sVar) {
        this.mFragmentManager = sVar;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.mFragments.size() > i && (fragment = this.mFragments.get(i)) != null) {
            return fragment;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.mo542a();
        }
        Fragment item = getItem(i);
        if (this.mSavedState.size() > i && (savedState = this.mSavedState.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mFragments.size() <= i) {
            this.mFragments.add((Object) null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.mFragments.set(i, item);
        this.mCurTransaction.mo35a(viewGroup.getId(), item);
        return item;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.mo542a();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add((Object) null);
        }
        this.mSavedState.set(i, this.mFragmentManager.mo543a(fragment));
        this.mFragments.set(i, (Object) null);
        this.mCurTransaction.mo37a(fragment);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.mCurrentPrimaryItem) {
            if (this.mCurrentPrimaryItem != null) {
                this.mCurrentPrimaryItem.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.mCurTransaction != null) {
            this.mCurTransaction.mo54i();
            this.mCurTransaction = null;
            this.mFragmentManager.mo557c();
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public Parcelable saveState() {
        Bundle bundle = null;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        }
        Bundle bundle2 = bundle;
        for (int i = 0; i < this.mFragments.size(); i++) {
            Fragment fragment = this.mFragments.get(i);
            if (fragment != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                this.mFragmentManager.mo548a(bundle2, "f" + i, fragment);
            }
        }
        return bundle2;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.mFragmentManager.mo545a(bundle, str);
                    if (a != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add((Object) null);
                        }
                        a.setMenuVisibility(false);
                        this.mFragments.set(parseInt, a);
                    } else {
                        Log.w(TAG, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
