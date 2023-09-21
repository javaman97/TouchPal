package android.support.p001v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000a.C0017r;
import android.support.p001v4.p016k.C0303f;
import android.support.p001v4.p016k.C0317l;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.Fragment */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 5;
    static final int STARTED = 4;
    static final int STOPPED = 3;
    private static final C0317l<String, Class<?>> sClassMap = new C0317l<>();
    C0167o mActivity;
    boolean mAdded;
    View mAnimatingAway;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    C0176t mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    C0176t mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    C0050K mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible = true;
    int mNextAnim;
    Fragment mParentFragment;
    boolean mRemoving;
    boolean mRestored;
    boolean mResumed;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    SparseArray<Parcelable> mSavedViewState;
    int mState = 0;
    int mStateAfterAnimating;
    String mTag;
    Fragment mTarget;
    int mTargetIndex = -1;
    int mTargetRequestCode;
    boolean mUserVisibleHint = true;
    View mView;
    String mWho;

    /* renamed from: android.support.v4.app.Fragment$SavedState */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0166n();

        /* renamed from: a */
        final Bundle f39a;

        SavedState(Bundle bundle) {
            this.f39a = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f39a = parcel.readBundle();
            if (classLoader != null && this.f39a != null) {
                this.f39a.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f39a);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    public static class C0041a extends RuntimeException {
        public C0041a(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mArguments = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new C0041a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0041a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0041a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        }
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class<?> cls = sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        if (this.mSavedViewState != null) {
            this.mInnerView.restoreHierarchyState(this.mSavedViewState);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* access modifiers changed from: package-private */
    public final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            this.mWho = fragment.mWho + ":" + this.mIndex;
        } else {
            this.mWho = "android:fragment:" + this.mIndex;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0303f.m1215a(this, sb);
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.mArguments = bundle;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public void setInitialSavedState(SavedState savedState) {
        if (this.mIndex >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.mSavedFragmentState = (savedState == null || savedState.f39a == null) ? null : savedState.f39a;
    }

    public void setTargetFragment(Fragment fragment, int i) {
        this.mTarget = fragment;
        this.mTargetRequestCode = i;
    }

    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final C0167o getActivity() {
        return this.mActivity;
    }

    public final Resources getResources() {
        if (this.mActivity != null) {
            return this.mActivity.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final C0173s getFragmentManager() {
        return this.mFragmentManager;
    }

    public final C0173s getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            if (this.mState >= 5) {
                this.mChildFragmentManager.mo604r();
            } else if (this.mState >= 4) {
                this.mChildFragmentManager.mo603q();
            } else if (this.mState >= 2) {
                this.mChildFragmentManager.mo602p();
            } else if (this.mState >= 1) {
                this.mChildFragmentManager.mo601o();
            }
        }
        return this.mChildFragmentManager;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean isAdded() {
        return this.mActivity != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mResumed;
    }

    public final boolean isVisible() {
        return isAdded() && !isHidden() && this.mView != null && this.mView.getWindowToken() != null && this.mView.getVisibility() == 0;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void setRetainInstance(boolean z) {
        if (!z || this.mParentFragment == null) {
            this.mRetainInstance = z;
            return;
        }
        throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mActivity.supportInvalidateOptionsMenu();
            }
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mActivity.supportInvalidateOptionsMenu();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 4) {
            this.mFragmentManager.mo581b(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = !z;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public C0048J getLoaderManager() {
        if (this.mLoaderManager != null) {
            return this.mLoaderManager;
        }
        if (this.mActivity == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.mCheckedForLoaderManager = true;
        this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, true);
        return this.mLoaderManager;
    }

    public void startActivity(Intent intent) {
        if (this.mActivity == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.mActivity.startActivityFromFragment(this, intent, -1);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (this.mActivity == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.mActivity.startActivityFromFragment(this, intent, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        return this.mActivity.getLayoutInflater();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, @C0017r ViewGroup viewGroup, @C0017r Bundle bundle) {
        return null;
    }

    public void onViewCreated(View view, @C0017r Bundle bundle) {
    }

    @C0017r
    public View getView() {
        return this.mView;
    }

    public void onActivityCreated(@C0017r Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(@C0017r Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
        if (!this.mLoadersStarted) {
            this.mLoadersStarted = true;
            if (!this.mCheckedForLoaderManager) {
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, false);
            }
            if (this.mLoaderManager != null) {
                this.mLoaderManager.mo199b();
            }
        }
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
        if (!this.mCheckedForLoaderManager) {
            this.mCheckedForLoaderManager = true;
            this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, false);
        }
        if (this.mLoaderManager != null) {
            this.mLoaderManager.mo205h();
        }
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mResumed = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mActivity = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
        this.mLoaderManager = null;
        this.mLoadersStarted = false;
        this.mCheckedForLoaderManager = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onDestroyOptionsMenu() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mActivity != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.mActivity);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (this.mNextAnim != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.mNextAnim);
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (this.mAnimatingAway != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.mAnimatingAway);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.mStateAfterAnimating);
        }
        if (this.mLoaderManager != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.mLoaderManager.mo190a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.mChildFragmentManager + ":");
            this.mChildFragmentManager.mo551a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        if (this.mChildFragmentManager != null) {
            return this.mChildFragmentManager.mo580b(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void instantiateChildFragmentManager() {
        this.mChildFragmentManager = new C0176t();
        this.mChildFragmentManager.mo574a(this.mActivity, (C0172r) new C0165m(this), this);
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        Parcelable parcelable;
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo600n();
        }
        this.mCalled = false;
        onCreate(bundle);
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onCreate()");
        } else if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.mChildFragmentManager == null) {
                instantiateChildFragmentManager();
            }
            this.mChildFragmentManager.mo570a(parcelable, (ArrayList<Fragment>) null);
            this.mChildFragmentManager.mo601o();
        }
    }

    /* access modifiers changed from: package-private */
    public View performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo600n();
        }
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo600n();
        }
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo602p();
        }
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo600n();
            this.mChildFragmentManager.mo596j();
        }
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo603q();
        }
        if (this.mLoaderManager != null) {
            this.mLoaderManager.mo204g();
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo600n();
            this.mChildFragmentManager.mo596j();
        }
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo604r();
            this.mChildFragmentManager.mo596j();
        }
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo569a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo611x();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        if (this.mChildFragmentManager != null) {
            return z | this.mChildFragmentManager.mo578a(menu, menuInflater);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        if (this.mChildFragmentManager != null) {
            return z | this.mChildFragmentManager.mo577a(menu);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager == null || !this.mChildFragmentManager.mo579a(menuItem)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager == null || !this.mChildFragmentManager.mo585b(menuItem)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.mo584b(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        Parcelable m;
        onSaveInstanceState(bundle);
        if (this.mChildFragmentManager != null && (m = this.mChildFragmentManager.mo599m()) != null) {
            bundle.putParcelable("android:support:fragments", m);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo605s();
        }
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo606t();
        }
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performReallyStop() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo608u();
        }
        if (this.mLoadersStarted) {
            this.mLoadersStarted = false;
            if (!this.mCheckedForLoaderManager) {
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, false);
            }
            if (this.mLoaderManager == null) {
                return;
            }
            if (!this.mActivity.mRetaining) {
                this.mLoaderManager.mo200c();
            } else {
                this.mLoaderManager.mo201d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo609v();
        }
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.mLoaderManager != null) {
            this.mLoaderManager.mo203f();
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo610w();
        }
        this.mCalled = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C0141am("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
