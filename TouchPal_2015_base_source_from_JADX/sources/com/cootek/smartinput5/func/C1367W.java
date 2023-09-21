package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.func.asset.C1460o;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.W */
/* compiled from: FileSizeFactory */
public class C1367W {

    /* renamed from: a */
    private static final String f4239a = "filesize.list";

    /* renamed from: b */
    private Context f4240b;

    /* renamed from: c */
    private JSONObject f4241c = null;

    public C1367W(Context context) {
        this.f4240b = context;
        m6275a(context);
    }

    /* renamed from: a */
    private void m6275a(Context context) {
        InputStream inputStream = null;
        if (0 == 0) {
            try {
                inputStream = C1460o.m6799b().mo6099a(context, f4239a);
            } catch (IOException e) {
                e.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }
        if (inputStream != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedInputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            }
            this.f4241c = new JSONObject(byteArrayOutputStream.toString(Utils.UTF8));
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public int mo5812a(String str) {
        if (this.f4241c == null) {
            m6275a(this.f4240b);
        }
        if (this.f4241c == null || !this.f4241c.has(str)) {
            return 0;
        }
        try {
            return this.f4241c.getInt(str);
        } catch (JSONException e) {
            return 0;
        }
    }
}
