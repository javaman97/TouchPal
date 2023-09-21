package p018cn.sharesdk.framework.p019a;

import android.content.Context;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.iflytek.speech.VoiceWakeuperAidl;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.mime.MIME;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0662a;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.a.g */
public class C0616g {

    /* renamed from: a */
    public static int f1476a;

    /* renamed from: b */
    public static int f1477b;

    /* renamed from: a */
    private String m3540a(ArrayList<C0613d<String>> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<C0613d<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            C0613d next = it.next();
            String c = C0662a.m3790c(next.f1471a, "utf-8");
            String c2 = next.f1472b != null ? C0662a.m3790c((String) next.f1472b, "utf-8") : "";
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(c).append('=').append(c2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private HttpClient m3541a() {
        KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
        instance.load((InputStream) null, (char[]) null);
        C0618i iVar = new C0618i(instance);
        iVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, Utils.UTF8);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", iVar, 443));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    /* renamed from: a */
    private HttpPost m3542a(String str, ArrayList<C0613d<String>> arrayList) {
        HttpPost httpPost = new HttpPost(str);
        if (arrayList != null) {
            C0620k kVar = new C0620k();
            kVar.mo2216a(m3540a(arrayList));
            InputStreamEntity c = kVar.mo2187c();
            c.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(c);
        }
        return httpPost;
    }

    /* renamed from: a */
    private HttpPost m3543a(String str, ArrayList<C0613d<String>> arrayList, C0613d<String> dVar) {
        HttpPost httpPost = new HttpPost(str);
        String uuid = UUID.randomUUID().toString();
        C0614e eVar = new C0614e();
        C0620k kVar = new C0620k();
        if (arrayList != null) {
            Iterator<C0613d<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                C0613d next = it.next();
                kVar.mo2216a("--").mo2216a(uuid).mo2216a("\r\n");
                kVar.mo2216a("content-disposition: form-data; name=\"").mo2216a(next.f1471a).mo2216a("\"\r\n\r\n");
                kVar.mo2216a((String) next.f1472b).mo2216a("\r\n");
            }
        }
        httpPost.setHeader("Content-Type", "multipart/form-data; boundary=" + uuid);
        kVar.mo2216a("--").mo2216a(uuid).mo2216a("\r\n");
        kVar.mo2216a("Content-Disposition: form-data; name=\"").mo2216a(dVar.f1471a).mo2216a("\"; filename=\"").mo2216a(new File((String) dVar.f1472b).getName()).mo2216a("\"\r\n");
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor((String) dVar.f1472b);
        if (contentTypeFor == null || contentTypeFor.length() <= 0) {
            if (((String) dVar.f1472b).toLowerCase().endsWith("jpg") || ((String) dVar.f1472b).toLowerCase().endsWith("jepg")) {
                contentTypeFor = "image/jpeg";
            } else if (((String) dVar.f1472b).toLowerCase().endsWith("png")) {
                contentTypeFor = "image/png";
            } else if (((String) dVar.f1472b).toLowerCase().endsWith("gif")) {
                contentTypeFor = "image/gif";
            } else {
                FileInputStream fileInputStream = new FileInputStream((String) dVar.f1472b);
                contentTypeFor = URLConnection.guessContentTypeFromStream(fileInputStream);
                fileInputStream.close();
                if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                    contentTypeFor = "application/octet-stream";
                }
            }
        }
        kVar.mo2216a("Content-Type: ").mo2216a(contentTypeFor).mo2216a("\r\n\r\n");
        eVar.mo2189a(kVar);
        C0611b bVar = new C0611b();
        bVar.mo2185a((String) dVar.f1472b);
        eVar.mo2189a(bVar);
        C0620k kVar2 = new C0620k();
        kVar2.mo2216a("\r\n--").mo2216a(uuid).mo2216a("--\r\n");
        eVar.mo2189a(kVar2);
        httpPost.setEntity(eVar.mo2187c());
        return httpPost;
    }

    /* renamed from: a */
    public InputStream mo2197a(String str, ArrayList<C0613d<String>> arrayList, C0612c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        C0666e.m3837b("raw post: " + str, new Object[0]);
        HttpPost httpPost = new HttpPost(str);
        if (arrayList != null) {
            Iterator<C0613d<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                C0613d next = it.next();
                httpPost.setHeader(next.f1471a, (String) next.f1472b);
            }
        }
        httpPost.setEntity(cVar.mo2187c());
        HttpResponse execute = (str.startsWith("https://") ? m3541a() : new DefaultHttpClient()).execute(httpPost);
        if (execute.getStatusLine().getStatusCode() == 200) {
            C0666e.m3837b("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return execute.getEntity().getContent();
        }
        throw new Throwable(EntityUtils.toString(execute.getEntity(), "utf-8"));
    }

    /* renamed from: a */
    public String mo2198a(Context context, String str, String str2, boolean z) {
        int lastIndexOf;
        long currentTimeMillis = System.currentTimeMillis();
        C0666e.m3837b("downloading: " + str, new Object[0]);
        if (z) {
            File file = new File(C0661R.getCachePath(context, str2), C0662a.m3788b(str));
            if (z && file.exists()) {
                C0666e.m3837b("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                return file.getAbsolutePath();
            }
        }
        HttpGet httpGet = new HttpGet(str);
        HttpClient a = str.startsWith("https://") ? m3541a() : new DefaultHttpClient();
        HttpResponse execute = a.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            String str3 = null;
            Header[] headers = execute.getHeaders(MIME.CONTENT_DISPOSITION);
            if (headers != null && headers.length > 0) {
                for (String str4 : headers[0].getValue().split(VoiceWakeuperAidl.PARAMS_SEPARATE)) {
                    if (str4.trim().startsWith("filename")) {
                        str3 = str4.split("=")[1];
                    }
                }
            }
            if (str3 == null) {
                String b = C0662a.m3788b(str);
                Header[] headers2 = execute.getHeaders("Content-Type");
                if (headers2 != null && headers2.length > 0) {
                    String trim = headers2[0].getValue().trim();
                    if (trim.startsWith("image/")) {
                        String substring = trim.substring("image/".length());
                        StringBuilder append = new StringBuilder().append(b).append(C1389aD.f4374j);
                        if ("jpeg".equals(substring)) {
                            substring = "jpg";
                        }
                        str3 = append.append(substring).toString();
                    } else {
                        int lastIndexOf2 = str.lastIndexOf(47);
                        String str5 = null;
                        if (lastIndexOf2 > 0) {
                            str5 = str.substring(lastIndexOf2 + 1);
                        }
                        if (str5 != null && str5.length() > 0 && (lastIndexOf = str5.lastIndexOf(46)) > 0 && str5.length() - lastIndexOf < 10) {
                            str3 = b + str5.substring(lastIndexOf);
                        }
                    }
                }
                str3 = b;
            }
            File file2 = new File(C0661R.getCachePath(context, str2), str3);
            if (!z || !file2.exists()) {
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                if (file2.exists()) {
                    file2.delete();
                }
                try {
                    InputStream content = execute.getEntity().getContent();
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    for (int read = content.read(bArr); read > 0; read = content.read(bArr)) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    content.close();
                    fileOutputStream.close();
                    a.getConnectionManager().shutdown();
                    C0666e.m3837b("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    return file2.getAbsolutePath();
                } catch (Throwable th) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    throw th;
                }
            } else {
                a.getConnectionManager().shutdown();
                C0666e.m3837b("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                return file2.getAbsolutePath();
            }
        } else {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            a.getConnectionManager().shutdown();
            throw new Throwable(entityUtils);
        }
    }

    /* renamed from: a */
    public String mo2199a(String str, ArrayList<C0613d<String>> arrayList, C0613d<String> dVar, ArrayList<C0613d<String>> arrayList2, ArrayList<C0613d<?>> arrayList3) {
        long currentTimeMillis = System.currentTimeMillis();
        C0666e.m3837b("httpPost: " + str, new Object[0]);
        HttpPost a = (dVar == null || dVar.f1472b == null || !new File((String) dVar.f1472b).exists()) ? m3542a(str, arrayList) : m3543a(str, arrayList, dVar);
        if (arrayList2 != null) {
            Iterator<C0613d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C0613d next = it.next();
                a.setHeader(next.f1471a, (String) next.f1472b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f1476a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f1477b);
        a.setParams(basicHttpParams);
        HttpResponse execute = (str.startsWith("https://") ? m3541a() : new DefaultHttpClient()).execute(a);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            C0666e.m3837b("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return entityUtils;
        }
        throw new Throwable(EntityUtils.toString(execute.getEntity(), "utf-8"));
    }

    /* renamed from: a */
    public String mo2200a(String str, ArrayList<C0613d<String>> arrayList, ArrayList<C0613d<String>> arrayList2, ArrayList<C0613d<?>> arrayList3) {
        long currentTimeMillis = System.currentTimeMillis();
        C0666e.m3837b("httpGet: " + str, new Object[0]);
        if (arrayList != null) {
            String a = m3540a(arrayList);
            if (a.length() > 0) {
                str = str + C2261Q.f9807m + a;
            }
        }
        HttpGet httpGet = new HttpGet(str);
        if (arrayList2 != null) {
            Iterator<C0613d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C0613d next = it.next();
                httpGet.setHeader(next.f1471a, (String) next.f1472b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f1476a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f1477b);
        httpGet.setParams(basicHttpParams);
        HttpClient a2 = str.startsWith("https://") ? m3541a() : new DefaultHttpClient();
        HttpResponse execute = a2.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            a2.getConnectionManager().shutdown();
            C0666e.m3837b("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return entityUtils;
        }
        throw new Throwable(EntityUtils.toString(execute.getEntity(), "utf-8"));
    }

    /* renamed from: b */
    public String mo2201b(String str, ArrayList<C0613d<String>> arrayList, C0613d<String> dVar, ArrayList<C0613d<String>> arrayList2, ArrayList<C0613d<?>> arrayList3) {
        long currentTimeMillis = System.currentTimeMillis();
        C0666e.m3837b("httpPut: " + str, new Object[0]);
        if (arrayList != null) {
            String a = m3540a(arrayList);
            if (a.length() > 0) {
                str = str + C2261Q.f9807m + a;
            }
        }
        HttpPut httpPut = new HttpPut(str);
        if (arrayList2 != null) {
            Iterator<C0613d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C0613d next = it.next();
                httpPut.setHeader(next.f1471a, (String) next.f1472b);
            }
        }
        C0611b bVar = new C0611b();
        bVar.mo2185a((String) dVar.f1472b);
        InputStreamEntity c = bVar.mo2187c();
        c.setContentEncoding("application/octet-stream");
        httpPut.setEntity(c);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f1476a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f1477b);
        httpPut.setParams(basicHttpParams);
        HttpResponse execute = (str.startsWith("https://") ? m3541a() : new DefaultHttpClient()).execute(httpPut);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            C0666e.m3837b("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return entityUtils;
        }
        throw new Throwable(EntityUtils.toString(execute.getEntity(), "utf-8"));
    }
}
