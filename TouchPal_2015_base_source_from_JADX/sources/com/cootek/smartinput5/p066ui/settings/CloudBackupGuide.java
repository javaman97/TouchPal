package com.cootek.smartinput5.p066ui.settings;

import android.os.Bundle;
import android.widget.Button;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CloudBackupGuide */
public class CloudBackupGuide extends C1976b {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.baidu_pcs_guide);
        ((Button) findViewById(R.id.backup_now)).setOnClickListener(new C2979V(this));
    }
}
