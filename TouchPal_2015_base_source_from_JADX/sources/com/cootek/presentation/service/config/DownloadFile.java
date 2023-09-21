package com.cootek.presentation.service.config;

import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.sdk.utils.DownloadUtil;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.SingleFileDownloader;
import com.cootek.presentation.service.history.PresentHistoryManager;
import com.cootek.presentation.service.history.PresentStatisticUploader;
import java.util.HashSet;

public class DownloadFile {
    /* access modifiers changed from: private */
    public static HashSet<String> sDownloadingFiles = new HashSet<>();
    private String mDownloadUrl;
    private IFileProcesser mDownloadedFileProcesser;
    /* access modifiers changed from: private */
    public boolean mIsDownloading;
    private SingleFileDownloader.IDownloadListener mListener = new SingleFileDownloader.IDownloadListener() {
        public void onStart() {
            if (PresentationSystem.DUMPINFO) {
                Log.d("chao", "download started");
            }
            DownloadFile.sDownloadingFiles.add(DownloadFile.this.mPresentId);
            PresentationSystem.getInstance().getPresentStatisticUploader().addItem(PresentStatisticUploader.TYPE_DOWNLOAD, "START", DownloadFile.this.mPresentId);
            DownloadFile.this.mIsDownloading = true;
        }

        public void onFinished(String str) {
            if (PresentationSystem.DUMPINFO) {
                Log.d("chao", "download finished");
            }
            DownloadFile.sDownloadingFiles.remove(DownloadFile.this.mPresentId);
            DownloadFile.this.mIsDownloading = false;
            if (!TextUtils.isEmpty(str)) {
                PresentationSystem.getInstance().getPresentStatisticUploader().addItem(PresentStatisticUploader.TYPE_DOWNLOAD, "FINISH", DownloadFile.this.mPresentId);
                if (PresentationSystem.DUMPINFO) {
                    Log.d("chao", "download file path: " + str);
                }
                DownloadFile.this.processFile(str);
            } else if (PresentationSystem.DUMPINFO) {
                Log.d("chao", "download failed");
            }
        }

        public void onFailed() {
            if (PresentationSystem.DUMPINFO) {
                Log.d("chao", "download failed");
            }
            DownloadFile.sDownloadingFiles.remove(DownloadFile.this.mPresentId);
            DownloadFile.this.mIsDownloading = false;
        }

        public void onRestart() {
            if (PresentationSystem.DUMPINFO) {
                Log.d("chao", "download restart");
            }
            DownloadFile.sDownloadingFiles.add(DownloadFile.this.mPresentId);
            DownloadFile.this.mIsDownloading = true;
        }
    };
    /* access modifiers changed from: private */
    public String mPresentId;
    private boolean mRequestToken;

    public interface IFileProcesser {
        String process(String str);
    }

    private static IFileProcesser getDefaultProcesser() {
        return new IFileProcesser() {
            public String process(String str) {
                if (str.endsWith(PresentConfigXmlTag.POSTFIX_FILE_PATH_ZIP)) {
                    return DownloadUtil.unzipFile(str);
                }
                return str;
            }
        };
    }

    public DownloadFile(String str, String str2, boolean z) {
        this.mPresentId = str2;
        this.mDownloadUrl = str;
        this.mRequestToken = false;
        this.mIsDownloading = false;
        this.mDownloadedFileProcesser = getDefaultProcesser();
    }

    public DownloadFile(String str, String str2, boolean z, IFileProcesser iFileProcesser) {
        this.mPresentId = str2;
        this.mDownloadUrl = str;
        this.mRequestToken = false;
        this.mIsDownloading = false;
        this.mDownloadedFileProcesser = iFileProcesser;
    }

    public void startDownload() {
        if (!this.mIsDownloading && !sDownloadingFiles.contains(this.mPresentId)) {
            downloadFile(this.mPresentId, this.mDownloadUrl);
        }
    }

    private void downloadFile(String str, String str2) {
        this.mIsDownloading = true;
        new SingleFileDownloader(str2, DownloadUtil.prepareFile(str, str2), this.mListener, this.mRequestToken).download(false);
    }

    public void processFile(String str) {
        PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
        if (this.mDownloadedFileProcesser != null) {
            str = this.mDownloadedFileProcesser.process(str);
        }
        historyManager.setFeatureSetting(this.mPresentId, PresentHistoryManager.FILE_PATH, str);
        if (PresentationSystem.DUMPINFO) {
            Log.d("chao", "after process file path: " + str);
        }
    }
}
