package com.cootek.smartinput5.engine;

import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.cootek.smartinput.utilities.C0992a;
import com.cootek.smartinput5.presentations.C2515q;

public class Editor {
    static final int CAPS_MODE_CHARACTERS = 1;
    static final int CAPS_MODE_OFF = 0;
    static final int CAPS_MODE_SENTENCES = 3;
    static final int CAPS_MODE_WORDS = 2;
    static final int POS_NORMAL = 0;
    static final int POS_SENTENCE_BEGIN = 2;
    static final int POS_WORD_BEGIN = 1;
    private static final String TAG = "Editor";
    public static final int TYPE_DATE = 16;
    public static final int TYPE_EMAIL = 8;
    public static final int TYPE_MATH = 64;
    public static final int TYPE_NUMBER = 1;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_PASSWORD = 32;
    public static final int TYPE_PHONE = 2;
    public static final int TYPE_TEXT = 0;
    public static final int TYPE_URI = 4;
    private int capsMode;
    private EditorInfo editor;
    private Engine engine;
    private int inputType;
    private TextEditor mTextEditor;

    public interface ISelectChangedListener {
        void onSelectChanged(boolean z);
    }

    public Editor(Engine engine2) {
        String str;
        this.engine = engine2;
        if (Build.VERSION.SDK_INT < 9) {
            str = "com.cootek.smartinput5.engine.TextEditor4_8";
        } else {
            str = "com.cootek.smartinput5.engine.TextEditor9_";
        }
        try {
            this.mTextEditor = (TextEditor) Class.forName(str).asSubclass(TextEditor.class).newInstance();
            this.mTextEditor.setEngine(engine2);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public InputMethodService getIms() {
        return this.engine.getIms();
    }

    public void updateInputInfo(EditorInfo editorInfo) {
        this.editor = editorInfo;
        int i = editorInfo != null ? editorInfo.inputType : 0;
        this.capsMode = convertCapsMode(i);
        this.inputType = convertInputType(i);
        C2515q.m11251b().mo8311a(editorInfo);
    }

    public int getCurrentCursor() {
        int i;
        InputConnection currentInputConnection = this.engine.getIms().getCurrentInputConnection();
        if (this.editor == null || currentInputConnection == null || this.editor.inputType == 0) {
            i = 0;
        } else {
            i = C0992a.m5151a(currentInputConnection, this.editor.inputType, true);
        }
        if (i != 0) {
            if (this.capsMode == 3) {
                return 2;
            }
            if (this.capsMode == 2) {
                return 1;
            }
        }
        return 0;
    }

    public int convertInputType(int i) {
        int i2 = i & 15;
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 16;
        }
        int i3 = i & 4080;
        if (i3 == 32 || (Build.VERSION.SDK_INT >= 11 && i3 == 208)) {
            return 8;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 128 || i3 == 144 || (Build.VERSION.SDK_INT >= 11 && i3 == 224)) {
            return 32;
        }
        return 0;
    }

    private int convertCapsMode(int i) {
        if ((i & 4096) == 4096) {
            return 1;
        }
        if ((i & 16384) == 16384) {
            return 3;
        }
        if ((i & 8192) == 8192) {
            return 2;
        }
        return 0;
    }

    public String getEditorPackageName() {
        if (this.editor != null) {
            return this.editor.packageName;
        }
        return null;
    }

    public EditorInfo getEditorInfo() {
        return this.editor;
    }

    public int getCapsMode() {
        return this.capsMode;
    }

    public int getInputType() {
        return this.inputType;
    }

    public boolean isSpecialMode() {
        return this.inputType != 0;
    }

    public boolean isPasswordOrUrl() {
        return this.inputType == 4 || this.inputType == 8 || this.inputType == 32;
    }

    public String getTextBeforeCursor(int i) {
        CharSequence a;
        String str = null;
        InputConnection currentInputConnection = this.engine.getIms().getCurrentInputConnection();
        if (!(currentInputConnection == null || (a = C0992a.m5152a(currentInputConnection, i, 0, true)) == null)) {
            str = a.toString();
        }
        if (str == null || str.length() <= i) {
            return str;
        }
        return str.substring(str.length() - i, str.length());
    }

    public String getTextAfterCursor(int i) {
        CharSequence b;
        String str = null;
        InputConnection currentInputConnection = this.engine.getIms().getCurrentInputConnection();
        if (!(currentInputConnection == null || (b = C0992a.m5154b(currentInputConnection, i, 0, true)) == null)) {
            str = b.toString();
        }
        if (str == null || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    public void needUpdateSelection(int i) {
        this.engine.onUpdateSelection(2);
    }

    public CharSequence getSelectedText() {
        return this.mTextEditor.getSelectedText();
    }

    public CharSequence getEditText() {
        return this.mTextEditor.getEditText();
    }

    public void checkSelectStatus() {
        this.mTextEditor.checkSelectStatus();
    }

    public void setEdit(boolean z) {
        this.mTextEditor.setEdit(z);
    }

    public boolean inEdit() {
        return this.mTextEditor.inEdit();
    }

    public void stopSelect() {
        this.mTextEditor.stopSelect();
    }

    public void changeSelect(boolean z) {
        this.mTextEditor.changeSelect(z);
    }

    public void registerSelectChangedListener(ISelectChangedListener iSelectChangedListener) {
        this.mTextEditor.registerSelectChangedListener(iSelectChangedListener);
    }

    public void unregisterSelectChangedListener(ISelectChangedListener iSelectChangedListener) {
        this.mTextEditor.unregisterSelectChangedListener(iSelectChangedListener);
    }

    public void removeAllListener() {
        this.mTextEditor.removeAllListener();
    }

    public void onKeyClick(int i) {
        this.mTextEditor.onKeyClick(i);
    }

    public int[] getSelection() {
        return this.mTextEditor.getSelection();
    }
}
