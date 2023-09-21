package com.yahoo.mobile.client.share.search.p099ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.cootek.smartinput5.net.C2225al;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.C4104a;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.commands.ShareSearchCommand;
import com.yahoo.mobile.client.share.search.data.LocalData;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.VideoData;
import com.yahoo.mobile.client.share.search.data.WebData;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.p099ui.container.C4194a;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4208c;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4209d;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.ContentFragment;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.IYahooSearchToLinkListener;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.ShareWebContentFragment;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.suggest.ISuggestContainer;
import com.yahoo.mobile.client.share.search.util.C4242g;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
/* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchToLinkActivity */
public class SearchToLinkActivity extends SearchActivity implements SearchCommand.SearchTaskCallback, IYahooSearchToLinkListener {
    public static final String ATTRIB_URL = "attrib_url";
    public static final String CONTENT = "content";
    public static final int CUSTOM = 1000;
    public static final String DESCRIPTION = "description";
    public static final String DESTINATION_ADDRESS = "destination_address";
    public static final String FULL_URL = "full_url";
    public static final int IMAGES = 2;
    public static final int LOCAL = 4;
    public static final String SHARED_OBJECT_TYPE = "type";
    public static final String SHARE_BUNDLE = "share_bundle";
    public static final String SHARE_ERROR_CODE = "share_error_code";
    public static final String SHARE_ERROR_MESSAGE = "share_error_message";
    public static final String SHORT_URL = "short_url";
    public static final String SHOULD_ENABLE_IMAGE_PREVIEW = "should_enable_image_preview";
    public static final String SHOULD_ENABLE_WEB_PREVIEW = "should_enable_web_preview";
    public static final String SHOULD_SHOW_COPYRIGHT = "should_show_copyright";
    public static final String SOURCE_URL = "source_url";
    public static final String THUMBNAIL_URL = "thumbnail_url";
    public static final String TITLE = "title";
    public static final int VIDEOS = 3;
    public static final int WEB = 1;

    /* renamed from: n */
    protected ShareSearchCommand f17050n;

    /* renamed from: o */
    private WebData f17051o;

    /* renamed from: p */
    private VideoData f17052p;

    /* renamed from: q */
    private PhotoData f17053q;

    /* renamed from: r */
    private LocalData f17054r;

    /* renamed from: s */
    private Bundle f17055s;

    /* renamed from: t */
    private int f17056t = -1;

    /* renamed from: u */
    private Intent f17057u = null;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchToLinkActivity$ShareActivityError */
    public enum ShareActivityError {
        URL_SHORTENER_ACCOUNT_NOT_SET,
        LOCALE_NOT_SUPPORTED
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchToLinkActivity$IntentBuilder */
    public static class IntentBuilder extends SearchActivity.IntentBuilder {

        /* renamed from: a */
        private static String f17060a = "SearchToLinkActivity.IntentBuilder";

        /* renamed from: b */
        private boolean f17061b = true;

        /* renamed from: c */
        private boolean f17062c = true;

        /* renamed from: d */
        private boolean f17063d = true;

        public IntentBuilder showCopyrightMessage(boolean z) {
            this.f17061b = z;
            return this;
        }

        public IntentBuilder addWebVertical() {
            return (IntentBuilder) addVertical(ShareWebContentFragment.class.getName(), new Bundle());
        }

        public IntentBuilder addImageVertical() {
            return (IntentBuilder) addVertical(C4208c.class.getName(), new Bundle());
        }

        public IntentBuilder addVideoVertical() {
            return (IntentBuilder) addVertical(C4209d.class.getName(), new Bundle());
        }

        public IntentBuilder setWebPreviewEnabled(boolean z) {
            this.f17062c = z;
            return this;
        }

        public IntentBuilder setImagePreviewEnabled(boolean z) {
            this.f17063d = z;
            return this;
        }

        public Intent buildIntent(Context context) {
            Intent buildIntent = super.buildIntent(context);
            buildIntent.putExtra(SearchToLinkActivity.SHOULD_SHOW_COPYRIGHT, this.f17061b);
            buildIntent.putExtra(SearchToLinkActivity.SHOULD_ENABLE_WEB_PREVIEW, this.f17062c);
            buildIntent.putExtra(SearchToLinkActivity.SHOULD_ENABLE_IMAGE_PREVIEW, this.f17063d);
            return buildIntent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Intent mo15609a(Context context) {
            return new Intent(context, SearchToLinkActivity.class);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15596a() {
        super.mo15596a();
        if (!(C4129c.m17452q() != null)) {
            getLocalClassName();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15597a(ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        if (!getResources().getConfiguration().locale.toString().equals(bundle != null ? bundle.getString(C2225al.f9400k) : null)) {
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        if (this.f17007f == null) {
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = false;
            if (getIntent() != null) {
                z = getIntent().getBooleanExtra(SHOULD_SHOW_COPYRIGHT, true);
                z2 = getIntent().getBooleanExtra(SHOULD_ENABLE_WEB_PREVIEW, true);
                z3 = getIntent().getBooleanExtra(SHOULD_ENABLE_IMAGE_PREVIEW, true);
                z4 = getIntent().getBooleanExtra(SearchActivity.TRANS_BACKGROUND, false);
            }
            this.f17007f = new C4194a(this, bundle2, getSupportFragmentManager(), this.f17010i, this.f17009h, mo15600d(), mo15601e(), z4, z, z2, z3, this) {
            };
            this.f17007f.setHeaderView(viewGroup);
            this.f17008g = (ViewGroup) findViewById(C4073a.C4081h.search_pager);
            this.f17008g.setVisibility(4);
            this.f17009h.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<ISuggestContainer> mo15598b() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15599c() {
        if (this.f17057u != null) {
            m17623a(this.f17057u);
            setResult(-1, this.f17057u);
            return;
        }
        this.f17057u = new Intent();
        m17623a(this.f17057u);
        setResult(0, this.f17057u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Bundle> mo15602f() {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        bundle.putString(SearchActivity.TAB_CLASS_NAME_KEY, ShareWebContentFragment.class.getName());
        arrayList.add(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString(SearchActivity.TAB_CLASS_NAME_KEY, C4208c.class.getName());
        arrayList.add(bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putString(SearchActivity.TAB_CLASS_NAME_KEY, C4209d.class.getName());
        arrayList.add(bundle3);
        return arrayList;
    }

    /* renamed from: a */
    private void m17623a(Intent intent) {
        boolean z = false;
        if (this.f17007f != null) {
            z = this.f17007f.didGetSearchResults();
        }
        intent.putExtra(SearchActivity.SUCCESSFUL_SEARCH_MADE, z);
    }

    /* renamed from: h */
    private void m17626h() {
        getWindow().setFlags(16, 16);
    }

    public void onProgressReceived(SearchCommand searchCommand, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
        switch (searchProgressEnum) {
            case EXECUTING:
                SearchResultFragment currentFragment = this.f17007f.getCurrentFragment();
                if (currentFragment instanceof ContentFragment) {
                    ((ContentFragment) currentFragment).showSpinnerView();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onYahooUrlSelected(String str, String str2, Map<String, String> map) {
        int i;
        if (map == null || !map.containsKey("pos")) {
            i = -1;
        } else {
            i = Integer.parseInt(map.get("pos"));
        }
        m17625a(str, i, 959513156);
        String str3 = "";
        if (map != null && map.containsKey("title")) {
            str3 = map.get("title");
        }
        this.f17051o = new WebData(str, str2, str3, "", "");
        this.f17056t = 1;
        m17622a(i, str);
        m17626h();
    }

    public void onYahooVideoSelected(VideoData videoData, int i) {
        this.f17052p = videoData;
        m17625a(this.f17052p.getVideoUrl(), i, 959513158);
        String beaconUrl = videoData.getBeaconUrl();
        if (!TextUtils.isEmpty(beaconUrl) && C4129c.m17448m()) {
            new C4104a(getApplicationContext(), Uri.parse(beaconUrl)).executeCommand();
        }
        this.f17056t = 3;
        m17622a(i, this.f17052p.getVideoUrl());
        m17626h();
    }

    public void onYahooImageSelected(PhotoData photoData, int i) {
        this.f17053q = photoData;
        m17625a(this.f17053q.getOrigPhotoUrl(), this.f17053q.getImgPos(), 959513157);
        String beaconShareUrl = photoData.getBeaconShareUrl();
        if (!TextUtils.isEmpty(beaconShareUrl) && C4129c.m17448m()) {
            new C4104a(getApplicationContext(), Uri.parse(beaconShareUrl)).executeCommand();
        }
        this.f17056t = 2;
        m17622a(photoData.getImgPos(), photoData.getSourceUrl());
        m17626h();
    }

    public void onYahooLocalSelected(LocalData localData) {
        this.f17054r = localData;
        m17625a(localData.getSourceUrl(), -1, 959513156);
        this.f17056t = 4;
        m17622a(-1, localData.getSourceUrl());
        m17626h();
    }

    public void onContentSelected(Bundle bundle) {
        this.f17056t = 1000;
        this.f17055s = bundle;
        m17624a((String) null);
    }

    /* renamed from: a */
    private void m17622a(int i, String str) {
        if (C4129c.m17443h()) {
            this.f17050n = new ShareSearchCommand(this, this.f17003b.getQuery(), this, i, str, C4129c.m17451p());
            this.f17050n.executeCommand();
            return;
        }
        m17624a((String) null);
    }

    /* renamed from: a */
    private static void m17625a(String str, int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("sch_pos", Integer.valueOf(i + 1));
        hashMap.put("sch_url", str);
        C4242g.m17773a(j, "schshr_share_action", hashMap);
    }

    /* renamed from: a */
    private void m17624a(String str) {
        this.f17057u = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("type", this.f17056t);
        switch (this.f17056t) {
            case 1:
                bundle.putString(SOURCE_URL, this.f17051o.getSourceUrl());
                bundle.putString(ATTRIB_URL, this.f17051o.getTrackUrl());
                bundle.putString("title", this.f17051o.getTitle());
                if (str != null) {
                    bundle.putString(SHORT_URL, str);
                    break;
                }
                break;
            case 2:
                bundle.putString(THUMBNAIL_URL, this.f17053q.getThumbnailUrl());
                bundle.putString(SOURCE_URL, this.f17053q.getSourceUrl());
                bundle.putString("title", this.f17053q.getTitle());
                bundle.putString("description", this.f17053q.getDescription());
                bundle.putString(FULL_URL, this.f17053q.getPhotoUrl());
                if (str != null) {
                    bundle.putString(SHORT_URL, str);
                    break;
                }
                break;
            case 3:
                bundle.putString(THUMBNAIL_URL, this.f17052p.getThumbnailUrl());
                bundle.putString(SOURCE_URL, this.f17052p.getVideoUrl());
                bundle.putString("title", this.f17052p.getTitle());
                bundle.putString("description", this.f17052p.getDescription());
                if (str != null) {
                    bundle.putString(SHORT_URL, str);
                    break;
                }
                break;
            case 4:
                bundle.putString(SOURCE_URL, this.f17054r.getSourceUrl());
                bundle.putString("title", this.f17054r.getTitle());
                bundle.putString(DESTINATION_ADDRESS, this.f17054r.getAddress());
                if (str != null) {
                    bundle.putString(SHORT_URL, str);
                    break;
                }
                break;
            case 1000:
                bundle.putBundle(CONTENT, this.f17055s);
                break;
        }
        this.f17057u.putExtra(SHARE_BUNDLE, bundle);
        finish();
    }

    public void onSearchBoxFocusChange(boolean z) {
    }

    public void onSearchTaskCompleted(SearchCommand searchCommand, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        ArrayList<? extends Object> responseList;
        if (searchResponseData != null && (responseList = searchResponseData.getResponseList()) != null && responseList.size() != 0) {
            m17624a((String) responseList.get(0));
        }
    }

    public void onSearchTaskError(SearchCommand searchCommand, SearchError searchError, SearchQuery searchQuery) {
        m17624a((String) null);
    }

    public void onSearchTaskCancelled(SearchCommand searchCommand, SearchQuery searchQuery) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
