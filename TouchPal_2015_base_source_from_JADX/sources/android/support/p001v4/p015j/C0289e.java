package android.support.p001v4.p015j;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: android.support.v4.j.e */
/* compiled from: TextDirectionHeuristicsCompat */
public class C0289e {

    /* renamed from: a */
    public static final C0288d f728a = new C0295e((C0293c) null, false);

    /* renamed from: b */
    public static final C0288d f729b = new C0295e((C0293c) null, true);

    /* renamed from: c */
    public static final C0288d f730c = new C0295e(C0292b.f740a, false);

    /* renamed from: d */
    public static final C0288d f731d = new C0295e(C0292b.f740a, true);

    /* renamed from: e */
    public static final C0288d f732e = new C0295e(C0291a.f737a, false);

    /* renamed from: f */
    public static final C0288d f733f = C0296f.f743a;

    /* renamed from: g */
    private static final int f734g = 0;

    /* renamed from: h */
    private static final int f735h = 1;

    /* renamed from: i */
    private static final int f736i = 2;

    /* renamed from: android.support.v4.j.e$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C0293c {
        /* renamed from: a */
        int mo857a(CharSequence charSequence, int i, int i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m1164c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m1165d(int i) {
        switch (i) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }

    /* renamed from: android.support.v4.j.e$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C0294d implements C0288d {

        /* renamed from: a */
        private final C0293c f741a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo858a();

        public C0294d(C0293c cVar) {
            this.f741a = cVar;
        }

        /* renamed from: a */
        public boolean mo856a(char[] cArr, int i, int i2) {
            return mo855a((CharSequence) CharBuffer.wrap(cArr), i, i2);
        }

        /* renamed from: a */
        public boolean mo855a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f741a == null) {
                return mo858a();
            } else {
                return m1169b(charSequence, i, i2);
            }
        }

        /* renamed from: b */
        private boolean m1169b(CharSequence charSequence, int i, int i2) {
            switch (this.f741a.mo857a(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return mo858a();
            }
        }
    }

    /* renamed from: android.support.v4.j.e$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0295e extends C0294d {

        /* renamed from: a */
        private final boolean f742a;

        private C0295e(C0293c cVar, boolean z) {
            super(cVar);
            this.f742a = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo858a() {
            return this.f742a;
        }
    }

    /* renamed from: android.support.v4.j.e$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0292b implements C0293c {

        /* renamed from: a */
        public static final C0292b f740a = new C0292b();

        /* renamed from: a */
        public int mo857a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0289e.m1165d(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }

        private C0292b() {
        }
    }

    /* renamed from: android.support.v4.j.e$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0291a implements C0293c {

        /* renamed from: a */
        public static final C0291a f737a = new C0291a(true);

        /* renamed from: b */
        public static final C0291a f738b = new C0291a(false);

        /* renamed from: c */
        private final boolean f739c;

        /* renamed from: a */
        public int mo857a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            boolean z = false;
            while (i < i3) {
                switch (C0289e.m1164c(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (!this.f739c) {
                            z = true;
                            break;
                        } else {
                            return 0;
                        }
                    case 1:
                        if (this.f739c) {
                            z = true;
                            break;
                        } else {
                            return 1;
                        }
                }
                i++;
            }
            if (!z) {
                return 2;
            }
            if (!this.f739c) {
                return 0;
            }
            return 1;
        }

        private C0291a(boolean z) {
            this.f739c = z;
        }
    }

    /* renamed from: android.support.v4.j.e$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0296f extends C0294d {

        /* renamed from: a */
        public static final C0296f f743a = new C0296f();

        public C0296f() {
            super((C0293c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo858a() {
            if (C0297f.m1175a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }
}
