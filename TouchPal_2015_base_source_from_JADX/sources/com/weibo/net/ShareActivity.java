package com.weibo.net;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import com.weibo.net.C4039c;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class ShareActivity extends C1976b implements View.OnClickListener, C4039c.C4040a {

    /* renamed from: a */
    public static final String f16459a = "com.weibo.android.content";

    /* renamed from: b */
    public static final String f16460b = "com.weibo.android.pic.uri";

    /* renamed from: c */
    public static final String f16461c = "com.weibo.android.accesstoken";

    /* renamed from: d */
    public static final String f16462d = "com.weibo.android.token.secret";

    /* renamed from: e */
    public static final int f16463e = 140;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f16464f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Button f16465g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public EditText f16466h;

    /* renamed from: i */
    private String f16467i = "";

    /* renamed from: j */
    private String f16468j = "";

    /* renamed from: k */
    private String f16469k = "";

    /* renamed from: l */
    private String f16470l = "";

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.weibo_share);
        Intent intent = getIntent();
        this.f16467i = intent.getStringExtra(f16460b);
        this.f16468j = intent.getStringExtra(f16459a);
        this.f16469k = intent.getStringExtra(f16461c);
        this.f16470l = intent.getStringExtra(f16462d);
        C4057s.m17245a().mo15019a(new C4037a(this.f16469k, this.f16470l));
        ((Button) findViewById(R.id.btnClose)).setOnClickListener(this);
        this.f16465g = (Button) findViewById(R.id.btnSend);
        this.f16465g.setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.ll_text_limit_unit)).setOnClickListener(this);
        this.f16464f = (TextView) findViewById(R.id.tv_text_limit);
        this.f16466h = (EditText) findViewById(R.id.etEdit);
        this.f16466h.setHint(getResString(R.string.weibo_edit_hint));
        this.f16466h.addTextChangedListener(new C4049l(this));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnClose /*2131821126*/:
                finish();
                return;
            case R.id.btnSend /*2131821127*/:
                C4057s a = C4057s.m17245a();
                this.f16468j = this.f16466h.getText().toString();
                try {
                    if (TextUtils.isEmpty(a.mo15024b().mo14995a())) {
                        Toast.makeText(this, getResString(R.string.please_login), 1).show();
                        return;
                    } else if (TextUtils.isEmpty(this.f16467i) || !new File(this.f16467i).exists()) {
                        m17158a(a, C4057s.m17252c(), this.f16468j, "", "");
                        return;
                    } else {
                        m17159a(a, C4057s.m17252c(), this.f16467i, this.f16468j, "", "");
                        return;
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                } catch (C4061w e3) {
                    e3.printStackTrace();
                    return;
                }
            case R.id.ll_text_limit_unit /*2131821130*/:
                new C2894d.C2895a(this).setTitle(getResString(R.string.attention)).setMessage(getResString(R.string.delete_all)).setPositiveButton(getResString(R.string.ok), new C4050m(this)).setNegativeButton(getResString(R.string.cancel), (DialogInterface.OnClickListener) null).create().show();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private String m17159a(C4057s sVar, String str, String str2, String str3, String str4, String str5) throws C4061w {
        C4062x xVar = new C4062x();
        xVar.mo15037a("source", str);
        xVar.mo15037a("pic", str2);
        xVar.mo15037a("status", str3);
        if (!TextUtils.isEmpty(str4)) {
            xVar.mo15037a("lon", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            xVar.mo15037a("lat", str5);
        }
        new C4039c(sVar).mo14983a(this, C4057s.f16519a + "statuses/upload.json", xVar, C4054q.f16509e, this);
        return "";
    }

    /* renamed from: a */
    private String m17158a(C4057s sVar, String str, String str2, String str3, String str4) throws MalformedURLException, IOException, C4061w {
        C4062x xVar = new C4062x();
        xVar.mo15037a("source", str);
        xVar.mo15037a("status", str2);
        if (!TextUtils.isEmpty(str3)) {
            xVar.mo15037a("lon", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            xVar.mo15037a("lat", str4);
        }
        new C4039c(sVar).mo14983a(this, C4057s.f16519a + "statuses/update.json", xVar, C4054q.f16509e, this);
        return "";
    }

    /* renamed from: a */
    public void mo8208a(String str) {
        runOnUiThread(new C4051n(this));
        finish();
    }

    /* renamed from: a */
    public void mo8207a(IOException iOException) {
    }

    /* renamed from: a */
    public void mo8206a(C4061w wVar) {
        runOnUiThread(new C4052o(this, wVar));
        Log.e("ErrorMessage", String.format(getResString(R.string.send_failed) + ":%s", new Object[]{wVar.getMessage()}));
    }
}
