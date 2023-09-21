package android.support.p001v4.p011f;

import android.os.SystemClock;
import android.view.KeyEvent;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: android.support.v4.f.k */
/* compiled from: TransportPerformer */
public abstract class C0243k {

    /* renamed from: a */
    static final int f637a = 1;

    /* renamed from: b */
    static final int f638b = 2;

    /* renamed from: c */
    static final int f639c = 3;

    /* renamed from: d */
    static final int f640d = -1;

    /* renamed from: e */
    static final int f641e = -2;

    /* renamed from: f */
    static final int f642f = -3;

    /* renamed from: a */
    public abstract void mo771a();

    /* renamed from: a */
    public abstract void mo773a(long j);

    /* renamed from: b */
    public abstract void mo775b();

    /* renamed from: c */
    public abstract void mo777c();

    /* renamed from: d */
    public abstract long mo778d();

    /* renamed from: e */
    public abstract long mo779e();

    /* renamed from: f */
    public abstract boolean mo780f();

    /* renamed from: g */
    public int mo781g() {
        return 100;
    }

    /* renamed from: h */
    public int mo782h() {
        return 60;
    }

    /* renamed from: a */
    public boolean mo774a(int i, KeyEvent keyEvent) {
        switch (i) {
            case Settings.FUNCTIONBAR_SETTINGS /*79*/:
            case Settings.INPUT_TOP_SPEED_CHINESE /*85*/:
                if (!mo780f()) {
                    mo771a();
                    break;
                } else {
                    mo775b();
                    break;
                }
            case Settings.INPUT_TOP_SPEED_OTHER /*86*/:
                mo777c();
                break;
            case 126:
                mo771a();
                break;
            case 127:
                mo775b();
                break;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo776b(int i, KeyEvent keyEvent) {
        return true;
    }

    /* renamed from: a */
    public void mo772a(int i) {
        int i2 = 0;
        switch (i) {
            case -1:
                i2 = 127;
                break;
        }
        if (i2 != 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            mo774a(i2, new KeyEvent(uptimeMillis, uptimeMillis, 0, i2, 0));
            mo776b(i2, new KeyEvent(uptimeMillis, uptimeMillis, 1, i2, 0));
        }
    }
}
