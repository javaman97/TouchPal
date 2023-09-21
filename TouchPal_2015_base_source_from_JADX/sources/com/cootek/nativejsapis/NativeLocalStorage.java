package com.cootek.nativejsapis;

import android.content.Context;
import java.util.Hashtable;

public class NativeLocalStorage {
    private Context mContext;
    private Hashtable<String, String> mData = new Hashtable<>();
    private String mLocalStorageFileName;

    public NativeLocalStorage(Context context, String str) {
        this.mContext = context;
        this.mLocalStorageFileName = str;
        load();
    }

    public String get(String str) {
        if (this.mData.containsKey(str)) {
            return this.mData.get(str);
        }
        return null;
    }

    public void put(String str, String str2) {
        this.mData.put(str, str2);
    }

    public void remove(String str) {
        if (this.mData.containsKey(str)) {
            this.mData.remove(str);
        }
    }

    public void clear() {
        this.mData.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC, Splitter:B:28:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[SYNTHETIC, Splitter:B:31:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068 A[SYNTHETIC, Splitter:B:37:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006d A[SYNTHETIC, Splitter:B:40:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a A[SYNTHETIC, Splitter:B:46:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007f A[SYNTHETIC, Splitter:B:49:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load() {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            java.lang.String r3 = "%s/%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            r5 = 0
            android.content.Context r6 = r8.mContext     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            r4[r5] = r6     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            r5 = 1
            java.lang.String r6 = r8.mLocalStorageFileName     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            r4[r5] = r6     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            if (r4 == 0) goto L_0x002b
            boolean r3 = r4.exists()     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            if (r3 != 0) goto L_0x0036
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            r2.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0035:
            return
        L_0x0036:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0055, ClassNotFoundException -> 0x0064, all -> 0x0073 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x009d, ClassNotFoundException -> 0x0098, all -> 0x0091 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x009d, ClassNotFoundException -> 0x0098, all -> 0x0091 }
            java.lang.Object r0 = r1.readObject()     // Catch:{ IOException -> 0x00a0, ClassNotFoundException -> 0x009a, all -> 0x0096 }
            java.util.Hashtable r0 = (java.util.Hashtable) r0     // Catch:{ IOException -> 0x00a0, ClassNotFoundException -> 0x009a, all -> 0x0096 }
            r8.mData = r0     // Catch:{ IOException -> 0x00a0, ClassNotFoundException -> 0x009a, all -> 0x0096 }
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ IOException -> 0x008f }
        L_0x004d:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0035
        L_0x0053:
            r0 = move-exception
            goto L_0x0035
        L_0x0055:
            r1 = move-exception
            r1 = r0
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            r0.close()     // Catch:{ IOException -> 0x0087 }
        L_0x005c:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0035
        L_0x0062:
            r0 = move-exception
            goto L_0x0035
        L_0x0064:
            r1 = move-exception
            r2 = r0
        L_0x0066:
            if (r0 == 0) goto L_0x006b
            r0.close()     // Catch:{ IOException -> 0x0089 }
        L_0x006b:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0035
        L_0x0071:
            r0 = move-exception
            goto L_0x0035
        L_0x0073:
            r1 = move-exception
            r2 = r0
            r7 = r0
            r0 = r1
            r1 = r7
        L_0x0078:
            if (r1 == 0) goto L_0x007d
            r1.close()     // Catch:{ IOException -> 0x008b }
        L_0x007d:
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ IOException -> 0x008d }
        L_0x0082:
            throw r0
        L_0x0083:
            r2 = move-exception
            goto L_0x0030
        L_0x0085:
            r0 = move-exception
            goto L_0x0035
        L_0x0087:
            r0 = move-exception
            goto L_0x005c
        L_0x0089:
            r0 = move-exception
            goto L_0x006b
        L_0x008b:
            r1 = move-exception
            goto L_0x007d
        L_0x008d:
            r1 = move-exception
            goto L_0x0082
        L_0x008f:
            r0 = move-exception
            goto L_0x004d
        L_0x0091:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x0078
        L_0x0096:
            r0 = move-exception
            goto L_0x0078
        L_0x0098:
            r1 = move-exception
            goto L_0x0066
        L_0x009a:
            r0 = move-exception
            r0 = r1
            goto L_0x0066
        L_0x009d:
            r1 = move-exception
            r1 = r2
            goto L_0x0057
        L_0x00a0:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.nativejsapis.NativeLocalStorage.load():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b A[SYNTHETIC, Splitter:B:19:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[SYNTHETIC, Splitter:B:22:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[SYNTHETIC, Splitter:B:28:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062 A[SYNTHETIC, Splitter:B:31:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void save() {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "%s/%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            r3 = 0
            android.content.Context r4 = r6.mContext     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            r2[r3] = r4     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            r3 = 1
            java.lang.String r4 = r6.mLocalStorageFileName     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            r2[r3] = r4     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            boolean r1 = r3.exists()     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            if (r1 != 0) goto L_0x002a
            r3.createNewFile()     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
        L_0x002a:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0047, all -> 0x0056 }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0077, all -> 0x0070 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0077, all -> 0x0070 }
            java.util.Hashtable<java.lang.String, java.lang.String> r0 = r6.mData     // Catch:{ IOException -> 0x007a, all -> 0x0075 }
            r1.writeObject(r0)     // Catch:{ IOException -> 0x007a, all -> 0x0075 }
            r1.flush()     // Catch:{ IOException -> 0x007a, all -> 0x0075 }
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ IOException -> 0x006c }
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ IOException -> 0x006e }
        L_0x0046:
            return
        L_0x0047:
            r1 = move-exception
            r1 = r0
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x0066 }
        L_0x004e:
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0046
        L_0x0054:
            r0 = move-exception
            goto L_0x0046
        L_0x0056:
            r1 = move-exception
            r2 = r0
            r5 = r0
            r0 = r1
            r1 = r5
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            r1.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ IOException -> 0x006a }
        L_0x0065:
            throw r0
        L_0x0066:
            r0 = move-exception
            goto L_0x004e
        L_0x0068:
            r1 = move-exception
            goto L_0x0060
        L_0x006a:
            r1 = move-exception
            goto L_0x0065
        L_0x006c:
            r0 = move-exception
            goto L_0x0041
        L_0x006e:
            r0 = move-exception
            goto L_0x0046
        L_0x0070:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x005b
        L_0x0075:
            r0 = move-exception
            goto L_0x005b
        L_0x0077:
            r1 = move-exception
            r1 = r2
            goto L_0x0049
        L_0x007a:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.nativejsapis.NativeLocalStorage.save():void");
    }

    public String getLocalStorageFileName() {
        return this.mLocalStorageFileName;
    }
}
