package p018cn.sharesdk.sina.weibo;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import android.text.TextUtils;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.lang.reflect.Method;
import p018cn.sharesdk.framework.authorize.C0625e;
import p018cn.sharesdk.framework.authorize.C0626f;

/* renamed from: cn.sharesdk.sina.weibo.d */
public class C0690d extends C0626f implements ServiceConnection {

    /* renamed from: d */
    private String f1668d;

    /* renamed from: e */
    private String f1669e;

    /* renamed from: f */
    private String[] f1670f;

    public C0690d(C0625e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    private boolean m3886a(String str, String str2) {
        boolean z = true;
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        intent.putExtra(JavascriptHandler.SHARE_PARAM_APPKEY, this.f1668d);
        intent.putExtra("redirectUri", this.f1669e);
        if (this.f1670f != null && this.f1670f.length > 0) {
            intent.putExtra("scope", TextUtils.join(",", this.f1670f));
        }
        if (!m3887b(intent)) {
            return false;
        }
        try {
            this.f1496a.startActivityForResult(intent, this.f1497b);
        } catch (Throwable th) {
            z = false;
        }
        this.f1496a.getContext().getApplicationContext().unbindService(this);
        return z;
    }

    /* renamed from: b */
    private boolean m3887b(Intent intent) {
        ResolveInfo resolveActivity = this.f1496a.getContext().getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null) {
            return false;
        }
        try {
            for (Signature charsString : this.f1496a.getContext().getPackageManager().getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures) {
                if ("30820295308201fea00302010202044b4ef1bf300d06092a864886f70d010105050030818d310b300906035504061302434e3110300e060355040813074265694a696e673110300e060355040713074265694a696e67312c302a060355040a132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c7464312c302a060355040b132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c74643020170d3130303131343130323831355a180f32303630303130323130323831355a30818d310b300906035504061302434e3110300e060355040813074265694a696e673110300e060355040713074265694a696e67312c302a060355040a132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c7464312c302a060355040b132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c746430819f300d06092a864886f70d010101050003818d00308189028181009d367115bc206c86c237bb56c8e9033111889b5691f051b28d1aa8e42b66b7413657635b44786ea7e85d451a12a82a331fced99c48717922170b7fc9bc1040753c0d38b4cf2b22094b1df7c55705b0989441e75913a1a8bd2bc591aa729a1013c277c01c98cbec7da5ad7778b2fad62b85ac29ca28ced588638c98d6b7df5a130203010001300d06092a864886f70d0101050500038181000ad4b4c4dec800bd8fd2991adfd70676fce8ba9692ae50475f60ec468d1b758a665e961a3aedbece9fd4d7ce9295cd83f5f19dc441a065689d9820faedbb7c4a4c4635f5ba1293f6da4b72ed32fb8795f736a20c95cda776402099054fccefb4a1a558664ab8d637288feceba9508aa907fc1fe2b1ae5a0dec954ed831c0bea4".equals(charsString.toCharsString())) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: c */
    private void m3888c(Intent intent) {
        if (this.f1498c != null) {
            String stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("error_type");
            }
            if (stringExtra == null) {
                this.f1498c.onComplete(intent.getExtras());
            } else if (stringExtra.equals("access_denied") || stringExtra.equals("OAuthAccessDeniedException")) {
                this.f1498c.onCancel();
            } else {
                String stringExtra2 = intent.getStringExtra("error_description");
                if (stringExtra2 != null) {
                    stringExtra = stringExtra + ": " + stringExtra2;
                }
                this.f1498c.onFailed(new Throwable(stringExtra));
            }
        }
    }

    /* renamed from: d */
    private void m3889d(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("error");
            Throwable th = new Throwable(stringExtra + " (" + intent.getIntExtra(C2250J.f9627c, -1) + ")");
            if (this.f1498c != null) {
                this.f1498c.onFailed(th);
            }
        } else if (this.f1498c != null) {
            this.f1498c.onCancel();
        }
    }

    /* renamed from: a */
    public void mo2050a() {
        if (!this.f1496a.getContext().getApplicationContext().bindService(new Intent("com.sina.weibo.remotessoservice"), this, 1)) {
            this.f1496a.finish();
            if (this.f1498c != null) {
                this.f1498c.onFailed(new Throwable());
            }
        }
    }

    /* renamed from: a */
    public void mo2051a(int i, int i2, Intent intent) {
        this.f1496a.finish();
        if (i == this.f1497b) {
            switch (i2) {
                case -1:
                    m3888c(intent);
                    return;
                case 0:
                    m3889d(intent);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo2610a(String str, String str2, String[] strArr) {
        this.f1668d = str;
        this.f1669e = str2;
        this.f1670f = strArr;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            Class<?> cls = Class.forName("com.sina.sso.RemoteSSO$Stub");
            Method method = cls.getMethod("asInterface", new Class[]{IBinder.class});
            method.setAccessible(true);
            Object invoke = method.invoke((Object) null, new Object[]{iBinder});
            Method method2 = cls.getMethod("getPackageName", new Class[0]);
            method2.setAccessible(true);
            String valueOf = String.valueOf(method2.invoke(invoke, new Object[0]));
            Method method3 = cls.getMethod("getActivityName", new Class[0]);
            method3.setAccessible(true);
            if (!m3886a(valueOf, String.valueOf(method3.invoke(invoke, new Object[0])))) {
                this.f1496a.finish();
                if (this.f1498c != null) {
                    this.f1498c.onFailed(new Throwable());
                }
            }
        } catch (Throwable th) {
            this.f1496a.finish();
            if (this.f1498c != null) {
                this.f1498c.onFailed(th);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f1496a.finish();
        if (this.f1498c != null) {
            this.f1498c.onFailed(new Throwable());
        }
    }
}
