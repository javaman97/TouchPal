package com.cootek.smartinput5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;

public class PluginInstallerActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        if (getIntent() != null) {
            m5419a(getIntent().getDataString());
        }
    }

    /* renamed from: a */
    private void m5419a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.PACKAGE_INSTALL");
            intent.setFlags(Engine.EXCEPTION_ERROR);
            intent.setDataAndType(Uri.parse(str), "application/vnd.android.package-archive");
            intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.PackageInstallerActivity"));
            startActivity(intent);
        }
    }
}
