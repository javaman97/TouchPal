package com.cootek.presentation.service.feature;

import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.smartinput5.engine.Settings;

public abstract class PresentFeature {
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 0;
    public static final int PRIORITY_REALTIME = 2;
    public static final int SETTING_TYPE_BOOLEAN = 0;
    public static final int SETTING_TYPE_INTEGER = 1;
    public static final int SETTING_TYPE_STRING = 2;
    private static final String TAG = "PresentFeature";
    public String featureId;
    public int initialPromptDays;
    protected String mDependencySettingKey;
    protected int mDependencySettingType;
    protected String mDependencySettingValue;
    protected int mEndHour;
    protected int mEndSelfVersion;
    protected long mExpiredTime;
    protected PresentFeatureGroup mFeatureGroup = null;
    protected int mStartHour;
    protected int mStartSelfVersion;
    protected long mStartTime;
    public int priority;
    public float promptInterval;
    public int promptTimes;

    /* access modifiers changed from: protected */
    public abstract void dumpSpecial();

    /* access modifiers changed from: protected */
    public abstract boolean matchSpecial(String str);

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c A[SYNTHETIC, Splitter:B:51:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PresentFeature(org.xmlpull.v1.XmlPullParser r13) throws java.lang.IllegalArgumentException {
        /*
            r12 = this;
            r11 = 2
            r10 = 1
            r2 = -1
            r9 = 0
            r8 = 0
            r12.<init>()
            r12.mFeatureGroup = r8
            java.lang.String r0 = "fid"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            r12.featureId = r0
            com.cootek.presentation.service.PresentationSystem r0 = com.cootek.presentation.service.PresentationSystem.getInstance()
            com.cootek.presentation.service.history.PresentHistoryManager r0 = r0.getHistoryManager()
            java.lang.String r1 = r12.featureId
            java.lang.String r3 = com.cootek.presentation.service.history.PresentHistoryManager.LAST_PRESENT_TIMESTAMP
            long r4 = r0.getFeatureSettingLong(r1, r3)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r12.featureId
            java.lang.String r3 = com.cootek.presentation.service.history.PresentHistoryManager.LAST_PRESENT_TIMESTAMP
            long r4 = com.cootek.presentation.sdk.SystemFacade.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.setFeatureSetting(r1, r3, r4)
        L_0x0037:
            java.lang.String r1 = r12.featureId
            java.lang.String r3 = com.cootek.presentation.service.history.PresentHistoryManager.FIRST_OCCUR_TIMESTAMP
            long r4 = r0.getFeatureSettingLong(r1, r3)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = r12.featureId
            java.lang.String r3 = com.cootek.presentation.service.history.PresentHistoryManager.FIRST_OCCUR_TIMESTAMP
            long r4 = com.cootek.presentation.sdk.SystemFacade.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.setFeatureSetting(r1, r3, r4)
        L_0x0054:
            r0 = 0
            java.lang.String r1 = "initialPromptDays"
            java.lang.String r0 = r13.getAttributeValue(r0, r1)     // Catch:{ NumberFormatException -> 0x013b }
            if (r0 == 0) goto L_0x0136
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x013b }
            r12.initialPromptDays = r0     // Catch:{ NumberFormatException -> 0x013b }
        L_0x0063:
            r0 = 0
            java.lang.String r1 = "promptInterval"
            java.lang.String r0 = r13.getAttributeValue(r0, r1)     // Catch:{ NumberFormatException -> 0x013b }
            if (r0 == 0) goto L_0x013d
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x013b }
            r12.promptInterval = r0     // Catch:{ NumberFormatException -> 0x013b }
        L_0x0072:
            r0 = 0
            java.lang.String r1 = "promptTimes"
            java.lang.String r0 = r13.getAttributeValue(r0, r1)     // Catch:{ NumberFormatException -> 0x013b }
            if (r0 == 0) goto L_0x0143
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x013b }
            r12.promptTimes = r0     // Catch:{ NumberFormatException -> 0x013b }
        L_0x0081:
            java.lang.String r0 = "priority"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            if (r0 == 0) goto L_0x016a
            java.lang.String r1 = "realTime"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0148
            r12.priority = r11
        L_0x0093:
            java.lang.String r0 = "dependencySettingKey"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            r12.mDependencySettingKey = r0
            java.lang.String r0 = "dependencySettingType"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            if (r0 == 0) goto L_0x01a0
            java.lang.String r1 = "string"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x016e
            r12.mDependencySettingType = r11
        L_0x00ad:
            java.lang.String r0 = "dependencySettingValue"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            r12.mDependencySettingValue = r0
            r0 = -1
            java.lang.String r3 = "startDate"
            java.lang.String r3 = r13.getAttributeValue(r8, r3)
            if (r3 == 0) goto L_0x00d0
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "yyyy-MM-dd-HH"
            r4.<init>(r5)
            java.util.Date r3 = r4.parse(r3)     // Catch:{ ParseException -> 0x01a4 }
            if (r3 == 0) goto L_0x00d0
            long r0 = r3.getTime()     // Catch:{ ParseException -> 0x01a4 }
        L_0x00d0:
            r12.mStartTime = r0
            r0 = -1
            java.lang.String r3 = "expiredDate"
            java.lang.String r3 = r13.getAttributeValue(r8, r3)
            if (r3 == 0) goto L_0x00ed
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "yyyy-MM-dd-HH"
            r4.<init>(r5)
            java.util.Date r3 = r4.parse(r3)     // Catch:{ ParseException -> 0x01aa }
            if (r3 == 0) goto L_0x00ed
            long r0 = r3.getTime()     // Catch:{ ParseException -> 0x01aa }
        L_0x00ed:
            r12.mExpiredTime = r0
            java.lang.String r0 = "startHour"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            if (r0 == 0) goto L_0x01b4
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01b0 }
            if (r0 < 0) goto L_0x0101
            r1 = 24
            if (r0 <= r1) goto L_0x0102
        L_0x0101:
            r0 = r2
        L_0x0102:
            r12.mStartHour = r0
            java.lang.String r1 = "endHour"
            java.lang.String r1 = r13.getAttributeValue(r8, r1)
            if (r1 == 0) goto L_0x0117
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01b7 }
            if (r0 < 0) goto L_0x0116
            r1 = 24
            if (r0 <= r1) goto L_0x0117
        L_0x0116:
            r0 = r2
        L_0x0117:
            r12.mEndHour = r0
            java.lang.String r0 = "startSelfVersion"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            if (r0 == 0) goto L_0x01bd
            int r0 = java.lang.Integer.parseInt(r0)
            r12.mStartSelfVersion = r0
        L_0x0127:
            java.lang.String r0 = "endSelfVersion"
            java.lang.String r0 = r13.getAttributeValue(r8, r0)
            if (r0 == 0) goto L_0x01c1
            int r0 = java.lang.Integer.parseInt(r0)
            r12.mEndSelfVersion = r0
        L_0x0135:
            return
        L_0x0136:
            r0 = 0
            r12.initialPromptDays = r0     // Catch:{ NumberFormatException -> 0x013b }
            goto L_0x0063
        L_0x013b:
            r0 = move-exception
            throw r0
        L_0x013d:
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.promptInterval = r0     // Catch:{ NumberFormatException -> 0x013b }
            goto L_0x0072
        L_0x0143:
            r0 = 1
            r12.promptTimes = r0     // Catch:{ NumberFormatException -> 0x013b }
            goto L_0x0081
        L_0x0148:
            java.lang.String r1 = "high"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0154
            r12.priority = r10
            goto L_0x0093
        L_0x0154:
            java.lang.String r1 = "normal"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0160
            r12.priority = r9
            goto L_0x0093
        L_0x0160:
            r12.priority = r9
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "priority"
            r0.<init>(r1)
            throw r0
        L_0x016a:
            r12.priority = r9
            goto L_0x0093
        L_0x016e:
            java.lang.String r1 = "integer"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x017e
            java.lang.String r1 = "int"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0182
        L_0x017e:
            r12.mDependencySettingType = r10
            goto L_0x00ad
        L_0x0182:
            java.lang.String r1 = "boolean"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0192
            java.lang.String r1 = "bool"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0196
        L_0x0192:
            r12.mDependencySettingType = r9
            goto L_0x00ad
        L_0x0196:
            r12.mDependencySettingType = r9
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "dependencySettingType"
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            r12.mDependencySettingType = r9
            goto L_0x00ad
        L_0x01a4:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00d0
        L_0x01aa:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00ed
        L_0x01b0:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01b4:
            r0 = r2
            goto L_0x0102
        L_0x01b7:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0117
        L_0x01bd:
            r12.mStartSelfVersion = r2
            goto L_0x0127
        L_0x01c1:
            r12.mEndSelfVersion = r2
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.service.feature.PresentFeature.<init>(org.xmlpull.v1.XmlPullParser):void");
    }

    public void setFeatureGroup(PresentFeatureGroup presentFeatureGroup) {
        this.mFeatureGroup = presentFeatureGroup;
    }

    public PresentFeatureGroup getFeatureGroup() {
        return this.mFeatureGroup;
    }

    public final boolean match(String str) {
        if (!matchCommon()) {
            return false;
        }
        return matchSpecial(str);
    }

    public final boolean matchIgnoreCondition() {
        return matchCommon();
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean matchCommon() {
        /*
            r15 = this;
            r12 = -1
            r2 = 1
            r11 = -10000(0xffffffffffffd8f0, float:NaN)
            r10 = -1
            r1 = 0
            long r6 = com.cootek.presentation.sdk.SystemFacade.currentTimeMillis()
            com.cootek.presentation.service.PresentationSystem r0 = com.cootek.presentation.service.PresentationSystem.getInstance()
            com.cootek.presentation.service.history.PresentHistoryManager r4 = r0.getHistoryManager()
            java.lang.String r0 = r15.featureId
            java.lang.String r3 = com.cootek.presentation.service.history.PresentHistoryManager.IS_CLEAR
            boolean r0 = r4.getFeatureSettingBoolean(r0, r3)
            if (r0 == 0) goto L_0x001f
            r0 = r1
        L_0x001e:
            return r0
        L_0x001f:
            long r8 = r15.mStartTime
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            long r8 = r15.mStartTime
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            r0 = r1
            goto L_0x001e
        L_0x002d:
            long r8 = r15.mExpiredTime
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            long r8 = r15.mExpiredTime
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x003b
            r0 = r1
            goto L_0x001e
        L_0x003b:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            r3 = 11
            int r0 = r0.get(r3)
            int r3 = r15.mStartHour
            if (r3 == r10) goto L_0x0053
            int r3 = r15.mStartHour
            if (r3 <= r0) goto L_0x0053
            r0 = r1
            goto L_0x001e
        L_0x0053:
            int r3 = r15.mEndHour
            if (r3 == r10) goto L_0x005d
            int r3 = r15.mEndHour
            if (r3 > r0) goto L_0x005d
            r0 = r1
            goto L_0x001e
        L_0x005d:
            com.cootek.presentation.service.PresentationSystem r0 = com.cootek.presentation.service.PresentationSystem.getInstance()
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L_0x0069
            r0 = r1
            goto L_0x001e
        L_0x0069:
            com.cootek.presentation.service.PresentationSystem r3 = com.cootek.presentation.service.PresentationSystem.getInstance()
            java.lang.String r0 = r0.getPackageName()
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0)
            if (r0 != 0) goto L_0x0079
            r0 = r1
            goto L_0x001e
        L_0x0079:
            int r3 = r15.mStartSelfVersion
            if (r3 == r10) goto L_0x0085
            int r3 = r0.versionCode
            int r5 = r15.mStartSelfVersion
            if (r3 >= r5) goto L_0x0085
            r0 = r1
            goto L_0x001e
        L_0x0085:
            int r3 = r15.mEndSelfVersion
            if (r3 == r10) goto L_0x0091
            int r0 = r0.versionCode
            int r3 = r15.mEndSelfVersion
            if (r0 <= r3) goto L_0x0091
            r0 = r1
            goto L_0x001e
        L_0x0091:
            java.lang.String r0 = r15.mDependencySettingKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009e
            int r0 = r15.mDependencySettingType     // Catch:{ RemoteException -> 0x0163 }
            switch(r0) {
                case 0: goto L_0x0101;
                case 1: goto L_0x0123;
                case 2: goto L_0x0143;
                default: goto L_0x009e;
            }
        L_0x009e:
            int r0 = r15.promptTimes
            com.cootek.presentation.service.feature.PresentFeatureGroup r3 = r15.mFeatureGroup
            if (r3 == 0) goto L_0x00ae
            com.cootek.presentation.service.feature.PresentFeatureGroup r3 = r15.mFeatureGroup
            int r3 = r3.promptTimes
            if (r3 == r11) goto L_0x00ae
            com.cootek.presentation.service.feature.PresentFeatureGroup r0 = r15.mFeatureGroup
            int r0 = r0.promptTimes
        L_0x00ae:
            java.lang.String r3 = r15.featureId
            java.lang.String r5 = com.cootek.presentation.service.history.PresentHistoryManager.ALREADY_PRESNET_TIMES
            int r5 = r4.getFeatureSettingInt(r3, r5)
            if (r0 == r10) goto L_0x00ba
            if (r5 >= r0) goto L_0x0184
        L_0x00ba:
            float r3 = r15.promptInterval
            int r0 = r15.initialPromptDays
            com.cootek.presentation.service.feature.PresentFeatureGroup r8 = r15.mFeatureGroup
            if (r8 == 0) goto L_0x0187
            com.cootek.presentation.service.feature.PresentFeatureGroup r8 = r15.mFeatureGroup
            int r8 = r8.initialPromptDays
            if (r8 == r11) goto L_0x00cc
            com.cootek.presentation.service.feature.PresentFeatureGroup r0 = r15.mFeatureGroup
            int r0 = r0.initialPromptDays
        L_0x00cc:
            com.cootek.presentation.service.feature.PresentFeatureGroup r8 = r15.mFeatureGroup
            float r8 = r8.promptInterval
            r9 = -971227136(0xffffffffc61c4000, float:-10000.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0187
            com.cootek.presentation.service.feature.PresentFeatureGroup r3 = r15.mFeatureGroup
            float r3 = r3.promptInterval
            r14 = r0
            r0 = r3
            r3 = r14
        L_0x00de:
            if (r5 != 0) goto L_0x016f
            java.lang.String r0 = r15.featureId
            java.lang.String r5 = com.cootek.presentation.service.history.PresentHistoryManager.LAST_PRESENT_TIMESTAMP
            long r4 = r4.getFeatureSettingLong(r0, r5)
            com.cootek.presentation.service.PresentationSystem r0 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ RemoteException -> 0x016a }
            com.cootek.presentation.sdk.INativeAppInfoRemote r0 = r0.getNativeAppInfo()     // Catch:{ RemoteException -> 0x016a }
            long r4 = r0.getFirstInstallTimestamp()     // Catch:{ RemoteException -> 0x016a }
        L_0x00f4:
            long r8 = (long) r3
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 * r10
            long r4 = r4 + r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0184
            r0 = r2
            goto L_0x001e
        L_0x0101:
            com.cootek.presentation.service.PresentationSystem r0 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ RemoteException -> 0x0163 }
            com.cootek.presentation.sdk.INativeAppInfoRemote r0 = r0.getNativeAppInfo()     // Catch:{ RemoteException -> 0x0163 }
            java.lang.String r3 = r15.mDependencySettingKey     // Catch:{ RemoteException -> 0x0163 }
            boolean r0 = r0.getBoolSetting(r3)     // Catch:{ RemoteException -> 0x0163 }
            java.lang.String r3 = r15.mDependencySettingValue     // Catch:{ RemoteException -> 0x0163 }
            if (r3 != 0) goto L_0x0118
            if (r0 != 0) goto L_0x009e
            r0 = r1
            goto L_0x001e
        L_0x0118:
            java.lang.String r3 = r15.mDependencySettingValue     // Catch:{ RemoteException -> 0x0163 }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ RemoteException -> 0x0163 }
            if (r0 == r3) goto L_0x009e
            r0 = r1
            goto L_0x001e
        L_0x0123:
            com.cootek.presentation.service.PresentationSystem r0 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ RemoteException -> 0x0163 }
            com.cootek.presentation.sdk.INativeAppInfoRemote r0 = r0.getNativeAppInfo()     // Catch:{ RemoteException -> 0x0163 }
            java.lang.String r3 = r15.mDependencySettingKey     // Catch:{ RemoteException -> 0x0163 }
            int r0 = r0.getIntSetting(r3)     // Catch:{ RemoteException -> 0x0163 }
            java.lang.String r3 = r15.mDependencySettingValue     // Catch:{ RemoteException -> 0x0163 }
            if (r3 != 0) goto L_0x0138
            r0 = r1
            goto L_0x001e
        L_0x0138:
            java.lang.String r3 = r15.mDependencySettingValue     // Catch:{ RemoteException -> 0x0163 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RemoteException -> 0x0163 }
            if (r0 == r3) goto L_0x009e
            r0 = r1
            goto L_0x001e
        L_0x0143:
            com.cootek.presentation.service.PresentationSystem r0 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ RemoteException -> 0x0163 }
            com.cootek.presentation.sdk.INativeAppInfoRemote r0 = r0.getNativeAppInfo()     // Catch:{ RemoteException -> 0x0163 }
            java.lang.String r3 = r15.mDependencySettingKey     // Catch:{ RemoteException -> 0x0163 }
            java.lang.String r0 = r0.getStringSetting(r3)     // Catch:{ RemoteException -> 0x0163 }
            java.lang.String r3 = r15.mDependencySettingValue     // Catch:{ RemoteException -> 0x0163 }
            if (r3 != 0) goto L_0x0158
            r0 = r1
            goto L_0x001e
        L_0x0158:
            java.lang.String r3 = r15.mDependencySettingValue     // Catch:{ RemoteException -> 0x0163 }
            boolean r0 = android.text.TextUtils.equals(r0, r3)     // Catch:{ RemoteException -> 0x0163 }
            if (r0 != 0) goto L_0x009e
            r0 = r1
            goto L_0x001e
        L_0x0163:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            goto L_0x001e
        L_0x016a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00f4
        L_0x016f:
            r3 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r0 = r0 * r3
            long r8 = (long) r0
            java.lang.String r0 = r15.featureId
            java.lang.String r3 = com.cootek.presentation.service.history.PresentHistoryManager.LAST_PRESENT_TIMESTAMP
            long r4 = r4.getFeatureSettingLong(r0, r3)
            long r4 = r4 + r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0184
            r0 = r2
            goto L_0x001e
        L_0x0184:
            r0 = r1
            goto L_0x001e
        L_0x0187:
            r14 = r0
            r0 = r3
            r3 = r14
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.service.feature.PresentFeature.matchCommon():boolean");
    }

    public void dump() {
        dumpCommon();
        dumpSpecial();
    }

    private String getPriority(int i) {
        switch (i) {
            case 0:
                return Settings.INPUT_TYPE_NORMAL;
            case 1:
                return "high";
            case 2:
                return "realTime";
            default:
                return null;
        }
    }

    private void dumpCommon() {
        StringBuffer stringBuffer = new StringBuffer("===Feature===\n");
        stringBuffer.append("featureId: ");
        stringBuffer.append(this.featureId);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("initialPromptDays: ");
        stringBuffer.append(this.initialPromptDays);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("promptInterval: ");
        stringBuffer.append(this.promptInterval);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("promptTimes: ");
        stringBuffer.append(this.promptTimes);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("priority: ");
        stringBuffer.append(getPriority(this.priority));
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(TAG, stringBuffer.toString());
        }
    }
}
