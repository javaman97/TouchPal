package com.cootek.smartinput5.urlnavigator;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;

public class RecommendedURLHandler {
    public void onClick(String str, String str2) {
        int i;
        boolean z = true;
        Log.d("urlnavigator", "####Hyperlink clicked: " + str2 + " -- " + str);
        EditorInfo editorInfo = Engine.getInstance().getEditor().getEditorInfo();
        int i2 = editorInfo != null ? editorInfo.inputType : 0;
        if (!((i2 & 15) == 1 && (i2 & 4080) == 16)) {
            z = false;
        }
        if (z) {
            Engine.getInstance().getEditor().onKeyClick(Engine.KEYCODE_EDIT_SELECTALL);
            ((TouchPalIME) Engine.getInstance().getIms()).commitText(str);
            if (editorInfo != null) {
                i = editorInfo.imeOptions & 1073742079;
            } else {
                i = 0;
            }
            if (i == 2) {
                Engine.getInstance().commitKeyEvent(Engine.KEYCODE_ENTER);
                return;
            }
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        Engine.getInstance().getIms().startActivity(intent);
    }
}
