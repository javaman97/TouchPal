package com.cootek.smartinput5.engine;

import android.text.TextUtils;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.p066ui.C2727bG;
import com.cootek.smartinput5.p066ui.C2806cb;

public class CandidateItem implements C2727bG {
    public static final int MAX_LENGTH = 35;
    public static final int PRIORITY_ABOVE = 5;
    public static final int PRIORITY_BELOW = 3;
    public static final int PRIORITY_HIGH = 6;
    public static final int PRIORITY_HIGHER = 1;
    public static final int PRIORITY_IDLE = 0;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_LOWER = -1;
    public static final int PRIORITY_NORMAL = 4;
    public static final int PRIORITY_TOP = 7;
    public static final int PRIORITY_UNDEFINED = 2;
    public static final int SOURCE_ASSOCIATION = 6;
    public static final int SOURCE_CLOUD = 5;
    public static final int SOURCE_CONSTSYMBOL = 7;
    public static final int SOURCE_CURVE = 8;
    public static final int SOURCE_DICTIONARY = 2;
    public static final int SOURCE_EMOJI = 9;
    public static final int SOURCE_OTHER = 10;
    public static final int SOURCE_RAWINPUT = 1;
    public static final int SOURCE_SHORTCUT = 4;
    public static final int SOURCE_USERWORD = 3;
    private static final String TAG = "CandidateItem";
    public static final int TAG_ACTIVE = 1;
    public static final int TAG_FOCUS = 2;
    public static final int TAG_SUBSCRIPT = 4;
    public static final int USERWORD_SOURCE_ALL = 0;
    public static final int USERWORD_SOURCE_CONTACT = 5;
    public static final int USERWORD_SOURCE_HOTWORD = 6;
    public static final int USERWORD_SOURCE_SHORTCUT = 4;
    public static final int USERWORD_SOURCE_USERWORD = 3;
    public boolean contact;
    public int errorCorrectionCount;
    public int index;
    private boolean isAd;
    public boolean isAddUserword;
    private boolean isBigram;
    private boolean isCapitalizeLast;
    private boolean isCloudPredict;
    private boolean isCorrectLast;
    public boolean isDialect;
    private boolean isUserWord;
    public String predictText;
    private int priority;
    private int source;
    public int tag;
    public String word;

    /* renamed from: x */
    public int f4012x;

    /* renamed from: y */
    public int f4013y;

    public void setData(int i, String str, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.index = i;
        this.word = str;
        this.predictText = "";
        this.tag = i2;
        this.contact = z;
        this.isAd = z3;
        this.isUserWord = z2;
        this.priority = -1;
        this.source = -1;
        this.isDialect = false;
        this.isAddUserword = false;
        this.isBigram = z4;
        this.isCloudPredict = z5;
        this.isCapitalizeLast = z6;
        this.isCorrectLast = z7;
        this.errorCorrectionCount = i3;
    }

    public String getDisplayString() {
        return this.word;
    }

    public int getTag() {
        return this.tag & 1;
    }

    public boolean isUserWord() {
        return this.isUserWord;
    }

    public boolean canAdjustPriority() {
        return (getSource() == 2 || getSource() == 3) && C1389aD.m6425F(Engine.getInstance().getCurrentLanguageId());
    }

    public boolean canDeleteWord() {
        return isUserWord() || isContact() || canDeleteDictionaryWord();
    }

    private boolean canDeleteDictionaryWord() {
        String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
        int source2 = getSource();
        if (C1389aD.m6470y(currentLanguageId) || C1549b.f4819ao.equals(currentLanguageId) || source2 == 1 || source2 == 9 || source2 == 10) {
            return false;
        }
        return true;
    }

    public void deleteUserWord(boolean z) {
        recordDeleteWord();
        Engine.getInstance().fireDeleteUserWordOperation(this.index, z);
        Engine.getInstance().processEvent();
    }

    public void deleteUserWord() {
        deleteUserWord(false);
    }

    public void autoAdjustUserWordPriority() {
        if (canAdjustPriority()) {
            Engine.getInstance().fireAdjustWordpriorityOperation(this.index, 0, 0);
            Engine.getInstance().processEvent();
        }
    }

    public void adjustUserWordRelativePriority(int i) {
        if (canAdjustPriority()) {
            Engine.getInstance().fireAdjustWordpriorityOperation(this.index, i, 2);
            Engine.getInstance().processEvent();
        }
    }

    public void resetUserWordPriority() {
        if (canAdjustPriority()) {
            Engine.getInstance().fireAdjustWordpriorityOperation(this.index, 0, 3);
            Engine.getInstance().processEvent();
        }
    }

    public boolean isContact() {
        return !C1593bR.m7162a().f5075a && this.contact;
    }

    public boolean isAd() {
        return !C1593bR.m7162a().f5075a && this.isAd;
    }

    public boolean hasLongPressIcon() {
        return isContact() || isAd() || this.isDialect;
    }

    public boolean hasAdditionalIcon() {
        return hasLongPressIcon() || this.isBigram || this.isCloudPredict || this.isCapitalizeLast || this.isCorrectLast;
    }

    public int getSource() {
        if (this.source == -1) {
            this.source = Engine.getInstance().getCandidateItemSource(this.index);
        }
        return this.source;
    }

    public int getPriority() {
        if (this.priority == -1) {
            this.priority = Engine.getInstance().getCandidateItemPriority(this.index);
        }
        return this.priority;
    }

    public String getPredictText() {
        if (TextUtils.isEmpty(this.predictText)) {
            this.predictText = Engine.getInstance().getCandidateItemPredictText(this.index);
        }
        return this.predictText;
    }

    public CandidateItem calculatePosition() {
        return calculatePosition(0);
    }

    public CandidateItem calculatePosition(int i) {
        C2806cb cbVar;
        if (!TextUtils.isEmpty(this.word)) {
            this.word = this.word.trim();
            if (i >= this.word.length()) {
                i = this.word.length() - 1;
            }
            C2806cb cbVar2 = null;
            int i2 = i;
            while (true) {
                if (i2 >= this.word.length()) {
                    cbVar = cbVar2;
                    break;
                }
                cbVar2 = Engine.getInstance().getWidgetManager().mo9646f().mo9179a(1, getSearchKeyTitle(this.word.substring(i2, i2 + 1)), true, false);
                if (cbVar2 != null) {
                    cbVar = cbVar2;
                    break;
                }
                i2++;
            }
            if (cbVar == null) {
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    cbVar = Engine.getInstance().getWidgetManager().mo9646f().mo9179a(1, getSearchKeyTitle(this.word.substring(i3, i3 + 1)), true, false);
                    if (cbVar != null) {
                        break;
                    }
                }
            }
            if (cbVar != null) {
                this.f4012x = cbVar.f12453x + (cbVar.width / 2);
                this.f4013y = (cbVar.height / 2) + cbVar.f12454y;
            }
        }
        return this;
    }

    private String getSearchKeyTitle(String str) {
        if (C1389aD.f4374j.equals(str)) {
            return null;
        }
        if (" ".equals(str)) {
            return null;
        }
        return str;
    }

    public boolean isBigram() {
        return this.isBigram;
    }

    public boolean isCloudPredict() {
        return this.isCloudPredict;
    }

    public boolean isCapitalizeLast() {
        return this.isCapitalizeLast;
    }

    public boolean isCorrectLast() {
        return this.isCorrectLast;
    }

    private void recordDeleteWord() {
        if (Engine.isInitialized()) {
            C1712h.m7886a(Engine.getInstance().getIms(), 5, Engine.getInstance().getCurrentLanguageId(), getPredictText(), "", getSource());
        }
    }
}
