package android.support.p001v4.p015j;

import java.util.Locale;

/* renamed from: android.support.v4.j.a */
/* compiled from: BidiFormatter */
public final class C0279a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C0288d f695a = C0289e.f730c;

    /* renamed from: b */
    private static final char f696b = '‪';

    /* renamed from: c */
    private static final char f697c = '‫';

    /* renamed from: d */
    private static final char f698d = '‬';

    /* renamed from: e */
    private static final char f699e = '‎';

    /* renamed from: f */
    private static final char f700f = '‏';

    /* renamed from: g */
    private static final String f701g = Character.toString(f699e);

    /* renamed from: h */
    private static final String f702h = Character.toString(f700f);

    /* renamed from: i */
    private static final String f703i = "";

    /* renamed from: j */
    private static final int f704j = 2;

    /* renamed from: k */
    private static final int f705k = 2;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C0279a f706l = new C0279a(false, 2, f695a);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C0279a f707m = new C0279a(true, 2, f695a);

    /* renamed from: q */
    private static final int f708q = -1;

    /* renamed from: r */
    private static final int f709r = 0;

    /* renamed from: s */
    private static final int f710s = 1;

    /* renamed from: n */
    private final boolean f711n;

    /* renamed from: o */
    private final int f712o;

    /* renamed from: p */
    private final C0288d f713p;

    /* renamed from: android.support.v4.j.a$a */
    /* compiled from: BidiFormatter */
    public static final class C0281a {

        /* renamed from: a */
        private boolean f714a;

        /* renamed from: b */
        private int f715b;

        /* renamed from: c */
        private C0288d f716c;

        public C0281a() {
            m1136b(C0279a.m1124c(Locale.getDefault()));
        }

        public C0281a(boolean z) {
            m1136b(z);
        }

        public C0281a(Locale locale) {
            m1136b(C0279a.m1124c(locale));
        }

        /* renamed from: b */
        private void m1136b(boolean z) {
            this.f714a = z;
            this.f716c = C0279a.f695a;
            this.f715b = 2;
        }

        /* renamed from: a */
        public C0281a mo847a(boolean z) {
            if (z) {
                this.f715b |= 2;
            } else {
                this.f715b &= -3;
            }
            return this;
        }

        /* renamed from: a */
        public C0281a mo846a(C0288d dVar) {
            this.f716c = dVar;
            return this;
        }

        /* renamed from: c */
        private static C0279a m1137c(boolean z) {
            return z ? C0279a.f707m : C0279a.f706l;
        }

        /* renamed from: a */
        public C0279a mo848a() {
            if (this.f715b == 2 && this.f716c == C0279a.f695a) {
                return m1137c(this.f714a);
            }
            return new C0279a(this.f714a, this.f715b, this.f716c);
        }
    }

    /* renamed from: a */
    public static C0279a m1117a() {
        return new C0281a().mo848a();
    }

    /* renamed from: a */
    public static C0279a m1119a(boolean z) {
        return new C0281a(z).mo848a();
    }

    /* renamed from: a */
    public static C0279a m1118a(Locale locale) {
        return new C0281a(locale).mo848a();
    }

    private C0279a(boolean z, int i, C0288d dVar) {
        this.f711n = z;
        this.f712o = i;
        this.f713p = dVar;
    }

    /* renamed from: b */
    public boolean mo844b() {
        return this.f711n;
    }

    /* renamed from: c */
    public boolean mo845c() {
        return (this.f712o & 2) != 0;
    }

    /* renamed from: b */
    private String m1120b(String str, C0288d dVar) {
        boolean a = dVar.mo855a((CharSequence) str, 0, str.length());
        if (!this.f711n && (a || m1122c(str) == 1)) {
            return f701g;
        }
        if (!this.f711n || (a && m1122c(str) != -1)) {
            return "";
        }
        return f702h;
    }

    /* renamed from: c */
    private String m1123c(String str, C0288d dVar) {
        boolean a = dVar.mo855a((CharSequence) str, 0, str.length());
        if (!this.f711n && (a || m1125d(str) == 1)) {
            return f701g;
        }
        if (!this.f711n || (a && m1125d(str) != -1)) {
            return "";
        }
        return f702h;
    }

    /* renamed from: a */
    public boolean mo842a(String str) {
        return this.f713p.mo855a((CharSequence) str, 0, str.length());
    }

    /* renamed from: a */
    public String mo840a(String str, C0288d dVar, boolean z) {
        boolean a = dVar.mo855a((CharSequence) str, 0, str.length());
        StringBuilder sb = new StringBuilder();
        if (mo845c() && z) {
            sb.append(m1123c(str, a ? C0289e.f729b : C0289e.f728a));
        }
        if (a != this.f711n) {
            sb.append(a ? f697c : f696b);
            sb.append(str);
            sb.append(f698d);
        } else {
            sb.append(str);
        }
        if (z) {
            sb.append(m1120b(str, a ? C0289e.f729b : C0289e.f728a));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo839a(String str, C0288d dVar) {
        return mo840a(str, dVar, true);
    }

    /* renamed from: a */
    public String mo841a(String str, boolean z) {
        return mo840a(str, this.f713p, z);
    }

    /* renamed from: b */
    public String mo843b(String str) {
        return mo840a(str, this.f713p, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m1124c(Locale locale) {
        return C0297f.m1175a(locale) == 1;
    }

    /* renamed from: c */
    private static int m1122c(String str) {
        return new C0282b(str, false).mo850b();
    }

    /* renamed from: d */
    private static int m1125d(String str) {
        return new C0282b(str, false).mo849a();
    }

    /* renamed from: android.support.v4.j.a$b */
    /* compiled from: BidiFormatter */
    private static class C0282b {

        /* renamed from: a */
        private static final int f717a = 1792;

        /* renamed from: b */
        private static final byte[] f718b = new byte[f717a];

        /* renamed from: c */
        private final String f719c;

        /* renamed from: d */
        private final boolean f720d;

        /* renamed from: e */
        private final int f721e;

        /* renamed from: f */
        private int f722f;

        /* renamed from: g */
        private char f723g;

        static {
            for (int i = 0; i < f717a; i++) {
                f718b[i] = Character.getDirectionality(i);
            }
        }

        C0282b(String str, boolean z) {
            this.f719c = str;
            this.f720d = z;
            this.f721e = str.length();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo849a() {
            this.f722f = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f722f < this.f721e && i == 0) {
                switch (mo851c()) {
                    case 0:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        } else {
                            return -1;
                        }
                    case 1:
                    case 2:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        } else {
                            return 1;
                        }
                    case 9:
                        break;
                    case 14:
                    case 15:
                        i3++;
                        i2 = -1;
                        break;
                    case 16:
                    case 17:
                        i3++;
                        i2 = 1;
                        break;
                    case 18:
                        i3--;
                        i2 = 0;
                        break;
                    default:
                        i = i3;
                        break;
                }
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f722f > 0) {
                switch (mo852d()) {
                    case 14:
                    case 15:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        i3++;
                        break;
                }
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo850b() {
            this.f722f = this.f721e;
            int i = 0;
            int i2 = 0;
            while (this.f722f > 0) {
                switch (mo852d()) {
                    case 0:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            } else {
                                i = i2;
                                break;
                            }
                        } else {
                            return -1;
                        }
                    case 1:
                    case 2:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            } else {
                                i = i2;
                                break;
                            }
                        } else {
                            return 1;
                        }
                    case 9:
                        break;
                    case 14:
                    case 15:
                        if (i != i2) {
                            i2--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (i != i2) {
                            i2--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        i2++;
                        break;
                    default:
                        if (i != 0) {
                            break;
                        } else {
                            i = i2;
                            break;
                        }
                }
            }
            return 0;
        }

        /* renamed from: a */
        private static byte m1141a(char c) {
            return c < f717a ? f718b[c] : Character.getDirectionality(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public byte mo851c() {
            this.f723g = this.f719c.charAt(this.f722f);
            if (Character.isHighSurrogate(this.f723g)) {
                int codePointAt = Character.codePointAt(this.f719c, this.f722f);
                this.f722f += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f722f++;
            byte a = m1141a(this.f723g);
            if (!this.f720d) {
                return a;
            }
            if (this.f723g == '<') {
                return m1142e();
            }
            if (this.f723g == '&') {
                return m1144g();
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public byte mo852d() {
            this.f723g = this.f719c.charAt(this.f722f - 1);
            if (Character.isLowSurrogate(this.f723g)) {
                int codePointBefore = Character.codePointBefore(this.f719c, this.f722f);
                this.f722f -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f722f--;
            byte a = m1141a(this.f723g);
            if (!this.f720d) {
                return a;
            }
            if (this.f723g == '>') {
                return m1143f();
            }
            if (this.f723g == ';') {
                return m1145h();
            }
            return a;
        }

        /* renamed from: e */
        private byte m1142e() {
            int i = this.f722f;
            while (this.f722f < this.f721e) {
                String str = this.f719c;
                int i2 = this.f722f;
                this.f722f = i2 + 1;
                this.f723g = str.charAt(i2);
                if (this.f723g == '>') {
                    return 12;
                }
                if (this.f723g == '\"' || this.f723g == '\'') {
                    char c = this.f723g;
                    while (this.f722f < this.f721e) {
                        String str2 = this.f719c;
                        int i3 = this.f722f;
                        this.f722f = i3 + 1;
                        char charAt = str2.charAt(i3);
                        this.f723g = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.f722f = i;
            this.f723g = '<';
            return 13;
        }

        /* renamed from: f */
        private byte m1143f() {
            int i = this.f722f;
            while (this.f722f > 0) {
                String str = this.f719c;
                int i2 = this.f722f - 1;
                this.f722f = i2;
                this.f723g = str.charAt(i2);
                if (this.f723g == '<') {
                    return 12;
                }
                if (this.f723g == '>') {
                    break;
                } else if (this.f723g == '\"' || this.f723g == '\'') {
                    char c = this.f723g;
                    while (this.f722f > 0) {
                        String str2 = this.f719c;
                        int i3 = this.f722f - 1;
                        this.f722f = i3;
                        char charAt = str2.charAt(i3);
                        this.f723g = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.f722f = i;
            this.f723g = '>';
            return 13;
        }

        /* renamed from: g */
        private byte m1144g() {
            while (this.f722f < this.f721e) {
                String str = this.f719c;
                int i = this.f722f;
                this.f722f = i + 1;
                char charAt = str.charAt(i);
                this.f723g = charAt;
                if (charAt == ';') {
                    return 12;
                }
            }
            return 12;
        }

        /* renamed from: h */
        private byte m1145h() {
            int i = this.f722f;
            while (this.f722f > 0) {
                String str = this.f719c;
                int i2 = this.f722f - 1;
                this.f722f = i2;
                this.f723g = str.charAt(i2);
                if (this.f723g != '&') {
                    if (this.f723g == ';') {
                        break;
                    }
                } else {
                    return 12;
                }
            }
            this.f722f = i;
            this.f723g = ';';
            return 13;
        }
    }
}
