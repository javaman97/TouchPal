package android.support.p001v4.view;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: android.support.v4.view.l */
/* compiled from: KeyEventCompat */
public class C0481l {

    /* renamed from: a */
    static final C0485d f1115a;

    /* renamed from: android.support.v4.view.l$d */
    /* compiled from: KeyEventCompat */
    interface C0485d {
        /* renamed from: a */
        int mo1632a(int i);

        /* renamed from: a */
        Object mo1633a(View view);

        /* renamed from: a */
        void mo1634a(KeyEvent keyEvent);

        /* renamed from: a */
        boolean mo1635a(int i, int i2);

        /* renamed from: a */
        boolean mo1636a(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2);

        /* renamed from: b */
        boolean mo1637b(int i);

        /* renamed from: b */
        boolean mo1638b(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.view.l$a */
    /* compiled from: KeyEventCompat */
    static class C0482a implements C0485d {

        /* renamed from: a */
        private static final int f1116a = 247;

        /* renamed from: b */
        private static final int f1117b = 247;

        C0482a() {
        }

        /* renamed from: a */
        private static int m2743a(int i, int i2, int i3, int i4, int i5) {
            boolean z = true;
            boolean z2 = (i2 & i3) != 0;
            int i6 = i4 | i5;
            if ((i2 & i6) == 0) {
                z = false;
            }
            if (z2) {
                if (!z) {
                    return i & (i6 ^ -1);
                }
                throw new IllegalArgumentException("bad arguments");
            } else if (z) {
                return i & (i3 ^ -1);
            } else {
                return i;
            }
        }

        /* renamed from: a */
        public int mo1632a(int i) {
            int i2;
            if ((i & Settings.LANGUAGE_JUST_INSTALLED) != 0) {
                i2 = i | 1;
            } else {
                i2 = i;
            }
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & Settings.UPDATE_LIVE_WORDS;
        }

        /* renamed from: a */
        public boolean mo1635a(int i, int i2) {
            if (m2743a(m2743a(mo1632a(i) & Settings.UPDATE_LIVE_WORDS, i2, 1, 64, 128), i2, 2, 16, 32) == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo1637b(int i) {
            return (mo1632a(i) & Settings.UPDATE_LIVE_WORDS) == 0;
        }

        /* renamed from: a */
        public void mo1634a(KeyEvent keyEvent) {
        }

        /* renamed from: b */
        public boolean mo1638b(KeyEvent keyEvent) {
            return false;
        }

        /* renamed from: a */
        public Object mo1633a(View view) {
            return null;
        }

        /* renamed from: a */
        public boolean mo1636a(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
            return keyEvent.dispatch(callback);
        }
    }

    /* renamed from: android.support.v4.view.l$b */
    /* compiled from: KeyEventCompat */
    static class C0483b extends C0482a {
        C0483b() {
        }

        /* renamed from: a */
        public void mo1634a(KeyEvent keyEvent) {
            C0486m.m2766a(keyEvent);
        }

        /* renamed from: b */
        public boolean mo1638b(KeyEvent keyEvent) {
            return C0486m.m2768b(keyEvent);
        }

        /* renamed from: a */
        public Object mo1633a(View view) {
            return C0486m.m2765a(view);
        }

        /* renamed from: a */
        public boolean mo1636a(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
            return C0486m.m2767a(keyEvent, callback, obj, obj2);
        }
    }

    /* renamed from: android.support.v4.view.l$c */
    /* compiled from: KeyEventCompat */
    static class C0484c extends C0483b {
        C0484c() {
        }

        /* renamed from: a */
        public int mo1632a(int i) {
            return C0487n.m2769a(i);
        }

        /* renamed from: a */
        public boolean mo1635a(int i, int i2) {
            return C0487n.m2770a(i, i2);
        }

        /* renamed from: b */
        public boolean mo1637b(int i) {
            return C0487n.m2771b(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f1115a = new C0484c();
        } else {
            f1115a = new C0482a();
        }
    }

    /* renamed from: a */
    public static int m2734a(int i) {
        return f1115a.mo1632a(i);
    }

    /* renamed from: a */
    public static boolean m2736a(int i, int i2) {
        return f1115a.mo1635a(i, i2);
    }

    /* renamed from: b */
    public static boolean m2741b(int i) {
        return f1115a.mo1637b(i);
    }

    /* renamed from: a */
    public static boolean m2738a(KeyEvent keyEvent, int i) {
        return f1115a.mo1635a(keyEvent.getMetaState(), i);
    }

    /* renamed from: a */
    public static boolean m2737a(KeyEvent keyEvent) {
        return f1115a.mo1637b(keyEvent.getMetaState());
    }

    /* renamed from: b */
    public static void m2740b(KeyEvent keyEvent) {
        f1115a.mo1634a(keyEvent);
    }

    /* renamed from: c */
    public static boolean m2742c(KeyEvent keyEvent) {
        return f1115a.mo1638b(keyEvent);
    }

    /* renamed from: a */
    public static Object m2735a(View view) {
        return f1115a.mo1633a(view);
    }

    /* renamed from: a */
    public static boolean m2739a(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
        return f1115a.mo1636a(keyEvent, callback, obj, obj2);
    }
}
