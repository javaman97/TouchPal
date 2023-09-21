package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

/* renamed from: com.google.android.gms.internal.cb */
public final class C3736cb extends C3523b implements Moment {

    /* renamed from: jD */
    private C3725bz f15721jD;

    public C3736cb(C3525d dVar, int i) {
        super(dVar, i);
    }

    /* renamed from: cb */
    private C3725bz m16387cb() {
        synchronized (this) {
            if (this.f15721jD == null) {
                byte[] byteArray = getByteArray("momentImpl");
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                this.f15721jD = C3725bz.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
        }
        return this.f15721jD;
    }

    /* renamed from: ca */
    public C3725bz freeze() {
        return m16387cb();
    }

    public String getId() {
        return m16387cb().getId();
    }

    public ItemScope getResult() {
        return m16387cb().getResult();
    }

    public String getStartDate() {
        return m16387cb().getStartDate();
    }

    public ItemScope getTarget() {
        return m16387cb().getTarget();
    }

    public String getType() {
        return m16387cb().getType();
    }

    public boolean hasId() {
        return m16387cb().hasId();
    }

    public boolean hasResult() {
        return m16387cb().hasId();
    }

    public boolean hasStartDate() {
        return m16387cb().hasStartDate();
    }

    public boolean hasTarget() {
        return m16387cb().hasTarget();
    }

    public boolean hasType() {
        return m16387cb().hasType();
    }
}
