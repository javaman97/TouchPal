package com.appsflyer.cache;

import android.content.Context;
import android.util.Log;
import com.appsflyer.AppsFlyerLib;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CacheManager {
    public static final String AF_CACHE_DIR = "AFRequestCache";
    public static final int CACHE_MAX_SIZE = 20;
    private static CacheManager ourInstance = new CacheManager();

    public static CacheManager getInstance() {
        return ourInstance;
    }

    private CacheManager() {
    }

    private File getCacheDir(Context context) {
        return new File(context.getFilesDir(), AF_CACHE_DIR);
    }

    public void init(Context context) {
        try {
            if (!getCacheDir(context).exists()) {
                getCacheDir(context).mkdir();
            }
        } catch (Exception e) {
            Log.i(AppsFlyerLib.LOG_TAG, "Could not create cache directory");
        }
    }

    public void cacheRequest(RequestCacheData requestCacheData, Context context) {
        try {
            File cacheDir = getCacheDir(context);
            if (!cacheDir.exists()) {
                cacheDir.mkdir();
            } else if (cacheDir.listFiles().length > 20) {
                Log.i(AppsFlyerLib.LOG_TAG, "reached cache limit, not caching request");
            } else {
                Log.i(AppsFlyerLib.LOG_TAG, "caching request...");
                File file = new File(getCacheDir(context), Long.toString(System.currentTimeMillis()));
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true));
                outputStreamWriter.write("version=");
                outputStreamWriter.write(requestCacheData.getVersion());
                outputStreamWriter.write(10);
                outputStreamWriter.write("url=");
                outputStreamWriter.write(requestCacheData.getRequestURL());
                outputStreamWriter.write(10);
                outputStreamWriter.write("data=");
                outputStreamWriter.write(requestCacheData.getPostData());
                outputStreamWriter.write(10);
                outputStreamWriter.flush();
                outputStreamWriter.close();
            }
        } catch (Exception e) {
            Log.i(AppsFlyerLib.LOG_TAG, "Could not cache request");
        }
    }

    public List<RequestCacheData> getCachedRequests(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File cacheDir = getCacheDir(context);
            if (!cacheDir.exists()) {
                cacheDir.mkdir();
            } else {
                for (File file : cacheDir.listFiles()) {
                    Log.i(AppsFlyerLib.LOG_TAG, "Found cached request" + file.getName());
                    arrayList.add(loadRequestData(file));
                }
            }
        } catch (Exception e) {
            Log.i(AppsFlyerLib.LOG_TAG, "Could not cache request");
        }
        return arrayList;
    }

    private RequestCacheData loadRequestData(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            char[] cArr = new char[((int) file.length())];
            fileReader.read(cArr);
            RequestCacheData requestCacheData = new RequestCacheData(cArr);
            requestCacheData.setCacheKey(file.getName());
            fileReader.close();
            return requestCacheData;
        } catch (Exception e) {
            return null;
        }
    }

    public void deleteRequest(String str, Context context) {
        File file = new File(getCacheDir(context), str);
        Log.i(AppsFlyerLib.LOG_TAG, "Deleting " + str + " from cache");
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                Log.i(AppsFlyerLib.LOG_TAG, "Could not delete " + str + " from cache", e);
            }
        }
    }
}
