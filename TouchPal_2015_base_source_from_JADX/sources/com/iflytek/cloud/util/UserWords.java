package com.iflytek.cloud.util;

import android.text.TextUtils;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class UserWords {

    /* renamed from: a */
    private Hashtable<String, ArrayList<String>> f16406a;

    public UserWords() {
        this.f16406a = null;
        this.f16406a = new Hashtable<>();
    }

    public UserWords(String str) {
        this.f16406a = null;
        this.f16406a = new Hashtable<>();
        m17110a(str);
    }

    /* renamed from: a */
    private String m17109a() {
        try {
            if (this.f16406a == null) {
                C3990a.m17030a("mwords is null...");
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f16406a.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray2.put((String) it.next());
                }
                jSONObject2.put("words", jSONArray2);
                jSONObject2.put("name", next.getKey());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("userword", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private void m17110a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C3990a.m17030a("userword is null...");
                return;
            }
            JSONArray jSONArray = new JSONObject(new JSONTokener(str)).getJSONArray("userword");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                JSONArray jSONArray2 = jSONObject.getJSONArray("words");
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    String obj = jSONArray2.get(i2).toString();
                    if (arrayList != null && !arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                this.f16406a.put(jSONObject.get("name").toString(), arrayList);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private boolean m17111a(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.contains(str)) {
            return false;
        }
        arrayList.add(str);
        return true;
    }

    /* renamed from: a */
    private boolean m17112a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList == null || arrayList2 == null) {
            return false;
        }
        Iterator<String> it = arrayList2.iterator();
        while (it.hasNext()) {
            m17111a(arrayList, it.next());
        }
        return true;
    }

    public ArrayList<String> getKeys() {
        if (this.f16406a == null || this.f16406a.isEmpty()) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String add : this.f16406a.keySet()) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public ArrayList<String> getWords() {
        return getWords("default");
    }

    public ArrayList<String> getWords(String str) {
        return this.f16406a.get(str);
    }

    public boolean hasKey(String str) {
        return this.f16406a.containsKey(str);
    }

    public boolean putWord(String str) {
        return putWord("default", str);
    }

    public boolean putWord(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        ArrayList<String> words = getWords(str);
        if (words != null) {
            m17111a(words, str2);
        } else {
            ArrayList arrayList = new ArrayList();
            m17111a((ArrayList<String>) arrayList, str2);
            this.f16406a.put(str, arrayList);
        }
        return true;
    }

    public boolean putWords(String str, ArrayList<String> arrayList) {
        if (TextUtils.isEmpty(str) || arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList<String> words = getWords(str);
        if (words != null) {
            m17112a(words, arrayList);
        } else {
            m17112a((ArrayList<String>) new ArrayList(), arrayList);
            this.f16406a.put(str, arrayList);
        }
        return true;
    }

    public boolean putWords(ArrayList<String> arrayList) {
        return putWords("default", arrayList);
    }

    public String toString() {
        return m17109a();
    }
}
