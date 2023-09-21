package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.func.C1368X;
import java.util.ArrayList;
import java.util.Iterator;

public class ClokeManager {
    public static final String CLOUD_LANG_CATEGORY_PINYIN = "zh-cn";
    public static final int CLOUD_STRATEGY_DISABLED = 0;
    public static final int CLOUD_STRATEGY_LOCAL_SEARCH = 2;
    public static final int CLOUD_STRATEGY_ONLINE_SEARCH = 1;
    private static final String TAG = "ClokeManager";
    private static String mCurrentLanguageCloudInputCategory;
    private Engine engine;
    private int mCloudSearchStrategy;
    private ArrayList<IClokeListener> observers = new ArrayList<>();
    private IClokeProvider provider;

    public interface IClokeListener {
        void onClokeSearchEnd();

        void onClokeSearchStart(boolean z);

        void onClokeStateRefresh();

        void onClokeUpdated(boolean z, IClokeProvider iClokeProvider, boolean z2);
    }

    public interface IClokeProvider {
        CandidateItem get(int i);

        int getProviderType();

        boolean hasCloke();

        void reset(int i);
    }

    public ClokeManager(Engine engine2, IClokeProvider iClokeProvider) {
        this.engine = engine2;
        this.provider = iClokeProvider;
        this.mCloudSearchStrategy = -1;
    }

    public void registerClokeListener(IClokeListener iClokeListener) {
        if (!this.observers.contains(iClokeListener)) {
            this.observers.add(iClokeListener);
        }
    }

    public void unregisterClokeListener(IClokeListener iClokeListener) {
        if (this.observers.contains(iClokeListener)) {
            this.observers.remove(iClokeListener);
        }
    }

    public void removeAllClokeListener() {
        this.observers.clear();
    }

    public void removeClokeListener(IClokeListener iClokeListener) {
        this.observers.remove(iClokeListener);
    }

    public void updateCloke(int i) {
        this.provider.reset(i);
        Iterator<IClokeListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onClokeUpdated(this.provider.hasCloke(), this.provider, true);
        }
    }

    public void onClokeSearchStart(boolean z) {
        Iterator<IClokeListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onClokeSearchStart(z);
        }
    }

    public void onClokeSearchEnd() {
        Iterator<IClokeListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onClokeSearchEnd();
        }
    }

    public void onClokeStateRefresh() {
        Iterator<IClokeListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onClokeStateRefresh();
        }
    }

    public static void updateCurrentLanguageCloudInputCategory(String str) {
        if (C1368X.m6324d()) {
            mCurrentLanguageCloudInputCategory = C1368X.m6320c().mo5835h().getLanguageCategory(str, 15);
        }
    }

    public static String getCurrentLanguageCloudInputCategory() {
        return mCurrentLanguageCloudInputCategory;
    }

    public int getCloudSearchStrategy() {
        return this.mCloudSearchStrategy;
    }

    public void updateCloudSearchStrategy() {
        boolean z;
        int i = 1;
        int intSetting = Settings.getInstance().getIntSetting(Settings.CLOKE_ENABLE_MODE);
        if (Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_ENABLED_UI) && !Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            C1368X.m6320c().mo5846s().mo6311b();
        }
        boolean z2 = Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_ENABLED_UI) && Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED);
        if (intSetting == 0 || intSetting == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 2;
        }
        this.mCloudSearchStrategy = i;
    }
}
