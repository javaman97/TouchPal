package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.yahoo.mobile.client.share.search.commands.C4104a;
import com.yahoo.mobile.client.share.search.data.LocalData;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.contentmanager.C4125e;
import com.yahoo.mobile.client.share.search.interfaces.ILinkableContent;
import com.yahoo.mobile.client.share.search.interfaces.ISearchToLinkListener;
import com.yahoo.mobile.client.share.search.p099ui.C4189c;
import com.yahoo.mobile.client.share.search.p099ui.activity.ImageGalleryActivity;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.util.C4227a;
import com.yahoo.mobile.client.share.search.util.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.ShareWebContentFragment */
public class ShareWebContentFragment extends C4213f implements ILinkableContent {

    /* renamed from: j */
    private IYahooSearchToLinkListener f17169j;

    /* renamed from: k */
    private boolean f17170k = true;

    /* renamed from: l */
    private boolean f17171l = true;

    /* renamed from: m */
    private boolean f17172m = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4125e mo15627a() {
        return new C4125e(this, getActivity(), false, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        super.onViewCreated(view, bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            this.f17172m = arguments.getBoolean(SearchToLinkActivity.SHOULD_SHOW_COPYRIGHT, true);
            this.f17170k = arguments.getBoolean(SearchToLinkActivity.SHOULD_ENABLE_WEB_PREVIEW, true);
            this.f17171l = arguments.getBoolean(SearchToLinkActivity.SHOULD_ENABLE_IMAGE_PREVIEW, true);
        }
    }

    public void openUrlOnMinibrowser(String str, Map<String, String> map) {
        String str2;
        String str3 = null;
        if (this.f17169j != null) {
            if (map != null && !map.containsKey("pos")) {
                C4189c cVar = this.f17233i;
                Map<String, Object> b = C4189c.m17637b(str);
                if (b.containsKey("sch_pos")) {
                    str2 = (String) b.get("sch_pos");
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    HashMap hashMap = new HashMap(map);
                    hashMap.put("pos", str2);
                    map = hashMap;
                }
            }
            if (Uri.parse(str).getHost().contains("r.search.yahoo.com")) {
                new C4104a(getActivity().getApplicationContext(), Uri.parse(str)).executeCommand();
            }
            UrlUtils.m17744b(str);
            if (map != null && map.containsKey("title")) {
                str3 = map.get("title");
            }
            if (this.f17170k) {
                Intent a = C4227a.m17746a(getActivity(), str, mo15798b());
                if (str3 != null) {
                    a.putExtra("title", str3);
                }
                startActivityForResult(a, 1);
                C4227a.m17748a(getActivity());
                return;
            }
            m17665a(str, map);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            switch (i2) {
                case -1:
                    HashMap hashMap = new HashMap();
                    String stringExtra = intent.getStringExtra(SearchToLinkActivity.SOURCE_URL);
                    String stringExtra2 = intent.getStringExtra("title");
                    if (stringExtra2 != null) {
                        hashMap.put("title", stringExtra2);
                    }
                    if (stringExtra != null) {
                        m17665a(stringExtra, hashMap);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (i == 2) {
            switch (i2) {
                case -1:
                    PhotoData photoData = (PhotoData) intent.getParcelableExtra(ImageGalleryActivity.PHOTO_DATA);
                    int intExtra = intent.getIntExtra(ImageGalleryActivity.CURRENT_POS, -1);
                    if (this.f17169j != null) {
                        this.f17169j.onYahooImageSelected(photoData, intExtra);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m17665a(String str, Map<String, String> map) {
        String b = UrlUtils.m17744b(str);
        if (this.f17169j != null) {
            try {
                this.f17169j.onYahooUrlSelected(URLDecoder.decode(b, Utils.UTF8), str, map);
            } catch (UnsupportedEncodingException e) {
                this.f17169j.onYahooUrlSelected(str, str, map);
            }
        }
    }

    public void setSearchToLinkListener(ISearchToLinkListener iSearchToLinkListener) {
        this.f17169j = (IYahooSearchToLinkListener) iSearchToLinkListener;
    }

    public void onImageThumbmailTapped(String str, PhotoData photoData) {
        if (this.f17171l && C4127a.m17422d(getActivity())) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(photoData);
            startActivityForResult(C4227a.m17747a(getActivity(), str, arrayList, 0, this.f17172m), 2);
            C4227a.m17748a(getActivity());
        } else if (this.f17169j != null) {
            this.f17169j.onYahooImageSelected(photoData, photoData.getImgPos());
        }
    }

    public void onLocalResutTapped(String str, LocalData localData) {
        if (this.f17169j != null) {
            this.f17169j.onYahooLocalSelected(localData);
        }
    }

    public String getVerticalId() {
        return "sch_shr_web_screen";
    }
}
