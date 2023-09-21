package p018cn.sharesdk.facebook;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.cootek.smartinput5.net.cmd.C2250J;
import p018cn.sharesdk.framework.authorize.C0625e;
import p018cn.sharesdk.framework.authorize.C0626f;

/* renamed from: cn.sharesdk.facebook.b */
public class C0605b extends C0626f {

    /* renamed from: d */
    private String f1448d;

    /* renamed from: e */
    private String[] f1449e;

    public C0605b(C0625e eVar) {
        super(eVar);
    }

    /* renamed from: b */
    private boolean m3493b() {
        boolean z = true;
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
        intent.putExtra("client_id", this.f1448d);
        if (this.f1449e != null && this.f1449e.length > 0) {
            intent.putExtra("scope", TextUtils.join(",", this.f1449e));
        }
        if (!m3494b(intent)) {
            return false;
        }
        try {
            this.f1496a.startActivityForResult(intent, this.f1497b);
        } catch (Throwable th) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private boolean m3494b(Intent intent) {
        ResolveInfo resolveActivity = this.f1496a.getContext().getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null) {
            return false;
        }
        try {
            for (Signature charsString : this.f1496a.getContext().getPackageManager().getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures) {
                if ("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(charsString.toCharsString())) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: c */
    private void m3495c(Intent intent) {
        if (this.f1498c != null) {
            String stringExtra = intent.getStringExtra("error_message");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra(C2250J.f9627c);
            }
            if (stringExtra == null) {
                this.f1498c.onComplete(intent.getExtras());
            } else if (stringExtra.equals("access_denied") || stringExtra.equals("OAuthAccessDeniedException")) {
                this.f1498c.onCancel();
            } else {
                String stringExtra2 = intent.getStringExtra("error_message");
                if (stringExtra2 != null) {
                    stringExtra = intent.getStringExtra(C2250J.f9627c) + ": " + stringExtra2;
                }
                this.f1498c.onFailed(new Throwable(stringExtra));
            }
        }
    }

    /* renamed from: d */
    private void m3496d(Intent intent) {
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
        if (!m3493b()) {
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
                    m3495c(intent);
                    return;
                case 0:
                    m3496d(intent);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo2052a(String str, String[] strArr) {
        this.f1448d = str;
        this.f1449e = strArr;
    }
}
