package com.cootek.smartinput5.engine;

import android.content.Context;
import com.cootek.smartinput5.func.C1368X;

public class Config {
    public static final int ORIENTATION_INVALID = -1;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    public static final int ORIENTATION_SQUARE = 3;
    public static final int ORIENTATION_UNDIFINED = 0;
    Context context;
    int orientation;

    public Config(Context context2) {
        this.context = context2;
        this.orientation = -1;
    }

    public Config(int i) {
        this.orientation = i;
    }

    public int getOrientation() {
        if (this.orientation != -1) {
            return this.orientation;
        }
        switch (this.context.getResources().getConfiguration().orientation) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public String getLocaleLanguage() {
        return this.context.getResources().getConfiguration().locale.getLanguage();
    }

    public boolean useInternalEditor() {
        if (C1368X.m6320c().mo5821G().mo7181b() || C1368X.m6320c().mo5821G().mo7183c() || C1368X.m6320c().mo5821G().mo7185d()) {
            return false;
        }
        return true;
    }
}
