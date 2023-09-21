package p018cn.sharesdk.wechat.friends;

import android.content.Context;
import android.graphics.Bitmap;
import com.cootek.smartinput5.net.C2225al;
import com.iflytek.speech.TextUnderstanderAidl;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;
import p018cn.sharesdk.wechat.utils.C0708h;
import p018cn.sharesdk.wechat.utils.WechatClientNotExistException;
import p018cn.sharesdk.wechat.utils.WechatHelper;

/* renamed from: cn.sharesdk.wechat.friends.Wechat */
public class Wechat extends Platform {
    public static final String NAME = Wechat.class.getSimpleName();

    /* renamed from: a */
    private String f1691a;

    /* renamed from: b */
    private boolean f1692b;

    /* renamed from: cn.sharesdk.wechat.friends.Wechat$ShareParams */
    public static class ShareParams extends WechatHelper.ShareParams {
        public ShareParams() {
            this.scene = 0;
        }
    }

    public Wechat(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean checkAuthorize(int i, Object obj) {
        WechatHelper a = WechatHelper.m3944a();
        a.mo2656a(this.context, this.f1691a);
        boolean b = a.mo2659b();
        if (!b && this.listener != null) {
            this.listener.onError(this, i, new WechatClientNotExistException());
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public void doAuthorize(String[] strArr) {
        WechatHelper a = WechatHelper.m3944a();
        a.mo2656a(this.context, this.f1691a);
        if (a.mo2659b()) {
            C0708h hVar = new C0708h(this);
            hVar.mo2674a((AuthorizeListener) new C0698a(this));
            try {
                a.mo2654a(hVar);
            } catch (Throwable th) {
                if (this.listener != null) {
                    this.listener.onError(this, 1, th);
                }
            }
        } else if (this.listener != null) {
            this.listener.onError(this, 1, new WechatClientNotExistException());
        }
    }

    /* access modifiers changed from: protected */
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        if (this.listener != null) {
            this.listener.onCancel(this, i);
        }
    }

    /* access modifiers changed from: protected */
    public void doShare(Platform.ShareParams shareParams) {
        shareParams.set(TextUnderstanderAidl.SCENE, 0);
        WechatHelper a = WechatHelper.m3944a();
        a.mo2656a(this.context, this.f1691a);
        C0708h hVar = new C0708h(this);
        if (this.f1692b) {
            try {
                a.mo2655a(hVar, shareParams);
                if (this.listener != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("ShareParams", shareParams);
                    if (this.listener != null) {
                        this.listener.onComplete(this, 9, hashMap);
                    }
                }
            } catch (Throwable th) {
                if (this.listener != null) {
                    this.listener.onError(this, 9, th);
                }
            }
        } else {
            hVar.mo2673a(shareParams, this.listener);
            try {
                a.mo2658b(hVar);
            } catch (Throwable th2) {
                if (this.listener != null) {
                    this.listener.onError(this, 9, th2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0645f.C0646a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        C0645f.C0646a aVar = new C0645f.C0646a();
        String text = shareParams.getText();
        aVar.f1573b = text;
        String imagePath = shareParams.getImagePath();
        Bitmap imageData = shareParams.getImageData();
        if (imagePath != null) {
            aVar.f1576e.add(imagePath);
        } else if (imageData != null) {
            aVar.f1577f.add(imageData);
        }
        String url = shareParams.getUrl();
        if (url != null) {
            aVar.f1574c.add(url);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("title", shareParams.getTitle());
        hashMap2.put("url", url);
        hashMap2.put("extInfo", (Object) null);
        hashMap2.put(SearchToLinkActivity.CONTENT, text);
        hashMap2.put("image", aVar.f1575d);
        hashMap2.put("musicFileUrl", url);
        aVar.f1578g = hashMap2;
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void follow(String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 6);
        }
    }

    /* access modifiers changed from: protected */
    public void getFriendList(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 2);
        }
    }

    public String getName() {
        return NAME;
    }

    public int getPlatformId() {
        return 22;
    }

    public int getVersion() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void initDevInfo(String str) {
        this.f1691a = getDevinfo("AppId");
        this.f1692b = "true".equals(getDevinfo("BypassApproval"));
        if (this.f1691a == null || this.f1691a.length() <= 0) {
            this.f1691a = getDevinfo("WechatMoments", "AppId");
            this.f1692b = "true".equals(getDevinfo("WechatMoments", "BypassApproval"));
            if (this.f1691a == null || this.f1691a.length() <= 0) {
                this.f1691a = getDevinfo("WechatFavorite", "AppId");
                if (this.f1691a != null && this.f1691a.length() > 0) {
                    System.err.println("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.");
                    return;
                }
                return;
            }
            System.err.println("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.");
        }
    }

    public boolean isValid() {
        WechatHelper a = WechatHelper.m3944a();
        a.mo2656a(this.context, this.f1691a);
        return a.mo2659b();
    }

    /* access modifiers changed from: protected */
    public void setNetworkDevinfo() {
        this.f1691a = getNetworkDevinfo(C2225al.f9397h, "AppId");
        if (this.f1691a == null || this.f1691a.length() <= 0) {
            this.f1691a = getNetworkDevinfo(23, C2225al.f9397h, "AppId");
            if (this.f1691a == null || this.f1691a.length() <= 0) {
                this.f1691a = getNetworkDevinfo(37, C2225al.f9397h, "AppId");
                if (this.f1691a != null && this.f1691a.length() > 0) {
                    System.err.println("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.");
                    return;
                }
                return;
            }
            System.err.println("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.");
        }
    }

    /* access modifiers changed from: protected */
    public void timeline(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 7);
        }
    }

    /* access modifiers changed from: protected */
    public void userInfor(String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 8);
        }
    }
}
