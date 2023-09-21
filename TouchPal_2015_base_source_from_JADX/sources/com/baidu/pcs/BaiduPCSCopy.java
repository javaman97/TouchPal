package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.List;

class BaiduPCSCopy extends BaiduPCSFromToAction {
    private static final String Value_Action = "copy";

    BaiduPCSCopy() {
        super(Value_Action);
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileFromToResponse copy(String str, String str2) {
        return super.execute(str, str2);
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileFromToResponse copy(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        return super.execute(list);
    }
}
