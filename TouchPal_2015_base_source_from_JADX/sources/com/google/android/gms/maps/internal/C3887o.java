package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.maps.internal.o */
public final class C3887o {
    private C3887o() {
    }

    /* renamed from: a */
    public static void m16805a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(C3887o.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(C3887o.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
