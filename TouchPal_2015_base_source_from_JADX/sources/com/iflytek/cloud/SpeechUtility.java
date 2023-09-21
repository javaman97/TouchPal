package com.iflytek.cloud;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Base64;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p046b.C1132b;
import com.iflytek.cloud.p078a.p080b.C3981d;
import com.iflytek.cloud.p078a.p081c.C3986a;
import com.iflytek.cloud.p078a.p081c.C3987b;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p078a.p082d.p083a.C3991b;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import com.iflytek.speech.SpeechComponent;
import com.iflytek.speech.UtilityConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpeechUtility extends C3981d {

    /* renamed from: c */
    private static SpeechUtility f16250c = null;

    /* renamed from: a */
    protected C3981d.C3982a f16251a = C3981d.C3982a.f16308c;

    /* renamed from: d */
    private ArrayList<SpeechComponent> f16252d = new ArrayList<>();

    /* renamed from: e */
    private int f16253e = -1;

    /* renamed from: f */
    private Context f16254f = null;

    /* renamed from: g */
    private boolean f16255g = false;

    /* renamed from: h */
    private C3972a f16256h = null;

    /* renamed from: com.iflytek.cloud.SpeechUtility$a */
    private class C3972a extends BroadcastReceiver {
        private C3972a() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            String dataString = intent.getDataString();
            String concat = String.valueOf("package:").concat(UtilityConfig.COMPONENT_PKG);
            if (("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_REPLACED".equals(action)) && concat.equals(dataString) && SpeechUtility.getUtility() != null) {
                SpeechUtility.getUtility().checkServiceInstalled();
            }
        }
    }

    private SpeechUtility(Context context, String str) {
        this.f16254f = context.getApplicationContext();
        setParameter(SpeechConstant.PARAMS, str);
        String parameter = getParameter(SpeechConstant.ENGINE_MODE);
        if (SpeechConstant.MODE_MSC.equals(parameter)) {
            this.f16251a = C3981d.C3982a.MSC;
        } else if (SpeechConstant.MODE_PLUS.equals(parameter)) {
            this.f16251a = C3981d.C3982a.PLUS;
        }
        m16930b();
        m16934d();
        m16935e();
    }

    /* renamed from: a */
    private void m16929a(String str) {
        if (!TextUtils.isEmpty(str)) {
            PackageManager packageManager = this.f16254f.getPackageManager();
            Intent intent = new Intent(str);
            intent.setPackage(UtilityConfig.COMPONENT_PKG);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, Settings.AUTO_BACKUP_DICTIONARY_TIME);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                for (ResolveInfo next : queryIntentServices) {
                    SpeechComponent b = m16931b(next.serviceInfo.packageName);
                    if (b != null) {
                        try {
                            for (String addEngine : next.serviceInfo.metaData.getString(UtilityConfig.METADATA_KEY_ENGINE_TYPE).split(",")) {
                                b.addEngine(addEngine);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private int m16930b() {
        if (!MSC.isLoaded()) {
            return ErrorCode.ERROR_ENGINE_NOT_SUPPORTED;
        }
        C3990a.m17030a("SpeechUtility start login");
        SpeechError a = new C3987b(this.f16254f, this.f16305b).mo14696a(this.f16305b.mo14719d("usr"), this.f16305b.mo14719d("pwd"));
        if (a == null) {
            return 0;
        }
        return a.getErrorCode();
    }

    /* renamed from: b */
    private SpeechComponent m16931b(String str) {
        boolean z;
        SpeechComponent speechComponent;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<SpeechComponent> it = this.f16252d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (str.equals(it.next().getPackageName())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            speechComponent = new SpeechComponent(str);
            this.f16252d.add(speechComponent);
        } else {
            speechComponent = null;
        }
        return speechComponent;
    }

    /* renamed from: c */
    private boolean m16932c() {
        if (!MSC.isLoaded()) {
            return false;
        }
        C3991b.m17034a("QMSPLogOut", (String) null);
        if (MSC.isLoaded()) {
            return C3986a.m17015a();
        }
        return true;
    }

    /* renamed from: c */
    private boolean m16933c(String str) {
        PackageManager packageManager = this.f16254f.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(UtilityConfig.COMPONENT_PKG);
        return packageManager.queryIntentActivities(intent, 1).size() > 0;
    }

    public static SpeechUtility createUtility(Context context, String str) {
        if (f16250c == null) {
            f16250c = new SpeechUtility(context, str);
        }
        return f16250c;
    }

    /* renamed from: d */
    private void m16934d() {
        checkServiceInstalled();
        m16929a(UtilityConfig.ACTION_SPEECH_RECOGNIZER);
        m16929a(UtilityConfig.ACTION_SPEECH_SYNTHESIZER);
        m16929a(UtilityConfig.ACTION_SPEECH_UNDERSTANDER);
        m16929a(UtilityConfig.ACTION_TEXT_UNDERSTANDER);
        m16929a(UtilityConfig.ACTION_SPEECH_WAKEUP);
    }

    /* renamed from: e */
    private void m16935e() {
        this.f16256h = new C3972a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        this.f16254f.registerReceiver(this.f16256h, intentFilter);
    }

    public static SpeechUtility getUtility() {
        return f16250c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14606a() {
        try {
            return this.f16254f.getPackageManager().getPackageInfo(UtilityConfig.COMPONENT_PKG, 0) != null;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public boolean checkServiceInstalled() {
        boolean z = false;
        int i = -1;
        try {
            PackageInfo packageInfo = this.f16254f.getPackageManager().getPackageInfo(UtilityConfig.COMPONENT_PKG, 0);
            if (packageInfo != null) {
                z = true;
                i = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (!(z == this.f16255g && this.f16253e == i)) {
            this.f16255g = z;
            this.f16253e = i;
            if (SpeechRecognizer.getRecognizer() != null) {
                SpeechRecognizer.getRecognizer().mo14595a(this.f16254f);
            }
        }
        return z;
    }

    public boolean destroy() {
        boolean z = true;
        if (f16250c != null) {
            z = m16932c();
        }
        if (z) {
            f16250c = null;
            C3990a.m17030a(" SpeechUtility destory success,mInstance=null");
        }
        if (this.f16256h != null) {
            this.f16254f.unregisterReceiver(this.f16256h);
        }
        return z;
    }

    public String getComponentUrl() {
        StringBuffer stringBuffer = new StringBuffer(UtilityConfig.COMPONENT_URL);
        UtilityConfig.appendHttpParam(stringBuffer, C1132b.f3175g, Base64.encodeToString(UtilityConfig.getComponentUrlParam(this.f16254f).getBytes(), 0));
        UtilityConfig.appendHttpParam(stringBuffer, "version", "1.0");
        return stringBuffer.toString();
    }

    public C3981d.C3982a getEngineMode() {
        return this.f16251a;
    }

    public String getParameter(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f16305b.mo14721f(str)) {
            return super.getParameter(str);
        }
        if (!MSC.isLoaded()) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("utf-8");
            MSCSessionInfo mSCSessionInfo = new MSCSessionInfo();
            if (MSC.QMSPGetParam(bytes, mSCSessionInfo) == 0) {
                return new String(mSCSessionInfo.buffer, "utf-8");
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getServiceVersion() {
        if (this.f16253e < 0) {
            try {
                PackageInfo packageInfo = this.f16254f.getPackageManager().getPackageInfo(UtilityConfig.COMPONENT_PKG, 0);
                if (packageInfo != null) {
                    this.f16253e = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return this.f16253e;
    }

    public int openEngineSettings(String str) {
        try {
            Intent intent = new Intent();
            intent.setPackage(UtilityConfig.COMPONENT_PKG);
            String str2 = UtilityConfig.COMPONENT_PKG;
            if (SpeechConstant.ENG_TTS.equals(str) && m16933c(UtilityConfig.SETTINGS_ACTION_TTS)) {
                str2 = UtilityConfig.SETTINGS_ACTION_TTS;
            } else if (SpeechConstant.ENG_ASR.equals(str) && m16933c(UtilityConfig.SETTINGS_ACTION_ASR)) {
                str2 = UtilityConfig.SETTINGS_ACTION_ASR;
            } else if (m16933c(UtilityConfig.SETTINGS_ACTION_MAIN)) {
                str2 = UtilityConfig.SETTINGS_ACTION_MAIN;
            }
            intent.setAction(str2);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            this.f16254f.startActivity(intent);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return ErrorCode.ERROR_ENGINE_NOT_SUPPORTED;
        }
    }

    public String[] queryAvailableEngines() {
        this.f16252d.clear();
        m16934d();
        ArrayList arrayList = new ArrayList();
        Iterator<SpeechComponent> it = this.f16252d.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getEngines());
        }
        String[] strArr = new String[arrayList.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                return strArr;
            }
            strArr[i2] = (String) arrayList.get(i2);
            i = i2 + 1;
        }
    }

    public boolean setParameter(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        super.setParameter(str, str2);
        if (!MSC.isLoaded() || SpeechConstant.PARAMS.equals(str)) {
            return true;
        }
        try {
            return MSC.QMSPSetParam(str.getBytes("utf-8"), str2.getBytes("utf-8")) == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
