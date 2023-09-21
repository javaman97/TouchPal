package com.cootek.smartinput5.func;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.cootek.smartinput5.engine.ClipboardBackend;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.cootek.smartinput5.func.v */
/* compiled from: ClipboardManager11_ */
class C2066v implements ClipboardManager.OnPrimaryClipChangedListener {

    /* renamed from: a */
    final /* synthetic */ Context f8875a;

    /* renamed from: b */
    final /* synthetic */ ClipboardManager11_ f8876b;

    C2066v(ClipboardManager11_ clipboardManager11_, Context context) {
        this.f8876b = clipboardManager11_;
        this.f8875a = context;
    }

    public void onPrimaryClipChanged() {
        ClipData.Item itemAt;
        if (ClipboardBackend.getInstance() != null && (itemAt = this.f8876b.getManager(this.f8875a).getPrimaryClip().getItemAt(0)) != null && itemAt.getUri() == null && itemAt.getText() != null) {
            try {
                ClipboardBackend.getInstance().saveClipBoardItem(itemAt.getText());
            } catch (IOException | JSONException e) {
            }
        }
    }
}
