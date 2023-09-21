package com.cootek.smartinput5.net;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2247G;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.ao */
/* compiled from: WebResourceUtils */
public class C2228ao {

    /* renamed from: a */
    private static C2228ao f9412a = null;

    /* renamed from: b */
    private static final String f9413b = "WebResourceUtils";

    /* renamed from: c */
    private static final String f9414c = "pages.zip";

    /* renamed from: d */
    private static final String f9415d = "md5sum.json";

    /* renamed from: e */
    private static final String f9416e = ".tmp";

    /* renamed from: f */
    private static final String f9417f = ".etag";

    /* renamed from: g */
    private static final String f9418g = ".js";

    /* renamed from: h */
    private static final String f9419h = ".css";

    /* renamed from: i */
    private static final String f9420i = ".jpg";

    /* renamed from: j */
    private static final String f9421j = ".png";

    /* renamed from: k */
    private static final String f9422k = ".gif";

    /* renamed from: l */
    private static final String f9423l = "text/javascript";

    /* renamed from: m */
    private static final String f9424m = "text/css";

    /* renamed from: n */
    private static final String f9425n = "image/jpg";

    /* renamed from: o */
    private static final String f9426o = "image/png";

    /* renamed from: p */
    private static final String f9427p = "image/gif";

    /* renamed from: q */
    private static final String f9428q = "utf-8";

    /* renamed from: r */
    private static HashMap<String, String> f9429r = new HashMap<>();

    private C2228ao(Context context) {
        if (context != null) {
            m10104c(context);
        }
    }

    /* renamed from: a */
    public static void m10096a(Context context) {
        if (f9412a == null) {
            f9412a = new C2228ao(context);
        }
    }

    /* renamed from: a */
    public static C2228ao m10094a() {
        m10096a(C1368X.m6313b());
        return f9412a;
    }

    /* renamed from: c */
    private static void m10104c(Context context) {
        File[] a;
        if (context != null && (a = C0997e.m5185a(C1466av.m6849a(context, (String) C1466av.f4695d), (FilenameFilter) new C2229ap())) != null) {
            f9429r.clear();
            for (File file : a) {
                f9429r.put(file.getName(), file.getAbsolutePath());
            }
        }
    }

    /* renamed from: b */
    public static void m10103b(Context context) {
        if (context != null) {
            String str = C1466av.f4695d + File.separator + f9414c;
            File a = C1466av.m6849a(context, C1466av.f4695d);
            C0997e.m5172a(a);
            if (a != null) {
                a.mkdir();
                File file = new File(a, f9414c);
                C0997e.m5181a(str, file, context);
                try {
                    C0990F.m5124a(file, a);
                } catch (Exception e) {
                }
                C0997e.m5195g(file);
            }
        }
    }

    /* renamed from: a */
    public void mo7756a(String str, String str2) {
        C2247G b = m10100b(str, str2);
        if (b != null) {
            new C2373x(b).mo8060a((C2373x.C2376b) new C2230aq(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10098a(C2247G g) {
        try {
            File file = new File(g.f9602d);
            File parentFile = file.getParentFile();
            File file2 = new File(parentFile, g.f9603e + f9416e);
            C0997e.m5172a(file2);
            file2.mkdir();
            C0990F.m5124a(file, file2);
            C0997e.m5195g(file);
            if (m10099a(file2)) {
                File file3 = new File(parentFile, g.f9603e);
                C0997e.m5176a(new File(file2, f9417f), g.f9605g);
                C0997e.m5172a(file3);
                file3.mkdir();
                C0997e.m5189b(file2, file3);
                m10104c(C1368X.m6313b());
            }
            C0997e.m5172a(file2);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private boolean m10099a(File file) {
        File file2 = new File(file, f9415d);
        if (!file2.exists()) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(C0997e.m5192d(file2));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("md5");
                File file3 = new File(file, string);
                if (!file3.exists() || !TextUtils.equals(string2, C0997e.m5188b(file3.getAbsolutePath()))) {
                    return false;
                }
            }
            return true;
        } catch (JSONException e) {
            return false;
        }
    }

    /* renamed from: b */
    private C2247G m10100b(String str, String str2) {
        Context b = C1368X.m6313b();
        if (b == null) {
            return null;
        }
        File a = C1466av.m6849a(b, C1466av.f4695d);
        if (!a.exists()) {
            a.mkdir();
        }
        String a2 = m10095a(str);
        return new C2247G(str, a2, a.getAbsolutePath() + File.separator + m10102b(a2), str2, C0997e.m5192d(new File((a.getAbsolutePath() + File.separator + str2) + File.separator + f9417f)));
    }

    /* renamed from: a */
    private String m10095a(String str) {
        String str2;
        if (str.indexOf(PresentConfigXmlTag.POSTFIX_FILE_PATH_ZIP) != -1) {
            return str;
        }
        int indexOf = str.indexOf(".html");
        if (indexOf != -1) {
            str2 = str.substring(0, indexOf + 5);
        } else {
            str2 = str;
        }
        if (str2.endsWith(".html")) {
            return str2.replace(".html", PresentConfigXmlTag.POSTFIX_FILE_PATH_ZIP);
        }
        return str;
    }

    /* renamed from: b */
    private String m10102b(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    /* renamed from: c */
    private boolean m10105c(String str) {
        if (f9429r == null) {
            return false;
        }
        return f9429r.containsKey(str);
    }

    /* renamed from: b */
    private InputStream m10101b(Context context, String str) {
        if (!m10105c(str) || context == null) {
            return null;
        }
        try {
            return new FileInputStream(new File(f9429r.get(str)));
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    public WebResourceResponse mo7755a(Context context, String str) {
        String str2;
        InputStream b = m10101b(context, str);
        if (b == null) {
            return null;
        }
        if (str.endsWith(f9418g)) {
            str2 = f9423l;
        } else if (str.endsWith(f9419h)) {
            str2 = f9424m;
        } else if (str.endsWith(f9420i)) {
            str2 = f9425n;
        } else if (str.endsWith(f9421j)) {
            str2 = f9426o;
        } else {
            str2 = str.endsWith(f9422k) ? f9427p : null;
        }
        if (str2 != null) {
            return new WebResourceResponse(str2, f9428q, b);
        }
        return null;
    }
}
