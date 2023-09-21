package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1810j;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.SkinInfoHandler */
public class SkinInfoHandler {
    private final String ACTION_SKINDOWNLOAD = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.skindownload";
    private final String TAG = "SkinInfoHandler";
    private Context mContext;
    private HashMap<String, C1810j> mSkinMap = new HashMap<>();
    private String mTargetPkg;
    private final String mVersion;
    private WebView mWebView;

    public SkinInfoHandler(Context context, WebView webView) {
        this.mContext = context;
        this.mWebView = webView;
        this.mVersion = getResString(R.string.SKIN_PACK_EXPECTED_VERSION);
        queryAllSkinPacks();
    }

    public boolean isPackageInstalled(String str) {
        return getSkinByPkgName(str) != null;
    }

    public boolean isPackageCompatible(String str) {
        C1601bg skinByPkgName = getSkinByPkgName(str);
        if (skinByPkgName == null || skinByPkgName.f5102f) {
            return false;
        }
        return true;
    }

    private C1601bg getSkinByPkgName(String str) {
        C1810j jVar = this.mSkinMap.get(str);
        if (jVar != null) {
            return (C1601bg) jVar;
        }
        return null;
    }

    public void setTargetPackageName(String str) {
        this.mTargetPkg = str;
    }

    public String getTargetPackageName() {
        return this.mTargetPkg;
    }

    /* access modifiers changed from: protected */
    public String getResString(int i) {
        return C1974m.m9063a(this.mContext, i);
    }

    public void downloadPackage(String str, String str2, String str3) {
        download(str, str2, str3, false);
    }

    public void downloadPackage(String str, String str2, String str3, boolean z) {
        download(str, str2, str3, z);
    }

    private void download(String str, String str2, String str3, boolean z) {
        File a = C1358O.m6234a("skin");
        if (a == null) {
            Toast.makeText(this.mContext, getResString(R.string.sdcard_not_ready_message), 1).show();
            return;
        }
        if (C1368X.m6324d()) {
            C1368X c = C1368X.m6320c();
            if (!c.mo5841n().mo6275g(str) && c.mo5827M().mo5995b(1)) {
                c.mo5827M().mo5996c(1);
            }
            c.mo5841n().mo6271f(str);
        }
        File file = new File(a, str2.substring(str2.lastIndexOf(47) + 1, str2.length()).replace(".apk", C1602bh.f5114c));
        if (z) {
            Intent intent = new Intent("com.emoji.keyboard.touchpal.INTERNAL_ACTION.skindownload");
            intent.putExtra("FILE_PATH", file.getAbsolutePath());
            intent.putExtra("URL", str2);
            intent.putExtra("DISPLAY_NAME", str3);
            this.mContext.sendBroadcast(intent);
            return;
        }
        C2361q.m10797b().mo8018f(str2, file.getAbsolutePath(), str3);
    }

    public void fileDownloaded() {
        queryAllSkinPacks();
        this.mWebView.loadUrl("javascript:refresh()");
    }

    public void queryAllSkinPacks() {
        ArrayList<C1810j> arrayList;
        ArrayList<C1810j> arrayList2 = null;
        if (C1368X.m6324d()) {
            arrayList = C1368X.m6320c().mo5841n().mo6268d();
            arrayList2 = C1368X.m6320c().mo5841n().mo6270e();
        } else {
            arrayList = null;
        }
        this.mSkinMap.clear();
        addSkinList(arrayList);
        addSkinList(arrayList2);
    }

    private void addSkinList(ArrayList<C1810j> arrayList) {
        if (arrayList != null) {
            Iterator<C1810j> it = arrayList.iterator();
            while (it.hasNext()) {
                C1810j next = it.next();
                if (next != null) {
                    this.mSkinMap.put(next.mo6810a(), next);
                }
            }
        }
    }

    public void uninstallPackage(C1601bg bgVar) {
        if (!bgVar.f5932a.mo6023b()) {
            C2894d.C2895a aVar = new C2894d.C2895a(this.mContext);
            aVar.setTitle(getResString(R.string.delete_skin));
            aVar.setPositiveButton(getResString(17039379), new C3129cX(this, bgVar));
            aVar.setNegativeButton(getResString(17039369), new C3130cY(this));
            aVar.create().show();
            return;
        }
        bgVar.f5932a.mo6025d();
    }
}
