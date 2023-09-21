package com.cootek.smartinput5.p066ui;

import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.p066ui.control.C2853a;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.SoftKeyActionInfo */
public class SoftKeyActionInfo {
    private static final C2810ce DEFAULT_WEIGHT = new C2810ce(-1);
    private ArrayList<C2810ce> mExtraInfoList;
    private C2810ce mMainKeyInfo;
    private int mRelativeX;
    private int mRelativeY;
    private long mTimeStamp;
    private int mTotalWeight;

    public SoftKeyActionInfo(C2810ce ceVar) throws NullPointerException {
        this.mRelativeX = 0;
        this.mRelativeY = 0;
        this.mTimeStamp = 0;
        this.mTotalWeight = 0;
        if (ceVar == null) {
            throw new NullPointerException("every softkey should have a related weight");
        }
        this.mMainKeyInfo = ceVar;
        this.mTimeStamp = System.currentTimeMillis();
    }

    public SoftKeyActionInfo() {
        this.mRelativeX = 0;
        this.mRelativeY = 0;
        this.mTimeStamp = 0;
        this.mTotalWeight = 0;
        this.mMainKeyInfo = DEFAULT_WEIGHT;
        this.mTimeStamp = System.currentTimeMillis();
    }

    public void addActionInfo(C2810ce ceVar) {
        if (ceVar != null) {
            if (this.mExtraInfoList == null) {
                this.mExtraInfoList = new ArrayList<>();
            }
            if (ceVar.mo9173c()) {
                this.mMainKeyInfo = ceVar;
                this.mTotalWeight += ceVar.mo9172b();
                return;
            }
            this.mExtraInfoList.add(ceVar);
            this.mTotalWeight += ceVar.mo9172b();
        }
    }

    public void setRelativePosition(int i, int i2) {
        this.mRelativeX = i;
        this.mRelativeY = i2;
    }

    public void finishAddWeightInfo() {
        if (this.mExtraInfoList != null && this.mExtraInfoList.size() > 0) {
            this.mMainKeyInfo.mo9171a(this.mTotalWeight);
            int size = this.mExtraInfoList.size();
            for (int i = 0; i < size; i++) {
                this.mExtraInfoList.get(i).mo9171a(this.mTotalWeight);
            }
        }
    }

    public C2810ce getMainKeyInfo() {
        return this.mMainKeyInfo;
    }

    public C2810ce[] getExtraInfoList() {
        C2810ce[] ceVarArr = new C2810ce[0];
        if (this.mExtraInfoList == null) {
            return ceVarArr;
        }
        C2810ce[] ceVarArr2 = new C2810ce[this.mExtraInfoList.size()];
        if (this.mExtraInfoList == null) {
            return ceVarArr2;
        }
        return (C2810ce[]) this.mExtraInfoList.toArray(new C2810ce[this.mExtraInfoList.size()]);
    }

    public int getCorrectionSize() {
        if (this.mExtraInfoList != null) {
            return this.mExtraInfoList.size();
        }
        return 0;
    }

    public int getKeyId() {
        return this.mMainKeyInfo.mo9170a();
    }

    public int getKeyWeight() {
        return this.mMainKeyInfo.mo9172b();
    }

    public int[] getCorrectionIds() {
        int correctionSize = getCorrectionSize();
        int[] iArr = new int[correctionSize];
        for (int i = 0; i < correctionSize; i++) {
            iArr[i] = this.mExtraInfoList.get(i).mo9170a();
        }
        return iArr;
    }

    public int[] getCorrectionWeights() {
        int correctionSize = getCorrectionSize();
        int[] iArr = new int[correctionSize];
        for (int i = 0; i < correctionSize; i++) {
            iArr[i] = this.mExtraInfoList.get(i).mo9172b();
        }
        return iArr;
    }

    public int getRelativeX() {
        return this.mRelativeX;
    }

    public int getRelativeY() {
        return this.mRelativeY;
    }

    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("main key\n").append(this.mMainKeyInfo.toString()).append(C0911j.f2473c).append("relative position\n").append(this.mRelativeX).append(",").append(this.mRelativeY).append(C0911j.f2473c).append(this.mTimeStamp).append(C0911j.f2473c);
        C2810ce[] extraInfoList = getExtraInfoList();
        if (extraInfoList.length > 0) {
            sb.append("extra info\n");
            for (C2810ce ceVar : extraInfoList) {
                sb.append(ceVar.toString()).append(C0911j.f2473c);
            }
        }
        return sb.toString();
    }

    public static SoftKeyActionInfo getActionInfo(C2806cb cbVar, C2811cf cfVar, int i) {
        if (cbVar == null || cfVar == null || cfVar.mo9195q() == null) {
            return null;
        }
        SoftKeyActionInfo softKeyActionInfo = new SoftKeyActionInfo();
        softKeyActionInfo.setRelativePosition(cbVar.getRelativeX(), cbVar.getRelativeY());
        C2853a aVar = new C2853a(cbVar, cfVar);
        if (cbVar.mSoftKeyInfo != null) {
            if (supportMistyping(cbVar, i)) {
                for (C2806cb next : cfVar.mo9195q()) {
                    if (canAddCandidateWeight(next, cbVar)) {
                        updateActionInfo(aVar, softKeyActionInfo, next);
                    }
                }
            } else {
                updateActionInfo(aVar, softKeyActionInfo, cbVar);
            }
        }
        softKeyActionInfo.finishAddWeightInfo();
        return softKeyActionInfo;
    }

    private static boolean supportMistyping(C2806cb cbVar, int i) {
        return i == 0 && cbVar.mSoftKeyInfo.isMistypingTolerant();
    }

    private static boolean canAddCandidateWeight(C2806cb cbVar, C2806cb cbVar2) {
        boolean z = cbVar == cbVar2;
        if (z || cbVar.mSoftKeyInfo == null) {
            return z;
        }
        return cbVar.mSoftKeyInfo.isMistypingTolerant();
    }

    private static void updateActionInfo(C2853a aVar, SoftKeyActionInfo softKeyActionInfo, C2806cb cbVar) {
        softKeyActionInfo.addActionInfo(aVar.mo9483a(cbVar));
    }
}
