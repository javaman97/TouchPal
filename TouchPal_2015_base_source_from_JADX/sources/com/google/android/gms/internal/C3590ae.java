package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ae */
public abstract class C3590ae {

    /* renamed from: com.google.android.gms.internal.ae$a */
    public static class C3591a<I, O> implements SafeParcelable {
        public static final C3593af CREATOR = new C3593af();

        /* renamed from: ab */
        private final int f15451ab;

        /* renamed from: cA */
        protected final String f15452cA;

        /* renamed from: cB */
        private C3595ah f15453cB;
        /* access modifiers changed from: private */

        /* renamed from: cC */
        public C3592b<I, O> f15454cC;

        /* renamed from: ct */
        protected final int f15455ct;

        /* renamed from: cu */
        protected final boolean f15456cu;

        /* renamed from: cv */
        protected final int f15457cv;

        /* renamed from: cw */
        protected final boolean f15458cw;

        /* renamed from: cx */
        protected final String f15459cx;

        /* renamed from: cy */
        protected final int f15460cy;

        /* renamed from: cz */
        protected final Class<? extends C3590ae> f15461cz;

        C3591a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, C3809z zVar) {
            this.f15451ab = i;
            this.f15455ct = i2;
            this.f15456cu = z;
            this.f15457cv = i3;
            this.f15458cw = z2;
            this.f15459cx = str;
            this.f15460cy = i4;
            if (str2 == null) {
                this.f15461cz = null;
                this.f15452cA = null;
            } else {
                this.f15461cz = C3600ak.class;
                this.f15452cA = str2;
            }
            if (zVar == null) {
                this.f15454cC = null;
            } else {
                this.f15454cC = zVar.mo12443P();
            }
        }

        protected C3591a(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends C3590ae> cls, C3592b<I, O> bVar) {
            this.f15451ab = 1;
            this.f15455ct = i;
            this.f15456cu = z;
            this.f15457cv = i2;
            this.f15458cw = z2;
            this.f15459cx = str;
            this.f15460cy = i3;
            this.f15461cz = cls;
            if (cls == null) {
                this.f15452cA = null;
            } else {
                this.f15452cA = cls.getCanonicalName();
            }
            this.f15454cC = bVar;
        }

        /* renamed from: a */
        public static C3591a m15613a(String str, int i, C3592b<?, ?> bVar, boolean z) {
            return new C3591a(bVar.mo11384R(), z, bVar.mo11385S(), false, str, i, (Class<? extends C3590ae>) null, bVar);
        }

        /* renamed from: a */
        public static <T extends C3590ae> C3591a<T, T> m15614a(String str, int i, Class<T> cls) {
            return new C3591a<>(11, false, 11, false, str, i, cls, (C3592b) null);
        }

        /* renamed from: b */
        public static <T extends C3590ae> C3591a<ArrayList<T>, ArrayList<T>> m15615b(String str, int i, Class<T> cls) {
            return new C3591a<>(11, true, 11, true, str, i, cls, (C3592b) null);
        }

        /* renamed from: c */
        public static C3591a<Integer, Integer> m15616c(String str, int i) {
            return new C3591a<>(0, false, 0, false, str, i, (Class<? extends C3590ae>) null, (C3592b) null);
        }

        /* renamed from: d */
        public static C3591a<Double, Double> m15618d(String str, int i) {
            return new C3591a<>(4, false, 4, false, str, i, (Class<? extends C3590ae>) null, (C3592b) null);
        }

        /* renamed from: e */
        public static C3591a<Boolean, Boolean> m15619e(String str, int i) {
            return new C3591a<>(6, false, 6, false, str, i, (Class<? extends C3590ae>) null, (C3592b) null);
        }

        /* renamed from: f */
        public static C3591a<String, String> m15620f(String str, int i) {
            return new C3591a<>(7, false, 7, false, str, i, (Class<? extends C3590ae>) null, (C3592b) null);
        }

        /* renamed from: g */
        public static C3591a<ArrayList<String>, ArrayList<String>> m15621g(String str, int i) {
            return new C3591a<>(7, true, 7, true, str, i, (Class<? extends C3590ae>) null, (C3592b) null);
        }

        /* renamed from: R */
        public int mo11413R() {
            return this.f15455ct;
        }

        /* renamed from: S */
        public int mo11414S() {
            return this.f15457cv;
        }

        /* renamed from: W */
        public C3591a<I, O> mo11415W() {
            return new C3591a<>(this.f15451ab, this.f15455ct, this.f15456cu, this.f15457cv, this.f15458cw, this.f15459cx, this.f15460cy, this.f15452cA, mo11424ae());
        }

        /* renamed from: X */
        public boolean mo11416X() {
            return this.f15456cu;
        }

        /* renamed from: Y */
        public boolean mo11417Y() {
            return this.f15458cw;
        }

        /* renamed from: Z */
        public String mo11418Z() {
            return this.f15459cx;
        }

        /* renamed from: a */
        public void mo11419a(C3595ah ahVar) {
            this.f15453cB = ahVar;
        }

        /* renamed from: aa */
        public int mo11420aa() {
            return this.f15460cy;
        }

        /* renamed from: ab */
        public Class<? extends C3590ae> mo11421ab() {
            return this.f15461cz;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ac */
        public String mo11422ac() {
            if (this.f15452cA == null) {
                return null;
            }
            return this.f15452cA;
        }

        /* renamed from: ad */
        public boolean mo11423ad() {
            return this.f15454cC != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ae */
        public C3809z mo11424ae() {
            if (this.f15454cC == null) {
                return null;
            }
            return C3809z.m16700a(this.f15454cC);
        }

        /* renamed from: af */
        public HashMap<String, C3591a<?, ?>> mo11425af() {
            C3802s.m16678d(this.f15452cA);
            C3802s.m16678d(this.f15453cB);
            return this.f15453cB.mo11447q(this.f15452cA);
        }

        public int describeContents() {
            C3593af afVar = CREATOR;
            return 0;
        }

        /* renamed from: e */
        public I mo11427e(O o) {
            return this.f15454cC.mo11389e(o);
        }

        /* renamed from: i */
        public int mo11428i() {
            return this.f15451ab;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Field\n");
            sb.append("            versionCode=").append(this.f15451ab).append(10);
            sb.append("                 typeIn=").append(this.f15455ct).append(10);
            sb.append("            typeInArray=").append(this.f15456cu).append(10);
            sb.append("                typeOut=").append(this.f15457cv).append(10);
            sb.append("           typeOutArray=").append(this.f15458cw).append(10);
            sb.append("        outputFieldName=").append(this.f15459cx).append(10);
            sb.append("      safeParcelFieldId=").append(this.f15460cy).append(10);
            sb.append("       concreteTypeName=").append(mo11422ac()).append(10);
            if (mo11421ab() != null) {
                sb.append("     concreteType.class=").append(mo11421ab().getCanonicalName()).append(10);
            }
            sb.append("          converterName=").append(this.f15454cC == null ? "null" : this.f15454cC.getClass().getCanonicalName()).append(10);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3593af afVar = CREATOR;
            C3593af.m15640a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ae$b */
    public interface C3592b<I, O> {
        /* renamed from: R */
        int mo11384R();

        /* renamed from: S */
        int mo11385S();

        /* renamed from: e */
        I mo11389e(O o);
    }

    /* renamed from: a */
    private void m15601a(StringBuilder sb, C3591a aVar, Object obj) {
        if (aVar.mo11413R() == 11) {
            sb.append(((C3590ae) aVar.mo11421ab().cast(obj)).toString());
        } else if (aVar.mo11413R() == 7) {
            sb.append("\"");
            sb.append(C3606aq.m15695r((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    private void m15602a(StringBuilder sb, C3591a aVar, ArrayList<Object> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m15601a(sb, aVar, obj);
            }
        }
        sb.append("]");
    }

    /* renamed from: T */
    public abstract HashMap<String, C3591a<?, ?>> mo11402T();

    /* renamed from: U */
    public HashMap<String, Object> mo11403U() {
        return null;
    }

    /* renamed from: V */
    public HashMap<String, Object> mo11404V() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <O, I> I mo11405a(C3591a<I, O> aVar, Object obj) {
        return aVar.f15454cC != null ? aVar.mo11427e(obj) : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11406a(C3591a aVar) {
        return aVar.mo11414S() == 11 ? aVar.mo11417Y() ? mo11411p(aVar.mo11418Z()) : mo11410o(aVar.mo11418Z()) : mo11409n(aVar.mo11418Z());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo11407b(C3591a aVar) {
        boolean z = true;
        String Z = aVar.mo11418Z();
        if (aVar.mo11421ab() == null) {
            return mo11408m(aVar.mo11418Z());
        }
        if (mo11408m(aVar.mo11418Z()) != null) {
            z = false;
        }
        C3802s.m16673a(z, "Concrete field shouldn't be value object: " + aVar.mo11418Z());
        HashMap<String, Object> V = aVar.mo11417Y() ? mo11404V() : mo11403U();
        if (V != null) {
            return V.get(Z);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(Z.charAt(0)) + Z.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract Object mo11408m(String str);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo11409n(String str);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo11410o(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo11411p(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString() {
        HashMap<String, C3591a<?, ?>> T = mo11402T();
        StringBuilder sb = new StringBuilder(100);
        for (String next : T.keySet()) {
            C3591a aVar = T.get(next);
            if (mo11406a(aVar)) {
                Object a = mo11405a(aVar, mo11407b(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"").append(next).append("\":");
                if (a != null) {
                    switch (aVar.mo11414S()) {
                        case 8:
                            sb.append("\"").append(C3603an.m15691a((byte[]) a)).append("\"");
                            break;
                        case 9:
                            sb.append("\"").append(C3603an.m15692b((byte[]) a)).append("\"");
                            break;
                        case 10:
                            C3607ar.m15696a(sb, (HashMap) a);
                            break;
                        default:
                            if (!aVar.mo11416X()) {
                                m15601a(sb, aVar, a);
                                break;
                            } else {
                                m15602a(sb, aVar, (ArrayList<Object>) (ArrayList) a);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
