package com.cootek.presentation.sdk;

import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public interface IPresentToastCreator {
    PresentToast create(String str, XmlPullParser xmlPullParser);

    boolean match(String str, PresentToast presentToast);
}
