package com.cootek.usage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C2119x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: com.cootek.usage.p */
final class C3301p {

    /* renamed from: a */
    private static final long f14527a = 5000;

    /* renamed from: b */
    private static final String f14528b = "app_version";

    /* renamed from: i */
    private static final int f14529i = 1024;

    /* renamed from: j */
    private static final int f14530j = 0;

    /* renamed from: k */
    private static final int f14531k = 1;

    /* renamed from: l */
    private static final int f14532l = 2;

    /* renamed from: m */
    private static final int f14533m = 3;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AbsUsageAssist f14534c;

    /* renamed from: d */
    private HandlerThread f14535d = new HandlerThread("usage");

    /* renamed from: e */
    private Handler f14536e;

    /* renamed from: f */
    private Random f14537f;

    /* renamed from: g */
    private C3292g f14538g;

    /* renamed from: h */
    private String f14539h;

    C3301p(AbsUsageAssist absUsageAssist) {
        this.f14534c = absUsageAssist;
        this.f14535d.start();
        this.f14536e = new C3303r(this, this.f14535d.getLooper());
        this.f14537f = new Random();
        this.f14538g = new C3292g(this.f14534c);
        Intent intent = new Intent(UsageAlarmReceiver.USAGE_ALARM);
        intent.setPackage(this.f14534c.getContext().getPackageName());
        ((AlarmManager) this.f14534c.getContext().getSystemService("alarm")).setRepeating(1, 0, this.f14534c.getAlarmInterval(), PendingIntent.getBroadcast(this.f14534c.getContext(), 0, intent, Engine.EXCEPTION_WARN));
    }

    /* renamed from: a */
    private static String m14624a(String str) {
        if (str == null) {
            return null;
        }
        return String.valueOf(str) + C2119x.f8995a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6 A[SYNTHETIC, Splitter:B:23:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5 A[SYNTHETIC, Splitter:B:31:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[SYNTHETIC, Splitter:B:39:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3 A[SYNTHETIC, Splitter:B:47:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f2 A[SYNTHETIC, Splitter:B:55:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100 A[SYNTHETIC, Splitter:B:61:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00c0=Splitter:B:28:0x00c0, B:52:0x00ed=Splitter:B:52:0x00ed, B:44:0x00de=Splitter:B:44:0x00de, B:36:0x00cf=Splitter:B:36:0x00cf} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14625a(com.cootek.usage.UsageData r7) {
        /*
            r6 = this;
            com.cootek.usage.m r0 = com.cootek.usage.C3298m.m14615a()
            java.lang.String r1 = r7.path
            int r0 = r0.mo10505a((java.lang.String) r1)
            com.cootek.usage.m r1 = com.cootek.usage.C3298m.m14615a()
            java.lang.String r2 = r7.path
            java.lang.String r1 = r1.mo10506b((java.lang.String) r2)
            boolean r2 = com.cootek.usage.UsageRecorder.m14564b()
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Usage/UsageProcessor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "saving path: "
            r3.<init>(r4)
            java.lang.String r4 = r7.path
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", sampling: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = ", strategy: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r2, r3)
        L_0x0044:
            java.util.Random r2 = r6.f14537f
            r3 = 99
            int r2 = r2.nextInt(r3)
            if (r2 < r0) goto L_0x006f
            java.lang.String r0 = "Usage/UsageProcessor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "path: "
            r1.<init>(r3)
            java.lang.String r3 = r7.path
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " not saved for p = "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
        L_0x006e:
            return
        L_0x006f:
            java.io.File r0 = new java.io.File
            com.cootek.usage.AbsUsageAssist r2 = r6.f14534c
            java.io.File r2 = r2.getFolder()
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0083
            r0.mkdirs()
        L_0x0083:
            r2 = 0
            java.io.File r0 = m14630b((java.io.File) r0)
            java.lang.String r1 = r6.m14636e()     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r3 = 1
            javax.crypto.Cipher r3 = com.cootek.usage.C3290e.m14581a((java.lang.String) r1, (int) r3)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            javax.crypto.CipherOutputStream r4 = new javax.crypto.CipherOutputStream     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r4.<init>(r5, r3)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r1.writeObject(r7)     // Catch:{ FileNotFoundException -> 0x0118, IOException -> 0x0115, InvalidKeyException -> 0x0112, NoSuchAlgorithmException -> 0x010f, NoSuchPaddingException -> 0x010c }
            r1.flush()     // Catch:{ FileNotFoundException -> 0x0118, IOException -> 0x0115, InvalidKeyException -> 0x0112, NoSuchAlgorithmException -> 0x010f, NoSuchPaddingException -> 0x010c }
            r1.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x006e
        L_0x00aa:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00af:
            r0 = move-exception
            r1 = r2
        L_0x00b1:
            r0.printStackTrace()     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x006e
            r1.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x006e
        L_0x00ba:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00bf:
            r0 = move-exception
        L_0x00c0:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x006e
        L_0x00c9:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00ce:
            r0 = move-exception
        L_0x00cf:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00d8 }
            goto L_0x006e
        L_0x00d8:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00dd:
            r0 = move-exception
        L_0x00de:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x006e
        L_0x00e7:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00ec:
            r0 = move-exception
        L_0x00ed:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x006e
        L_0x00f7:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            if (r2 == 0) goto L_0x0103
            r2.close()     // Catch:{ IOException -> 0x0104 }
        L_0x0103:
            throw r0
        L_0x0104:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0103
        L_0x0109:
            r0 = move-exception
            r2 = r1
            goto L_0x00fe
        L_0x010c:
            r0 = move-exception
            r2 = r1
            goto L_0x00ed
        L_0x010f:
            r0 = move-exception
            r2 = r1
            goto L_0x00de
        L_0x0112:
            r0 = move-exception
            r2 = r1
            goto L_0x00cf
        L_0x0115:
            r0 = move-exception
            r2 = r1
            goto L_0x00c0
        L_0x0118:
            r0 = move-exception
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3301p.m14625a(com.cootek.usage.UsageData):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m14626a(C3301p pVar) {
        boolean a = C3292g.m14593a(pVar.f14534c.getContext());
        long currentTimeMillis = System.currentTimeMillis();
        File[] listFiles = pVar.f14534c.getFolder().listFiles();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 2) {
                boolean z = i2 == 0;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    C3300o c = C3298m.m14615a().mo10508c(name);
                    if (c.f14526d == z) {
                        if (UsageRecorder.m14564b()) {
                            Log.i("Usage/UsageProcessor", "folder: " + name + ", strategy: " + c);
                        }
                        long a2 = C3297l.m14606a().mo10499a(c.f14523a);
                        long a3 = C3297l.m14606a().mo10499a(c.f14523a);
                        if (c.f14525c >= 0 && currentTimeMillis - a2 > c.f14525c) {
                            arrayList.add(file);
                            arrayList2.add(c);
                            Log.i("Usage/UsageProcessor", "folder: " + name + "may send by mobile");
                        } else if (c.f14524b >= 0 && a && currentTimeMillis - a3 > c.f14524b) {
                            arrayList3.add(file);
                            arrayList4.add(c);
                            Log.i("Usage/UsageProcessor", "folder: " + name + "may send by wifi");
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList(arrayList3);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList5.addAll(arrayList);
                    arrayList6.addAll(arrayList2);
                    pVar.m14629a(true, arrayList5, arrayList6, z);
                }
                if (!arrayList.isEmpty()) {
                    pVar.m14629a(false, arrayList, arrayList2, z);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6 A[SYNTHETIC, Splitter:B:23:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5 A[SYNTHETIC, Splitter:B:31:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[SYNTHETIC, Splitter:B:39:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3 A[SYNTHETIC, Splitter:B:47:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f2 A[SYNTHETIC, Splitter:B:55:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100 A[SYNTHETIC, Splitter:B:61:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00c0=Splitter:B:28:0x00c0, B:52:0x00ed=Splitter:B:52:0x00ed, B:44:0x00de=Splitter:B:44:0x00de, B:36:0x00cf=Splitter:B:36:0x00cf} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m14627a(com.cootek.usage.C3301p r6, com.cootek.usage.UsageData r7) {
        /*
            com.cootek.usage.m r0 = com.cootek.usage.C3298m.m14615a()
            java.lang.String r1 = r7.path
            int r0 = r0.mo10505a((java.lang.String) r1)
            com.cootek.usage.m r1 = com.cootek.usage.C3298m.m14615a()
            java.lang.String r2 = r7.path
            java.lang.String r1 = r1.mo10506b((java.lang.String) r2)
            boolean r2 = com.cootek.usage.UsageRecorder.m14564b()
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Usage/UsageProcessor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "saving path: "
            r3.<init>(r4)
            java.lang.String r4 = r7.path
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", sampling: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = ", strategy: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r2, r3)
        L_0x0044:
            java.util.Random r2 = r6.f14537f
            r3 = 99
            int r2 = r2.nextInt(r3)
            if (r2 < r0) goto L_0x006f
            java.lang.String r0 = "Usage/UsageProcessor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "path: "
            r1.<init>(r3)
            java.lang.String r3 = r7.path
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " not saved for p = "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
        L_0x006e:
            return
        L_0x006f:
            java.io.File r0 = new java.io.File
            com.cootek.usage.AbsUsageAssist r2 = r6.f14534c
            java.io.File r2 = r2.getFolder()
            r0.<init>(r2, r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0083
            r0.mkdirs()
        L_0x0083:
            r2 = 0
            java.io.File r0 = m14630b((java.io.File) r0)
            java.lang.String r1 = r6.m14636e()     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r3 = 1
            javax.crypto.Cipher r3 = com.cootek.usage.C3290e.m14581a((java.lang.String) r1, (int) r3)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            javax.crypto.CipherOutputStream r4 = new javax.crypto.CipherOutputStream     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r4.<init>(r5, r3)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00af, IOException -> 0x00bf, InvalidKeyException -> 0x00ce, NoSuchAlgorithmException -> 0x00dd, NoSuchPaddingException -> 0x00ec }
            r1.writeObject(r7)     // Catch:{ FileNotFoundException -> 0x0118, IOException -> 0x0115, InvalidKeyException -> 0x0112, NoSuchAlgorithmException -> 0x010f, NoSuchPaddingException -> 0x010c }
            r1.flush()     // Catch:{ FileNotFoundException -> 0x0118, IOException -> 0x0115, InvalidKeyException -> 0x0112, NoSuchAlgorithmException -> 0x010f, NoSuchPaddingException -> 0x010c }
            r1.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x006e
        L_0x00aa:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00af:
            r0 = move-exception
            r1 = r2
        L_0x00b1:
            r0.printStackTrace()     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x006e
            r1.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x006e
        L_0x00ba:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00bf:
            r0 = move-exception
        L_0x00c0:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x006e
        L_0x00c9:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00ce:
            r0 = move-exception
        L_0x00cf:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00d8 }
            goto L_0x006e
        L_0x00d8:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00dd:
            r0 = move-exception
        L_0x00de:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x006e
        L_0x00e7:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00ec:
            r0 = move-exception
        L_0x00ed:
            r0.printStackTrace()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x006e
        L_0x00f7:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006e
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            if (r2 == 0) goto L_0x0103
            r2.close()     // Catch:{ IOException -> 0x0104 }
        L_0x0103:
            throw r0
        L_0x0104:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0103
        L_0x0109:
            r0 = move-exception
            r2 = r1
            goto L_0x00fe
        L_0x010c:
            r0 = move-exception
            r2 = r1
            goto L_0x00ed
        L_0x010f:
            r0 = move-exception
            r2 = r1
            goto L_0x00de
        L_0x0112:
            r0 = move-exception
            r2 = r1
            goto L_0x00cf
        L_0x0115:
            r0 = move-exception
            r2 = r1
            goto L_0x00c0
        L_0x0118:
            r0 = move-exception
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3301p.m14627a(com.cootek.usage.p, com.cootek.usage.UsageData):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m14628a(C3301p pVar, File file) {
        if (file != null) {
            File fileStreamPath = pVar.f14534c.getContext().getFileStreamPath(pVar.f14534c.getStrategyFileName());
            if (pVar.f14534c.isDebugMode()) {
                Log.i("Usage/UsageProcessor", "Old strategy file path: " + fileStreamPath);
                Log.i("Usage/UsageProcessor", "New strategy file path: " + file);
            }
            if (!file.getAbsolutePath().equals(fileStreamPath.getAbsolutePath())) {
                Context context = pVar.f14534c.getContext();
                String strategyFileName = pVar.f14534c.getStrategyFileName();
                File fileStreamPath2 = context.getFileStreamPath(strategyFileName == null ? null : String.valueOf(strategyFileName) + C2119x.f8995a);
                if (!fileStreamPath2.exists()) {
                    try {
                        fileStreamPath2.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                C3291f.m14586a(fileStreamPath, fileStreamPath2);
                if (pVar.f14534c.isDebugMode()) {
                    Log.i("Usage/UsageProcessor", "strategy file: backup succeed.");
                }
                C3291f.m14586a(file, fileStreamPath);
                if (!C3298m.m14615a().mo10507b()) {
                    C3291f.m14586a(fileStreamPath2, fileStreamPath);
                    if (pVar.f14534c.isDebugMode()) {
                        Log.i("Usage/UsageProcessor", "Update the strategy failed, revert strategy.");
                    }
                    C3298m.m14615a().mo10507b();
                    pVar.f14534c.onStrategyUpdate(false);
                }
                pVar.f14534c.onStrategyUpdate(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c5, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01cf, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d0, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01dd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01de, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e9, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f8, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f9, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0204, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0205, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0219, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x021a, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0225, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0226, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x022b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x022c, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0237, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0238, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x023d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x023e, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0249, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x024a, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x024f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0250, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x025b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x025c, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0261, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0262, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0269, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x026a, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0185, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ac, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ad, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b8, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01cb A[SYNTHETIC, Splitter:B:108:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e4 A[SYNTHETIC, Splitter:B:125:0x01e4] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01ff A[SYNTHETIC, Splitter:B:142:0x01ff] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0220 A[SYNTHETIC, Splitter:B:155:0x0220] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0232 A[SYNTHETIC, Splitter:B:164:0x0232] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0244 A[SYNTHETIC, Splitter:B:173:0x0244] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0256 A[SYNTHETIC, Splitter:B:182:0x0256] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0265 A[SYNTHETIC, Splitter:B:189:0x0265] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[SYNTHETIC, Splitter:B:24:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0167 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7 A[Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106 A[Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0164 A[SYNTHETIC, Splitter:B:45:0x0164] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0173 A[SYNTHETIC, Splitter:B:53:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0185 A[ExcHandler: StreamCorruptedException (e java.io.StreamCorruptedException), PHI: r4 
      PHI: (r4v15 java.io.ObjectInputStream) = (r4v4 java.io.ObjectInputStream), (r4v4 java.io.ObjectInputStream), (r4v17 java.io.ObjectInputStream), (r4v17 java.io.ObjectInputStream), (r4v19 java.io.ObjectInputStream), (r4v19 java.io.ObjectInputStream), (r4v22 java.io.ObjectInputStream), (r4v22 java.io.ObjectInputStream), (r4v24 java.io.ObjectInputStream), (r4v24 java.io.ObjectInputStream), (r4v35 java.io.ObjectInputStream), (r4v35 java.io.ObjectInputStream), (r4v37 java.io.ObjectInputStream), (r4v37 java.io.ObjectInputStream) binds: [B:14:0x0048, B:15:?, B:101:0x01c3, B:102:?, B:118:0x01dc, B:119:?, B:85:0x01ab, B:86:?, B:62:0x0184, B:63:?, B:26:0x0076, B:27:?, B:135:0x01f7, B:136:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:14:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a A[SYNTHETIC, Splitter:B:76:0x019a] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b3 A[SYNTHETIC, Splitter:B:92:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01bf A[SYNTHETIC, Splitter:B:98:0x01bf] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14629a(boolean r19, java.util.ArrayList r20, java.util.ArrayList r21, boolean r22) {
        /*
            r18 = this;
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Iterator r14 = r20.iterator()
        L_0x000e:
            boolean r2 = r14.hasNext()
            if (r2 != 0) goto L_0x0031
            r2 = 1
            java.util.Set r3 = r12.entrySet()
            java.util.Iterator r10 = r3.iterator()
            r9 = r2
        L_0x001e:
            boolean r2 = r10.hasNext()
            if (r2 != 0) goto L_0x0274
            if (r9 == 0) goto L_0x0030
            java.util.Iterator r3 = r21.iterator()
        L_0x002a:
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L_0x02c7
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r2 = r14.next()
            java.io.File r2 = (java.io.File) r2
            java.io.File[] r15 = r2.listFiles()
            int r0 = r15.length
            r16 = r0
            r2 = 0
            r11 = r2
        L_0x0040:
            r0 = r16
            if (r11 >= r0) goto L_0x000e
            r6 = r15[r11]
            r4 = 0
            r5 = 0
            java.lang.String r2 = r18.m14636e()     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x01ac, IOException -> 0x01c4, ClassNotFoundException -> 0x01dd, RuntimeException -> 0x01f8, Error -> 0x0219, InvalidKeyException -> 0x022b, NoSuchAlgorithmException -> 0x023d, NoSuchPaddingException -> 0x024f, all -> 0x0261 }
            r3 = 2
            javax.crypto.Cipher r2 = com.cootek.usage.C3290e.m14581a((java.lang.String) r2, (int) r3)     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x01ac, IOException -> 0x01c4, ClassNotFoundException -> 0x01dd, RuntimeException -> 0x01f8, Error -> 0x0219, InvalidKeyException -> 0x022b, NoSuchAlgorithmException -> 0x023d, NoSuchPaddingException -> 0x024f, all -> 0x0261 }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x016c, ClassNotFoundException -> 0x0194 }
            javax.crypto.CipherInputStream r7 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x016c, ClassNotFoundException -> 0x0194 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x016c, ClassNotFoundException -> 0x0194 }
            r8.<init>(r6)     // Catch:{ IOException -> 0x016c, ClassNotFoundException -> 0x0194 }
            r7.<init>(r8, r2)     // Catch:{ IOException -> 0x016c, ClassNotFoundException -> 0x0194 }
            r3.<init>(r7)     // Catch:{ IOException -> 0x016c, ClassNotFoundException -> 0x0194 }
            java.lang.Object r2 = r3.readObject()     // Catch:{ IOException -> 0x0348, ClassNotFoundException -> 0x0344 }
            com.cootek.usage.UsageData r2 = (com.cootek.usage.UsageData) r2     // Catch:{ IOException -> 0x0348, ClassNotFoundException -> 0x0344 }
            r3.close()     // Catch:{ IOException -> 0x01ee }
            r3 = 0
        L_0x006a:
            if (r2 != 0) goto L_0x034e
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ StreamCorruptedException -> 0x033c, FileNotFoundException -> 0x0334, IOException -> 0x0329, ClassNotFoundException -> 0x031e, RuntimeException -> 0x0313, Error -> 0x0308, InvalidKeyException -> 0x02fd, NoSuchAlgorithmException -> 0x02f2, NoSuchPaddingException -> 0x02e7, all -> 0x02e1 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ StreamCorruptedException -> 0x033c, FileNotFoundException -> 0x0334, IOException -> 0x0329, ClassNotFoundException -> 0x031e, RuntimeException -> 0x0313, Error -> 0x0308, InvalidKeyException -> 0x02fd, NoSuchAlgorithmException -> 0x02f2, NoSuchPaddingException -> 0x02e7, all -> 0x02e1 }
            r2.<init>(r6)     // Catch:{ StreamCorruptedException -> 0x033c, FileNotFoundException -> 0x0334, IOException -> 0x0329, ClassNotFoundException -> 0x031e, RuntimeException -> 0x0313, Error -> 0x0308, InvalidKeyException -> 0x02fd, NoSuchAlgorithmException -> 0x02f2, NoSuchPaddingException -> 0x02e7, all -> 0x02e1 }
            r4.<init>(r2)     // Catch:{ StreamCorruptedException -> 0x033c, FileNotFoundException -> 0x0334, IOException -> 0x0329, ClassNotFoundException -> 0x031e, RuntimeException -> 0x0313, Error -> 0x0308, InvalidKeyException -> 0x02fd, NoSuchAlgorithmException -> 0x02f2, NoSuchPaddingException -> 0x02e7, all -> 0x02e1 }
            java.lang.Object r2 = r4.readObject()     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x0338, IOException -> 0x032d, ClassNotFoundException -> 0x0322, RuntimeException -> 0x0317, Error -> 0x030c, InvalidKeyException -> 0x0301, NoSuchAlgorithmException -> 0x02f6, NoSuchPaddingException -> 0x02eb }
            com.cootek.usage.UsageData r2 = (com.cootek.usage.UsageData) r2     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x0338, IOException -> 0x032d, ClassNotFoundException -> 0x0322, RuntimeException -> 0x0317, Error -> 0x030c, InvalidKeyException -> 0x0301, NoSuchAlgorithmException -> 0x02f6, NoSuchPaddingException -> 0x02eb }
            r10 = r2
            r8 = r4
        L_0x007e:
            java.lang.String r2 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            boolean r2 = r13.containsKey(r2)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            if (r2 != 0) goto L_0x0090
            java.lang.String r2 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r13.put(r2, r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
        L_0x0090:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r2.<init>(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = "_"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Object r3 = r13.get(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r2 = r2.toString()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            if (r2 != 0) goto L_0x034b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r3.<init>()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r4.<init>()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r2.<init>(r3, r4)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r4 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r3.<init>(r4)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r4 = "_"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r4 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Object r4 = r13.get(r4)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r12.put(r3, r2)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r9 = r2
        L_0x00e9:
            java.lang.Object r2 = r9.first     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r2.add(r10)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Object r2 = r9.second     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r2.add(r6)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Object r2 = r9.first     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            int r2 = r2.size()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            long r2 = (long) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r4 = 5000(0x1388, double:2.4703E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0162
            java.lang.String r2 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Object r2 = r13.get(r2)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            int r17 = r2.intValue()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            com.cootek.usage.j r2 = new com.cootek.usage.j     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r0 = r18
            com.cootek.usage.AbsUsageAssist r3 = r0.f14534c     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r5 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Object r6 = r9.first     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r4 = r19
            r7 = r22
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            boolean r2 = r2.mo10498a()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            if (r2 == 0) goto L_0x0139
            java.lang.Object r2 = r9.second     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
        L_0x0133:
            boolean r2 = r3.hasNext()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            if (r2 != 0) goto L_0x020a
        L_0x0139:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r2.<init>(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r3 = "_"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r0 = r17
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.String r2 = r2.toString()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r12.remove(r2)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            int r2 = r17 + 1
            java.lang.String r3 = r10.type     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r13.put(r3, r2)     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
        L_0x0162:
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x026e }
        L_0x0167:
            int r2 = r11 + 1
            r11 = r2
            goto L_0x0040
        L_0x016c:
            r2 = move-exception
            r3 = r4
        L_0x016e:
            r2.printStackTrace()     // Catch:{ all -> 0x0340 }
            if (r3 == 0) goto L_0x0176
            r3.close()     // Catch:{ IOException -> 0x017a }
        L_0x0176:
            r3 = 0
            r2 = r5
            goto L_0x006a
        L_0x017a:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0182 }
            r3 = 0
            r2 = r5
            goto L_0x006a
        L_0x0182:
            r2 = move-exception
            r4 = 0
            throw r2     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x01ac, IOException -> 0x01c4, ClassNotFoundException -> 0x01dd, RuntimeException -> 0x01f8, Error -> 0x0219, InvalidKeyException -> 0x022b, NoSuchAlgorithmException -> 0x023d, NoSuchPaddingException -> 0x024f, all -> 0x0261 }
        L_0x0185:
            r2 = move-exception
        L_0x0186:
            r2.printStackTrace()     // Catch:{ all -> 0x02de }
            if (r4 == 0) goto L_0x0167
            r4.close()     // Catch:{ IOException -> 0x018f }
            goto L_0x0167
        L_0x018f:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x0194:
            r2 = move-exception
        L_0x0195:
            r2.printStackTrace()     // Catch:{ all -> 0x01bc }
            if (r4 == 0) goto L_0x019d
            r4.close()     // Catch:{ IOException -> 0x01a1 }
        L_0x019d:
            r3 = 0
            r2 = r5
            goto L_0x006a
        L_0x01a1:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x01a9 }
            r3 = 0
            r2 = r5
            goto L_0x006a
        L_0x01a9:
            r2 = move-exception
            r4 = 0
            throw r2     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x01ac, IOException -> 0x01c4, ClassNotFoundException -> 0x01dd, RuntimeException -> 0x01f8, Error -> 0x0219, InvalidKeyException -> 0x022b, NoSuchAlgorithmException -> 0x023d, NoSuchPaddingException -> 0x024f, all -> 0x0261 }
        L_0x01ac:
            r2 = move-exception
            r8 = r4
        L_0x01ae:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x01b7 }
            goto L_0x0167
        L_0x01b7:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x01bc:
            r2 = move-exception
        L_0x01bd:
            if (r4 == 0) goto L_0x01c2
            r4.close()     // Catch:{ IOException -> 0x01d4 }
        L_0x01c2:
            r4 = 0
        L_0x01c3:
            throw r2     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x01ac, IOException -> 0x01c4, ClassNotFoundException -> 0x01dd, RuntimeException -> 0x01f8, Error -> 0x0219, InvalidKeyException -> 0x022b, NoSuchAlgorithmException -> 0x023d, NoSuchPaddingException -> 0x024f, all -> 0x0261 }
        L_0x01c4:
            r2 = move-exception
            r8 = r4
        L_0x01c6:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x01cf }
            goto L_0x0167
        L_0x01cf:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x01d4:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ all -> 0x01da }
            r4 = 0
            goto L_0x01c3
        L_0x01da:
            r2 = move-exception
            r4 = 0
            throw r2     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x01ac, IOException -> 0x01c4, ClassNotFoundException -> 0x01dd, RuntimeException -> 0x01f8, Error -> 0x0219, InvalidKeyException -> 0x022b, NoSuchAlgorithmException -> 0x023d, NoSuchPaddingException -> 0x024f, all -> 0x0261 }
        L_0x01dd:
            r2 = move-exception
            r8 = r4
        L_0x01df:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x01e8 }
            goto L_0x0167
        L_0x01e8:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x01ee:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ all -> 0x01f5 }
            r3 = 0
            goto L_0x006a
        L_0x01f5:
            r2 = move-exception
            r4 = 0
            throw r2     // Catch:{ StreamCorruptedException -> 0x0185, FileNotFoundException -> 0x01ac, IOException -> 0x01c4, ClassNotFoundException -> 0x01dd, RuntimeException -> 0x01f8, Error -> 0x0219, InvalidKeyException -> 0x022b, NoSuchAlgorithmException -> 0x023d, NoSuchPaddingException -> 0x024f, all -> 0x0261 }
        L_0x01f8:
            r2 = move-exception
            r8 = r4
        L_0x01fa:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x0204 }
            goto L_0x0167
        L_0x0204:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x020a:
            java.lang.Object r2 = r3.next()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            r2.delete()     // Catch:{ StreamCorruptedException -> 0x0215, FileNotFoundException -> 0x0331, IOException -> 0x0326, ClassNotFoundException -> 0x031b, RuntimeException -> 0x0310, Error -> 0x0305, InvalidKeyException -> 0x02fa, NoSuchAlgorithmException -> 0x02ef, NoSuchPaddingException -> 0x02e4 }
            goto L_0x0133
        L_0x0215:
            r2 = move-exception
            r4 = r8
            goto L_0x0186
        L_0x0219:
            r2 = move-exception
            r8 = r4
        L_0x021b:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x0225 }
            goto L_0x0167
        L_0x0225:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x022b:
            r2 = move-exception
            r8 = r4
        L_0x022d:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x0237 }
            goto L_0x0167
        L_0x0237:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x023d:
            r2 = move-exception
            r8 = r4
        L_0x023f:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x0249 }
            goto L_0x0167
        L_0x0249:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x024f:
            r2 = move-exception
            r8 = r4
        L_0x0251:
            r2.printStackTrace()     // Catch:{ all -> 0x02dc }
            if (r8 == 0) goto L_0x0167
            r8.close()     // Catch:{ IOException -> 0x025b }
            goto L_0x0167
        L_0x025b:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x0261:
            r2 = move-exception
            r8 = r4
        L_0x0263:
            if (r8 == 0) goto L_0x0268
            r8.close()     // Catch:{ IOException -> 0x0269 }
        L_0x0268:
            throw r2
        L_0x0269:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x0268
        L_0x026e:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0167
        L_0x0274:
            java.lang.Object r2 = r10.next()
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r2 = r3.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            java.lang.String r5 = "_"
            int r5 = r2.lastIndexOf(r5)
            java.lang.String r5 = r2.substring(r4, r5)
            java.lang.Object r2 = r3.getValue()
            r8 = r2
            android.util.Pair r8 = (android.util.Pair) r8
            com.cootek.usage.j r2 = new com.cootek.usage.j
            r0 = r18
            com.cootek.usage.AbsUsageAssist r3 = r0.f14534c
            java.lang.Object r6 = r8.first
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r4 = r19
            r7 = r22
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r2 = r2.mo10498a()
            r3 = r9 & r2
            if (r2 == 0) goto L_0x02ba
            java.lang.Object r2 = r8.second
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r4 = r2.iterator()
        L_0x02b4:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L_0x02bd
        L_0x02ba:
            r9 = r3
            goto L_0x001e
        L_0x02bd:
            java.lang.Object r2 = r4.next()
            java.io.File r2 = (java.io.File) r2
            r2.delete()
            goto L_0x02b4
        L_0x02c7:
            java.lang.Object r2 = r3.next()
            com.cootek.usage.o r2 = (com.cootek.usage.C3300o) r2
            com.cootek.usage.l r4 = com.cootek.usage.C3297l.m14606a()
            java.lang.String r2 = r2.f14523a
            long r6 = java.lang.System.currentTimeMillis()
            r4.mo10500a(r2, r6)
            goto L_0x002a
        L_0x02dc:
            r2 = move-exception
            goto L_0x0263
        L_0x02de:
            r2 = move-exception
            r8 = r4
            goto L_0x0263
        L_0x02e1:
            r2 = move-exception
            r8 = r3
            goto L_0x0263
        L_0x02e4:
            r2 = move-exception
            goto L_0x0251
        L_0x02e7:
            r2 = move-exception
            r8 = r3
            goto L_0x0251
        L_0x02eb:
            r2 = move-exception
            r8 = r4
            goto L_0x0251
        L_0x02ef:
            r2 = move-exception
            goto L_0x023f
        L_0x02f2:
            r2 = move-exception
            r8 = r3
            goto L_0x023f
        L_0x02f6:
            r2 = move-exception
            r8 = r4
            goto L_0x023f
        L_0x02fa:
            r2 = move-exception
            goto L_0x022d
        L_0x02fd:
            r2 = move-exception
            r8 = r3
            goto L_0x022d
        L_0x0301:
            r2 = move-exception
            r8 = r4
            goto L_0x022d
        L_0x0305:
            r2 = move-exception
            goto L_0x021b
        L_0x0308:
            r2 = move-exception
            r8 = r3
            goto L_0x021b
        L_0x030c:
            r2 = move-exception
            r8 = r4
            goto L_0x021b
        L_0x0310:
            r2 = move-exception
            goto L_0x01fa
        L_0x0313:
            r2 = move-exception
            r8 = r3
            goto L_0x01fa
        L_0x0317:
            r2 = move-exception
            r8 = r4
            goto L_0x01fa
        L_0x031b:
            r2 = move-exception
            goto L_0x01df
        L_0x031e:
            r2 = move-exception
            r8 = r3
            goto L_0x01df
        L_0x0322:
            r2 = move-exception
            r8 = r4
            goto L_0x01df
        L_0x0326:
            r2 = move-exception
            goto L_0x01c6
        L_0x0329:
            r2 = move-exception
            r8 = r3
            goto L_0x01c6
        L_0x032d:
            r2 = move-exception
            r8 = r4
            goto L_0x01c6
        L_0x0331:
            r2 = move-exception
            goto L_0x01ae
        L_0x0334:
            r2 = move-exception
            r8 = r3
            goto L_0x01ae
        L_0x0338:
            r2 = move-exception
            r8 = r4
            goto L_0x01ae
        L_0x033c:
            r2 = move-exception
            r4 = r3
            goto L_0x0186
        L_0x0340:
            r2 = move-exception
            r4 = r3
            goto L_0x01bd
        L_0x0344:
            r2 = move-exception
            r4 = r3
            goto L_0x0195
        L_0x0348:
            r2 = move-exception
            goto L_0x016e
        L_0x034b:
            r9 = r2
            goto L_0x00e9
        L_0x034e:
            r10 = r2
            r8 = r3
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3301p.m14629a(boolean, java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    /* renamed from: b */
    private static File m14630b(File file) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            long j = currentTimeMillis - 1;
            File file2 = new File(file, String.valueOf(currentTimeMillis));
            if (!file2.exists()) {
                return file2;
            }
            currentTimeMillis = j;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m14631b(C3301p pVar) {
        if (C3292g.m14593a(pVar.f14534c.getContext())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C3292g gVar = pVar.f14538g;
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                C3292g gVar2 = pVar.f14538g;
                if (i >= 5) {
                    break;
                }
                C3292g gVar3 = pVar.f14538g;
                String a = C3292g.m14592a(i);
                long infoInterval = ((long) pVar.f14534c.getInfoInterval(i)) * 86400000;
                long b = C3297l.m14606a().mo10501b(a);
                if (infoInterval >= 0 && infoInterval + b <= currentTimeMillis) {
                    C3294i b2 = pVar.f14538g.mo10497b(i);
                    if (b2.f14474d) {
                        arrayList2.add(b2.f14471a);
                        arrayList.add(b2);
                    }
                }
                i++;
            }
            if (!arrayList.isEmpty() && new C3295j(pVar.f14534c, true, "noah_info", arrayList2, true).mo10498a()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3294i iVar = (C3294i) it.next();
                    C3297l.m14606a().mo10502b(iVar.f14473c, currentTimeMillis);
                    C3297l.m14606a().mo10504c(iVar.f14473c, iVar.f14472b);
                }
            }
        }
    }

    /* renamed from: c */
    private void m14633c() {
        Intent intent = new Intent(UsageAlarmReceiver.USAGE_ALARM);
        intent.setPackage(this.f14534c.getContext().getPackageName());
        ((AlarmManager) this.f14534c.getContext().getSystemService("alarm")).setRepeating(1, 0, this.f14534c.getAlarmInterval(), PendingIntent.getBroadcast(this.f14534c.getContext(), 0, intent, Engine.EXCEPTION_WARN));
    }

    /* renamed from: c */
    private void m14634c(File file) {
        if (file != null) {
            File fileStreamPath = this.f14534c.getContext().getFileStreamPath(this.f14534c.getStrategyFileName());
            if (this.f14534c.isDebugMode()) {
                Log.i("Usage/UsageProcessor", "Old strategy file path: " + fileStreamPath);
                Log.i("Usage/UsageProcessor", "New strategy file path: " + file);
            }
            if (!file.getAbsolutePath().equals(fileStreamPath.getAbsolutePath())) {
                Context context = this.f14534c.getContext();
                String strategyFileName = this.f14534c.getStrategyFileName();
                File fileStreamPath2 = context.getFileStreamPath(strategyFileName == null ? null : String.valueOf(strategyFileName) + C2119x.f8995a);
                if (!fileStreamPath2.exists()) {
                    try {
                        fileStreamPath2.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                C3291f.m14586a(fileStreamPath, fileStreamPath2);
                if (this.f14534c.isDebugMode()) {
                    Log.i("Usage/UsageProcessor", "strategy file: backup succeed.");
                }
                C3291f.m14586a(file, fileStreamPath);
                if (!C3298m.m14615a().mo10507b()) {
                    C3291f.m14586a(fileStreamPath2, fileStreamPath);
                    if (this.f14534c.isDebugMode()) {
                        Log.i("Usage/UsageProcessor", "Update the strategy failed, revert strategy.");
                    }
                    C3298m.m14615a().mo10507b();
                    this.f14534c.onStrategyUpdate(false);
                }
                this.f14534c.onStrategyUpdate(true);
            }
        }
    }

    /* renamed from: d */
    private void m14635d() {
        boolean a = C3292g.m14593a(this.f14534c.getContext());
        long currentTimeMillis = System.currentTimeMillis();
        File[] listFiles = this.f14534c.getFolder().listFiles();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 2) {
                boolean z = i2 == 0;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    C3300o c = C3298m.m14615a().mo10508c(name);
                    if (c.f14526d == z) {
                        if (UsageRecorder.m14564b()) {
                            Log.i("Usage/UsageProcessor", "folder: " + name + ", strategy: " + c);
                        }
                        long a2 = C3297l.m14606a().mo10499a(c.f14523a);
                        long a3 = C3297l.m14606a().mo10499a(c.f14523a);
                        if (c.f14525c >= 0 && currentTimeMillis - a2 > c.f14525c) {
                            arrayList.add(file);
                            arrayList2.add(c);
                            Log.i("Usage/UsageProcessor", "folder: " + name + "may send by mobile");
                        } else if (c.f14524b >= 0 && a && currentTimeMillis - a3 > c.f14524b) {
                            arrayList3.add(file);
                            arrayList4.add(c);
                            Log.i("Usage/UsageProcessor", "folder: " + name + "may send by wifi");
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList(arrayList3);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList5.addAll(arrayList);
                    arrayList6.addAll(arrayList2);
                    m14629a(true, arrayList5, arrayList6, z);
                }
                if (!arrayList.isEmpty()) {
                    m14629a(false, arrayList, arrayList2, z);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private String m14636e() {
        if (this.f14539h == null) {
            AbsUsageAssist absUsageAssist = this.f14534c;
            String a = AbsUsageAssist.m14559a();
            StringBuilder sb = new StringBuilder();
            char charAt = a.charAt((a.length() / 3) << 1);
            for (int i = 0; i < 1024; i++) {
                sb.append(charAt);
                a.length();
            }
            this.f14539h = sb.toString();
        }
        return this.f14539h;
    }

    /* renamed from: f */
    private void m14637f() {
        if (C3292g.m14593a(this.f14534c.getContext())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C3292g gVar = this.f14538g;
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                C3292g gVar2 = this.f14538g;
                if (i >= 5) {
                    break;
                }
                C3292g gVar3 = this.f14538g;
                String a = C3292g.m14592a(i);
                long infoInterval = ((long) this.f14534c.getInfoInterval(i)) * 86400000;
                long b = C3297l.m14606a().mo10501b(a);
                if (infoInterval >= 0 && infoInterval + b <= currentTimeMillis) {
                    C3294i b2 = this.f14538g.mo10497b(i);
                    if (b2.f14474d) {
                        arrayList2.add(b2.f14471a);
                        arrayList.add(b2);
                    }
                }
                i++;
            }
            if (!arrayList.isEmpty() && new C3295j(this.f14534c, true, "noah_info", arrayList2, true).mo10498a()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3294i iVar = (C3294i) it.next();
                    C3297l.m14606a().mo10502b(iVar.f14473c, currentTimeMillis);
                    C3297l.m14606a().mo10504c(iVar.f14473c, iVar.f14472b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10510a() {
        Message obtainMessage = this.f14536e.obtainMessage(0);
        if (this.f14534c.isDebugMode()) {
            this.f14536e.sendMessage(obtainMessage);
        } else {
            this.f14536e.sendMessageDelayed(obtainMessage, (long) new Random().nextInt((int) this.f14534c.getAlarmInterval()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10511a(File file) {
        this.f14536e.sendMessage(this.f14536e.obtainMessage(2, file));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10512a(String str, String str2, Map map) {
        if (this.f14534c.getVersionCode() >= 0) {
            map.put("app_version", Integer.valueOf(this.f14534c.getVersionCode()));
        }
        this.f14536e.sendMessage(this.f14536e.obtainMessage(1, new C3302q(this, str, str2, map)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10513b() {
        Message obtainMessage = this.f14536e.obtainMessage(3);
        if (this.f14534c.isDebugMode()) {
            this.f14536e.sendMessage(obtainMessage);
        } else {
            this.f14536e.sendMessageDelayed(obtainMessage, (long) new Random().nextInt((int) this.f14534c.getAlarmInterval()));
        }
    }
}
