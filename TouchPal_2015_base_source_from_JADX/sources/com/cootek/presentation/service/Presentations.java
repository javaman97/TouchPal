package com.cootek.presentation.service;

import android.text.TextUtils;
import com.cootek.presentation.sdk.utils.NetworkUtil;
import com.cootek.presentation.service.feature.PresentFeature;
import com.cootek.presentation.service.history.PresentHistoryManager;
import com.cootek.presentation.service.toast.PresentToast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Presentations {
    private Comparator<PresentToast> mComparator;
    private List<PresentToast> mDynamicToasts;
    private GlobalStrategy mGlobalStrategy;
    private List<PresentToast> mToasts;

    public Presentations(GlobalStrategy globalStrategy) {
        this(globalStrategy, (List<PresentToast>) null);
    }

    public Presentations(GlobalStrategy globalStrategy, List<PresentToast> list) {
        this.mComparator = new Comparator<PresentToast>() {
            public int compare(PresentToast presentToast, PresentToast presentToast2) {
                int i = 0;
                if (presentToast.getFeature().priority != presentToast2.getFeature().priority) {
                    return presentToast2.getFeature().priority - presentToast.getFeature().priority;
                }
                PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
                int i2 = historyManager.getFeatureSettingBoolean(presentToast.getFeature().featureId, PresentHistoryManager.IS_CLICKED) ? 0 : 1;
                if (!historyManager.getFeatureSettingBoolean(presentToast2.getFeature().featureId, PresentHistoryManager.IS_CLICKED)) {
                    i = 1;
                }
                return i - i2;
            }
        };
        this.mGlobalStrategy = globalStrategy;
        this.mToasts = list;
        if (this.mToasts == null) {
            this.mToasts = new ArrayList();
        }
        if (this.mDynamicToasts == null) {
            this.mDynamicToasts = new ArrayList();
        }
    }

    public GlobalStrategy getGlobalStrategy() {
        return this.mGlobalStrategy;
    }

    public void sort() {
        if (this.mToasts != null) {
            Collections.sort(this.mToasts, this.mComparator);
        }
    }

    public void dumpInfo() {
        this.mGlobalStrategy.dump();
        for (PresentToast dump : this.mToasts) {
            dump.dump();
        }
    }

    private PresentToast findToast(Class<? extends PresentToast> cls, String str, List<PresentToast> list) {
        if (list == null || cls == null) {
            return null;
        }
        for (PresentToast next : list) {
            if (next != null && NetworkUtil.meetNetwork(next.ensureNetwork) && cls.isInstance(next) && next.canShow() && next.getFeature().match(str)) {
                if (next.isReady()) {
                    return next;
                }
                PresentationSystem.getInstance().prepareContent(next.getId());
            }
        }
        return null;
    }

    private List<PresentToast> findToastList(Class<? extends PresentToast> cls, String str, List<PresentToast> list) {
        if (list == null || cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PresentToast next : list) {
            if (NetworkUtil.meetNetwork(next.ensureNetwork) && cls.isInstance(next) && next.canShow() && next.getFeature().match(str)) {
                if (next.isReady()) {
                    arrayList.add(next);
                } else {
                    PresentationSystem.getInstance().prepareContent(next.getId());
                }
            }
        }
        return arrayList;
    }

    public PresentToast findToastByFeatureId(String str, List<PresentToast> list) {
        if (list == null || str == null) {
            return null;
        }
        for (PresentToast next : list) {
            PresentFeature feature = next.getFeature();
            if (feature != null && feature.featureId.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public List<PresentToast> findList(Class<? extends PresentToast> cls, String str) {
        List<PresentToast> findToastList = findToastList(cls, str, this.mDynamicToasts);
        findToastList.addAll(findToastList(cls, str, this.mToasts));
        return findToastList;
    }

    public PresentToast find(Class<? extends PresentToast> cls, String str) {
        PresentToast findToast = findToast(cls, str, this.mDynamicToasts);
        if (findToast == null) {
            return findToast(cls, str, this.mToasts);
        }
        return findToast;
    }

    public PresentToast findByFeatureId(String str) {
        PresentToast findToastByFeatureId = findToastByFeatureId(str, this.mDynamicToasts);
        if (findToastByFeatureId == null) {
            return findToastByFeatureId(str, this.mToasts);
        }
        return findToastByFeatureId;
    }

    public void setToasts(List<PresentToast> list) {
        this.mToasts = list;
    }

    public void addDynamicToasts(List<PresentToast> list) {
        ArrayList arrayList = new ArrayList();
        for (PresentToast next : list) {
            for (PresentToast next2 : this.mDynamicToasts) {
                if (TextUtils.equals(next.getId(), next2.getId())) {
                    arrayList.add(next2);
                }
            }
        }
        this.mDynamicToasts.removeAll(arrayList);
        this.mDynamicToasts.addAll(list);
    }

    public List<PresentToast> getToasts() {
        return this.mToasts;
    }

    public List<PresentToast> getMeetActionToasts(int i, String[] strArr) {
        if (this.mToasts == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PresentToast next : this.mToasts) {
            if (next != null) {
                if (i == 8) {
                    if (next.clearRuleSupported(2)) {
                        arrayList.add(next);
                    }
                } else if (next.getAction() != null && next.getAction().meetAction(i, strArr)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
