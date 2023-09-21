package p100m.framework.p102b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m.framework.b.d */
/* compiled from: Hashon */
public class C4281d {
    /* renamed from: a */
    public HashMap<String, Object> mo15973a(String str) {
        try {
            if (str.startsWith("[") && str.endsWith("]")) {
                str = "{\"fakelist\":" + str + "}";
            }
            return m17917a(new JSONObject(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return new HashMap<>();
        }
    }

    /* renamed from: a */
    private HashMap<String, Object> m17917a(JSONObject jSONObject) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (JSONObject.NULL.equals(opt)) {
                opt = null;
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    opt = m17917a((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = m17916a((JSONArray) opt);
                }
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private ArrayList<Object> m17916a(JSONArray jSONArray) throws JSONException {
        ArrayList<Object> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                opt = m17917a((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                opt = m17916a((JSONArray) opt);
            }
            arrayList.add(opt);
        }
        return arrayList;
    }

    /* renamed from: a */
    public String mo15972a(HashMap<String, Object> hashMap) {
        try {
            return m17921b(hashMap).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private JSONObject m17921b(HashMap<String, Object> hashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : hashMap.entrySet()) {
            Object value = next.getValue();
            if (value instanceof HashMap) {
                value = m17921b((HashMap<String, Object>) (HashMap) value);
            } else if (value instanceof ArrayList) {
                value = m17918a((ArrayList<Object>) (ArrayList) value);
            } else if (m17919a(value)) {
                value = m17918a((ArrayList<Object>) m17920b(value));
            }
            jSONObject.put((String) next.getKey(), value);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m17919a(Object obj) {
        return (obj instanceof byte[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof char[]) || (obj instanceof boolean[]) || (obj instanceof String[]);
    }

    /* renamed from: b */
    private ArrayList<?> m17920b(Object obj) {
        int i = 0;
        if (obj instanceof byte[]) {
            ArrayList<?> arrayList = new ArrayList<>();
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            while (i < length) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof short[]) {
            ArrayList<?> arrayList2 = new ArrayList<>();
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            while (i < length2) {
                arrayList2.add(Short.valueOf(sArr[i]));
                i++;
            }
            return arrayList2;
        } else if (obj instanceof int[]) {
            ArrayList<?> arrayList3 = new ArrayList<>();
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                arrayList3.add(Integer.valueOf(iArr[i]));
                i++;
            }
            return arrayList3;
        } else if (obj instanceof long[]) {
            ArrayList<?> arrayList4 = new ArrayList<>();
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            while (i < length4) {
                arrayList4.add(Long.valueOf(jArr[i]));
                i++;
            }
            return arrayList4;
        } else if (obj instanceof float[]) {
            ArrayList<?> arrayList5 = new ArrayList<>();
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            while (i < length5) {
                arrayList5.add(Float.valueOf(fArr[i]));
                i++;
            }
            return arrayList5;
        } else if (obj instanceof double[]) {
            ArrayList<?> arrayList6 = new ArrayList<>();
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i < length6) {
                arrayList6.add(Double.valueOf(dArr[i]));
                i++;
            }
            return arrayList6;
        } else if (obj instanceof char[]) {
            ArrayList<?> arrayList7 = new ArrayList<>();
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            while (i < length7) {
                arrayList7.add(Character.valueOf(cArr[i]));
                i++;
            }
            return arrayList7;
        } else if (obj instanceof boolean[]) {
            ArrayList<?> arrayList8 = new ArrayList<>();
            boolean[] zArr = (boolean[]) obj;
            int length8 = zArr.length;
            while (i < length8) {
                arrayList8.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            return arrayList8;
        } else if (!(obj instanceof String[])) {
            return null;
        } else {
            ArrayList<?> arrayList9 = new ArrayList<>();
            String[] strArr = (String[]) obj;
            int length9 = strArr.length;
            while (i < length9) {
                arrayList9.add(strArr[i]);
                i++;
            }
            return arrayList9;
        }
    }

    /* renamed from: a */
    private JSONArray m17918a(ArrayList<Object> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof HashMap) {
                next = m17921b((HashMap<String, Object>) (HashMap) next);
            } else if (next instanceof ArrayList) {
                next = m17918a((ArrayList<Object>) (ArrayList) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    /* renamed from: b */
    public String mo15974b(String str) {
        try {
            return m17915a("", mo15973a(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private String m17915a(String str, HashMap<String, Object> hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\n");
        String str2 = String.valueOf(str) + "\t";
        int i = 0;
        Iterator<Map.Entry<String, Object>> it = hashMap.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                stringBuffer.append(10).append(str).append('}');
                return stringBuffer.toString();
            }
            Map.Entry next = it.next();
            if (i2 > 0) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(str2).append('\"').append((String) next.getKey()).append("\":");
            Object value = next.getValue();
            if (value instanceof HashMap) {
                stringBuffer.append(m17915a(str2, (HashMap<String, Object>) (HashMap) value));
            } else if (value instanceof ArrayList) {
                stringBuffer.append(m17914a(str2, (ArrayList<Object>) (ArrayList) value));
            } else if (value instanceof String) {
                stringBuffer.append('\"').append(value).append('\"');
            } else {
                stringBuffer.append(value);
            }
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private String m17914a(String str, ArrayList<Object> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[\n");
        String str2 = String.valueOf(str) + "\t";
        int i = 0;
        Iterator<Object> it = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                stringBuffer.append(10).append(str).append(']');
                return stringBuffer.toString();
            }
            Object next = it.next();
            if (i2 > 0) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(str2);
            if (next instanceof HashMap) {
                stringBuffer.append(m17915a(str2, (HashMap<String, Object>) (HashMap) next));
            } else if (next instanceof ArrayList) {
                stringBuffer.append(m17914a(str2, (ArrayList<Object>) (ArrayList) next));
            } else if (next instanceof String) {
                stringBuffer.append('\"').append(next).append('\"');
            } else {
                stringBuffer.append(next);
            }
            i = i2 + 1;
        }
    }
}
