package com.cootek.smartinput5.func;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput.utilities.C1017y;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Hashtable;

public class TypingSpeedData implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C1627by();

    /* renamed from: a */
    public static final int f4225a = 12;

    /* renamed from: b */
    public static final int f4226b = 31;

    /* renamed from: c */
    public static final String[] f4227c = {C1411aV.f4472R, "touch", C1358O.f4194e, "voice"};

    /* renamed from: d */
    public static final int f4228d = f4227c.length;

    /* renamed from: e */
    private static final String f4229e = "TypingSpeedData";

    /* renamed from: f */
    private static final long f4230f = 0;

    /* renamed from: g */
    private Hashtable<String, Meta[][][]> f4231g;

    /* renamed from: h */
    private Hashtable<String, Meta[]> f4232h;

    public static class Meta implements Parcelable, Serializable {
        public static final Parcelable.Creator CREATOR = new C1628bz();

        /* renamed from: a */
        public int f4233a;

        /* renamed from: b */
        public int f4234b;

        /* renamed from: c */
        public int f4235c;

        /* renamed from: d */
        public int f4236d;

        public Meta() {
            this.f4233a = 0;
            this.f4234b = 0;
            this.f4235c = 1;
            this.f4236d = 0;
        }

        public Meta(Parcel parcel) {
            mo5805a(parcel);
        }

        public String toString() {
            return "commit = " + this.f4233a + ", keystrokes = " + this.f4234b + ", time = " + this.f4235c + ", top = " + this.f4236d;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4233a);
            parcel.writeInt(this.f4234b);
            parcel.writeInt(this.f4235c);
            parcel.writeInt(this.f4236d);
        }

        /* renamed from: a */
        public void mo5805a(Parcel parcel) {
            this.f4233a = parcel.readInt();
            this.f4234b = parcel.readInt();
            this.f4235c = parcel.readInt();
            this.f4236d = parcel.readInt();
        }
    }

    /* renamed from: a */
    public static int m6255a(int i, int i2) {
        return ((i * 1000) * 60) / i2;
    }

    /* renamed from: a */
    public static int m6256a(String str) {
        for (int i = 0; i < f4227c.length; i++) {
            if (f4227c[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }

    public TypingSpeedData() {
        this.f4231g = new Hashtable<>();
        this.f4232h = new Hashtable<>();
    }

    public TypingSpeedData(Parcel parcel) {
        mo5800a(parcel);
    }

    /* renamed from: a */
    public void mo5802a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (m6259a(i, i2, i3)) {
            if (!this.f4231g.containsKey(str)) {
                this.f4231g.put(str, (Meta[][][]) Array.newInstance(Meta.class, new int[]{f4228d, 12, 31}));
            }
            Meta meta = this.f4231g.get(str)[i][i2][i3 - 1];
            if (meta == null) {
                meta = new Meta();
                this.f4231g.get(str)[i][i2][i3 - 1] = meta;
            }
            m6257a(meta, i4, i5, i6, i7);
            if (i != 0) {
                mo5802a(str, 0, i2, i3, i4, i5, i6, i7);
            }
        }
    }

    /* renamed from: a */
    public void mo5801a(String str, int i, int i2, int i3, int i4, int i5) {
        if (m6258a(i)) {
            if (!this.f4232h.containsKey(str)) {
                this.f4232h.put(str, new Meta[f4228d]);
            }
            if (this.f4232h.get(str)[i] == null) {
                this.f4232h.get(str)[i] = new Meta();
            }
            m6257a(this.f4232h.get(str)[i], i2, i3, i4, i5);
            if (i != 0) {
                mo5801a(str, 0, i2, i3, i4, i5);
            }
        }
    }

    /* renamed from: a */
    public Meta mo5797a(String str, int i) {
        if (!m6258a(i) || !this.f4232h.containsKey(str)) {
            return null;
        }
        return this.f4232h.get(str)[i];
    }

    /* renamed from: a */
    public Meta mo5798a(String str, int i, int i2, int i3) {
        Meta[][][] metaArr;
        if (!this.f4231g.containsKey(str) || (metaArr = this.f4231g.get(str)) == null || !m6259a(i, i2, i3)) {
            return null;
        }
        return metaArr[i][i2][i3 - 1];
    }

    /* renamed from: a */
    private void m6257a(Meta meta, int i, int i2, int i3, int i4) {
        meta.f4233a += i;
        meta.f4234b += i2;
        meta.f4235c += i3;
        if (i4 > meta.f4236d) {
            meta.f4236d = i4;
        }
    }

    /* renamed from: a */
    private boolean m6259a(int i, int i2, int i3) {
        if (i >= 0 && i < f4228d && i2 >= 0 && i2 < 12 && i3 >= 1 && i3 <= 31) {
            return true;
        }
        C1017y.m5226d(C1017y.f2665B, f4229e, "Invalid parameters: mode = " + i + ", month = " + i2 + ", day = " + i3);
        return false;
    }

    /* renamed from: a */
    private boolean m6258a(int i) {
        if (i >= 0 && i < f4228d) {
            return true;
        }
        C1017y.m5226d(C1017y.f2665B, f4229e, "Invalid parameters: mode = " + i);
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4231g.size());
        for (String next : this.f4231g.keySet()) {
            parcel.writeString(next);
            Meta[][][] metaArr = this.f4231g.get(next);
            for (int i2 = 0; i2 < f4228d; i2++) {
                for (int i3 = 0; i3 < 12; i3++) {
                    for (int i4 = 0; i4 < 31; i4++) {
                        parcel.writeParcelable(metaArr[i2][i3][i4], i);
                    }
                }
            }
        }
        parcel.writeInt(this.f4232h.size());
        for (String next2 : this.f4232h.keySet()) {
            parcel.writeString(next2);
            Meta[] metaArr2 = this.f4232h.get(next2);
            for (int i5 = 0; i5 < f4228d; i5++) {
                parcel.writeParcelable(metaArr2[i5], i);
            }
        }
    }

    /* renamed from: a */
    public void mo5800a(Parcel parcel) {
        this.f4231g = new Hashtable<>();
        this.f4232h = new Hashtable<>();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if (this.f4231g.containsKey(readString)) {
                this.f4231g.remove(readString);
            }
            Meta[][][] metaArr = (Meta[][][]) Array.newInstance(Meta.class, new int[]{f4228d, 12, 31});
            for (int i2 = 0; i2 < f4228d; i2++) {
                for (int i3 = 0; i3 < 12; i3++) {
                    for (int i4 = 0; i4 < 31; i4++) {
                        metaArr[i2][i3][i4] = (Meta) parcel.readParcelable(Meta.class.getClassLoader());
                    }
                }
            }
            this.f4231g.put(readString, metaArr);
        }
        int readInt2 = parcel.readInt();
        for (int i5 = 0; i5 < readInt2; i5++) {
            String readString2 = parcel.readString();
            if (this.f4232h.containsKey(readString2)) {
                this.f4232h.remove(readString2);
            }
            Meta[] metaArr2 = new Meta[f4228d];
            for (int i6 = 0; i6 < f4228d; i6++) {
                metaArr2[i6] = (Meta) parcel.readParcelable(Meta.class.getClassLoader());
            }
            this.f4232h.put(readString2, metaArr2);
        }
    }

    /* renamed from: a */
    public void mo5799a() {
        C1017y.m5226d(C1017y.f2665B, f4229e, "Dump total data:");
        for (String next : this.f4232h.keySet()) {
            int length = this.f4232h.get(next).length;
            for (int i = 0; i < length; i++) {
                Meta meta = this.f4232h.get(next)[i];
                if (meta != null) {
                    C1017y.m5226d(C1017y.f2665B, f4229e, "language = " + next + ", mode = " + i + ", commit = " + meta.f4233a + ", keystrokes = " + meta.f4234b + ", time = " + meta.f4235c + ", top = " + meta.f4236d);
                }
            }
        }
        C1017y.m5226d(C1017y.f2665B, f4229e, "Dump daily data:");
        for (String next2 : this.f4231g.keySet()) {
            int length2 = this.f4231g.get(next2).length;
            for (int i2 = 0; i2 < length2; i2++) {
                Meta[][] metaArr = this.f4231g.get(next2)[i2];
                if (metaArr != null) {
                    C1017y.m5226d(C1017y.f2665B, f4229e, "language = " + next2 + ", mode = " + i2);
                    for (int i3 = 0; i3 < 12; i3++) {
                        for (int i4 = 0; i4 < 31; i4++) {
                            if (metaArr[i3][i4] != null) {
                                C1017y.m5226d(C1017y.f2665B, f4229e, "month = " + i3 + ", day = " + i4 + ", commit = " + metaArr[i3][i4].f4233a + ", keystrokes = " + metaArr[i3][i4].f4234b + ", time = " + metaArr[i3][i4].f4235c + ", top = " + metaArr[i3][i4].f4236d);
                            }
                        }
                    }
                }
            }
        }
    }
}
