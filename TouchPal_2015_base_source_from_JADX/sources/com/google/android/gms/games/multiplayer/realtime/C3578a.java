package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.C3529f;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.a */
public final class C3578a extends C3529f<Room> {
    public C3578a(C3525d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Room mo10998a(int i, int i2) {
        return new C3580c(this.f15255S, i, i2);
    }

    /* access modifiers changed from: protected */
    public String getPrimaryDataMarkerColumn() {
        return "external_match_id";
    }
}
