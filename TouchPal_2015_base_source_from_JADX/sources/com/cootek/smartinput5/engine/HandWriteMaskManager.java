package com.cootek.smartinput5.engine;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.HandWriteManager;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p066ui.C2618H;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.DialectBar;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.HandWriteMask;
import com.cootek.smartinput5.p066ui.HandWriteMaskView;
import com.emoji.keyboard.touchpal.R;

public class HandWriteMaskManager {
    private static final String TAG = "HandWriteMaskManager";
    private AlertDialog mDownloadDialog = null;
    /* access modifiers changed from: private */
    public Engine mEngine;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    private String[] mHandwrite = new String[6];

    public HandWriteMaskManager(Engine engine) {
        this.mEngine = engine;
        this.mHandwrite[0] = HandWriteManager.f4135c;
        this.mHandwrite[1] = "com.cootek.smartinputv5.language.chs.multihandwrite";
        this.mHandwrite[2] = "com.cootek.smartinputv5.language.chs.cloudhandwrite";
        this.mHandwrite[3] = HandWriteManager.f4136d;
        this.mHandwrite[4] = "com.cootek.smartinputv5.language.v5.chs.multihandwrite";
        this.mHandwrite[5] = "com.cootek.smartinputv5.language.v5.chs.cloudhandwrite";
    }

    /* access modifiers changed from: private */
    public static boolean mustHasHWData() {
        if (C1549b.f4835f.equals(C1368X.m6320c().mo5835h().getCurrentLanguageId())) {
            return true;
        }
        return false;
    }

    public void updateHandWriteMask(boolean z) {
        if (Engine.getInstance().getSurfaceTemplate() != null && this.mEngine.getWidgetManager().mo9659p() != null) {
            if (z) {
                showMask();
            } else {
                hideMask();
            }
            FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
            if (h != null) {
                h.mo8558r();
            }
        }
    }

    public void showDownloadInfo() {
        final HandWriteMask p = this.mEngine.getWidgetManager().mo9659p();
        if (Engine.getInstance().getSurfaceTemplate() != null && p != null) {
            this.mHandler.postDelayed(new Runnable() {
                public void run() {
                    if (HandWriteMaskManager.this.mEngine.getIms().getWindow().getWindow().getDecorView().getWindowToken() == null) {
                        HandWriteMaskManager.this.mHandler.postDelayed(this, 200);
                        return;
                    }
                    int status = p.getStatus();
                    if (HandWriteMaskManager.mustHasHWData() && (status == 2 || status == 1 || status == 3)) {
                        HandWriteMaskManager.this.showDownloadMask();
                    } else if (HandWriteMaskManager.mustHasHWData() || status != 2) {
                        HandWriteMaskManager.this.showDownloadDialog();
                    } else {
                        HandWriteMaskManager.this.showDownloadToast();
                    }
                }
            }, 0);
        }
    }

    private void showMask() {
        HandWriteMask p = this.mEngine.getWidgetManager().mo9659p();
        p.setStatus(4);
        Settings.getInstance().setIntSetting(29, Settings.HW_RECOG_RANGE_ALL, 8, C1549b.f4831b, (Config) null, true);
        p.setVisible(true);
        HandWriteMaskView E = this.mEngine.getWidgetManager().mo9600E();
        if (E != null) {
            E.setTopView(this.mEngine.getWidgetManager().mo9651i().mo9716b());
            E.setInputView(this.mEngine.getWidgetManager().mo9643e());
            E.mo8622e();
            this.mEngine.getFilterManager().registerFilterListener(E);
            this.mEngine.getCandidateManager().registerCandidateListener(E);
        }
        if (this.mEngine.getWidgetManager().mo9604J() != null) {
            this.mEngine.getFilterManager().unregisterFilterListener(this.mEngine.getWidgetManager().mo9604J());
        }
        DialectBar g = this.mEngine.getWidgetManager().mo9651i().mo9721g();
        if (g != null) {
            this.mEngine.getCandidateManager().unregisterCandidateListener(g);
        }
    }

    private void hideMask() {
        popupBackToKeyboardWarningDialog();
        this.mEngine.getWidgetManager().mo9659p().setVisible(false);
        HandWriteMaskView e = this.mEngine.getWidgetManager().mo9644e(false);
        if (e != null) {
            e.mo8624h();
            this.mEngine.getFilterManager().unregisterFilterListener(e);
            this.mEngine.getCandidateManager().unregisterCandidateListener(e);
        }
        if (this.mEngine.getWidgetManager().mo9604J() != null) {
            this.mEngine.getFilterManager().registerFilterListener(this.mEngine.getWidgetManager().mo9604J());
        }
        DialectBar g = this.mEngine.getWidgetManager().mo9651i().mo9721g();
        if (g != null) {
            this.mEngine.getCandidateManager().registerCandidateListener(g);
        }
    }

    /* access modifiers changed from: private */
    public void showDownloadMask() {
        HandWriteMask p = this.mEngine.getWidgetManager().mo9659p();
        p.setStatus(p.getStatus());
        p.setVisible(true);
    }

    /* access modifiers changed from: private */
    public void showDownloadToast() {
        Toast makeText = Toast.makeText(this.mEngine.getIms(), C1974m.m9063a((Context) this.mEngine.getIms(), (int) R.string.downloading_handwrite_data), 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public void showDownloadDialog() {
        if (this.mDownloadDialog == null) {
            initDownloadDialog();
        }
        initDownloadDialogContent();
        if (this.mDownloadDialog != null && this.mEngine.getIms().isInputViewShown()) {
            Engine.getInstance().getDialogManager().showDialog(this.mDownloadDialog);
        }
    }

    private void initDownloadDialogContent() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1974m.m9063a((Context) this.mEngine.getIms(), getDownloadTitleId()));
        if (oldHWPackageExist()) {
            sb.append(C1974m.m9063a((Context) this.mEngine.getIms(), (int) R.string.uninstall_old_handwrite_package));
        }
        this.mDownloadDialog.setMessage(sb.toString());
    }

    private void initDownloadDialog() {
        C2894d.C2895a aVar = new C2894d.C2895a(this.mEngine.getIms());
        aVar.setPositiveButton(C1974m.m9063a((Context) this.mEngine.getIms(), (int) R.string.download), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                HandWriteMaskManager.this.download();
            }
        });
        aVar.setNegativeButton(C1974m.m9063a((Context) this.mEngine.getIms(), (int) R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                HandWriteMaskManager.this.cancel();
            }
        });
        aVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                HandWriteMaskManager.this.cancel();
            }
        });
        this.mDownloadDialog = aVar.create();
        Window window = this.mDownloadDialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        attributes.token = this.mEngine.getIms().getWindow().getWindow().getDecorView().getWindowToken();
        window.setAttributes(attributes);
        window.addFlags(131072);
    }

    private int getDownloadTitleId() {
        switch (C1368X.m6320c().mo5848u().mo5605i()) {
            case 2:
                return R.string.download_handwrite_to_sdcard_incompatible;
            case 3:
                return R.string.download_handwrite_to_memory;
            case 4:
                return R.string.download_handwrite_to_memory_incompatible;
            default:
                return R.string.download_handwrite_to_sdcard;
        }
    }

    /* access modifiers changed from: private */
    public void download() {
        C2361q.m10797b().mo8024j(C1368X.m6320c().mo5848u().mo5597b(), C1974m.m9063a((Context) this.mEngine.getIms(), (int) R.string.paopao_handwrite_data_title), (String) null);
        HandWriteMask p = this.mEngine.getWidgetManager().mo9659p();
        p.setStatus(2);
        if (mustHasHWData()) {
            p.setVisible(true);
        }
        if (oldHWPackageExist()) {
            removeOldHWPackage();
        }
    }

    /* access modifiers changed from: private */
    public void cancel() {
        HandWriteMask p = this.mEngine.getWidgetManager().mo9659p();
        if (mustHasHWData()) {
            p.setStatus(1);
            p.setVisible(true);
            if (Engine.getInstance().getWidgetManager().mo9641c(false) != null) {
                Engine.getInstance().getWidgetManager().mo9641c(false).mo8632e();
            }
        }
    }

    private boolean oldHWPackageExist() {
        return false;
    }

    private void removeOldHWPackage() {
        for (int i = 0; i < 3; i++) {
            if (C1811k.m8322a().mo6823b(this.mHandwrite[i])) {
                Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + this.mHandwrite[i]));
                intent.setFlags(Engine.EXCEPTION_ERROR);
                this.mEngine.getIms().startActivity(intent);
            }
        }
    }

    private void popupBackToKeyboardWarningDialog() {
        int intSetting = Settings.getInstance().getIntSetting(Settings.AUTO_LEAVE_HANDWRITE_MASK_TIMES);
        String c = C1368X.m6320c().mo5842o().mo5954l(Engine.getInstance().getCurrentLanguageId()).mo6153c();
        String format = String.format(C1974m.m9063a((Context) this.mEngine.getIms(), (int) R.string.handwrite_mask_backtokeyboard), new Object[]{c});
        if (intSetting == 1) {
            C2618H h = new C2618H(this.mEngine.getIms());
            h.mo8580b(format);
            h.mo8574a(C1974m.m9063a((Context) this.mEngine.getIms(), (int) R.string.handwrite_mask_backtokeyboard_alert_ok), (View.OnClickListener) null);
            h.mo8567a();
            Settings.getInstance().setIntSetting(Settings.AUTO_LEAVE_HANDWRITE_MASK_TIMES, intSetting + 1);
        }
    }
}
