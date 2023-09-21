package com.cootek.smartinput5.func;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

public class AttachedPackageReceiver extends BroadcastReceiver {
    private String mChangeList;
    private String mExternalAvailable;
    private String mExternalUnavailable;
    private boolean mInitialized = false;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[SYNTHETIC, Splitter:B:13:0x0022] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initializeFieldsForReflection() {
        /*
            r6 = this;
            r1 = 0
            boolean r0 = r6.mInitialized
            if (r0 != 0) goto L_0x0042
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            java.lang.String r2 = "ACTION_EXTERNAL_APPLICATIONS_AVAILABLE"
            java.lang.reflect.Field r2 = r0.getField(r2)     // Catch:{ SecurityException -> 0x0043, NoSuchFieldException -> 0x004a }
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            java.lang.String r3 = "ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE"
            java.lang.reflect.Field r0 = r0.getField(r3)     // Catch:{ SecurityException -> 0x005a, NoSuchFieldException -> 0x0055 }
            java.lang.Class<android.content.Intent> r3 = android.content.Intent.class
            java.lang.String r4 = "EXTRA_CHANGED_PACKAGE_LIST"
            java.lang.reflect.Field r1 = r3.getField(r4)     // Catch:{ SecurityException -> 0x005d, NoSuchFieldException -> 0x0058 }
            r5 = r0
            r0 = r2
            r2 = r5
        L_0x0020:
            if (r0 == 0) goto L_0x003f
            android.content.Intent r3 = new android.content.Intent     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            r6.mExternalAvailable = r0     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            r6.mExternalUnavailable = r0     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            java.lang.Object r0 = r1.get(r3)     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
            r6.mChangeList = r0     // Catch:{ IllegalArgumentException -> 0x0053, IllegalAccessException -> 0x0051 }
        L_0x003f:
            r0 = 1
            r6.mInitialized = r0
        L_0x0042:
            return
        L_0x0043:
            r0 = move-exception
            r0 = r1
            r2 = r1
        L_0x0046:
            r5 = r0
            r0 = r2
            r2 = r5
            goto L_0x0020
        L_0x004a:
            r0 = move-exception
            r0 = r1
            r2 = r1
        L_0x004d:
            r5 = r0
            r0 = r2
            r2 = r5
            goto L_0x0020
        L_0x0051:
            r0 = move-exception
            goto L_0x003f
        L_0x0053:
            r0 = move-exception
            goto L_0x003f
        L_0x0055:
            r0 = move-exception
            r0 = r1
            goto L_0x004d
        L_0x0058:
            r3 = move-exception
            goto L_0x004d
        L_0x005a:
            r0 = move-exception
            r0 = r1
            goto L_0x0046
        L_0x005d:
            r3 = move-exception
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.AttachedPackageReceiver.initializeFieldsForReflection():void");
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!C1368X.m6324d() && "android.intent.action.MEDIA_EJECT".equals(action)) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
        if (C1811k.m8322a() != null) {
            initializeFieldsForReflection();
            if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                if (hasPkgName(intent)) {
                    String lowerCase = intent.getData().getEncodedSchemeSpecificPart().toLowerCase();
                    C1896t.m8712a().mo7039c(lowerCase);
                    if (lowerCase.equals(HandWriteManager.f4135c) && C1368X.m6324d() && !C1368X.m6320c().mo5848u().mo5599c() && C1368X.m6320c().mo5848u().mo5606j()) {
                        C1368X.m6320c().mo5848u().mo5607k();
                    }
                    C2361q.m10797b().mo8017f(lowerCase);
                    C1811k.m8322a().mo6818a(lowerCase);
                }
            } else if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                if (hasPkgName(intent)) {
                    C1811k.m8322a().mo6819a(intent.getData().getEncodedSchemeSpecificPart().toLowerCase(), intent.getBooleanExtra("android.intent.extra.REPLACING", false));
                }
            } else if (action.equals(this.mExternalAvailable)) {
                String[] stringArrayExtra = intent.getStringArrayExtra(this.mChangeList);
                if (stringArrayExtra != null) {
                    for (String a : stringArrayExtra) {
                        C1811k.m8322a().mo6818a(a);
                    }
                }
            } else if (action.equals(this.mExternalUnavailable)) {
                if (Engine.isInitialized()) {
                    Engine.getInstance().getIms().requestHideSelf(0);
                }
                C2361q.m10797b().mo8021h();
            } else if (action.equals("android.intent.action.MEDIA_EJECT")) {
                C1358O.m6240c();
                if (C1358O.m6239b() == null) {
                    if (Engine.isInitialized()) {
                        if (C1132b.m5654a(context).mo4392a(C1135d.SD_CARD_EJECT_SHOW_MESSAGE, (Boolean) true).booleanValue()) {
                            try {
                                Toast.makeText(context, C1974m.m9063a(context, (int) R.string.sdcard_ejected), 1).show();
                            } catch (NullPointerException e) {
                            }
                        }
                        Engine.getInstance().getIms().requestHideSelf(0);
                    }
                    C1358O.m6238a(true);
                    if (C1368X.m6324d()) {
                        C1368X.m6320c().mo5845r().mo7197c();
                        C1368X.m6320c().mo5847t().mo7074a();
                        C1368X.m6320c().mo5815A().mo5563a();
                        C1368X.m6320c().mo5842o().mo5941e();
                        C1368X.m6320c().mo5848u().mo5595a();
                        C1368X.m6320c().mo5839l().notifyOtherProcesses(Message.obtain((Handler) null, 13));
                    }
                    C2361q.m10797b().mo8021h();
                }
            } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                C1358O.m6240c();
                C1358O.m6238a(false);
                if (C1368X.m6324d()) {
                    C1368X.m6320c().mo5841n().mo6278h(Settings.getInstance().getStringSetting(80));
                    C1368X.m6320c().mo5841n().mo5928a();
                    C1368X.m6320c().mo5845r().mo7197c();
                    C1368X.m6320c().mo5847t().mo7074a();
                    C1368X.m6320c().mo5815A().mo5563a();
                    C1368X.m6320c().mo5842o().mo5941e();
                    C1368X.m6320c().mo5848u().mo5595a();
                    C1368X.m6320c().mo5839l().notifyOtherProcesses(Message.obtain((Handler) null, 14));
                }
                if (Engine.isInitialized()) {
                    Engine.getInstance().getIms().requestHideSelf(0);
                }
            }
        }
    }

    private boolean hasPkgName(Intent intent) {
        if (intent.getData() == null || intent.getData().getEncodedSchemeSpecificPart() == null) {
            return false;
        }
        return true;
    }
}
