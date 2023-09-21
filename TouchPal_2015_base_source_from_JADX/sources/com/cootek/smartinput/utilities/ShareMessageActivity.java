package com.cootek.smartinput.utilities;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import com.cootek.smartinput5.func.C1600bf;

public class ShareMessageActivity extends Activity {

    /* renamed from: a */
    public static final String f2602a = "ShareMessageActivity.EXTRA_JSON_PARAM";

    /* renamed from: b */
    private boolean f2603b = false;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C1600bf.m7224a(this);
        String stringExtra = getIntent().getStringExtra(f2602a);
        TJavascriptHandler tJavascriptHandler = new TJavascriptHandler(this, (WebView) null);
        tJavascriptHandler.setNotifyOtherProcessShareMessageCallback(true);
        tJavascriptHandler.setFinishOnShareMessageCallback(true);
        tJavascriptHandler.setActivity(this);
        tJavascriptHandler.shareMessage(stringExtra);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f2603b) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2603b = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }
}
