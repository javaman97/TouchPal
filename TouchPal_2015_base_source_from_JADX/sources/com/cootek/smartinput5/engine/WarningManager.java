package com.cootek.smartinput5.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WarningManager {
    public static final int ERROR_FATAL = 1;
    public static final int ERROR_LANGUAGE = 2;
    public static final int SUCCESS = 0;
    public static final int WARN_ADDEXISTUSERWORD = 13;
    public static final int WARN_ADDUSERWORD = 5;
    public static final int WARN_CHECKIMAGE = 12;
    public static final int WARN_CURVERESULT = 10;
    public static final int WARN_DICTUNAVAILABLE = 11;
    public static final int WARN_EXPORTUSERDICT = 16;
    public static final int WARN_EXTERNALCALL = 7;
    public static final int WARN_HANDWRITE = 8;
    public static final int WARN_HWRESOURCE = 9;
    public static final int WARN_IMPORTUSERDATA = 6;
    public static final int WARN_IMPORTUSERDICT = 15;
    public static final int WARN_LANGUAGE = 3;
    public static final int WARN_SURFACE = 4;
    public static final int WARN_UNEXPECTUPDATESEL = 14;
    private Engine mEngine;
    private ArrayList<IWarningListener>[] observers = new ArrayList[3];

    public interface IWarningListener {
        void updateWarning(int i, int i2);
    }

    public WarningManager(Engine engine) {
        this.mEngine = engine;
        Arrays.fill(this.observers, (Object) null);
    }

    public void registerListener(int i, IWarningListener iWarningListener) {
        if (this.observers[i] == null) {
            this.observers[i] = new ArrayList<>();
        }
        this.observers[i].add(iWarningListener);
    }

    public void removeAllListener() {
        Arrays.fill(this.observers, (Object) null);
    }

    public void processWarn(int i, boolean z) {
        if (i >= 0 && i < 3 && this.observers[i] != null) {
            Iterator<IWarningListener> it = this.observers[i].iterator();
            while (it.hasNext()) {
                IWarningListener next = it.next();
                if (next != null) {
                    next.updateWarning(z ? this.mEngine.getErrorCode() : 0, z ? this.mEngine.getInternalErrorCode() : 0);
                }
            }
        }
    }
}
