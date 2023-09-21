package android.support.p001v4.p013h;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.h.e */
/* compiled from: ParcelableCompatHoneycombMR2 */
class C0267e<T> implements Parcelable.ClassLoaderCreator<T> {

    /* renamed from: a */
    private final C0266d<T> f651a;

    public C0267e(C0266d<T> dVar) {
        this.f651a = dVar;
    }

    /* renamed from: a */
    public T mo799a(Parcel parcel) {
        return this.f651a.mo797a(parcel, (ClassLoader) null);
    }

    /* renamed from: a */
    public T mo800a(Parcel parcel, ClassLoader classLoader) {
        return this.f651a.mo797a(parcel, classLoader);
    }

    /* renamed from: a */
    public T[] mo801a(int i) {
        return this.f651a.mo798a(i);
    }
}
