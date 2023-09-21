package com.cootek.presentation.service.config;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.sdk.utils.DownloadUtil;
import com.cootek.presentation.sdk.utils.NetworkUtil;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.iflytek.cloud.ErrorCode;
import com.weibo.net.C4054q;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SingleFileDownloader {
    public static final int CANCEL = -2;
    public static final int FAILED = -1;
    public static final int MAX_PROGRESS = 100;
    /* access modifiers changed from: private */
    public static int RETRY_COUNT = 3;
    public static final int START = 0;
    public static final int SUCCESS = 200;
    /* access modifiers changed from: private */
    public static String TAG = "SingleFileDownloader";
    private BackgroundDownloadTask mDownloadTask;
    private File mFile;
    /* access modifiers changed from: private */
    public IDownloadListener mListener;
    private final boolean mRequestToken;
    /* access modifiers changed from: private */
    public int mRetried;
    /* access modifiers changed from: private */
    public final boolean mStartOnWifi = NetworkUtil.getNetworkStatus().wifiConnected;
    private String mUrl;

    public interface IDownloadListener {
        void onFailed();

        void onFinished(String str);

        void onRestart();

        void onStart();
    }

    public SingleFileDownloader(String str, File file, IDownloadListener iDownloadListener, boolean z) {
        this.mUrl = str;
        this.mFile = file;
        this.mListener = iDownloadListener;
        this.mRetried = 0;
        this.mRequestToken = z;
    }

    public String getKey() {
        return this.mUrl;
    }

    public void download(boolean z) {
        download(this.mFile, this.mUrl, z);
    }

    private void download(File file, String str, boolean z) {
        if (!z) {
            this.mListener.onStart();
        } else {
            this.mListener.onRestart();
        }
        this.mDownloadTask = new BackgroundDownloadTask(this, (BackgroundDownloadTask) null);
        this.mDownloadTask.execute(new Object[]{file, str});
    }

    /* access modifiers changed from: private */
    public HttpURLConnection getConnection(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(ErrorCode.MSP_ERROR_MMP_BASE);
            httpURLConnection.setRequestMethod(C4054q.f16510f);
            httpURLConnection.setDoInput(true);
            if (!this.mRequestToken) {
                return httpURLConnection;
            }
            try {
                PresentationSystem.getInstance().getNativeAppInfo().getAuthToken();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (TextUtils.isEmpty((CharSequence) null)) {
                PresentationSystem.getInstance().needAuthToken();
                return null;
            }
            httpURLConnection.addRequestProperty(C2261Q.f9792am, String.format("auth_token=%s", new Object[]{null}));
            return httpURLConnection;
        } catch (MalformedURLException e2) {
            return null;
        } catch (IOException e3) {
            return null;
        }
    }

    private class BackgroundDownloadTask extends AsyncTask<Object, Integer, Object> {
        private BufferedInputStream mBIS;
        private InputStream mIS;
        private int mLength;
        private RandomAccessFile mRAF;
        private File mTargetFile;
        private File mTempFile;
        private HttpURLConnection ucon;

        private BackgroundDownloadTask() {
            this.mTargetFile = null;
            this.mTempFile = null;
            this.mRAF = null;
            this.mIS = null;
            this.mBIS = null;
            this.mLength = 0;
            this.ucon = null;
        }

        /* synthetic */ BackgroundDownloadTask(SingleFileDownloader singleFileDownloader, BackgroundDownloadTask backgroundDownloadTask) {
            this();
        }

        /* access modifiers changed from: protected */
        public Object doInBackground(Object... objArr) {
            int i = 0;
            this.mTargetFile = objArr[0];
            this.mTempFile = new File(String.valueOf(this.mTargetFile.getAbsolutePath()) + ".tmp");
            File file = this.mTempFile;
            String str = objArr[1];
            if (Build.VERSION.SDK_INT < 8) {
                System.setProperty("http.keepAlive", "false");
            }
            try {
                this.ucon = SingleFileDownloader.this.getConnection(str);
                if (this.ucon == null) {
                    SingleFileDownloader.this.mListener.onFailed();
                    if (this.ucon != null) {
                        this.ucon.disconnect();
                    }
                    closeFiles();
                    return str;
                }
                String eTag = DownloadManager.getInstance().getETag(file);
                int wholeFileSize = DownloadManager.getInstance().getWholeFileSize(file);
                int partFileSize = DownloadManager.getInstance().getPartFileSize(file);
                if (file.exists() && eTag == null) {
                    file.delete();
                }
                if (eTag != null) {
                    DownloadUtil.setEtagInHeader(this.ucon, eTag);
                }
                this.ucon.connect();
                int responseCode = this.ucon.getResponseCode();
                String etagInHeader = DownloadUtil.getEtagInHeader(this.ucon);
                if (responseCode == 304) {
                    if ((this.mTempFile.exists() || (!this.mTempFile.exists() && !this.mTargetFile.exists())) && wholeFileSize > partFileSize) {
                        this.ucon.disconnect();
                        this.ucon = SingleFileDownloader.this.getConnection(str);
                        if (this.ucon == null) {
                            SingleFileDownloader.this.mListener.onFailed();
                            if (this.ucon != null) {
                                this.ucon.disconnect();
                            }
                            closeFiles();
                            return str;
                        }
                        this.ucon.setRequestProperty("Range", "bytes=" + partFileSize + C1351J.f4161f);
                        if (PresentationSystem.DUMPINFO) {
                            Log.d(SingleFileDownloader.TAG, "continue to download: startPos = " + partFileSize);
                        }
                        this.ucon.connect();
                    } else if (this.mTargetFile.exists()) {
                        if (this.ucon != null) {
                            this.ucon.disconnect();
                        }
                        closeFiles();
                        return null;
                    } else {
                        if (this.ucon != null) {
                            this.ucon.disconnect();
                        }
                        closeFiles();
                        return str;
                    }
                } else if (responseCode != 200) {
                    SingleFileDownloader.this.mListener.onFailed();
                    if (this.ucon != null) {
                        this.ucon.disconnect();
                    }
                    closeFiles();
                    return str;
                }
                if (PresentationSystem.DUMPINFO) {
                    Log.i(SingleFileDownloader.TAG, "storedETag = " + eTag + ", etag: " + etagInHeader);
                }
                if (TextUtils.equals(eTag, etagInHeader)) {
                    i = partFileSize;
                } else if (file.exists()) {
                    file.delete();
                }
                this.mLength = this.ucon.getContentLength();
                try {
                    this.mIS = this.ucon.getInputStream();
                    if (!file.exists()) {
                        try {
                            file.createNewFile();
                            DownloadManager.getInstance().removeETagFile(file);
                        } catch (IOException e) {
                            Log.e(SingleFileDownloader.TAG, "IOException, error message : " + e.getMessage());
                            SingleFileDownloader.this.mListener.onFailed();
                        }
                    } else {
                        this.mLength = wholeFileSize;
                    }
                    if (PresentationSystem.DUMPINFO) {
                        Log.i(SingleFileDownloader.TAG, "mLength = " + this.mLength);
                    }
                    DownloadManager.getInstance().createETagFile(file, etagInHeader, this.mLength);
                    try {
                        this.mRAF = new RandomAccessFile(file, "rw");
                        this.mRAF.seek((long) i);
                        this.mBIS = new BufferedInputStream(this.mIS);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            try {
                                int read = this.mBIS.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                SingleFileDownloader.this.mRetried = 0;
                                this.mRAF.write(bArr, 0, read);
                            } catch (IOException e2) {
                                Log.e(SingleFileDownloader.TAG, "Write file to disk IOException, error message : " + e2.getMessage());
                                SingleFileDownloader.this.mListener.onFailed();
                                if (this.ucon != null) {
                                    this.ucon.disconnect();
                                }
                                closeFiles();
                                return e2;
                            }
                        }
                        if (this.ucon != null) {
                            this.ucon.disconnect();
                        }
                        closeFiles();
                        return null;
                    } catch (FileNotFoundException e3) {
                        Log.e(SingleFileDownloader.TAG, "FileNotFoundException, error message : " + e3.getMessage());
                        SingleFileDownloader.this.mListener.onFailed();
                        if (this.ucon != null) {
                            this.ucon.disconnect();
                        }
                        closeFiles();
                        return e3;
                    } catch (IOException e4) {
                        SingleFileDownloader.this.mListener.onFailed();
                        if (this.ucon != null) {
                            this.ucon.disconnect();
                        }
                        closeFiles();
                        return e4;
                    }
                } catch (IOException e5) {
                    SingleFileDownloader.this.mListener.onFailed();
                    if (this.ucon != null) {
                        this.ucon.disconnect();
                    }
                    closeFiles();
                    return e5;
                }
            } catch (IOException e6) {
                e6.printStackTrace();
                if (this.ucon != null) {
                    this.ucon.disconnect();
                }
                closeFiles();
                return e6;
            } catch (Throwable th) {
                if (this.ucon != null) {
                    this.ucon.disconnect();
                }
                closeFiles();
                throw th;
            }
        }

        private void closeFiles() {
            try {
                if (this.mBIS != null) {
                    this.mBIS.close();
                }
            } catch (IOException e) {
                Log.e(SingleFileDownloader.TAG, "Release Streams IOException, error message : " + e.getMessage());
            }
            try {
                if (this.mIS != null) {
                    this.mIS.close();
                }
            } catch (IOException e2) {
                Log.e(SingleFileDownloader.TAG, "Release Streams IOException, error message : " + e2.getMessage());
            }
            try {
                if (this.mRAF != null) {
                    this.mRAF.close();
                }
            } catch (IOException e3) {
                Log.e(SingleFileDownloader.TAG, "Release Streams IOException, error message : " + e3.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            if (obj == null) {
                this.mTempFile.renameTo(this.mTargetFile);
                SingleFileDownloader.this.mListener.onFinished(this.mTargetFile.getAbsolutePath());
            } else if (needRetry()) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        SingleFileDownloader.this.download(true);
                    }
                }, 3000);
                SingleFileDownloader singleFileDownloader = SingleFileDownloader.this;
                singleFileDownloader.mRetried = singleFileDownloader.mRetried + 1;
            } else {
                SingleFileDownloader.this.mListener.onFailed();
            }
        }

        private boolean needRetry() {
            if (SingleFileDownloader.this.mRetried >= SingleFileDownloader.RETRY_COUNT) {
                return false;
            }
            if (!SingleFileDownloader.this.mStartOnWifi || NetworkUtil.getNetworkStatus().wifiConnected) {
                return true;
            }
            return false;
        }
    }
}
