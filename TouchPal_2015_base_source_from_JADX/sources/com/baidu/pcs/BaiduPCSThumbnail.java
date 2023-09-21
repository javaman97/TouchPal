package com.baidu.pcs;

import android.graphics.BitmapFactory;
import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSThumbnail extends BaiduPCSActionBase {
    private static final int BestQuality = 100;
    private static final String Key_C = "c";
    private static final String Key_Quality = "quality";
    private static final String Key_Size = "size";
    private static final String Key_U = "_u";
    private static final int MaxHeight = 580;
    private static final int MaxWidth = 850;
    private static final String Value_Method = "generate";

    BaiduPCSThumbnail() {
    }

    public BaiduPCSActionInfo.PCSThumbnailResponse thumbnail(String str, int i, int i2, int i3) {
        int i4;
        int i5 = 100;
        BaiduPCSActionInfo.PCSThumbnailResponse pCSThumbnailResponse = new BaiduPCSActionInfo.PCSThumbnailResponse();
        if (str != null && str.length() > 0 && i2 > 0 && i3 > 0) {
            if (i < 0) {
                i4 = 1;
            } else {
                i4 = i;
            }
            if (i4 <= 100) {
                i5 = i4;
            }
            if (i2 > MaxWidth) {
                i2 = MaxWidth;
            }
            if (i3 > MaxHeight) {
                i3 = MaxHeight;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("method", Value_Method));
            arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
            arrayList.add(new BasicNameValuePair("path", str));
            arrayList.add(new BasicNameValuePair(Key_Quality, String.valueOf(i5)));
            arrayList.add(new BasicNameValuePair(Key_Size, Key_C + i2 + Key_U + i3));
            BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpGet("https://pcs.baidu.com/rest/2.0/pcs/thumbnail?" + buildParams(arrayList)));
            if (!(sendHttpRequest == null || sendHttpRequest.response == null)) {
                if (200 == sendHttpRequest.response.getStatusLine().getStatusCode()) {
                    try {
                        InputStream content = sendHttpRequest.response.getEntity().getContent();
                        if (content != null) {
                            pCSThumbnailResponse.status.errorCode = 0;
                            pCSThumbnailResponse.bitmap = BitmapFactory.decodeStream(content);
                        }
                    } catch (IllegalStateException e) {
                        pCSThumbnailResponse.status.message = e.getMessage();
                    } catch (IOException e2) {
                        pCSThumbnailResponse.status.message = e2.getMessage();
                    }
                } else {
                    BaiduPCSActionInfo.PCSSimplefiedResponse parseSimplefiedResponse = super.parseSimplefiedResponse(sendHttpRequest.response);
                    pCSThumbnailResponse.status.errorCode = parseSimplefiedResponse.errorCode;
                    pCSThumbnailResponse.status.message = parseSimplefiedResponse.message;
                }
            }
        }
        return pCSThumbnailResponse;
    }
}
