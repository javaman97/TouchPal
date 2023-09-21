package android.support.p001v4.p013h;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.h.c */
/* compiled from: ParcelableCompat */
public class C0264c {
    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m1052a(C0266d<T> dVar) {
        if (Build.VERSION.SDK_INT >= 13) {
            C0268f.m1058a(dVar);
        }
        return new C0265a(dVar);
    }

    /* renamed from: android.support.v4.h.c$a */
    /* compiled from: ParcelableCompat */
    static class C0265a<T> implements Parcelable.Creator<T> {

        /* renamed from: a */
        final C0266d<T> f650a;

        public C0265a(C0266d<T> dVar) {
            this.f650a = dVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f650a.mo797a(parcel, (ClassLoader) null);
        }

        public T[] newArray(int i) {
            return this.f650a.mo798a(i);
        }
    }
}
