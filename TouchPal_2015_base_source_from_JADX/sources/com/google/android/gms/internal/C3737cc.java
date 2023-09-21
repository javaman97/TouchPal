package com.google.android.gms.internal;

import android.os.Parcel;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.p048d.C1246d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3590ae;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cc */
public final class C3737cc extends C3590ae implements SafeParcelable, Person {
    public static final C3748cd CREATOR = new C3748cd();

    /* renamed from: iC */
    private static final HashMap<String, C3590ae.C3591a<?, ?>> f15722iC = new HashMap<>();

    /* renamed from: ab */
    private final int f15723ab;

    /* renamed from: cl */
    private String f15724cl;

    /* renamed from: iD */
    private final Set<Integer> f15725iD;

    /* renamed from: ie */
    private String f15726ie;

    /* renamed from: jE */
    private String f15727jE;

    /* renamed from: jF */
    private C3738a f15728jF;

    /* renamed from: jG */
    private String f15729jG;

    /* renamed from: jH */
    private String f15730jH;

    /* renamed from: jI */
    private int f15731jI;

    /* renamed from: jJ */
    private C3739b f15732jJ;

    /* renamed from: jK */
    private String f15733jK;

    /* renamed from: jL */
    private int f15734jL;

    /* renamed from: jM */
    private C3742c f15735jM;

    /* renamed from: jN */
    private boolean f15736jN;

    /* renamed from: jO */
    private String f15737jO;

    /* renamed from: jP */
    private C3743d f15738jP;

    /* renamed from: jQ */
    private String f15739jQ;

    /* renamed from: jR */
    private int f15740jR;

    /* renamed from: jS */
    private List<C3745f> f15741jS;

    /* renamed from: jT */
    private List<C3746g> f15742jT;

    /* renamed from: jU */
    private int f15743jU;

    /* renamed from: jV */
    private int f15744jV;

    /* renamed from: jW */
    private String f15745jW;

    /* renamed from: jX */
    private List<C3747h> f15746jX;

    /* renamed from: jY */
    private boolean f15747jY;

    /* renamed from: jh */
    private String f15748jh;

    /* renamed from: com.google.android.gms.internal.cc$a */
    public static final class C3738a extends C3590ae implements SafeParcelable, Person.AgeRange {
        public static final C3749ce CREATOR = new C3749ce();

        /* renamed from: iC */
        private static final HashMap<String, C3590ae.C3591a<?, ?>> f15749iC = new HashMap<>();

        /* renamed from: ab */
        private final int f15750ab;

        /* renamed from: iD */
        private final Set<Integer> f15751iD;

        /* renamed from: jZ */
        private int f15752jZ;

        /* renamed from: ka */
        private int f15753ka;

        static {
            f15749iC.put("max", C3590ae.C3591a.m15616c("max", 2));
            f15749iC.put("min", C3590ae.C3591a.m15616c("min", 3));
        }

        public C3738a() {
            this.f15750ab = 1;
            this.f15751iD = new HashSet();
        }

        C3738a(Set<Integer> set, int i, int i2, int i3) {
            this.f15751iD = set;
            this.f15750ab = i;
            this.f15752jZ = i2;
            this.f15753ka = i3;
        }

        /* renamed from: T */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
            return f15749iC;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo11406a(C3590ae.C3591a aVar) {
            return this.f15751iD.contains(Integer.valueOf(aVar.mo11420aa()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11407b(C3590ae.C3591a aVar) {
            switch (aVar.mo11420aa()) {
                case 2:
                    return Integer.valueOf(this.f15752jZ);
                case 3:
                    return Integer.valueOf(this.f15753ka);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: bH */
        public Set<Integer> mo12105bH() {
            return this.f15751iD;
        }

        /* renamed from: ck */
        public C3738a freeze() {
            return this;
        }

        public int describeContents() {
            C3749ce ceVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3738a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C3738a aVar = (C3738a) obj;
            for (C3590ae.C3591a next : f15749iC.values()) {
                if (mo11406a(next)) {
                    if (!aVar.mo11406a(next)) {
                        return false;
                    }
                    if (!mo11407b(next).equals(aVar.mo11407b(next))) {
                        return false;
                    }
                } else if (aVar.mo11406a(next)) {
                    return false;
                }
            }
            return true;
        }

        public int getMax() {
            return this.f15752jZ;
        }

        public int getMin() {
            return this.f15753ka;
        }

        public boolean hasMax() {
            return this.f15751iD.contains(2);
        }

        public boolean hasMin() {
            return this.f15751iD.contains(3);
        }

        public int hashCode() {
            int i = 0;
            Iterator<C3590ae.C3591a<?, ?>> it = f15749iC.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C3590ae.C3591a next = it.next();
                if (mo11406a(next)) {
                    i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                } else {
                    i = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo12114i() {
            return this.f15750ab;
        }

        public boolean isDataValid() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo11408m(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo11409n(String str) {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3749ce ceVar = CREATOR;
            C3749ce.m16484a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc$b */
    public static final class C3739b extends C3590ae implements SafeParcelable, Person.Cover {
        public static final C3750cf CREATOR = new C3750cf();

        /* renamed from: iC */
        private static final HashMap<String, C3590ae.C3591a<?, ?>> f15754iC = new HashMap<>();

        /* renamed from: ab */
        private final int f15755ab;

        /* renamed from: iD */
        private final Set<Integer> f15756iD;

        /* renamed from: kb */
        private C3740a f15757kb;

        /* renamed from: kc */
        private C3741b f15758kc;

        /* renamed from: kd */
        private int f15759kd;

        /* renamed from: com.google.android.gms.internal.cc$b$a */
        public static final class C3740a extends C3590ae implements SafeParcelable, Person.Cover.CoverInfo {
            public static final C3751cg CREATOR = new C3751cg();

            /* renamed from: iC */
            private static final HashMap<String, C3590ae.C3591a<?, ?>> f15760iC = new HashMap<>();

            /* renamed from: ab */
            private final int f15761ab;

            /* renamed from: iD */
            private final Set<Integer> f15762iD;

            /* renamed from: ke */
            private int f15763ke;

            /* renamed from: kf */
            private int f15764kf;

            static {
                f15760iC.put("leftImageOffset", C3590ae.C3591a.m15616c("leftImageOffset", 2));
                f15760iC.put("topImageOffset", C3590ae.C3591a.m15616c("topImageOffset", 3));
            }

            public C3740a() {
                this.f15761ab = 1;
                this.f15762iD = new HashSet();
            }

            C3740a(Set<Integer> set, int i, int i2, int i3) {
                this.f15762iD = set;
                this.f15761ab = i;
                this.f15763ke = i2;
                this.f15764kf = i3;
            }

            /* renamed from: T */
            public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
                return f15760iC;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public boolean mo11406a(C3590ae.C3591a aVar) {
                return this.f15762iD.contains(Integer.valueOf(aVar.mo11420aa()));
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Object mo11407b(C3590ae.C3591a aVar) {
                switch (aVar.mo11420aa()) {
                    case 2:
                        return Integer.valueOf(this.f15763ke);
                    case 3:
                        return Integer.valueOf(this.f15764kf);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: bH */
            public Set<Integer> mo12131bH() {
                return this.f15762iD;
            }

            /* renamed from: co */
            public C3740a freeze() {
                return this;
            }

            public int describeContents() {
                C3751cg cgVar = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C3740a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C3740a aVar = (C3740a) obj;
                for (C3590ae.C3591a next : f15760iC.values()) {
                    if (mo11406a(next)) {
                        if (!aVar.mo11406a(next)) {
                            return false;
                        }
                        if (!mo11407b(next).equals(aVar.mo11407b(next))) {
                            return false;
                        }
                    } else if (aVar.mo11406a(next)) {
                        return false;
                    }
                }
                return true;
            }

            public int getLeftImageOffset() {
                return this.f15763ke;
            }

            public int getTopImageOffset() {
                return this.f15764kf;
            }

            public boolean hasLeftImageOffset() {
                return this.f15762iD.contains(2);
            }

            public boolean hasTopImageOffset() {
                return this.f15762iD.contains(3);
            }

            public int hashCode() {
                int i = 0;
                Iterator<C3590ae.C3591a<?, ?>> it = f15760iC.values().iterator();
                while (true) {
                    int i2 = i;
                    if (!it.hasNext()) {
                        return i2;
                    }
                    C3590ae.C3591a next = it.next();
                    if (mo11406a(next)) {
                        i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                    } else {
                        i = i2;
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public int mo12140i() {
                return this.f15761ab;
            }

            public boolean isDataValid() {
                return true;
            }

            /* access modifiers changed from: protected */
            /* renamed from: m */
            public Object mo11408m(String str) {
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: n */
            public boolean mo11409n(String str) {
                return false;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C3751cg cgVar = CREATOR;
                C3751cg.m16490a(this, parcel, i);
            }
        }

        /* renamed from: com.google.android.gms.internal.cc$b$b */
        public static final class C3741b extends C3590ae implements SafeParcelable, Person.Cover.CoverPhoto {
            public static final C3752ch CREATOR = new C3752ch();

            /* renamed from: iC */
            private static final HashMap<String, C3590ae.C3591a<?, ?>> f15765iC = new HashMap<>();

            /* renamed from: ab */
            private final int f15766ab;

            /* renamed from: hL */
            private int f15767hL;

            /* renamed from: hM */
            private int f15768hM;

            /* renamed from: iD */
            private final Set<Integer> f15769iD;

            /* renamed from: ie */
            private String f15770ie;

            static {
                f15765iC.put("height", C3590ae.C3591a.m15616c("height", 2));
                f15765iC.put("url", C3590ae.C3591a.m15620f("url", 3));
                f15765iC.put("width", C3590ae.C3591a.m15616c("width", 4));
            }

            public C3741b() {
                this.f15766ab = 1;
                this.f15769iD = new HashSet();
            }

            C3741b(Set<Integer> set, int i, int i2, String str, int i3) {
                this.f15769iD = set;
                this.f15766ab = i;
                this.f15768hM = i2;
                this.f15770ie = str;
                this.f15767hL = i3;
            }

            /* renamed from: T */
            public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
                return f15765iC;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public boolean mo11406a(C3590ae.C3591a aVar) {
                return this.f15769iD.contains(Integer.valueOf(aVar.mo11420aa()));
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Object mo11407b(C3590ae.C3591a aVar) {
                switch (aVar.mo11420aa()) {
                    case 2:
                        return Integer.valueOf(this.f15768hM);
                    case 3:
                        return this.f15770ie;
                    case 4:
                        return Integer.valueOf(this.f15767hL);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: bH */
            public Set<Integer> mo12142bH() {
                return this.f15769iD;
            }

            /* renamed from: cp */
            public C3741b freeze() {
                return this;
            }

            public int describeContents() {
                C3752ch chVar = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C3741b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C3741b bVar = (C3741b) obj;
                for (C3590ae.C3591a next : f15765iC.values()) {
                    if (mo11406a(next)) {
                        if (!bVar.mo11406a(next)) {
                            return false;
                        }
                        if (!mo11407b(next).equals(bVar.mo11407b(next))) {
                            return false;
                        }
                    } else if (bVar.mo11406a(next)) {
                        return false;
                    }
                }
                return true;
            }

            public int getHeight() {
                return this.f15768hM;
            }

            public String getUrl() {
                return this.f15770ie;
            }

            public int getWidth() {
                return this.f15767hL;
            }

            public boolean hasHeight() {
                return this.f15769iD.contains(2);
            }

            public boolean hasUrl() {
                return this.f15769iD.contains(3);
            }

            public boolean hasWidth() {
                return this.f15769iD.contains(4);
            }

            public int hashCode() {
                int i = 0;
                Iterator<C3590ae.C3591a<?, ?>> it = f15765iC.values().iterator();
                while (true) {
                    int i2 = i;
                    if (!it.hasNext()) {
                        return i2;
                    }
                    C3590ae.C3591a next = it.next();
                    if (mo11406a(next)) {
                        i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                    } else {
                        i = i2;
                    }
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public int mo12153i() {
                return this.f15766ab;
            }

            public boolean isDataValid() {
                return true;
            }

            /* access modifiers changed from: protected */
            /* renamed from: m */
            public Object mo11408m(String str) {
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: n */
            public boolean mo11409n(String str) {
                return false;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C3752ch chVar = CREATOR;
                C3752ch.m16493a(this, parcel, i);
            }
        }

        static {
            f15754iC.put("coverInfo", C3590ae.C3591a.m15614a("coverInfo", 2, C3740a.class));
            f15754iC.put("coverPhoto", C3590ae.C3591a.m15614a("coverPhoto", 3, C3741b.class));
            f15754iC.put("layout", C3590ae.C3591a.m15613a("layout", 4, new C3586ab().mo11387b("banner", 0), false));
        }

        public C3739b() {
            this.f15755ab = 1;
            this.f15756iD = new HashSet();
        }

        C3739b(Set<Integer> set, int i, C3740a aVar, C3741b bVar, int i2) {
            this.f15756iD = set;
            this.f15755ab = i;
            this.f15757kb = aVar;
            this.f15758kc = bVar;
            this.f15759kd = i2;
        }

        /* renamed from: T */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
            return f15754iC;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo11406a(C3590ae.C3591a aVar) {
            return this.f15756iD.contains(Integer.valueOf(aVar.mo11420aa()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11407b(C3590ae.C3591a aVar) {
            switch (aVar.mo11420aa()) {
                case 2:
                    return this.f15757kb;
                case 3:
                    return this.f15758kc;
                case 4:
                    return Integer.valueOf(this.f15759kd);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: bH */
        public Set<Integer> mo12116bH() {
            return this.f15756iD;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: cl */
        public C3740a mo12117cl() {
            return this.f15757kb;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: cm */
        public C3741b mo12118cm() {
            return this.f15758kc;
        }

        /* renamed from: cn */
        public C3739b freeze() {
            return this;
        }

        public int describeContents() {
            C3750cf cfVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3739b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C3739b bVar = (C3739b) obj;
            for (C3590ae.C3591a next : f15754iC.values()) {
                if (mo11406a(next)) {
                    if (!bVar.mo11406a(next)) {
                        return false;
                    }
                    if (!mo11407b(next).equals(bVar.mo11407b(next))) {
                        return false;
                    }
                } else if (bVar.mo11406a(next)) {
                    return false;
                }
            }
            return true;
        }

        public Person.Cover.CoverInfo getCoverInfo() {
            return this.f15757kb;
        }

        public Person.Cover.CoverPhoto getCoverPhoto() {
            return this.f15758kc;
        }

        public int getLayout() {
            return this.f15759kd;
        }

        public boolean hasCoverInfo() {
            return this.f15756iD.contains(2);
        }

        public boolean hasCoverPhoto() {
            return this.f15756iD.contains(3);
        }

        public boolean hasLayout() {
            return this.f15756iD.contains(4);
        }

        public int hashCode() {
            int i = 0;
            Iterator<C3590ae.C3591a<?, ?>> it = f15754iC.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C3590ae.C3591a next = it.next();
                if (mo11406a(next)) {
                    i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                } else {
                    i = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo12129i() {
            return this.f15755ab;
        }

        public boolean isDataValid() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo11408m(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo11409n(String str) {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3750cf cfVar = CREATOR;
            C3750cf.m16487a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc$c */
    public static final class C3742c extends C3590ae implements SafeParcelable, Person.Image {
        public static final C3753ci CREATOR = new C3753ci();

        /* renamed from: iC */
        private static final HashMap<String, C3590ae.C3591a<?, ?>> f15771iC = new HashMap<>();

        /* renamed from: ab */
        private final int f15772ab;

        /* renamed from: iD */
        private final Set<Integer> f15773iD;

        /* renamed from: ie */
        private String f15774ie;

        static {
            f15771iC.put("url", C3590ae.C3591a.m15620f("url", 2));
        }

        public C3742c() {
            this.f15772ab = 1;
            this.f15773iD = new HashSet();
        }

        public C3742c(String str) {
            this.f15773iD = new HashSet();
            this.f15772ab = 1;
            this.f15774ie = str;
            this.f15773iD.add(2);
        }

        C3742c(Set<Integer> set, int i, String str) {
            this.f15773iD = set;
            this.f15772ab = i;
            this.f15774ie = str;
        }

        /* renamed from: T */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
            return f15771iC;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo11406a(C3590ae.C3591a aVar) {
            return this.f15773iD.contains(Integer.valueOf(aVar.mo11420aa()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11407b(C3590ae.C3591a aVar) {
            switch (aVar.mo11420aa()) {
                case 2:
                    return this.f15774ie;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: bH */
        public Set<Integer> mo12155bH() {
            return this.f15773iD;
        }

        /* renamed from: cq */
        public C3742c freeze() {
            return this;
        }

        public int describeContents() {
            C3753ci ciVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3742c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C3742c cVar = (C3742c) obj;
            for (C3590ae.C3591a next : f15771iC.values()) {
                if (mo11406a(next)) {
                    if (!cVar.mo11406a(next)) {
                        return false;
                    }
                    if (!mo11407b(next).equals(cVar.mo11407b(next))) {
                        return false;
                    }
                } else if (cVar.mo11406a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getUrl() {
            return this.f15774ie;
        }

        public boolean hasUrl() {
            return this.f15773iD.contains(2);
        }

        public int hashCode() {
            int i = 0;
            Iterator<C3590ae.C3591a<?, ?>> it = f15771iC.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C3590ae.C3591a next = it.next();
                if (mo11406a(next)) {
                    i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                } else {
                    i = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo12162i() {
            return this.f15772ab;
        }

        public boolean isDataValid() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo11408m(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo11409n(String str) {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3753ci ciVar = CREATOR;
            C3753ci.m16496a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc$d */
    public static final class C3743d extends C3590ae implements SafeParcelable, Person.Name {
        public static final C3754cj CREATOR = new C3754cj();

        /* renamed from: iC */
        private static final HashMap<String, C3590ae.C3591a<?, ?>> f15775iC = new HashMap<>();

        /* renamed from: ab */
        private final int f15776ab;

        /* renamed from: iD */
        private final Set<Integer> f15777iD;

        /* renamed from: jc */
        private String f15778jc;

        /* renamed from: jf */
        private String f15779jf;

        /* renamed from: kg */
        private String f15780kg;

        /* renamed from: kh */
        private String f15781kh;

        /* renamed from: ki */
        private String f15782ki;

        /* renamed from: kj */
        private String f15783kj;

        static {
            f15775iC.put("familyName", C3590ae.C3591a.m15620f("familyName", 2));
            f15775iC.put("formatted", C3590ae.C3591a.m15620f("formatted", 3));
            f15775iC.put("givenName", C3590ae.C3591a.m15620f("givenName", 4));
            f15775iC.put("honorificPrefix", C3590ae.C3591a.m15620f("honorificPrefix", 5));
            f15775iC.put("honorificSuffix", C3590ae.C3591a.m15620f("honorificSuffix", 6));
            f15775iC.put("middleName", C3590ae.C3591a.m15620f("middleName", 7));
        }

        public C3743d() {
            this.f15776ab = 1;
            this.f15777iD = new HashSet();
        }

        C3743d(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f15777iD = set;
            this.f15776ab = i;
            this.f15778jc = str;
            this.f15780kg = str2;
            this.f15779jf = str3;
            this.f15781kh = str4;
            this.f15782ki = str5;
            this.f15783kj = str6;
        }

        /* renamed from: T */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
            return f15775iC;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo11406a(C3590ae.C3591a aVar) {
            return this.f15777iD.contains(Integer.valueOf(aVar.mo11420aa()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11407b(C3590ae.C3591a aVar) {
            switch (aVar.mo11420aa()) {
                case 2:
                    return this.f15778jc;
                case 3:
                    return this.f15780kg;
                case 4:
                    return this.f15779jf;
                case 5:
                    return this.f15781kh;
                case 6:
                    return this.f15782ki;
                case 7:
                    return this.f15783kj;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: bH */
        public Set<Integer> mo12164bH() {
            return this.f15777iD;
        }

        /* renamed from: cr */
        public C3743d freeze() {
            return this;
        }

        public int describeContents() {
            C3754cj cjVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3743d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C3743d dVar = (C3743d) obj;
            for (C3590ae.C3591a next : f15775iC.values()) {
                if (mo11406a(next)) {
                    if (!dVar.mo11406a(next)) {
                        return false;
                    }
                    if (!mo11407b(next).equals(dVar.mo11407b(next))) {
                        return false;
                    }
                } else if (dVar.mo11406a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getFamilyName() {
            return this.f15778jc;
        }

        public String getFormatted() {
            return this.f15780kg;
        }

        public String getGivenName() {
            return this.f15779jf;
        }

        public String getHonorificPrefix() {
            return this.f15781kh;
        }

        public String getHonorificSuffix() {
            return this.f15782ki;
        }

        public String getMiddleName() {
            return this.f15783kj;
        }

        public boolean hasFamilyName() {
            return this.f15777iD.contains(2);
        }

        public boolean hasFormatted() {
            return this.f15777iD.contains(3);
        }

        public boolean hasGivenName() {
            return this.f15777iD.contains(4);
        }

        public boolean hasHonorificPrefix() {
            return this.f15777iD.contains(5);
        }

        public boolean hasHonorificSuffix() {
            return this.f15777iD.contains(6);
        }

        public boolean hasMiddleName() {
            return this.f15777iD.contains(7);
        }

        public int hashCode() {
            int i = 0;
            Iterator<C3590ae.C3591a<?, ?>> it = f15775iC.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C3590ae.C3591a next = it.next();
                if (mo11406a(next)) {
                    i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                } else {
                    i = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo12181i() {
            return this.f15776ab;
        }

        public boolean isDataValid() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo11408m(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo11409n(String str) {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3754cj cjVar = CREATOR;
            C3754cj.m16499a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc$e */
    public static class C3744e {
        /* renamed from: G */
        public static int m16455G(String str) {
            if (str.equals("person")) {
                return 0;
            }
            if (str.equals("page")) {
                return 1;
            }
            throw new IllegalArgumentException("Unknown objectType string: " + str);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc$f */
    public static final class C3745f extends C3590ae implements SafeParcelable, Person.Organizations {
        public static final C3755ck CREATOR = new C3755ck();

        /* renamed from: iC */
        private static final HashMap<String, C3590ae.C3591a<?, ?>> f15784iC = new HashMap<>();

        /* renamed from: aJ */
        private int f15785aJ;

        /* renamed from: ab */
        private final int f15786ab;

        /* renamed from: di */
        private String f15787di;

        /* renamed from: hs */
        private String f15788hs;

        /* renamed from: iD */
        private final Set<Integer> f15789iD;

        /* renamed from: jb */
        private String f15790jb;

        /* renamed from: js */
        private String f15791js;

        /* renamed from: kk */
        private String f15792kk;

        /* renamed from: kl */
        private String f15793kl;

        /* renamed from: km */
        private boolean f15794km;
        private String mName;

        static {
            f15784iC.put("department", C3590ae.C3591a.m15620f("department", 2));
            f15784iC.put("description", C3590ae.C3591a.m15620f("description", 3));
            f15784iC.put("endDate", C3590ae.C3591a.m15620f("endDate", 4));
            f15784iC.put("location", C3590ae.C3591a.m15620f("location", 5));
            f15784iC.put("name", C3590ae.C3591a.m15620f("name", 6));
            f15784iC.put("primary", C3590ae.C3591a.m15619e("primary", 7));
            f15784iC.put(PresentConfigXmlTag.FEATURE_ATTR_START_DATE, C3590ae.C3591a.m15620f(PresentConfigXmlTag.FEATURE_ATTR_START_DATE, 8));
            f15784iC.put("title", C3590ae.C3591a.m15620f("title", 9));
            f15784iC.put("type", C3590ae.C3591a.m15613a("type", 10, new C3586ab().mo11387b("work", 0).mo11387b("school", 1), false));
        }

        public C3745f() {
            this.f15786ab = 1;
            this.f15789iD = new HashSet();
        }

        C3745f(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f15789iD = set;
            this.f15786ab = i;
            this.f15792kk = str;
            this.f15787di = str2;
            this.f15790jb = str3;
            this.f15793kl = str4;
            this.mName = str5;
            this.f15794km = z;
            this.f15791js = str6;
            this.f15788hs = str7;
            this.f15785aJ = i2;
        }

        /* renamed from: T */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
            return f15784iC;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo11406a(C3590ae.C3591a aVar) {
            return this.f15789iD.contains(Integer.valueOf(aVar.mo11420aa()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11407b(C3590ae.C3591a aVar) {
            switch (aVar.mo11420aa()) {
                case 2:
                    return this.f15792kk;
                case 3:
                    return this.f15787di;
                case 4:
                    return this.f15790jb;
                case 5:
                    return this.f15793kl;
                case 6:
                    return this.mName;
                case 7:
                    return Boolean.valueOf(this.f15794km);
                case 8:
                    return this.f15791js;
                case 9:
                    return this.f15788hs;
                case 10:
                    return Integer.valueOf(this.f15785aJ);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: bH */
        public Set<Integer> mo12183bH() {
            return this.f15789iD;
        }

        /* renamed from: cs */
        public C3745f freeze() {
            return this;
        }

        public int describeContents() {
            C3755ck ckVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3745f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C3745f fVar = (C3745f) obj;
            for (C3590ae.C3591a next : f15784iC.values()) {
                if (mo11406a(next)) {
                    if (!fVar.mo11406a(next)) {
                        return false;
                    }
                    if (!mo11407b(next).equals(fVar.mo11407b(next))) {
                        return false;
                    }
                } else if (fVar.mo11406a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getDepartment() {
            return this.f15792kk;
        }

        public String getDescription() {
            return this.f15787di;
        }

        public String getEndDate() {
            return this.f15790jb;
        }

        public String getLocation() {
            return this.f15793kl;
        }

        public String getName() {
            return this.mName;
        }

        public String getStartDate() {
            return this.f15791js;
        }

        public String getTitle() {
            return this.f15788hs;
        }

        public int getType() {
            return this.f15785aJ;
        }

        public boolean hasDepartment() {
            return this.f15789iD.contains(2);
        }

        public boolean hasDescription() {
            return this.f15789iD.contains(3);
        }

        public boolean hasEndDate() {
            return this.f15789iD.contains(4);
        }

        public boolean hasLocation() {
            return this.f15789iD.contains(5);
        }

        public boolean hasName() {
            return this.f15789iD.contains(6);
        }

        public boolean hasPrimary() {
            return this.f15789iD.contains(7);
        }

        public boolean hasStartDate() {
            return this.f15789iD.contains(8);
        }

        public boolean hasTitle() {
            return this.f15789iD.contains(9);
        }

        public boolean hasType() {
            return this.f15789iD.contains(10);
        }

        public int hashCode() {
            int i = 0;
            Iterator<C3590ae.C3591a<?, ?>> it = f15784iC.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C3590ae.C3591a next = it.next();
                if (mo11406a(next)) {
                    i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                } else {
                    i = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo12205i() {
            return this.f15786ab;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.f15794km;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo11408m(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo11409n(String str) {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3755ck ckVar = CREATOR;
            C3755ck.m16502a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc$g */
    public static final class C3746g extends C3590ae implements SafeParcelable, Person.PlacesLived {
        public static final C3756cl CREATOR = new C3756cl();

        /* renamed from: iC */
        private static final HashMap<String, C3590ae.C3591a<?, ?>> f15795iC = new HashMap<>();

        /* renamed from: ab */
        private final int f15796ab;

        /* renamed from: iD */
        private final Set<Integer> f15797iD;

        /* renamed from: km */
        private boolean f15798km;
        private String mValue;

        static {
            f15795iC.put("primary", C3590ae.C3591a.m15619e("primary", 2));
            f15795iC.put("value", C3590ae.C3591a.m15620f("value", 3));
        }

        public C3746g() {
            this.f15796ab = 1;
            this.f15797iD = new HashSet();
        }

        C3746g(Set<Integer> set, int i, boolean z, String str) {
            this.f15797iD = set;
            this.f15796ab = i;
            this.f15798km = z;
            this.mValue = str;
        }

        /* renamed from: T */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
            return f15795iC;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo11406a(C3590ae.C3591a aVar) {
            return this.f15797iD.contains(Integer.valueOf(aVar.mo11420aa()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11407b(C3590ae.C3591a aVar) {
            switch (aVar.mo11420aa()) {
                case 2:
                    return Boolean.valueOf(this.f15798km);
                case 3:
                    return this.mValue;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: bH */
        public Set<Integer> mo12208bH() {
            return this.f15797iD;
        }

        /* renamed from: ct */
        public C3746g freeze() {
            return this;
        }

        public int describeContents() {
            C3756cl clVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3746g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C3746g gVar = (C3746g) obj;
            for (C3590ae.C3591a next : f15795iC.values()) {
                if (mo11406a(next)) {
                    if (!gVar.mo11406a(next)) {
                        return false;
                    }
                    if (!mo11407b(next).equals(gVar.mo11407b(next))) {
                        return false;
                    }
                } else if (gVar.mo11406a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getValue() {
            return this.mValue;
        }

        public boolean hasPrimary() {
            return this.f15797iD.contains(2);
        }

        public boolean hasValue() {
            return this.f15797iD.contains(3);
        }

        public int hashCode() {
            int i = 0;
            Iterator<C3590ae.C3591a<?, ?>> it = f15795iC.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C3590ae.C3591a next = it.next();
                if (mo11406a(next)) {
                    i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                } else {
                    i = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo12216i() {
            return this.f15796ab;
        }

        public boolean isDataValid() {
            return true;
        }

        public boolean isPrimary() {
            return this.f15798km;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo11408m(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo11409n(String str) {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3756cl clVar = CREATOR;
            C3756cl.m16505a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.cc$h */
    public static final class C3747h extends C3590ae implements SafeParcelable, Person.Urls {
        public static final C3757cm CREATOR = new C3757cm();

        /* renamed from: iC */
        private static final HashMap<String, C3590ae.C3591a<?, ?>> f15799iC = new HashMap<>();

        /* renamed from: aJ */
        private int f15800aJ;

        /* renamed from: ab */
        private final int f15801ab;

        /* renamed from: iD */
        private final Set<Integer> f15802iD;

        /* renamed from: kn */
        private String f15803kn;

        /* renamed from: ko */
        private final int f15804ko;
        private String mValue;

        static {
            f15799iC.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, C3590ae.C3591a.m15620f(PlusShare.KEY_CALL_TO_ACTION_LABEL, 5));
            f15799iC.put("type", C3590ae.C3591a.m15613a("type", 6, new C3586ab().mo11387b(C1246d.f3816bg, 0).mo11387b("work", 1).mo11387b("blog", 2).mo11387b("profile", 3).mo11387b(C1246d.f3815bf, 4).mo11387b("otherProfile", 5).mo11387b("contributor", 6).mo11387b("website", 7), false));
            f15799iC.put("value", C3590ae.C3591a.m15620f("value", 4));
        }

        public C3747h() {
            this.f15804ko = 4;
            this.f15801ab = 2;
            this.f15802iD = new HashSet();
        }

        C3747h(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.f15804ko = 4;
            this.f15802iD = set;
            this.f15801ab = i;
            this.f15803kn = str;
            this.f15800aJ = i2;
            this.mValue = str2;
        }

        /* renamed from: T */
        public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
            return f15799iC;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo11406a(C3590ae.C3591a aVar) {
            return this.f15802iD.contains(Integer.valueOf(aVar.mo11420aa()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo11407b(C3590ae.C3591a aVar) {
            switch (aVar.mo11420aa()) {
                case 4:
                    return this.mValue;
                case 5:
                    return this.f15803kn;
                case 6:
                    return Integer.valueOf(this.f15800aJ);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: bH */
        public Set<Integer> mo12219bH() {
            return this.f15802iD;
        }

        @Deprecated
        /* renamed from: cu */
        public int mo12220cu() {
            return 4;
        }

        /* renamed from: cv */
        public C3747h freeze() {
            return this;
        }

        public int describeContents() {
            C3757cm cmVar = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3747h)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C3747h hVar = (C3747h) obj;
            for (C3590ae.C3591a next : f15799iC.values()) {
                if (mo11406a(next)) {
                    if (!hVar.mo11406a(next)) {
                        return false;
                    }
                    if (!mo11407b(next).equals(hVar.mo11407b(next))) {
                        return false;
                    }
                } else if (hVar.mo11406a(next)) {
                    return false;
                }
            }
            return true;
        }

        public String getLabel() {
            return this.f15803kn;
        }

        public int getType() {
            return this.f15800aJ;
        }

        public String getValue() {
            return this.mValue;
        }

        public boolean hasLabel() {
            return this.f15802iD.contains(5);
        }

        public boolean hasType() {
            return this.f15802iD.contains(6);
        }

        public boolean hasValue() {
            return this.f15802iD.contains(4);
        }

        public int hashCode() {
            int i = 0;
            Iterator<C3590ae.C3591a<?, ?>> it = f15799iC.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                C3590ae.C3591a next = it.next();
                if (mo11406a(next)) {
                    i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
                } else {
                    i = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo12231i() {
            return this.f15801ab;
        }

        public boolean isDataValid() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo11408m(String str) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo11409n(String str) {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3757cm cmVar = CREATOR;
            C3757cm.m16508a(this, parcel, i);
        }
    }

    static {
        f15722iC.put("aboutMe", C3590ae.C3591a.m15620f("aboutMe", 2));
        f15722iC.put("ageRange", C3590ae.C3591a.m15614a("ageRange", 3, C3738a.class));
        f15722iC.put("birthday", C3590ae.C3591a.m15620f("birthday", 4));
        f15722iC.put("braggingRights", C3590ae.C3591a.m15620f("braggingRights", 5));
        f15722iC.put("circledByCount", C3590ae.C3591a.m15616c("circledByCount", 6));
        f15722iC.put("cover", C3590ae.C3591a.m15614a("cover", 7, C3739b.class));
        f15722iC.put("currentLocation", C3590ae.C3591a.m15620f("currentLocation", 8));
        f15722iC.put("displayName", C3590ae.C3591a.m15620f("displayName", 9));
        f15722iC.put("gender", C3590ae.C3591a.m15613a("gender", 12, new C3586ab().mo11387b("male", 0).mo11387b("female", 1).mo11387b(C1246d.f3815bf, 2), false));
        f15722iC.put("id", C3590ae.C3591a.m15620f("id", 14));
        f15722iC.put("image", C3590ae.C3591a.m15614a("image", 15, C3742c.class));
        f15722iC.put("isPlusUser", C3590ae.C3591a.m15619e("isPlusUser", 16));
        f15722iC.put("language", C3590ae.C3591a.m15620f("language", 18));
        f15722iC.put("name", C3590ae.C3591a.m15614a("name", 19, C3743d.class));
        f15722iC.put("nickname", C3590ae.C3591a.m15620f("nickname", 20));
        f15722iC.put("objectType", C3590ae.C3591a.m15613a("objectType", 21, new C3586ab().mo11387b("person", 0).mo11387b("page", 1), false));
        f15722iC.put("organizations", C3590ae.C3591a.m15615b("organizations", 22, C3745f.class));
        f15722iC.put("placesLived", C3590ae.C3591a.m15615b("placesLived", 23, C3746g.class));
        f15722iC.put("plusOneCount", C3590ae.C3591a.m15616c("plusOneCount", 24));
        f15722iC.put("relationshipStatus", C3590ae.C3591a.m15613a("relationshipStatus", 25, new C3586ab().mo11387b("single", 0).mo11387b("in_a_relationship", 1).mo11387b("engaged", 2).mo11387b("married", 3).mo11387b("its_complicated", 4).mo11387b("open_relationship", 5).mo11387b("widowed", 6).mo11387b("in_domestic_partnership", 7).mo11387b("in_civil_union", 8), false));
        f15722iC.put("tagline", C3590ae.C3591a.m15620f("tagline", 26));
        f15722iC.put("url", C3590ae.C3591a.m15620f("url", 27));
        f15722iC.put("urls", C3590ae.C3591a.m15615b("urls", 28, C3747h.class));
        f15722iC.put("verified", C3590ae.C3591a.m15619e("verified", 29));
    }

    public C3737cc() {
        this.f15723ab = 2;
        this.f15725iD = new HashSet();
    }

    public C3737cc(String str, String str2, C3742c cVar, int i, String str3) {
        this.f15723ab = 2;
        this.f15725iD = new HashSet();
        this.f15724cl = str;
        this.f15725iD.add(9);
        this.f15748jh = str2;
        this.f15725iD.add(14);
        this.f15735jM = cVar;
        this.f15725iD.add(15);
        this.f15740jR = i;
        this.f15725iD.add(21);
        this.f15726ie = str3;
        this.f15725iD.add(27);
    }

    C3737cc(Set<Integer> set, int i, String str, C3738a aVar, String str2, String str3, int i2, C3739b bVar, String str4, String str5, int i3, String str6, C3742c cVar, boolean z, String str7, C3743d dVar, String str8, int i4, List<C3745f> list, List<C3746g> list2, int i5, int i6, String str9, String str10, List<C3747h> list3, boolean z2) {
        this.f15725iD = set;
        this.f15723ab = i;
        this.f15727jE = str;
        this.f15728jF = aVar;
        this.f15729jG = str2;
        this.f15730jH = str3;
        this.f15731jI = i2;
        this.f15732jJ = bVar;
        this.f15733jK = str4;
        this.f15724cl = str5;
        this.f15734jL = i3;
        this.f15748jh = str6;
        this.f15735jM = cVar;
        this.f15736jN = z;
        this.f15737jO = str7;
        this.f15738jP = dVar;
        this.f15739jQ = str8;
        this.f15740jR = i4;
        this.f15741jS = list;
        this.f15742jT = list2;
        this.f15743jU = i5;
        this.f15744jV = i6;
        this.f15745jW = str9;
        this.f15726ie = str10;
        this.f15746jX = list3;
        this.f15747jY = z2;
    }

    /* renamed from: d */
    public static C3737cc m16389d(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        C3737cc y = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return y;
    }

    /* renamed from: T */
    public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
        return f15722iC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11406a(C3590ae.C3591a aVar) {
        return this.f15725iD.contains(Integer.valueOf(aVar.mo11420aa()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo11407b(C3590ae.C3591a aVar) {
        switch (aVar.mo11420aa()) {
            case 2:
                return this.f15727jE;
            case 3:
                return this.f15728jF;
            case 4:
                return this.f15729jG;
            case 5:
                return this.f15730jH;
            case 6:
                return Integer.valueOf(this.f15731jI);
            case 7:
                return this.f15732jJ;
            case 8:
                return this.f15733jK;
            case 9:
                return this.f15724cl;
            case 12:
                return Integer.valueOf(this.f15734jL);
            case 14:
                return this.f15748jh;
            case 15:
                return this.f15735jM;
            case 16:
                return Boolean.valueOf(this.f15736jN);
            case 18:
                return this.f15737jO;
            case 19:
                return this.f15738jP;
            case 20:
                return this.f15739jQ;
            case 21:
                return Integer.valueOf(this.f15740jR);
            case 22:
                return this.f15741jS;
            case 23:
                return this.f15742jT;
            case 24:
                return Integer.valueOf(this.f15743jU);
            case 25:
                return Integer.valueOf(this.f15744jV);
            case 26:
                return this.f15745jW;
            case 27:
                return this.f15726ie;
            case 28:
                return this.f15746jX;
            case 29:
                return Boolean.valueOf(this.f15747jY);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bH */
    public Set<Integer> mo12041bH() {
        return this.f15725iD;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cc */
    public C3738a mo12042cc() {
        return this.f15728jF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cd */
    public C3739b mo12043cd() {
        return this.f15732jJ;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ce */
    public C3742c mo12044ce() {
        return this.f15735jM;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cf */
    public C3743d mo12045cf() {
        return this.f15738jP;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cg */
    public List<C3745f> mo12046cg() {
        return this.f15741jS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ch */
    public List<C3746g> mo12047ch() {
        return this.f15742jT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ci */
    public List<C3747h> mo12048ci() {
        return this.f15746jX;
    }

    /* renamed from: cj */
    public C3737cc freeze() {
        return this;
    }

    public int describeContents() {
        C3748cd cdVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3737cc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C3737cc ccVar = (C3737cc) obj;
        for (C3590ae.C3591a next : f15722iC.values()) {
            if (mo11406a(next)) {
                if (!ccVar.mo11406a(next)) {
                    return false;
                }
                if (!mo11407b(next).equals(ccVar.mo11407b(next))) {
                    return false;
                }
            } else if (ccVar.mo11406a(next)) {
                return false;
            }
        }
        return true;
    }

    public String getAboutMe() {
        return this.f15727jE;
    }

    public Person.AgeRange getAgeRange() {
        return this.f15728jF;
    }

    public String getBirthday() {
        return this.f15729jG;
    }

    public String getBraggingRights() {
        return this.f15730jH;
    }

    public int getCircledByCount() {
        return this.f15731jI;
    }

    public Person.Cover getCover() {
        return this.f15732jJ;
    }

    public String getCurrentLocation() {
        return this.f15733jK;
    }

    public String getDisplayName() {
        return this.f15724cl;
    }

    @Deprecated
    public List<Person.Emails> getEmails() {
        return null;
    }

    public int getGender() {
        return this.f15734jL;
    }

    public String getId() {
        return this.f15748jh;
    }

    public Person.Image getImage() {
        return this.f15735jM;
    }

    public String getLanguage() {
        return this.f15737jO;
    }

    public Person.Name getName() {
        return this.f15738jP;
    }

    public String getNickname() {
        return this.f15739jQ;
    }

    public int getObjectType() {
        return this.f15740jR;
    }

    public List<Person.Organizations> getOrganizations() {
        return (ArrayList) this.f15741jS;
    }

    public List<Person.PlacesLived> getPlacesLived() {
        return (ArrayList) this.f15742jT;
    }

    public int getPlusOneCount() {
        return this.f15743jU;
    }

    public int getRelationshipStatus() {
        return this.f15744jV;
    }

    public String getTagline() {
        return this.f15745jW;
    }

    public String getUrl() {
        return this.f15726ie;
    }

    public List<Person.Urls> getUrls() {
        return (ArrayList) this.f15746jX;
    }

    public boolean hasAboutMe() {
        return this.f15725iD.contains(2);
    }

    public boolean hasAgeRange() {
        return this.f15725iD.contains(3);
    }

    public boolean hasBirthday() {
        return this.f15725iD.contains(4);
    }

    public boolean hasBraggingRights() {
        return this.f15725iD.contains(5);
    }

    public boolean hasCircledByCount() {
        return this.f15725iD.contains(6);
    }

    public boolean hasCover() {
        return this.f15725iD.contains(7);
    }

    public boolean hasCurrentLocation() {
        return this.f15725iD.contains(8);
    }

    public boolean hasDisplayName() {
        return this.f15725iD.contains(9);
    }

    @Deprecated
    public boolean hasEmails() {
        return false;
    }

    public boolean hasGender() {
        return this.f15725iD.contains(12);
    }

    public boolean hasId() {
        return this.f15725iD.contains(14);
    }

    public boolean hasImage() {
        return this.f15725iD.contains(15);
    }

    public boolean hasIsPlusUser() {
        return this.f15725iD.contains(16);
    }

    public boolean hasLanguage() {
        return this.f15725iD.contains(18);
    }

    public boolean hasName() {
        return this.f15725iD.contains(19);
    }

    public boolean hasNickname() {
        return this.f15725iD.contains(20);
    }

    public boolean hasObjectType() {
        return this.f15725iD.contains(21);
    }

    public boolean hasOrganizations() {
        return this.f15725iD.contains(22);
    }

    public boolean hasPlacesLived() {
        return this.f15725iD.contains(23);
    }

    public boolean hasPlusOneCount() {
        return this.f15725iD.contains(24);
    }

    public boolean hasRelationshipStatus() {
        return this.f15725iD.contains(25);
    }

    public boolean hasTagline() {
        return this.f15725iD.contains(26);
    }

    public boolean hasUrl() {
        return this.f15725iD.contains(27);
    }

    public boolean hasUrls() {
        return this.f15725iD.contains(28);
    }

    public boolean hasVerified() {
        return this.f15725iD.contains(29);
    }

    public int hashCode() {
        int i = 0;
        Iterator<C3590ae.C3591a<?, ?>> it = f15722iC.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            C3590ae.C3591a next = it.next();
            if (mo11406a(next)) {
                i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
            } else {
                i = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12101i() {
        return this.f15723ab;
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isPlusUser() {
        return this.f15736jN;
    }

    public boolean isVerified() {
        return this.f15747jY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object mo11408m(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo11409n(String str) {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3748cd cdVar = CREATOR;
        C3748cd.m16481a(this, parcel, i);
    }
}
