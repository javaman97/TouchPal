package com.cootek.common.utils;

import android.content.Context;
import android.content.res.Resources;

public class TResourceManager {
    private Context mContext;
    private String mPkgName = this.mContext.getPackageName();
    private Resources mResource = this.mContext.getResources();

    public TResourceManager(Context context) {
        this.mContext = context;
    }

    public int getIdByName(String str, String str2) {
        return this.mResource.getIdentifier(str, str2, this.mPkgName);
    }
}
