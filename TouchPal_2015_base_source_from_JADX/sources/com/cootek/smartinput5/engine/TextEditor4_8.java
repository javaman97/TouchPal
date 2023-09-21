package com.cootek.smartinput5.engine;

class TextEditor4_8 extends TextEditor {
    TextEditor4_8() {
    }

    /* access modifiers changed from: package-private */
    public void startSelect() {
        changeSelect(true);
        performContextMenuAction(16908328);
    }

    /* access modifiers changed from: package-private */
    public void stopSelect() {
        changeSelect(false);
        performContextMenuAction(16908329);
    }
}
