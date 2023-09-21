package com.cootek.smartinput5.func.iab;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;

/* renamed from: com.cootek.smartinput5.func.iab.W */
/* compiled from: PurchaseChannelChooseActivity */
class C1755W extends Handler {

    /* renamed from: a */
    final /* synthetic */ PurchaseChannelChooseActivity f5728a;

    C1755W(PurchaseChannelChooseActivity purchaseChannelChooseActivity) {
        this.f5728a = purchaseChannelChooseActivity;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case 1:
                this.f5728a.doShowChooserPage();
                this.f5728a.loadChannelFinished(0);
                return;
            case 2:
                this.f5728a.finish();
                return;
            case 3:
                Bundle data = message.getData();
                int i = data.getInt(PurchaseChannelChooseActivity.PURCHASE_GOODS_ID);
                String string = data.getString(PurchaseChannelChooseActivity.PURCHASE_TRANS_ID);
                String string2 = data.getString(PurchaseChannelChooseActivity.PURCHASE_CHANNEL_NAME);
                String string3 = data.getString(PurchaseChannelChooseActivity.PURCHASE_EXTR_INFO_STRING);
                if (TextUtils.isEmpty(string)) {
                    this.f5728a.doLaunchLocalPurchase(i, string2, string3);
                    return;
                }
                this.f5728a.doLaunchLocalPurchaseWithTransId(i, string, string2, string3);
                this.f5728a.loadChannelFinished(0);
                return;
            case 4:
                Bundle data2 = message.getData();
                this.f5728a.setFinishResult(-1, data2.getInt(PurchaseChannelChooseActivity.PURCHASE_GOODS_ID), data2.getString("status"));
                return;
            case 5:
                this.f5728a.doSetHandleBackInWeb(message.getData().getBoolean("handleBackInWebPage", false));
                return;
            case 6:
                Bundle data3 = message.getData();
                this.f5728a.addPromotionApp(data3.getString(PurchaseChannelChooseActivity.PURCHASE_CHANNEL_NAME), data3.getString("appName"));
                return;
            default:
                return;
        }
    }
}
