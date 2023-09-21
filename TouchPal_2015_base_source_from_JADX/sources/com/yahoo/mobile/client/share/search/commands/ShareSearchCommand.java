package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.net.Uri;
import com.cootek.smartinput5.net.C2225al;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.p097b.C4092a;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONStringer;

public class ShareSearchCommand extends SearchCommand {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Uri f16610a = Uri.parse("https://m.search.yahoo.com/v1.1/tiny");

    /* renamed from: g */
    private String f16611g = null;

    /* renamed from: h */
    private String f16612h;

    /* renamed from: i */
    private String f16613i = null;

    public ShareSearchCommand(Context context, SearchQuery searchQuery, SearchCommand.SearchTaskCallback searchTaskCallback, int i, String str, String str2) {
        super(context, searchQuery, searchTaskCallback);
        if (i >= 0) {
            this.f16611g = "pos_" + i;
        }
        this.f16612h = str;
        if (str2 != null) {
            this.f16613i = "hp_" + str2;
            if (this.f16613i.length() > 20) {
                this.f16613i = this.f16613i.substring(0, 20);
            }
        }
    }

    public int getCommandType() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo15088c() {
        return 1;
    }

    public SearchResponseData parseResponse(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4092a.m17330e(str));
        return new SearchResponseData((MetaData) null, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Map<String, String> mo15085a(String str) {
        Map<String, String> a = super.mo15085a(str);
        if (a != null) {
            a.put("Content-Type", "application/json");
        }
        return a;
    }

    public IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                return ShareSearchCommand.f16610a;
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo15090d() {
        String a;
        try {
            String r = C4129c.m17453r();
            String q = C4129c.m17452q();
            if (!(r == null || q == null || (a = m17377a(r, this.f16593f.getQueryString(), this.f16612h, this.f16611g, this.f16613i, q)) == null)) {
                return a.getBytes(Utils.UTF8);
            }
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }

    /* renamed from: a */
    private static String m17377a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            jSONStringer.object().key(C2225al.f9397h).value(str).key("name").value(str2).key("override_default_url").value(str3);
            if (!(str4 == null && str5 == null)) {
                jSONStringer.key("tags").array();
                if (str4 != null) {
                    jSONStringer.value(str4);
                }
                if (str5 != null) {
                    jSONStringer.value(str5);
                }
                jSONStringer.endArray();
            }
            jSONStringer.key("api_key").value(str6);
            return jSONStringer.endObject().toString().replaceAll("\\\\/", "/");
        } catch (JSONException e) {
            return null;
        }
    }
}
