package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3590ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ak */
public class C3600ak extends C3590ae implements SafeParcelable {
    public static final C3601al CREATOR = new C3601al();

    /* renamed from: ab */
    private final int f15469ab;

    /* renamed from: cB */
    private final C3595ah f15470cB;

    /* renamed from: cJ */
    private final Parcel f15471cJ;

    /* renamed from: cK */
    private final int f15472cK;

    /* renamed from: cL */
    private int f15473cL;

    /* renamed from: cM */
    private int f15474cM;
    private final String mClassName;

    C3600ak(int i, Parcel parcel, C3595ah ahVar) {
        this.f15469ab = i;
        this.f15471cJ = (Parcel) C3802s.m16678d(parcel);
        this.f15472cK = 2;
        this.f15470cB = ahVar;
        if (this.f15470cB == null) {
            this.mClassName = null;
        } else {
            this.mClassName = this.f15470cB.mo11443aj();
        }
        this.f15473cL = 2;
    }

    private C3600ak(SafeParcelable safeParcelable, C3595ah ahVar, String str) {
        this.f15469ab = 1;
        this.f15471cJ = Parcel.obtain();
        safeParcelable.writeToParcel(this.f15471cJ, 0);
        this.f15472cK = 1;
        this.f15470cB = (C3595ah) C3802s.m16678d(ahVar);
        this.mClassName = (String) C3802s.m16678d(str);
        this.f15473cL = 2;
    }

    /* renamed from: a */
    public static <T extends C3590ae & SafeParcelable> C3600ak m15663a(T t) {
        String canonicalName = t.getClass().getCanonicalName();
        return new C3600ak((SafeParcelable) t, m15670b((C3590ae) t), canonicalName);
    }

    /* renamed from: a */
    public static HashMap<String, String> m15664a(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m15665a(C3595ah ahVar, C3590ae aeVar) {
        Class<?> cls = aeVar.getClass();
        if (!ahVar.mo11444b((Class<? extends C3590ae>) cls)) {
            HashMap<String, C3590ae.C3591a<?, ?>> T = aeVar.mo11402T();
            ahVar.mo11439a(cls, aeVar.mo11402T());
            for (String str : T.keySet()) {
                C3590ae.C3591a aVar = T.get(str);
                Class<? extends C3590ae> ab = aVar.mo11421ab();
                if (ab != null) {
                    try {
                        m15665a(ahVar, (C3590ae) ab.newInstance());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException("Could not instantiate an object of type " + aVar.mo11421ab().getCanonicalName(), e);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException("Could not access object of type " + aVar.mo11421ab().getCanonicalName(), e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m15666a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"").append(C3606aq.m15695r(obj.toString())).append("\"");
                return;
            case 8:
                sb.append("\"").append(C3603an.m15691a((byte[]) obj)).append("\"");
                return;
            case 9:
                sb.append("\"").append(C3603an.m15692b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C3607ar.m15696a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    /* renamed from: a */
    private void m15667a(StringBuilder sb, C3590ae.C3591a<?, ?> aVar, Parcel parcel, int i) {
        switch (aVar.mo11414S()) {
            case 0:
                m15673b(sb, aVar, (Object) mo11405a(aVar, Integer.valueOf(C3538a.m15427f(parcel, i))));
                return;
            case 1:
                m15673b(sb, aVar, (Object) mo11405a(aVar, C3538a.m15429h(parcel, i)));
                return;
            case 2:
                m15673b(sb, aVar, (Object) mo11405a(aVar, Long.valueOf(C3538a.m15428g(parcel, i))));
                return;
            case 3:
                m15673b(sb, aVar, (Object) mo11405a(aVar, Float.valueOf(C3538a.m15430i(parcel, i))));
                return;
            case 4:
                m15673b(sb, aVar, (Object) mo11405a(aVar, Double.valueOf(C3538a.m15431j(parcel, i))));
                return;
            case 5:
                m15673b(sb, aVar, (Object) mo11405a(aVar, C3538a.m15432k(parcel, i)));
                return;
            case 6:
                m15673b(sb, aVar, (Object) mo11405a(aVar, Boolean.valueOf(C3538a.m15424c(parcel, i))));
                return;
            case 7:
                m15673b(sb, aVar, (Object) mo11405a(aVar, C3538a.m15433l(parcel, i)));
                return;
            case 8:
            case 9:
                m15673b(sb, aVar, (Object) mo11405a(aVar, C3538a.m15437o(parcel, i)));
                return;
            case 10:
                m15673b(sb, aVar, (Object) mo11405a(aVar, m15664a(C3538a.m15436n(parcel, i))));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + aVar.mo11414S());
        }
    }

    /* renamed from: a */
    private void m15668a(StringBuilder sb, String str, C3590ae.C3591a<?, ?> aVar, Parcel parcel, int i) {
        sb.append("\"").append(str).append("\":");
        if (aVar.mo11423ad()) {
            m15667a(sb, aVar, parcel, i);
        } else {
            m15672b(sb, aVar, parcel, i);
        }
    }

    /* renamed from: a */
    private void m15669a(StringBuilder sb, HashMap<String, C3590ae.C3591a<?, ?>> hashMap, Parcel parcel) {
        HashMap<Integer, Map.Entry<String, C3590ae.C3591a<?, ?>>> b = m15671b(hashMap);
        sb.append('{');
        int c = C3538a.m15422c(parcel);
        boolean z = false;
        while (parcel.dataPosition() < c) {
            int b2 = C3538a.m15419b(parcel);
            Map.Entry entry = b.get(Integer.valueOf(C3538a.m15434m(b2)));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                m15668a(sb, (String) entry.getKey(), (C3590ae.C3591a) entry.getValue(), parcel, b2);
                z = true;
            }
        }
        if (parcel.dataPosition() != c) {
            throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
        }
        sb.append('}');
    }

    /* renamed from: b */
    private static C3595ah m15670b(C3590ae aeVar) {
        C3595ah ahVar = new C3595ah(aeVar.getClass());
        m15665a(ahVar, aeVar);
        ahVar.mo11441ah();
        ahVar.mo11440ag();
        return ahVar;
    }

    /* renamed from: b */
    private static HashMap<Integer, Map.Entry<String, C3590ae.C3591a<?, ?>>> m15671b(HashMap<String, C3590ae.C3591a<?, ?>> hashMap) {
        HashMap<Integer, Map.Entry<String, C3590ae.C3591a<?, ?>>> hashMap2 = new HashMap<>();
        for (Map.Entry next : hashMap.entrySet()) {
            hashMap2.put(Integer.valueOf(((C3590ae.C3591a) next.getValue()).mo11420aa()), next);
        }
        return hashMap2;
    }

    /* renamed from: b */
    private void m15672b(StringBuilder sb, C3590ae.C3591a<?, ?> aVar, Parcel parcel, int i) {
        if (aVar.mo11417Y()) {
            sb.append("[");
            switch (aVar.mo11414S()) {
                case 0:
                    C3602am.m15686a(sb, C3538a.m15439q(parcel, i));
                    break;
                case 1:
                    C3602am.m15688a(sb, (T[]) C3538a.m15441s(parcel, i));
                    break;
                case 2:
                    C3602am.m15687a(sb, C3538a.m15440r(parcel, i));
                    break;
                case 3:
                    C3602am.m15685a(sb, C3538a.m15442t(parcel, i));
                    break;
                case 4:
                    C3602am.m15684a(sb, C3538a.m15443u(parcel, i));
                    break;
                case 5:
                    C3602am.m15688a(sb, (T[]) C3538a.m15444v(parcel, i));
                    break;
                case 6:
                    C3602am.m15690a(sb, C3538a.m15438p(parcel, i));
                    break;
                case 7:
                    C3602am.m15689a(sb, C3538a.m15445w(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] z = C3538a.m15448z(parcel, i);
                    int length = z.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            sb.append(",");
                        }
                        z[i2].setDataPosition(0);
                        m15669a(sb, aVar.mo11425af(), z[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            sb.append("]");
            return;
        }
        switch (aVar.mo11414S()) {
            case 0:
                sb.append(C3538a.m15427f(parcel, i));
                return;
            case 1:
                sb.append(C3538a.m15429h(parcel, i));
                return;
            case 2:
                sb.append(C3538a.m15428g(parcel, i));
                return;
            case 3:
                sb.append(C3538a.m15430i(parcel, i));
                return;
            case 4:
                sb.append(C3538a.m15431j(parcel, i));
                return;
            case 5:
                sb.append(C3538a.m15432k(parcel, i));
                return;
            case 6:
                sb.append(C3538a.m15424c(parcel, i));
                return;
            case 7:
                sb.append("\"").append(C3606aq.m15695r(C3538a.m15433l(parcel, i))).append("\"");
                return;
            case 8:
                sb.append("\"").append(C3603an.m15691a(C3538a.m15437o(parcel, i))).append("\"");
                return;
            case 9:
                sb.append("\"").append(C3603an.m15692b(C3538a.m15437o(parcel, i)));
                sb.append("\"");
                return;
            case 10:
                Bundle n = C3538a.m15436n(parcel, i);
                Set<String> keySet = n.keySet();
                keySet.size();
                sb.append("{");
                boolean z2 = true;
                for (String str : keySet) {
                    if (!z2) {
                        sb.append(",");
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(C3606aq.m15695r(n.getString(str))).append("\"");
                    z2 = false;
                }
                sb.append("}");
                return;
            case 11:
                Parcel y = C3538a.m15447y(parcel, i);
                y.setDataPosition(0);
                m15669a(sb, aVar.mo11425af(), y);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    /* renamed from: b */
    private void m15673b(StringBuilder sb, C3590ae.C3591a<?, ?> aVar, Object obj) {
        if (aVar.mo11416X()) {
            m15674b(sb, aVar, (ArrayList<?>) (ArrayList) obj);
        } else {
            m15666a(sb, aVar.mo11413R(), obj);
        }
    }

    /* renamed from: b */
    private void m15674b(StringBuilder sb, C3590ae.C3591a<?, ?> aVar, ArrayList<?> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            m15666a(sb, aVar.mo11413R(), (Object) arrayList.get(i));
        }
        sb.append("]");
    }

    /* renamed from: T */
    public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
        if (this.f15470cB == null) {
            return null;
        }
        return this.f15470cB.mo11447q(this.mClassName);
    }

    /* renamed from: al */
    public Parcel mo11463al() {
        switch (this.f15473cL) {
            case 0:
                this.f15474cM = C3540b.m15472d(this.f15471cJ);
                C3540b.m15451C(this.f15471cJ, this.f15474cM);
                this.f15473cL = 2;
                break;
            case 1:
                C3540b.m15451C(this.f15471cJ, this.f15474cM);
                this.f15473cL = 2;
                break;
        }
        return this.f15471cJ;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: am */
    public C3595ah mo11464am() {
        switch (this.f15472cK) {
            case 0:
                return null;
            case 1:
                return this.f15470cB;
            case 2:
                return this.f15470cB;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f15472cK);
        }
    }

    public int describeContents() {
        C3601al alVar = CREATOR;
        return 0;
    }

    /* renamed from: i */
    public int mo11466i() {
        return this.f15469ab;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object mo11408m(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo11409n(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        C3802s.m16675b(this.f15470cB, (Object) "Cannot convert to JSON on client side.");
        Parcel al = mo11463al();
        al.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m15669a(sb, this.f15470cB.mo11447q(this.mClassName), al);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3601al alVar = CREATOR;
        C3601al.m15681a(this, parcel, i);
    }
}
