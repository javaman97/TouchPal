package com.cootek.smartinput5.engine;

import android.support.p001v4.view.C0333F;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.cootek.smartinput5.func.C1368X;
import java.util.ArrayList;
import java.util.Iterator;

public class ExplicitManager {
    private static final CharacterStyle SPAN_CONFIRMED_BGCOLOR_HL = new BackgroundColorSpan(-7829249);
    private static final CharacterStyle SPAN_TEXTCOLOR = new ForegroundColorSpan(C0333F.f835s);
    private static final CharacterStyle SPAN_UNDERLINE = new UnderlineSpan();
    private static final CharacterStyle SPAN_USERINPUT_BGCOLOR_HL = new BackgroundColorSpan(-10039894);
    private static final String TAG = "ExplicitManager";
    protected static SpannableStringBuilder spannableString = new SpannableStringBuilder();
    protected Engine engine;
    private boolean mNewInput = false;
    private ExplicitInfo mOldCloudInfo;
    private String mOldText = new String();
    protected ArrayList<IExplicitListener> observers;

    public interface IExplicitListener {
        void onTextUpdated(CharSequence charSequence, ExplicitInfo explicitInfo);
    }

    public ExplicitManager(Engine engine2) {
        this.engine = engine2;
        this.observers = new ArrayList<>();
    }

    public void registerListener(IExplicitListener iExplicitListener) {
        if (iExplicitListener != null) {
            this.observers.add(iExplicitListener);
            iExplicitListener.onTextUpdated(this.engine.getExplicitText(), this.engine.getExplicitInfo());
        }
    }

    public void removeAllListener() {
        this.observers.clear();
    }

    public void removeListener(IExplicitListener iExplicitListener) {
        this.observers.remove(iExplicitListener);
    }

    public void updateText(String str, ExplicitInfo explicitInfo) {
        this.mNewInput = isNewInput(explicitInfo, str);
        if (this.mNewInput) {
            C1368X.m6320c().mo5828N().mo7992i();
        }
        Iterator<IExplicitListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onTextUpdated(str, explicitInfo);
        }
    }

    public static CharSequence generateInline(CharSequence charSequence, ExplicitInfo explicitInfo) {
        spannableString.clear();
        spannableString.append(charSequence);
        spannableString.setSpan(SPAN_UNDERLINE, 0, spannableString.length(), 33);
        int surfaceSubType = Engine.getInstance().getSurfaceSubType();
        if (surfaceSubType == 1 || surfaceSubType == 3) {
            int length = explicitInfo.length();
            for (int i = 0; i < length; i++) {
                int begin = explicitInfo.getBegin(i);
                int end = explicitInfo.getEnd(i);
                int type = explicitInfo.getType(i);
                if (type == 1) {
                    spannableString.setSpan(SPAN_TEXTCOLOR, begin, end, 33);
                    spannableString.setSpan(SPAN_USERINPUT_BGCOLOR_HL, begin, end, 33);
                } else if (type == 3 || type == 2) {
                    spannableString.setSpan(SPAN_TEXTCOLOR, begin, end, 33);
                    spannableString.setSpan(CharacterStyle.wrap(SPAN_CONFIRMED_BGCOLOR_HL), begin, end, 33);
                }
            }
        }
        return spannableString;
    }

    public boolean isNewInput() {
        return this.mNewInput;
    }

    private boolean isNewInput(ExplicitInfo explicitInfo, String str) {
        boolean isNewInput;
        if (this.mOldCloudInfo == null) {
            this.mOldCloudInfo = new ExplicitInfo();
            isNewInput = true;
        } else {
            isNewInput = isNewInput(explicitInfo, this.mOldCloudInfo, str, this.mOldText);
        }
        this.mOldCloudInfo.reset();
        this.mOldCloudInfo.clone(explicitInfo);
        this.mOldText = str;
        return isNewInput;
    }

    private boolean isNewInput(ExplicitInfo explicitInfo, ExplicitInfo explicitInfo2, String str, String str2) {
        if (explicitInfo2.length() != 0 && explicitInfo.length() == 0) {
            return true;
        }
        if (explicitInfo.getSize(3) != explicitInfo2.getSize(3)) {
            return false;
        }
        int index = explicitInfo.getIndex(1);
        int index2 = explicitInfo2.getIndex(1);
        if (index == -1 || index2 == -1) {
            return true;
        }
        if (countNonSpace(str.substring(explicitInfo.getBegin(index), explicitInfo.getEnd(index))) == countNonSpace(str2.substring(explicitInfo2.getBegin(index2), explicitInfo2.getEnd(index2)))) {
            return false;
        }
        return true;
    }

    private int countNonSpace(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != ' ') {
                i++;
            }
        }
        return i;
    }
}
