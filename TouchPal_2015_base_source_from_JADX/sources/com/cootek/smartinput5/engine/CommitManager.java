package com.cootek.smartinput5.engine;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p054d.C1705a;
import com.cootek.smartinput5.func.p054d.C1707c;
import com.cootek.smartinput5.func.p054d.C1711g;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CommitManager {
    private static Map<String, CommitEasterEgg> EASTER_EGG_MAP = new HashMap();
    public static final int MODE_COUNT = 6;
    public static final int MODE_CURVE = 2;
    public static final int MODE_FORWARDPREDICT = 5;
    public static final int MODE_NONE = 0;
    public static final int MODE_RESELECT = 4;
    public static final int MODE_TOUCH = 1;
    public static final int MODE_VOICE = 3;
    public static final int SOURCE_AUTOAPPEND = 115;
    public static final int SOURCE_CONSTSYMBOL = 116;
    public static final int SOURCE_EMOJICAND = 123;
    public static final int SOURCE_INPUTEMOTION = 120;
    public static final int SOURCE_INPUTSTRING = 114;
    public static final int SOURCE_PRECISEINPUT = 112;
    private static final String TAG = "CommitManager";
    public static final int TYPE_COMMITTEXT = 1;
    public static final int TYPE_KEYEVENT = 2;
    private StringBuilder commitBuilder;
    private Engine engine;
    private ICommitTextListener imsObserver;
    private boolean mCommitEmoji = false;
    private String[] mCommitTextArray;
    private ArrayList<ICommitTextListener> observers;

    private enum CommitEasterEgg {
        HAPPY_NEW_YEAR {
            private View mParentView;

            public boolean commitTextMet(String str) {
                return "happy new year".equalsIgnoreCase(str);
            }

            public boolean canShow() {
                return C1351J.m6188a().mo5653m();
            }

            public void openEasterEgg() {
                if (canShow() && Engine.isInitialized() && C1368X.m6324d()) {
                    showPopup(Engine.getInstance().getIms());
                }
            }

            public String getFullCommitText() {
                return "happy new year";
            }

            public int getMinFitTextLength() {
                return getFullCommitText().length();
            }

            private void showPopup(Context context) {
                int i;
                this.mParentView = Engine.getInstance().getWidgetManager().mo9648g();
                PopupWindow popupWindow = new PopupWindow(context);
                int i2 = context.getResources().getDisplayMetrics().widthPixels;
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i = context.getResources().getDimensionPixelSize(identifier);
                } else {
                    i = 0;
                }
                popupWindow.setWidth(i2);
                popupWindow.setHeight(context.getResources().getDisplayMetrics().heightPixels - i);
                popupWindow.setTouchable(false);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                LinearLayout linearLayout = new LinearLayout(context);
                TextView textView = new TextView(context);
                textView.setText(C1974m.m9063a(context, (int) R.string.emoji_art_happy_new_year));
                textView.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_emoji_art_anim));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                linearLayout.setPadding(0, Engine.getInstance().getWidgetManager().mo9630ad().mo9261s() / 8, 0, 0);
                linearLayout.setGravity(1);
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.addView(textView);
                popupWindow.setContentView(linearLayout);
                popupWindow.showAtLocation(this.mParentView, 49, 0, 0);
                textView.startAnimation(getArtAnimation(popupWindow));
            }

            private Animation getArtAnimation(final PopupWindow popupWindow) {
                AnimationSet animationSet = new AnimationSet(false);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) 1000);
                animationSet.addAnimation(alphaAnimation);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 300.0f);
                translateAnimation.setDuration((long) 1300);
                animationSet.addAnimation(translateAnimation);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.2f, 0.5f, 1.2f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setInterpolator(new DecelerateInterpolator(3.0f));
                scaleAnimation.setDuration((long) 1000);
                animationSet.addAnimation(scaleAnimation);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setStartOffset((long) 1000);
                alphaAnimation2.setDuration((long) Settings.SUPER_DICT_DOWNLOADED);
                animationSet.addAnimation(alphaAnimation2);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 0.5f, 1.2f, 0.5f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setStartOffset((long) 1000);
                scaleAnimation2.setDuration((long) Settings.SUPER_DICT_DOWNLOADED);
                animationSet.addAnimation(scaleAnimation2);
                animationSet.setAnimationListener(new Animation.AnimationListener() {
                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        if (popupWindow != null && popupWindow.isShowing()) {
                            new Handler().post(new Runnable() {
                                public void run() {
                                    popupWindow.dismiss();
                                }
                            });
                        }
                    }
                });
                return animationSet;
            }
        };

        public abstract boolean canShow();

        public abstract boolean commitTextMet(String str);

        public abstract String getFullCommitText();

        public abstract int getMinFitTextLength();

        public abstract void openEasterEgg();
    }

    public interface ICommitTextListener {
        void commitText(CharSequence charSequence);
    }

    static {
        EASTER_EGG_MAP.put("year", CommitEasterEgg.HAPPY_NEW_YEAR);
        EASTER_EGG_MAP.put("Year", CommitEasterEgg.HAPPY_NEW_YEAR);
        EASTER_EGG_MAP.put("New Year", CommitEasterEgg.HAPPY_NEW_YEAR);
    }

    public CommitManager(Engine engine2) {
        this.engine = engine2;
        this.commitBuilder = new StringBuilder();
        this.observers = new ArrayList<>();
    }

    public void setImsObserver(ICommitTextListener iCommitTextListener) {
        this.imsObserver = iCommitTextListener;
    }

    public void registerCommitTextListener(ICommitTextListener iCommitTextListener) {
        if (!this.observers.contains(iCommitTextListener)) {
            this.observers.add(iCommitTextListener);
        }
    }

    public void unregisterCommitTextListener(ICommitTextListener iCommitTextListener) {
        this.observers.remove(iCommitTextListener);
    }

    public void removeAllCommitTextListener() {
        this.observers.clear();
    }

    public String[] getCommitTextArray() {
        return this.mCommitTextArray;
    }

    public void updateCommit() {
        CommitEasterEgg commitEasterEgg;
        String str;
        int i;
        String str2;
        int i2;
        int commitCount = this.engine.getCommitCount();
        this.commitBuilder.setLength(0);
        this.mCommitTextArray = new String[commitCount];
        String str3 = "";
        String str4 = "";
        CommitEasterEgg commitEasterEgg2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < commitCount) {
            int commitType = this.engine.getCommitType(i3);
            switch (commitType) {
                case 1:
                    String commitText = this.engine.getCommitText(i3);
                    if (commitEasterEgg2 != null) {
                        str4 = str4 + commitText;
                    }
                    if (EASTER_EGG_MAP.containsKey(commitText)) {
                        str4 = "";
                        commitEasterEgg2 = EASTER_EGG_MAP.get(commitText);
                    }
                    String commitEvidence = this.engine.getCommitEvidence(i3);
                    int commitInternalSource = this.engine.getCommitInternalSource(i3);
                    int commitEffectiveInputType = this.engine.getCommitEffectiveInputType(i3);
                    String str5 = str3 + commitText;
                    int length = (commitEffectiveInputType != 1 || commitEvidence.length() <= 0) ? 1 : commitEvidence.length();
                    int i6 = i5 + length;
                    if (commitEffectiveInputType == 0) {
                        commitEffectiveInputType = i4;
                    }
                    this.commitBuilder.append(commitText);
                    this.mCommitTextArray[i3] = commitText;
                    C1368X.m6320c().mo5823I().mo6383a(commitText == null ? 0 : commitText.length(), length, commitEffectiveInputType);
                    if (commitInternalSource == 123) {
                        this.mCommitEmoji = true;
                    }
                    collectCommitData(commitText, commitInternalSource);
                    str2 = str4;
                    i2 = commitEffectiveInputType;
                    commitEasterEgg = commitEasterEgg2;
                    str = str5;
                    i = i6;
                    break;
                case 2:
                    if (!(this.observers == null || this.commitBuilder.length() == 0)) {
                        String sb = this.commitBuilder.toString();
                        Iterator<ICommitTextListener> it = this.observers.iterator();
                        while (it.hasNext()) {
                            it.next().commitText(sb);
                        }
                        this.imsObserver.commitText(sb);
                        this.commitBuilder.setLength(0);
                    }
                    int commitKeyEvent = this.engine.getCommitKeyEvent(i3);
                    if (i3 != commitCount - 1 && commitKeyEvent == 131080) {
                        this.engine.commitKeyEvent(Engine.KEYCODE_BACKSPACE_HANDWRITE);
                        commitEasterEgg = commitEasterEgg2;
                        str = str3;
                        i = i5;
                        int i7 = i4;
                        str2 = str4;
                        i2 = i7;
                        break;
                    } else {
                        this.engine.commitKeyEvent(commitKeyEvent);
                        commitEasterEgg = commitEasterEgg2;
                        str = str3;
                        i = i5;
                        int i8 = i4;
                        str2 = str4;
                        i2 = i8;
                        break;
                    }
                    break;
                default:
                    C1017y.m5213a(TAG, String.format("commit type: [%d]", new Object[]{Integer.valueOf(commitType)}));
                    commitEasterEgg = commitEasterEgg2;
                    str = str3;
                    i = i5;
                    int i9 = i4;
                    str2 = str4;
                    i2 = i9;
                    break;
            }
            i3++;
            i5 = i;
            str3 = str;
            commitEasterEgg2 = commitEasterEgg;
            int i10 = i2;
            str4 = str2;
            i4 = i10;
        }
        if (this.observers != null) {
            collectCommitAction(commitCount);
            if (this.commitBuilder.length() != 0) {
                C1368X c = C1368X.m6320c();
                String sb2 = this.commitBuilder.toString();
                if (c != null) {
                    c.mo5844q().mo5861a(str3);
                    if (i4 < 4) {
                        c.mo5822H().mo6199a(sb2, i4, i5);
                    }
                }
                collectCommitData(sb2);
                Iterator<ICommitTextListener> it2 = this.observers.iterator();
                while (it2.hasNext()) {
                    it2.next().commitText(sb2);
                }
                this.imsObserver.commitText(sb2);
                if (this.mCommitEmoji) {
                    C1351J.m6188a().mo5652l();
                    this.mCommitEmoji = false;
                }
            }
        }
        if (commitEasterEgg2 != null) {
            int minFitTextLength = commitEasterEgg2.getMinFitTextLength();
            int length2 = str4.length() + minFitTextLength;
            String textBeforeCursor = Engine.getInstance().getEditor().getTextBeforeCursor(length2);
            if (!TextUtils.isEmpty(textBeforeCursor) && textBeforeCursor.length() == length2 && commitEasterEgg2.commitTextMet(textBeforeCursor.substring(0, minFitTextLength))) {
                commitEasterEgg2.openEasterEgg();
            }
        }
    }

    private void collectCommitData(String str) {
        boolean z = true;
        String currentLanguageId = this.engine.getCurrentLanguageId();
        C1712h.m7886a(this.engine.getIms(), 1, currentLanguageId, this.engine.getLearnedSentence(), "", 0);
        if (C1593bR.m7162a().f5076b && C1549b.f4831b.equals(currentLanguageId) && this.engine.getSurfaceType() == 1) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                } else if (!C2829G.m12930b(str.charAt(i))) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                C1712h.m7886a(this.engine.getIms(), 2, currentLanguageId, str, "", 0);
            }
        }
    }

    private void collectCommitData(String str, int i) {
        this.engine.updateInputOp(((C1712h.f5599u + str.length()) + ":") + i);
    }

    private void collectCommitAction(int i) {
        C1705a aVar;
        ArrayList arrayList = new ArrayList();
        boolean isMultiRangeCommit = isMultiRangeCommit();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < i) {
                switch (this.engine.getCommitType(i3)) {
                    case 1:
                        InputContext effectiveContext = getEffectiveContext(i3);
                        InputContext lastWrongContext = getLastWrongContext(i3);
                        if (!(effectiveContext == null || lastWrongContext == null)) {
                            InputContext effectiveContext2 = getEffectiveContext(i3);
                            InputContext lastWrongContext2 = getLastWrongContext(i3);
                            String commitText = this.engine.getCommitText(i3);
                            String commitEvidence = this.engine.getCommitEvidence(i3);
                            ArrayList arrayList2 = new ArrayList(Arrays.asList(this.engine.getCommitHistory(i3)));
                            int i4 = 0;
                            int i5 = 0;
                            String str = "";
                            String str2 = "";
                            int i6 = 0;
                            boolean z = false;
                            if (!isMultiRangeCommit && isFullWord(this.engine.getCommitInternalSource(i3))) {
                                i4 = this.engine.getCommitDictTag(i3);
                                i5 = this.engine.getCommitCorrectionCount(i3);
                                str = this.engine.getCommitLangId(i3);
                                str2 = this.engine.getCommitDefaultItemText(i3);
                                i6 = this.engine.getCommitWrongInputTimes(i3);
                                z = this.engine.isCommitActive(i3);
                            }
                            int commitSibCandidateItemsSize = this.engine.getCommitSibCandidateItemsSize(i3);
                            SibCandidateItem[] sibCandidateItemArr = new SibCandidateItem[commitSibCandidateItemsSize];
                            for (int i7 = 0; i7 < commitSibCandidateItemsSize; i7++) {
                                sibCandidateItemArr[i7] = new SibCandidateItem();
                            }
                            arrayList.add(new C1705a(effectiveContext2, lastWrongContext2, commitText, commitEvidence, arrayList2, i4, i5, str, str2, i6, new ArrayList(Arrays.asList(this.engine.getCommitSibCandidateItems(i3, sibCandidateItemArr))), z));
                            break;
                        }
                }
                i2 = i3 + 1;
            } else {
                if (isMultiRangeCommit && canMergeCommitAction(arrayList)) {
                    C1705a mergeCommitAction = mergeCommitAction(arrayList);
                    arrayList.clear();
                    arrayList.add(mergeCommitAction);
                }
                int i8 = 0;
                while (true) {
                    int i9 = i8;
                    if (i9 < arrayList.size()) {
                        C1705a aVar2 = (C1705a) arrayList.get(i9);
                        InputContext a = aVar2.mo6598a();
                        if (a.getInputType() == 4) {
                            aVar = new C1711g(aVar2.mo6598a(), aVar2.mo6604b(), aVar2.mo6609c(), aVar2.mo6612d(), aVar2.mo6614e(), aVar2.mo6615f(), aVar2.mo6616g(), aVar2.mo6617h(), aVar2.mo6618i(), aVar2.mo6619j(), aVar2.mo6620k(), aVar2.mo6621l());
                        } else if (a.getInputType() == 5) {
                            aVar = new C1707c(aVar2.mo6598a(), aVar2.mo6604b(), aVar2.mo6609c(), aVar2.mo6612d(), aVar2.mo6614e(), aVar2.mo6615f(), aVar2.mo6616g(), aVar2.mo6617h(), aVar2.mo6618i(), aVar2.mo6619j(), aVar2.mo6620k(), aVar2.mo6621l());
                        } else {
                            aVar = aVar2;
                        }
                        if (aVar != null) {
                            this.engine.addInputAction(aVar);
                        }
                        i8 = i9 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private boolean isMultiRangeCommit() {
        int commitCount = this.engine.getCommitCount();
        int i = 0;
        for (int i2 = 0; i2 < commitCount; i2++) {
            switch (this.engine.getCommitType(i2)) {
                case 1:
                    if (!isFullWord(this.engine.getCommitInternalSource(i2))) {
                        break;
                    } else {
                        i++;
                        break;
                    }
            }
        }
        return i > 1;
    }

    private boolean canMergeCommitAction(ArrayList<C1705a> arrayList) {
        boolean z;
        if (arrayList.size() <= 1) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<C1705a> it = arrayList.iterator();
        while (it.hasNext()) {
            C1705a next = it.next();
            arrayList2.add(next.mo6598a());
            arrayList3.add(next.mo6604b());
        }
        if (!z || !canMergeTouchInputContext(arrayList2) || !canMergeTouchInputContext(arrayList3)) {
            return false;
        }
        return true;
    }

    private C1705a mergeCommitAction(ArrayList<C1705a> arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator<C1705a> it = arrayList.iterator();
        while (it.hasNext()) {
            C1705a next = it.next();
            sb.append(next.mo6609c());
            sb2.append(next.mo6612d());
            arrayList2.add(next.mo6598a());
            arrayList3.add(next.mo6604b());
        }
        return new C1705a(mergeTouchInputContext(arrayList2), mergeTouchInputContext(arrayList3), sb.toString(), sb2.toString(), arrayList.get(0).mo6614e(), 0, 0, arrayList.get(0).mo6617h(), "", 0, new ArrayList(), false);
    }

    private boolean canMergeTouchInputContext(ArrayList<InputContext> arrayList) {
        boolean z;
        boolean z2;
        if (arrayList.size() <= 1) {
            z = false;
        } else {
            z = true;
        }
        Iterator<InputContext> it = arrayList.iterator();
        while (true) {
            boolean z3 = z2;
            if (!it.hasNext()) {
                return z3;
            }
            InputContext next = it.next();
            if (next.getInputType() != 1 || !(next instanceof TouchInputContext)) {
                z2 = false;
            } else {
                z2 = z3;
            }
        }
    }

    private TouchInputContext mergeTouchInputContext(ArrayList<InputContext> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                return doMergeTouchInputContext(arrayList2);
            }
            arrayList2.add((TouchInputContext) arrayList.get(i2));
            i = i2 + 1;
        }
    }

    private TouchInputContext doMergeTouchInputContext(ArrayList<TouchInputContext> arrayList) {
        TouchInputContext touchInputContext = new TouchInputContext();
        ArrayList arrayList2 = new ArrayList();
        Iterator<TouchInputContext> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            TouchInputContext next = it.next();
            int touchInputCodesSize = next.getTouchInputCodesSize();
            for (int i2 = 0; i2 < touchInputCodesSize; i2++) {
                arrayList2.add(next.getTouchInputCodes(i2));
            }
            i += touchInputCodesSize;
        }
        touchInputContext.setData(1, i, (TouchInputCode[]) arrayList2.toArray(new TouchInputCode[arrayList2.size()]));
        return touchInputContext;
    }

    private InputContext getEffectiveContext(int i) {
        int i2 = 0;
        switch (this.engine.getCommitEffectiveInputType(i)) {
            case 1:
            case 4:
            case 5:
                TouchInputContext touchInputContext = new TouchInputContext();
                int commitEffectiveTouchInputCodesSize = this.engine.getCommitEffectiveTouchInputCodesSize(i);
                TouchInputCode[] touchInputCodeArr = new TouchInputCode[commitEffectiveTouchInputCodesSize];
                while (i2 < commitEffectiveTouchInputCodesSize) {
                    touchInputCodeArr[i2] = new TouchInputCode();
                    i2++;
                }
                return this.engine.getCommitEffectiveTouchInputContext(i, touchInputContext, touchInputCodeArr);
            case 2:
                CurveInputContext curveInputContext = new CurveInputContext();
                int commitEffectiveCurveInputPointsSize = this.engine.getCommitEffectiveCurveInputPointsSize(i);
                CurveInputPoint[] curveInputPointArr = new CurveInputPoint[commitEffectiveCurveInputPointsSize];
                while (i2 < commitEffectiveCurveInputPointsSize) {
                    curveInputPointArr[i2] = new CurveInputPoint();
                    i2++;
                }
                return this.engine.getCommitEffectiveCurveInputContext(i, curveInputContext, curveInputPointArr);
            default:
                return null;
        }
    }

    private InputContext getLastWrongContext(int i) {
        int i2 = 0;
        switch (this.engine.getCommitLastWrongInputType(i)) {
            case 1:
            case 4:
            case 5:
                TouchInputContext touchInputContext = new TouchInputContext();
                int commitLastWrongTouchInputCodesSize = this.engine.getCommitLastWrongTouchInputCodesSize(i);
                TouchInputCode[] touchInputCodeArr = new TouchInputCode[commitLastWrongTouchInputCodesSize];
                while (i2 < commitLastWrongTouchInputCodesSize) {
                    touchInputCodeArr[i2] = new TouchInputCode();
                    i2++;
                }
                return this.engine.getCommitLastWrongTouchInputContext(i, touchInputContext, touchInputCodeArr);
            case 2:
                CurveInputContext curveInputContext = new CurveInputContext();
                int commitLastWrongCurveInputPointsSize = this.engine.getCommitLastWrongCurveInputPointsSize(i);
                CurveInputPoint[] curveInputPointArr = new CurveInputPoint[commitLastWrongCurveInputPointsSize];
                while (i2 < commitLastWrongCurveInputPointsSize) {
                    curveInputPointArr[i2] = new CurveInputPoint();
                    i2++;
                }
                return this.engine.getCommitLastWrongCurveInputContext(i, curveInputContext, curveInputPointArr);
            default:
                return null;
        }
    }

    public static boolean isFullWord(int i) {
        if (i == 112 || i == 114 || i == 120 || i == 115 || i == 116) {
            return false;
        }
        return true;
    }
}
