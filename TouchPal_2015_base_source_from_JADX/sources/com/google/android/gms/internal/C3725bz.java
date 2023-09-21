package com.google.android.gms.internal;

import android.os.Parcel;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.net.cmd.C2270d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3590ae;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.bz */
public final class C3725bz extends C3590ae implements SafeParcelable, Moment {
    public static final C3735ca CREATOR = new C3735ca();

    /* renamed from: iC */
    private static final HashMap<String, C3590ae.C3591a<?, ?>> f15697iC = new HashMap<>();

    /* renamed from: ab */
    private final int f15698ab;

    /* renamed from: iD */
    private final Set<Integer> f15699iD;

    /* renamed from: jB */
    private C3723bx f15700jB;

    /* renamed from: jC */
    private C3723bx f15701jC;

    /* renamed from: jh */
    private String f15702jh;

    /* renamed from: js */
    private String f15703js;

    /* renamed from: jy */
    private String f15704jy;

    static {
        f15697iC.put("id", C3590ae.C3591a.m15620f("id", 2));
        f15697iC.put(C2270d.f9912d, C3590ae.C3591a.m15614a(C2270d.f9912d, 4, C3723bx.class));
        f15697iC.put(PresentConfigXmlTag.FEATURE_ATTR_START_DATE, C3590ae.C3591a.m15620f(PresentConfigXmlTag.FEATURE_ATTR_START_DATE, 5));
        f15697iC.put("target", C3590ae.C3591a.m15614a("target", 6, C3723bx.class));
        f15697iC.put("type", C3590ae.C3591a.m15620f("type", 7));
    }

    public C3725bz() {
        this.f15698ab = 1;
        this.f15699iD = new HashSet();
    }

    C3725bz(Set<Integer> set, int i, String str, C3723bx bxVar, String str2, C3723bx bxVar2, String str3) {
        this.f15699iD = set;
        this.f15698ab = i;
        this.f15702jh = str;
        this.f15700jB = bxVar;
        this.f15703js = str2;
        this.f15701jC = bxVar2;
        this.f15704jy = str3;
    }

    public C3725bz(Set<Integer> set, String str, C3723bx bxVar, String str2, C3723bx bxVar2, String str3) {
        this.f15699iD = set;
        this.f15698ab = 1;
        this.f15702jh = str;
        this.f15700jB = bxVar;
        this.f15703js = str2;
        this.f15701jC = bxVar2;
        this.f15704jy = str3;
    }

    /* renamed from: T */
    public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
        return f15697iC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11406a(C3590ae.C3591a aVar) {
        return this.f15699iD.contains(Integer.valueOf(aVar.mo11420aa()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo11407b(C3590ae.C3591a aVar) {
        switch (aVar.mo11420aa()) {
            case 2:
                return this.f15702jh;
            case 4:
                return this.f15700jB;
            case 5:
                return this.f15703js;
            case 6:
                return this.f15701jC;
            case 7:
                return this.f15704jy;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bH */
    public Set<Integer> mo12004bH() {
        return this.f15699iD;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bY */
    public C3723bx mo12005bY() {
        return this.f15700jB;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bZ */
    public C3723bx mo12006bZ() {
        return this.f15701jC;
    }

    /* renamed from: ca */
    public C3725bz freeze() {
        return this;
    }

    public int describeContents() {
        C3735ca caVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3725bz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C3725bz bzVar = (C3725bz) obj;
        for (C3590ae.C3591a next : f15697iC.values()) {
            if (mo11406a(next)) {
                if (!bzVar.mo11406a(next)) {
                    return false;
                }
                if (!mo11407b(next).equals(bzVar.mo11407b(next))) {
                    return false;
                }
            } else if (bzVar.mo11406a(next)) {
                return false;
            }
        }
        return true;
    }

    public String getId() {
        return this.f15702jh;
    }

    public ItemScope getResult() {
        return this.f15700jB;
    }

    public String getStartDate() {
        return this.f15703js;
    }

    public ItemScope getTarget() {
        return this.f15701jC;
    }

    public String getType() {
        return this.f15704jy;
    }

    public boolean hasId() {
        return this.f15699iD.contains(2);
    }

    public boolean hasResult() {
        return this.f15699iD.contains(4);
    }

    public boolean hasStartDate() {
        return this.f15699iD.contains(5);
    }

    public boolean hasTarget() {
        return this.f15699iD.contains(6);
    }

    public boolean hasType() {
        return this.f15699iD.contains(7);
    }

    public int hashCode() {
        int i = 0;
        Iterator<C3590ae.C3591a<?, ?>> it = f15697iC.values().iterator();
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
    public int mo12021i() {
        return this.f15698ab;
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
        C3735ca caVar = CREATOR;
        C3735ca.m16384a(this, parcel, i);
    }
}
