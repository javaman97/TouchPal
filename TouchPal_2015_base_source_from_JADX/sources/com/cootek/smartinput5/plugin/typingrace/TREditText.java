package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public class TREditText extends EditText {
    public TREditText(Context context) {
        super(context);
    }

    public TREditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TREditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onEditorAction(int i) {
        super.onEditorAction(i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        contextMenu.removeItem(16908320);
        contextMenu.removeItem(16908321);
        contextMenu.removeItem(16908322);
    }

    public boolean onTextContextMenuItem(int i) {
        if (16908320 == i || 16908321 == i || 16908322 == i || 16908324 == i) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }
}
