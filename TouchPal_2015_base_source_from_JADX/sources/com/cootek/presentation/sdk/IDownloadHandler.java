package com.cootek.presentation.sdk;

import java.io.File;

public interface IDownloadHandler {
    String getDownloadRequestUrl(String str);

    boolean handleDownloadedFile(File file);
}
