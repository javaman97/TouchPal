package com.cootek.presentation.service.feature;

import org.xmlpull.v1.XmlPullParser;

public class NewWordsUpdateFeature extends PresentFeature {
    public NewWordsUpdateFeature(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public boolean matchSpecial(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
    }
}
