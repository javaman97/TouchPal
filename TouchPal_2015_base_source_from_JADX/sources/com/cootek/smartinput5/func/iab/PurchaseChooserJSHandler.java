package com.cootek.smartinput5.func.iab;

public interface PurchaseChooserJSHandler {
    void finishChooserPage();

    void launchLocalPurchase(int i, String str, String str2, String str3);

    void notifyPurchaseViaPromotionApps(int i, String str, String str2);

    void setHandleBackTag(boolean z);

    void setPurchaseResult(int i, String str);

    void showChooserPage();
}
