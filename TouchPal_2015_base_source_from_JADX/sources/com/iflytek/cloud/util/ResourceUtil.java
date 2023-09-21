package com.iflytek.cloud.util;

import android.content.Context;
import java.io.File;

public class ResourceUtil {
    public static final String ASR_RES_PATH = "asr_res_path";
    public static final String ENGINE_DESTROY = "engine_destroy";
    public static final String ENGINE_START = "engine_start";
    public static final String GRM_BUILD_PATH = "grm_build_path";
    public static final String IVW_RES_PATH = "ivw_res_path";
    public static final String TTS_RES_PATH = "tts_res_path";

    public enum RESOURCE_TYPE {
        assets,
        res,
        path
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[SYNTHETIC, Splitter:B:33:0x0082] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17107a(android.content.Context r9, com.iflytek.cloud.util.ResourceUtil.RESOURCE_TYPE r10, java.lang.String r11) {
        /*
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x0009
            if (r9 != 0) goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.lang.String r1 = r9.getPackageResourcePath()
            com.iflytek.cloud.util.ResourceUtil$RESOURCE_TYPE r2 = com.iflytek.cloud.util.ResourceUtil.RESOURCE_TYPE.assets     // Catch:{ Exception -> 0x006d, all -> 0x007d }
            if (r10 != r2) goto L_0x0054
            android.content.res.AssetManager r2 = r9.getAssets()     // Catch:{ Exception -> 0x006d, all -> 0x007d }
            android.content.res.AssetFileDescriptor r2 = r2.openFd(r11)     // Catch:{ Exception -> 0x006d, all -> 0x007d }
            long r6 = r2.getStartOffset()     // Catch:{ Exception -> 0x008d }
            long r4 = r2.getLength()     // Catch:{ Exception -> 0x008d }
        L_0x0022:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008d }
            r3.<init>()     // Catch:{ Exception -> 0x008d }
            java.lang.String r8 = "fo|"
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch:{ Exception -> 0x008d }
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch:{ Exception -> 0x008d }
            java.lang.String r3 = "|"
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ Exception -> 0x008d }
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ Exception -> 0x008d }
            java.lang.String r3 = "|"
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ Exception -> 0x008d }
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ Exception -> 0x008d }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x008d }
            if (r2 == 0) goto L_0x0009
            r2.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x0009
        L_0x004f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x0054:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x006d, all -> 0x007d }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x006d, all -> 0x007d }
            android.content.res.Resources r3 = r9.getResources()     // Catch:{ Exception -> 0x006d, all -> 0x007d }
            android.content.res.AssetFileDescriptor r2 = r3.openRawResourceFd(r2)     // Catch:{ Exception -> 0x006d, all -> 0x007d }
            long r6 = r2.getStartOffset()     // Catch:{ Exception -> 0x008d }
            long r4 = r2.getLength()     // Catch:{ Exception -> 0x008d }
            goto L_0x0022
        L_0x006d:
            r1 = move-exception
            r2 = r0
        L_0x006f:
            r1.printStackTrace()     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0009
            r2.close()     // Catch:{ Exception -> 0x0078 }
            goto L_0x0009
        L_0x0078:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0009
        L_0x007d:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0080:
            if (r2 == 0) goto L_0x0085
            r2.close()     // Catch:{ Exception -> 0x0086 }
        L_0x0085:
            throw r0
        L_0x0086:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0085
        L_0x008b:
            r0 = move-exception
            goto L_0x0080
        L_0x008d:
            r1 = move-exception
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.ResourceUtil.m17107a(android.content.Context, com.iflytek.cloud.util.ResourceUtil$RESOURCE_TYPE, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m17108a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        return "fo|" + str + "|" + 0 + "|" + file.length();
    }

    public static String generateResourcePath(Context context, RESOURCE_TYPE resource_type, String str) {
        return resource_type == RESOURCE_TYPE.path ? m17108a(str) : m17107a(context, resource_type, str);
    }
}
