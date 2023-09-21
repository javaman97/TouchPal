package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.app.FragmentState */
/* compiled from: Fragment */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0033B();

    /* renamed from: a */
    final String f43a;

    /* renamed from: b */
    final int f44b;

    /* renamed from: c */
    final boolean f45c;

    /* renamed from: d */
    final int f46d;

    /* renamed from: e */
    final int f47e;

    /* renamed from: f */
    final String f48f;

    /* renamed from: g */
    final boolean f49g;

    /* renamed from: h */
    final boolean f50h;

    /* renamed from: i */
    final Bundle f51i;

    /* renamed from: j */
    Bundle f52j;

    /* renamed from: k */
    Fragment f53k;

    public FragmentState(Fragment fragment) {
        this.f43a = fragment.getClass().getName();
        this.f44b = fragment.mIndex;
        this.f45c = fragment.mFromLayout;
        this.f46d = fragment.mFragmentId;
        this.f47e = fragment.mContainerId;
        this.f48f = fragment.mTag;
        this.f49g = fragment.mRetainInstance;
        this.f50h = fragment.mDetached;
        this.f51i = fragment.mArguments;
    }

    public FragmentState(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f43a = parcel.readString();
        this.f44b = parcel.readInt();
        this.f45c = parcel.readInt() != 0;
        this.f46d = parcel.readInt();
        this.f47e = parcel.readInt();
        this.f48f = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f49g = z;
        this.f50h = parcel.readInt() == 0 ? false : z2;
        this.f51i = parcel.readBundle();
        this.f52j = parcel.readBundle();
    }

    /* renamed from: a */
    public Fragment mo160a(C0167o oVar, Fragment fragment) {
        if (this.f53k != null) {
            return this.f53k;
        }
        if (this.f51i != null) {
            this.f51i.setClassLoader(oVar.getClassLoader());
        }
        this.f53k = Fragment.instantiate(oVar, this.f43a, this.f51i);
        if (this.f52j != null) {
            this.f52j.setClassLoader(oVar.getClassLoader());
            this.f53k.mSavedFragmentState = this.f52j;
        }
        this.f53k.setIndex(this.f44b, fragment);
        this.f53k.mFromLayout = this.f45c;
        this.f53k.mRestored = true;
        this.f53k.mFragmentId = this.f46d;
        this.f53k.mContainerId = this.f47e;
        this.f53k.mTag = this.f48f;
        this.f53k.mRetainInstance = this.f49g;
        this.f53k.mDetached = this.f50h;
        this.f53k.mFragmentManager = oVar.mFragments;
        if (C0176t.f445b) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f53k);
        }
        return this.f53k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeString(this.f43a);
        parcel.writeInt(this.f44b);
        parcel.writeInt(this.f45c ? 1 : 0);
        parcel.writeInt(this.f46d);
        parcel.writeInt(this.f47e);
        parcel.writeString(this.f48f);
        if (this.f49g) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (!this.f50h) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeBundle(this.f51i);
        parcel.writeBundle(this.f52j);
    }
}
