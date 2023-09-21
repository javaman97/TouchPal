package com.cootek.common.utils;

import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.File;

public class DownloadImageTask extends AsyncTask<Void, Void, String> {
    private DownloadImageTaskCallback mCallback;
    private File mTargetFile;
    private String mUrl;

    public interface DownloadImageTaskCallback {
        void onFailed();

        void onSuccess(String str);
    }

    public DownloadImageTask(File file, String str, DownloadImageTaskCallback downloadImageTaskCallback) {
        this.mTargetFile = file;
        this.mUrl = str;
        this.mCallback = downloadImageTaskCallback;
    }

    /* access modifiers changed from: protected */
    public String doInBackground(Void... voidArr) {
        if (this.mTargetFile == null || TextUtils.isEmpty(this.mUrl)) {
            return null;
        }
        try {
            byte[] imageFromNetwork = NetworkLocalImageUtil.getImageFromNetwork(this.mUrl);
            NetworkLocalImageUtil.saveFile(BitmapFactory.decodeByteArray(imageFromNetwork, 0, imageFromNetwork.length), this.mTargetFile);
            if (this.mTargetFile.exists()) {
                return this.mTargetFile.getAbsolutePath();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        if (this.mCallback != null) {
            this.mCallback.onFailed();
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        if (this.mCallback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.mCallback.onFailed();
        } else {
            this.mCallback.onSuccess(str);
        }
    }
}
