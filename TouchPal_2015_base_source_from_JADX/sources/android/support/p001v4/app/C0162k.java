package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: android.support.v4.app.k */
/* compiled from: BundleUtil */
class C0162k {
    C0162k() {
    }

    /* renamed from: a */
    public static Bundle[] m653a(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }
}
