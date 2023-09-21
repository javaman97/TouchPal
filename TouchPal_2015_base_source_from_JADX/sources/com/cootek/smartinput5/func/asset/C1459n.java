package com.cootek.smartinput5.func.asset;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.asset.n */
/* compiled from: SimpleFileCertificate */
public class C1459n {

    /* renamed from: a */
    private static final String f4662a = "SimpleCertificate";

    /* renamed from: b */
    private static final String f4663b = "timestamp";

    /* renamed from: c */
    private static final String f4664c = "version";

    /* renamed from: d */
    private static final long f4665d = 0;

    /* renamed from: e */
    private static final String f4666e = "";

    /* renamed from: f */
    private static final C1459n f4667f = new C1459n(f4665d, "");

    /* renamed from: g */
    private final long f4668g;

    /* renamed from: h */
    private final String f4669h;

    public C1459n(long j, String str) {
        this.f4668g = j;
        this.f4669h = str;
    }

    /* renamed from: a */
    public static boolean m6792a(Context context, File file, File file2) {
        C1459n a;
        C1459n b = m6794b(file);
        if (b == f4667f || (a = m6791a(context, file2)) == f4667f) {
            return false;
        }
        return m6793a(b, a);
    }

    /* renamed from: a */
    private static boolean m6793a(C1459n nVar, C1459n nVar2) {
        return nVar.mo6121a(nVar2);
    }

    /* renamed from: a */
    public static C1459n m6791a(Context context, File file) {
        C1459n nVar = f4667f;
        if (file == null || !file.exists()) {
            return nVar;
        }
        return new C1459n(file.lastModified(), context.getString(R.string.optpage_version_summary));
    }

    /* renamed from: b */
    private static C1459n m6794b(File file) {
        String d;
        C1459n nVar = f4667f;
        if (!(file == null || !file.exists() || (d = C0997e.m5192d(file)) == null)) {
            try {
                JSONObject jSONObject = new JSONObject(d);
                return new C1459n(jSONObject.optLong("timestamp"), jSONObject.optString(f4664c));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6121a(C1459n nVar) {
        return this.f4668g == nVar.f4668g && TextUtils.equals(this.f4669h, nVar.f4669h);
    }

    /* renamed from: a */
    public void mo6120a(File file) {
        if (file != null) {
            if (file.exists()) {
                file.delete();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("timestamp", this.f4668g);
                jSONObject.put(f4664c, this.f4669h);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            C0997e.m5176a(file, jSONObject.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("timestamp: ").append(this.f4668g).append(" version: ").append(this.f4669h);
        return sb.toString();
    }
}
