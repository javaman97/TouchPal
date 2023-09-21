package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.C3529f;

public final class InvitationBuffer extends C3529f<Invitation> {
    public InvitationBuffer(C3525d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: getEntry */
    public Invitation mo10998a(int i, int i2) {
        return new C3572b(this.f15255S, i, i2);
    }

    /* access modifiers changed from: protected */
    public String getPrimaryDataMarkerColumn() {
        return "external_invitation_id";
    }
}
