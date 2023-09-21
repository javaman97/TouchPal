package com.cootek.smartinput5.p066ui;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.cH */
/* compiled from: TButton */
final class C2784cH implements View.OnLongClickListener {
    C2784cH() {
    }

    public boolean onLongClick(View view) {
        if (!(view instanceof TButton)) {
            return false;
        }
        ((TButton) view).mo8777a();
        return true;
    }
}
