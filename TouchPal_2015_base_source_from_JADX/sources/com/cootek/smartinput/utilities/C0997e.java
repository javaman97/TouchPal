package com.cootek.smartinput.utilities;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1579bD;
import com.cootek.smartinput5.func.C1584bI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput.utilities.e */
/* compiled from: FileUtils */
public class C0997e {

    /* renamed from: a */
    public static final String f2623a = "FileUtils";

    /* renamed from: b */
    public static final int f2624b = -1;

    /* renamed from: c */
    public static final int f2625c = -2;

    /* renamed from: d */
    public static final int f2626d = 1;

    /* renamed from: e */
    private static Map<String, C0996d> f2627e = new HashMap();

    /* renamed from: a */
    public static void m5182a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists()) {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        if (file3.isFile()) {
                            m5173a(file3, new File(str2 + File.separator + file3.getName()));
                        } else if (file3.isDirectory()) {
                            m5182a(file + File.separator + file3.getName(), file2 + File.separator + file3.getName());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0049 A[SYNTHETIC, Splitter:B:34:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004e A[SYNTHETIC, Splitter:B:37:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0063 A[SYNTHETIC, Splitter:B:48:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0068 A[SYNTHETIC, Splitter:B:51:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x007a A[SYNTHETIC, Splitter:B:60:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x007f A[SYNTHETIC, Splitter:B:63:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5173a(java.io.File r4, java.io.File r5) {
        /*
            r2 = 0
            if (r4 == 0) goto L_0x0005
            if (r5 != 0) goto L_0x0006
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0005
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L_0x0005
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x001b
            r5.createNewFile()     // Catch:{ IOException -> 0x0038 }
        L_0x001b:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x005c, all -> 0x0076 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x005c, all -> 0x0076 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x009b, IOException -> 0x0096 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x009b, IOException -> 0x0096 }
            m5178a((java.io.InputStream) r3, (java.io.OutputStream) r1)     // Catch:{ FileNotFoundException -> 0x009f, IOException -> 0x0098, all -> 0x008f }
            if (r3 == 0) goto L_0x002d
            r3.close()     // Catch:{ IOException -> 0x003d }
        L_0x002d:
            if (r1 == 0) goto L_0x0005
            r1.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0005
        L_0x0033:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0005
        L_0x0038:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001b
        L_0x003d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002d
        L_0x0042:
            r0 = move-exception
            r1 = r2
        L_0x0044:
            r0.printStackTrace()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x0057 }
        L_0x004c:
            if (r1 == 0) goto L_0x0005
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0005
        L_0x0052:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0005
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x004c
        L_0x005c:
            r0 = move-exception
            r3 = r2
        L_0x005e:
            r0.printStackTrace()     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x0066
            r3.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0066:
            if (r2 == 0) goto L_0x0005
            r2.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0005
        L_0x006c:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0005
        L_0x0071:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0066
        L_0x0076:
            r0 = move-exception
            r3 = r2
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            r3.close()     // Catch:{ IOException -> 0x0083 }
        L_0x007d:
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0082:
            throw r0
        L_0x0083:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x007d
        L_0x0088:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0082
        L_0x008d:
            r0 = move-exception
            goto L_0x0078
        L_0x008f:
            r0 = move-exception
            r2 = r1
            goto L_0x0078
        L_0x0092:
            r0 = move-exception
            r3 = r2
            r2 = r1
            goto L_0x0078
        L_0x0096:
            r0 = move-exception
            goto L_0x005e
        L_0x0098:
            r0 = move-exception
            r2 = r1
            goto L_0x005e
        L_0x009b:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0044
        L_0x009f:
            r0 = move-exception
            r2 = r3
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5173a(java.io.File, java.io.File):void");
    }

    /* renamed from: a */
    public static void m5178a(InputStream inputStream, OutputStream outputStream) throws IOException {
        m5179a(inputStream, outputStream, (String) null);
    }

    /* renamed from: a */
    public static void m5179a(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        C0996d dVar = new C0996d();
        if (str != null) {
            f2627e.put(str, dVar);
        }
        try {
            dVar.mo4082a(inputStream, outputStream);
            if (str != null) {
                f2627e.remove(str);
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            if (str != null) {
                f2627e.remove(str);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m5180a(String str) {
        C0996d dVar;
        if (str != null && (dVar = f2627e.get(str)) != null && dVar.mo4083a()) {
            dVar.mo4084b();
            f2627e.remove(dVar);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a A[SYNTHETIC, Splitter:B:20:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002f A[SYNTHETIC, Splitter:B:23:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0039 A[SYNTHETIC, Splitter:B:29:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003e A[SYNTHETIC, Splitter:B:32:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5181a(java.lang.String r4, java.io.File r5, android.content.Context r6) {
        /*
            r2 = 0
            com.cootek.smartinput5.func.asset.o r0 = com.cootek.smartinput5.func.asset.C1460o.m6799b()     // Catch:{ IOException -> 0x0020, all -> 0x0035 }
            java.io.InputStream r3 = r0.mo6099a((android.content.Context) r6, (java.lang.String) r4)     // Catch:{ IOException -> 0x0020, all -> 0x0035 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0055, all -> 0x004c }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0055, all -> 0x004c }
            if (r3 == 0) goto L_0x0015
            if (r1 == 0) goto L_0x0015
            m5178a((java.io.InputStream) r3, (java.io.OutputStream) r1)     // Catch:{ IOException -> 0x0059, all -> 0x004e }
        L_0x0015:
            if (r3 == 0) goto L_0x001a
            r3.close()     // Catch:{ IOException -> 0x0042 }
        L_0x001a:
            if (r1 == 0) goto L_0x001f
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            r1 = r2
        L_0x0022:
            r0.printStackTrace()     // Catch:{ all -> 0x0051 }
            r5.delete()     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x002d
            r2.close()     // Catch:{ IOException -> 0x0046 }
        L_0x002d:
            if (r1 == 0) goto L_0x001f
            r1.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x001f
        L_0x0033:
            r0 = move-exception
            goto L_0x001f
        L_0x0035:
            r0 = move-exception
            r3 = r2
        L_0x0037:
            if (r3 == 0) goto L_0x003c
            r3.close()     // Catch:{ IOException -> 0x0048 }
        L_0x003c:
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x0041:
            throw r0
        L_0x0042:
            r0 = move-exception
            goto L_0x001a
        L_0x0044:
            r0 = move-exception
            goto L_0x001f
        L_0x0046:
            r0 = move-exception
            goto L_0x002d
        L_0x0048:
            r1 = move-exception
            goto L_0x003c
        L_0x004a:
            r1 = move-exception
            goto L_0x0041
        L_0x004c:
            r0 = move-exception
            goto L_0x0037
        L_0x004e:
            r0 = move-exception
            r2 = r1
            goto L_0x0037
        L_0x0051:
            r0 = move-exception
            r3 = r2
            r2 = r1
            goto L_0x0037
        L_0x0055:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0022
        L_0x0059:
            r0 = move-exception
            r2 = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5181a(java.lang.String, java.io.File, android.content.Context):void");
    }

    /* renamed from: a */
    public static File[] m5185a(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.listFiles(filenameFilter);
        ArrayList arrayList = new ArrayList();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.addAll(Arrays.asList(m5185a(file2, filenameFilter)));
                } else {
                    arrayList.add(file2);
                }
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    /* renamed from: b */
    public static void m5189b(File file, File file2) {
        File[] listFiles;
        if (file != null && file.exists() && file2 != null) {
            if (!file2.exists() || file2.isDirectory()) {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (file.isFile()) {
                    m5173a(file, new File(file2, file.getName()));
                } else if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file3 : listFiles) {
                        if (file3.isFile()) {
                            m5189b(file3, file2);
                        } else if (file3.isDirectory()) {
                            m5189b(file3, new File(file2, file3.getName()));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5172a(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                String[] list = file.list();
                if (list != null) {
                    int length = list.length;
                    for (int i = 0; i < length; i++) {
                        m5172a(new File(file.getAbsolutePath() + File.separator + list[i]));
                    }
                }
                file.delete();
            }
        }
    }

    /* renamed from: b */
    public static void m5190b(String str, String str2) {
        C1584bI.m7127a(new String[]{"chmod", str, str2});
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[SYNTHETIC, Splitter:B:27:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0040 A[SYNTHETIC, Splitter:B:30:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0052 A[SYNTHETIC, Splitter:B:39:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0057 A[SYNTHETIC, Splitter:B:42:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5175a(java.io.File r4, java.lang.Object r5) {
        /*
            r1 = 0
            if (r4 == 0) goto L_0x0005
            if (r5 != 0) goto L_0x0006
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = r4.exists()     // Catch:{ Exception -> 0x0034, all -> 0x004e }
            if (r0 != 0) goto L_0x000f
            r4.createNewFile()     // Catch:{ Exception -> 0x0034, all -> 0x004e }
        L_0x000f:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0034, all -> 0x004e }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0034, all -> 0x004e }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            r2.writeObject(r5)     // Catch:{ Exception -> 0x0070, all -> 0x0067 }
            r2.flush()     // Catch:{ Exception -> 0x0070, all -> 0x0067 }
            if (r2 == 0) goto L_0x0024
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x0024:
            if (r3 == 0) goto L_0x0005
            r3.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0005
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0005
        L_0x002f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0024
        L_0x0034:
            r0 = move-exception
            r2 = r1
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ IOException -> 0x0049 }
        L_0x003e:
            if (r2 == 0) goto L_0x0005
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0005
        L_0x0044:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0005
        L_0x0049:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x003e
        L_0x004e:
            r0 = move-exception
            r3 = r1
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x005b }
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ IOException -> 0x0060 }
        L_0x005a:
            throw r0
        L_0x005b:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0055
        L_0x0060:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005a
        L_0x0065:
            r0 = move-exception
            goto L_0x0050
        L_0x0067:
            r0 = move-exception
            r1 = r2
            goto L_0x0050
        L_0x006a:
            r0 = move-exception
            r3 = r2
            goto L_0x0050
        L_0x006d:
            r0 = move-exception
            r2 = r3
            goto L_0x0036
        L_0x0070:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5175a(java.io.File, java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[SYNTHETIC, Splitter:B:24:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0037 A[SYNTHETIC, Splitter:B:27:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004c A[SYNTHETIC, Splitter:B:36:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0051 A[SYNTHETIC, Splitter:B:39:0x0051] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m5187b(java.io.File r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0009
            boolean r1 = r5.exists()
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002d, all -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x002d, all -> 0x0045 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0066, all -> 0x005f }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0066, all -> 0x005f }
            java.lang.Object r0 = r1.readObject()     // Catch:{ Exception -> 0x0069, all -> 0x0064 }
            if (r1 == 0) goto L_0x001d
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x001d:
            if (r2 == 0) goto L_0x0009
            r2.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0009
        L_0x0023:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x0028:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x001d
        L_0x002d:
            r1 = move-exception
            r1 = r0
            r2 = r0
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0035:
            if (r2 == 0) goto L_0x0009
            r2.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x0009
        L_0x003b:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x0040:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0035
        L_0x0045:
            r1 = move-exception
            r2 = r0
            r4 = r0
            r0 = r1
            r1 = r4
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ IOException -> 0x0055 }
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ IOException -> 0x005a }
        L_0x0054:
            throw r0
        L_0x0055:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x004f
        L_0x005a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0054
        L_0x005f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x004a
        L_0x0064:
            r0 = move-exception
            goto L_0x004a
        L_0x0066:
            r1 = move-exception
            r1 = r0
            goto L_0x0030
        L_0x0069:
            r3 = move-exception
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5187b(java.io.File):java.lang.Object");
    }

    /* renamed from: c */
    public static void m5191c(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            File file2 = new File(file, ".nomedia");
            if (file2.exists()) {
                if (file2.isFile()) {
                    return;
                }
                if (file2.isDirectory()) {
                    try {
                        m5172a(file2);
                    } catch (Exception e) {
                    }
                }
            }
            try {
                file2.createNewFile();
            } catch (Exception e2) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[SYNTHETIC, Splitter:B:29:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5176a(java.io.File r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0008
            if (r4 != 0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x001c
            r4.delete()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r4.getAbsolutePath()
            r0.<init>(r1)
            r4 = r0
        L_0x001c:
            r4.createNewFile()     // Catch:{ IOException -> 0x006e }
        L_0x001f:
            java.util.Scanner r2 = new java.util.Scanner
            java.lang.String r0 = r5.toString()
            r2.<init>(r0)
            r1 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0079, Exception -> 0x005d, all -> 0x0067 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0079, Exception -> 0x005d, all -> 0x0067 }
        L_0x002e:
            boolean r1 = r2.hasNextLine()     // Catch:{ IOException -> 0x0049, Exception -> 0x0077, all -> 0x0072 }
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = r2.nextLine()     // Catch:{ IOException -> 0x0049, Exception -> 0x0077, all -> 0x0072 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x0049, Exception -> 0x0077, all -> 0x0072 }
            r0.write(r1)     // Catch:{ IOException -> 0x0049, Exception -> 0x0077, all -> 0x0072 }
            java.lang.String r1 = "\n"
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x0049, Exception -> 0x0077, all -> 0x0072 }
            r0.write(r1)     // Catch:{ IOException -> 0x0049, Exception -> 0x0077, all -> 0x0072 }
            goto L_0x002e
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0008
        L_0x0050:
            r0 = move-exception
            goto L_0x0008
        L_0x0052:
            r0.flush()     // Catch:{ IOException -> 0x0049, Exception -> 0x0077, all -> 0x0072 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x0008
        L_0x005b:
            r0 = move-exception
            goto L_0x0008
        L_0x005d:
            r0 = move-exception
            r0 = r1
        L_0x005f:
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0008
        L_0x0065:
            r0 = move-exception
            goto L_0x0008
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.close()     // Catch:{ IOException -> 0x0070 }
        L_0x006d:
            throw r0
        L_0x006e:
            r0 = move-exception
            goto L_0x001f
        L_0x0070:
            r1 = move-exception
            goto L_0x006d
        L_0x0072:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0068
        L_0x0077:
            r1 = move-exception
            goto L_0x005f
        L_0x0079:
            r0 = move-exception
            r0 = r1
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5176a(java.io.File, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[SYNTHETIC, Splitter:B:18:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b A[SYNTHETIC, Splitter:B:24:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0044 A[SYNTHETIC, Splitter:B:29:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5177a(java.io.File r3, byte[] r4) {
        /*
            if (r3 != 0) goto L_0x0003
        L_0x0002:
            return
        L_0x0003:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0016
            r3.delete()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.getAbsolutePath()
            r0.<init>(r1)
            r3 = r0
        L_0x0016:
            r3.createNewFile()     // Catch:{ IOException -> 0x0048 }
        L_0x0019:
            r1 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x0037, all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x002d, IOException -> 0x0037, all -> 0x0041 }
            r0.write(r4)     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004c }
            r0.flush()     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004c }
            if (r0 == 0) goto L_0x0002
            r0.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x0002
        L_0x002b:
            r0 = move-exception
            goto L_0x0002
        L_0x002d:
            r0 = move-exception
            r0 = r1
        L_0x002f:
            if (r0 == 0) goto L_0x0002
            r0.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0002
        L_0x0035:
            r0 = move-exception
            goto L_0x0002
        L_0x0037:
            r0 = move-exception
            r0 = r1
        L_0x0039:
            if (r0 == 0) goto L_0x0002
            r0.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0002
        L_0x003f:
            r0 = move-exception
            goto L_0x0002
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x004a }
        L_0x0047:
            throw r0
        L_0x0048:
            r0 = move-exception
            goto L_0x0019
        L_0x004a:
            r1 = move-exception
            goto L_0x0047
        L_0x004c:
            r1 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0042
        L_0x0051:
            r1 = move-exception
            goto L_0x0039
        L_0x0053:
            r1 = move-exception
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5177a(java.io.File, byte[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x002d A[SYNTHETIC, Splitter:B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003c A[SYNTHETIC, Splitter:B:31:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0048 A[SYNTHETIC, Splitter:B:37:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5174a(java.io.File r3, java.io.InputStream r4) {
        /*
            if (r4 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x000d
            r3.createNewFile()     // Catch:{ IOException -> 0x001c }
        L_0x000d:
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0036 }
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0036 }
            m5178a((java.io.InputStream) r4, (java.io.OutputStream) r1)     // Catch:{ FileNotFoundException -> 0x0057, IOException -> 0x0054 }
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x001b:
            return
        L_0x001c:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x000d
        L_0x0021:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001b
        L_0x0026:
            r0 = move-exception
            r1 = r2
        L_0x0028:
            r0.printStackTrace()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x001b
        L_0x0031:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001b
        L_0x0036:
            r0 = move-exception
        L_0x0037:
            r0.printStackTrace()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x001b
            r2.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x001b
        L_0x0040:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001b
        L_0x0045:
            r0 = move-exception
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004b:
            throw r0
        L_0x004c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x004b
        L_0x0051:
            r0 = move-exception
            r2 = r1
            goto L_0x0046
        L_0x0054:
            r0 = move-exception
            r2 = r1
            goto L_0x0037
        L_0x0057:
            r0 = move-exception
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5174a(java.io.File, java.io.InputStream):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002a A[SYNTHETIC, Splitter:B:22:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0034 A[SYNTHETIC, Splitter:B:28:0x0034] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5184a(android.graphics.Bitmap r3, java.io.File r4, android.graphics.Bitmap.CompressFormat r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0005
            if (r3 != 0) goto L_0x0006
        L_0x0005:
            return r0
        L_0x0006:
            r4.createNewFile()     // Catch:{ IOException -> 0x0038 }
        L_0x0009:
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0026, all -> 0x0030 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0026, all -> 0x0030 }
            if (r5 != 0) goto L_0x0013
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0013:
            r2 = 100
            boolean r0 = r3.compress(r5, r2, r1)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            if (r0 == 0) goto L_0x001e
            r1.flush()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x001e:
            if (r1 == 0) goto L_0x0005
            r1.close()     // Catch:{ Exception -> 0x0024 }
            goto L_0x0005
        L_0x0024:
            r1 = move-exception
            goto L_0x0005
        L_0x0026:
            r1 = move-exception
            r1 = r2
        L_0x0028:
            if (r1 == 0) goto L_0x0005
            r1.close()     // Catch:{ Exception -> 0x002e }
            goto L_0x0005
        L_0x002e:
            r1 = move-exception
            goto L_0x0005
        L_0x0030:
            r0 = move-exception
            r1 = r2
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ Exception -> 0x003a }
        L_0x0037:
            throw r0
        L_0x0038:
            r1 = move-exception
            goto L_0x0009
        L_0x003a:
            r1 = move-exception
            goto L_0x0037
        L_0x003c:
            r0 = move-exception
            goto L_0x0032
        L_0x003e:
            r2 = move-exception
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5184a(android.graphics.Bitmap, java.io.File, android.graphics.Bitmap$CompressFormat):boolean");
    }

    /* renamed from: a */
    public static boolean m5183a(Context context, String str) {
        try {
            return new File(C1466av.m6848a(context), str + C1579bD.f4987i).exists();
        } catch (Exception e) {
            C1017y.m5213a(f2623a, e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static long m5170a(Context context, String str, int i) {
        try {
            File file = new File(C1466av.m6848a(context), str + C1579bD.f4987i);
            if (!file.exists()) {
                return -1;
            }
            long length = file.length();
            if (length <= ((long) (i * 1024 * 1024))) {
                return length;
            }
            return -2;
        } catch (Exception e) {
            C1017y.m5213a(f2623a, e.toString());
            return -1;
        }
    }

    /* renamed from: b */
    public static Bundle m5186b(Context context, String str) {
        Bundle bundle = new Bundle();
        try {
            File file = new File(C1466av.m6848a(context), str + C1579bD.f4987i);
            if (file.exists()) {
                bundle.putString("md5", m5188b(file.getAbsolutePath()));
                bundle.putLong("lastModified", file.lastModified() / 1000);
                bundle.putLong("size", file.length());
            }
        } catch (Exception e) {
            C1017y.m5213a(f2623a, e.toString());
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c A[SYNTHETIC, Splitter:B:25:0x003c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m5188b(java.lang.String r7) {
        /*
            r0 = 0
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0046, all -> 0x0036 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x001f, all -> 0x0044 }
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ Exception -> 0x001f, all -> 0x0044 }
        L_0x0011:
            r5 = -1
            if (r2 == r5) goto L_0x0026
            int r2 = r1.read(r3)     // Catch:{ Exception -> 0x001f, all -> 0x0044 }
            if (r2 <= 0) goto L_0x0011
            r5 = 0
            r4.update(r3, r5, r2)     // Catch:{ Exception -> 0x001f, all -> 0x0044 }
            goto L_0x0011
        L_0x001f:
            r2 = move-exception
        L_0x0020:
            if (r1 == 0) goto L_0x0025
            r1.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0025:
            return r0
        L_0x0026:
            byte[] r2 = r4.digest()     // Catch:{ Exception -> 0x001f, all -> 0x0044 }
            java.lang.String r0 = m5171a((byte[]) r2)     // Catch:{ Exception -> 0x001f, all -> 0x0044 }
            if (r1 == 0) goto L_0x0025
            r1.close()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0025
        L_0x0034:
            r1 = move-exception
            goto L_0x0025
        L_0x0036:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ Exception -> 0x0042 }
        L_0x003f:
            throw r0
        L_0x0040:
            r1 = move-exception
            goto L_0x0025
        L_0x0042:
            r1 = move-exception
            goto L_0x003f
        L_0x0044:
            r0 = move-exception
            goto L_0x003a
        L_0x0046:
            r1 = move-exception
            r1 = r0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0997e.m5188b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m5171a(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            str = str + Integer.toString((bArr[i] & 255) + 256, 16).substring(1);
        }
        return str;
    }

    /* renamed from: d */
    public static String m5192d(File file) {
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (fileReader != null) {
            char[] cArr = new char[1024];
            while (true) {
                try {
                    int read = fileReader.read(cArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static boolean m5193e(File file) {
        return file != null && file.exists();
    }

    /* renamed from: f */
    public static void m5194f(File file) {
        if (file != null && !file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: g */
    public static void m5195g(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }
}
