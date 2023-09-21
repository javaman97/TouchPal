package p100m.framework.p101a;

import com.cootek.smartinput5.net.cmd.C2261Q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
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
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

/* renamed from: m.framework.a.g */
/* compiled from: NetworkHelper */
public class C4273g {

    /* renamed from: a */
    public static int f17433a;

    /* renamed from: b */
    public static int f17434b;

    /* renamed from: a */
    public String mo15928a(String str, ArrayList<C4270d<String>> arrayList, ArrayList<C4270d<String>> arrayList2) throws Throwable {
        HttpClient defaultHttpClient;
        if (arrayList != null) {
            String a = m17848a(arrayList);
            if (a.length() > 0) {
                str = String.valueOf(str) + C2261Q.f9807m + a;
            }
        }
        HttpGet httpGet = new HttpGet(str);
        if (arrayList2 != null) {
            Iterator<C4270d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C4270d next = it.next();
                httpGet.setHeader(next.f17428a, (String) next.f17429b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f17433a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f17434b);
        httpGet.setParams(basicHttpParams);
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            defaultHttpClient.getConnectionManager().shutdown();
            return entityUtils;
        }
        String entityUtils2 = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils2);
    }

    /* renamed from: a */
    public void mo15931a(String str, ArrayList<C4270d<String>> arrayList, ArrayList<C4270d<String>> arrayList2, C4274h hVar) throws Throwable {
        HttpClient defaultHttpClient;
        if (arrayList != null) {
            String a = m17848a(arrayList);
            if (a.length() > 0) {
                str = String.valueOf(str) + C2261Q.f9807m + a;
            }
        }
        HttpGet httpGet = new HttpGet(str);
        if (arrayList2 != null) {
            Iterator<C4270d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C4270d next = it.next();
                httpGet.setHeader(next.f17428a, (String) next.f17429b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f17433a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f17434b);
        httpGet.setParams(basicHttpParams);
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.mo15936a(content);
            }
            content.close();
            defaultHttpClient.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    /* renamed from: a */
    public void mo15930a(String str, File file) throws Throwable {
        HttpClient defaultHttpClient;
        HttpGet httpGet = new HttpGet(str);
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            for (int read = content.read(bArr); read > 0; read = content.read(bArr)) {
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            content.close();
            fileOutputStream.close();
            defaultHttpClient.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    /* renamed from: a */
    public void mo15934a(String str, C4274h hVar) throws Throwable {
        HttpClient defaultHttpClient;
        HttpGet httpGet = new HttpGet(str);
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.mo15936a(content);
            }
            content.close();
            defaultHttpClient.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    /* renamed from: a */
    public String mo15929a(String str, ArrayList<C4270d<String>> arrayList, C4270d<String> dVar, ArrayList<C4270d<String>> arrayList2) throws Throwable {
        HttpPost a;
        HttpClient defaultHttpClient;
        if (dVar == null || dVar.f17429b == null || !new File((String) dVar.f17429b).exists()) {
            a = m17850a(str, arrayList);
        } else {
            a = m17851a(str, arrayList, dVar);
        }
        if (arrayList2 != null) {
            Iterator<C4270d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C4270d next = it.next();
                a.setHeader(next.f17428a, (String) next.f17429b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f17433a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f17434b);
        a.setParams(basicHttpParams);
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(a);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            defaultHttpClient.getConnectionManager().shutdown();
            return entityUtils;
        }
        String entityUtils2 = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils2);
    }

    /* renamed from: a */
    public void mo15933a(String str, ArrayList<C4270d<String>> arrayList, C4270d<String> dVar, ArrayList<C4270d<String>> arrayList2, C4274h hVar) throws Throwable {
        HttpPost a;
        HttpClient defaultHttpClient;
        if (dVar == null || dVar.f17429b == null || !new File((String) dVar.f17429b).exists()) {
            a = m17850a(str, arrayList);
        } else {
            a = m17851a(str, arrayList, dVar);
        }
        if (arrayList2 != null) {
            Iterator<C4270d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C4270d next = it.next();
                a.setHeader(next.f17428a, (String) next.f17429b);
            }
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f17433a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f17434b);
        a.setParams(basicHttpParams);
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(a);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.mo15936a(content);
            }
            content.close();
            defaultHttpClient.getConnectionManager().shutdown();
            return;
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    /* renamed from: a */
    private HttpPost m17851a(String str, ArrayList<C4270d<String>> arrayList, C4270d<String> dVar) throws Throwable {
        HttpPost httpPost = new HttpPost(str);
        String uuid = UUID.randomUUID().toString();
        C4271e eVar = new C4271e();
        C4277k kVar = new C4277k();
        if (arrayList != null) {
            Iterator<C4270d<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                C4270d next = it.next();
                kVar.mo15942a("--").mo15942a(uuid).mo15942a("\r\n");
                kVar.mo15942a("content-disposition: form-data; name=\"").mo15942a(next.f17428a).mo15942a("\"\r\n\r\n");
                kVar.mo15942a((String) next.f17429b).mo15942a("\r\n");
            }
        }
        httpPost.setHeader("Content-Type", "multipart/form-data; boundary=" + uuid);
        kVar.mo15942a("--").mo15942a(uuid).mo15942a("\r\n");
        kVar.mo15942a("Content-Disposition: form-data; name=\"").mo15942a(dVar.f17428a).mo15942a("\"; filename=\"").mo15942a(new File((String) dVar.f17429b).getName()).mo15942a("\"\r\n");
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor((String) dVar.f17429b);
        if (contentTypeFor == null || contentTypeFor.length() <= 0) {
            if (((String) dVar.f17429b).toLowerCase().endsWith("jpg") || ((String) dVar.f17429b).toLowerCase().endsWith("jepg")) {
                contentTypeFor = "image/jpeg";
            } else if (((String) dVar.f17429b).toLowerCase().endsWith("png")) {
                contentTypeFor = "image/png";
            } else if (((String) dVar.f17429b).toLowerCase().endsWith("gif")) {
                contentTypeFor = "image/gif";
            } else {
                FileInputStream fileInputStream = new FileInputStream((String) dVar.f17429b);
                contentTypeFor = URLConnection.guessContentTypeFromStream(fileInputStream);
                fileInputStream.close();
                if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                    contentTypeFor = "application/octet-stream";
                }
            }
        }
        kVar.mo15942a("Content-Type: ").mo15942a(contentTypeFor).mo15942a("\r\n\r\n");
        eVar.mo15920a(kVar);
        C4268b bVar = new C4268b();
        bVar.mo15916a((String) dVar.f17429b);
        eVar.mo15920a(bVar);
        C4277k kVar2 = new C4277k();
        kVar2.mo15942a("\r\n--").mo15942a(uuid).mo15942a("--\r\n");
        eVar.mo15920a(kVar2);
        httpPost.setEntity(eVar.mo15918c());
        return httpPost;
    }

    /* renamed from: a */
    private HttpPost m17850a(String str, ArrayList<C4270d<String>> arrayList) throws Throwable {
        HttpPost httpPost = new HttpPost(str);
        if (arrayList != null) {
            C4277k kVar = new C4277k();
            kVar.mo15942a(m17848a(arrayList));
            InputStreamEntity c = kVar.mo15918c();
            c.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(c);
        }
        return httpPost;
    }

    /* renamed from: a */
    public void mo15932a(String str, ArrayList<C4270d<String>> arrayList, C4269c cVar, C4274h hVar) throws Throwable {
        HttpClient defaultHttpClient;
        HttpPost httpPost = new HttpPost(str);
        if (arrayList != null) {
            Iterator<C4270d<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                C4270d next = it.next();
                httpPost.setHeader(next.f17428a, (String) next.f17429b);
            }
        }
        httpPost.setEntity(cVar.mo15918c());
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(httpPost);
        if (execute.getStatusLine().getStatusCode() == 200) {
            InputStream content = execute.getEntity().getContent();
            if (hVar != null) {
                hVar.mo15936a(content);
            }
            content.close();
            defaultHttpClient.getConnectionManager().shutdown();
        }
        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils);
    }

    /* renamed from: b */
    public String mo15935b(String str, ArrayList<C4270d<String>> arrayList, C4270d<String> dVar, ArrayList<C4270d<String>> arrayList2) throws Throwable {
        HttpClient defaultHttpClient;
        if (arrayList != null) {
            String a = m17848a(arrayList);
            if (a.length() > 0) {
                str = String.valueOf(str) + C2261Q.f9807m + a;
            }
        }
        HttpPut httpPut = new HttpPut(str);
        if (arrayList2 != null) {
            Iterator<C4270d<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                C4270d next = it.next();
                httpPut.setHeader(next.f17428a, (String) next.f17429b);
            }
        }
        C4268b bVar = new C4268b();
        bVar.mo15916a((String) dVar.f17429b);
        InputStreamEntity c = bVar.mo15918c();
        c.setContentEncoding("application/octet-stream");
        httpPut.setEntity(c);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, f17433a);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f17434b);
        httpPut.setParams(basicHttpParams);
        if (str.startsWith("https://")) {
            defaultHttpClient = m17849a();
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpResponse execute = defaultHttpClient.execute(httpPut);
        int statusCode = execute.getStatusLine().getStatusCode();
        if (statusCode == 200 || statusCode == 201) {
            String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
            defaultHttpClient.getConnectionManager().shutdown();
            return entityUtils;
        }
        String entityUtils2 = EntityUtils.toString(execute.getEntity(), "utf-8");
        defaultHttpClient.getConnectionManager().shutdown();
        throw new Throwable(entityUtils2);
    }

    /* renamed from: a */
    private String m17848a(ArrayList<C4270d<String>> arrayList) throws Throwable {
        StringBuilder sb = new StringBuilder();
        Iterator<C4270d<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            C4270d next = it.next();
            String encode = URLEncoder.encode(next.f17428a, "utf-8");
            String encode2 = next.f17429b != null ? URLEncoder.encode((String) next.f17429b, "utf-8") : "";
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(encode).append('=').append(encode2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private HttpClient m17849a() throws Throwable {
        KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
        instance.load((InputStream) null, (char[]) null);
        C4275i iVar = new C4275i(instance);
        iVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, Utils.UTF8);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", iVar, 443));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }
}
