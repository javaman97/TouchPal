package com.cootek.smartinput5.func.learnmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.learnmanager.C1823f;

public class LearnTextReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        if (intent.getAction().equals(C1823f.C1824a.f6080b[0]) && (intExtra = intent.getIntExtra(C1823f.C1824a.f6081c, -1)) != -1 && C1368X.m6324d()) {
            C1823f.C1824a[] d = C1368X.m6320c().mo5843p().mo6834a().mo6869d();
            if (d[intExtra] != null) {
                d[intExtra].mo6843a();
            }
        }
    }
}
