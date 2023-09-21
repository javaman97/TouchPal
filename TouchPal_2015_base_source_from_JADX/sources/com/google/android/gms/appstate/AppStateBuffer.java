package com.google.android.gms.appstate;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.DataBuffer;

public final class AppStateBuffer extends DataBuffer<AppState> {
    public AppStateBuffer(C3525d dVar) {
        super(dVar);
    }

    public AppState get(int i) {
        return new C3520b(this.f15255S, i);
    }
}
