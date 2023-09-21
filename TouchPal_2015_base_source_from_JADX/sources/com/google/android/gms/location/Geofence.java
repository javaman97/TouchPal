package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.C3686bi;

public interface Geofence {
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {

        /* renamed from: fA */
        private float f15920fA;

        /* renamed from: fu */
        private String f15921fu = null;

        /* renamed from: fv */
        private int f15922fv = 0;

        /* renamed from: fw */
        private long f15923fw = Long.MIN_VALUE;

        /* renamed from: fx */
        private short f15924fx = -1;

        /* renamed from: fy */
        private double f15925fy;

        /* renamed from: fz */
        private double f15926fz;

        public Geofence build() {
            if (this.f15921fu == null) {
                throw new IllegalArgumentException("Request ID not set.");
            } else if (this.f15922fv == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if (this.f15923fw == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            } else if (this.f15924fx != -1) {
                return new C3686bi(this.f15921fu, this.f15922fv, 1, this.f15925fy, this.f15926fz, this.f15920fA, this.f15923fw);
            } else {
                throw new IllegalArgumentException("Geofence region not set.");
            }
        }

        public Builder setCircularRegion(double d, double d2, float f) {
            this.f15924fx = 1;
            this.f15925fy = d;
            this.f15926fz = d2;
            this.f15920fA = f;
            return this;
        }

        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.f15923fw = -1;
            } else {
                this.f15923fw = SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        public Builder setRequestId(String str) {
            this.f15921fu = str;
            return this;
        }

        public Builder setTransitionTypes(int i) {
            this.f15922fv = i;
            return this;
        }
    }

    String getRequestId();
}
