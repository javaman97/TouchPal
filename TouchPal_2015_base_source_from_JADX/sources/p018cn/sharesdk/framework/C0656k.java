package p018cn.sharesdk.framework;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import dalvik.system.DexFile;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import p018cn.sharesdk.framework.p020b.C0639b;
import p018cn.sharesdk.framework.p020b.p022b.C0640a;
import p018cn.sharesdk.framework.p020b.p022b.C0642c;
import p018cn.sharesdk.framework.p020b.p022b.C0643d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.k */
public class C0656k {

    /* renamed from: a */
    private static boolean f1606a = true;

    /* renamed from: a */
    private ArrayList<Platform> m3737a(PackageInfo packageInfo, Context context) {
        Enumeration<String> entries;
        if (f1606a) {
            return m3739d(context);
        }
        ArrayList<Platform> arrayList = new ArrayList<>();
        try {
            DexFile dexFile = new DexFile(packageInfo.applicationInfo.sourceDir);
            entries = dexFile.entries();
            dexFile.close();
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
        while (entries != null && entries.hasMoreElements()) {
            String nextElement = entries.nextElement();
            if (nextElement.startsWith("cn.sharesdk") && !nextElement.contains("$")) {
                try {
                    Class<?> cls = Class.forName(nextElement);
                    if (cls != null && Platform.class.isAssignableFrom(cls) && !CustomPlatform.class.isAssignableFrom(cls)) {
                        Constructor<?> constructor = cls.getConstructor(new Class[]{Context.class});
                        constructor.setAccessible(true);
                        arrayList.add((Platform) constructor.newInstance(new Object[]{context}));
                    }
                } catch (Throwable th2) {
                    C0666e.m3838b(th2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private PackageInfo m3738c(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            for (PackageInfo next : packageManager.getInstalledPackages(8192)) {
                if (packageName.equals(next.packageName)) {
                    return next;
                }
            }
            return null;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: d */
    private ArrayList<Platform> m3739d(Context context) {
        ArrayList<Platform> arrayList = new ArrayList<>();
        for (String cls : new String[]{"cn.sharesdk.douban.Douban", "cn.sharesdk.evernote.Evernote", "cn.sharesdk.facebook.Facebook", "cn.sharesdk.netease.microblog.NetEaseMicroBlog", "cn.sharesdk.renren.Renren", "cn.sharesdk.sina.weibo.SinaWeibo", "cn.sharesdk.sohu.microblog.SohuMicroBlog", "cn.sharesdk.sohu.suishenkan.SohuSuishenkan", "cn.sharesdk.kaixin.KaiXin", "cn.sharesdk.linkedin.LinkedIn", "cn.sharesdk.system.email.Email", "cn.sharesdk.system.text.ShortMessage", "cn.sharesdk.tencent.qq.QQ", "cn.sharesdk.tencent.qzone.QZone", "cn.sharesdk.tencent.weibo.TencentWeibo", "cn.sharesdk.twitter.Twitter", "cn.sharesdk.wechat.friends.Wechat", "cn.sharesdk.wechat.moments.WechatMoments", "cn.sharesdk.wechat.favorite.WechatFavorite", "cn.sharesdk.youdao.YouDao", "cn.sharesdk.google.GooglePlus", "cn.sharesdk.foursquare.FourSquare", "cn.sharesdk.pinterest.Pinterest", "cn.sharesdk.flickr.Flickr", "cn.sharesdk.tumblr.Tumblr", "cn.sharesdk.dropbox.Dropbox", "cn.sharesdk.vkontakte.VKontakte", "cn.sharesdk.instagram.Instagram", "cn.sharesdk.yixin.friends.Yixin", "cn.sharesdk.yixin.moments.YixinMoments", "cn.sharesdk.mingdao.Mingdao"}) {
            try {
                Constructor<?> constructor = Class.forName(cls).getConstructor(new Class[]{Context.class});
                constructor.setAccessible(true);
                arrayList.add((Platform) constructor.newInstance(new Object[]{context}));
            } catch (Throwable th) {
                C0666e.m3838b(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public String mo2427a() {
        return "2.3.6";
    }

    /* renamed from: a */
    public String mo2428a(int i, String str, HashMap<Integer, HashMap<String, Object>> hashMap) {
        HashMap hashMap2 = hashMap.get(Integer.valueOf(i));
        if (hashMap2 == null) {
            return null;
        }
        Object obj = hashMap2.get(str);
        return obj == null ? null : String.valueOf(obj);
    }

    /* renamed from: a */
    public ArrayList<Platform> mo2429a(Context context) {
        PackageInfo c = m3738c(context);
        if (c == null) {
            return null;
        }
        ArrayList<Platform> a = m3737a(c, context);
        mo2434a(a);
        return a;
    }

    /* renamed from: a */
    public void mo2430a(int i, Platform platform) {
        C0643d dVar = new C0643d();
        switch (i) {
            case 1:
                dVar.f1558a = "SHARESDK_ENTER_SHAREMENU";
                break;
            case 2:
                dVar.f1558a = "SHARESDK_CANCEL_SHAREMENU";
                break;
            case 3:
                dVar.f1558a = "SHARESDK_EDIT_SHARE";
                break;
            case 4:
                dVar.f1558a = "SHARESDK_FAILED_SHARE";
                break;
            case 5:
                dVar.f1558a = "SHARESDK_CANCEL_SHARE";
                break;
        }
        if (platform != null) {
            dVar.f1559b = platform.getPlatformId();
        }
        C0639b a = C0639b.m3640a((Context) null);
        if (a != null) {
            a.mo2305a((C0642c) dVar);
        }
    }

    /* renamed from: a */
    public void mo2431a(Context context, String str, boolean z) {
        C0639b a = C0639b.m3640a(context);
        a.mo2306a(str);
        a.mo2307a(z);
    }

    /* renamed from: a */
    public void mo2432a(C0658m mVar) {
    }

    /* renamed from: a */
    public void mo2433a(String str, int i) {
        C0639b a = C0639b.m3640a((Context) null);
        if (a != null) {
            C0640a aVar = new C0640a();
            aVar.f1540b = str;
            aVar.f1539a = i;
            a.mo2305a((C0642c) aVar);
        }
    }

    /* renamed from: a */
    public void mo2434a(ArrayList<Platform> arrayList) {
        if (arrayList != null) {
            Collections.sort(arrayList, new C0657l(this));
        }
    }

    /* renamed from: a */
    public boolean mo2435a(HashMap<String, Object> hashMap, HashMap<Integer, HashMap<String, Object>> hashMap2) {
        int i;
        if (hashMap == null || hashMap.size() <= 0) {
            return false;
        }
        Iterator it = ((ArrayList) hashMap.get("fakelist")).iterator();
        while (it.hasNext()) {
            HashMap hashMap3 = (HashMap) it.next();
            try {
                i = Integer.parseInt(String.valueOf(hashMap3.get("snsplat")));
            } catch (Throwable th) {
                C0666e.m3838b(th);
                i = -1;
            }
            if (i != -1) {
                hashMap2.put(Integer.valueOf(i), hashMap3);
            }
        }
        return true;
    }

    /* renamed from: b */
    public int mo2436b() {
        return 31;
    }

    /* renamed from: b */
    public void mo2437b(Context context) {
        C0639b.m3640a(context).mo2304a();
    }
}
