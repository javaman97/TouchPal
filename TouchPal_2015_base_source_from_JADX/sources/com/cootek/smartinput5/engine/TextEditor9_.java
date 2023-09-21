package com.cootek.smartinput5.engine;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import com.cootek.smartinput5.func.C1368X;

class TextEditor9_ extends TextEditor {
    TextEditor9_() {
    }

    /* access modifiers changed from: package-private */
    public void startSelect() {
        changeSelect(true);
    }

    /* access modifiers changed from: package-private */
    public void stopSelect() {
        changeSelect(false);
        ExtractedText extractedText = getExtractedText();
        InputConnection currentInputConnection = this.mEngine.getIms().getCurrentInputConnection();
        if (extractedText != null && currentInputConnection != null && extractedText.selectionStart != extractedText.selectionEnd) {
            currentInputConnection.setSelection(extractedText.selectionEnd, extractedText.selectionEnd);
        }
    }

    /* access modifiers changed from: protected */
    public void onKeyClick(int i) {
        if (i < 3211268 || i > 3211271) {
            super.onKeyClick(i);
            return;
        }
        int i2 = (i - Engine.KEYCODE_EDIT_UP) + 19;
        if (isSelected()) {
            InputConnection currentInputConnection = this.mEngine.getIms().getCurrentInputConnection();
            if (C1368X.m6320c().mo5821G().mo7190g()) {
                hardCodeForBeforeSelect(currentInputConnection, i);
            }
            if (currentInputConnection != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                currentInputConnection.sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 59, 0, 0, 0, 0, 6));
                this.mEngine.getIms().sendDownUpKeyEvents(i2);
                currentInputConnection.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 59, 0, 0, 0, 0, 6));
                return;
            }
            return;
        }
        this.mEngine.getIms().sendDownUpKeyEvents(i2);
    }
}
