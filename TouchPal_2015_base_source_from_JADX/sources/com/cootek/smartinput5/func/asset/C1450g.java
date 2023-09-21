package com.cootek.smartinput5.func.asset;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.func.resource.C1974m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.cootek.smartinput5.func.asset.g */
/* compiled from: ExternalAssetProcessor */
public class C1450g implements C1445b {

    /* renamed from: a */
    private C1443as f4644a;

    /* renamed from: b */
    private AssetManager f4645b;

    /* renamed from: c */
    private File f4646c;

    /* renamed from: d */
    private boolean f4647d = false;

    /* renamed from: a */
    public void mo6109a(Context context, File file) {
        String absolutePath;
        this.f4647d = true;
        this.f4646c = file;
        if (file != null && file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C1460o.f4670a).append(File.separator).append(C1974m.f6735a);
            File file2 = new File(file, sb.toString());
            if (file2.exists() && (absolutePath = file2.getAbsolutePath()) != null && new File(absolutePath).exists()) {
                this.f4644a = C1599be.m7206a(context, absolutePath, -1);
                if (this.f4644a != null) {
                    this.f4645b = this.f4644a.getAssets();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo6110a() {
        return this.f4647d;
    }

    /* renamed from: b */
    public C1443as mo6111b() {
        return this.f4644a;
    }

    /* renamed from: a */
    public InputStream mo6098a(Context context, C1443as asVar, String str) throws IOException {
        return m6751a(str);
    }

    /* renamed from: a */
    public InputStream mo6099a(Context context, String str) throws IOException {
        return m6751a(str);
    }

    /* renamed from: a */
    private InputStream m6751a(String str) throws IOException {
        if (this.f4645b != null) {
            return this.f4645b.open(str);
        }
        return null;
    }

    /* renamed from: b */
    public C1444a mo6101b(Context context, String str) throws IOException {
        return m6752b(str);
    }

    /* renamed from: b */
    public C1444a mo6100b(Context context, C1443as asVar, String str) throws IOException {
        return m6752b(str);
    }

    /* renamed from: b */
    private C1444a m6752b(String str) throws IOException {
        AssetFileDescriptor openFd;
        if (this.f4645b == null || (openFd = this.f4645b.openFd(str)) == null) {
            return null;
        }
        return new C1455j(openFd, openFd.createInputStream(), this.f4644a.mo6020a());
    }

    /* renamed from: c */
    public String[] mo6103c(Context context, String str) throws IOException {
        return m6753c(str);
    }

    /* renamed from: c */
    public String[] mo6102c(Context context, C1443as asVar, String str) throws IOException {
        return m6753c(str);
    }

    /* renamed from: c */
    private String[] m6753c(String str) throws IOException {
        String[] strArr = new String[0];
        if (this.f4645b != null) {
            this.f4645b.list(str);
        }
        return strArr;
    }

    /* renamed from: d */
    public Typeface mo6104d(Context context, C1443as asVar, String str) {
        if (this.f4645b != null) {
            return Typeface.createFromAsset(this.f4645b, str);
        }
        return null;
    }

    /* renamed from: d */
    public String mo6105d(Context context, String str) {
        String d = m6754d(str);
        if (d == null) {
            m6757g(str);
            d = m6754d(str);
        }
        return d == null ? str : d;
    }

    /* renamed from: d */
    private String m6754d(String str) {
        if (m6756f(str)) {
            return Uri.fromFile(m6755e(str)).toString();
        }
        return null;
    }

    /* renamed from: e */
    private File m6755e(String str) {
        if (this.f4646c == null || !this.f4646c.exists()) {
            return null;
        }
        return new File(this.f4646c, str);
    }

    /* renamed from: f */
    private boolean m6756f(String str) {
        File e = m6755e(str);
        return e != null && e.exists();
    }

    /* renamed from: g */
    private void m6757g(String str) {
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        if (this.f4645b != null && this.f4646c != null) {
            try {
                inputStream = this.f4645b.open(str);
            } catch (IOException e) {
                inputStream = null;
            }
            try {
                fileOutputStream = new FileOutputStream(new File(this.f4646c, str));
            } catch (FileNotFoundException e2) {
            }
            try {
                C0997e.m5178a(inputStream, (OutputStream) fileOutputStream);
            } catch (IOException e3) {
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                }
            }
        }
    }
}
