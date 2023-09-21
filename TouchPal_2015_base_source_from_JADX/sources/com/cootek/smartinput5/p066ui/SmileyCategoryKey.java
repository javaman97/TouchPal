package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.SmileyCategoryKey */
public class SmileyCategoryKey extends C2806cb {
    private static final String CATEGORY_KEY_NAME_PREFIX = "sk_category_";
    private int mFocusColor = C1368X.m6320c().mo5841n().mo6260b((int) R.color.smiley_key_main_text_color);
    private String mTargetCategory;

    public SmileyCategoryKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public boolean isCurrent() {
        return TextUtils.equals(this.mTargetCategory, Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_CATEGORY, 22, C1351J.m6188a().mo5645d(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB)), (Config) null));
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        super.updateKeyInfo();
        this.mTargetCategory = this.keyName == null ? null : this.keyName.replace(CATEGORY_KEY_NAME_PREFIX, "");
    }

    /* access modifiers changed from: protected */
    public int[] getBackState() {
        if (isCurrent()) {
            return STATE_FOCUSED;
        }
        return super.getBackState();
    }

    /* access modifiers changed from: protected */
    public Integer getForeColor() {
        return Integer.valueOf(this.mFocusColor);
    }
}
