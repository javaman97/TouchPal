package com.baidu.pcs;

import android.graphics.Bitmap;
import java.util.List;

public final class BaiduPCSActionInfo {

    public static class PCSAudioMetaResponse extends PCSMetaResponse {
        public String albumArt = null;
        public String albumArtist = null;
        public String albumTitle = null;
        public String artistName = null;
        public String compilation = null;
        public String composer = null;
        public String date = null;
        public long duration = 0;
        public String genre = null;
        public boolean hasthumbnail = false;
        public long trackNumber = -1;
        public String trackTitle = null;
    }

    public static class PCSCloudDownloadQueryTaskProgressResponse {
        public List<PCSCloudDownloadTaskProgressInfo> list = null;
        public String requestId = null;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
    }

    public static class PCSCloudDownloadQueryTaskStatusResponse {
        public List<PCSCloudDownloadTaskInfo> list = null;
        public String requestId = null;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
    }

    public static class PCSCloudDownloadResponse {
        public String requestId = null;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
        public String taskId = null;
    }

    public static class PCSCloudDownloadTaskInfo {
        public String callback = null;
        public long createTime = -1;
        public int queryResult = -1;
        public long rateLimit = -1;
        public String savePath = null;
        public String sourceUrl = null;
        public int status = -1;
        public String taskId = null;
        public long timeout = -1;
    }

    public static class PCSCloudDownloadTaskListResponse {
        public List<PCSCloudDownloadTaskInfo> list = null;
        public String requestId = null;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
        public int totalTaskNum = -1;
    }

    public static class PCSCloudDownloadTaskProgressInfo {
        public long createTime = -1;
        public long fileSize = -1;
        public long finishedSize = -1;
        public long finishedTime = -1;
        public int queryResult = -1;
        public long startTime = -1;
        public int status = -1;
        public String taskId = null;
    }

    public static class PCSCommonFileInfo {
        public String blockList = null;
        public long cTime = 0;
        public long fsId = 0;
        public boolean hasSubFolder = false;
        public boolean isDir = false;
        public long mTime = 0;
        public String path = null;
        public long size = -1;
    }

    public static class PCSDiffResponse {
        public String cursor = null;
        public List<PCSDifferEntryInfo> entries = null;
        public boolean hasMore = false;
        public boolean isReseted = false;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
    }

    public static class PCSDifferEntryInfo {
        public PCSCommonFileInfo commonFileInfo = new PCSCommonFileInfo();
        public boolean isDeleted = false;
    }

    public static class PCSFileFromToInfo {
        public String from = null;

        /* renamed from: to */
        public String f2340to = null;
    }

    public static class PCSFileFromToResponse {
        public List<PCSFileFromToInfo> list = null;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
    }

    public static class PCSFileInfoResponse {
        public PCSCommonFileInfo commonFileInfo = new PCSCommonFileInfo();
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
    }

    public static class PCSImageMetaResponse extends PCSMetaResponse {
        public long dateTaken = 0;
        public boolean hasthumbnail = true;
        public double latitude = 0.0d;
        public double longtitude = 0.0d;
        public String resolution = null;
    }

    public static class PCSListInfoResponse {
        public List<PCSCommonFileInfo> list = null;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
    }

    public static class PCSMetaResponse {
        public PCSCommonFileInfo commonFileInfo = new PCSCommonFileInfo();
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
        public MediaType type = MediaType.Media_Unknown;

        public enum MediaType {
            Media_Unknown,
            Media_Audio,
            Media_Video,
            Media_Image
        }
    }

    public static class PCSQuotaResponse {
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
        public long total = 0;
        public long used = 0;
    }

    public static class PCSSimplefiedResponse {
        public int errorCode = -1;
        public String message = null;
    }

    public static class PCSStreamingURLResponse {
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
        public String url = null;
    }

    public static class PCSThumbnailResponse {
        public Bitmap bitmap = null;
        public PCSSimplefiedResponse status = new PCSSimplefiedResponse();
    }

    public static class PCSVideoMetaResponse extends PCSMetaResponse {
        public String cateogry = null;
        public long dateTaken = 0;
        public long duration = 0;
        public boolean hasthumbnail = false;
        public String resolution = null;
    }
}
