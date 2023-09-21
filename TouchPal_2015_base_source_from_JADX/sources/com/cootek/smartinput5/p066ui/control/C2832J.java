package com.cootek.smartinput5.p066ui.control;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.smileypanel.C2051e;
import com.cootek.smartinput5.func.smileypanel.p057b.p058a.C2016e;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.SmileyKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.C2946d;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.cootek.smartinput5.ui.control.J */
/* compiled from: NumLineKeyboardController */
public class C2832J {

    /* renamed from: a */
    public static final float f12699a = 1.2f;

    /* renamed from: b */
    public static final float f12700b = 0.8333333f;

    /* renamed from: c */
    public static final float f12701c = 0.16666669f;

    /* renamed from: d */
    private static final String f12702d = "NumLineKeyboardController";

    /* renamed from: e */
    private static final String f12703e = "sk_sub_";

    /* renamed from: g */
    private static final String f12704g = "_";

    /* renamed from: f */
    private final Pattern f12705f = Pattern.compile(C2806cb.NORMAL_KEY_MATCH);

    /* renamed from: h */
    private KeyboardSchema f12706h;

    /* renamed from: i */
    private Settings f12707i;

    /* renamed from: j */
    private C2016e f12708j;

    /* renamed from: k */
    private boolean f12709k;

    /* renamed from: l */
    private int f12710l;

    /* renamed from: m */
    private int f12711m;

    public C2832J(KeyboardSchema keyboardSchema, boolean z) {
        this.f12706h = keyboardSchema;
        this.f12707i = Settings.getInstance();
        this.f12709k = z;
    }

    /* renamed from: a */
    public KeyboardSchema mo9285a() {
        return this.f12706h;
    }

    /* renamed from: a */
    public void mo9286a(KeyboardSchema keyboardSchema) {
        this.f12706h = keyboardSchema;
    }

    /* renamed from: a */
    public void mo9288a(boolean z) {
        this.f12709k = z;
    }

    /* renamed from: a */
    public int mo9284a(int i, int i2) {
        this.f12710l = 0;
        this.f12711m = i;
        if (m12961j()) {
            return i;
        }
        if (this.f12707i.getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE)) {
            int i3 = (int) (((float) i) * 1.2f);
            if (i2 <= 0 || i2 >= i3) {
                i2 = i3;
            } else {
                this.f12711m = (int) (((float) i2) * 0.8333333f);
            }
            this.f12710l = (int) (((float) i2) * 0.16666669f);
            Engine.getInstance().getWidgetManager().mo9630ad().mo9241b(this.f12710l);
        } else {
            this.f12710l = 0;
            Engine.getInstance().getWidgetManager().mo9630ad().mo9241b(this.f12710l);
            i2 = i;
        }
        return i2;
    }

    /* renamed from: b */
    public Rect[] mo9291b(int i, int i2) {
        String str = this.f12706h.shadowRect;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        Rect[] rectArr = new Rect[split.length];
        for (int i3 = 0; i3 < split.length; i3++) {
            String str2 = split[i3];
            Rect rect = new Rect();
            String[] split2 = str2.split(":");
            rect.left = C1599be.m7202a(split2[0], i);
            rect.top = C1599be.m7202a(m12953b(split2[1]), i2);
            rect.right = C1599be.m7202a(split2[2], i);
            rect.bottom = C1599be.m7202a(m12953b(split2[3]), i2);
            rectArr[i3] = rect;
        }
        return rectArr;
    }

    /* renamed from: b */
    private String m12953b(String str) {
        if (!m12959h()) {
            return str;
        }
        int b = C1599be.m7217b(str);
        if (b <= 0) {
            return C1599be.m7207a((float) b);
        }
        return C1599be.m7207a((((float) b) / 1.2f) + 16.666668f);
    }

    /* renamed from: b */
    public void mo9290b() {
        if (this.f12706h != null) {
            String str = null;
            if (m12960i()) {
                str = this.f12706h.getSmileyKeyboardSchemaId();
            } else if (m12959h()) {
                str = this.f12706h.getNumKeyboardSchemaId();
            }
            if (!TextUtils.isEmpty(str)) {
                m12954c(str);
            }
        }
    }

    /* renamed from: c */
    private void m12954c(String str) {
        this.f12710l = 0;
        RowSchema[] rowSchema = this.f12706h.getRowSchema();
        if (!TextUtils.isEmpty(str) && rowSchema != null && rowSchema.length > 0) {
            KeyboardSchema d = m12955d(str);
            RowSchema[] rowSchemaArr = null;
            if (d != null) {
                rowSchemaArr = d.getRowSchema();
            }
            if (rowSchemaArr != null && rowSchemaArr.length > 0) {
                m12952a(rowSchemaArr, m12956e());
                int length = rowSchema.length + rowSchemaArr.length;
                RowSchema[] rowSchemaArr2 = new RowSchema[length];
                for (int i = 0; i < length; i++) {
                    if (i < rowSchemaArr.length) {
                        rowSchemaArr2[i] = rowSchemaArr[i];
                    } else {
                        rowSchemaArr2[i] = rowSchema[i - rowSchemaArr.length];
                    }
                }
                this.f12706h.mRows = rowSchemaArr2;
                if (m12959h()) {
                    m12951a(this.f12706h.mRows, rowSchemaArr.length, f12703e + String.valueOf(rowSchemaArr.length + 1) + "_");
                }
                m12957f();
            }
        }
    }

    /* renamed from: a */
    private void m12951a(RowSchema[] rowSchemaArr, int i, String str) {
        RowSchema rowSchema;
        if (rowSchemaArr != null && rowSchemaArr.length > i && (rowSchema = rowSchemaArr[i]) != null && rowSchema.keys != null && rowSchema.keys.length > 0) {
            for (int i2 = 0; i2 < rowSchema.keys.length; i2++) {
                C2944b bVar = rowSchema.keys[i2];
                if (bVar != null && mo9289a(bVar.keyName)) {
                    bVar.keyName = str + String.valueOf(i2 + 1);
                }
            }
        }
    }

    /* renamed from: e */
    private String m12956e() {
        C2944b[] bVarArr;
        String str;
        int i = 0;
        RowSchema[] rowSchema = this.f12706h.getRowSchema();
        if (rowSchema == null || rowSchema.length <= 0 || (bVarArr = rowSchema[0].keys) == null || bVarArr.length <= 0) {
            return null;
        }
        while (true) {
            if (i >= bVarArr.length) {
                str = null;
                break;
            }
            C2944b bVar = bVarArr[i];
            if (bVar != null && !TextUtils.isEmpty(bVar.mainTitleRef)) {
                str = bVar.mainTitleRef;
                break;
            }
            i++;
        }
        return str;
    }

    /* renamed from: a */
    private void m12952a(RowSchema[] rowSchemaArr, String str) {
        if (!TextUtils.isEmpty(str) && rowSchemaArr != null) {
            for (RowSchema rowSchema : rowSchemaArr) {
                if (!(rowSchema == null || rowSchema.keys == null)) {
                    C2944b[] bVarArr = rowSchema.keys;
                    for (C2944b bVar : bVarArr) {
                        if (bVar != null) {
                            bVar.mainTitleRef = str;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo9289a(String str) {
        return !TextUtils.isEmpty(str) && this.f12705f.matcher(str).matches();
    }

    /* renamed from: f */
    private void m12957f() {
        int length = this.f12706h.mRows.length;
        float length2 = 83.33333f / ((float) (this.f12706h.mRows.length - 1));
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                this.f12706h.mRows[i].keyHeight = C1599be.m7207a(16.666668f);
            } else {
                this.f12706h.mRows[i].keyHeight = C1599be.m7207a(length2);
            }
        }
    }

    /* renamed from: a */
    public void mo9287a(ArrayList<C2806cb> arrayList) {
        C2051e[] g;
        C2806cb cbVar;
        if (Build.VERSION.SDK_INT >= 17 && this.f12706h != null && !TextUtils.isEmpty(this.f12706h.getSmileyKeyboardSchemaId()) && arrayList != null && arrayList.size() != 0 && (g = m12958g()) != null && g.length != 0) {
            if (m12960i()) {
                System.currentTimeMillis();
                C1351J.m6188a().mo5648f();
                C1351J.m6188a().mo5643c();
            }
            int i = 0;
            while (i < arrayList.size() && (cbVar = arrayList.get(i)) != null && (cbVar instanceof SmileyKey)) {
                SmileyKey smileyKey = (SmileyKey) cbVar;
                if (i < g.length) {
                    smileyKey.setShowSmiley(true);
                    smileyKey.setSmileyKey(g[i]);
                } else {
                    smileyKey.setShowSmiley(false);
                }
                i++;
            }
        }
    }

    /* renamed from: c */
    public int mo9292c() {
        if (this.f12710l < 0) {
            this.f12710l = 0;
        }
        return this.f12710l;
    }

    /* renamed from: d */
    public int mo9293d() {
        if (this.f12711m < 0) {
            this.f12711m = 0;
        }
        return this.f12711m;
    }

    /* renamed from: g */
    private C2051e[] m12958g() {
        if (this.f12708j == null) {
            this.f12708j = new C2016e();
        }
        return this.f12708j.mo7367a();
    }

    /* renamed from: d */
    private KeyboardSchema m12955d(String str) {
        return C2946d.m13631a(str);
    }

    /* renamed from: h */
    private boolean m12959h() {
        return this.f12707i.getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE) && this.f12706h != null && !TextUtils.isEmpty(this.f12706h.getNumKeyboardSchemaId());
    }

    /* renamed from: i */
    private boolean m12960i() {
        return this.f12707i.getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE) && this.f12706h != null && !TextUtils.isEmpty(this.f12706h.getSmileyKeyboardSchemaId());
    }

    /* renamed from: j */
    private boolean m12961j() {
        if (!TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f) || !this.f12709k) {
            return false;
        }
        return true;
    }
}
