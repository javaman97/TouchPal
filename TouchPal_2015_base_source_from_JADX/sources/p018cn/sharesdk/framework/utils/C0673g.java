package p018cn.sharesdk.framework.utils;

/* renamed from: cn.sharesdk.framework.utils.g */
public class C0673g extends C0676j {

    /* renamed from: a */
    private static final char[] f1647a = {'+'};

    /* renamed from: b */
    private static final char[] f1648b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    private final boolean f1649c;

    /* renamed from: d */
    private final boolean[] f1650d;

    public C0673g(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        } else {
            this.f1649c = z;
            this.f1650d = m3857a(str);
        }
    }

    /* renamed from: a */
    private static boolean[] m3857a(String str) {
        char[] charArray = str.toCharArray();
        int i = 122;
        for (char max : charArray) {
            i = Math.max(max, i);
        }
        boolean[] zArr = new boolean[(i + 1)];
        for (int i2 = 48; i2 <= 57; i2++) {
            zArr[i2] = true;
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            zArr[i3] = true;
        }
        for (int i4 = 97; i4 <= 122; i4++) {
            zArr[i4] = true;
        }
        for (char c : charArray) {
            zArr[c] = true;
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2509a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt >= this.f1650d.length || !this.f1650d[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public char[] mo2510a(int i) {
        if (i < this.f1650d.length && this.f1650d[i]) {
            return null;
        }
        if (i == 32 && this.f1649c) {
            return f1647a;
        }
        if (i <= 127) {
            char[] cArr = new char[3];
            cArr[0] = '%';
            cArr[2] = f1648b[i & 15];
            cArr[1] = f1648b[i >>> 4];
            return cArr;
        } else if (i <= 2047) {
            char[] cArr2 = new char[6];
            cArr2[0] = '%';
            cArr2[3] = '%';
            cArr2[5] = f1648b[i & 15];
            int i2 = i >>> 4;
            cArr2[4] = f1648b[(i2 & 3) | 8];
            int i3 = i2 >>> 2;
            cArr2[2] = f1648b[i3 & 15];
            cArr2[1] = f1648b[(i3 >>> 4) | 12];
            return cArr2;
        } else if (i <= 65535) {
            char[] cArr3 = new char[9];
            cArr3[0] = '%';
            cArr3[1] = 'E';
            cArr3[3] = '%';
            cArr3[6] = '%';
            cArr3[8] = f1648b[i & 15];
            int i4 = i >>> 4;
            cArr3[7] = f1648b[(i4 & 3) | 8];
            int i5 = i4 >>> 2;
            cArr3[5] = f1648b[i5 & 15];
            int i6 = i5 >>> 4;
            cArr3[4] = f1648b[(i6 & 3) | 8];
            cArr3[2] = f1648b[i6 >>> 2];
            return cArr3;
        } else if (i <= 1114111) {
            char[] cArr4 = new char[12];
            cArr4[0] = '%';
            cArr4[1] = 'F';
            cArr4[3] = '%';
            cArr4[6] = '%';
            cArr4[9] = '%';
            cArr4[11] = f1648b[i & 15];
            int i7 = i >>> 4;
            cArr4[10] = f1648b[(i7 & 3) | 8];
            int i8 = i7 >>> 2;
            cArr4[8] = f1648b[i8 & 15];
            int i9 = i8 >>> 4;
            cArr4[7] = f1648b[(i9 & 3) | 8];
            int i10 = i9 >>> 2;
            cArr4[5] = f1648b[i10 & 15];
            int i11 = i10 >>> 4;
            cArr4[4] = f1648b[(i11 & 3) | 8];
            cArr4[2] = f1648b[(i11 >>> 2) & 7];
            return cArr4;
        } else {
            throw new IllegalArgumentException("Invalid unicode character value " + i);
        }
    }

    public String escape(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= this.f1650d.length || !this.f1650d[charAt]) {
                return mo2512a(str, i);
            }
        }
        return str;
    }
}
