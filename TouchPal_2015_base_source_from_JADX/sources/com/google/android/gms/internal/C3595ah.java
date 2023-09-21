package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3590ae;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ah */
public class C3595ah implements SafeParcelable {
    public static final C3598ai CREATOR = new C3598ai();

    /* renamed from: ab */
    private final int f15462ab;

    /* renamed from: cD */
    private final HashMap<String, HashMap<String, C3590ae.C3591a<?, ?>>> f15463cD;

    /* renamed from: cE */
    private final ArrayList<C3596a> f15464cE;

    /* renamed from: cF */
    private final String f15465cF;

    /* renamed from: com.google.android.gms.internal.ah$a */
    public static class C3596a implements SafeParcelable {
        public static final C3599aj CREATOR = new C3599aj();

        /* renamed from: cG */
        final ArrayList<C3597b> f15466cG;
        final String className;
        final int versionCode;

        C3596a(int i, String str, ArrayList<C3597b> arrayList) {
            this.versionCode = i;
            this.className = str;
            this.f15466cG = arrayList;
        }

        C3596a(String str, HashMap<String, C3590ae.C3591a<?, ?>> hashMap) {
            this.versionCode = 1;
            this.className = str;
            this.f15466cG = m15655a(hashMap);
        }

        /* renamed from: a */
        private static ArrayList<C3597b> m15655a(HashMap<String, C3590ae.C3591a<?, ?>> hashMap) {
            if (hashMap == null) {
                return null;
            }
            ArrayList<C3597b> arrayList = new ArrayList<>();
            for (String next : hashMap.keySet()) {
                arrayList.add(new C3597b(next, hashMap.get(next)));
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ak */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11450ak() {
            HashMap<String, C3590ae.C3591a<?, ?>> hashMap = new HashMap<>();
            int size = this.f15466cG.size();
            for (int i = 0; i < size; i++) {
                C3597b bVar = this.f15466cG.get(i);
                hashMap.put(bVar.f15467cH, bVar.f15468cI);
            }
            return hashMap;
        }

        public int describeContents() {
            C3599aj ajVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3599aj ajVar = CREATOR;
            C3599aj.m15660a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ah$b */
    public static class C3597b implements SafeParcelable {
        public static final C3594ag CREATOR = new C3594ag();

        /* renamed from: cH */
        final String f15467cH;

        /* renamed from: cI */
        final C3590ae.C3591a<?, ?> f15468cI;
        final int versionCode;

        C3597b(int i, String str, C3590ae.C3591a<?, ?> aVar) {
            this.versionCode = i;
            this.f15467cH = str;
            this.f15468cI = aVar;
        }

        C3597b(String str, C3590ae.C3591a<?, ?> aVar) {
            this.versionCode = 1;
            this.f15467cH = str;
            this.f15468cI = aVar;
        }

        public int describeContents() {
            C3594ag agVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3594ag agVar = CREATOR;
            C3594ag.m15643a(this, parcel, i);
        }
    }

    C3595ah(int i, ArrayList<C3596a> arrayList, String str) {
        this.f15462ab = i;
        this.f15464cE = null;
        this.f15463cD = m15646b(arrayList);
        this.f15465cF = (String) C3802s.m16678d(str);
        mo11440ag();
    }

    public C3595ah(Class<? extends C3590ae> cls) {
        this.f15462ab = 1;
        this.f15464cE = null;
        this.f15463cD = new HashMap<>();
        this.f15465cF = cls.getCanonicalName();
    }

    /* renamed from: b */
    private static HashMap<String, HashMap<String, C3590ae.C3591a<?, ?>>> m15646b(ArrayList<C3596a> arrayList) {
        HashMap<String, HashMap<String, C3590ae.C3591a<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3596a aVar = arrayList.get(i);
            hashMap.put(aVar.className, aVar.mo11450ak());
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo11439a(Class<? extends C3590ae> cls, HashMap<String, C3590ae.C3591a<?, ?>> hashMap) {
        this.f15463cD.put(cls.getCanonicalName(), hashMap);
    }

    /* renamed from: ag */
    public void mo11440ag() {
        for (String str : this.f15463cD.keySet()) {
            HashMap hashMap = this.f15463cD.get(str);
            for (String str2 : hashMap.keySet()) {
                ((C3590ae.C3591a) hashMap.get(str2)).mo11419a(this);
            }
        }
    }

    /* renamed from: ah */
    public void mo11441ah() {
        for (String next : this.f15463cD.keySet()) {
            HashMap hashMap = this.f15463cD.get(next);
            HashMap hashMap2 = new HashMap();
            for (String str : hashMap.keySet()) {
                hashMap2.put(str, ((C3590ae.C3591a) hashMap.get(str)).mo11415W());
            }
            this.f15463cD.put(next, hashMap2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public ArrayList<C3596a> mo11442ai() {
        ArrayList<C3596a> arrayList = new ArrayList<>();
        for (String next : this.f15463cD.keySet()) {
            arrayList.add(new C3596a(next, this.f15463cD.get(next)));
        }
        return arrayList;
    }

    /* renamed from: aj */
    public String mo11443aj() {
        return this.f15465cF;
    }

    /* renamed from: b */
    public boolean mo11444b(Class<? extends C3590ae> cls) {
        return this.f15463cD.containsKey(cls.getCanonicalName());
    }

    public int describeContents() {
        C3598ai aiVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo11446i() {
        return this.f15462ab;
    }

    /* renamed from: q */
    public HashMap<String, C3590ae.C3591a<?, ?>> mo11447q(String str) {
        return this.f15463cD.get(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f15463cD.keySet()) {
            sb.append(next).append(":\n");
            HashMap hashMap = this.f15463cD.get(next);
            for (String str : hashMap.keySet()) {
                sb.append("  ").append(str).append(": ");
                sb.append(hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3598ai aiVar = CREATOR;
        C3598ai.m15657a(this, parcel, i);
    }
}
