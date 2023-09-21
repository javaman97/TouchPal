package com.cootek.smartinput5.p066ui;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.WarningManager;

/* renamed from: com.cootek.smartinput5.ui.aN */
/* compiled from: HardKeyProcessor */
public class C2674aN implements WarningManager.IWarningListener {

    /* renamed from: a */
    static final int f11995a = 0;

    /* renamed from: b */
    static final int f11996b = 1;

    /* renamed from: c */
    static final int f11997c = 2;

    /* renamed from: d */
    static final int f11998d = 3;

    /* renamed from: e */
    private static final String f11999e = "HardKeyProcessor";

    /* renamed from: f */
    private static final int[][] f12000f = {new int[]{2, 67}, new int[]{2, 21}, new int[]{2, 22}, new int[]{2, 19}, new int[]{2, 20}, new int[]{1, 21}, new int[]{1, 22}, new int[]{1, 20}, new int[]{1, 19}};

    /* renamed from: g */
    private static final int f12001g = -1;

    /* renamed from: h */
    private Engine f12002h;

    /* renamed from: i */
    private TouchPalIME f12003i;

    /* renamed from: j */
    private int f12004j = 1;

    /* renamed from: k */
    private boolean[] f12005k = new boolean[(KeyEvent.getMaxKeyCode() + 1)];

    /* renamed from: l */
    private boolean f12006l;

    /* renamed from: m */
    private boolean f12007m;

    public C2674aN(Engine engine, TouchPalIME touchPalIME) {
        this.f12002h = engine;
        this.f12003i = touchPalIME;
        int length = this.f12005k.length;
        for (int i = 0; i < length; i++) {
            this.f12005k[i] = false;
        }
    }

    /* renamed from: a */
    public boolean mo8906a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20 || keyCode == 21 || keyCode == 22 || keyCode == 23) {
            return true;
        }
        return keyEvent.isSystem();
    }

    /* renamed from: b */
    public boolean mo8909b(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode < 7 || keyCode > 77 || mo8906a(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m12340c(int i, KeyEvent keyEvent) {
        int i2;
        int i3 = 0;
        while (i3 < f12000f.length) {
            int i4 = f12000f[i3][0];
            int i5 = f12000f[i3][1];
            if ((keyEvent.getMetaState() & i4) == 0 || i5 != i) {
                i3++;
            } else {
                InputConnection currentInputConnection = this.f12003i.getCurrentInputConnection();
                if (currentInputConnection != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (i4 == 2) {
                        i2 = 57;
                    } else {
                        i2 = 59;
                    }
                    currentInputConnection.sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, i2, 0, 0, 0, 0, 6));
                    this.f12003i.sendDownUpKeyEvents(i);
                    currentInputConnection.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, i2, 0, 0, 0, 0, 6));
                    if (i4 == 2) {
                        this.f12004j = 1;
                    } else {
                        this.f12002h.clearShiftState();
                    }
                    this.f12003i.updateIcon();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo8905a(int i, KeyEvent keyEvent) {
        if (i > KeyEvent.getMaxKeyCode() || i <= 0) {
            return false;
        }
        if (i == 82) {
            this.f12007m = true;
            return false;
        } else if (this.f12007m) {
            if (i != 29) {
                return false;
            }
            this.f12005k[82] = true;
            this.f12005k[i] = true;
            return false;
        } else if (!Engine.isInitialized()) {
            return false;
        } else {
            if (!Engine.getInstance().isHardKeyMode() && (!Engine.getInstance().isSoftKeyMode() || i > 23 || i < 19)) {
                return false;
            }
            int repeatCount = keyEvent.getRepeatCount();
            boolean c = m12340c(i, keyEvent);
            if (!c) {
                if (repeatCount == 0) {
                    c = m12343d(i, keyEvent);
                } else {
                    c = m12345e(i, keyEvent);
                }
            }
            if (c) {
                this.f12005k[i] = c;
            }
            return this.f12005k[i];
        }
    }

    /* renamed from: b */
    public boolean mo8908b(int i, KeyEvent keyEvent) {
        if (i > KeyEvent.getMaxKeyCode() || i <= 0) {
            return false;
        }
        if (i == 82) {
            this.f12007m = false;
        }
        boolean z = this.f12005k[i];
        this.f12005k[i] = false;
        return z;
    }

    /* renamed from: d */
    private boolean m12343d(int i, KeyEvent keyEvent) {
        if (i == 57 || i == 58) {
            if (this.f12002h.isHardKeyDisabled()) {
                return false;
            }
            m12344e();
            return true;
        } else if (62 == i) {
            if ((keyEvent.getMetaState() & 1) != 0) {
                this.f12002h.commitKeyEvent(Engine.KEYCODE_FUN_LANG);
                return true;
            }
            if (mo8910c()) {
                i = 63;
                m12346f();
            }
            return m12339a(i, 0, 0);
        } else if (66 == i && (keyEvent.getMetaState() & 1) != 0) {
            this.f12002h.commitKeyEvent(Engine.KEYCODE_FUN_DICT);
            this.f12002h.clearShiftState();
            return true;
        } else if (!m12341c(m12342d(keyEvent))) {
            return m12339a(i, 0, 0);
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private boolean m12345e(int i, KeyEvent keyEvent) {
        if (67 == i) {
            return m12339a(i, 2, 0);
        }
        if (62 == i) {
            return m12339a(i, 2, 0);
        }
        return false;
    }

    /* renamed from: f */
    private boolean m12347f(int i, KeyEvent keyEvent) {
        int i2;
        if (mo8910c() || keyEvent.isAltPressed()) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (((char) keyEvent.getUnicodeChar(i2)) == 0) {
            return false;
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private boolean m12341c(KeyEvent keyEvent) {
        if (this.f12002h.isHardKeyDisabled()) {
            return false;
        }
        char unicodeChar = (char) keyEvent.getUnicodeChar();
        if (unicodeChar == 0) {
            return false;
        }
        m12346f();
        String valueOf = String.valueOf(unicodeChar);
        int keyId = this.f12002h.getKeyId(valueOf);
        if (keyId != -1) {
            this.f12002h.fireKeyOperation(keyId, 0);
        } else {
            boolean isShiftPressed = keyEvent.isShiftPressed();
            if (Build.VERSION.SDK_INT >= 11) {
                isShiftPressed ^= keyEvent.isCapsLockOn();
            }
            this.f12002h.fireInputMultiOperation(valueOf, isShiftPressed);
            int keyId2 = Engine.getInstance().getKeyId(Engine.KEY_NAME_HARD_CHARACTER_LISTENER);
            if (keyId2 != -1) {
                this.f12002h.fireKeyOperation(keyId2, 0);
            }
        }
        this.f12002h.processEvent();
        return true;
    }

    /* renamed from: a */
    private boolean m12339a(int i, int i2, int i3) {
        int i4;
        if (this.f12002h.isHardKeyDisabled()) {
            return false;
        }
        this.f12006l = true;
        if (60 == i) {
            i4 = 59;
        } else {
            i4 = i;
        }
        if (58 == i4) {
            i4 = 57;
        }
        this.f12002h.fireHardKeyOperation(i4, i2, i3);
        this.f12002h.processEvent();
        return this.f12006l;
    }

    /* renamed from: e */
    private void m12344e() {
        if (this.f12004j == 1) {
            this.f12004j = 2;
        } else if (this.f12004j == 2) {
            this.f12004j = 3;
        } else {
            this.f12004j = 1;
        }
        this.f12003i.updateIcon();
    }

    /* renamed from: f */
    private void m12346f() {
        if (this.f12004j == 2) {
            this.f12004j = 1;
        }
        this.f12003i.updateIcon();
    }

    /* renamed from: a */
    public boolean mo8904a() {
        int triStatus = this.f12002h.getTriStatus(0);
        if (triStatus == 2 || triStatus == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo8907b() {
        if (this.f12002h.getTriStatus(0) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo8910c() {
        return this.f12004j == 2 || this.f12004j == 3;
    }

    /* renamed from: d */
    public boolean mo8911d() {
        return this.f12004j == 3;
    }

    /* renamed from: d */
    private KeyEvent m12342d(KeyEvent keyEvent) {
        if (!mo8910c() || (keyEvent.getMetaState() & 2) != 0) {
            return keyEvent;
        }
        return new KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), keyEvent.getKeyCode(), keyEvent.getRepeatCount(), 18, keyEvent.getDeviceId(), keyEvent.getScanCode(), keyEvent.getFlags());
    }

    public void updateWarning(int i, int i2) {
        this.f12006l = i == 0;
    }
}
