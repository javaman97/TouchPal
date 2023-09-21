package com.iflytek.speech;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.p084b.C4000a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;

abstract class SpeechModuleAidl<I extends IInterface> implements ISpeechModule {
    private String mBindAction = null;
    private ServiceConnection mConnection = null;
    protected Context mContext = null;
    /* access modifiers changed from: private */
    public InitListener mInitListener = null;
    private HashMap<String, String> mParams = new HashMap<>();
    protected I mService;
    protected Object mSynLock = new Object();
    /* access modifiers changed from: private */
    public volatile boolean userDestroy = false;

    public SpeechModuleAidl(Context context, InitListener initListener, String str) {
        this.mContext = context;
        this.mInitListener = initListener;
        this.mBindAction = str;
        bindService();
    }

    /* access modifiers changed from: private */
    public void bindService() {
        if (isActionInstalled(this.mContext, this.mBindAction)) {
            Intent intent = getIntent();
            intent.setAction(this.mBindAction);
            intent.setPackage(UtilityConfig.COMPONENT_PKG);
            this.mConnection = new ServiceConnection() {
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    synchronized (SpeechModuleAidl.this.mSynLock) {
                        Log.d(SpeechModuleAidl.this.getTag(), "init success");
                        SpeechModuleAidl.this.mService = SpeechModuleAidl.this.getService(iBinder);
                        Log.d(SpeechModuleAidl.this.getTag(), "mService :" + SpeechModuleAidl.this.mService);
                        if (SpeechModuleAidl.this.mInitListener != null) {
                            SpeechModuleAidl.this.mInitListener.onInit(0);
                        }
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    Log.d(SpeechModuleAidl.this.getTag(), "onServiceDisconnected");
                    SpeechModuleAidl.this.mService = null;
                    if (!SpeechModuleAidl.this.userDestroy) {
                        SpeechModuleAidl.this.bindService();
                    }
                }
            };
            this.mContext.bindService(intent, this.mConnection, 1);
        } else if (this.mInitListener != null) {
            this.mInitListener.onInit(21001);
        }
    }

    /* access modifiers changed from: private */
    public I getService(IBinder iBinder) {
        try {
            String name = ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getName();
            Log.d(getTag(), "className = " + name);
            return (IInterface) Class.forName(name + "$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{iBinder});
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return null;
    }

    public boolean destory() {
        Log.d(getTag(), "destory");
        try {
            this.userDestroy = true;
            if (this.mConnection == null) {
                return true;
            }
            this.mContext.unbindService(this.mConnection);
            this.mConnection = null;
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Intent getIntent() {
        Intent intent = new Intent();
        if (!this.mParams.isEmpty()) {
            for (String next : this.mParams.keySet()) {
                intent.putExtra(next, this.mParams.get(next));
            }
            HashMap<String, String> c = new C4000a(this.mParams.get(SpeechConstant.PARAMS), (String[][]) null).mo14717c();
            if (c != null && !c.isEmpty()) {
                for (String next2 : c.keySet()) {
                    intent.putExtra(next2, c.get(next2));
                }
            }
        }
        intent.putExtra(UtilityConfig.KEY_CALLER_APPID, SpeechUtility.getUtility().getParameter("appid"));
        intent.putExtra(UtilityConfig.KEY_CALLER_NAME, UtilityConfig.getCallerInfo(this.mContext, UtilityConfig.KEY_CALLER_NAME));
        intent.putExtra(UtilityConfig.KEY_CALLER_PKG_NAME, UtilityConfig.getCallerInfo(this.mContext, UtilityConfig.KEY_CALLER_PKG_NAME));
        intent.putExtra(UtilityConfig.KEY_CALLER_VER_NAME, UtilityConfig.getCallerInfo(this.mContext, UtilityConfig.KEY_CALLER_VER_NAME));
        intent.putExtra(UtilityConfig.KEY_CALLER_VER_CODE, UtilityConfig.getCallerInfo(this.mContext, UtilityConfig.KEY_CALLER_VER_CODE));
        return intent;
    }

    public String getParameter(String str) {
        return this.mParams.get(str);
    }

    /* access modifiers changed from: protected */
    public final String getTag() {
        return getClass().toString();
    }

    public boolean isActionInstalled(Context context, String str) {
        return (context == null || TextUtils.isEmpty(str) || context.getPackageManager().resolveService(new Intent(str), 0) == null) ? false : true;
    }

    public boolean isAvailable() {
        return this.mService != null;
    }

    public int setParameter(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return ErrorCode.ERROR_INVALID_PARAM;
        }
        if (TextUtils.isEmpty(str2)) {
            this.mParams.remove(str);
            return 0;
        }
        this.mParams.put(str, str2);
        return 0;
    }
}
