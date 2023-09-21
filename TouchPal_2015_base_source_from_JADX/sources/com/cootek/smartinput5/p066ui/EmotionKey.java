package com.cootek.smartinput5.p066ui;

import android.content.Intent;
import android.content.res.Resources;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.settings.EmotionKeyDialog;

/* renamed from: com.cootek.smartinput5.ui.EmotionKey */
public class EmotionKey extends C2806cb {
    private static final String EMO_PREFIX = "emo_";

    public EmotionKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        int keyId = Engine.getInstance().getKeyId(this.keyName);
        this.mSoftKeyInfo.setSupportedOperation(2);
        Engine.getInstance().updateKey(keyId, this.mSoftKeyInfo);
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2628O(this);
    }

    /* access modifiers changed from: private */
    public void processLongPress(int i) {
        showDialog();
    }

    private void showDialog() {
        Intent intent = new Intent();
        intent.setClass(Engine.getInstance().getIms(), EmotionKeyDialog.class);
        intent.addFlags(335544320);
        intent.putExtra("INDEX", getEmotionId() + (getLanguageId(Engine.getInstance().getCurrentLanguageId()) * 8));
        intent.putExtra("SYMBOL", this.mSoftKeyInfo.mainTitle);
        Engine.getInstance().getIms().startActivity(intent);
    }

    private int getLanguageId(String str) {
        if (str == null) {
            return -1;
        }
        if (str.contains("chinese")) {
            return 0;
        }
        return 1;
    }

    private int getEmotionId() {
        return Integer.valueOf(this.keyName.substring(EMO_PREFIX.length())).intValue();
    }
}
