package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.ExplicitInfo;
import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import java.util.Locale;

/* renamed from: com.cootek.smartinput5.ui.EnterKey */
public class EnterKey extends C2806cb implements ExplicitManager.IExplicitListener {
    public static final String DONE = "done";
    public static final String ENTER = "enter";

    /* renamed from: GO */
    public static final String f11210GO = "go";
    public static final String NEXT = "next";
    public static final String SEARCH = "search";
    public static final String SEND = "send";
    public static final String TAG = "EnterKey";
    private boolean mUpdated = false;
    private String mainTitleAction;

    EnterKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    private String getKeyTitle(int i) {
        switch (i) {
            case 2:
                return f11210GO;
            case 3:
                return SEARCH;
            case 4:
                return SEND;
            case 5:
                return NEXT;
            case 6:
                return DONE;
            default:
                return ENTER;
        }
    }

    private static boolean canShowActionTitle(String str) {
        if (!C1132b.m5654a(C1368X.m6313b()).mo4393a(C1135d.CATEGORY_ENTER_KEY, str, (Boolean) true).booleanValue() || !canShowEnterTitle(str)) {
            return false;
        }
        return true;
    }

    private boolean canShowActionTitle(int i) {
        return canShowActionTitle(getKeyTitle(i));
    }

    private static boolean canShowEnterTitle(String str) {
        if (!ENTER.equalsIgnoreCase(str) || !Engine.isInitialized()) {
            return true;
        }
        Locale locale = Engine.getInstance().getIms().getResources().getConfiguration().locale;
        if (!"zh".equals(locale.getLanguage()) || "CN".equalsIgnoreCase(locale.getCountry())) {
            return true;
        }
        return false;
    }

    public void setupKeyTitle() {
        TouchPalIME touchPalIME = (TouchPalIME) Engine.getInstance().getIms();
        EditorInfo editorInfo = Engine.getInstance().getEditor().getEditorInfo();
        if (editorInfo != null) {
            int i = editorInfo.imeOptions & 1073742079;
            if (canShowActionTitle(i)) {
                switch (i) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.mainTitleAction = touchPalIME.getTextForImeAction(i).toString();
                        break;
                    default:
                        this.mainTitleAction = null;
                        break;
                }
            } else {
                this.mainTitleAction = null;
            }
        }
        setupKeyInfo(true);
    }

    private void setupKeyInfo(boolean z) {
        if (this.mainTitleAction == null) {
            this.mSoftKeyInfo.mainTitle = null;
            this.mSoftKeyInfo.printTitle = 0;
            if (this.icon != null) {
                this.icon.setVisible(true, false);
            }
        } else if (z) {
            this.mSoftKeyInfo.mainTitle = this.mainTitleAction;
            this.mSoftKeyInfo.printTitle = 1;
            if (this.icon != null) {
                this.icon.setVisible(false, false);
            }
            if (this.mKeyboard.f12546S != null) {
                this.mKeyboard.f12546S.mo8732a((C2806cb) this);
            }
        }
    }

    public void onTextUpdated(CharSequence charSequence, ExplicitInfo explicitInfo) {
        setupKeyInfo(false);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        int keyId;
        if (!this.mUpdated && (keyId = Engine.getInstance().getKeyId(this.keyName)) != -1) {
            this.mSoftKeyInfo.setSupportedOperation(Engine.getInstance().getKeySupportedOperation(keyId));
            Engine.getInstance().updateKey(keyId, this.mSoftKeyInfo);
        }
        this.mSoftKeyInfo.needUpdate = true;
        setupKeyInfo(true);
    }

    /* access modifiers changed from: protected */
    public String getPreviewText(int i) {
        if (this.mSoftKeyInfo.printTitle > 0) {
            return this.mSoftKeyInfo.mainTitle;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Drawable getPreviewIcon(int i) {
        if (TextUtils.isEmpty(this.mSoftKeyInfo.mainTitle)) {
            return super.getPreviewIcon(i);
        }
        return null;
    }
}
