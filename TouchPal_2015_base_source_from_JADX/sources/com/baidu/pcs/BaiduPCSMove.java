package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.List;

class BaiduPCSMove extends BaiduPCSFromToAction {
    private static final String Value_Action = "move";

    BaiduPCSMove() {
        super(Value_Action);
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileFromToResponse move(String str, String str2) {
        return super.execute(str, str2);
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileFromToResponse move(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        return super.execute(list);
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileFromToResponse rename(String str, String str2) {
        if (!str2.contains("/")) {
            return super.execute(str, String.valueOf(str.substring(0, str.lastIndexOf("/") + 1)) + str2);
        }
        BaiduPCSActionInfo.PCSFileFromToResponse pCSFileFromToResponse = new BaiduPCSActionInfo.PCSFileFromToResponse();
        pCSFileFromToResponse.status.message = "Illegal file name.";
        return pCSFileFromToResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileFromToResponse rename(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        new BaiduPCSActionInfo.PCSFileFromToInfo();
        for (int i = 0; i < list.size(); i++) {
            BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = list.get(i);
            if (pCSFileFromToInfo.from != null && pCSFileFromToInfo.from.length() > 0 && pCSFileFromToInfo.f2340to != null && pCSFileFromToInfo.f2340to.length() > 0) {
                String str = pCSFileFromToInfo.f2340to;
                if (str.contains("/")) {
                    BaiduPCSActionInfo.PCSFileFromToResponse pCSFileFromToResponse = new BaiduPCSActionInfo.PCSFileFromToResponse();
                    pCSFileFromToResponse.status.message = "Illegal file name.";
                    return pCSFileFromToResponse;
                }
                list.get(i).f2340to = String.valueOf(pCSFileFromToInfo.from.substring(0, pCSFileFromToInfo.from.lastIndexOf("/") + 1)) + str;
            }
        }
        return super.execute(list);
    }
}
