package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3802s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.common.data.d */
public final class C3525d implements SafeParcelable {
    public static final C3528e CREATOR = new C3528e();

    /* renamed from: Z */
    private static final HashMap<CursorWindow, Throwable> f15263Z = null;

    /* renamed from: aa */
    private static final Object f15264aa = new Object();

    /* renamed from: ai */
    private static final C3527a f15265ai = new C3527a(new String[0], (String) null) {
    };

    /* renamed from: ab */
    private final int f15266ab;

    /* renamed from: ac */
    private final String[] f15267ac;

    /* renamed from: ad */
    Bundle f15268ad;

    /* renamed from: ae */
    private final CursorWindow[] f15269ae;

    /* renamed from: af */
    private final Bundle f15270af;

    /* renamed from: ag */
    int[] f15271ag;

    /* renamed from: ah */
    int f15272ah;
    boolean mClosed;

    /* renamed from: p */
    private final int f15273p;

    /* renamed from: com.google.android.gms.common.data.d$a */
    public static class C3527a {
        /* access modifiers changed from: private */

        /* renamed from: ac */
        public final String[] f15274ac;
        /* access modifiers changed from: private */

        /* renamed from: aj */
        public final ArrayList<HashMap<String, Object>> f15275aj;

        /* renamed from: ak */
        private final String f15276ak;

        /* renamed from: al */
        private final HashMap<Object, Integer> f15277al;

        /* renamed from: am */
        private boolean f15278am;

        /* renamed from: an */
        private String f15279an;

        private C3527a(String[] strArr, String str) {
            this.f15274ac = (String[]) C3802s.m16678d(strArr);
            this.f15275aj = new ArrayList<>();
            this.f15276ak = str;
            this.f15277al = new HashMap<>();
            this.f15278am = false;
            this.f15279an = null;
        }
    }

    C3525d(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.f15266ab = i;
        this.f15267ac = strArr;
        this.f15269ae = cursorWindowArr;
        this.f15273p = i2;
        this.f15270af = bundle;
    }

    private C3525d(C3527a aVar, int i, Bundle bundle) {
        this(aVar.f15274ac, m15355a(aVar), i, bundle);
    }

    public C3525d(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.mClosed = false;
        this.f15266ab = 1;
        this.f15267ac = (String[]) C3802s.m16678d(strArr);
        this.f15269ae = (CursorWindow[]) C3802s.m16678d(cursorWindowArr);
        this.f15273p = i;
        this.f15270af = bundle;
        mo10987h();
    }

    /* renamed from: a */
    public static C3525d m15352a(int i, Bundle bundle) {
        return new C3525d(f15265ai, i, bundle);
    }

    /* renamed from: a */
    private static void m15353a(CursorWindow cursorWindow) {
    }

    /* renamed from: a */
    private void m15354a(String str, int i) {
        if (this.f15268ad == null || !this.f15268ad.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f15272ah) {
            throw new CursorIndexOutOfBoundsException(i, this.f15272ah);
        }
    }

    /* renamed from: a */
    private static CursorWindow[] m15355a(C3527a aVar) {
        if (aVar.f15274ac.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList c = aVar.f15275aj;
        int size = c.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        CursorWindow[] cursorWindowArr = {cursorWindow};
        cursorWindow.setNumColumns(aVar.f15274ac.length);
        int i = 0;
        while (i < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    throw new RuntimeException("Cursor window out of memory");
                }
                Map map = (Map) c.get(i);
                for (int i2 = 0; i2 < aVar.f15274ac.length; i2++) {
                    String str = aVar.f15274ac[i2];
                    Object obj = map.get(str);
                    if (obj == null) {
                        cursorWindow.putNull(i, i2);
                    } else if (obj instanceof String) {
                        cursorWindow.putString((String) obj, i, i2);
                    } else if (obj instanceof Long) {
                        cursorWindow.putLong(((Long) obj).longValue(), i, i2);
                    } else if (obj instanceof Integer) {
                        cursorWindow.putLong((long) ((Integer) obj).intValue(), i, i2);
                    } else if (obj instanceof Boolean) {
                        cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i, i2);
                    } else if (obj instanceof byte[]) {
                        cursorWindow.putBlob((byte[]) obj, i, i2);
                    } else {
                        throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj);
                    }
                }
                i++;
            } catch (RuntimeException e) {
                cursorWindow.close();
                throw e;
            }
        }
        return cursorWindowArr;
    }

    /* renamed from: f */
    public static C3525d m15356f(int i) {
        return m15352a(i, (Bundle) null);
    }

    /* renamed from: a */
    public long mo10974a(String str, int i, int i2) {
        m15354a(str, i);
        return this.f15269ae[i2].getLong(i - this.f15271ag[i2], this.f15268ad.getInt(str));
    }

    /* renamed from: a */
    public void mo10975a(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        m15354a(str, i);
        this.f15269ae[i2].copyStringToBuffer(i - this.f15271ag[i2], this.f15268ad.getInt(str), charArrayBuffer);
    }

    /* renamed from: b */
    public int mo10976b(String str, int i, int i2) {
        m15354a(str, i);
        return this.f15269ae[i2].getInt(i - this.f15271ag[i2], this.f15268ad.getInt(str));
    }

    /* renamed from: c */
    public String mo10977c(String str, int i, int i2) {
        m15354a(str, i);
        return this.f15269ae[i2].getString(i - this.f15271ag[i2], this.f15268ad.getInt(str));
    }

    public void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (int i = 0; i < this.f15269ae.length; i++) {
                    this.f15269ae[i].close();
                    m15353a(this.f15269ae[i]);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo10979d(String str, int i, int i2) {
        m15354a(str, i);
        return Long.valueOf(this.f15269ae[i2].getLong(i - this.f15271ag[i2], this.f15268ad.getInt(str))).longValue() == 1;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo10981e(int i) {
        int i2 = 0;
        C3802s.m16672a(i >= 0 && i < this.f15272ah);
        while (true) {
            if (i2 >= this.f15271ag.length) {
                break;
            } else if (i < this.f15271ag[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.f15271ag.length ? i2 - 1 : i2;
    }

    /* renamed from: e */
    public byte[] mo10982e(String str, int i, int i2) {
        m15354a(str, i);
        return this.f15269ae[i2].getBlob(i - this.f15271ag[i2], this.f15268ad.getInt(str));
    }

    /* renamed from: f */
    public Uri mo10983f(String str, int i, int i2) {
        String c = mo10977c(str, i, i2);
        if (c == null) {
            return null;
        }
        return Uri.parse(c);
    }

    /* renamed from: g */
    public boolean mo10984g(String str, int i, int i2) {
        m15354a(str, i);
        return this.f15269ae[i2].isNull(i - this.f15271ag[i2], this.f15268ad.getInt(str));
    }

    public int getCount() {
        return this.f15272ah;
    }

    public int getStatusCode() {
        return this.f15273p;
    }

    /* renamed from: h */
    public void mo10987h() {
        this.f15268ad = new Bundle();
        for (int i = 0; i < this.f15267ac.length; i++) {
            this.f15268ad.putInt(this.f15267ac[i], i);
        }
        this.f15271ag = new int[this.f15269ae.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f15269ae.length; i3++) {
            this.f15271ag[i3] = i2;
            i2 += this.f15269ae[i3].getNumRows();
        }
        this.f15272ah = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo10988i() {
        return this.f15266ab;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String[] mo10990j() {
        return this.f15267ac;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public CursorWindow[] mo10991k() {
        return this.f15269ae;
    }

    /* renamed from: l */
    public Bundle mo10992l() {
        return this.f15270af;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3528e.m15373a(this, parcel, i);
    }
}
