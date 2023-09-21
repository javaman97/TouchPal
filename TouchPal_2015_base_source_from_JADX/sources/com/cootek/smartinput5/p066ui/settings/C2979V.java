package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.settings.V */
/* compiled from: CloudBackupGuide */
class C2979V implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CloudBackupGuide f13799a;

    C2979V(CloudBackupGuide cloudBackupGuide) {
        this.f13799a = cloudBackupGuide;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("FROM_GUIDE", true);
        intent.setClass(this.f13799a, BaiduAuthActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f13799a.startActivity(intent);
        this.f13799a.finish();
    }
}
