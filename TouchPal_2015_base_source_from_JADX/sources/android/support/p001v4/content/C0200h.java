package android.support.p001v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.h */
/* compiled from: FileProvider */
public class C0200h extends ContentProvider {

    /* renamed from: a */
    private static final String[] f510a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final String f511b = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: c */
    private static final String f512c = "root-path";

    /* renamed from: d */
    private static final String f513d = "files-path";

    /* renamed from: e */
    private static final String f514e = "cache-path";

    /* renamed from: f */
    private static final String f515f = "external-path";

    /* renamed from: g */
    private static final String f516g = "name";

    /* renamed from: h */
    private static final String f517h = "path";

    /* renamed from: i */
    private static final File f518i = new File("/");

    /* renamed from: j */
    private static HashMap<String, C0201a> f519j = new HashMap<>();

    /* renamed from: k */
    private C0201a f520k;

    /* renamed from: android.support.v4.content.h$a */
    /* compiled from: FileProvider */
    interface C0201a {
        /* renamed from: a */
        Uri mo667a(File file);

        /* renamed from: a */
        File mo668a(Uri uri);
    }

    public boolean onCreate() {
        return true;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        } else {
            this.f520k = m832a(context, providerInfo.authority);
        }
    }

    /* renamed from: a */
    public static Uri m831a(Context context, String str, File file) {
        return m832a(context, str).mo667a(file);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = this.f520k.mo668a(uri);
        if (strArr == null) {
            strArr = f510a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str3 = strArr[i2];
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i = i3 + 1;
                objArr[i3] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i = i3 + 1;
                objArr[i3] = Long.valueOf(a.length());
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        String[] a2 = m835a(strArr3, i3);
        Object[] a3 = m834a(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(a2, 1);
        matrixCursor.addRow(a3);
        return matrixCursor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r0.getName().substring(r1 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r4) {
        /*
            r3 = this;
            android.support.v4.content.h$a r0 = r3.f520k
            java.io.File r0 = r0.mo668a((android.net.Uri) r4)
            java.lang.String r1 = r0.getName()
            r2 = 46
            int r1 = r1.lastIndexOf(r2)
            if (r1 < 0) goto L_0x0027
            java.lang.String r0 = r0.getName()
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r1.getMimeTypeFromExtension(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r0
        L_0x0027:
            java.lang.String r0 = "application/octet-stream"
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.content.C0200h.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f520k.mo668a(uri).delete() ? 1 : 0;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f520k.mo668a(uri), m830a(str));
    }

    /* renamed from: a */
    private static C0201a m832a(Context context, String str) {
        C0201a aVar;
        synchronized (f519j) {
            aVar = f519j.get(str);
            if (aVar == null) {
                try {
                    aVar = m836b(context, str);
                    f519j.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    /* renamed from: b */
    private static C0201a m836b(Context context, String str) throws IOException, XmlPullParserException {
        File file;
        C0202b bVar = new C0202b(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), f511b);
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                String attributeValue = loadXmlMetaData.getAttributeValue((String) null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, f517h);
                if (f512c.equals(name)) {
                    file = m833a(f518i, attributeValue2);
                } else if (f513d.equals(name)) {
                    file = m833a(context.getFilesDir(), attributeValue2);
                } else if (f514e.equals(name)) {
                    file = m833a(context.getCacheDir(), attributeValue2);
                } else if (f515f.equals(name)) {
                    file = m833a(Environment.getExternalStorageDirectory(), attributeValue2);
                } else {
                    file = null;
                }
                if (file != null) {
                    bVar.mo669a(attributeValue, file);
                }
            }
        }
    }

    /* renamed from: android.support.v4.content.h$b */
    /* compiled from: FileProvider */
    static class C0202b implements C0201a {

        /* renamed from: a */
        private final String f521a;

        /* renamed from: b */
        private final HashMap<String, File> f522b = new HashMap<>();

        public C0202b(String str) {
            this.f521a = str;
        }

        /* renamed from: a */
        public void mo669a(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f522b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }

        /* renamed from: a */
        public Uri mo667a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f522b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (!canonicalPath.startsWith(path) || (entry != null && path.length() <= ((File) entry.getValue()).getPath().length())) {
                        next = entry;
                    }
                    entry = next;
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme(SearchToLinkActivity.CONTENT).authority(this.f521a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: a */
        public File mo668a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f522b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
    }

    /* renamed from: a */
    private static int m830a(String str) {
        if ("r".equals(str)) {
            return Engine.EXCEPTION_ERROR;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: a */
    private static File m833a(File file, String... strArr) {
        File file2;
        int length = strArr.length;
        int i = 0;
        File file3 = file;
        while (i < length) {
            String str = strArr[i];
            if (str != null) {
                file2 = new File(file3, str);
            } else {
                file2 = file3;
            }
            i++;
            file3 = file2;
        }
        return file3;
    }

    /* renamed from: a */
    private static String[] m835a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: a */
    private static Object[] m834a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }
}
