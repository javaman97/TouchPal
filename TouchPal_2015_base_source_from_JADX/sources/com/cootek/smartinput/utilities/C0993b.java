package com.cootek.smartinput.utilities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput.utilities.b */
/* compiled from: CustomExceptionHandler */
public class C0993b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final String f2606a = "crash_log";

    /* renamed from: b */
    public static final int f2607b = 0;

    /* renamed from: c */
    public static final int f2608c = 1;

    /* renamed from: d */
    private static int f2609d = 0;

    /* renamed from: e */
    private static String f2610e;

    /* renamed from: f */
    private Context f2611f;

    /* renamed from: g */
    private Thread.UncaughtExceptionHandler f2612g;

    /* renamed from: h */
    private final String f2613h;

    public C0993b(Context context) throws IllegalAccessException {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C0993b) {
            throw new IllegalAccessException();
        }
        this.f2612g = defaultUncaughtExceptionHandler;
        this.f2611f = context.getApplicationContext();
        this.f2613h = "crashlog@cootek.cn";
    }

    /* renamed from: a */
    public static void m5159a(String str) {
        f2610e = str;
    }

    /* renamed from: a */
    public static void m5157a(int i) {
        f2609d = i;
    }

    /* renamed from: a */
    public static void m5156a() {
        f2610e = null;
        f2609d = 0;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        boolean z = true;
        m5162b();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer.append("Manufacturer: ").append(Build.MANUFACTURER).append(C0911j.f2473c);
        stringBuffer.append("Model: ").append(Build.MODEL).append(C0911j.f2473c);
        stringBuffer.append("Release: ").append(Build.VERSION.RELEASE).append(C0911j.f2473c);
        stringBuffer.append("CPU_ABI: ").append(Build.CPU_ABI).append(C0911j.f2473c);
        stringBuffer.append("Version: ").append(C1974m.m9063a(this.f2611f, (int) R.string.optpage_version_summary)).append(C0911j.f2473c);
        stringBuffer.append("PackageName: ").append(this.f2611f.getPackageName()).append(C0911j.f2473c);
        stringBuffer.append("System APP: ").append((this.f2611f.getApplicationInfo().flags & 1) > 0).append(C0911j.f2473c);
        if (f2609d == 1) {
            try {
                String mapLibraryName = System.mapLibraryName(C1974m.m9063a(this.f2611f, (int) R.string.lib_filename_smartinput_buildin));
                File file = new File(m5163c(), mapLibraryName);
                StringBuffer append = stringBuffer.append("Exist ").append(mapLibraryName).append(": ");
                if (file == null || !file.exists()) {
                    z = false;
                }
                append.append(z).append(C0911j.f2473c);
            } catch (Exception e) {
            }
        }
        Throwable th2 = null;
        Throwable th3 = th;
        while (th3 != null) {
            stringBuffer.append("\nException: ").append(th3.getClass().getName()).append(C0911j.f2473c);
            stringBuffer.append("Cause: ").append(th3.getCause()).append(C0911j.f2473c);
            stringBuffer.append("Message: ").append(th3.getMessage()).append("\n\n");
            StackTraceElement[] stackTrace = th3.getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append("at " + stackTrace[i].toString() + C0911j.f2473c);
            }
            Throwable th4 = th3;
            th3 = th3.getCause();
            th2 = th4;
        }
        if (th != null) {
            try {
                if (th.getCause() == null || th2 == null) {
                    stringBuffer2.append(th.getClass().getName());
                    if (th.getMessage() != null) {
                        stringBuffer2.append(": ").append(th.getMessage());
                    }
                } else {
                    stringBuffer2.append("Caused by: ").append(th2.getClass().getName());
                }
                C1246d.m6010a(this.f2611f).mo4590a(stringBuffer2.toString(), stringBuffer.toString());
            } catch (Exception e2) {
            }
        }
        String str = "Touchpal Keyboard V" + C1974m.m9063a(this.f2611f, (int) R.string.optpage_version_summary) + " online crashlog";
        String stringBuffer3 = stringBuffer.toString();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f2613h});
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", stringBuffer3);
            intent.setFlags(Engine.EXCEPTION_ERROR);
            try {
                m5158a(intent);
            } catch (Exception e3) {
            }
            Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + this.f2613h));
            intent2.setFlags(Engine.EXCEPTION_ERROR);
            ActivityInfo resolveActivityInfo = intent2.resolveActivityInfo(this.f2611f.getPackageManager(), 65536);
            if (resolveActivityInfo != null) {
                intent.setPackage(resolveActivityInfo.packageName);
                if (m5160a(intent, this.f2611f)) {
                    this.f2611f.startActivity(intent);
                }
            }
        } catch (Exception e4) {
        }
        m5156a();
        this.f2612g.uncaughtException(thread, th);
    }

    /* renamed from: b */
    private void m5162b() {
        C1466av.m6852b(this.f2611f, C1466av.f4710s);
        if (C1466av.m6854d(this.f2611f, C1466av.f4711t)) {
            C1466av.m6852b(this.f2611f, C1466av.f4712u);
        }
    }

    /* renamed from: a */
    private void m5158a(Intent intent) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        if (f2609d == 1) {
            try {
                File file = new File(m5163c(), System.mapLibraryName(C1974m.m9063a(this.f2611f, (int) R.string.lib_filename_smartinput_buildin)));
                if (file != null && file.exists()) {
                    File file2 = new File(m5164d(), file.getName());
                    C0997e.m5173a(file, file2);
                    try {
                        arrayList.add(Uri.fromFile(file2));
                    } catch (NullPointerException e) {
                    }
                }
                PackageInfo packageInfo = null;
                try {
                    packageInfo = this.f2611f.getPackageManager().getPackageInfo(this.f2611f.getPackageName(), 64);
                } catch (PackageManager.NameNotFoundException e2) {
                }
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr != null) {
                        for (int i = 0; i < signatureArr.length; i++) {
                            stringBuffer.append("---Signature[").append(i).append("]:---").append(C0911j.f2473c);
                            stringBuffer.append(m5155a(signatureArr[i])).append(C0911j.f2473c);
                        }
                    }
                }
            } catch (Exception e3) {
            }
        }
        if (!TextUtils.isEmpty(f2610e)) {
            stringBuffer.append("\nExtra Info:\n").append(f2610e).append(C0911j.f2473c);
        }
        if (stringBuffer.length() > 0) {
            try {
                arrayList.add(Uri.fromFile(m5161b(stringBuffer.toString())));
            } catch (NullPointerException e4) {
            }
        }
        try {
            File file3 = new File(C1358O.m6234a(C1358O.f4191b), f2606a);
            C1584bI.m7137a(file3);
            arrayList.add(Uri.fromFile(file3));
        } catch (Exception e5) {
        }
        if (arrayList.size() > 0) {
            intent.setType("application/octet-stream");
            if (arrayList.size() > 1) {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                return;
            }
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
        }
    }

    /* renamed from: a */
    private boolean m5160a(Intent intent, Context context) {
        if (intent == null || context == null || context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private String m5163c() {
        Field field = null;
        try {
            field = ApplicationInfo.class.getField("nativeLibraryDir");
        } catch (NoSuchFieldException | SecurityException e) {
        }
        if (field != null) {
            try {
                return (String) field.get(this.f2611f.getApplicationInfo());
            } catch (IllegalAccessException | IllegalArgumentException e2) {
            }
        }
        return new File(this.f2611f.getFilesDir().getParentFile(), "lib").getAbsolutePath();
    }

    /* renamed from: a */
    private String m5155a(Signature signature) {
        X509Certificate x509Certificate;
        if (signature == null) {
            return null;
        }
        try {
            x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Certificate for: ").append(x509Certificate.getSubjectDN()).append(";\n");
        stringBuffer.append("Certificate issued by: ").append(x509Certificate.getIssuerDN()).append(";\n");
        stringBuffer.append("Certificate Serial Number: ").append(x509Certificate.getSerialNumber().toString(16)).append(";\n");
        return stringBuffer.toString();
    }

    /* renamed from: d */
    private String m5164d() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return this.f2611f.getCacheDir().getAbsolutePath();
        }
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "TouchPalv5" + File.separator + C1358O.f4201l;
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
            file = new File(str);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* renamed from: b */
    private File m5161b(String str) {
        File file = new File(m5164d(), "CrashInfo");
        C0997e.m5176a(file, str);
        return file;
    }
}
