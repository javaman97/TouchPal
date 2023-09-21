package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class BaiduCloudDownload extends BaiduPCSActionBase {
    private static final String Cancel_Task_Id = "task_id";
    private static final String Key_AppendUrl = "cloud_dl";
    private static final String Query_Task_Id = "task_ids";
    private static final String Query_Task_Type = "op_type";
    private static final String Sever_Path = "save_path";
    private static final String Source_Url = "source_url";
    private static final String Value_Asc = "asc";
    private static final String Value_CallBack = "callback";
    private static final String Value_Limit = "limit";
    private static final String Value_Method_Add = "add_task";
    private static final String Value_Method_Cancel = "cancel_task";
    private static final String Value_Method_List = "list_task";
    private static final String Value_Method_Query = "query_task";
    private static final String Value_NeedTaskInfo = "need_task_info";
    private static final String Value_RateLimit = "rate_limit";
    private static final String Value_Start = "start";
    private static final String Value_TimeOut = "timeout";
    private static final String Version = "v";
    private static final String Version_No = "1";

    public /* bridge */ /* synthetic */ String getAccessToken() {
        return super.getAccessToken();
    }

    public /* bridge */ /* synthetic */ void setAccessToken(String str) {
        super.setAccessToken(str);
    }

    public BaiduPCSActionInfo.PCSCloudDownloadResponse cloudDownload(String str, String str2, long j, long j2, String str3) {
        BaiduPCSActionInfo.PCSCloudDownloadResponse pCSCloudDownloadResponse = new BaiduPCSActionInfo.PCSCloudDownloadResponse();
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return pCSCloudDownloadResponse;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method_Add));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair("source_url", str));
        arrayList.add(new BasicNameValuePair(Sever_Path, str2));
        arrayList.add(new BasicNameValuePair(Version, Version_No));
        if (j > 0) {
            arrayList.add(new BasicNameValuePair(Value_RateLimit, new StringBuilder(String.valueOf(j)).toString()));
        }
        if (j2 > 0) {
            arrayList.add(new BasicNameValuePair("timeout", new StringBuilder(String.valueOf(j2)).toString()));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new BasicNameValuePair("callback", str3));
        }
        return parseCloudDownloadResponseBody(sendHttpRequest(new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/services/cloud_dl?" + buildParams(arrayList))));
    }

    public BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse cloudTaskList(int i, int i2, int i3, boolean z) {
        BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse pCSCloudDownloadTaskListResponse = new BaiduPCSActionInfo.PCSCloudDownloadTaskListResponse();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method_List));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        if (i < 0) {
            i = 0;
        }
        arrayList.add(new BasicNameValuePair(Value_Start, new StringBuilder(String.valueOf(i)).toString()));
        if (i2 <= 0) {
            i2 = 10;
        }
        arrayList.add(new BasicNameValuePair(Value_Limit, new StringBuilder(String.valueOf(i2)).toString()));
        if (i3 == 1) {
            arrayList.add(new BasicNameValuePair(Value_Asc, new StringBuilder(String.valueOf(i3)).toString()));
        }
        if (!z) {
            arrayList.add(new BasicNameValuePair(Value_NeedTaskInfo, "0"));
        }
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/services/cloud_dl?" + buildParams(arrayList)));
        if (sendHttpRequest == null || sendHttpRequest.response == null) {
            return pCSCloudDownloadTaskListResponse;
        }
        pCSCloudDownloadTaskListResponse.status.message = sendHttpRequest.message;
        if (sendHttpRequest.response != null) {
            return parseCloudDownloadTaskListResponse(sendHttpRequest.response);
        }
        return pCSCloudDownloadTaskListResponse;
    }

    public BaiduPCSActionInfo.PCSCloudDownloadQueryTaskStatusResponse queryCloudDownloadTaskStatus(String[] strArr) {
        BaiduPCSActionInfo.PCSCloudDownloadQueryTaskStatusResponse pCSCloudDownloadQueryTaskStatusResponse = new BaiduPCSActionInfo.PCSCloudDownloadQueryTaskStatusResponse();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < strArr.length - 1) {
            stringBuffer.append(strArr[i]);
            stringBuffer.append(",");
            i++;
        }
        stringBuffer.append(strArr[i]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method_Query));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair(Query_Task_Id, stringBuffer.toString()));
        arrayList.add(new BasicNameValuePair(Query_Task_Type, "0"));
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/services/cloud_dl?" + buildParams(arrayList)));
        if (!(sendHttpRequest == null || sendHttpRequest.response == null)) {
            pCSCloudDownloadQueryTaskStatusResponse.status.message = sendHttpRequest.message;
            if (sendHttpRequest.response != null) {
                return parseCloudDownloadTaskStatusInfoResponse(sendHttpRequest.response, strArr);
            }
        }
        return pCSCloudDownloadQueryTaskStatusResponse;
    }

    public BaiduPCSActionInfo.PCSCloudDownloadQueryTaskProgressResponse queryCloudDownloadTaskProgress(String[] strArr) {
        BaiduPCSActionInfo.PCSCloudDownloadQueryTaskProgressResponse pCSCloudDownloadQueryTaskProgressResponse = new BaiduPCSActionInfo.PCSCloudDownloadQueryTaskProgressResponse();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < strArr.length - 1) {
            stringBuffer.append(strArr[i]);
            stringBuffer.append(",");
            i++;
        }
        stringBuffer.append(strArr[i]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method_Query));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair(Query_Task_Id, stringBuffer.toString()));
        arrayList.add(new BasicNameValuePair(Query_Task_Type, Version_No));
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/services/cloud_dl?" + buildParams(arrayList)));
        if (!(sendHttpRequest == null || sendHttpRequest.response == null)) {
            pCSCloudDownloadQueryTaskProgressResponse.status.message = sendHttpRequest.message;
            if (sendHttpRequest.response != null) {
                return parseCloudDownloadTaskProgressInfoResponse(sendHttpRequest.response, strArr);
            }
        }
        return pCSCloudDownloadQueryTaskProgressResponse;
    }

    public BaiduPCSActionInfo.PCSCloudDownloadResponse cancelCloudDownloadTask(String str) {
        new BaiduPCSActionInfo.PCSCloudDownloadResponse();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method_Cancel));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair(Cancel_Task_Id, str));
        return parseCloudDownloadResponseBody(sendHttpRequest(new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/services/cloud_dl?" + buildParams(arrayList))));
    }

    private BaiduPCSActionInfo.PCSCloudDownloadResponse parseCloudDownloadResponseBody(BaiduPCSActionBase.PCSRawHTTPResponse pCSRawHTTPResponse) {
        JSONObject jSONObject;
        BaiduPCSActionInfo.PCSCloudDownloadResponse pCSCloudDownloadResponse = new BaiduPCSActionInfo.PCSCloudDownloadResponse();
        if (!(pCSRawHTTPResponse == null || pCSRawHTTPResponse.response == null)) {
            pCSCloudDownloadResponse.status.message = pCSRawHTTPResponse.message;
            try {
                String entityUtils = EntityUtils.toString(pCSRawHTTPResponse.response.getEntity());
                if (!(entityUtils == null || entityUtils.length() <= 0 || (jSONObject = new JSONObject(entityUtils)) == null)) {
                    pCSCloudDownloadResponse.status = parseSimplefiedResponse(jSONObject);
                    if (pCSCloudDownloadResponse.status.errorCode == 0) {
                        if (jSONObject.has("request_id")) {
                            pCSCloudDownloadResponse.requestId = jSONObject.getString("request_id");
                        }
                        if (jSONObject.has(Cancel_Task_Id)) {
                            pCSCloudDownloadResponse.taskId = jSONObject.getString(Cancel_Task_Id);
                        }
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace();
                pCSCloudDownloadResponse.status.message = e.getMessage();
            } catch (IOException e2) {
                e2.printStackTrace();
                pCSCloudDownloadResponse.status.message = e2.getMessage();
            } catch (JSONException e3) {
                e3.printStackTrace();
                pCSCloudDownloadResponse.status.message = e3.getMessage();
            }
        }
        return pCSCloudDownloadResponse;
    }
}
