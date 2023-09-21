package com.cootek.presentation.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.sdk.utils.ActionDriverHelper;
import com.cootek.presentation.service.toast.DesktopShortcutToast;
import com.cootek.presentation.service.toast.PresentToast;
import java.util.HashMap;

public class PresentationServiceReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        DesktopShortcutToast desktopShortcutToast;
        String imagePathInner;
        if (intent.getAction() != null) {
            if (intent.getAction().equals(PresentationManager.INTENT_ACITON_CONFIG_UPDATE)) {
                if (PresentationSystem.DUMPINFO) {
                    Log.i("Joe", "Time to update!");
                }
                PresentationSystem.init(context);
                PresentationSystem.getInstance().updateWithDelay();
            } else if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (PresentationSystem.DUMPINFO) {
                    Log.i("Joe", "network changed!");
                }
                PresentationSystem.init(context);
                PresentationSystem.getInstance().update();
            } else if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
                Intent intent2 = new Intent();
                intent2.setAction(PresentationManager.INTENT_ACTION_START_WORK);
                intent2.setPackage(context.getPackageName());
                context.sendBroadcast(intent2);
            } else if (intent.getAction().equals(PresentationManager.INTENT_ACTION_CHECK_SHORTCUT_TOAST)) {
                String stringExtra2 = intent.getStringExtra(PresentationManager.INTENT_EXTRA_PRESENT_ID);
                PresentationSystem.init(context);
                if (stringExtra2 != null) {
                    desktopShortcutToast = (DesktopShortcutToast) PresentationSystem.getInstance().getToastByFeatureId(stringExtra2);
                } else {
                    desktopShortcutToast = (DesktopShortcutToast) PresentationSystem.getInstance().getPresentToast(DesktopShortcutToast.class, (String) null);
                }
                if (desktopShortcutToast != null && (imagePathInner = desktopShortcutToast.getImagePathInner()) != null) {
                    String display = desktopShortcutToast.getDisplay();
                    HashMap hashMap = new HashMap();
                    hashMap.put(PresentationManager.INTENT_EXTRA_PRESENT_ID, desktopShortcutToast.getId());
                    ActionDriverHelper.createDesktopShortcut(context, display, DesktopShortcutToast.INTENT_ACTION_DESKTOP_SHORTCUT_HANDLE, imagePathInner, hashMap);
                    PresentationSystem.getInstance().shown(desktopShortcutToast.getId());
                }
            } else if (intent.getAction().equals(PresentationManager.INTENT_ACTION_REMOVE_SHORTCUT_TOAST) && (stringExtra = intent.getStringExtra(PresentationManager.INTENT_EXTRA_PRESENT_ID)) != null) {
                PresentationSystem.init(context);
                PresentToast toastByFeatureId = PresentationSystem.getInstance().getToastByFeatureId(stringExtra);
                if (toastByFeatureId != null && (toastByFeatureId instanceof DesktopShortcutToast)) {
                    String display2 = toastByFeatureId.getDisplay();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(PresentationManager.INTENT_EXTRA_PRESENT_ID, stringExtra);
                    ActionDriverHelper.deleteDesktopShortcut(context, display2, DesktopShortcutToast.INTENT_ACTION_DESKTOP_SHORTCUT_HANDLE, hashMap2);
                }
            }
        }
    }
}
