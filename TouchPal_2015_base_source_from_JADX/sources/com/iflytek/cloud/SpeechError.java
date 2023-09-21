package com.iflytek.cloud;

import com.cootek.smartinput5.func.C1389aD;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.resource.Resource;

public class SpeechError extends Exception {
    private static final long serialVersionUID = 4434424251478985596L;

    /* renamed from: a */
    private int f16238a;

    /* renamed from: b */
    private String f16239b;

    public SpeechError(int i) {
        int i2 = 11;
        this.f16238a = 0;
        this.f16239b = "";
        this.f16238a = i;
        if (i >= 20001) {
            if (this.f16238a < 30000) {
                if (this.f16238a == 20001) {
                    i2 = 1;
                } else if (this.f16238a == 20002) {
                    i2 = 2;
                } else if (this.f16238a == 20003) {
                    i2 = 3;
                } else if (this.f16238a == 20004) {
                    i2 = 5;
                } else if (this.f16238a == 20005) {
                    i2 = 10;
                } else if (this.f16238a == 20006) {
                    i2 = 9;
                } else if (this.f16238a == 20007) {
                    i2 = 12;
                } else if (this.f16238a != 20008) {
                    i2 = this.f16238a == 20009 ? 13 : this.f16238a == 20010 ? 14 : this.f16238a == 20012 ? 7 : this.f16238a == 21003 ? 28 : (this.f16238a == 21002 || this.f16238a == 21001) ? 29 : 30;
                }
            }
            i2 = 3;
        } else if (this.f16238a != 10118) {
            if (10106 == this.f16238a || 10107 == this.f16238a || 10124 == this.f16238a) {
                C3990a.m17031a("sdk errorcode", this.f16238a + "");
                i2 = 7;
            } else if (this.f16238a == 10110) {
                i2 = 32;
            } else if (this.f16238a == 10111) {
                i2 = 28;
            } else if (this.f16238a >= 10200 && this.f16238a < 10300) {
                i2 = 3;
            } else if (this.f16238a == 10117 || this.f16238a == 10101) {
                i2 = 16;
            } else if (this.f16238a == 10113) {
                i2 = 17;
            } else if (this.f16238a >= 10400 && this.f16238a <= 10407) {
                i2 = 18;
            } else if (this.f16238a >= 11000 && this.f16238a < 11099) {
                i2 = this.f16238a == 11005 ? 23 : this.f16238a == 11006 ? 24 : 18;
            } else if (this.f16238a == 10129) {
                i2 = 19;
            } else if (this.f16238a == 10109) {
                i2 = 20;
            } else if (this.f16238a == 10702) {
                i2 = 21;
            } else if (this.f16238a >= 10500 && this.f16238a < 10600) {
                i2 = 22;
            } else if (this.f16238a >= 11200 && this.f16238a <= 11250) {
                i2 = 25;
            } else if (this.f16238a < 14000 || this.f16238a > 14006) {
                if (this.f16238a >= 16000 && this.f16238a <= 16006) {
                    i2 = 31;
                }
                i2 = 3;
            } else {
                i2 = 31;
            }
        }
        this.f16239b = Resource.getErrorDescription(i2);
    }

    public SpeechError(int i, String str) {
        this.f16238a = 0;
        this.f16239b = "";
        this.f16238a = i;
        this.f16239b = str;
    }

    public SpeechError(Exception exc) {
        this.f16238a = 0;
        this.f16239b = "";
        this.f16238a = ErrorCode.ERROR_UNKNOWN;
        this.f16239b = exc.toString();
    }

    public int getErrorCode() {
        return this.f16238a;
    }

    public String getErrorDescription() {
        return this.f16239b;
    }

    public String getHtmlDescription(boolean z) {
        String str = this.f16239b + "...";
        if (!z) {
            return str;
        }
        return ((str + "<br>(") + Resource.getErrorTag(0) + ":") + this.f16238a + ")";
    }

    public String getPlainDescription(boolean z) {
        String str = this.f16239b;
        if (!z) {
            return str;
        }
        return ((str + C1389aD.f4374j) + "(" + Resource.getErrorTag(0) + ":") + this.f16238a + ")";
    }

    public String toString() {
        return getPlainDescription(true);
    }
}
