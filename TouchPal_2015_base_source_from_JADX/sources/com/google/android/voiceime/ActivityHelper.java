package com.google.android.voiceime;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.cootek.smartinput5.p066ui.C2894d;
import java.util.ArrayList;

public class ActivityHelper extends Activity {
    private static final int RECOGNITION_REQUEST = 1;
    private static final String TAG = "ActivityHelper";
    private ServiceBridge mServiceBridge;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.mServiceBridge = new ServiceBridge();
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("calling_package", getClass().getPackage().getName());
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 5);
        if (!(bundle == null || (string = bundle.getString("android.speech.extra.LANGUAGE")) == null)) {
            intent.putExtra("android.speech.extra.LANGUAGE", string);
        }
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || intent == null || !intent.hasExtra("android.speech.extra.RESULTS")) {
            notifyResult((String) null);
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        createResultDialog((String[]) stringArrayListExtra.toArray(new String[stringArrayListExtra.size()])).show();
    }

    private Dialog createResultDialog(final String[] strArr) {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setItems(strArr, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityHelper.this.notifyResult(strArr[i]);
            }
        });
        aVar.setCancelable(true);
        aVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                ActivityHelper.this.notifyResult((String) null);
            }
        });
        aVar.setNeutralButton(17039360, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityHelper.this.notifyResult((String) null);
            }
        });
        return aVar.create();
    }

    /* access modifiers changed from: private */
    public void notifyResult(String str) {
        this.mServiceBridge.notifyResult(this, str);
        finish();
    }
}
