package com.cootek.presentation.service.config;

import android.os.Handler;
import android.os.Message;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.Presentations;
import com.cootek.presentation.service.history.PresentHistoryManager;
import com.cootek.presentation.service.history.PresentStatisticUploader;
import com.cootek.presentation.service.toast.PresentToast;

public class PresentConfigLoader {
    private static final String TAG = "PresentConfigLoader";
    private static final int WHAT_LOAD = 1;
    private static final int WHAT_PREPARE = 2;
    private static final int WHAT_PREPARE_ALL = 3;
    private static final int WHAT_SORT = 4;
    private Handler mHandler = new Handler(PresentConfigHandler.sThread.getLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 1) {
                PresentConfigLoader.this.trySetPresentations(PresentConfigLoader.this.tryParse());
                PresentationSystem.getInstance().onMessageReady();
            } else if (message.what == 2) {
                if (message.obj != null) {
                    tryPrepareContent((String) message.obj);
                }
            } else if (message.what == 3) {
                tryPrepareContent();
                PresentConfigLoader.this.tryPresentToasts();
            } else if (message.what == 4) {
                trySortPresentations();
            }
            super.handleMessage(message);
        }

        private void tryPrepareContent() {
            Presentations presentations = PresentationSystem.getInstance().getPresentations();
            if (presentations != null && presentations.getToasts() != null) {
                for (PresentToast next : presentations.getToasts()) {
                    if (!next.isReady() && next.downloadStrategy == 0) {
                        ContentDownloader.prepareContent(next);
                    }
                }
            }
        }

        private void tryPrepareContent(String str) {
            Presentations presentations = PresentationSystem.getInstance().getPresentations();
            if (presentations != null && presentations.getToasts() != null) {
                for (PresentToast next : presentations.getToasts()) {
                    if (str.equals(next.getId()) && !next.isReady()) {
                        ContentDownloader.prepareContent(next);
                    }
                }
            }
        }

        private void trySortPresentations() {
            Presentations presentations = PresentationSystem.getInstance().getPresentations();
            if (presentations != null && presentations.getToasts() != null) {
                PresentationSystem.getInstance().getPresentations().sort();
            }
        }
    };
    private PresentConfigParser mParser = new PresentConfigParser();

    public void load() {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1));
    }

    public void prepareAll() {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3));
    }

    public void prepare(String str) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, str));
    }

    public void sort() {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[SYNTHETIC, Splitter:B:13:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a A[SYNTHETIC, Splitter:B:9:0x002a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.cootek.presentation.service.Presentations tryParse() {
        /*
            r4 = this;
            r0 = 0
            com.cootek.presentation.service.PresentationSystem r1 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ FileNotFoundException -> 0x0057 }
            android.content.Context r1 = r1.getContext()     // Catch:{ FileNotFoundException -> 0x0057 }
            java.io.File r2 = r1.getFilesDir()     // Catch:{ FileNotFoundException -> 0x0057 }
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0057 }
            java.lang.String r3 = "tp_promo.xml"
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x0057 }
            boolean r2 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0057 }
            if (r2 != 0) goto L_0x007c
            com.cootek.presentation.service.PresentationSystem r2 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ RemoteException -> 0x004d }
            com.cootek.presentation.sdk.INativeAppInfoRemote r2 = r2.getNativeAppInfo()     // Catch:{ RemoteException -> 0x004d }
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = r2.getLocalConfigPath()     // Catch:{ RemoteException -> 0x004d }
        L_0x0028:
            if (r2 == 0) goto L_0x007c
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0057 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0057 }
            r2 = r1
        L_0x0030:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0057 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0057 }
        L_0x0035:
            if (r1 == 0) goto L_0x004c
            com.cootek.presentation.service.config.PresentConfigParser r2 = r4.mParser     // Catch:{ XmlPullParserException -> 0x0061, IOException -> 0x006a }
            com.cootek.presentation.service.Presentations r0 = r2.parse((java.io.InputStream) r1)     // Catch:{ XmlPullParserException -> 0x0061, IOException -> 0x006a }
            if (r0 == 0) goto L_0x0049
            r0.sort()     // Catch:{ XmlPullParserException -> 0x0061, IOException -> 0x006a }
            boolean r2 = com.cootek.presentation.service.PresentationSystem.DUMPINFO     // Catch:{ XmlPullParserException -> 0x0061, IOException -> 0x006a }
            if (r2 == 0) goto L_0x0049
            r0.dumpInfo()     // Catch:{ XmlPullParserException -> 0x0061, IOException -> 0x006a }
        L_0x0049:
            r1.close()     // Catch:{ IOException -> 0x0073 }
        L_0x004c:
            return r0
        L_0x004d:
            r2 = move-exception
            java.lang.String r2 = "PresentConfigLoader"
            java.lang.String r3 = "update -- remote exception: no getLocalConfig"
            android.util.Log.e(r2, r3)     // Catch:{ FileNotFoundException -> 0x0057 }
        L_0x0055:
            r2 = r0
            goto L_0x0028
        L_0x0057:
            r1 = move-exception
            java.lang.String r1 = "PresentConfigLoader"
            java.lang.String r2 = "update -- parser exception: file not found"
            android.util.Log.e(r1, r2)
            r1 = r0
            goto L_0x0035
        L_0x0061:
            r2 = move-exception
            java.lang.String r2 = "PresentConfigLoader"
            java.lang.String r3 = "update -- parser exception: format not correct"
            android.util.Log.e(r2, r3)
            goto L_0x0049
        L_0x006a:
            r2 = move-exception
            java.lang.String r2 = "PresentConfigLoader"
            java.lang.String r3 = "update -- parser exception: format not correct"
            android.util.Log.e(r2, r3)
            goto L_0x0049
        L_0x0073:
            r1 = move-exception
            java.lang.String r1 = "PresentConfigLoader"
            java.lang.String r2 = "update -- parser exception: close file error"
            android.util.Log.e(r1, r2)
            goto L_0x004c
        L_0x007c:
            r2 = r1
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.service.config.PresentConfigLoader.tryParse():com.cootek.presentation.service.Presentations");
    }

    /* access modifiers changed from: private */
    public void tryPresentToasts() {
        PresentationSystem.getInstance().checkStatusToast((String) null);
        PresentationSystem.getInstance().checkDummyToast((String) null);
        PresentationSystem.getInstance().checkShortcutToast((String) null);
    }

    /* access modifiers changed from: private */
    public void trySetPresentations(Presentations presentations) {
        if (presentations != null) {
            PresentationSystem.getInstance().setPresentations(presentations);
            PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
            for (PresentToast next : presentations.getToasts()) {
                if (!historyManager.getFeatureSettingBoolean(next.getId(), PresentHistoryManager.ALREADY_PARSE) && PresentationSystem.getInstance().getPresentStatisticUploader().addItem(PresentStatisticUploader.TYPE_PARSE, (String) null, next.getId())) {
                    historyManager.setFeatureSetting(next.getId(), PresentHistoryManager.ALREADY_PARSE, true);
                }
            }
        }
    }
}
