package com.yahoo.mobile.client.share.search.data;

import android.text.Html;
import com.google.android.gms.plus.PlusShare;
import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;

public class ItemViewData {

    /* renamed from: a */
    private String f16635a = "";

    /* renamed from: b */
    private String f16636b = "";

    /* renamed from: c */
    private String f16637c = "";

    /* renamed from: d */
    private String f16638d = "";

    public String getText() {
        return this.f16635a;
    }

    public void setText(String str) {
        this.f16635a = str;
    }

    public String getUrl() {
        return this.f16636b;
    }

    public void setUrl(String str) {
        this.f16636b = str;
    }

    public boolean isTappable() {
        return !this.f16636b.isEmpty();
    }

    public String getLabel() {
        return this.f16637c;
    }

    public void setLabel(String str) {
        this.f16637c = str;
    }

    public String getPackageName() {
        return this.f16638d;
    }

    public void setPackageName(String str) {
        this.f16638d = str;
    }

    public ItemViewData(JSONObject jSONObject) throws JSONException, InvalidParameterException {
        parseJson(jSONObject);
    }

    public void parseJson(JSONObject jSONObject) throws JSONException, InvalidParameterException {
        try {
            if (jSONObject.has("txt")) {
                setText(Html.fromHtml(jSONObject.getString("txt")).toString());
                if (jSONObject.has("url")) {
                    setUrl(jSONObject.getString("url"));
                }
                if (jSONObject.has(PlusShare.KEY_CALL_TO_ACTION_LABEL)) {
                    setLabel(jSONObject.getString(PlusShare.KEY_CALL_TO_ACTION_LABEL));
                }
                if (jSONObject.has("gPlayApp")) {
                    setPackageName(jSONObject.getString("gPlayApp"));
                    return;
                }
                return;
            }
            throw new InvalidParameterException("Missing required text attribute in data.");
        } catch (JSONException e) {
            throw e;
        }
    }
}
