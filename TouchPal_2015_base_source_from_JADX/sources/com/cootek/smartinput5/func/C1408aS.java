package com.cootek.smartinput5.func;

import android.app.AlertDialog;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.func.aS */
/* compiled from: OemSkinDownloadReceiver */
final class C1408aS implements C2183M.C2184a {
    C1408aS() {
    }

    /* renamed from: c */
    public void mo5573c(String str) {
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        PackageInfo packageArchiveInfo = C1368X.m6313b().getPackageManager().getPackageArchiveInfo(file.getPath(), 0);
        if (packageArchiveInfo != null) {
            C1811k.m8322a().mo6818a(packageArchiveInfo.packageName);
            if (!Engine.isInitialized()) {
                return;
            }
            if (Engine.getInstance().getIms().isInputViewShown()) {
                AlertDialog create = new AlertDialog.Builder(C1368X.m6313b()).setTitle(C1974m.m9063a(C1368X.m6313b(), (int) R.string.oem_skin_switch_title)).setNegativeButton(C1974m.m9063a(C1368X.m6313b(), (int) R.string.no), new C1410aU(this)).setPositiveButton(C1974m.m9063a(C1368X.m6313b(), (int) R.string.yes), new C1409aT(this, packageArchiveInfo)).create();
                Window window = create.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.type = C2261Q.f9802h;
                window.setAttributes(attributes);
                window.addFlags(131072);
                Engine.getInstance().getDialogManager().showDialog(create);
                return;
            }
            m6618a(packageArchiveInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6618a(PackageInfo packageInfo) {
        C1602bh n = C1368X.m6320c().mo5841n();
        Settings.getInstance().setStringSetting(80, packageInfo.packageName);
        n.mo6258a(packageInfo.packageName, false, true);
        Engine.getInstance().getIms().requestHideSelf(0);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(Message.obtain((Handler) null, 8));
    }

    /* renamed from: b */
    public void mo5571b(String str) {
    }

    /* renamed from: f */
    public void mo5577f() {
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        return false;
    }
}
