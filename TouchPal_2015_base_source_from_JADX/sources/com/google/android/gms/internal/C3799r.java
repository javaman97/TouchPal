package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.r */
public final class C3799r {

    /* renamed from: com.google.android.gms.internal.r$a */
    public static final class C3801a {

        /* renamed from: bY */
        private final List<String> f15893bY;

        /* renamed from: bZ */
        private final Object f15894bZ;

        private C3801a(Object obj) {
            this.f15894bZ = C3802s.m16678d(obj);
            this.f15893bY = new ArrayList();
        }

        /* renamed from: a */
        public C3801a mo12413a(String str, Object obj) {
            this.f15893bY.add(((String) C3802s.m16678d(str)) + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder append = new StringBuilder(100).append(this.f15894bZ.getClass().getSimpleName()).append('{');
            int size = this.f15893bY.size();
            for (int i = 0; i < size; i++) {
                append.append(this.f15893bY.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append('}').toString();
        }
    }

    /* renamed from: a */
    public static boolean m16669a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static C3801a m16670c(Object obj) {
        return new C3801a(obj);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
