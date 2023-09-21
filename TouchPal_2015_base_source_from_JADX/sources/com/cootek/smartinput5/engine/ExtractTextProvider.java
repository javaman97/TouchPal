package com.cootek.smartinput5.engine;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;

public class ExtractTextProvider {
    private static final String TAG = "ExtractTextProvider";
    private static ExtractTextProvider sIns = new ExtractTextProvider();
    private boolean getRealExtract = true;

    private ExtractTextProvider() {
    }

    public static ExtractTextProvider getIns() {
        return sIns;
    }

    public ExtractedText getExtractedText(InputConnection inputConnection, int i, int i2) {
        return getExtractedText(inputConnection, i, i2, false);
    }

    public ExtractedText getExtractedText(InputConnection inputConnection, int i, int i2, boolean z) {
        if (!canGetRealExtract(inputConnection, z)) {
            return null;
        }
        ExtractedTextRequest extractedTextRequest = new ExtractedTextRequest();
        extractedTextRequest.flags = i;
        ExtractedText extractedText = inputConnection.getExtractedText(extractedTextRequest, i2);
        if (extractedText != null) {
            return extractedText;
        }
        this.getRealExtract = false;
        return extractedText;
    }

    public boolean canGetRealExtract(InputConnection inputConnection, boolean z) {
        if (inputConnection == null) {
            return false;
        }
        if (z) {
            return this.getRealExtract;
        }
        return true;
    }

    public void resetState(EditorInfo editorInfo) {
        this.getRealExtract = true;
    }
}
