package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.C3723bx;
import com.google.android.gms.internal.C3725bz;
import java.util.HashSet;
import java.util.Set;

public interface Moment extends Freezable<Moment> {

    public static class Builder {

        /* renamed from: iD */
        private final Set<Integer> f16202iD = new HashSet();

        /* renamed from: jB */
        private C3723bx f16203jB;

        /* renamed from: jC */
        private C3723bx f16204jC;

        /* renamed from: jh */
        private String f16205jh;

        /* renamed from: js */
        private String f16206js;

        /* renamed from: jy */
        private String f16207jy;

        public Moment build() {
            return new C3725bz(this.f16202iD, this.f16205jh, this.f16203jB, this.f16206js, this.f16204jC, this.f16207jy);
        }

        public Builder setId(String str) {
            this.f16205jh = str;
            this.f16202iD.add(2);
            return this;
        }

        public Builder setResult(ItemScope itemScope) {
            this.f16203jB = (C3723bx) itemScope;
            this.f16202iD.add(4);
            return this;
        }

        public Builder setStartDate(String str) {
            this.f16206js = str;
            this.f16202iD.add(5);
            return this;
        }

        public Builder setTarget(ItemScope itemScope) {
            this.f16204jC = (C3723bx) itemScope;
            this.f16202iD.add(6);
            return this;
        }

        public Builder setType(String str) {
            this.f16207jy = str;
            this.f16202iD.add(7);
            return this;
        }
    }

    String getId();

    ItemScope getResult();

    String getStartDate();

    ItemScope getTarget();

    String getType();

    boolean hasId();

    boolean hasResult();

    boolean hasStartDate();

    boolean hasTarget();

    boolean hasType();
}
