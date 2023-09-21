package com.cootek.smartinput5;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.cootek.p042a.p043a.C0898b;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.asset.C1460o;

/* renamed from: com.cootek.smartinput5.aa */
/* compiled from: TouchPalIME */
class C1090aa implements C1452i.C1453a {

    /* renamed from: a */
    final /* synthetic */ EditorInfo f3088a;

    /* renamed from: b */
    final /* synthetic */ boolean f3089b;

    /* renamed from: c */
    final /* synthetic */ TouchPalIME f3090c;

    C1090aa(TouchPalIME touchPalIME, EditorInfo editorInfo, boolean z) {
        this.f3090c = touchPalIME;
        this.f3088a = editorInfo;
        this.f3089b = z;
    }

    /* renamed from: a */
    public void mo4255a() {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
    }

    /* renamed from: a */
    public void mo4256a(Context context, C1452i.C1454b bVar) {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
        if (bVar == C1452i.C1454b.success) {
            boolean unused = this.f3090c.initialize();
            if (!this.f3090c.checkEngineState()) {
                this.f3090c.setupInputView();
                if (this.f3090c.getResources().getConfiguration().hardKeyboardHidden == 1 && Engine.isInitialized()) {
                    InputConnection currentInputConnection = this.f3090c.getCurrentInputConnection();
                    if (currentInputConnection != null) {
                        currentInputConnection.clearMetaKeyStates(Settings.UPDATE_LIVE_WORDS);
                    }
                    Engine.getInstance().onStartInput(this.f3088a, this.f3089b);
                }
            } else {
                return;
            }
        } else {
            this.f3090c.requestHideSelf(0);
        }
        this.f3090c.stopCheckAssetsInBackground(bVar);
        C0904g.m4916a().mo3409b(C0898b.ON_START_INPUT);
    }
}
