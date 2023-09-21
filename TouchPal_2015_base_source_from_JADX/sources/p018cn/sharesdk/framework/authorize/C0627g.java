package p018cn.sharesdk.framework.authorize;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.cootek.smartinput5.engine.Settings;
import p018cn.sharesdk.framework.TitleLayout;
import p018cn.sharesdk.framework.authorize.ResizeLayout;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.authorize.g */
public class C0627g extends C0621a implements Handler.Callback, ResizeLayout.OnResizeListener {

    /* renamed from: b */
    protected AuthorizeListener f1499b;

    /* renamed from: c */
    private AuthorizeAdapter f1500c;

    /* renamed from: d */
    private RegisterView f1501d;

    /* renamed from: e */
    private WebView f1502e;

    /* renamed from: cn.sharesdk.framework.authorize.g$a */
    private static class C0628a implements Interpolator {

        /* renamed from: a */
        private float[] f1503a;

        private C0628a() {
            float[] fArr = new float[Settings.HANDWRITE_WIDTH];
            // fill-array-data instruction
            fArr[0] = 0;
            fArr[1] = 1021089192;
            fArr[2] = 1029476016;
            fArr[3] = 1034248783;
            fArr[4] = 1037857492;
            fArr[5] = 1040825014;
            fArr[6] = 1042625359;
            fArr[7] = 1044423033;
            fArr[8] = 1046217591;
            fArr[9] = 1048008592;
            fArr[10] = 1049185797;
            fArr[11] = 1050077078;
            fArr[12] = 1050965918;
            fArr[13] = 1051852099;
            fArr[14] = 1052735402;
            fArr[15] = 1053615609;
            fArr[16] = 1054492503;
            fArr[17] = 1055365867;
            fArr[18] = 1056235486;
            fArr[19] = 1057032877;
            fArr[20] = 1057463620;
            fArr[21] = 1057892170;
            fArr[22] = 1058318422;
            fArr[23] = 1058742269;
            fArr[24] = 1059163609;
            fArr[25] = 1059582336;
            fArr[26] = 1059998347;
            fArr[27] = 1060411540;
            fArr[28] = 1060821813;
            fArr[29] = 1061229065;
            fArr[30] = 1061633194;
            fArr[31] = 1062034102;
            fArr[32] = 1062431689;
            fArr[33] = 1062825858;
            fArr[34] = 1063216510;
            fArr[35] = 1063603551;
            fArr[36] = 1063986883;
            fArr[37] = 1064366413;
            fArr[38] = 1064742047;
            fArr[39] = 1065113693;
            fArr[40] = 1065417237;
            fArr[41] = 1065598934;
            fArr[42] = 1065778500;
            fArr[43] = 1065955892;
            fArr[44] = 1066131065;
            fArr[45] = 1066303977;
            fArr[46] = 1066474584;
            fArr[47] = 1066642845;
            fArr[48] = 1066808718;
            fArr[49] = 1066972162;
            fArr[50] = 1066941514;
            fArr[51] = 1066802856;
            fArr[52] = 1066666428;
            fArr[53] = 1066532263;
            fArr[54] = 1066400394;
            fArr[55] = 1066270855;
            fArr[56] = 1066143676;
            fArr[57] = 1066018889;
            fArr[58] = 1065896525;
            fArr[59] = 1065776614;
            fArr[60] = 1065659186;
            fArr[61] = 1065544270;
            fArr[62] = 1065431894;
            fArr[63] = 1065290955;
            fArr[64] = 1065076528;
            fArr[65] = 1064867344;
            fArr[66] = 1064663454;
            fArr[67] = 1064464908;
            fArr[68] = 1064271756;
            fArr[69] = 1064084046;
            fArr[70] = 1063901823;
            fArr[71] = 1063725132;
            fArr[72] = 1063756479;
            fArr[73] = 1063866810;
            fArr[74] = 1063973368;
            fArr[75] = 1064076126;
            fArr[76] = 1064175061;
            fArr[77] = 1064270147;
            fArr[78] = 1064361360;
            fArr[79] = 1064448678;
            fArr[80] = 1064532081;
            fArr[81] = 1064611546;
            fArr[82] = 1064687055;
            fArr[83] = 1064758588;
            fArr[84] = 1064826129;
            fArr[85] = 1064889660;
            fArr[86] = 1064949166;
            fArr[87] = 1065004633;
            fArr[88] = 1065056045;
            fArr[89] = 1065103392;
            fArr[90] = 1065146661;
            fArr[91] = 1065185841;
            fArr[92] = 1065220923;
            fArr[93] = 1065251898;
            fArr[94] = 1065278758;
            fArr[95] = 1065301497;
            fArr[96] = 1065320110;
            fArr[97] = 1065334591;
            fArr[98] = 1065344937;
            fArr[99] = 1065351146;
            fArr[100] = 1065353216;
            this.f1503a = fArr;
        }

        /* synthetic */ C0628a(C0629h hVar) {
            this();
        }

        public float getInterpolation(float f) {
            int i = 100;
            int i2 = (int) (100.0f * f);
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 <= 100) {
                i = i2;
            }
            return this.f1503a[i];
        }
    }

    /* renamed from: c */
    private AuthorizeAdapter m3581c() {
        try {
            ActivityInfo activityInfo = this.activity.getPackageManager().getActivityInfo(this.activity.getComponentName(), 128);
            String string = activityInfo.metaData.getString("AuthorizeAdapter");
            if ((string == null || string.length() <= 0) && ((string = activityInfo.metaData.getString("Adapter")) == null || string.length() <= 0)) {
                return null;
            }
            Object newInstance = Class.forName(string).newInstance();
            if (!(newInstance instanceof AuthorizeAdapter)) {
                return null;
            }
            return (AuthorizeAdapter) newInstance;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    public void OnResize(int i, int i2, int i3, int i4) {
        if (this.f1500c != null) {
            this.f1500c.onResize(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void mo2264a(AuthorizeListener authorizeListener) {
        this.f1499b = authorizeListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RegisterView mo2265b() {
        RegisterView registerView = new RegisterView(this.activity);
        registerView.mo2246a().setOnClickListener(new C0629h(this));
        this.f1502e = registerView.mo2248b();
        WebSettings settings = this.f1502e.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        this.f1502e.setVerticalScrollBarEnabled(false);
        this.f1502e.setHorizontalScrollBarEnabled(false);
        C0622b authorizeWebviewClient = this.f1486a.getAuthorizeWebviewClient(this);
        this.f1502e.addJavascriptInterface(authorizeWebviewClient, authorizeWebviewClient.mo2256a());
        this.f1502e.setWebViewClient(authorizeWebviewClient);
        new C0631j(this).start();
        return registerView;
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 2:
                String str = (String) message.obj;
                if (TextUtils.isEmpty(str)) {
                    finish();
                    AuthorizeListener authorizeListener = this.f1486a.getAuthorizeListener();
                    if (authorizeListener == null) {
                        return false;
                    }
                    authorizeListener.onError(new Throwable("Authorize URL is empty"));
                    return false;
                }
                this.f1502e.loadUrl(str);
                return false;
            default:
                return false;
        }
    }

    public void onCreate() {
        if (this.f1501d == null) {
            this.f1501d = mo2265b();
            this.f1501d.mo2251a(this);
            this.f1501d.mo2247a(this.f1500c.isNotitle());
            this.f1500c.setBodyView(this.f1501d.mo2250d());
            this.f1500c.setWebView(this.f1501d.mo2248b());
            TitleLayout c = this.f1501d.mo2249c();
            this.f1500c.setTitleView(c);
            String name = this.f1486a.getPlatform().getName();
            this.f1500c.setPlatformName(this.f1486a.getPlatform().getName());
            try {
                c.getTvTitle().setText(C0661R.getStringRes(getContext(), name));
            } catch (Throwable th) {
                C0666e.m3838b(th);
            }
        }
        this.f1500c.onCreate();
        if (this.f1500c != null && !this.f1500c.isPopUpAnimationDisable()) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(550);
            scaleAnimation.setInterpolator(new C0628a((C0629h) null));
            this.f1501d.setAnimation(scaleAnimation);
        }
        this.activity.setContentView(this.f1501d);
    }

    public void onDestroy() {
        if (this.f1500c != null) {
            this.f1500c.onDestroy();
        }
    }

    public boolean onFinish() {
        return this.f1500c != null ? this.f1500c.onFinish() : super.onFinish();
    }

    public boolean onKeyEvent(int i, KeyEvent keyEvent) {
        AuthorizeListener authorizeListener;
        boolean z = false;
        if (this.f1500c != null) {
            z = this.f1500c.onKeyEvent(i, keyEvent);
        }
        if (!z && i == 4 && keyEvent.getAction() == 0 && (authorizeListener = this.f1486a.getAuthorizeListener()) != null) {
            authorizeListener.onCancel();
        }
        if (z) {
            return true;
        }
        return super.onKeyEvent(i, keyEvent);
    }

    public void onPause() {
        if (this.f1500c != null) {
            this.f1500c.onPause();
        }
    }

    public void onRestart() {
        if (this.f1500c != null) {
            this.f1500c.onRestart();
        }
    }

    public void onResume() {
        if (this.f1500c != null) {
            this.f1500c.onResume();
        }
    }

    public void onStart() {
        if (this.f1500c != null) {
            this.f1500c.onStart();
        }
    }

    public void onStop() {
        if (this.f1500c != null) {
            this.f1500c.onStop();
        }
    }

    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (this.f1500c == null) {
            this.f1500c = m3581c();
            if (this.f1500c == null) {
                this.f1500c = new AuthorizeAdapter();
            }
        }
        this.f1500c.setActivity(activity);
    }
}
