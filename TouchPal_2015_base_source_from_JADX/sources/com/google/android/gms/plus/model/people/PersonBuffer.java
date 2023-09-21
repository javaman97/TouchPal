package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.C3524c;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.internal.C3737cc;
import com.google.android.gms.internal.C3758cn;

public final class PersonBuffer extends DataBuffer<Person> {

    /* renamed from: kp */
    private final C3524c<C3737cc> f16208kp;

    public PersonBuffer(C3525d dVar) {
        super(dVar);
        if (dVar.mo10992l() == null || !dVar.mo10992l().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)) {
            this.f16208kp = null;
        } else {
            this.f16208kp = new C3524c<>(dVar, C3737cc.CREATOR);
        }
    }

    public Person get(int i) {
        return this.f16208kp != null ? this.f16208kp.get(i) : new C3758cn(this.f15255S, i);
    }
}
