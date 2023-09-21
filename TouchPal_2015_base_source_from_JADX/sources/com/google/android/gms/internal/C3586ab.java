package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3590ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ab */
public final class C3586ab implements SafeParcelable, C3590ae.C3592b<String, Integer> {
    public static final C3588ac CREATOR = new C3588ac();

    /* renamed from: ab */
    private final int f15445ab;

    /* renamed from: co */
    private final HashMap<String, Integer> f15446co;

    /* renamed from: cp */
    private final HashMap<Integer, String> f15447cp;

    /* renamed from: cq */
    private final ArrayList<C3587a> f15448cq;

    /* renamed from: com.google.android.gms.internal.ab$a */
    public static final class C3587a implements SafeParcelable {
        public static final C3589ad CREATOR = new C3589ad();

        /* renamed from: cr */
        final String f15449cr;

        /* renamed from: cs */
        final int f15450cs;
        final int versionCode;

        C3587a(int i, String str, int i2) {
            this.versionCode = i;
            this.f15449cr = str;
            this.f15450cs = i2;
        }

        C3587a(String str, int i) {
            this.versionCode = 1;
            this.f15449cr = str;
            this.f15450cs = i;
        }

        public int describeContents() {
            C3589ad adVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C3589ad adVar = CREATOR;
            C3589ad.m15598a(this, parcel, i);
        }
    }

    public C3586ab() {
        this.f15445ab = 1;
        this.f15446co = new HashMap<>();
        this.f15447cp = new HashMap<>();
        this.f15448cq = null;
    }

    C3586ab(int i, ArrayList<C3587a> arrayList) {
        this.f15445ab = i;
        this.f15446co = new HashMap<>();
        this.f15447cp = new HashMap<>();
        this.f15448cq = null;
        m15587a(arrayList);
    }

    /* renamed from: a */
    private void m15587a(ArrayList<C3587a> arrayList) {
        Iterator<C3587a> it = arrayList.iterator();
        while (it.hasNext()) {
            C3587a next = it.next();
            mo11387b(next.f15449cr, next.f15450cs);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public ArrayList<C3587a> mo11383Q() {
        ArrayList<C3587a> arrayList = new ArrayList<>();
        for (String next : this.f15446co.keySet()) {
            arrayList.add(new C3587a(next, this.f15446co.get(next).intValue()));
        }
        return arrayList;
    }

    /* renamed from: R */
    public int mo11384R() {
        return 7;
    }

    /* renamed from: S */
    public int mo11385S() {
        return 0;
    }

    /* renamed from: a */
    public String mo11389e(Integer num) {
        String str = this.f15447cp.get(num);
        return (str != null || !this.f15446co.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    /* renamed from: b */
    public C3586ab mo11387b(String str, int i) {
        this.f15446co.put(str, Integer.valueOf(i));
        this.f15447cp.put(Integer.valueOf(i), str);
        return this;
    }

    public int describeContents() {
        C3588ac acVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo11390i() {
        return this.f15445ab;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3588ac acVar = CREATOR;
        C3588ac.m15595a(this, parcel, i);
    }
}
