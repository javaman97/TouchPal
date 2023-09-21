package com.cootek.presentation.service.toast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.smartinput5.net.cmd.C2268c;
import java.util.List;

public class GuidePointNode {
    public static final int DISMISS_RULE_ALL = 2;
    public static final int DISMISS_RULE_ANY = 1;
    public static final int DISMISS_RULE_NEVER = 5;
    public static final int DISMISS_RULE_SELF = 3;
    public static final int DISMISS_RULE_SHOW = 4;
    List<GuidePointNode> children = null;
    int dismissStrategy;
    String extensionId;
    GuidePointNode parent;
    String pointHolderShowConditions;
    String pointId;
    String pointSelfShowConditions;
    int pointType;

    public static int getPointType(String str) {
        if (TextUtils.equals(str, C2268c.f9863b)) {
            return 1;
        }
        if (TextUtils.equals(str, "dot")) {
            return 2;
        }
        if (TextUtils.equals(str, "num")) {
            return 3;
        }
        if (TextUtils.equals(str, "hide")) {
            return -1;
        }
        return 0;
    }

    public boolean canSelfShow() {
        try {
            return PresentationSystem.getInstance().getNativeAppInfo().canPointSelfShow(this.pointId, this.pointSelfShowConditions);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canHolderShow() {
        boolean z;
        try {
            z = PresentationSystem.getInstance().getNativeAppInfo().canPointHolderShow(this.pointId, this.pointHolderShowConditions, this.extensionId);
        } catch (RemoteException e) {
            e.printStackTrace();
            z = false;
        }
        if (!z || this.pointType == -1) {
            return false;
        }
        return true;
    }

    public boolean isLeaf() {
        return this.children == null;
    }
}
