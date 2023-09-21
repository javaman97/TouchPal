package com.cootek.smartinput5.engine;

import android.text.TextUtils;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import com.cootek.smartinput5.engine.Editor;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C2117w;
import com.cootek.smartinput5.func.ClipboardManager;
import java.util.ArrayList;
import java.util.Iterator;

abstract class TextEditor {
    private static final int PAGELINENUM = 5;
    protected static final String TAG = "TextEditor";
    private boolean inEdit;
    private ClipboardManager mClipboardManager;
    protected Engine mEngine;
    private ArrayList<Editor.ISelectChangedListener> mSelectChangedListener = new ArrayList<>();
    private boolean mSelected = false;
    private int[] mSelection = new int[2];

    /* access modifiers changed from: package-private */
    public abstract void startSelect();

    /* access modifiers changed from: package-private */
    public abstract void stopSelect();

    TextEditor() {
    }

    /* access modifiers changed from: package-private */
    public final void setEngine(Engine engine) {
        this.mEngine = engine;
        this.mClipboardManager = C2117w.m9655a();
        this.mClipboardManager.setUpMultiClipboardEnv(this.mEngine.getIms());
    }

    /* access modifiers changed from: package-private */
    public CharSequence getSelectedText() {
        ExtractedText extractedText = getExtractedText();
        if (extractedText == null || extractedText.text == null) {
            return "";
        }
        int min = Math.min(extractedText.selectionStart, extractedText.selectionEnd);
        int max = Math.max(extractedText.selectionStart, extractedText.selectionEnd);
        if (min < 0 || min >= max || max > extractedText.text.length()) {
            return "";
        }
        return extractedText.text.subSequence(min, max);
    }

    /* access modifiers changed from: package-private */
    public int[] getSelection() {
        ExtractedText extractedText = getExtractedText();
        if (extractedText == null) {
            this.mSelection[0] = -1;
            this.mSelection[1] = -1;
        } else {
            this.mSelection[0] = extractedText.startOffset + extractedText.selectionStart;
            this.mSelection[1] = extractedText.selectionEnd + extractedText.startOffset;
        }
        return this.mSelection;
    }

    /* access modifiers changed from: protected */
    public final ExtractedText getExtractedText() {
        InputConnection currentInputConnection = this.mEngine.getIms().getCurrentInputConnection();
        if (currentInputConnection == null) {
            return null;
        }
        return ExtractTextProvider.getIns().getExtractedText(currentInputConnection, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public CharSequence getEditText() {
        ExtractedText extractedText = getExtractedText();
        if (extractedText == null) {
            return null;
        }
        return extractedText.text;
    }

    /* access modifiers changed from: package-private */
    public void checkSelectStatus() {
        ExtractedText extractedText = getExtractedText();
        if (extractedText != null) {
            if (extractedText.selectionStart != extractedText.selectionEnd) {
                startSelect();
            } else {
                stopSelect();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isSelected() {
        return this.mSelected;
    }

    /* access modifiers changed from: package-private */
    public final void setEdit(boolean z) {
        this.inEdit = z;
    }

    /* access modifiers changed from: package-private */
    public final boolean inEdit() {
        return this.inEdit;
    }

    /* access modifiers changed from: package-private */
    public final void changeSelect(boolean z) {
        if (z != this.mSelected) {
            this.mSelected = z;
            onSelectChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r0 >= 5) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        onKeyClick(com.cootek.smartinput5.engine.Engine.KEYCODE_EDIT_DOWN);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (r0 >= 5) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        onKeyClick(com.cootek.smartinput5.engine.Engine.KEYCODE_EDIT_UP);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onKeyClick(int r7) {
        /*
            r6 = this;
            r5 = 10
            r3 = 5
            r2 = 3211268(0x310004, float:4.499945E-39)
            r4 = 1
            r0 = 0
            r6.inEdit = r0
            if (r7 < r2) goto L_0x0021
            r1 = 3211271(0x310007, float:4.499949E-39)
            if (r7 > r1) goto L_0x0021
            r6.inEdit = r4
            int r0 = r7 - r2
            int r0 = r0 + 19
            com.cootek.smartinput5.engine.Engine r1 = r6.mEngine
            android.inputmethodservice.InputMethodService r1 = r1.getIms()
            r1.sendDownUpKeyEvents(r0)
        L_0x0020:
            return
        L_0x0021:
            com.cootek.smartinput5.engine.Engine r1 = r6.mEngine
            android.inputmethodservice.InputMethodService r1 = r1.getIms()
            android.view.inputmethod.InputConnection r1 = r1.getCurrentInputConnection()
            if (r1 == 0) goto L_0x0020
            switch(r7) {
                case 3211265: goto L_0x0031;
                case 3211266: goto L_0x0054;
                case 3211267: goto L_0x005e;
                case 3211268: goto L_0x0030;
                case 3211269: goto L_0x0030;
                case 3211270: goto L_0x0030;
                case 3211271: goto L_0x0030;
                case 3211272: goto L_0x0081;
                case 3211273: goto L_0x008c;
                case 3211274: goto L_0x0094;
                case 3211275: goto L_0x00c4;
                case 3211276: goto L_0x00fe;
                case 3211277: goto L_0x0113;
                case 3211278: goto L_0x013c;
                case 3211279: goto L_0x0030;
                case 3211280: goto L_0x010e;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0020
        L_0x0031:
            com.cootek.smartinput5.engine.ExtractTextProvider r2 = com.cootek.smartinput5.engine.ExtractTextProvider.getIns()
            android.view.inputmethod.ExtractedText r0 = r2.getExtractedText(r1, r0, r0)
            boolean r0 = r6.canCopyOrCut(r0)
            if (r0 == 0) goto L_0x0020
            r0 = 16908321(0x1020021, float:2.3877321E-38)
            r6.performContextMenuAction(r0)
            r6.stopSelect()
            com.cootek.smartinput5.func.ClipboardManager r0 = r6.mClipboardManager
            com.cootek.smartinput5.engine.Engine r1 = r6.mEngine
            android.inputmethodservice.InputMethodService r1 = r1.getIms()
            r0.addClipboardItem(r1)
            goto L_0x0020
        L_0x0054:
            r0 = 16908322(0x1020022, float:2.3877324E-38)
            r6.performContextMenuAction(r0)
            r6.stopSelect()
            goto L_0x0020
        L_0x005e:
            com.cootek.smartinput5.engine.ExtractTextProvider r2 = com.cootek.smartinput5.engine.ExtractTextProvider.getIns()
            android.view.inputmethod.ExtractedText r0 = r2.getExtractedText(r1, r0, r0)
            boolean r0 = r6.canCopyOrCut(r0)
            if (r0 == 0) goto L_0x0020
            r0 = 16908320(0x1020020, float:2.387732E-38)
            r6.performContextMenuAction(r0)
            r6.stopSelect()
            com.cootek.smartinput5.func.ClipboardManager r0 = r6.mClipboardManager
            com.cootek.smartinput5.engine.Engine r1 = r6.mEngine
            android.inputmethodservice.InputMethodService r1 = r1.getIms()
            r0.addClipboardItem(r1)
            goto L_0x0020
        L_0x0081:
            if (r0 >= r3) goto L_0x0020
            r1 = 3211269(0x310005, float:4.499946E-39)
            r6.onKeyClick(r1)
            int r0 = r0 + 1
            goto L_0x0081
        L_0x008c:
            if (r0 >= r3) goto L_0x0020
            r6.onKeyClick(r2)
            int r0 = r0 + 1
            goto L_0x008c
        L_0x0094:
            android.view.inputmethod.ExtractedText r1 = r6.getExtractedText()
            if (r1 == 0) goto L_0x0020
            java.lang.CharSequence r2 = r1.text
            if (r2 == 0) goto L_0x0020
            int r2 = r1.selectionEnd
            if (r2 <= 0) goto L_0x0020
            java.lang.CharSequence r2 = r1.text
            int r3 = r1.selectionStart
            int r4 = r1.selectionStart
            int r1 = r1.selectionEnd
            int r1 = java.lang.Math.min(r4, r1)
            if (r1 <= r0) goto L_0x00bc
            int r1 = r1 + -1
        L_0x00b2:
            if (r1 < 0) goto L_0x00bc
            char r4 = r2.charAt(r1)
            if (r4 != r5) goto L_0x00c1
            int r0 = r1 + 1
        L_0x00bc:
            r6.setSelection(r3, r0)
            goto L_0x0020
        L_0x00c1:
            int r1 = r1 + -1
            goto L_0x00b2
        L_0x00c4:
            android.view.inputmethod.ExtractedText r0 = r6.getExtractedText()
            if (r0 == 0) goto L_0x0020
            java.lang.CharSequence r1 = r0.text
            if (r1 == 0) goto L_0x0020
            int r1 = r0.selectionEnd
            java.lang.CharSequence r2 = r0.text
            int r2 = r2.length()
            if (r1 > r2) goto L_0x0020
            java.lang.CharSequence r2 = r0.text
            int r3 = r0.selectionStart
            int r1 = r0.selectionStart
            int r0 = r0.selectionEnd
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r2.length()
            if (r0 >= r1) goto L_0x015b
        L_0x00ea:
            int r4 = r2.length()
            if (r0 >= r4) goto L_0x015b
            char r4 = r2.charAt(r0)
            if (r4 != r5) goto L_0x00fb
        L_0x00f6:
            r6.setSelection(r3, r0)
            goto L_0x0020
        L_0x00fb:
            int r0 = r0 + 1
            goto L_0x00ea
        L_0x00fe:
            boolean r0 = r6.isSelected()
            if (r0 == 0) goto L_0x0109
            r6.stopSelect()
            goto L_0x0020
        L_0x0109:
            r6.startSelect()
            goto L_0x0020
        L_0x010e:
            r6.stopSelect()
            goto L_0x0020
        L_0x0113:
            com.cootek.smartinput5.func.X r2 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.a r2 = r2.mo5844q()
            r3 = 2131624530(0x7f0e0252, float:1.8876242E38)
            r2.mo5859a((int) r3)
            android.view.inputmethod.ExtractedText r2 = r6.getExtractedText()
            if (r2 == 0) goto L_0x0132
            int r3 = r2.selectionStart
            int r2 = r2.selectionEnd
            if (r3 != r2) goto L_0x0132
            r1.deleteSurroundingText(r0, r4)
            goto L_0x0020
        L_0x0132:
            com.cootek.smartinput5.engine.Engine r0 = r6.mEngine
            r1 = 131080(0x20008, float:1.83682E-40)
            r0.commitKeyEvent(r1)
            goto L_0x0020
        L_0x013c:
            com.cootek.smartinput5.func.X r0 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.q r0 = r0.mo5821G()
            boolean r0 = r0.mo7190g()
            if (r0 == 0) goto L_0x0150
            r6.stopSelect()
            r6.hardCodeForBeforeSelect(r1)
        L_0x0150:
            r0 = 16908319(0x102001f, float:2.3877316E-38)
            r6.performContextMenuAction(r0)
            r6.changeSelect(r4)
            goto L_0x0020
        L_0x015b:
            r0 = r1
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.engine.TextEditor.onKeyClick(int):void");
    }

    /* access modifiers changed from: package-private */
    public final void registerSelectChangedListener(Editor.ISelectChangedListener iSelectChangedListener) {
        if (iSelectChangedListener != null) {
            this.mSelectChangedListener.add(iSelectChangedListener);
            iSelectChangedListener.onSelectChanged(isSelected());
        }
    }

    /* access modifiers changed from: package-private */
    public final void unregisterSelectChangedListener(Editor.ISelectChangedListener iSelectChangedListener) {
        if (iSelectChangedListener != null) {
            this.mSelectChangedListener.remove(iSelectChangedListener);
        }
    }

    /* access modifiers changed from: package-private */
    public final void removeAllListener() {
        this.mSelectChangedListener.clear();
    }

    private void onSelectChanged() {
        Iterator<Editor.ISelectChangedListener> it = this.mSelectChangedListener.iterator();
        while (it.hasNext()) {
            it.next().onSelectChanged(isSelected());
        }
    }

    /* access modifiers changed from: protected */
    public void performContextMenuAction(int i) {
        try {
            this.inEdit = true;
            this.mEngine.getIms().getCurrentInputConnection().performContextMenuAction(i);
        } catch (Exception e) {
            e.printStackTrace();
            this.inEdit = false;
        }
    }

    private void setSelection(int i, int i2) {
        InputConnection currentInputConnection = this.mEngine.getIms().getCurrentInputConnection();
        if (currentInputConnection != null) {
            if (isSelected()) {
                if (C1368X.m6320c().mo5821G().mo7190g()) {
                    hardCodeForBeforeSelect(currentInputConnection);
                }
                currentInputConnection.setSelection(i, i2);
                return;
            }
            currentInputConnection.setSelection(i2, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void hardCodeForBeforeSelect(InputConnection inputConnection) {
        hardCodeForBeforeSelect(inputConnection, 0);
    }

    /* access modifiers changed from: protected */
    public void hardCodeForBeforeSelect(InputConnection inputConnection, int i) {
        if (inputConnection != null) {
            ExtractedText extractedText = getExtractedText();
            if (extractedText != null && !TextUtils.isEmpty(extractedText.text) && extractedText.selectionStart == extractedText.selectionEnd) {
                CharSequence textBeforeCursor = inputConnection.getTextBeforeCursor(1, 0);
                if (TextUtils.isEmpty(textBeforeCursor) || Character.isDigit(textBeforeCursor.charAt(0)) || textBeforeCursor.charAt(0) == 10) {
                    CharSequence textAfterCursor = inputConnection.getTextAfterCursor(1, 0);
                    if (!TextUtils.isEmpty(textAfterCursor) && !Character.isDigit(textAfterCursor.charAt(0)) && textAfterCursor.charAt(0) != 10) {
                        inputConnection.deleteSurroundingText(0, 1);
                        this.mEngine.getIms().sendKeyChar(textAfterCursor.charAt(0));
                        if (i >= 3211268 && i <= 3211271) {
                            this.mEngine.getIms().sendDownUpKeyEvents(21);
                        }
                    }
                } else {
                    inputConnection.deleteSurroundingText(1, 0);
                    this.mEngine.getIms().sendKeyChar(textBeforeCursor.charAt(0));
                }
            }
            startSelect();
        }
    }

    private boolean canCopyOrCut(ExtractedText extractedText) {
        if (extractedText == null || extractedText.selectionStart == extractedText.selectionEnd || Engine.getInstance().getEditor().getInputType() == 32) {
            return false;
        }
        return true;
    }
}
