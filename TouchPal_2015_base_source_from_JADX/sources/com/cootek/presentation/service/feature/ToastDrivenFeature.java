package com.cootek.presentation.service.feature;

import org.xmlpull.v1.XmlPullParser;

public class ToastDrivenFeature extends PresentFeature {
    public ToastDrivenFeature(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        this.initialPromptDays = 0;
        this.promptInterval = 0.0f;
        this.promptTimes = -1;
        this.priority = 2;
        this.mDependencySettingKey = null;
        this.mStartTime = -1;
        this.mExpiredTime = -1;
        this.mStartSelfVersion = -1;
        this.mEndSelfVersion = -1;
    }

    /* access modifiers changed from: protected */
    public boolean matchSpecial(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
    }
}
