package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.engine.Editor;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.ui.EditKey */
public class EditKey extends C2806cb implements Editor.ISelectChangedListener {
    private static Hashtable<String, Integer> sKeyMap = new Hashtable<>();
    private boolean isHighlighted = false;
    /* access modifiers changed from: private */
    public int keyActionId;
    private boolean mIsSelectKey;

    static {
        sKeyMap.put("sk_copy", 3211265);
        sKeyMap.put("sk_paste", Integer.valueOf(Engine.KEYCODE_EDIT_PASTE));
        sKeyMap.put("sk_cut", Integer.valueOf(Engine.KEYCODE_EDIT_CUT));
        sKeyMap.put("sk_up", Integer.valueOf(Engine.KEYCODE_EDIT_UP));
        sKeyMap.put("sk_down", Integer.valueOf(Engine.KEYCODE_EDIT_DOWN));
        sKeyMap.put("sk_left", Integer.valueOf(Engine.KEYCODE_EDIT_LEFT));
        sKeyMap.put("sk_right", Integer.valueOf(Engine.KEYCODE_EDIT_RIGHT));
        sKeyMap.put("sk_pdown", Integer.valueOf(Engine.KEYCODE_EDIT_PDOWN));
        sKeyMap.put("sk_pup", Integer.valueOf(Engine.KEYCODE_EDIT_PUP));
        sKeyMap.put("sk_home", Integer.valueOf(Engine.KEYCODE_EDIT_HOME));
        sKeyMap.put("sk_end", Integer.valueOf(Engine.KEYCODE_EDIT_END));
        sKeyMap.put("sk_select", Integer.valueOf(Engine.KEYCODE_EDIT_SELECT));
        sKeyMap.put("sk_del", Integer.valueOf(Engine.KEYCODE_EDIT_DEL));
        sKeyMap.put("sk_selectall", Integer.valueOf(Engine.KEYCODE_EDIT_SELECTALL));
        sKeyMap.put("sk_sp", Integer.valueOf(Engine.KEYCODE_EDIT_SPACE));
        sKeyMap.put("sk_done", Integer.valueOf(Engine.KEYCODE_EDIT_DONE));
    }

    public EditKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    public void onSelectChanged(boolean z) {
        this.mSoftKeyInfo.needUpdate = true;
        if (z) {
            this.mSoftKeyInfo.mainTitle = C1974m.m9063a(C1368X.m6313b(), (int) R.string.edit_done);
            this.isHighlighted = true;
        } else {
            this.mSoftKeyInfo.mainTitle = C1974m.m9063a(C1368X.m6313b(), (int) R.string.edit_select);
            this.isHighlighted = false;
        }
        if (this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    /* access modifiers changed from: protected */
    public int[] getBackState() {
        if (this.isHighlighted) {
            return STATE_PRESSED;
        }
        return super.getBackState();
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        if (!this.mIsSelectKey) {
            super.updateKeyInfo();
            return;
        }
        int keyId = Engine.getInstance().getKeyId(this.keyName);
        if (keyId != -1) {
            this.mSoftKeyInfo.setSupportedOperation(Engine.getInstance().getKeySupportedOperation(keyId));
            this.mSoftKeyInfo.printTitle = 1;
        }
    }

    /* access modifiers changed from: protected */
    public String getPreviewText(int i) {
        if (i == 0) {
            return this.mSoftKeyInfo.mainTitle;
        }
        return super.getPreviewText(i);
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        if (sKeyMap.containsKey(this.keyName)) {
            this.keyActionId = sKeyMap.get(this.keyName).intValue();
            if (this.keyActionId == 3211276) {
                this.mIsSelectKey = true;
            }
        }
        if (this.keyActionId == 3211276) {
            this.mActionListener = new C2627N(this);
        } else {
            super.updateActionListener();
        }
    }
}
