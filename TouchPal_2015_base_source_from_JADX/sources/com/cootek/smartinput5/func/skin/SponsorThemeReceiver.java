package com.cootek.smartinput5.func.skin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SponsorThemeReceiver extends BroadcastReceiver {
    public static final String ACTION_SHOW_FACEBOOK_ADS = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.ACTION_SHOW_FACEBOOK_ADS";
    public static final String EXTRA_ADS_TIMESTAMP = "com.cootek.smartinputv5.func.skin.SponsorThemeReceiver.EXTRA_ADS_TIMESTAMP";
    public static final String EXTRA_PKG_NAME = "com.cootek.smartinputv5.func.skin.SponsorThemeReceiver.EXTRA_PKG_NAME";
    public static final String EXTRA_SKIN_NAME = "com.cootek.smartinputv5.func.skin.SponsorThemeReceiver.EXTRA_SKIN_NAME";

    public void onReceive(Context context, Intent intent) {
        if (ACTION_SHOW_FACEBOOK_ADS.equals(intent.getAction())) {
            C1997k.m9167a().mo7298a(intent);
        }
    }
}
