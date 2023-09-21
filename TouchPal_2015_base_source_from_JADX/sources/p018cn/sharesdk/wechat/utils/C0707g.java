package p018cn.sharesdk.wechat.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p046b.C1132b;
import java.security.MessageDigest;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.wechat.utils.g */
public class C0707g {

    /* renamed from: a */
    private Context f1714a;

    /* renamed from: b */
    private String f1715b;

    /* renamed from: a */
    private String m3990a(String str) {
        try {
            Cursor query = this.f1714a.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref"), new String[]{"_id", C1132b.f3175g, "type", "value"}, "key = ?", new String[]{str}, (String) null);
            if (query == null) {
                return null;
            }
            String string = query.moveToFirst() ? query.getString(query.getColumnIndex("value")) : null;
            query.close();
            return string;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: a */
    private boolean m3991a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            C0666e.m3839c("checkSumConsistent fail, invalid arguments, \"_mmessage_checksum\" is empty", new Object[0]);
            return false;
        } else if (bArr2 == null || bArr2.length == 0) {
            C0666e.m3839c("checkSumConsistent fail, invalid arguments, checksum is empty", new Object[0]);
            return false;
        } else if (bArr.length != bArr2.length) {
            C0666e.m3839c("checkSumConsistent fail, length is different", new Object[0]);
            return false;
        } else {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    C0666e.m3839c("checkSumConsistent fail, not match", new Object[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private byte[] m3992a(String str, String str2, int i) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bytes);
            byte[] digest = instance.digest();
            char[] cArr2 = new char[(digest.length * 2)];
            int i2 = 0;
            for (byte b : digest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            str3 = new String(cArr2);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            str3 = null;
        }
        if (str3 != null) {
            return str3.getBytes();
        }
        return null;
    }

    /* renamed from: c */
    private boolean m3993c() {
        C0666e.m3834a("checking signature of wechat client...", new Object[0]);
        try {
            PackageInfo packageInfo = this.f1714a.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            for (Signature charsString : packageInfo.signatures) {
                if ("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499".equals(charsString.toCharsString())) {
                    C0666e.m3834a("pass!", new Object[0]);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo2667a(C0709i iVar) {
        if (!mo2668a()) {
            throw new WechatClientNotExistException();
        } else if (!iVar.mo2666b()) {
            throw new Throwable("sendReq checkArgs fail");
        } else {
            String packageName = this.f1714a.getPackageName();
            String str = "weixin://sendreq?appid=" + this.f1715b;
            Intent intent = new Intent();
            intent.setClassName("com.tencent.mm", "com.tencent.mm.plugin.base.stub.WXEntryActivity");
            Bundle bundle = new Bundle();
            iVar.mo2665a(bundle);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("_mmessage_sdkVersion", 553910273);
            intent.putExtra("_mmessage_appPackage", packageName);
            intent.putExtra("_mmessage_content", str);
            intent.putExtra("_mmessage_checksum", m3992a(str, packageName, 553910273));
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.addFlags(Engine.EXCEPTION_WARN);
            this.f1714a.startActivity(intent);
            C0666e.m3834a("starting activity, packageName=com.tencent.mm, className=com.tencent.mm.plugin.base.stub.WXEntryActivity", new Object[0]);
        }
    }

    /* renamed from: a */
    public boolean mo2668a() {
        int i;
        if (!m3993c()) {
            return false;
        }
        try {
            i = Integer.parseInt(m3990a("_build_info_sdk_int_"));
        } catch (Throwable th) {
            C0666e.m3838b(th);
            i = -1;
        }
        return i >= 553844737;
    }

    /* renamed from: a */
    public boolean mo2669a(Context context, String str) {
        this.f1714a = context;
        this.f1715b = str;
        if (!m3993c()) {
            C0666e.m3839c("register app failed for wechat app signature check failed", new Object[0]);
            return false;
        }
        String str2 = "weixin://registerapp?appid=" + str;
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER");
        intent.putExtra("_mmessage_sdkVersion", 553910273);
        intent.putExtra("_mmessage_appPackage", packageName);
        intent.putExtra("_mmessage_content", str2);
        intent.putExtra("_mmessage_checksum", m3992a(str2, packageName, 553910273));
        context.sendBroadcast(intent, "com.tencent.mm.permission.MM_MESSAGE");
        C0666e.m3834a("sending broadcast, intent=" + "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER" + ", perm=" + "com.tencent.mm.permission.MM_MESSAGE", new Object[0]);
        return true;
    }

    /* renamed from: a */
    public boolean mo2670a(WechatHandlerActivity wechatHandlerActivity, C0708h hVar) {
        Intent intent = wechatHandlerActivity.getIntent();
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("wx_token_key");
        if (stringExtra == null || !stringExtra.equals("com.tencent.mm.openapi.token")) {
            C0666e.m3839c("invalid argument, \"wx_token_key\" is empty or does not equals \"com.tencent.mm.openapi.token\"", new Object[0]);
            return false;
        }
        String stringExtra2 = intent.getStringExtra("_mmessage_appPackage");
        if (TextUtils.isEmpty(stringExtra2)) {
            C0666e.m3839c("invalid argument, \"_mmessage_appPackage\" is empty", new Object[0]);
            return false;
        }
        if (!m3991a(intent.getByteArrayExtra("_mmessage_checksum"), m3992a(intent.getStringExtra("_mmessage_content"), stringExtra2, intent.getIntExtra("_mmessage_sdkVersion", 0)))) {
            C0666e.m3839c("checksum fail", new Object[0]);
            return false;
        }
        Bundle extras = intent.getExtras();
        switch (extras.getInt("_wxapi_command_type", 0)) {
            case 1:
                hVar.mo2675a((WechatResp) new C0702b(extras));
                break;
            case 2:
                hVar.mo2675a((WechatResp) new C0705e(extras));
                break;
            case 3:
                wechatHandlerActivity.onGetMessageFromWXReq(new C0703c(extras).f1710a);
                break;
            case 4:
                wechatHandlerActivity.onShowMessageFromWXReq(new C0706f(extras).f1713a);
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo2671b() {
        int i;
        try {
            i = Integer.parseInt(m3990a("_build_info_sdk_int_"));
        } catch (Throwable th) {
            C0666e.m3838b(th);
            i = -1;
        }
        return i >= 553779201;
    }
}
