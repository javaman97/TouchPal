package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.cust.C1240a;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.func.component.e */
/* compiled from: BackupRestoreDictionary */
public class C1670e {

    /* renamed from: a */
    private final String f5453a = "BackupRestore";

    /* renamed from: b */
    private final String[] f5454b = {"western.usr", "shortcut.lst", "chinese_simplified.usr", "chinese_traditional.usr", C1240a.f3680c, C1240a.f3679b};

    /* renamed from: c */
    private Context f5455c;

    /* renamed from: d */
    private File f5456d;

    public C1670e(Context context) {
        this.f5455c = context;
        this.f5456d = C1466av.m6848a(context);
    }

    /* renamed from: a */
    public void mo6523a() {
        if (m7676c() != null) {
            for (String a : this.f5454b) {
                mo6524a(a);
            }
            Settings.getInstance().setLongSetting(Settings.LAST_BACKUP_DICT_TIME, System.currentTimeMillis());
            Toast.makeText(this.f5455c, C1974m.m9063a(this.f5455c, (int) R.string.backup_done), 1).show();
        }
    }

    /* renamed from: b */
    public void mo6525b() {
        if ((!Engine.isInitialized() || Engine.getInstance().getUsrDicChecker().mo6519a()) && m7676c() != null) {
            boolean isInitialized = Engine.isInitialized();
            if (isInitialized) {
                C1368X.m6320c().mo5835h().release();
            }
            for (String b : this.f5454b) {
                m7675b(b);
            }
            if (isInitialized) {
                C1368X.m6320c().mo5835h().init();
            }
            Toast.makeText(this.f5455c, C1974m.m9063a(this.f5455c, (int) R.string.restore_done), 1).show();
        }
    }

    /* renamed from: a */
    public void mo6524a(String str) {
        File c;
        if (!TextUtils.isEmpty(str) && (c = m7676c()) != null) {
            C0997e.m5173a(new File(this.f5456d, str), new File(c, str));
        }
    }

    /* renamed from: b */
    private void m7675b(String str) {
        File c;
        if (!TextUtils.isEmpty(str) && (c = m7676c()) != null) {
            File file = new File(c, str);
            if (file.exists()) {
                C0997e.m5173a(file, new File(this.f5456d, str));
            }
        }
    }

    /* renamed from: c */
    private File m7676c() {
        File a = C1358O.m6234a(C1358O.f4191b);
        if (a == null) {
            Toast.makeText(this.f5455c, C1974m.m9063a(this.f5455c, (int) R.string.sdcard_not_ready_message), 1).show();
        }
        return a;
    }
}
