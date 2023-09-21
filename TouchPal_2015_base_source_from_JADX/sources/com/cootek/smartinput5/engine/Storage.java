package com.cootek.smartinput5.engine;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.asset.C1444a;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.p052b.C1498a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class Storage {
    private static final int OPEN_CREATE = 4;
    private static final int OPEN_READ = 1;
    private static final int OPEN_WRITE = 2;
    public static final String STORAGE_FILENAME_ID_SEPERATOR = ":";
    public static final String STORAGE_PACKAGE_FILENAME_SEPERATOR = "_";
    private static final String TAG = "Storage";
    private static final String VERSION = "version";
    /* access modifiers changed from: private */
    public final String DEFAULT_PACKAGE_NAME;
    private String fileFolder;
    private Hashtable<String, RandomAccessFile> fileTable;
    private String langFolder;
    private Hashtable<String, C1444a> mAssetsFileTable;
    private Context mContext;
    private String skinFolder;

    class FileParseInfo {
        public String fileName;
        public String info;
        public C1443as pkg;
        public String pkgName;
        public String regularFilename;
        private String tag;

        public FileParseInfo() {
        }

        public void reset() {
            this.info = null;
            this.fileName = null;
            this.pkgName = null;
            this.regularFilename = null;
            this.pkg = null;
            this.tag = null;
        }

        public boolean isLoaded(String str) {
            return this.tag == str;
        }

        public void load(String str) {
            String wrapPackageName;
            reset();
            this.tag = str;
            if (str.endsWith(".lua")) {
                str = str + ".png";
            }
            this.info = str;
            String str2 = null;
            if (C1368X.m6320c().mo5842o().mo5958n(str)) {
                String s = C1368X.m6320c().mo5842o().mo5967s(str);
                str = str + ".lng.png";
                str2 = s;
            } else {
                int indexOf = str.indexOf(":");
                if (indexOf != -1) {
                    str2 = str.substring(0, indexOf);
                    str = str.substring(indexOf + 1, str.length());
                }
            }
            if (Storage.this.switchToDefaultPackageFile(str2, str)) {
                wrapPackageName = Storage.this.DEFAULT_PACKAGE_NAME;
            } else {
                wrapPackageName = PackageNameWrapper.wrapPackageName(str2);
            }
            this.pkgName = wrapPackageName;
            this.fileName = str;
            this.regularFilename = TextUtils.isEmpty(wrapPackageName) ? this.fileName : wrapPackageName + ":" + this.fileName;
            this.pkg = C1811k.m8322a().mo6824c(wrapPackageName);
        }
    }

    public Storage(Context context) {
        this.mContext = context;
        this.DEFAULT_PACKAGE_NAME = context.getPackageName();
        File a = C1466av.m6848a(context);
        if (a != null) {
            this.fileFolder = a.getAbsolutePath();
            this.skinFolder = this.fileFolder + File.separator + "skin";
            File file = new File(this.skinFolder);
            if (!file.exists()) {
                file.mkdir();
            }
            this.langFolder = this.fileFolder + File.separator + "language";
            File file2 = new File(this.langFolder);
            if (!file2.exists()) {
                file2.mkdir();
            }
            this.fileTable = new Hashtable<>();
            this.mAssetsFileTable = new Hashtable<>();
        }
    }

    public static void deleteFile(String str) {
        File file = new File(str);
        if (file != null && file.exists()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2 != null) {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    public boolean switchToDefaultPackageFile(String str, String str2) {
        boolean z;
        if (str == null || this.DEFAULT_PACKAGE_NAME.equals(str)) {
            return false;
        }
        try {
            InputStream a = C1460o.m6799b().mo6099a(C1368X.m6313b(), str2);
            if (a != null) {
                z = true;
                a.close();
            } else {
                z = false;
            }
            return z;
        } catch (IOException e) {
            return false;
        }
    }

    private static void doDeleteExpiredRomAndRam(Context context, String str, String str2, boolean z) {
        String langDataVersion = getLangDataVersion(context, new File(str, C1389aD.f4372h));
        if (z || !TextUtils.equals(langDataVersion, str2)) {
            deleteFile(str);
        }
    }

    public static String getLangDataVersion(Context context, File file) {
        FileInputStream fileInputStream;
        String str = null;
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                fileInputStream = null;
            }
            if (fileInputStream != null) {
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    str = new JSONObject(new String(bArr)).getString(VERSION);
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                    }
                } catch (IOException e3) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                    }
                } catch (JSONException e5) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e6) {
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e7) {
                    }
                    throw th;
                }
            }
        }
        return str;
    }

    private static String getLanguageDataRootDirectory() {
        File a = C1466av.m6848a(C1368X.m6313b());
        if (a == null) {
            return null;
        }
        return a.getAbsolutePath() + File.separator + C1389aD.f4371g + File.separator;
    }

    public static void deleteExpiredFiles(Context context, String str, String str2, boolean z) {
        String languageDataRootDirectory = getLanguageDataRootDirectory();
        if (languageDataRootDirectory != null) {
            doDeleteExpiredRomAndRam(context, languageDataRootDirectory + str, str2, z);
        }
    }

    private String getFilePathWithVersionControl(String str, String str2) {
        String languageDataRootDirectory = getLanguageDataRootDirectory();
        C1498a m = C1368X.m6320c().mo5842o().mo5956m(str);
        if (m == null) {
            return languageDataRootDirectory;
        }
        if (m.mo6155e()) {
            return languageDataRootDirectory + m.f4729h + File.separator + str2;
        }
        return languageDataRootDirectory + str2;
    }

    private static String getVersionByPath(String str) {
        String[] split = str.split(File.separator);
        String str2 = "";
        if (split != null && split.length > 1) {
            str2 = split[split.length - 1];
        }
        C1498a A = C1368X.m6320c().mo5842o().mo5910A(str2);
        if (A != null) {
            return A.mo6159i();
        }
        return "";
    }

    private static String buildVersionContent(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(VERSION, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static void createVersionFile(File file) {
        createVersionFile(file, getVersionByPath(file.getAbsolutePath()));
    }

    public static void createVersionFile(File file, String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(file.getAbsolutePath() + File.separator + C1389aD.f4372h), false);
            fileWriter.write(buildVersionContent(str));
            fileWriter.flush();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public FileInfo openFile(String str, int i) {
        FileParseInfo fileParseInfo = new FileParseInfo();
        fileParseInfo.load(str);
        try {
            return openFile(fileParseInfo, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean needVersionControl(String str, String str2) {
        if (str != null && str.contains(":")) {
            return true;
        }
        if (!str.contains(File.separator) || !TextUtils.equals(C1811k.m8322a().mo6824c((String) null).getPackageName(), str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x0255 A[Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.smartinput5.engine.FileInfo openFile(com.cootek.smartinput5.engine.Storage.FileParseInfo r11, int r12) {
        /*
            r10 = this;
            r1 = 0
            java.lang.String r3 = r11.fileName
            java.lang.String r4 = r11.regularFilename
            com.cootek.smartinput5.func.as r2 = r11.pkg
            if (r4 == 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            boolean r0 = r2.mo6024c()
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r0 = r1
        L_0x0012:
            return r0
        L_0x0013:
            java.lang.String r0 = r11.pkgName
            if (r0 == 0) goto L_0x002f
            com.cootek.smartinput5.func.X r0 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.aD r0 = r0.mo5842o()
            java.lang.String r5 = r11.pkgName
            com.cootek.smartinput5.func.b.a r0 = r0.mo5956m(r5)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.mo6156f()
            if (r0 != 0) goto L_0x002f
            r0 = r1
            goto L_0x0012
        L_0x002f:
            r0 = r12 & 4
            r5 = 4
            if (r0 != r5) goto L_0x005b
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r10.fileFolder
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = java.io.File.separator
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L_0x005b
            r0.createNewFile()     // Catch:{ IOException -> 0x00f1 }
        L_0x005b:
            r0 = 1
            if (r12 != r0) goto L_0x01f1
            java.lang.String r0 = ":"
            java.lang.String r5 = java.io.File.separator
            java.lang.String r0 = r4.replace(r0, r5)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r10.skinFolder
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = java.io.File.separator
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x00aa
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            java.lang.String r0 = "rw"
            r6.<init>(r5, r0)     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            java.util.Hashtable<java.lang.String, java.io.RandomAccessFile> r0 = r10.fileTable     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            r0.put(r4, r6)     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            com.cootek.smartinput5.engine.FileInfo r0 = new com.cootek.smartinput5.engine.FileInfo     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            java.io.FileDescriptor r7 = r6.getFD()     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            long r8 = r6.length()     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            r0.<init>(r7, r8, r5)     // Catch:{ FileNotFoundException -> 0x00a9, IOException -> 0x00f7 }
            goto L_0x0012
        L_0x00a9:
            r0 = move-exception
        L_0x00aa:
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r10.fileFolder
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r6 = java.io.File.separator
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0101
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            java.lang.String r0 = "rw"
            r2.<init>(r5, r0)     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            java.util.Hashtable<java.lang.String, java.io.RandomAccessFile> r0 = r10.fileTable     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            r0.put(r4, r2)     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            com.cootek.smartinput5.engine.FileInfo r0 = new com.cootek.smartinput5.engine.FileInfo     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            java.io.FileDescriptor r3 = r2.getFD()     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            long r6 = r2.length()     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            java.lang.String r2 = r5.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            r0.<init>(r3, r6, r2)     // Catch:{ FileNotFoundException -> 0x00ed, IOException -> 0x00fc }
            goto L_0x0012
        L_0x00ed:
            r0 = move-exception
        L_0x00ee:
            r0 = r1
            goto L_0x0012
        L_0x00f1:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x005b
        L_0x00f7:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00aa
        L_0x00fc:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00ee
        L_0x0101:
            java.lang.String r0 = ".tpb"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x017e
            com.cootek.smartinput5.func.X r0 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.p r0 = r0.mo5847t()
            boolean r0 = r0.mo7078c()
            if (r0 != 0) goto L_0x017e
            java.lang.String r0 = "bigram"
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r0)
        L_0x011d:
            if (r0 == 0) goto L_0x014a
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r3)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x014a
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            java.lang.String r0 = "rw"
            r6.<init>(r5, r0)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            java.util.Hashtable<java.lang.String, java.io.RandomAccessFile> r0 = r10.fileTable     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            r0.put(r4, r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            com.cootek.smartinput5.engine.FileInfo r0 = new com.cootek.smartinput5.engine.FileInfo     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            java.io.FileDescriptor r7 = r6.getFD()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            long r8 = r6.length()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            r0.<init>(r7, r8, r5)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x01ca }
            goto L_0x0012
        L_0x0149:
            r0 = move-exception
        L_0x014a:
            java.lang.String r0 = ".tpc"
            boolean r0 = r3.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            if (r0 != 0) goto L_0x015a
            java.lang.String r0 = ".tpb"
            boolean r0 = r3.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            if (r0 == 0) goto L_0x02a1
        L_0x015a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            java.lang.String r3 = ".png"
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            java.lang.String r0 = r0.toString()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
        L_0x016d:
            com.cootek.smartinput5.func.asset.o r3 = com.cootek.smartinput5.func.asset.C1460o.m6799b()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            android.content.Context r5 = com.cootek.smartinput5.func.C1368X.m6313b()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            com.cootek.smartinput5.func.asset.a r0 = r3.mo6100b(r5, r2, r0)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            if (r0 != 0) goto L_0x01d0
            r0 = r1
            goto L_0x0012
        L_0x017e:
            java.lang.String r0 = ".imy"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = "curve"
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r0)
            goto L_0x011d
        L_0x018d:
            java.lang.String r0 = ".sdd"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = "superdict"
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r0)
            goto L_0x011d
        L_0x019c:
            java.lang.String r0 = ".hwd"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = "handwrite_checked"
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r0)
            goto L_0x011d
        L_0x01ac:
            java.lang.String r0 = ".bak"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x01ba
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6239b()
            goto L_0x011d
        L_0x01ba:
            java.lang.String r0 = ".as3"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x02a4
            java.lang.String r0 = ".sync"
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r0)
            goto L_0x011d
        L_0x01ca:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x014a
        L_0x01d0:
            java.util.Hashtable<java.lang.String, com.cootek.smartinput5.func.asset.a> r2 = r10.mAssetsFileTable     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            r2.put(r4, r0)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            java.io.FileDescriptor r2 = r0.mo6095b()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            long r4 = r0.mo6094a()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            java.lang.String r3 = r0.mo6097d()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            com.cootek.smartinput5.engine.FileInfo r0 = new com.cootek.smartinput5.engine.FileInfo     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            r0.<init>(r2, r4, r3)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01eb }
            goto L_0x0012
        L_0x01e8:
            r0 = move-exception
            goto L_0x00ee
        L_0x01eb:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00ee
        L_0x01f1:
            r0 = r12 & 2
            r5 = 2
            if (r0 != r5) goto L_0x00ee
            java.lang.String r0 = ":"
            java.lang.String r5 = java.io.File.separator
            java.lang.String r5 = r4.replace(r0, r5)
            java.lang.String r0 = r2.getPackageName()
            boolean r6 = r10.needVersionControl(r4, r0)
            if (r6 != 0) goto L_0x027a
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r10.fileFolder
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = java.io.File.separator
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
        L_0x0226:
            boolean r5 = r0.exists()
            if (r5 != 0) goto L_0x022f
            r10.copyWriteableFile(r2, r3, r0, r6)
        L_0x022f:
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x029d
            java.lang.String r2 = r0.getName()
            java.lang.String r5 = ".hwd"
            boolean r2 = r2.endsWith(r5)
            if (r2 == 0) goto L_0x0288
            java.lang.String r2 = "handwrite_checked"
            java.io.File r2 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r2)
        L_0x0247:
            if (r2 == 0) goto L_0x029d
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            r2 = r0
        L_0x024f:
            boolean r0 = r2.exists()     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            if (r0 == 0) goto L_0x00ee
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            java.lang.String r0 = "rw"
            r3.<init>(r2, r0)     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            java.util.Hashtable<java.lang.String, java.io.RandomAccessFile> r0 = r10.fileTable     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            r0.put(r4, r3)     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            com.cootek.smartinput5.engine.FileInfo r0 = new com.cootek.smartinput5.engine.FileInfo     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            java.io.FileDescriptor r4 = r3.getFD()     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            long r6 = r3.length()     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            r0.<init>(r4, r6, r2)     // Catch:{ FileNotFoundException -> 0x0274, IOException -> 0x0297 }
            goto L_0x0012
        L_0x0274:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00ee
        L_0x027a:
            java.io.File r0 = new java.io.File
            java.lang.String r5 = r2.getPackageName()
            java.lang.String r5 = r10.getFilePathWithVersionControl(r5, r3)
            r0.<init>(r5)
            goto L_0x0226
        L_0x0288:
            java.lang.String r2 = ".as3"
            boolean r2 = r3.endsWith(r2)
            if (r2 == 0) goto L_0x029f
            java.lang.String r2 = ".sync"
            java.io.File r2 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r2)
            goto L_0x0247
        L_0x0297:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00ee
        L_0x029d:
            r2 = r0
            goto L_0x024f
        L_0x029f:
            r2 = r1
            goto L_0x0247
        L_0x02a1:
            r0 = r3
            goto L_0x016d
        L_0x02a4:
            r0 = r1
            goto L_0x011d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.engine.Storage.openFile(com.cootek.smartinput5.engine.Storage$FileParseInfo, int):com.cootek.smartinput5.engine.FileInfo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC, Splitter:B:24:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043 A[SYNTHETIC, Splitter:B:27:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004d A[SYNTHETIC, Splitter:B:33:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0052 A[SYNTHETIC, Splitter:B:36:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void copyWriteableFile(com.cootek.smartinput5.func.C1443as r5, java.lang.String r6, java.io.File r7, boolean r8) {
        /*
            r4 = this;
            r1 = 0
            com.cootek.smartinput5.func.asset.o r0 = com.cootek.smartinput5.func.asset.C1460o.m6799b()     // Catch:{ IOException -> 0x0034, all -> 0x0049 }
            android.content.Context r2 = com.cootek.smartinput5.func.C1368X.m6313b()     // Catch:{ IOException -> 0x0034, all -> 0x0049 }
            java.io.InputStream r3 = r0.mo6098a(r2, r5, r6)     // Catch:{ IOException -> 0x0034, all -> 0x0049 }
            if (r3 == 0) goto L_0x006f
            java.io.File r0 = r7.getParentFile()     // Catch:{ IOException -> 0x0068, all -> 0x0060 }
            boolean r2 = r0.exists()     // Catch:{ IOException -> 0x0068, all -> 0x0060 }
            if (r2 != 0) goto L_0x0021
            r0.mkdirs()     // Catch:{ IOException -> 0x0068, all -> 0x0060 }
            if (r8 == 0) goto L_0x0021
            createVersionFile(r0)     // Catch:{ IOException -> 0x0068, all -> 0x0060 }
        L_0x0021:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0068, all -> 0x0060 }
            r2.<init>(r7)     // Catch:{ IOException -> 0x0068, all -> 0x0060 }
            com.cootek.smartinput.utilities.C0997e.m5178a((java.io.InputStream) r3, (java.io.OutputStream) r2)     // Catch:{ IOException -> 0x006b, all -> 0x0062 }
        L_0x0029:
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ IOException -> 0x0056 }
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0033:
            return
        L_0x0034:
            r0 = move-exception
            r2 = r1
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x0065 }
            r7.delete()     // Catch:{ all -> 0x0065 }
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ IOException -> 0x005a }
        L_0x0041:
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x0033
        L_0x0047:
            r0 = move-exception
            goto L_0x0033
        L_0x0049:
            r0 = move-exception
            r3 = r1
        L_0x004b:
            if (r3 == 0) goto L_0x0050
            r3.close()     // Catch:{ IOException -> 0x005c }
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x005e }
        L_0x0055:
            throw r0
        L_0x0056:
            r0 = move-exception
            goto L_0x002e
        L_0x0058:
            r0 = move-exception
            goto L_0x0033
        L_0x005a:
            r0 = move-exception
            goto L_0x0041
        L_0x005c:
            r2 = move-exception
            goto L_0x0050
        L_0x005e:
            r1 = move-exception
            goto L_0x0055
        L_0x0060:
            r0 = move-exception
            goto L_0x004b
        L_0x0062:
            r0 = move-exception
            r1 = r2
            goto L_0x004b
        L_0x0065:
            r0 = move-exception
            r3 = r2
            goto L_0x004b
        L_0x0068:
            r0 = move-exception
            r2 = r3
            goto L_0x0036
        L_0x006b:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0036
        L_0x006f:
            r2 = r1
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.engine.Storage.copyWriteableFile(com.cootek.smartinput5.func.as, java.lang.String, java.io.File, boolean):void");
    }

    public void fileOpened(String str) {
        FileParseInfo fileParseInfo = new FileParseInfo();
        fileParseInfo.load(str);
        fileOpened(fileParseInfo);
    }

    private void fileOpened(FileParseInfo fileParseInfo) {
        C1444a remove;
        String str = fileParseInfo.regularFilename;
        if (str != null) {
            if (this.fileTable.containsKey(str)) {
                try {
                    this.fileTable.remove(str).close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (this.mAssetsFileTable.containsKey(str) && (remove = this.mAssetsFileTable.remove(str)) != null) {
                try {
                    remove.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public InputStream[] loadFile(String str) {
        FileParseInfo fileParseInfo = new FileParseInfo();
        fileParseInfo.load(str);
        try {
            return loadFile(fileParseInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private int getFileCount(String str) {
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        matcher.find();
        try {
            return Integer.parseInt(matcher.group());
        } catch (IllegalStateException e) {
            return 0;
        }
    }

    private InputStream[] loadFile(FileParseInfo fileParseInfo) {
        String replace;
        String str;
        InputStream[] inputStreamArr;
        String str2 = fileParseInfo.fileName;
        String str3 = fileParseInfo.regularFilename;
        C1443as asVar = fileParseInfo.pkg;
        if (asVar == null || !asVar.mo6024c()) {
            return null;
        }
        int fileCount = getFileCount(str2);
        if (fileCount < 1) {
            replace = str2;
            fileCount = 1;
        } else {
            replace = str2.replace(Integer.toString(fileCount), "");
        }
        InputStream[] inputStreamArr2 = new InputStream[fileCount];
        if (str2.endsWith(C1608bk.f5175b)) {
            try {
                inputStreamArr2[0] = new FileInputStream(C1358O.m6234a(C1358O.f4193d) + File.separator + str2);
                inputStreamArr = inputStreamArr2;
            } catch (IOException e) {
                inputStreamArr = null;
            }
            return inputStreamArr;
        }
        for (int i = 1; i <= fileCount; i++) {
            if (i != 1) {
                try {
                    str = replace + i;
                } catch (FileNotFoundException e2) {
                    return null;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return null;
                }
            } else {
                str = replace;
            }
            InputStream a = C1460o.m6799b().mo6098a(C1368X.m6313b(), asVar, str);
            if (a == null) {
                return null;
            }
            inputStreamArr2[i - 1] = a;
        }
        return inputStreamArr2;
    }

    public void closeFile(String str) {
    }

    public String[] getInstalledLanguageIds() {
        return C1368X.m6320c().mo5842o().mo5945g();
    }

    public void removeCheckerFile() {
        C1466av.m6853c(this.mContext, C1466av.f4703l);
    }

    public void onDiagnoseFileOpened() {
        if (Settings.getInstance().getBoolSetting(63) && C1466av.m6854d(this.mContext, C1466av.f4711t) && !C1466av.m6854d(this.mContext, C1466av.f4712u)) {
            copyDiagnoseFile();
        }
    }

    private void copyDiagnoseFile() {
        File a = C1466av.m6849a(this.mContext, C1466av.f4715x);
        File a2 = C1358O.m6234a(C1358O.f4203n);
        if (a.exists() && a2 != null) {
            C0997e.m5173a(a, new File(a2, C1466av.f4715x));
        }
    }

    public String getFilesDir() {
        return C1466av.m6848a(this.mContext).getAbsolutePath();
    }

    public String getHandWriteFolder() {
        return C1368X.m6320c().mo5848u().mo5600d();
    }

    public Context getContext() {
        return this.mContext;
    }
}
