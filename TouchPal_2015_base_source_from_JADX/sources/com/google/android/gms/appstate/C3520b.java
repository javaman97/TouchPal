package com.google.android.gms.appstate;

import com.cootek.smartinput5.p046b.C1132b;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;

/* renamed from: com.google.android.gms.appstate.b */
public final class C3520b extends C3523b implements AppState {
    C3520b(C3525d dVar, int i) {
        super(dVar, i);
    }

    /* renamed from: a */
    public AppState freeze() {
        return new C3519a(this);
    }

    public boolean equals(Object obj) {
        return C3519a.m15319a(this, obj);
    }

    public byte[] getConflictData() {
        return getByteArray("conflict_data");
    }

    public String getConflictVersion() {
        return getString("conflict_version");
    }

    public int getKey() {
        return getInteger(C1132b.f3175g);
    }

    public byte[] getLocalData() {
        return getByteArray("local_data");
    }

    public String getLocalVersion() {
        return getString("local_version");
    }

    public boolean hasConflict() {
        return !mo10966e("conflict_version");
    }

    public int hashCode() {
        return C3519a.m15318a(this);
    }

    public String toString() {
        return C3519a.m15320b(this);
    }
}
