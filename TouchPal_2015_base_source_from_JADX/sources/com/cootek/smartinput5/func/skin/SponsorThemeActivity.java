package com.cootek.smartinput5.func.skin;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.emoji.keyboard.touchpal.R;

public class SponsorThemeActivity extends C1976b {

    /* renamed from: a */
    public static final String f6812a = "com.cootek.smartinput5.func.skin.SponsorThemeActivity.EXTRA_SKIN_PKG";

    /* renamed from: b */
    private static final int f6813b = 257;

    /* renamed from: c */
    private static final int f6814c = 258;

    /* renamed from: d */
    private static final int f6815d = 259;

    /* renamed from: e */
    private static final int f6816e = 260;

    /* renamed from: f */
    private static final int f6817f = 261;

    /* renamed from: g */
    private int f6818g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f6819h;

    /* renamed from: i */
    private C1601bg f6820i;

    /* renamed from: j */
    private TextView f6821j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6822k = false;

    /* renamed from: l */
    private long f6823l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TWebView f6824m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ImageView f6825n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ProgressDialog f6826o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f6827p = new C1991e(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.requestWindowFeature(1);
        C1368X.m6317b((Context) this);
        this.f6818g = getWindowManager().getDefaultDisplay().getWidth();
        String stringExtra = getIntent().getStringExtra(f6812a);
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        this.f6819h = stringExtra;
        this.f6820i = C1368X.m6320c().mo5841n().mo6284l(stringExtra);
        if (this.f6820i == null) {
            finish();
            return;
        }
        setContentView(R.layout.sponsor_theme_layout);
        m9145a();
        if (C1997k.m9167a().mo7305c()) {
            this.f6823l = System.currentTimeMillis();
            C1997k.m9167a().mo7301a(this.f6819h, this.f6823l, false);
        }
        m9163k();
    }

    /* renamed from: a */
    private void m9145a() {
        m9152d();
        m9154e();
        m9156f();
        m9147b();
    }

    /* renamed from: b */
    private void m9147b() {
        this.f6825n = (ImageView) findViewById(R.id.progress_img);
        this.f6824m = (TWebView) findViewById(R.id.sponsor_webview);
        ViewGroup.LayoutParams layoutParams = this.f6824m.getLayoutParams();
        layoutParams.width = this.f6818g;
        layoutParams.height = (this.f6818g / 7) * 2;
        this.f6824m.setLayoutParams(layoutParams);
        View findViewById = findViewById(R.id.progress_img);
        ViewGroup.LayoutParams layoutParams2 = this.f6824m.getLayoutParams();
        layoutParams2.width = this.f6818g;
        layoutParams2.height = (this.f6818g / 7) * 2;
        findViewById.setLayoutParams(layoutParams);
        C1368X.m6320c().mo5825K().setActivity(this);
        C1368X.m6320c().mo5825K().setWebView(this.f6824m);
        this.f6824m.getSettings().setJavaScriptEnabled(true);
        this.f6824m.setWebViewClient(new C1993g(this));
        m9150c();
    }

    /* renamed from: c */
    private void m9150c() {
        int o = C2225al.m10081o(this);
        String a = C1132b.m5654a((Context) this).mo4402a(C1135d.WEBVIEW_URL_GET_RECOMMENDED, C2225al.m10053a((Context) this, C2258O.GET_RECOMMENDED) + C2258O.GET_RECOMMENDED.mo7825a(o));
        String str = this.f6820i.f5933b;
        this.f6824m.loadUrl(((a + "?app_name=" + this.f6819h) + "&app_version=" + str) + "&locale=" + C2225al.m10051a((Context) this));
    }

    /* renamed from: d */
    private void m9152d() {
        ImageView imageView = (ImageView) findViewById(R.id.skin_preview_image);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = (this.f6818g / 3) * 2;
        layoutParams.height = (layoutParams.width / 5) * 4;
        imageView.setLayoutParams(layoutParams);
        int a = C1368X.m6320c().mo5838k().mo6236a(this.f6820i.f5932a, (int) R.drawable.skin_preview);
        if (a > 0) {
            try {
                Bitmap bitmap = ((BitmapDrawable) this.f6820i.f5932a.getResources().getDrawable(a)).getBitmap();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                float dimension = getResources().getDimension(R.dimen.sponsor_skin_preview_corner);
                canvas.drawRoundRect(rectF, dimension, dimension, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                imageView.setImageBitmap(createBitmap);
            } catch (Resources.NotFoundException | OutOfMemoryError e) {
            }
        }
    }

    /* renamed from: e */
    private void m9154e() {
        findViewById(R.id.back_btn).setOnClickListener(new C1994h(this));
        this.f6822k = Settings.getInstance().getStringSetting(80).equalsIgnoreCase(this.f6819h);
        m9157g();
    }

    /* renamed from: f */
    private void m9156f() {
        ((TextView) findViewById(R.id.title)).setText(this.f6820i.f5100d);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9157g() {
        if (this.f6821j == null) {
            this.f6821j = (TextView) findViewById(R.id.function_btn);
        }
        if (this.f6822k) {
            this.f6821j.setText(R.string.paopao_tab_setting);
            this.f6821j.setOnClickListener(new C1995i(this));
            return;
        }
        this.f6821j.setText(R.string.apply);
        this.f6821j.setOnClickListener(new C1996j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m9159h() {
        if (!C1997k.m9167a().mo7305c()) {
            m9161i();
        } else if (!C1997k.m9167a().mo7304b(this.f6823l)) {
            m9161i();
        } else {
            Intent intent = new Intent(this, FacebookAdsActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.putExtra(FacebookAdsActivity.f6798b, this.f6823l);
            intent.putExtra(FacebookAdsActivity.f6797a, this.f6820i.f5100d);
            startActivity(intent);
            C1246d.m6010a((Context) this).mo4591a(C1246d.f3891dB, "show_sponsor_theme_ads_notification", C1246d.f3908db);
        }
    }

    /* renamed from: i */
    private void m9161i() {
        String a = C1974m.m9063a(C1368X.m6313b(), (int) R.string.download_dialog_msg_actived);
        C2849W.m13205a().mo9478a(String.format(a, new Object[]{this.f6820i.f5100d}), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m9162j() {
        Settings.getInstance().setStringSetting(80, this.f6819h);
        Settings.getInstance().writeBack();
        IPCManager l = C1368X.m6320c().mo5839l();
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, 80);
        bundle.putString(IPCManager.SETTING_VALUE, this.f6819h);
        obtain.setData(bundle);
        try {
            l.sendMessage(obtain);
        } catch (RemoteException e) {
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt(IPCManager.EXTRA_ACTION_TYPE, 3);
        bundle2.putString(IPCManager.SKIN_SETTINGS_NAME, this.f6819h);
        Message obtain2 = Message.obtain((Handler) null, 4);
        obtain2.setData(bundle2);
        try {
            l.sendMessage(obtain2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m9163k() {
        IPCManager l = C1368X.m6320c().mo5839l();
        Messenger messenger = new Messenger(this.f6827p);
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = messenger;
        try {
            l.sendMessage(obtain);
        } catch (RemoteException e) {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
