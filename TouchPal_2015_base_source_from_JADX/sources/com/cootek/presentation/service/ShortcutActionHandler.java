package com.cootek.presentation.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.presentation.sdk.PresentationManager;

public class ShortcutActionHandler extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final String stringExtra = getIntent().getStringExtra(PresentationManager.INTENT_EXTRA_PRESENT_ID);
        if (!TextUtils.isEmpty(stringExtra)) {
            if (!PresentationManager.isWorking()) {
                Intent intent = new Intent();
                intent.setAction(PresentationManager.INTENT_ACTION_START_WORK);
                intent.setPackage(getPackageName());
                sendBroadcast(intent);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        if (PresentationManager.isWorking()) {
                            ShortcutActionHandler.this.performClick(stringExtra);
                        }
                    }
                }, 3000);
            } else {
                performClick(stringExtra);
            }
        }
        finish();
    }

    /* access modifiers changed from: private */
    public void performClick(String str) {
        if (!PresentationManager.isToastExists(str)) {
            Toast.makeText(this, "No action, remove me!", 0).show();
        } else {
            PresentationManager.clicked(str);
        }
    }
}
