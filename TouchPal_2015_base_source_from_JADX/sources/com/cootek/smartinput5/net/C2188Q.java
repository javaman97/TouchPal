package com.cootek.smartinput5.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.net.Q */
/* compiled from: NetworkManager */
public class C2188Q {

    /* renamed from: a */
    private static C2188Q f9247a = new C2188Q();

    /* renamed from: e */
    private static final int f9248e = 0;

    /* renamed from: f */
    private static final String f9249f = "wifi";

    /* renamed from: g */
    private static final String f9250g = "mobile";

    /* renamed from: h */
    private static final String f9251h = "none";

    /* renamed from: b */
    private Boolean f9252b;

    /* renamed from: c */
    private Boolean f9253c;

    /* renamed from: d */
    private ArrayList<C2189a> f9254d = new ArrayList<>();

    /* renamed from: i */
    private Handler f9255i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f9256j = "";

    /* renamed from: com.cootek.smartinput5.net.Q$a */
    /* compiled from: NetworkManager */
    public interface C2189a {
        /* renamed from: a */
        void mo7690a();
    }

    private C2188Q() {
        mo7684d();
        m9856k();
    }

    /* renamed from: a */
    public static C2188Q m9853a() {
        return f9247a;
    }

    /* renamed from: k */
    private boolean m9856k() {
        if (!C1368X.m6324d()) {
            return false;
        }
        this.f9255i = new C2190R(this, C1368X.m6313b().getMainLooper());
        return true;
    }

    /* renamed from: a */
    public void mo7679a(C2189a aVar) {
        this.f9254d.add(aVar);
    }

    /* renamed from: b */
    public void mo7682b(C2189a aVar) {
        this.f9254d.remove(aVar);
    }

    /* renamed from: b */
    public void mo7681b() {
        Iterator<C2189a> it = this.f9254d.iterator();
        while (it.hasNext()) {
            it.next().mo7690a();
        }
    }

    /* renamed from: c */
    public String mo7683c() {
        if (this.f9255i != null && this.f9255i.hasMessages(0) && this.f9256j != null) {
            return this.f9256j;
        }
        if (Settings.isInitialized()) {
            return Settings.getInstance().getStringSetting(88);
        }
        return "";
    }

    /* renamed from: a */
    public void mo7680a(String str) {
        this.f9256j = str;
        if (this.f9255i == null) {
            m9856k();
        }
        if (this.f9255i != null) {
            Message obtainMessage = this.f9255i.obtainMessage(0);
            obtainMessage.obj = str;
            this.f9255i.removeMessages(0);
            this.f9255i.sendMessage(obtainMessage);
        }
    }

    /* renamed from: d */
    public synchronized void mo7684d() {
        this.f9252b = null;
        this.f9253c = null;
    }

    /* renamed from: e */
    public synchronized boolean mo7685e() {
        if (this.f9253c == null) {
            this.f9253c = Boolean.valueOf(m9857l());
        }
        return this.f9253c.booleanValue();
    }

    /* renamed from: f */
    public synchronized boolean mo7686f() {
        if (this.f9252b == null) {
            this.f9252b = Boolean.valueOf(m9858m());
        }
        return this.f9252b.booleanValue();
    }

    /* renamed from: g */
    public String mo7687g() {
        if (!mo7686f()) {
            return f9251h;
        }
        if (mo7685e()) {
            return "wifi";
        }
        return "mobile";
    }

    /* renamed from: h */
    public String mo7688h() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C1368X.m6313b().getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return null;
                }
                return activeNetworkInfo.getTypeName();
            } catch (Exception e) {
                return null;
            }
        } catch (IllegalArgumentException e2) {
            return null;
        }
    }

    /* renamed from: l */
    private boolean m9857l() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C1368X.m6313b().getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }

    /* renamed from: m */
    private boolean m9858m() {
        try {
            NetworkInfo[] networkInfoArr = null;
            try {
                networkInfoArr = ((ConnectivityManager) C1368X.m6313b().getSystemService("connectivity")).getAllNetworkInfo();
            } catch (Exception e) {
            }
            if (networkInfoArr == null) {
                return false;
            }
            for (NetworkInfo state : networkInfoArr) {
                if (state.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m9855i() {
        switch (((TelephonyManager) C1368X.m6313b().getSystemService("phone")).getNetworkType()) {
            case 1:
                return true;
            case 2:
                return true;
            case 4:
                return true;
            case 7:
                return true;
            case 11:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    public boolean mo7689j() {
        if (!m9853a().mo7686f()) {
            return false;
        }
        if (C1593bR.m7162a().f5075a) {
            if (m9853a().mo7685e() || !m9855i()) {
                return true;
            }
            return false;
        } else if (!m9853a().mo7685e()) {
            return false;
        }
        return true;
    }
}
