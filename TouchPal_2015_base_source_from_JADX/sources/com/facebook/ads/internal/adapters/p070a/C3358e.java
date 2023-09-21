package com.facebook.ads.internal.adapters.p070a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.C3505t;

/* renamed from: com.facebook.ads.internal.adapters.a.e */
public interface C3358e {

    /* renamed from: com.facebook.ads.internal.adapters.a.e$a */
    public interface C3360a {
        /* renamed from: a */
        void mo10612a(View view);

        /* renamed from: a */
        void mo10613a(String str);
    }

    /* renamed from: com.facebook.ads.internal.adapters.a.e$b */
    public enum C3361b {
        DISPLAY;

        /* renamed from: a */
        public static C3358e m14792a(C3361b bVar, C3505t tVar, C3360a aVar) {
            switch (bVar) {
                case DISPLAY:
                    return new C3354a(tVar, aVar);
                default:
                    return null;
            }
        }
    }

    /* renamed from: a */
    void mo10603a();

    /* renamed from: a */
    void mo10604a(Intent intent, Bundle bundle);

    /* renamed from: a */
    void mo10605a(Bundle bundle);

    /* renamed from: b */
    void mo10606b();

    /* renamed from: c */
    void mo10607c();
}
