package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.p052b.C1549b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.func.aP */
/* compiled from: MixLanguageInfo */
public class C1405aP {

    /* renamed from: a */
    private static C1405aP f4445a;

    /* renamed from: b */
    private final Map<String, ArrayList<String>> f4446b = new HashMap();

    private C1405aP() {
        String[] strArr = {C1549b.f4838i, C1549b.f4839j, C1549b.f4843n, C1549b.f4840k, C1549b.f4844o, C1549b.f4847r, C1549b.f4841l, C1549b.f4842m, C1549b.f4846q, C1549b.f4848s, C1549b.f4849t, C1549b.f4850u, C1549b.f4851v, C1549b.f4852w, C1549b.f4853x, C1549b.f4854y, C1549b.f4855z, C1549b.f4765A, C1549b.f4766B, C1549b.f4767C, C1549b.f4768D, C1549b.f4778N, C1549b.f4779O, C1549b.f4782R, C1549b.f4783S, C1549b.f4776L, C1549b.f4786V, C1549b.f4780P, C1549b.f4777M, C1549b.f4787W, C1549b.f4789Y, C1549b.f4790Z, C1549b.f4805aa, C1549b.f4816al, C1549b.f4821aq, C1549b.f4822ar};
        m6597a(this.f4446b, new String[]{C1549b.f4832c, C1549b.f4833d, C1549b.f4834e, C1549b.f4835f, C1549b.f4836g, C1549b.f4837h, C1549b.f4769E, C1549b.f4771G, C1549b.f4770F, C1549b.f4784T, C1549b.f4785U, C1549b.f4781Q, C1549b.f4775K, C1549b.f4788X, C1549b.f4772H, C1549b.f4806ab, C1549b.f4807ac, C1549b.f4808ad, C1549b.f4809ae, C1549b.f4810af, C1549b.f4811ag, C1549b.f4812ah, C1549b.f4814aj, C1549b.f4815ak, C1549b.f4817am, C1549b.f4818an, C1549b.f4819ao, C1549b.f4820ap, C1549b.f4823as, C1549b.f4825au, C1549b.f4826av, C1549b.f4827aw, C1549b.f4828ax, C1549b.f4830az, C1549b.f4829ay, C1549b.f4792aA});
        m6596a(this.f4446b, C1549b.f4791a, strArr);
        m6599b(this.f4446b, C1549b.f4773I, strArr);
        m6599b(this.f4446b, C1549b.f4774J, strArr);
        m6599b(this.f4446b, C1549b.f4824at, strArr);
        m6599b(this.f4446b, C1549b.f4831b, new String[]{C1549b.f4791a});
        m6598a(this.f4446b, new String[]{C1549b.f4773I, C1549b.f4774J, C1549b.f4824at}, strArr);
    }

    /* renamed from: a */
    private void m6598a(Map<String, ArrayList<String>> map, String[] strArr, String[] strArr2) {
        for (String str : strArr2) {
            ArrayList arrayList = map.get(str);
            for (String add : strArr) {
                arrayList.add(add);
            }
        }
    }

    /* renamed from: a */
    private void m6595a(Map<String, ArrayList<String>> map, String str, String str2, String[] strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = new String[]{str2};
        } else {
            String[] strArr3 = new String[(strArr.length + 1)];
            for (int i = 0; i < strArr.length; i++) {
                strArr3[i] = strArr[i];
            }
            strArr3[strArr.length] = str2;
            strArr2 = strArr3;
        }
        m6599b(map, str, strArr2);
    }

    /* renamed from: a */
    private void m6596a(Map<String, ArrayList<String>> map, String str, String[] strArr) {
        if (strArr == null) {
            m6600b(map, new String[]{str});
            return;
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i];
        }
        strArr2[strArr.length] = str;
        m6600b(map, strArr2);
    }

    /* renamed from: a */
    private void m6597a(Map<String, ArrayList<String>> map, String[] strArr) {
        for (String put : strArr) {
            map.put(put, (Object) null);
        }
    }

    /* renamed from: b */
    private void m6599b(Map<String, ArrayList<String>> map, String str, String[] strArr) {
        map.put(str, new ArrayList(Arrays.asList(strArr)));
    }

    /* renamed from: b */
    private void m6600b(Map<String, ArrayList<String>> map, String[] strArr) {
        if (strArr != null) {
            if (strArr.length == 1) {
                map.put(strArr[0], (Object) null);
                return;
            }
            for (int i = 0; i < strArr.length; i++) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (i2 != i) {
                        arrayList.add(strArr[i2]);
                    }
                }
                map.put(strArr[i], arrayList);
            }
        }
    }

    /* renamed from: a */
    public static C1405aP m6594a() {
        if (f4445a == null) {
            f4445a = new C1405aP();
        }
        return f4445a;
    }

    /* renamed from: a */
    public ArrayList<String> mo6013a(String str) {
        if (this.f4446b.get(str) == null || this.f4446b.get(str).size() != 0) {
            return this.f4446b.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo6014a(String str, String str2) {
        if (this.f4446b.get(str) == null) {
            return false;
        }
        return this.f4446b.get(str).contains(str2);
    }
}
