package p018cn.sharesdk.framework.utils;

/* renamed from: cn.sharesdk.framework.utils.k */
class C0677k implements Appendable {

    /* renamed from: a */
    int f1652a = -1;

    /* renamed from: b */
    char[] f1653b = new char[2];

    /* renamed from: c */
    final /* synthetic */ Appendable f1654c;

    /* renamed from: d */
    final /* synthetic */ C0676j f1655d;

    C0677k(C0676j jVar, Appendable appendable) {
        this.f1655d = jVar;
        this.f1654c = appendable;
    }

    /* renamed from: a */
    private void m3866a(char[] cArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f1654c.append(cArr[i2]);
        }
    }

    public Appendable append(char c) {
        if (this.f1652a != -1) {
            if (!Character.isLowSurrogate(c)) {
                throw new IllegalArgumentException("Expected low surrogate character but got '" + c + "' with value " + c);
            }
            char[] a = this.f1655d.mo2510a(Character.toCodePoint((char) this.f1652a, c));
            if (a != null) {
                m3866a(a, a.length);
            } else {
                this.f1654c.append((char) this.f1652a);
                this.f1654c.append(c);
            }
            this.f1652a = -1;
        } else if (Character.isHighSurrogate(c)) {
            this.f1652a = c;
        } else if (Character.isLowSurrogate(c)) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + c + "' with value " + c);
        } else {
            char[] a2 = this.f1655d.mo2510a(c);
            if (a2 != null) {
                m3866a(a2, a2.length);
            } else {
                this.f1654c.append(c);
            }
        }
        return this;
    }

    public Appendable append(CharSequence charSequence) {
        return append(charSequence, 0, charSequence.length());
    }

    public Appendable append(CharSequence charSequence, int i, int i2) {
        int i3;
        if (i < i2) {
            if (this.f1652a != -1) {
                i3 = i + 1;
                char charAt = charSequence.charAt(i);
                if (!Character.isLowSurrogate(charAt)) {
                    throw new IllegalArgumentException("Expected low surrogate character but got " + charAt);
                }
                char[] a = this.f1655d.mo2510a(Character.toCodePoint((char) this.f1652a, charAt));
                if (a != null) {
                    m3866a(a, a.length);
                    i++;
                } else {
                    this.f1654c.append((char) this.f1652a);
                }
                this.f1652a = -1;
            } else {
                i3 = i;
            }
            while (true) {
                int a2 = this.f1655d.mo2509a(charSequence, i3, i2);
                if (a2 > i) {
                    this.f1654c.append(charSequence, i, a2);
                }
                if (a2 == i2) {
                    break;
                }
                int b = C0676j.m3862b(charSequence, a2, i2);
                if (b < 0) {
                    this.f1652a = -b;
                    break;
                }
                char[] a3 = this.f1655d.mo2510a(b);
                if (a3 != null) {
                    m3866a(a3, a3.length);
                } else {
                    m3866a(this.f1653b, Character.toChars(b, this.f1653b, 0));
                }
                i = a2 + (Character.isSupplementaryCodePoint(b) ? 2 : 1);
                i3 = i;
            }
        }
        return this;
    }
}
