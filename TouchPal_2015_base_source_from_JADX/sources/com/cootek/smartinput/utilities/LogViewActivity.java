package com.cootek.smartinput.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1600bf;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.wechat.friends.Wechat;
import p018cn.sharesdk.wechat.moments.WechatMoments;

public class LogViewActivity extends Activity {

    /* renamed from: k */
    private static final int f2585k = 0;

    /* renamed from: l */
    private static final int f2586l = 1;

    /* renamed from: m */
    private static final int f2587m = 2;

    /* renamed from: n */
    private static final int f2588n = 3;

    /* renamed from: o */
    private static final int f2589o = 4;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f2590a;

    /* renamed from: b */
    private TextView f2591b;

    /* renamed from: c */
    private TextView f2592c;

    /* renamed from: d */
    private TextView f2593d;

    /* renamed from: e */
    private TextView f2594e;

    /* renamed from: f */
    private ScrollView f2595f;

    /* renamed from: g */
    private ViewGroup f2596g;

    /* renamed from: h */
    private CheckBox f2597h;

    /* renamed from: i */
    private PlatformActionListener f2598i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f2599j = new Handler();

    /* renamed from: p */
    private TJavascriptHandler f2600p;

    /* renamed from: q */
    private int f2601q;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2590a = this;
        C1600bf.m7224a(this);
        this.f2600p = new TJavascriptHandler(this, (WebView) null);
        setContentView(R.layout.log_view_layout);
        this.f2591b = (TextView) findViewById(R.id.log_view_refresh);
        this.f2592c = (TextView) findViewById(R.id.log_view_export);
        this.f2593d = (TextView) findViewById(R.id.log_view_clean);
        this.f2594e = (TextView) findViewById(R.id.log_view_content);
        this.f2595f = (ScrollView) findViewById(R.id.log_view_scroll_view);
        this.f2597h = (CheckBox) findViewById(R.id.cb_enable_log);
        m5139a();
        m5141b();
        this.f2598i = new C1004l(this);
        m5148f();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C1600bf.m7224a(this);
        m5141b();
        m5149g();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m5150h();
        if (this.f2601q != Settings.getInstance().getIntSetting(Settings.UI_MULTITHREADING_OPTIMIZE)) {
            m5144d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1600bf.m7225b(this);
        super.onDestroy();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 1, "Bottom");
        menu.add(0, 1, 2, "Top");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 0:
                this.f2595f.fullScroll(130);
                return true;
            case 1:
                this.f2595f.fullScroll(33);
                return true;
            case 2:
                Platform platform = ShareSDK.getPlatform(this, Wechat.NAME);
                platform.setPlatformActionListener(this.f2598i);
                Wechat.ShareParams shareParams = new Wechat.ShareParams();
                shareParams.text = "share wechat test" + System.currentTimeMillis() + " http://www.chubao.cn";
                shareParams.title = "TEST!";
                shareParams.imageUrl = "http://58.32.229.109:82/static/bear/test/test.jpg";
                shareParams.shareType = 2;
                platform.share(shareParams);
                return true;
            case 3:
                Platform platform2 = ShareSDK.getPlatform(this, WechatMoments.NAME);
                platform2.setPlatformActionListener(this.f2598i);
                WechatMoments.ShareParams shareParams2 = new WechatMoments.ShareParams();
                shareParams2.text = "share wechatGroup test" + System.currentTimeMillis() + " http://www.chubao.cn";
                shareParams2.title = "TEST!";
                shareParams2.imageUrl = "http://58.32.229.109:82/static/bear/test/test.jpg";
                shareParams2.shareType = 2;
                platform2.share(shareParams2);
                return true;
            case 4:
                this.f2600p.shareMessage(m5137a(C1411aV.f4472R, "share all test:" + System.currentTimeMillis(), "http://www.chubao.cn"));
                return true;
            default:
                return true;
        }
    }

    /* renamed from: a */
    private void m5139a() {
        this.f2591b.setOnClickListener(new C1008p(this));
        this.f2592c.setOnClickListener(new C1009q(this));
        this.f2593d.setOnClickListener(new C1010r(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5141b() {
        this.f2594e.setText(new StringBuilder().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5142c() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", "{TP-Log}{perf}");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"lu.gan@cootek.cn"});
        intent.setType("application/octet-stream");
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.addFlags(1073741824);
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(m5146e()));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5144d() {
        this.f2594e.setText("");
    }

    /* renamed from: e */
    private File m5146e() {
        File file = new File(C1358O.m6234a(C1358O.f4201l), "templog.txt");
        C0997e.m5176a(file, this.f2594e.getText().toString());
        return file;
    }

    /* renamed from: a */
    private String m5137a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put(JavascriptHandler.SHARE_PARAM_MSG, str2);
            jSONObject.put("url", str3);
            return jSONObject.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: a */
    private String m5138a(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put(JavascriptHandler.SHARE_PARAM_MSG, str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("url", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("title", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("imageUrl", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put(JavascriptHandler.SHARE_PARAM_IMAGE_PATH, str6);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: f */
    private void m5148f() {
        this.f2596g = (ViewGroup) findViewById(R.id.optimize_settings);
        if (this.f2596g != null) {
            this.f2596g.removeAllViews();
            this.f2596g.addView(m5136a(1, "CandidateBar"));
            this.f2596g.addView(m5136a(2, "Explicit"));
        }
    }

    /* renamed from: a */
    private View m5136a(int i, String str) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(str);
        checkBox.setTag(Integer.valueOf(i));
        return checkBox;
    }

    /* renamed from: g */
    private void m5149g() {
        if (this.f2596g != null) {
            this.f2601q = Settings.getInstance().getIntSetting(Settings.UI_MULTITHREADING_OPTIMIZE);
            for (int i = 0; i < this.f2596g.getChildCount(); i++) {
                CheckBox checkBox = (CheckBox) this.f2596g.getChildAt(i);
                checkBox.setChecked(C0989E.m5117a().mo4047a(Integer.parseInt(checkBox.getTag().toString())));
            }
            if (this.f2597h != null) {
                this.f2597h.setChecked(false);
            }
        }
    }

    /* renamed from: h */
    private void m5150h() {
        if (this.f2596g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f2596g.getChildCount()) {
                    CheckBox checkBox = (CheckBox) this.f2596g.getChildAt(i2);
                    C0989E.m5117a().mo4045a(Integer.parseInt(checkBox.getTag().toString()), checkBox.isChecked());
                    i = i2 + 1;
                } else {
                    Settings.getInstance().writeBack();
                    return;
                }
            }
        }
    }
}
