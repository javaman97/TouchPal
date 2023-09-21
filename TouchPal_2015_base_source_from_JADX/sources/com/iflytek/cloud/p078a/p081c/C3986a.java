package com.iflytek.cloud.p078a.p081c;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p078a.p080b.C3976a;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p084b.C4002c;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: com.iflytek.cloud.a.c.a */
public class C3986a {

    /* renamed from: a */
    public static Object f16318a = new Object();

    /* renamed from: b */
    private MSCSessionInfo f16319b = new MSCSessionInfo();

    /* renamed from: a */
    public static void m17014a(Context context, String str, String str2, C3976a aVar) throws SpeechError, IOException {
        byte[] bArr;
        byte[] bArr2 = null;
        synchronized (f16318a) {
            String a = C4002c.m17071a(context, aVar);
            if (!TextUtils.isEmpty(str)) {
                bArr = str.getBytes("utf-8");
            } else if (context != null) {
                String a2 = C4002c.m17070a(context);
                bArr = TextUtils.isEmpty(a2) ? null : a2.getBytes(aVar.mo14668n());
            } else {
                bArr = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                bArr2 = str2.getBytes(aVar.mo14668n());
            }
            int QMSPLogin = MSC.QMSPLogin(bArr, bArr2, a.getBytes(aVar.mo14668n()));
            C3990a.m17030a("[MSPLogin]ret:" + QMSPLogin);
            if (QMSPLogin != 0) {
                throw new SpeechError(QMSPLogin);
            }
        }
    }

    /* renamed from: a */
    public static boolean m17015a() {
        boolean z;
        synchronized (f16318a) {
            z = MSC.QMSPLogOut() == 0;
        }
        return z;
    }

    /* renamed from: a */
    public synchronized byte[] mo14693a(Context context, C3976a aVar) throws SpeechError, UnsupportedEncodingException {
        byte[] QMSPDownloadData;
        synchronized (f16318a) {
            String b = C4002c.m17076b(context, aVar);
            C3990a.m17030a("[MSPSession downloadData]enter time:" + System.currentTimeMillis());
            QMSPDownloadData = MSC.QMSPDownloadData(b.getBytes(aVar.mo14668n()), this.f16319b);
            C3990a.m17030a("[MSPSession downloadData]leavel:" + this.f16319b.errorcode + ",data len = " + (QMSPDownloadData == null ? 0 : QMSPDownloadData.length));
            int i = this.f16319b.errorcode;
            if (i != 0 || QMSPDownloadData == null) {
                throw new SpeechError(i);
            }
        }
        return QMSPDownloadData;
    }

    /* renamed from: a */
    public synchronized byte[] mo14694a(Context context, C3976a aVar, String str) throws SpeechError, UnsupportedEncodingException {
        byte[] QMSPSearch;
        synchronized (f16318a) {
            String b = C4002c.m17076b(context, aVar);
            C3990a.m17030a("[MSPSession searchResult]enter time:" + System.currentTimeMillis());
            QMSPSearch = MSC.QMSPSearch(b.getBytes(aVar.mo14668n()), str.getBytes("utf-8"), this.f16319b);
            C3990a.m17030a("[QMSPSearch searchResult]leavel:" + this.f16319b.errorcode + ",data len = " + (QMSPSearch == null ? 0 : QMSPSearch.length));
            int i = this.f16319b.errorcode;
            if (i != 0 || QMSPSearch == null) {
                throw new SpeechError(i);
            }
        }
        return QMSPSearch;
    }

    /* renamed from: a */
    public synchronized byte[] mo14695a(Context context, String str, byte[] bArr, C3976a aVar) throws SpeechError, UnsupportedEncodingException {
        byte[] QMSPUploadData;
        synchronized (f16318a) {
            String b = C4002c.m17076b(context, aVar);
            C3990a.m17030a("[MSPSession uploadData]enter time:" + System.currentTimeMillis());
            QMSPUploadData = MSC.QMSPUploadData(str.getBytes(aVar.mo14668n()), bArr, bArr.length, b.getBytes("utf-8"), this.f16319b);
            C3990a.m17030a("[MSPSession uploaddData]leavel:" + this.f16319b.errorcode + ",data len = " + (QMSPUploadData == null ? 0 : QMSPUploadData.length));
            int i = this.f16319b.errorcode;
            if (i != 0 || QMSPUploadData == null) {
                throw new SpeechError(i);
            }
        }
        return QMSPUploadData;
    }
}
