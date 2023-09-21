package p018cn.sharesdk.wechat.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.iflytek.speech.TextUnderstanderAidl;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLConnection;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;
import p018cn.sharesdk.framework.p019a.C0617h;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0663b;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.wechat.utils.WechatHelper */
public class WechatHelper {

    /* renamed from: a */
    private static boolean f1697a = false;

    /* renamed from: b */
    private static WechatHelper f1698b;

    /* renamed from: c */
    private C0707g f1699c = new C0707g();

    /* renamed from: d */
    private C0708h f1700d;

    /* renamed from: cn.sharesdk.wechat.utils.WechatHelper$ShareParams */
    public static class ShareParams extends Platform.ShareParams {
        public String extInfo;
        public String filePath;
        public Bitmap imageData;
        public String imageUrl;
        public String musicUrl;
        protected int scene;
        public int shareType;
        public String title;
        public String url;
    }

    private WechatHelper() {
    }

    /* renamed from: a */
    public static WechatHelper m3944a() {
        if (f1698b == null) {
            f1698b = new WechatHelper();
        }
        return f1698b;
    }

    /* renamed from: a */
    private void m3945a(WXMediaMessage wXMediaMessage, String str, int i, C0708h hVar) {
        Class<?> cls;
        String str2 = new C0663b(hVar.mo2676b().getContext()).mo2487p() + ".wxapi.WXEntryActivity";
        try {
            cls = Class.forName(str2);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            cls = null;
        }
        if (cls != null && !WechatHandlerActivity.class.isAssignableFrom(cls)) {
            String str3 = str2 + " does not extend from " + WechatHandlerActivity.class.getName();
            if (f1697a) {
                throw new Throwable(str3);
            }
            new Throwable(str3).printStackTrace();
        }
        C0704d dVar = new C0704d();
        dVar.f1720c = str + System.currentTimeMillis();
        dVar.f1711a = wXMediaMessage;
        dVar.f1712b = i;
        this.f1700d = hVar;
        this.f1699c.mo2667a((C0709i) dVar);
    }

    /* renamed from: a */
    private void m3946a(String str, String str2, int i, C0708h hVar) {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = str2;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = str2;
        m3945a(wXMediaMessage, "text", i, hVar);
    }

    /* renamed from: a */
    private void m3947a(String str, String str2, Bitmap bitmap, int i, C0708h hVar) {
        WXImageObject wXImageObject = new WXImageObject();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXImageObject.imageData = byteArrayOutputStream.toByteArray();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = m3954a(wXImageObject.imageData);
        m3945a(wXMediaMessage, "img", i, hVar);
    }

    /* renamed from: a */
    private void m3948a(String str, String str2, String str3, int i, C0708h hVar) {
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.imagePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = m3953a(str3);
        m3945a(wXMediaMessage, "img", i, hVar);
    }

    /* renamed from: a */
    private void m3949a(String str, String str2, String str3, Bitmap bitmap, int i, C0708h hVar) {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXMediaMessage.thumbData = m3954a(byteArrayOutputStream.toByteArray());
        m3945a(wXMediaMessage, "video", i, hVar);
    }

    /* renamed from: a */
    private void m3950a(String str, String str2, String str3, String str4, int i, C0708h hVar) {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.thumbData = m3953a(str4);
        m3945a(wXMediaMessage, "video", i, hVar);
    }

    /* renamed from: a */
    private void m3951a(String str, String str2, String str3, String str4, Bitmap bitmap, int i, C0708h hVar) {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXMediaMessage.thumbData = m3954a(byteArrayOutputStream.toByteArray());
        m3945a(wXMediaMessage, "music", i, hVar);
    }

    /* renamed from: a */
    private void m3952a(String str, String str2, String str3, String str4, String str5, int i, C0708h hVar) {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = m3953a(str5);
        m3945a(wXMediaMessage, "music", i, hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m3953a(java.lang.String r9) {
        /*
            r8 = this;
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.io.File r1 = new java.io.File
            r1.<init>(r9)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0013
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        L_0x0013:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            java.lang.String r2 = r8.m3955b((java.lang.String) r9)
            java.lang.String r3 = "png"
            boolean r3 = r2.endsWith(r3)
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "gif"
            boolean r2 = r2.endsWith(r3)
            if (r2 == 0) goto L_0x002b
        L_0x0029:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
        L_0x002b:
            long r2 = r1.length()
            double r2 = (double) r2
            r4 = 4674736413210574848(0x40e0000000000000, double:32768.0)
            double r2 = r2 / r4
            double r2 = r2 - r6
        L_0x0034:
            double r2 = r2 + r6
            double r4 = java.lang.Math.ceil(r2)
            int r1 = (int) r4
            android.graphics.Bitmap r1 = p018cn.sharesdk.framework.utils.C0661R.getBitmap((java.lang.String) r9, (int) r1)
            if (r1 != 0) goto L_0x0048
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "checkArgs fail, thumbData is null"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            boolean r4 = r1.isRecycled()
            if (r4 == 0) goto L_0x0056
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "checkArgs fail, thumbData is recycled"
            r0.<init>(r1)
            throw r0
        L_0x0056:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 100
            r1.compress(r0, r5, r4)
            r4.flush()
            r4.close()
            if (r1 == 0) goto L_0x0071
            boolean r5 = r1.isRecycled()
            if (r5 != 0) goto L_0x0071
            r1.recycle()
        L_0x0071:
            byte[] r1 = r4.toByteArray()
            if (r1 == 0) goto L_0x007d
            int r4 = r1.length
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r4 > r5) goto L_0x0034
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.wechat.utils.WechatHelper.m3953a(java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m3954a(byte[] r12) {
        /*
            r11 = this;
            r10 = 1
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = r12.length
            double r0 = (double) r0
            r2 = 4674736413210574848(0x40e0000000000000, double:32768.0)
            double r0 = r0 / r2
            double r2 = r0 - r8
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r12)
            java.lang.String r1 = java.net.URLConnection.guessContentTypeFromStream(r0)
            r0.close()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = "png"
            boolean r4 = r1.endsWith(r4)
            if (r4 != 0) goto L_0x002a
            java.lang.String r4 = "gif"
            boolean r1 = r1.endsWith(r4)
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
        L_0x002c:
            double r2 = r2 + r8
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r12)
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565
            r4.inPreferredConfig = r5
            r4.inPurgeable = r10
            r4.inInputShareable = r10
            double r6 = java.lang.Math.ceil(r2)
            int r5 = (int) r6
            r4.inSampleSize = r5
            r5 = 0
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r1, r5, r4)
            r1.close()
            if (r4 != 0) goto L_0x0058
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "checkArgs fail, thumbData is null"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            boolean r1 = r4.isRecycled()
            if (r1 == 0) goto L_0x0066
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "checkArgs fail, thumbData is recycled"
            r0.<init>(r1)
            throw r0
        L_0x0066:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r5 = 100
            r4.compress(r0, r5, r1)
            r1.flush()
            r1.close()
            if (r4 == 0) goto L_0x0081
            boolean r5 = r4.isRecycled()
            if (r5 != 0) goto L_0x0081
            r4.recycle()
        L_0x0081:
            byte[] r1 = r1.toByteArray()
            if (r1 == 0) goto L_0x008d
            int r4 = r1.length
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r4 > r5) goto L_0x002c
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.wechat.utils.WechatHelper.m3954a(byte[]):byte[]");
    }

    /* renamed from: b */
    private String m3955b(String str) {
        String str2;
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        if (contentTypeFor != null && contentTypeFor.length() > 0) {
            return contentTypeFor;
        }
        if (str.toLowerCase().endsWith("jpg") || str.toLowerCase().endsWith("jepg")) {
            return "image/jpeg";
        }
        if (str.toLowerCase().endsWith("png")) {
            return "image/png";
        }
        if (str.toLowerCase().endsWith("gif")) {
            return "image/gif";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            str2 = URLConnection.guessContentTypeFromStream(fileInputStream);
            fileInputStream.close();
        } catch (Throwable th) {
            C0666e.m3838b(th);
            str2 = null;
        }
        return (str2 == null || str2.length() <= 0) ? "application/octet-stream" : str2;
    }

    /* renamed from: b */
    private void m3956b(String str, String str2, Bitmap bitmap, int i, C0708h hVar) {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        wXEmojiObject.emojiData = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = m3954a(wXEmojiObject.emojiData);
        m3945a(wXMediaMessage, "emoji", i, hVar);
    }

    /* renamed from: b */
    private void m3957b(String str, String str2, String str3, int i, C0708h hVar) {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        wXEmojiObject.emojiPath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = m3953a(str3);
        m3945a(wXMediaMessage, "emoji", i, hVar);
    }

    /* renamed from: b */
    private void m3958b(String str, String str2, String str3, Bitmap bitmap, int i, C0708h hVar) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (bitmap != null && !bitmap.isRecycled()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            wXMediaMessage.thumbData = m3954a(byteArrayOutputStream.toByteArray());
            if (wXMediaMessage.thumbData == null) {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            } else if (wXMediaMessage.thumbData.length > 32768) {
                throw new RuntimeException("checkArgs fail, thumbData is too large: " + wXMediaMessage.thumbData.length + " > " + 32768);
            }
        }
        m3945a(wXMediaMessage, "webpage", i, hVar);
    }

    /* renamed from: b */
    private void m3959b(String str, String str2, String str3, String str4, int i, C0708h hVar) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (str4 != null && new File(str4).exists()) {
            wXMediaMessage.thumbData = m3953a(str4);
            if (wXMediaMessage.thumbData == null) {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            } else if (wXMediaMessage.thumbData.length > 32768) {
                throw new RuntimeException("checkArgs fail, thumbData is too large: " + wXMediaMessage.thumbData.length + " > " + 32768);
            }
        }
        m3945a(wXMediaMessage, "webpage", i, hVar);
    }

    /* renamed from: b */
    private void m3960b(String str, String str2, String str3, String str4, Bitmap bitmap, int i, C0708h hVar) {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXMediaMessage.thumbData = m3954a(byteArrayOutputStream.toByteArray());
        m3945a(wXMediaMessage, "appdata", i, hVar);
    }

    /* renamed from: b */
    private void m3961b(String str, String str2, String str3, String str4, String str5, int i, C0708h hVar) {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        wXMediaMessage.thumbData = m3953a(str5);
        m3945a(wXMediaMessage, "appdata", i, hVar);
    }

    /* renamed from: c */
    private void m3962c(String str, String str2, String str3, Bitmap bitmap, int i, C0708h hVar) {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXFileObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXMediaMessage.thumbData = m3954a(byteArrayOutputStream.toByteArray());
        m3945a(wXMediaMessage, "filedata", i, hVar);
    }

    /* renamed from: c */
    private void m3963c(String str, String str2, String str3, String str4, int i, C0708h hVar) {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.thumbData = m3953a(str4);
        m3945a(wXMediaMessage, "filedata", i, hVar);
    }

    /* renamed from: a */
    public void mo2654a(C0708h hVar) {
        this.f1700d = hVar;
        C0701a aVar = new C0701a();
        aVar.f1704a = "post_timeline";
        aVar.f1705b = "none";
        this.f1699c.mo2667a((C0709i) aVar);
    }

    /* renamed from: a */
    public void mo2655a(C0708h hVar, Platform.ShareParams shareParams) {
        Platform b = hVar.mo2676b();
        String imagePath = shareParams.getImagePath();
        String imageUrl = shareParams.getImageUrl();
        if (TextUtils.isEmpty(imagePath) || !new File(imagePath).exists()) {
            Bitmap imageData = shareParams.getImageData();
            if (imageData != null && !imageData.isRecycled()) {
                File file = new File(C0661R.getCachePath(b.getContext(), "images"), System.currentTimeMillis() + ".png");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                imageData.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                imagePath = file.getAbsolutePath();
            } else if (imageUrl != null) {
                imagePath = C0617h.m3549a().mo2203a(b.getContext(), imageUrl);
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        String shortLintk = b.getShortLintk(shareParams.getText(), false);
        intent.putExtra("android.intent.extra.TEXT", shortLintk);
        intent.putExtra("Kdescription", shortLintk);
        if (!TextUtils.isEmpty(imagePath)) {
            File file2 = new File(imagePath);
            if (file2.exists()) {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file2));
                String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(imagePath);
                if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                    contentTypeFor = "image/*";
                }
                intent.setType(contentTypeFor);
            }
        } else {
            intent.setType("text/plain");
        }
        intent.setClassName("com.tencent.mm", ((Integer) shareParams.get(TextUnderstanderAidl.SCENE, Integer.class)).intValue() == 1 ? "com.tencent.mm.ui.tools.ShareToTimeLineUI" : "com.tencent.mm.ui.tools.ShareImgUI");
        intent.addFlags(Engine.EXCEPTION_ERROR);
        b.getContext().startActivity(intent);
    }

    /* renamed from: a */
    public boolean mo2656a(Context context, String str) {
        return this.f1699c.mo2669a(context, str);
    }

    /* renamed from: a */
    public boolean mo2657a(WechatHandlerActivity wechatHandlerActivity) {
        return this.f1699c.mo2670a(wechatHandlerActivity, this.f1700d);
    }

    /* renamed from: b */
    public void mo2658b(C0708h hVar) {
        Platform b = hVar.mo2676b();
        Platform.ShareParams a = hVar.mo2672a();
        PlatformActionListener c = hVar.mo2677c();
        int shareType = a.getShareType();
        String title = a.getTitle();
        String text = a.getText();
        int scence = a.getScence();
        String imagePath = a.getImagePath();
        String imageUrl = a.getImageUrl();
        Bitmap imageData = a.getImageData();
        String musicUrl = a.getMusicUrl();
        String url = a.getUrl();
        String filePath = a.getFilePath();
        String extInfo = a.getExtInfo();
        switch (shareType) {
            case 1:
                m3946a(title, text, scence, hVar);
                return;
            case 2:
                if (imagePath != null && imagePath.length() > 0) {
                    m3948a(title, text, imagePath, scence, hVar);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m3947a(title, text, imageData, scence, hVar);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m3948a(title, text, "", scence, hVar);
                    return;
                } else {
                    m3948a(title, text, C0617h.m3549a().mo2203a(b.getContext(), imageUrl), scence, hVar);
                    return;
                }
            case 4:
                String shortLintk = b.getShortLintk(url, false);
                if (imagePath != null && imagePath.length() > 0) {
                    m3959b(title, text, shortLintk, imagePath, scence, hVar);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m3958b(title, text, shortLintk, imageData, scence, hVar);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m3959b(title, text, shortLintk, "", scence, hVar);
                    return;
                } else {
                    m3959b(title, text, shortLintk, C0617h.m3549a().mo2203a(b.getContext(), imageUrl), scence, hVar);
                    return;
                }
            case 5:
                String shortLintk2 = b.getShortLintk(musicUrl + " " + url, false);
                String str = shortLintk2.split(" ")[0];
                String str2 = shortLintk2.split(" ")[1];
                if (imagePath != null && imagePath.length() > 0) {
                    m3952a(title, text, str, str2, imagePath, scence, hVar);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m3951a(title, text, str, str2, imageData, scence, hVar);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m3952a(title, text, str, str2, "", scence, hVar);
                    return;
                } else {
                    m3952a(title, text, str, str2, C0617h.m3549a().mo2203a(b.getContext(), imageUrl), scence, hVar);
                    return;
                }
            case 6:
                String shortLintk3 = b.getShortLintk(url, false);
                if (imagePath != null && imagePath.length() > 0) {
                    m3950a(title, text, shortLintk3, imagePath, scence, hVar);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m3949a(title, text, shortLintk3, imageData, scence, hVar);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m3950a(title, text, shortLintk3, "", scence, hVar);
                    return;
                } else {
                    m3950a(title, text, shortLintk3, C0617h.m3549a().mo2203a(b.getContext(), imageUrl), scence, hVar);
                    return;
                }
            case 7:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SAHRE_APP");
                } else if (scence == 2) {
                    throw new Throwable("WechatFavorite does not support SAHRE_APP");
                } else if (imagePath != null && imagePath.length() > 0) {
                    m3961b(title, text, filePath, extInfo, imagePath, scence, hVar);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m3960b(title, text, filePath, extInfo, imageData, scence, hVar);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m3961b(title, text, filePath, extInfo, "", scence, hVar);
                    return;
                } else {
                    m3961b(title, text, filePath, extInfo, C0617h.m3549a().mo2203a(b.getContext(), imageUrl), scence, hVar);
                    return;
                }
            case 8:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SHARE_FILE");
                } else if (imagePath != null && imagePath.length() > 0) {
                    m3963c(title, text, filePath, imagePath, scence, hVar);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m3962c(title, text, filePath, imageData, scence, hVar);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m3963c(title, text, filePath, "", scence, hVar);
                    return;
                } else {
                    m3963c(title, text, filePath, C0617h.m3549a().mo2203a(b.getContext(), imageUrl), scence, hVar);
                    return;
                }
            case 9:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SHARE_EMOJI");
                } else if (scence == 2) {
                    throw new Throwable("WechatFavorite does not support SHARE_EMOJI");
                } else if (imagePath != null && imagePath.length() > 0) {
                    m3957b(title, text, imagePath, scence, hVar);
                    return;
                } else if (imageUrl != null && imageUrl.length() > 0) {
                    m3957b(title, text, C0617h.m3549a().mo2203a(b.getContext(), imageUrl), scence, hVar);
                    return;
                } else if (imageData == null || imageData.isRecycled()) {
                    m3957b(title, text, "", scence, hVar);
                    return;
                } else {
                    m3956b(title, text, imageData, scence, hVar);
                    return;
                }
            default:
                if (c != null) {
                    c.onError(b, 9, new IllegalArgumentException("shareType = " + shareType));
                    return;
                }
                return;
        }
    }

    /* renamed from: b */
    public boolean mo2659b() {
        return this.f1699c.mo2668a();
    }

    /* renamed from: c */
    public boolean mo2660c() {
        return this.f1699c.mo2671b();
    }
}
