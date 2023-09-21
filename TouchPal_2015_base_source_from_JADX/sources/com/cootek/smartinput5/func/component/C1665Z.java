package com.cootek.smartinput5.func.component;

/* renamed from: com.cootek.smartinput5.func.component.Z */
/* compiled from: UsrDicChecker */
public class C1665Z {

    /* renamed from: a */
    public static final int f5434a = 0;

    /* renamed from: b */
    public static final int f5435b = 1;

    /* renamed from: c */
    public static final int f5436c = 2;

    /* renamed from: d */
    public static final int f5437d = 3;

    /* renamed from: e */
    public static final int f5438e = 4;

    /* renamed from: f */
    private boolean f5439f;

    /* renamed from: g */
    private boolean f5440g;

    /* renamed from: h */
    private boolean f5441h;

    /* renamed from: i */
    private boolean f5442i;

    /* renamed from: j */
    private boolean f5443j;

    /* renamed from: a */
    public boolean mo6519a() {
        if (this.f5442i || this.f5440g || this.f5441h || this.f5442i || this.f5443j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo6520a(int i) {
        boolean z;
        switch (i) {
            case 0:
                if (this.f5442i) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 1:
                if (this.f5440g) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 2:
                if (this.f5441h) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 3:
                if (this.f5442i) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 4:
                if (this.f5443j) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            default:
                z = true;
                break;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo6518a(int i, boolean z) {
        boolean z2 = true;
        switch (i) {
            case 0:
                if (z) {
                    z2 = false;
                }
                this.f5442i = z2;
                return;
            case 1:
                if (z) {
                    z2 = false;
                }
                this.f5440g = z2;
                return;
            case 2:
                if (z) {
                    z2 = false;
                }
                this.f5441h = z2;
                return;
            case 3:
                if (z) {
                    z2 = false;
                }
                this.f5442i = z2;
                return;
            case 4:
                if (z) {
                    z2 = false;
                }
                this.f5443j = z2;
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void mo6521b() {
        this.f5439f = false;
        this.f5440g = false;
        this.f5441h = false;
        this.f5442i = false;
        this.f5443j = false;
    }
}
