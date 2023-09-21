package com.cootek.smartinput5.engine;

import android.app.Dialog;
import android.os.IBinder;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p050f.C1319a;
import com.cootek.smartinput5.p050f.C1334o;
import com.cootek.smartinput5.p066ui.C2683aV;
import com.cootek.smartinput5.p066ui.C2887ct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DialogManager {
    public static final int ATTR_DEFAULT = 0;
    public static final int ATTR_DISMISS_ON_ORIENTATION_CHANGED = 1;
    private Engine engine;
    private HashMap<Dialog, Integer> mDialogMap = new HashMap<>();
    private C1319a mPop;
    private C2887ct mSpaceFuncDialog;

    public DialogManager(Engine engine2) {
        this.engine = engine2;
    }

    public void onKeycode(int i) {
        if (i == 3276804) {
            showAutoSpaceTipDialog();
        }
    }

    private void showAutoSpaceTipDialog() {
        if (this.mSpaceFuncDialog == null) {
            this.mSpaceFuncDialog = new C2887ct(C1368X.m6313b());
        }
        this.mSpaceFuncDialog.mo7053a();
    }

    public boolean showWizardTipsDialog(C1334o oVar) {
        if ((this.mPop != null && this.mPop.mo5543a()) || !C1319a.m6097a(C1368X.m6313b(), oVar)) {
            return false;
        }
        this.mPop = new C1319a(this.engine.getIms(), oVar);
        this.mPop.mo5544b();
        return true;
    }

    public boolean isWizardTipsDialogShowing() {
        if (this.mPop == null) {
            return false;
        }
        return this.mPop.mo5543a();
    }

    public void showDialog(Dialog dialog) {
        showDialog(dialog, 0);
    }

    public void showDialog(Dialog dialog, int i) {
        IBinder windowToken = Engine.getInstance().getIms().getWindow().getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            dialog.getWindow().getAttributes().token = windowToken;
        }
        try {
            dialog.show();
            this.mDialogMap.put(dialog, Integer.valueOf(i));
        } catch (Exception e) {
        }
    }

    public void dismissDialog(Dialog dialog) {
        dialog.dismiss();
        this.mDialogMap.remove(dialog);
    }

    public void onHide() {
        if (this.mPop != null && this.mPop.mo5543a()) {
            this.mPop.mo5545c();
        }
        for (Dialog next : this.mDialogMap.keySet()) {
            if (next != null && next.isShowing()) {
                try {
                    next.dismiss();
                } catch (Exception e) {
                }
            }
        }
        this.mDialogMap.clear();
    }

    public void onOrientationChanged() {
        if (this.mPop != null && this.mPop.mo5543a()) {
            this.mPop.mo5545c();
        }
        ArrayList<Dialog> arrayList = new ArrayList<>();
        for (Map.Entry next : this.mDialogMap.entrySet()) {
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                ((Dialog) next.getKey()).dismiss();
                arrayList.add(next.getKey());
            }
        }
        for (Dialog remove : arrayList) {
            this.mDialogMap.remove(remove);
        }
        arrayList.clear();
    }

    public boolean showLangFirstSetupDialog(String str) {
        return new C2683aV(this.engine.getIms()).mo8929b(str);
    }
}
