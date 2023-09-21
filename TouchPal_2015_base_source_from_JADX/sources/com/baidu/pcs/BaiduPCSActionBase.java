package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionInfo;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.func.resource.C1970i;
import com.iflytek.cloud.SpeechConstant;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class BaiduPCSActionBase {

    /* renamed from: $SWITCH_TABLE$com$baidu$pcs$BaiduPCSActionInfo$PCSMetaResponse$MediaType */
    private static /* synthetic */ int[] f2339xb55e6b12 = null;
    static final String Command_File = "file";
    static final String Command_Service = "services";
    static final String Command_Stream = "stream";
    static final String Command_Thumbnail = "thumbnail";
    static final String Key_AccessToken = "access_token";
    static final String Key_BlockList = "block_list";
    private static final String Key_CTime = "ctime";
    static final String Key_Content_Md5 = "content-md5";
    static final String Key_ErrorCode = "error_code";
    static final String Key_ErrorMessage = "error_msg";
    private static final String Key_Extra = "extra";
    static final String Key_Files_List = "list";
    private static final String Key_Files_Path = "path";
    static final String Key_From = "from";
    private static final String Key_FsId = "fsid";
    private static final String Key_HasSubFolder = "ifhassubdir";
    private static final String Key_IsDir = "isdir";
    static final String Key_MD5 = "md5";
    private static final String Key_MTime = "mtime";
    static final String Key_Method = "method";
    static final String Key_Param = "param";
    static final String Key_Path = "path";
    static final String Key_Query_Result = "result";
    static final String Key_Request_Id = "request_id";
    private static final String Key_Size = "size";
    static final String Key_Slice_Md5 = "slice-md5";
    static final String Key_Task_Id = "task_id";
    static final String Key_Task_Info_List = "task_info";
    static final String Key_to = "to";
    static final int Max_Retries = 6;
    static final String PCSRequestUrl = "https://pcs.baidu.com/rest/2.0/pcs";
    static final String Value_File_Length = "content-length";
    static final String Value_Total_Task = "total";
    protected String Encoding_UTF8 = "utf8";
    public String Key_AlbumArt = "albumArt";
    private String Key_AlbumArtist = "albumArtist";
    private String Key_AlbumTitle = "albumTitle";
    private String Key_ArtistName = "artistName";
    private String Key_Callback = JavascriptHandler.SHARE_PARAM_JS_CALLBACK;
    private String Key_Cateogry = "cateogry";
    private String Key_Compilation = "compilation";
    private String Key_Composer = "composer";
    private String Key_Create_Time = "create_time";
    private String Key_Cursor = "cursor";
    private String Key_Date = "date";
    private String Key_DateTaken = "dateTaken";
    private String Key_Duration = PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION;
    private String Key_Entries = C1970i.f6728f;
    private String Key_File_Size = "file_size";
    private String Key_Finished_Size = "finished_size";
    private String Key_Finished_Time = "finish_time";
    private String Key_Genre = "genre";
    private String Key_HasMore = "has_more";
    private String Key_HasThumbnail = "hasThumbnail";
    private String Key_Latitude = "latitude";
    private String Key_Longitude = "longitude";
    private String Key_MediaType = "mediaType";
    private String Key_Rate_Limit = "rate_limit";
    private String Key_Reset = "reset";
    private String Key_Resolution = "resolution";
    private String Key_Save_Path = "save_path";
    private String Key_Source_Url = SearchToLinkActivity.SOURCE_URL;
    private String Key_Start_Time = "start_time";
    private String Key_Status = "status";
    private String Key_Timeout = SpeechConstant.NET_TIMEOUT;
    private String Key_TrackNumber = "trackNumber";
    private String Key_TrackTitle = "trackTitle";
    private String Key_isDeleted = "isdelete";
    private String Value_Media_Audio = BaiduPCSClient.Type_Stream_Audio;
    private String Value_Media_Image = "image";
    private String Value_Media_Video = "video";
    private String mbAccessToken = null;

    /* renamed from: $SWITCH_TABLE$com$baidu$pcs$BaiduPCSActionInfo$PCSMetaResponse$MediaType */
    static /* synthetic */ int[] m4887xb55e6b12() {
        int[] iArr = f2339xb55e6b12;
        if (iArr == null) {
            iArr = new int[BaiduPCSActionInfo.PCSMetaResponse.MediaType.values().length];
            try {
                iArr[BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Audio.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Image.ordinal()] = 4;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Video.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            f2339xb55e6b12 = iArr;
        }
        return iArr;
    }

    BaiduPCSActionBase() {
    }

    public void setAccessToken(String str) {
        this.mbAccessToken = str;
    }

    public String getAccessToken() {
        return this.mbAccessToken;
    }

    /* access modifiers changed from: protected */
    public PCSRawHTTPResponse sendHttpRequest(HttpRequestBase httpRequestBase) {
        PCSRawHTTPResponse pCSRawHTTPResponse = new PCSRawHTTPResponse();
        if (httpRequestBase != null) {
            HttpClient makeHttpClient = HttpClientFactory.makeHttpClient();
            HttpClientParams.setCookiePolicy(makeHttpClient.getParams(), "compatibility");
            if (makeHttpClient != null) {
                int i = 0;
                while (pCSRawHTTPResponse.response == null && i < 6) {
                    try {
                        pCSRawHTTPResponse.response = makeHttpClient.execute(httpRequestBase);
                    } catch (NullPointerException e) {
                        pCSRawHTTPResponse.message = e.getMessage();
                    } catch (ClientProtocolException e2) {
                        pCSRawHTTPResponse.message = e2.getMessage();
                    } catch (IOException e3) {
                        pCSRawHTTPResponse.message = e3.getMessage();
                    }
                    if (pCSRawHTTPResponse.response == null) {
                        try {
                            Thread.sleep((long) ((i + 1) * 1000));
                        } catch (InterruptedException e4) {
                            pCSRawHTTPResponse.message = e4.getMessage();
                        }
                    }
                    i++;
                }
            }
        }
        return pCSRawHTTPResponse;
    }

    /* access modifiers changed from: protected */
    public String buildParams(List<NameValuePair> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        try {
            return EntityUtils.toString(new UrlEncodedFormEntity(list, "utf8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileInfoResponse parseFileInfo(HttpResponse httpResponse) {
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        try {
            return parseFileInfoByJson(EntityUtils.toString(httpResponse.getEntity()));
        } catch (ParseException e) {
            pCSFileInfoResponse.status.message = e.getMessage();
            return pCSFileInfoResponse;
        } catch (IOException e2) {
            pCSFileInfoResponse.status.message = e2.getMessage();
            return pCSFileInfoResponse;
        }
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileInfoResponse parseFileInfoByJson(String str) {
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        if (str == null || str.length() <= 0) {
            return pCSFileInfoResponse;
        }
        try {
            return parseFileInfoByJSONObject(new JSONObject(str));
        } catch (JSONException e) {
            pCSFileInfoResponse.status.message = e.getMessage();
            return pCSFileInfoResponse;
        }
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileInfoResponse parseFileInfoByJSONObject(JSONObject jSONObject) {
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("error_code")) {
                    pCSFileInfoResponse.status.errorCode = jSONObject.getInt("error_code");
                    if (jSONObject.has(Key_ErrorMessage)) {
                        pCSFileInfoResponse.status.message = jSONObject.getString(Key_ErrorMessage);
                    }
                } else {
                    pCSFileInfoResponse.status.errorCode = 0;
                    pCSFileInfoResponse.commonFileInfo = parseCommonFileInfoByJSONObject(jSONObject);
                }
            } catch (JSONException e) {
                pCSFileInfoResponse.status.message = e.getMessage();
            }
        }
        return pCSFileInfoResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSCommonFileInfo parseCommonFileInfoByJSONObject(JSONObject jSONObject) {
        boolean z = false;
        BaiduPCSActionInfo.PCSCommonFileInfo pCSCommonFileInfo = new BaiduPCSActionInfo.PCSCommonFileInfo();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("md5")) {
                    pCSCommonFileInfo.blockList = jSONObject.getString("md5");
                }
                if (jSONObject.has(Key_BlockList)) {
                    pCSCommonFileInfo.blockList = jSONObject.getString(Key_BlockList);
                }
                if (jSONObject.has("path")) {
                    pCSCommonFileInfo.path = jSONObject.getString("path");
                }
                if (jSONObject.has(Key_Size)) {
                    pCSCommonFileInfo.size = jSONObject.getLong(Key_Size);
                }
                if (jSONObject.has(Key_CTime)) {
                    pCSCommonFileInfo.cTime = jSONObject.getLong(Key_CTime);
                }
                if (jSONObject.has(Key_MTime)) {
                    pCSCommonFileInfo.mTime = jSONObject.getLong(Key_MTime);
                }
                if (jSONObject.has(Key_IsDir)) {
                    pCSCommonFileInfo.isDir = jSONObject.getInt(Key_IsDir) != 0;
                }
                if (jSONObject.has(Key_HasSubFolder)) {
                    if (jSONObject.getInt(Key_HasSubFolder) != 0) {
                        z = true;
                    }
                    pCSCommonFileInfo.hasSubFolder = z;
                }
                if (jSONObject.has(Key_FsId)) {
                    pCSCommonFileInfo.fsId = (long) jSONObject.getInt(Key_FsId);
                }
            } catch (JSONException e) {
            }
        }
        return pCSCommonFileInfo;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSCloudDownloadTaskInfo parseCloudDownloadTaskInfoByJSONObject(JSONObject jSONObject) {
        BaiduPCSActionInfo.PCSCloudDownloadTaskInfo pCSCloudDownloadTaskInfo = new BaiduPCSActionInfo.PCSCloudDownloadTaskInfo();
        if (jSONObject != null) {
            try {
                if (jSONObject.has(Key_Task_Id)) {
                    pCSCloudDownloadTaskInfo.taskId = jSONObject.getString(Key_Task_Id);
                }
                if (jSONObject.has("result")) {
                    pCSCloudDownloadTaskInfo.queryResult = Integer.parseInt(jSONObject.getString("result"));
                }
                if (jSONObject.has(this.Key_Source_Url)) {
                    pCSCloudDownloadTaskInfo.sourceUrl = jSONObject.getString(this.Key_Source_Url);
                }
                if (jSONObject.has(this.Key_Save_Path)) {
                    pCSCloudDownloadTaskInfo.savePath = jSONObject.getString(this.Key_Save_Path);
                }
                if (jSONObject.has(this.Key_Rate_Limit)) {
                    pCSCloudDownloadTaskInfo.rateLimit = jSONObject.getLong(this.Key_Rate_Limit);
                }
                if (jSONObject.has(this.Key_Timeout)) {
                    pCSCloudDownloadTaskInfo.timeout = jSONObject.getLong(this.Key_Timeout);
                }
                if (jSONObject.has(this.Key_Callback)) {
                    pCSCloudDownloadTaskInfo.callback = jSONObject.getString(this.Key_Callback);
                }
                if (jSONObject.has(this.Key_Status)) {
                    pCSCloudDownloadTaskInfo.status = jSONObject.getInt(this.Key_Status);
                }
                if (jSONObject.has(this.Key_Create_Time)) {
                    pCSCloudDownloadTaskInfo.createTime = jSONObject.getLong(this.Key_Create_Time);
                }
            } catch (JSONException e) {
            }
        }
        return pCSCloudDownloadTaskInfo;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSCloudDownloadTaskProgressInfo parseCloudDownloadTaskProgressInfoByJSONObject(JSONObject jSONObject) {
        BaiduPCSActionInfo.PCSCloudDownloadTaskProgressInfo pCSCloudDownloadTaskProgressInfo = new BaiduPCSActionInfo.PCSCloudDownloadTaskProgressInfo();
        if (jSONObject != null) {
            try {
                if (jSONObject.has(Key_Task_Id)) {
                    pCSCloudDownloadTaskProgressInfo.taskId = jSONObject.getString(Key_Task_Id);
                }
                if (jSONObject.has("result")) {
                    pCSCloudDownloadTaskProgressInfo.queryResult = Integer.parseInt(jSONObject.getString("result"));
                }
                if (jSONObject.has(this.Key_Status)) {
                    pCSCloudDownloadTaskProgressInfo.status = jSONObject.getInt(this.Key_Status);
                }
                if (jSONObject.has(this.Key_Create_Time)) {
                    pCSCloudDownloadTaskProgressInfo.createTime = jSONObject.getLong(this.Key_Create_Time);
                }
                if (jSONObject.has(this.Key_Start_Time)) {
                    pCSCloudDownloadTaskProgressInfo.startTime = jSONObject.getLong(this.Key_Start_Time);
                }
                if (jSONObject.has(this.Key_Finished_Size)) {
                    pCSCloudDownloadTaskProgressInfo.finishedSize = jSONObject.getLong(this.Key_Finished_Size);
                }
                if (jSONObject.has(this.Key_File_Size)) {
                    pCSCloudDownloadTaskProgressInfo.fileSize = jSONObject.getLong(this.Key_File_Size);
                }
                if (jSONObject.has(this.Key_Finished_Time)) {
                    pCSCloudDownloadTaskProgressInfo.finishedTime = jSONObject.getLong(this.Key_Finished_Time);
                }
            } catch (JSONException e) {
            }
        }
        return pCSCloudDownloadTaskProgressInfo;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSCloudDownloadTaskInfo parseCloudDownloadTaskStatusInfoByJSONObject(JSONObject jSONObject) {
        BaiduPCSActionInfo.PCSCloudDownloadTaskInfo pCSCloudDownloadTaskInfo = new BaiduPCSActionInfo.PCSCloudDownloadTaskInfo();
        if (jSONObject != null) {
            try {
                if (jSONObject.has(Key_Task_Id)) {
                    pCSCloudDownloadTaskInfo.taskId = jSONObject.getString(Key_Task_Id);
                }
                if (jSONObject.has("result")) {
                    pCSCloudDownloadTaskInfo.queryResult = Integer.parseInt(jSONObject.getString("result"));
                }
                if (jSONObject.has(this.Key_Source_Url)) {
                    pCSCloudDownloadTaskInfo.sourceUrl = jSONObject.getString(this.Key_Source_Url);
                }
                if (jSONObject.has(this.Key_Save_Path)) {
                    pCSCloudDownloadTaskInfo.savePath = jSONObject.getString(this.Key_Save_Path);
                }
                if (jSONObject.has(this.Key_Rate_Limit)) {
                    pCSCloudDownloadTaskInfo.rateLimit = jSONObject.getLong(this.Key_Rate_Limit);
                }
                if (jSONObject.has(this.Key_Timeout)) {
                    pCSCloudDownloadTaskInfo.timeout = jSONObject.getLong(this.Key_Timeout);
                }
                if (jSONObject.has(this.Key_Callback)) {
                    pCSCloudDownloadTaskInfo.callback = jSONObject.getString(this.Key_Callback);
                }
                if (jSONObject.has(this.Key_Status)) {
                    pCSCloudDownloadTaskInfo.status = jSONObject.getInt(this.Key_Status);
                }
                if (jSONObject.has(this.Key_Create_Time)) {
                    pCSCloudDownloadTaskInfo.createTime = jSONObject.getLong(this.Key_Create_Time);
                }
            } catch (JSONException e) {
            }
        }
        return pCSCloudDownloadTaskInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSVideoMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSAudioMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ JSONException -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7 A[Catch:{ JSONException -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0174 A[Catch:{ JSONException -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01cb A[Catch:{ JSONException -> 0x016e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.baidu.pcs.BaiduPCSActionInfo.PCSMetaResponse parseMetaResponse(org.json.JSONObject r8) {
        /*
            r7 = this;
            r1 = 0
            if (r8 == 0) goto L_0x0215
            java.lang.String r0 = "error_code"
            boolean r0 = r8.has(r0)     // Catch:{ JSONException -> 0x016e }
            if (r0 == 0) goto L_0x002d
            com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse r0 = new com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse     // Catch:{ JSONException -> 0x016e }
            r0.<init>()     // Catch:{ JSONException -> 0x016e }
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r1 = r0.status     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r2 = "error_code"
            int r2 = r8.getInt(r2)     // Catch:{ JSONException -> 0x0085 }
            r1.errorCode = r2     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "error_msg"
            boolean r1 = r8.has(r1)     // Catch:{ JSONException -> 0x0085 }
            if (r1 == 0) goto L_0x002c
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r1 = r0.status     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ JSONException -> 0x0085 }
            r1.message = r2     // Catch:{ JSONException -> 0x0085 }
        L_0x002c:
            return r0
        L_0x002d:
            java.lang.String r0 = "list"
            boolean r0 = r8.has(r0)     // Catch:{ JSONException -> 0x016e }
            if (r0 == 0) goto L_0x0215
            java.lang.String r0 = "list"
            org.json.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x016e }
            if (r0 == 0) goto L_0x0215
            int r2 = r0.length()     // Catch:{ JSONException -> 0x016e }
            if (r2 <= 0) goto L_0x0215
            r2 = 0
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x016e }
            if (r3 == 0) goto L_0x0215
            com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse$MediaType r0 = com.baidu.pcs.BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Unknown     // Catch:{ JSONException -> 0x016e }
            java.lang.String r2 = r7.Key_MediaType     // Catch:{ JSONException -> 0x016e }
            boolean r2 = r3.has(r2)     // Catch:{ JSONException -> 0x016e }
            if (r2 == 0) goto L_0x0212
            java.lang.String r2 = r7.Key_MediaType     // Catch:{ JSONException -> 0x016e }
            java.lang.String r2 = r3.getString(r2)     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r7.Value_Media_Audio     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r2.equals(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x008f
            com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse$MediaType r0 = com.baidu.pcs.BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Audio     // Catch:{ JSONException -> 0x016e }
            r2 = r0
        L_0x0065:
            int[] r0 = m4887xb55e6b12()     // Catch:{ JSONException -> 0x016e }
            int r4 = r2.ordinal()     // Catch:{ JSONException -> 0x016e }
            r0 = r0[r4]     // Catch:{ JSONException -> 0x016e }
            switch(r0) {
                case 2: goto L_0x00a7;
                case 3: goto L_0x0174;
                case 4: goto L_0x01cb;
                default: goto L_0x0072;
            }     // Catch:{ JSONException -> 0x016e }
        L_0x0072:
            com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse r0 = new com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse     // Catch:{ JSONException -> 0x016e }
            r0.<init>()     // Catch:{ JSONException -> 0x016e }
        L_0x0077:
            r0.type = r2     // Catch:{ JSONException -> 0x0085 }
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r1 = r0.status     // Catch:{ JSONException -> 0x0085 }
            r2 = 0
            r1.errorCode = r2     // Catch:{ JSONException -> 0x0085 }
            com.baidu.pcs.BaiduPCSActionInfo$PCSCommonFileInfo r1 = r7.parseCommonFileInfoByJSONObject(r3)     // Catch:{ JSONException -> 0x0085 }
            r0.commonFileInfo = r1     // Catch:{ JSONException -> 0x0085 }
            goto L_0x002c
        L_0x0085:
            r1 = move-exception
        L_0x0086:
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r2 = r0.status
            java.lang.String r1 = r1.getMessage()
            r2.message = r1
            goto L_0x002c
        L_0x008f:
            java.lang.String r4 = r7.Value_Media_Video     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r2.equals(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x009b
            com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse$MediaType r0 = com.baidu.pcs.BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Video     // Catch:{ JSONException -> 0x016e }
            r2 = r0
            goto L_0x0065
        L_0x009b:
            java.lang.String r4 = r7.Value_Media_Image     // Catch:{ JSONException -> 0x016e }
            boolean r2 = r2.equals(r4)     // Catch:{ JSONException -> 0x016e }
            if (r2 == 0) goto L_0x0212
            com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse$MediaType r0 = com.baidu.pcs.BaiduPCSActionInfo.PCSMetaResponse.MediaType.Media_Image     // Catch:{ JSONException -> 0x016e }
            r2 = r0
            goto L_0x0065
        L_0x00a7:
            com.baidu.pcs.BaiduPCSActionInfo$PCSAudioMetaResponse r0 = new com.baidu.pcs.BaiduPCSActionInfo$PCSAudioMetaResponse     // Catch:{ JSONException -> 0x016e }
            r0.<init>()     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r7.Key_HasThumbnail     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x00bc
            java.lang.String r4 = r7.Key_HasThumbnail     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.getBoolean(r4)     // Catch:{ JSONException -> 0x016e }
            r0.hasthumbnail = r4     // Catch:{ JSONException -> 0x016e }
        L_0x00bc:
            java.lang.String r4 = r7.Key_ArtistName     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x00cc
            java.lang.String r4 = r7.Key_ArtistName     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.artistName = r4     // Catch:{ JSONException -> 0x016e }
        L_0x00cc:
            java.lang.String r4 = r7.Key_AlbumTitle     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x00dc
            java.lang.String r4 = r7.Key_AlbumTitle     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.albumTitle = r4     // Catch:{ JSONException -> 0x016e }
        L_0x00dc:
            java.lang.String r4 = r7.Key_AlbumArtist     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x00ec
            java.lang.String r4 = r7.Key_AlbumArtist     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.albumArtist = r4     // Catch:{ JSONException -> 0x016e }
        L_0x00ec:
            java.lang.String r4 = r7.Key_AlbumArt     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x00fc
            java.lang.String r4 = r7.Key_AlbumArt     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.albumArt = r4     // Catch:{ JSONException -> 0x016e }
        L_0x00fc:
            java.lang.String r4 = r7.Key_Composer     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x010c
            java.lang.String r4 = r7.Key_Composer     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.composer = r4     // Catch:{ JSONException -> 0x016e }
        L_0x010c:
            java.lang.String r4 = r7.Key_TrackTitle     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x011c
            java.lang.String r4 = r7.Key_TrackTitle     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.trackTitle = r4     // Catch:{ JSONException -> 0x016e }
        L_0x011c:
            java.lang.String r4 = r7.Key_TrackNumber     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = r7.Key_TrackNumber     // Catch:{ JSONException -> 0x016e }
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x016e }
            r0.trackNumber = r4     // Catch:{ JSONException -> 0x016e }
        L_0x012c:
            java.lang.String r4 = r7.Key_Duration     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x013c
            java.lang.String r4 = r7.Key_Duration     // Catch:{ JSONException -> 0x016e }
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x016e }
            r0.duration = r4     // Catch:{ JSONException -> 0x016e }
        L_0x013c:
            java.lang.String r4 = r7.Key_Compilation     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x014c
            java.lang.String r4 = r7.Key_Compilation     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.compilation = r4     // Catch:{ JSONException -> 0x016e }
        L_0x014c:
            java.lang.String r4 = r7.Key_Date     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x015c
            java.lang.String r4 = r7.Key_Date     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.date = r4     // Catch:{ JSONException -> 0x016e }
        L_0x015c:
            java.lang.String r4 = r7.Key_Genre     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x0077
            java.lang.String r4 = r7.Key_Genre     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.genre = r4     // Catch:{ JSONException -> 0x016e }
            goto L_0x0077
        L_0x016e:
            r0 = move-exception
            r6 = r0
            r0 = r1
            r1 = r6
            goto L_0x0086
        L_0x0174:
            com.baidu.pcs.BaiduPCSActionInfo$PCSVideoMetaResponse r0 = new com.baidu.pcs.BaiduPCSActionInfo$PCSVideoMetaResponse     // Catch:{ JSONException -> 0x016e }
            r0.<init>()     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r7.Key_HasThumbnail     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x0189
            java.lang.String r4 = r7.Key_HasThumbnail     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.getBoolean(r4)     // Catch:{ JSONException -> 0x016e }
            r0.hasthumbnail = r4     // Catch:{ JSONException -> 0x016e }
        L_0x0189:
            java.lang.String r4 = r7.Key_Resolution     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x0199
            java.lang.String r4 = r7.Key_Resolution     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.resolution = r4     // Catch:{ JSONException -> 0x016e }
        L_0x0199:
            java.lang.String r4 = r7.Key_Duration     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x01a9
            java.lang.String r4 = r7.Key_Duration     // Catch:{ JSONException -> 0x016e }
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x016e }
            r0.duration = r4     // Catch:{ JSONException -> 0x016e }
        L_0x01a9:
            java.lang.String r4 = r7.Key_DateTaken     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x01b9
            java.lang.String r4 = r7.Key_DateTaken     // Catch:{ JSONException -> 0x016e }
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x016e }
            r0.dateTaken = r4     // Catch:{ JSONException -> 0x016e }
        L_0x01b9:
            java.lang.String r4 = r7.Key_Cateogry     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x0077
            java.lang.String r4 = r7.Key_Cateogry     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.cateogry = r4     // Catch:{ JSONException -> 0x016e }
            goto L_0x0077
        L_0x01cb:
            com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse r0 = new com.baidu.pcs.BaiduPCSActionInfo$PCSImageMetaResponse     // Catch:{ JSONException -> 0x016e }
            r0.<init>()     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r7.Key_DateTaken     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x01e0
            java.lang.String r4 = r7.Key_DateTaken     // Catch:{ JSONException -> 0x016e }
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x016e }
            r0.dateTaken = r4     // Catch:{ JSONException -> 0x016e }
        L_0x01e0:
            java.lang.String r4 = r7.Key_Resolution     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x01f0
            java.lang.String r4 = r7.Key_Resolution     // Catch:{ JSONException -> 0x016e }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x016e }
            r0.resolution = r4     // Catch:{ JSONException -> 0x016e }
        L_0x01f0:
            java.lang.String r4 = r7.Key_Latitude     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x0200
            java.lang.String r4 = r7.Key_Latitude     // Catch:{ JSONException -> 0x016e }
            double r4 = r3.getDouble(r4)     // Catch:{ JSONException -> 0x016e }
            r0.latitude = r4     // Catch:{ JSONException -> 0x016e }
        L_0x0200:
            java.lang.String r4 = r7.Key_Longitude     // Catch:{ JSONException -> 0x016e }
            boolean r4 = r3.has(r4)     // Catch:{ JSONException -> 0x016e }
            if (r4 == 0) goto L_0x0077
            java.lang.String r4 = r7.Key_Longitude     // Catch:{ JSONException -> 0x016e }
            double r4 = r3.getDouble(r4)     // Catch:{ JSONException -> 0x016e }
            r0.longtitude = r4     // Catch:{ JSONException -> 0x016e }
            goto L_0x0077
        L_0x0212:
            r2 = r0
            goto L_0x0065
        L_0x0215:
            r0 = r1
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.pcs.BaiduPCSActionBase.parseMetaResponse(org.json.JSONObject):com.baidu.pcs.BaiduPCSActionInfo$PCSMetaResponse");
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSSimplefiedResponse parseSimplefiedResponse(HttpResponse httpResponse) {
        BaiduPCSActionInfo.PCSSimplefiedResponse pCSSimplefiedResponse = new BaiduPCSActionInfo.PCSSimplefiedResponse();
        if (httpResponse == null) {
            return pCSSimplefiedResponse;
        }
        try {
            return parseSimplefiedResponse(EntityUtils.toString(httpResponse.getEntity()));
        } catch (ParseException e) {
            pCSSimplefiedResponse.message = e.getMessage();
            return pCSSimplefiedResponse;
        } catch (IOException e2) {
            pCSSimplefiedResponse.message = e2.getMessage();
            return pCSSimplefiedResponse;
        }
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSSimplefiedResponse parseSimplefiedResponse(String str) {
        BaiduPCSActionInfo.PCSSimplefiedResponse pCSSimplefiedResponse = new BaiduPCSActionInfo.PCSSimplefiedResponse();
        if (str == null || str.length() <= 0) {
            return pCSSimplefiedResponse;
        }
        try {
            return parseSimplefiedResponse(new JSONObject(str));
        } catch (JSONException e) {
            pCSSimplefiedResponse.message = e.getMessage();
            return pCSSimplefiedResponse;
        }
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSSimplefiedResponse parseSimplefiedResponse(JSONObject jSONObject) {
        BaiduPCSActionInfo.PCSSimplefiedResponse pCSSimplefiedResponse = new BaiduPCSActionInfo.PCSSimplefiedResponse();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("error_code")) {
                    pCSSimplefiedResponse.errorCode = jSONObject.getInt("error_code");
                    if (jSONObject.has(Key_ErrorMessage)) {
                        pCSSimplefiedResponse.message = jSONObject.getString(Key_ErrorMessage);
                    }
                } else {
                    pCSSimplefiedResponse.errorCode = 0;
                }
            } catch (JSONException e) {
                pCSSimplefiedResponse.message = e.getMessage();
            }
        }
        return pCSSimplefiedResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSFileFromToResponse parseFileFromToExtraInfo(HttpResponse httpResponse) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        BaiduPCSActionInfo.PCSFileFromToResponse pCSFileFromToResponse = new BaiduPCSActionInfo.PCSFileFromToResponse();
        if (httpResponse != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                if (jSONObject2 != null) {
                    if (jSONObject2.has("error_code")) {
                        pCSFileFromToResponse.status.errorCode = jSONObject2.getInt("error_code");
                        if (jSONObject2.has(Key_ErrorMessage)) {
                            pCSFileFromToResponse.status.message = jSONObject2.getString(Key_ErrorMessage);
                        }
                    } else {
                        pCSFileFromToResponse.status.errorCode = 0;
                    }
                    if (jSONObject2.has(Key_Extra) && (jSONObject = jSONObject2.getJSONObject(Key_Extra)) != null && (jSONArray = jSONObject.getJSONArray(Key_Files_List)) != null && jSONArray.length() > 0) {
                        pCSFileFromToResponse.list = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                            BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = new BaiduPCSActionInfo.PCSFileFromToInfo();
                            if (jSONObject3 != null) {
                                if (jSONObject3.has(Key_From)) {
                                    pCSFileFromToInfo.from = jSONObject3.getString(Key_From);
                                }
                                if (jSONObject3.has(Key_to)) {
                                    pCSFileFromToInfo.f2340to = jSONObject3.getString(Key_to);
                                }
                                pCSFileFromToResponse.list.add(pCSFileFromToInfo);
                            }
                        }
                    }
                }
            } catch (ParseException e) {
                pCSFileFromToResponse.status.message = e.getMessage();
            } catch (JSONException e2) {
                pCSFileFromToResponse.status.message = e2.getMessage();
            } catch (IOException e3) {
                pCSFileFromToResponse.status.message = e3.getMessage();
            }
        }
        return pCSFileFromToResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSListInfoResponse parseListResponse(HttpResponse httpResponse) {
        BaiduPCSActionInfo.PCSListInfoResponse pCSListInfoResponse = new BaiduPCSActionInfo.PCSListInfoResponse();
        if (httpResponse != null) {
            try {
                JSONObject jSONObject = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                if (jSONObject != null) {
                    if (jSONObject.has("error_code")) {
                        pCSListInfoResponse.status.errorCode = jSONObject.getInt("error_code");
                        if (jSONObject.has(Key_ErrorMessage)) {
                            pCSListInfoResponse.status.message = jSONObject.getString(Key_ErrorMessage);
                        }
                    } else {
                        pCSListInfoResponse.status.errorCode = 0;
                        if (jSONObject.has(Key_Files_List)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(Key_Files_List);
                            pCSListInfoResponse.list = new ArrayList();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                pCSListInfoResponse.list.add(parseCommonFileInfoByJSONObject(jSONArray.getJSONObject(i)));
                            }
                        }
                    }
                }
            } catch (ParseException e) {
                pCSListInfoResponse.status.message = e.getMessage();
            } catch (IOException e2) {
                pCSListInfoResponse.status.message = e2.getMessage();
            } catch (JSONException e3) {
                pCSListInfoResponse.status.message = e3.getMessage();
            }
        }
        return pCSListInfoResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse parseCloudDownloadTaskListResponse(HttpResponse httpResponse) {
        BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse pCSCloudDownloadTaskListResponse = new BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse();
        if (httpResponse != null) {
            try {
                JSONObject jSONObject = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                if (jSONObject != null) {
                    if (jSONObject.has("error_code")) {
                        pCSCloudDownloadTaskListResponse.status.errorCode = jSONObject.getInt("error_code");
                        if (jSONObject.has(Key_ErrorMessage)) {
                            pCSCloudDownloadTaskListResponse.status.message = jSONObject.getString(Key_ErrorMessage);
                        }
                    } else {
                        pCSCloudDownloadTaskListResponse.status.errorCode = 0;
                        if (jSONObject.has(Value_Total_Task)) {
                            pCSCloudDownloadTaskListResponse.totalTaskNum = Integer.parseInt(jSONObject.getString(Value_Total_Task));
                        }
                        if (jSONObject.has(Key_Request_Id)) {
                            pCSCloudDownloadTaskListResponse.requestId = jSONObject.getString(Key_Request_Id);
                        }
                        if (pCSCloudDownloadTaskListResponse.totalTaskNum > 0 && jSONObject.has(Key_Task_Info_List)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(Key_Task_Info_List);
                            pCSCloudDownloadTaskListResponse.list = new ArrayList();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                pCSCloudDownloadTaskListResponse.list.add(parseCloudDownloadTaskInfoByJSONObject(jSONArray.getJSONObject(i)));
                            }
                        }
                    }
                }
            } catch (ParseException e) {
                pCSCloudDownloadTaskListResponse.status.message = e.getMessage();
            } catch (IOException e2) {
                pCSCloudDownloadTaskListResponse.status.message = e2.getMessage();
            } catch (JSONException e3) {
                pCSCloudDownloadTaskListResponse.status.message = e3.getMessage();
            }
        }
        return pCSCloudDownloadTaskListResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSCloudDownloadQueryTaskStatusResponse parseCloudDownloadTaskStatusInfoResponse(HttpResponse httpResponse, String[] strArr) {
        BaiduPCSActionInfo.PCSCloudDownloadQueryTaskStatusResponse pCSCloudDownloadQueryTaskStatusResponse = new BaiduPCSActionInfo.PCSCloudDownloadQueryTaskStatusResponse();
        if (httpResponse != null) {
            try {
                JSONObject jSONObject = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                if (jSONObject != null) {
                    if (jSONObject.has("error_code")) {
                        pCSCloudDownloadQueryTaskStatusResponse.status.errorCode = jSONObject.getInt("error_code");
                        if (jSONObject.has(Key_ErrorMessage)) {
                            pCSCloudDownloadQueryTaskStatusResponse.status.message = jSONObject.getString(Key_ErrorMessage);
                        }
                    } else {
                        pCSCloudDownloadQueryTaskStatusResponse.status.errorCode = 0;
                        if (jSONObject.has(Key_Request_Id)) {
                            pCSCloudDownloadQueryTaskStatusResponse.requestId = jSONObject.getString(Key_Request_Id);
                        }
                        if (jSONObject.has(Key_Task_Info_List)) {
                            pCSCloudDownloadQueryTaskStatusResponse.list = new ArrayList();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(Key_Task_Info_List);
                            for (int i = 0; i < strArr.length; i++) {
                                BaiduPCSActionInfo.PCSCloudDownloadTaskInfo parseCloudDownloadTaskInfoByJSONObject = parseCloudDownloadTaskInfoByJSONObject(jSONObject2.getJSONObject(strArr[i]));
                                parseCloudDownloadTaskInfoByJSONObject.taskId = strArr[i];
                                pCSCloudDownloadQueryTaskStatusResponse.list.add(parseCloudDownloadTaskInfoByJSONObject);
                            }
                        }
                    }
                }
            } catch (ParseException e) {
                pCSCloudDownloadQueryTaskStatusResponse.status.message = e.getMessage();
            } catch (IOException e2) {
                pCSCloudDownloadQueryTaskStatusResponse.status.message = e2.getMessage();
            } catch (JSONException e3) {
                pCSCloudDownloadQueryTaskStatusResponse.status.message = e3.getMessage();
            }
        }
        return pCSCloudDownloadQueryTaskStatusResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSCloudDownloadQueryTaskProgressResponse parseCloudDownloadTaskProgressInfoResponse(HttpResponse httpResponse, String[] strArr) {
        BaiduPCSActionInfo.PCSCloudDownloadQueryTaskProgressResponse pCSCloudDownloadQueryTaskProgressResponse = new BaiduPCSActionInfo.PCSCloudDownloadQueryTaskProgressResponse();
        if (httpResponse != null) {
            try {
                JSONObject jSONObject = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                if (jSONObject != null) {
                    if (jSONObject.has("error_code")) {
                        pCSCloudDownloadQueryTaskProgressResponse.status.errorCode = jSONObject.getInt("error_code");
                        if (jSONObject.has(Key_ErrorMessage)) {
                            pCSCloudDownloadQueryTaskProgressResponse.status.message = jSONObject.getString(Key_ErrorMessage);
                        }
                    } else {
                        pCSCloudDownloadQueryTaskProgressResponse.status.errorCode = 0;
                        if (jSONObject.has(Key_Request_Id)) {
                            pCSCloudDownloadQueryTaskProgressResponse.requestId = jSONObject.getString(Key_Request_Id);
                        }
                        if (jSONObject.has(Key_Task_Info_List)) {
                            pCSCloudDownloadQueryTaskProgressResponse.list = new ArrayList();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(Key_Task_Info_List);
                            for (int i = 0; i < strArr.length; i++) {
                                BaiduPCSActionInfo.PCSCloudDownloadTaskProgressInfo parseCloudDownloadTaskProgressInfoByJSONObject = parseCloudDownloadTaskProgressInfoByJSONObject(jSONObject2.getJSONObject(strArr[i]));
                                parseCloudDownloadTaskProgressInfoByJSONObject.taskId = strArr[i];
                                pCSCloudDownloadQueryTaskProgressResponse.list.add(parseCloudDownloadTaskProgressInfoByJSONObject);
                            }
                        }
                    }
                }
            } catch (ParseException e) {
                pCSCloudDownloadQueryTaskProgressResponse.status.message = e.getMessage();
            } catch (IOException e2) {
                pCSCloudDownloadQueryTaskProgressResponse.status.message = e2.getMessage();
            } catch (JSONException e3) {
                pCSCloudDownloadQueryTaskProgressResponse.status.message = e3.getMessage();
            }
        }
        return pCSCloudDownloadQueryTaskProgressResponse;
    }

    /* access modifiers changed from: protected */
    public List<NameValuePair> buildBodyParamsWithList(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                HashMap hashMap = new HashMap();
                hashMap.put(Key_Files_List, jSONArray);
                arrayList.add(new BasicNameValuePair(str, new JSONObject(hashMap).toString()));
                return arrayList;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("path", list.get(i2));
            jSONArray.put(new JSONObject(hashMap2));
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: protected */
    public List<NameValuePair> buildBodyParamsWithFromTo(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                HashMap hashMap = new HashMap();
                hashMap.put(Key_Files_List, jSONArray);
                arrayList.add(new BasicNameValuePair(Key_Param, new JSONObject(hashMap).toString()));
                return arrayList;
            }
            HashMap hashMap2 = new HashMap();
            BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = list.get(i2);
            hashMap2.put(Key_From, pCSFileFromToInfo.from);
            hashMap2.put(Key_to, pCSFileFromToInfo.f2340to);
            jSONArray.put(new JSONObject(hashMap2));
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSThumbnailResponse parseThumbnailResponse(HttpResponse httpResponse) {
        BaiduPCSActionInfo.PCSThumbnailResponse pCSThumbnailResponse = new BaiduPCSActionInfo.PCSThumbnailResponse();
        if (httpResponse != null) {
            try {
                JSONObject jSONObject = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                if (jSONObject != null) {
                    if (jSONObject.has("error_code")) {
                        pCSThumbnailResponse.status.errorCode = jSONObject.getInt("error_code");
                        if (jSONObject.has(Key_ErrorMessage)) {
                            pCSThumbnailResponse.status.message = jSONObject.getString(Key_ErrorMessage);
                        }
                    } else {
                        pCSThumbnailResponse.status.errorCode = 0;
                        pCSThumbnailResponse.status.message = "thumbnail generate ok.";
                    }
                }
            } catch (ParseException e) {
                pCSThumbnailResponse.status.message = e.getMessage();
            } catch (IOException e2) {
                pCSThumbnailResponse.status.message = e2.getMessage();
            } catch (JSONException e3) {
                pCSThumbnailResponse.status.message = e3.getMessage();
            }
        }
        return pCSThumbnailResponse;
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSDiffResponse parseDiffResponse(HttpResponse httpResponse) {
        JSONObject jSONObject;
        String string;
        BaiduPCSActionInfo.PCSDiffResponse pCSDiffResponse = new BaiduPCSActionInfo.PCSDiffResponse();
        if (httpResponse != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(EntityUtils.toString(httpResponse.getEntity()));
                if (jSONObject2 != null) {
                    if (jSONObject2.has("error_code")) {
                        pCSDiffResponse.status.errorCode = jSONObject2.getInt("error_code");
                        if (jSONObject2.has(Key_ErrorMessage)) {
                            pCSDiffResponse.status.message = jSONObject2.getString(Key_ErrorMessage);
                        }
                    } else {
                        pCSDiffResponse.status.errorCode = 0;
                        if (jSONObject2.has(this.Key_HasMore)) {
                            pCSDiffResponse.hasMore = jSONObject2.getBoolean(this.Key_HasMore);
                        }
                        if (jSONObject2.has(this.Key_Reset)) {
                            pCSDiffResponse.isReseted = jSONObject2.getBoolean(this.Key_Reset);
                        }
                        if (jSONObject2.has(this.Key_Cursor) && (string = jSONObject2.getString(this.Key_Cursor)) != null && string.length() > 0) {
                            pCSDiffResponse.cursor = URLDecoder.decode(string, this.Encoding_UTF8);
                        }
                        if (jSONObject2.has(this.Key_Entries) && (jSONObject = jSONObject2.getJSONObject(this.Key_Entries)) != null) {
                            pCSDiffResponse.entries = new ArrayList();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys != null && keys.hasNext()) {
                                String next = keys.next();
                                BaiduPCSActionInfo.PCSDifferEntryInfo pCSDifferEntryInfo = new BaiduPCSActionInfo.PCSDifferEntryInfo();
                                JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                                if (jSONObject3 != null) {
                                    pCSDifferEntryInfo.commonFileInfo = parseCommonFileInfoByJSONObject(jSONObject3);
                                    pCSDifferEntryInfo.commonFileInfo.path = next;
                                    if (jSONObject3.has(this.Key_isDeleted)) {
                                        pCSDifferEntryInfo.isDeleted = jSONObject3.getInt(this.Key_isDeleted) != 0;
                                    }
                                    pCSDiffResponse.entries.add(pCSDifferEntryInfo);
                                }
                            }
                        }
                    }
                }
            } catch (ParseException e) {
                pCSDiffResponse.status.message = e.getMessage();
            } catch (IOException e2) {
                pCSDiffResponse.status.message = e2.getMessage();
            } catch (JSONException e3) {
                pCSDiffResponse.status.message = e3.getMessage();
            }
        }
        return pCSDiffResponse;
    }

    protected static class PCSRawHTTPResponse {
        public String message = null;
        public HttpResponse response = null;

        protected PCSRawHTTPResponse() {
        }
    }
}
