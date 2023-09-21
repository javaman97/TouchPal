package com.cootek.geo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.cootek.geo.AbsComponent;
import java.util.ArrayList;
import java.util.Iterator;

public class GeoLocationManager {
    private static final long CACHE_NONE = -1;
    private static final int COMP_ALL = 7;
    public static final int COMP_BAIDU = 2;
    public static final int COMP_COOTEK = 4;
    public static final int COMP_GOOGLE = 1;
    private static final int COMP_NONE = 0;
    private static final int INDEX_BAIDU = 0;
    private static final int INDEX_COOTEK = 2;
    private static final int INDEX_GOOGLE = 1;
    private final Context mContext;
    private int mEnabledCompFlag;
    /* access modifiers changed from: private */
    public AbsComponent[] mEnabledComps = new AbsComponent[3];
    private boolean mGpsEnabled;
    private InnerHandler mHandler;

    public interface ILocationChangeListener {
        void onLocationChanged(AbsGeoLocationItem absGeoLocationItem);
    }

    private static class InnerListener implements ILocationChangeListener {
        private boolean mCityRequired;
        private boolean mGpsEnabled;
        private Handler mHandler;

        public InnerListener(Handler handler, boolean z, boolean z2) {
            this.mHandler = handler;
            this.mGpsEnabled = z;
            this.mCityRequired = z2;
        }

        public void onLocationChanged(AbsGeoLocationItem absGeoLocationItem) {
            if (absGeoLocationItem != null && absGeoLocationItem.isValid()) {
                HandlerCell handlerCell = new HandlerCell((HandlerCell) null);
                handlerCell.item = absGeoLocationItem;
                handlerCell.gpsEnabled = this.mGpsEnabled;
                handlerCell.cityRequired = this.mCityRequired;
                this.mHandler.sendMessage(this.mHandler.obtainMessage(2, handlerCell));
            }
        }
    }

    private static class HandlerCell {
        boolean cityRequired;
        boolean gpsEnabled;
        AbsGeoLocationItem item;
        ILocationChangeListener listener;
        long timeoutMillis;

        private HandlerCell() {
        }

        /* synthetic */ HandlerCell(HandlerCell handlerCell) {
            this();
        }
    }

    private static class InnerHandler extends Handler {
        public static final int WHAT_REQUEST = 0;
        public static final int WHAT_RESULT = 2;
        public static final int WHAT_TIMEOUT = 1;
        private ArrayList<ILocationChangeListener> mListeners = new ArrayList<>();
        private final GeoLocationManager mManager;
        private boolean mPositioning = false;

        public InnerHandler(GeoLocationManager geoLocationManager) {
            super(Looper.getMainLooper());
            this.mManager = geoLocationManager;
        }

        public void handleMessage(Message message) {
            AbsGeoLocationItem absGeoLocationItem;
            int i = message.what;
            HandlerCell handlerCell = (HandlerCell) message.obj;
            switch (i) {
                case 0:
                    if (!this.mPositioning) {
                        this.mPositioning = true;
                        InnerListener innerListener = new InnerListener(this, handlerCell.gpsEnabled, handlerCell.cityRequired);
                        for (AbsComponent absComponent : this.mManager.mEnabledComps) {
                            if (absComponent != null) {
                                absComponent.startPosition(handlerCell.cityRequired, innerListener);
                            }
                        }
                        sendMessageDelayed(obtainMessage(1, message.obj), handlerCell.timeoutMillis);
                    }
                    if (!this.mListeners.contains(handlerCell.listener)) {
                        this.mListeners.add(handlerCell.listener);
                        return;
                    }
                    return;
                case 1:
                    for (AbsComponent absComponent2 : this.mManager.mEnabledComps) {
                        if (absComponent2 != null) {
                            absComponent2.stopPosition();
                        }
                    }
                    return;
                case 2:
                    if (this.mPositioning) {
                        this.mPositioning = false;
                        removeMessages(2);
                        removeMessages(1);
                        if (handlerCell.item == null || (handlerCell.item instanceof AbsComponent.EmptyTimeoutGeoLocationItem)) {
                            absGeoLocationItem = null;
                        } else {
                            absGeoLocationItem = handlerCell.item;
                        }
                        Iterator<ILocationChangeListener> it = this.mListeners.iterator();
                        while (it.hasNext()) {
                            it.next().onLocationChanged(absGeoLocationItem);
                        }
                        this.mListeners.clear();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private static class CachedItem {
        boolean cityRequired;
        int compType;
        long deadline;
        boolean gpsEnabled;
        AbsGeoLocationItem item;

        private CachedItem() {
        }

        /* access modifiers changed from: package-private */
        public boolean isValid(int i, boolean z, boolean z2) {
            if (System.currentTimeMillis() > this.deadline || (this.compType & i) == 0) {
                return false;
            }
            if (!this.gpsEnabled && z) {
                return false;
            }
            if (this.cityRequired || !z2) {
                return true;
            }
            return false;
        }
    }

    public GeoLocationManager(Context context) {
        this.mContext = context;
        this.mEnabledCompFlag = 0;
        this.mGpsEnabled = false;
        this.mHandler = new InnerHandler(this);
    }

    public boolean isLocationServiceAvailable() {
        boolean z;
        if (this.mContext.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1) {
            return false;
        }
        boolean z2 = false;
        for (AbsComponent absComponent : this.mEnabledComps) {
            if (absComponent == null || !absComponent.isComponentAvailable()) {
                z = false;
            } else {
                z = true;
            }
            z2 |= z;
        }
        return z2;
    }

    public boolean enableComponent(int i, String... strArr) {
        boolean z = true;
        if ((this.mEnabledCompFlag & i) != 0) {
            return false;
        }
        switch (i) {
            case 1:
                this.mEnabledCompFlag |= 1;
                GoogleComponent googleComponent = new GoogleComponent(this.mContext);
                googleComponent.setGpsEnable(this.mGpsEnabled);
                this.mEnabledComps[1] = googleComponent;
                break;
            case 2:
                if (strArr != null && strArr.length == 1) {
                    BaiduComponent baiduComponent = new BaiduComponent(this.mContext, strArr[0]);
                    baiduComponent.setGpsEnable(this.mGpsEnabled);
                    this.mEnabledComps[0] = baiduComponent;
                    this.mEnabledCompFlag |= 2;
                    break;
                } else {
                    z = false;
                    break;
                }
                break;
            case 4:
                if (strArr != null && strArr.length == 2) {
                    CooTekComponent cooTekComponent = new CooTekComponent(this.mContext, strArr[0], strArr[1]);
                    cooTekComponent.setGpsEnable(this.mGpsEnabled);
                    this.mEnabledComps[2] = cooTekComponent;
                    this.mEnabledCompFlag |= 4;
                    break;
                }
        }
        z = false;
        return z;
    }

    public boolean disableComponent(int i) {
        if (i <= 0 || i > 7) {
            return false;
        }
        int i2 = this.mEnabledCompFlag & i;
        if ((i2 & 1) != 0) {
            this.mEnabledComps[1].invalidate();
            this.mEnabledComps[1] = null;
        }
        if ((i2 & 2) != 0) {
            this.mEnabledComps[0].invalidate();
            this.mEnabledComps[1] = null;
        }
        if ((i2 & 4) != 0) {
            this.mEnabledComps[2].invalidate();
            this.mEnabledComps[2] = null;
        }
        this.mEnabledCompFlag = (7 - i2) & this.mEnabledCompFlag;
        return true;
    }

    public boolean setGpsEnable(boolean z) {
        if (z && this.mContext.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1) {
            return false;
        }
        this.mGpsEnabled = z;
        for (AbsComponent absComponent : this.mEnabledComps) {
            if (absComponent != null) {
                absComponent.setGpsEnable(this.mGpsEnabled);
            }
        }
        return true;
    }

    public void setCacheEnable(boolean z, long j) {
        for (AbsComponent absComponent : this.mEnabledComps) {
            if (absComponent != null) {
                absComponent.setCacheEnable(z, j);
            }
        }
    }

    public boolean requestLatestLocation(boolean z, long j, ILocationChangeListener iLocationChangeListener) {
        if (this.mEnabledCompFlag == 0) {
            return false;
        }
        if (!z && this.mEnabledCompFlag == 4) {
            return false;
        }
        HandlerCell handlerCell = new HandlerCell((HandlerCell) null);
        handlerCell.listener = iLocationChangeListener;
        handlerCell.item = null;
        handlerCell.gpsEnabled = this.mGpsEnabled;
        handlerCell.cityRequired = z;
        handlerCell.timeoutMillis = j;
        this.mHandler.sendMessage(this.mHandler.obtainMessage(0, handlerCell));
        return true;
    }
}
