package com.facebook.ads.internal.p077h;

import android.os.AsyncTask;
import android.util.Log;
import com.cootek.smartinput5.net.cmd.C2261Q;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;

/* renamed from: com.facebook.ads.internal.h.q */
public class C3451q extends AsyncTask<String, Void, Void> {

    /* renamed from: a */
    private static final String f15004a = C3451q.class.getSimpleName();

    /* renamed from: b */
    private Map<String, String> f15005b;

    public C3451q() {
        this.f15005b = null;
    }

    public C3451q(Map<String, String> map) {
        this.f15005b = map;
    }

    /* renamed from: a */
    private String m15096a(String str, String str2, String str3) {
        if (C3456v.m15103a(str) || C3456v.m15103a(str2) || C3456v.m15103a(str3)) {
            return str;
        }
        return str + (str.contains(C2261Q.f9807m) ? C2261Q.f9808n : C2261Q.f9807m) + str2 + "=" + URLEncoder.encode(str3);
    }

    /* renamed from: a */
    private boolean m15097a(String str) {
        try {
            return C3439h.m15072b().execute(new HttpGet(str)).getStatusLine().getStatusCode() == 200;
        } catch (Exception e) {
            Log.e(f15004a, "Error opening url: " + str, e);
            return false;
        }
    }

    /* renamed from: b */
    private String m15098b(String str) {
        try {
            return m15096a(str, "analog", C3439h.m15064a(C3431b.m15044a()));
        } catch (Exception e) {
            return str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(String... strArr) {
        String str;
        String str2 = strArr[0];
        if (!C3456v.m15103a(str2) && !str2.equals("#")) {
            String b = m15098b(str2);
            if (this.f15005b != null && !this.f15005b.isEmpty()) {
                Iterator<Map.Entry<String, String>> it = this.f15005b.entrySet().iterator();
                while (true) {
                    str = b;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry next = it.next();
                    b = m15096a(str, (String) next.getKey(), this.f15005b.get(next.getValue()));
                }
                b = str;
            }
            int i = 1;
            while (true) {
                int i2 = i + 1;
                if (i > 2 || m15097a(b)) {
                    break;
                }
                i = i2;
            }
        }
        return null;
    }
}
