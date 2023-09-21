package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.ArrayList;
import java.util.List;

public class BaiduPCSClient {
    public static final String Key_AccessToken = "access_token";
    public static final String Key_UserName = "username";
    public static final String Type_Media_MP4_360P = "MP4_360P";
    public static final String Type_Media_MP4_480P = "MP4_480P";
    public static final String Type_Stream_Audio = "audio";
    public static final String Type_Stream_Doc = "doc";
    public static final String Type_Stream_Image = "image";
    public static final String Type_Stream_Video = "video";
    private String mbAccessToken = null;

    public BaiduPCSClient() {
    }

    public BaiduPCSClient(String str) {
        this.mbAccessToken = str;
    }

    public BaiduPCSActionInfo.PCSQuotaResponse quota() {
        BaiduPCSQuotaInfo baiduPCSQuotaInfo = new BaiduPCSQuotaInfo();
        baiduPCSQuotaInfo.setAccessToken(this.mbAccessToken);
        return baiduPCSQuotaInfo.quotaInfo((String) null);
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse uploadFile(String str, String str2) {
        return uploadFile(str, str2, (BaiduPCSStatusListener) null);
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse uploadFile(String str, String str2, BaiduPCSStatusListener baiduPCSStatusListener) {
        BaiduPCSUploader baiduPCSUploader = new BaiduPCSUploader();
        baiduPCSUploader.setAccessToken(this.mbAccessToken);
        return baiduPCSUploader.uploadFile(str, str2, baiduPCSStatusListener);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse deleteFile(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return deleteFiles(arrayList);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse deleteFiles(List<String> list) {
        BaiduPCSDeleter baiduPCSDeleter = new BaiduPCSDeleter();
        baiduPCSDeleter.setAccessToken(this.mbAccessToken);
        return baiduPCSDeleter.deleteFiles(list);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFile(String str, String str2) {
        return downloadFile(str, str2, (BaiduPCSStatusListener) null);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFile(String str, String str2, BaiduPCSStatusListener baiduPCSStatusListener) {
        BaiduPCSDownloader baiduPCSDownloader = new BaiduPCSDownloader();
        baiduPCSDownloader.setAccessToken(this.mbAccessToken);
        return baiduPCSDownloader.downloadFile(str, str2, baiduPCSStatusListener);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileAsSpecificCodecType(String str, String str2, String str3) {
        return downloadFileAsSpecificCodecType(str, str2, str3, (BaiduPCSStatusListener) null);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileAsSpecificCodecType(String str, String str2, String str3, BaiduPCSStatusListener baiduPCSStatusListener) {
        BaiduPCSDownloader baiduPCSDownloader = new BaiduPCSDownloader();
        baiduPCSDownloader.setAccessToken(this.mbAccessToken);
        return baiduPCSDownloader.downloadFileWithSpecificCodecType(str, str2, str3, baiduPCSStatusListener);
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse makeDir(String str) {
        BaiduPCSFolderMaker baiduPCSFolderMaker = new BaiduPCSFolderMaker();
        baiduPCSFolderMaker.setAccessToken(this.mbAccessToken);
        return baiduPCSFolderMaker.makeDir(str);
    }

    public BaiduPCSActionInfo.PCSMetaResponse meta(String str) {
        BaiduPCSMeta baiduPCSMeta = new BaiduPCSMeta();
        baiduPCSMeta.setAccessToken(this.mbAccessToken);
        return baiduPCSMeta.meta(str);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse list(String str, String str2, String str3) {
        BaiduPCSList baiduPCSList = new BaiduPCSList();
        baiduPCSList.setAccessToken(this.mbAccessToken);
        return baiduPCSList.list(str, str2, str3);
    }

    public BaiduPCSActionInfo.PCSFileFromToResponse move(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = new BaiduPCSActionInfo.PCSFileFromToInfo();
        pCSFileFromToInfo.from = str;
        pCSFileFromToInfo.f2340to = str2;
        arrayList.add(pCSFileFromToInfo);
        return move(arrayList);
    }

    public BaiduPCSActionInfo.PCSFileFromToResponse move(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        BaiduPCSMove baiduPCSMove = new BaiduPCSMove();
        baiduPCSMove.setAccessToken(this.mbAccessToken);
        return baiduPCSMove.move(list);
    }

    public BaiduPCSActionInfo.PCSFileFromToResponse rename(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = new BaiduPCSActionInfo.PCSFileFromToInfo();
        pCSFileFromToInfo.from = str;
        pCSFileFromToInfo.f2340to = str2;
        arrayList.add(pCSFileFromToInfo);
        return rename(arrayList);
    }

    public BaiduPCSActionInfo.PCSFileFromToResponse rename(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        BaiduPCSMove baiduPCSMove = new BaiduPCSMove();
        baiduPCSMove.setAccessToken(this.mbAccessToken);
        return baiduPCSMove.rename(list);
    }

    public BaiduPCSActionInfo.PCSFileFromToResponse copy(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = new BaiduPCSActionInfo.PCSFileFromToInfo();
        pCSFileFromToInfo.from = str;
        pCSFileFromToInfo.f2340to = str2;
        arrayList.add(pCSFileFromToInfo);
        return copy(arrayList);
    }

    public BaiduPCSActionInfo.PCSFileFromToResponse copy(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        BaiduPCSCopy baiduPCSCopy = new BaiduPCSCopy();
        baiduPCSCopy.setAccessToken(this.mbAccessToken);
        return baiduPCSCopy.copy(list);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse search(String str, String str2, boolean z) {
        BaiduPCSSearch baiduPCSSearch = new BaiduPCSSearch();
        baiduPCSSearch.setAccessToken(this.mbAccessToken);
        return baiduPCSSearch.search(str, str2, z);
    }

    public BaiduPCSActionInfo.PCSThumbnailResponse thumbnail(String str, int i, int i2, int i3) {
        BaiduPCSThumbnail baiduPCSThumbnail = new BaiduPCSThumbnail();
        baiduPCSThumbnail.setAccessToken(this.mbAccessToken);
        return baiduPCSThumbnail.thumbnail(str, i, i2, i3);
    }

    public BaiduPCSActionInfo.PCSDiffResponse diff() {
        return diff((String) null);
    }

    public BaiduPCSActionInfo.PCSDiffResponse diff(String str) {
        BaiduPCSDiffer baiduPCSDiffer = new BaiduPCSDiffer();
        baiduPCSDiffer.setAccessToken(this.mbAccessToken);
        return baiduPCSDiffer.diff(str);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileFromStream(String str, String str2) {
        return downloadFileFromStream(str, str2, (BaiduPCSStatusListener) null);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileFromStream(String str, String str2, BaiduPCSStatusListener baiduPCSStatusListener) {
        BaiduPCSDownloader baiduPCSDownloader = new BaiduPCSDownloader();
        baiduPCSDownloader.setAccessToken(this.mbAccessToken);
        return baiduPCSDownloader.downloadFileFromStream(str, str2, baiduPCSStatusListener);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse imageStream() {
        return streamWithSpecificMediaType("image");
    }

    public BaiduPCSActionInfo.PCSListInfoResponse videoStream() {
        return streamWithSpecificMediaType("video");
    }

    public BaiduPCSActionInfo.PCSListInfoResponse audioStream() {
        return streamWithSpecificMediaType(Type_Stream_Audio);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse docStream() {
        return streamWithSpecificMediaType(Type_Stream_Doc);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse streamWithSpecificMediaType(String str) {
        return streamWithSpecificMediaType(str, -1, -1);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse imageStreamWithLimit(int i, int i2) {
        return streamWithSpecificMediaType("image", i, i2);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse videoStreamWithLimit(int i, int i2) {
        return streamWithSpecificMediaType("video", i, i2);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse audioStreamWithLimit(int i, int i2) {
        return streamWithSpecificMediaType(Type_Stream_Audio, i, i2);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse docStreamWithLimit(int i, int i2) {
        return streamWithSpecificMediaType(Type_Stream_Doc, i, i2);
    }

    public BaiduPCSActionInfo.PCSListInfoResponse streamWithSpecificMediaType(String str, int i, int i2) {
        BaiduPCSListStream baiduPCSListStream = new BaiduPCSListStream();
        baiduPCSListStream.setAccessToken(this.mbAccessToken);
        return baiduPCSListStream.listStream(str, i, i2);
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse cloudMatch(String str, String str2) {
        BaiduCloudMatch baiduCloudMatch = new BaiduCloudMatch();
        baiduCloudMatch.setAccessToken(this.mbAccessToken);
        return baiduCloudMatch.cloudMatch(str, str2);
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse cloudMatchAndUploadFile(String str, String str2, BaiduPCSStatusListener baiduPCSStatusListener) {
        BaiduPCSActionInfo.PCSFileInfoResponse cloudMatch = cloudMatch(str, str2);
        if (cloudMatch.status.errorCode == 31079) {
            return uploadFile(str, str2, baiduPCSStatusListener);
        }
        return cloudMatch;
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse cloudMatchAndUploadFile(String str, String str2) {
        BaiduPCSActionInfo.PCSFileInfoResponse cloudMatch = cloudMatch(str, str2);
        if (cloudMatch.status.errorCode == 31079) {
            return uploadFile(str, str2);
        }
        return cloudMatch;
    }

    public BaiduPCSActionInfo.PCSCloudDownloadResponse cloudDownload(String str, String str2) {
        return cloudDownload(str, str2, 0, 0, (String) null);
    }

    public BaiduPCSActionInfo.PCSCloudDownloadResponse cloudDownload(String str, String str2, long j, long j2, String str3) {
        BaiduCloudDownload baiduCloudDownload = new BaiduCloudDownload();
        baiduCloudDownload.setAccessToken(this.mbAccessToken);
        return baiduCloudDownload.cloudDownload(str, str2, j, j2, str3);
    }

    public BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse cloudDownloadTaskList() {
        return cloudDownloadTaskList(0, 0, 0, true);
    }

    public BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse cloudDownloadTaskList(int i, int i2, int i3, boolean z) {
        BaiduCloudDownload baiduCloudDownload = new BaiduCloudDownload();
        baiduCloudDownload.setAccessToken(this.mbAccessToken);
        return baiduCloudDownload.cloudTaskList(i, i2, i3, z);
    }

    public BaiduPCSActionInfo.PCSCloudDownloadQueryTaskStatusResponse queryCloudDownloadTaskStatus(String[] strArr) {
        BaiduCloudDownload baiduCloudDownload = new BaiduCloudDownload();
        baiduCloudDownload.setAccessToken(this.mbAccessToken);
        return baiduCloudDownload.queryCloudDownloadTaskStatus(strArr);
    }

    public BaiduPCSActionInfo.PCSCloudDownloadQueryTaskProgressResponse queryCloudDownloadTaskProgress(String[] strArr) {
        BaiduCloudDownload baiduCloudDownload = new BaiduCloudDownload();
        baiduCloudDownload.setAccessToken(this.mbAccessToken);
        return baiduCloudDownload.queryCloudDownloadTaskProgress(strArr);
    }

    public BaiduPCSActionInfo.PCSCloudDownloadResponse cancelCloudDownloadTask(String str) {
        BaiduCloudDownload baiduCloudDownload = new BaiduCloudDownload();
        baiduCloudDownload.setAccessToken(this.mbAccessToken);
        return baiduCloudDownload.cancelCloudDownloadTask(str);
    }

    public BaiduPCSActionInfo.PCSStreamingURLResponse getStreamingURL(String str, String str2) {
        BaiduPCSStreamingURL baiduPCSStreamingURL = new BaiduPCSStreamingURL();
        baiduPCSStreamingURL.setAccessToken(this.mbAccessToken);
        return baiduPCSStreamingURL.getStreamingURL(str, str2);
    }

    public void setAccessToken(String str) {
        this.mbAccessToken = str;
    }

    public String accessToken() {
        return this.mbAccessToken;
    }
}
