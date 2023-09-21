package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;

public class InlineManager extends ExplicitManager {
    private static final String TAG = "InlineManager";
    private C1372a mAccessibilityManager = C1368X.m6320c().mo5844q();
    private String mOldInlineText;
    private IInlineListener uniqueObserver = null;

    public interface IInlineListener extends ExplicitManager.IExplicitListener {
        void finishComposing();

        void onInlineUpdated(CharSequence charSequence, ExplicitInfo explicitInfo, int i, int i2, boolean z);
    }

    public InlineManager(Engine engine) {
        super(engine);
    }

    public void updateText(String str, ExplicitInfo explicitInfo, int i, int i2, boolean z) {
        do4Accessibility(str);
        if (this.uniqueObserver != null) {
            this.uniqueObserver.onInlineUpdated(str, explicitInfo, i, i2, z);
        }
        super.updateText(str, explicitInfo);
    }

    private void do4Accessibility(String str) {
        if (this.mAccessibilityManager.mo5864c()) {
            String str2 = null;
            if (this.mOldInlineText == null || str == null) {
                if (this.mOldInlineText == null && str != null) {
                    str2 = str;
                }
            } else if (str.contains(this.mOldInlineText)) {
                str2 = str.substring(this.mOldInlineText.length());
            }
            this.mAccessibilityManager.mo5862a(str2, true);
            this.mOldInlineText = str;
        }
    }

    public void finishComposing() {
        this.uniqueObserver.finishComposing();
    }

    public void registerUniqueInlineListener(IInlineListener iInlineListener) {
        this.uniqueObserver = iInlineListener;
    }
}
