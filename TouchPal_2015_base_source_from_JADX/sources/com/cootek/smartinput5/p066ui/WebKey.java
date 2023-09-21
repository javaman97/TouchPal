package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Editor;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p045a.C1063f;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.WebKey */
public class WebKey extends C2806cb implements Engine.ISelectionListener {
    private static final String TAG = "WebKey";

    public WebKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        int keyId = Engine.getInstance().getKeyId(this.keyName);
        if (keyId != -1) {
            this.mSoftKeyInfo.setSupportedOperation(Engine.getInstance().getKeySupportedOperation(keyId));
            Engine.getInstance().updateKey(keyId, this.mSoftKeyInfo);
        }
        this.mSoftKeyInfo.printTitle = 1;
        this.hasLongPressIcon = false;
        onUpdateSelection();
    }

    public void onUpdateSelection() {
        if (Engine.isInitialized()) {
            Editor editor = Engine.getInstance().getEditor();
            String str = this.mSoftKeyInfo.mainTitle;
            if (editor.getInputType() == 4) {
                String textBeforeCursor = editor.getTextBeforeCursor(10);
                if (TextUtils.isEmpty(textBeforeCursor) || textBeforeCursor.equals("http://") || textBeforeCursor.equals("https://")) {
                    this.mSoftKeyInfo.mainTitle = "www.";
                    this.mSoftKeyInfo.setSupportedOperation(this.mSoftKeyInfo.supportedOperation & -3);
                    this.hasLongPressIcon = false;
                } else {
                    this.mSoftKeyInfo.mainTitle = ".com";
                    this.mSoftKeyInfo.setSupportedOperation(this.mSoftKeyInfo.supportedOperation | 2);
                    this.hasLongPressIcon = true;
                }
            } else if (editor.getInputType() == 8) {
                this.mSoftKeyInfo.mainTitle = C1063f.f3053e;
                this.mSoftKeyInfo.setSupportedOperation(this.mSoftKeyInfo.supportedOperation & -3);
                this.hasLongPressIcon = false;
            }
            if (this.mKeyboard.f12546S != null && !TextUtils.equals(str, this.mSoftKeyInfo.mainTitle)) {
                this.mKeyboard.f12546S.mo8732a((C2806cb) this);
            }
        }
    }
}
