package com.cootek.smartinput5.plugin.twitter;

import android.widget.Toast;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;

/* renamed from: com.cootek.smartinput5.plugin.twitter.v */
/* compiled from: TwitterException */
public class C2421v extends C2407h {

    /* renamed from: a */
    public static final int f10603a = -1;

    /* renamed from: b */
    private static final String f10604b = "TwitterException";

    /* renamed from: c */
    private static final long f10605c = 6335622592392733697L;

    /* renamed from: d */
    private int f10606d;

    /* renamed from: e */
    private String f10607e;

    /* renamed from: a */
    public void mo8188a(int i) {
        this.f10606d = i;
    }

    /* renamed from: a */
    public void mo8189a(String str) {
        this.f10607e = str;
    }

    /* renamed from: a */
    public int mo8187a() {
        return this.f10606d;
    }

    /* renamed from: b */
    public String mo8190b() {
        return this.f10607e;
    }

    public void printStackTrace() {
        C1017y.m5213a(f10604b, "error code: " + this.f10606d);
        C1017y.m5213a(f10604b, "error message: " + this.f10607e);
        super.printStackTrace();
    }

    /* renamed from: a */
    public static void m11060a(C2421v vVar) {
        if (vVar != null && C1368X.m6324d()) {
            String str = null;
            switch (vVar.mo8187a()) {
                case -1:
                case 0:
                    str = C1974m.m9063a(C1368X.m6313b(), (int) R.string.twitter_connect_failed);
                    break;
                case SearchStatusData.RESPONSE_STATUS_REVOKED /*401*/:
                    str = C1974m.m9063a(C1368X.m6313b(), (int) R.string.twitter_check_clock);
                    break;
            }
            if (str != null) {
                Toast.makeText(C1368X.m6313b(), str, 1).show();
            }
        }
    }
}
