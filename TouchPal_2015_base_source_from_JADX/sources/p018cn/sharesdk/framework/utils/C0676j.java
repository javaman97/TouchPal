package p018cn.sharesdk.framework.utils;

/* renamed from: cn.sharesdk.framework.utils.j */
public abstract class C0676j implements Escaper {

    /* renamed from: a */
    private static final ThreadLocal<char[]> f1651a = new C0678l();

    /* renamed from: a */
    private static final char[] m3861a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    /* renamed from: b */
    protected static final int m3862b(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + charAt + " at index " + (i3 - 1));
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + charAt2 + " at index " + i3);
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2509a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int b = m3862b(charSequence, i, i2);
            if (b < 0 || mo2510a(b) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(b) ? 2 : 1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo2512a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        char[] cArr = f1651a.get();
        int i3 = 0;
        while (i < length) {
            int b = m3862b(str, i, length);
            if (b < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] a = mo2510a(b);
            if (a != null) {
                int i4 = i - i2;
                int length2 = i3 + i4 + a.length;
                if (cArr.length < length2) {
                    cArr = m3861a(cArr, i3, length2 + (length - i) + 32);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, cArr, i3);
                    i3 += i4;
                }
                if (a.length > 0) {
                    System.arraycopy(a, 0, cArr, i3, a.length);
                    i3 += a.length;
                }
            }
            int i5 = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
            i = mo2509a((CharSequence) str, i5, length);
            i2 = i5;
        }
        int i6 = length - i2;
        if (i6 > 0) {
            int i7 = i6 + i3;
            if (cArr.length < i7) {
                cArr = m3861a(cArr, i3, i7);
            }
            str.getChars(i2, length, cArr, i3);
            i3 = i7;
        }
        return new String(cArr, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract char[] mo2510a(int i);

    public Appendable escape(Appendable appendable) {
        C0674h.m3860a(appendable);
        return new C0677k(this, appendable);
    }

    public String escape(String str) {
        int length = str.length();
        int a = mo2509a((CharSequence) str, 0, length);
        return a == length ? str : mo2512a(str, a);
    }
}
