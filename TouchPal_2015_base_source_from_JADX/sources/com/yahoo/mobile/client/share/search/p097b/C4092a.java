package com.yahoo.mobile.client.share.search.p097b;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.iflytek.cloud.SpeechConstant;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import com.yahoo.mobile.client.share.search.data.TrendingData;
import com.yahoo.mobile.client.share.search.data.VideoData;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.UrlBuilderUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yahoo.mobile.client.share.search.b.a */
public final class C4092a {

    /* renamed from: a */
    private static String f16577a = null;

    /* renamed from: a */
    public static String m17324a() {
        return f16577a;
    }

    /* renamed from: a */
    public static ArrayList<SearchAssistData> m17325a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m17326a(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            e.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    private static ArrayList<SearchAssistData> m17326a(JSONObject jSONObject) throws JSONException {
        int i;
        JSONArray jSONArray = jSONObject.getJSONArray("r");
        f16577a = jSONObject.getJSONObject("l").getString("gprid");
        int length = jSONArray.length();
        if (length <= 0) {
            return null;
        }
        ArrayList<SearchAssistData> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String string = jSONObject2.getString("k");
            if (jSONObject2.has("m")) {
                i = jSONObject2.getInt("m");
            } else {
                i = 0;
            }
            int i3 = i == 13 ? 13 : 1;
            if (!C4245j.m17785a(string)) {
                arrayList.add(new SearchAssistData(string, string, i3, i, f16577a));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static SearchResponseData m17327b(String str) {
        return m17333h(str);
    }

    /* renamed from: h */
    private static SearchResponseData m17333h(String str) {
        JSONException jSONException;
        MetaData metaData;
        int i;
        int i2;
        int i3;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Settings.SHOW_PRIVACY_POLICY);
        MetaData metaData2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i4 = Settings.SHOW_PRIVACY_POLICY;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            String str2 = null;
            String str3 = null;
            if (jSONObject.has("meta")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("meta");
                if (jSONObject2.has(C1899v.f6362a)) {
                    i4 = jSONObject2.getInt(C1899v.f6362a);
                }
                if (jSONObject2.has("first")) {
                    i6 = jSONObject2.getInt("first");
                }
                if (jSONObject2.has("last")) {
                    i7 = jSONObject2.getInt("last");
                }
                if (jSONObject2.has("total")) {
                    i5 = jSONObject2.getInt("total");
                }
                if (jSONObject2.has("err")) {
                    str2 = jSONObject2.getString("err");
                }
                if (jSONObject2.has("partner")) {
                    str3 = jSONObject2.getString("partner");
                }
                i = i7;
                i2 = i5;
                i3 = i4;
                metaData2 = new MetaData(i6, i7, i4, i5, str2, str3);
            } else {
                i = 0;
                i2 = 0;
                i3 = 150;
            }
            try {
                if (jSONObject.has("results")) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("results");
                        long currentTimeMillis = System.currentTimeMillis();
                        int i8 = 0;
                        while (true) {
                            int i9 = i8;
                            if (i9 > Math.min(i3, jSONArray.length() - 1)) {
                                break;
                            }
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i9);
                            String str4 = "turlL";
                            String str5 = "thmHL";
                            String str6 = "thmWL";
                            try {
                                if (!jSONObject3.has(str4) || !jSONObject3.has(str6) || !jSONObject3.has(str5)) {
                                    str4 = "turl";
                                    str5 = "thmH";
                                    str6 = "thmW";
                                }
                                String string = jSONObject3.getString(str4);
                                int parseInt = Integer.parseInt(jSONObject3.getString(str5));
                                int parseInt2 = Integer.parseInt(jSONObject3.getString(str6));
                                String string2 = jSONObject3.getString("iurl");
                                int parseInt3 = Integer.parseInt(jSONObject3.getString("imgH"));
                                int parseInt4 = Integer.parseInt(jSONObject3.getString("imgW"));
                                String string3 = jSONObject3.getString("tit");
                                String string4 = jSONObject3.getString("imgS");
                                String optString = jSONObject3.optString("bImg");
                                String optString2 = jSONObject3.optString("bShr");
                                if (!C4245j.m17785a(string2) || !C4245j.m17785a(string)) {
                                    PhotoData photoData = new PhotoData(string2, parseInt3, parseInt4, string, parseInt, parseInt2, string4, ((long) i9) + currentTimeMillis, optString, optString2);
                                    photoData.setTitle(string3);
                                    if (jSONObject3.has("desc")) {
                                        photoData.setDescription(jSONObject3.getString("desc"));
                                    }
                                    if (jSONObject3.has("iurl")) {
                                        photoData.setOrigPhotoUrl(jSONObject3.getString("iurl"));
                                    }
                                    if (jSONObject3.has("rhost")) {
                                        photoData.setDisplayUrl(jSONObject3.getString("rhost"));
                                    }
                                    if (jSONObject3.has("rurl")) {
                                        photoData.setSourceUrl(jSONObject3.getString("rurl"));
                                    }
                                    arrayList.add(photoData);
                                    i8 = i9 + 1;
                                } else {
                                    i8 = i9 + 1;
                                }
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (!arrayList.isEmpty() && i == i2) {
                            ((PhotoData) arrayList.get(arrayList.size() - 1)).setLastImage(true);
                        }
                        metaData = metaData2;
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    return new SearchResponseData(metaData, arrayList);
                }
                metaData = metaData2;
            } catch (JSONException e4) {
                jSONException = e4;
                metaData = metaData2;
            }
        } catch (JSONException e5) {
            jSONException = e5;
            metaData = null;
            jSONException.printStackTrace();
            return new SearchResponseData(metaData, arrayList);
        }
        return new SearchResponseData(metaData, arrayList);
    }

    /* renamed from: c */
    public static SearchResponseData m17328c(String str) {
        JSONException jSONException;
        MetaData metaData;
        int i;
        MetaData metaData2;
        int i2;
        int i3;
        MetaData metaData3;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList(30);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i6 = 0;
            int i7 = 0;
            String str2 = null;
            String str3 = null;
            if (jSONObject.has("results")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("results");
                if (jSONObject2.has("meta")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("meta");
                    if (jSONObject3.has("last")) {
                        i4 = jSONObject3.getInt("last");
                    } else {
                        i4 = 0;
                    }
                    if (jSONObject3.has("total")) {
                        i5 = jSONObject3.getInt("total");
                    } else {
                        i5 = 0;
                    }
                    if (jSONObject3.has(C1899v.f6362a)) {
                        i7 = jSONObject3.getInt(C1899v.f6362a);
                    }
                    if (jSONObject3.has("err")) {
                        str2 = jSONObject3.getString("err");
                    }
                    if (jSONObject3.has("partner")) {
                        str3 = jSONObject3.getString("partner");
                    }
                    i2 = i4;
                    i3 = i5;
                    metaData3 = new MetaData(0, i4, i7, i5, str2, str3);
                } else {
                    i2 = 0;
                    i3 = 0;
                    metaData3 = null;
                }
                try {
                    if (jSONObject2.has(SearchToLinkActivity.CONTENT)) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(SearchToLinkActivity.CONTENT);
                        int min = Math.min(30, i7);
                        new StringBuilder("video result length = ").append(jSONArray.length());
                        int i8 = 0;
                        while (true) {
                            int i9 = i8;
                            if (i9 >= min) {
                                break;
                            }
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i9);
                            try {
                                String string = jSONObject4.getString(SpeechConstant.ISV_VID);
                                String string2 = jSONObject4.getString("rurl");
                                String string3 = jSONObject4.getString("turl");
                                int parseInt = Integer.parseInt(jSONObject4.getString("h"));
                                int parseInt2 = Integer.parseInt(jSONObject4.getString("w"));
                                String string4 = jSONObject4.getString("host");
                                String string5 = jSONObject4.getString("tit");
                                String string6 = jSONObject4.getString("des");
                                String string7 = jSONObject4.getString("age");
                                String string8 = jSONObject4.getString("l");
                                String optString = jSONObject4.optString("trurl");
                                if (!C4245j.m17785a(string2) && !C4245j.m17785a(string3)) {
                                    arrayList.add(new VideoData(string, string2, string3, parseInt, parseInt2, string4, string5, string6, string7, string8, optString));
                                }
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            i8 = i9 + 1;
                        }
                    }
                    i6 = i2;
                    i = i3;
                    metaData2 = metaData3;
                } catch (JSONException e2) {
                    jSONException = e2;
                    metaData = metaData3;
                }
            } else {
                i = 0;
                metaData2 = null;
            }
            try {
                if (!arrayList.isEmpty() && i6 == i) {
                    ((VideoData) arrayList.get(arrayList.size() - 1)).setLastVideo(true);
                }
                metaData = metaData2;
            } catch (JSONException e3) {
                JSONException jSONException2 = e3;
                metaData = metaData2;
                jSONException = jSONException2;
                jSONException.printStackTrace();
                jSONException.getMessage();
                return new SearchResponseData(metaData, arrayList);
            }
        } catch (JSONException e4) {
            jSONException = e4;
            metaData = null;
            jSONException.printStackTrace();
            jSONException.getMessage();
            return new SearchResponseData(metaData, arrayList);
        }
        return new SearchResponseData(metaData, arrayList);
    }

    /* renamed from: d */
    public static UrlBuilderUtils.Crumb m17329d(String str) {
        if (str != null) {
            try {
                UrlBuilderUtils.Crumb crumb = new UrlBuilderUtils.Crumb();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("pageparams")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("pageparams");
                    crumb.f17318a = jSONObject2.optString(".bcrumb");
                    crumb.f17319b = jSONObject2.optString(".crumb");
                    return crumb;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m17330e(String str) {
        if (str != null) {
            try {
                return new JSONObject(str).optString("url");
            } catch (JSONException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static SearchStatusData m17331f(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("status")) {
                    SearchStatusData searchStatusData = new SearchStatusData(jSONObject.getInt("status"), jSONObject.optString("desc"));
                    if (searchStatusData.getValidStatus() != SearchStatusData.SearchStatusEnum.VALID || !jSONObject.has("sparq")) {
                        return searchStatusData;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("sparq");
                    C4129c.m17431a(jSONObject2.optString("appid"), jSONObject2.optString("appid_key"));
                    return searchStatusData;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
        return null;
    }

    /* renamed from: g */
    public static SearchResponseData m17332g(String str) {
        if (str != null) {
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.has("candidates")) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("candidates");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                            try {
                                String string = jSONObject3.getString("searchTerm");
                                jSONObject3.getString("score");
                                String string2 = jSONObject3.getJSONArray("categories").getString(0);
                                new StringBuilder(" sTerm: ").append(string).append(" category: ").append(string2);
                                arrayList.add(new TrendingData(string, string2));
                            } catch (JSONException e) {
                            }
                        }
                        return new SearchResponseData((MetaData) null, arrayList);
                    }
                }
            } catch (JSONException e2) {
            }
        }
        return null;
    }
}
