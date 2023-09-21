package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.smileypanel.SmileyListView;
import com.cootek.smartinput5.p066ui.C2728bH;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.HardSymbolTypeBar */
public class HardSymbolTypeBar extends TopPageView implements C2728bH.C2729a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object[][] f11441b = {new Object[]{"punc_cn", Integer.valueOf(R.drawable.key_fore_sym_cn)}, new Object[]{"punc_eng", Integer.valueOf(R.drawable.key_fore_sym_en)}, new Object[]{"number", Integer.valueOf(R.drawable.key_fore_sym_num)}, new Object[]{SmileyListView.f6866e, Integer.valueOf(R.drawable.key_fore_sym_emo)}, new Object[]{C1730E.f5650d, Integer.valueOf(R.drawable.key_fore_sym_web)}, new Object[]{"maths", Integer.valueOf(R.drawable.key_fore_sym_maths)}, new Object[]{"serial", Integer.valueOf(R.drawable.key_fore_sym_serial)}, new Object[]{"radical", Integer.valueOf(R.drawable.key_fore_sym_radical)}, new Object[]{C1608bk.f5177d, Integer.valueOf(R.drawable.key_fore_sym_pinyin)}, new Object[]{"russia", Integer.valueOf(R.drawable.key_fore_sym_russia)}, new Object[]{C1549b.f4770F, Integer.valueOf(R.drawable.key_fore_sym_greek)}, new Object[]{"latin", Integer.valueOf(R.drawable.key_fore_sym_latin)}, new Object[]{"kata", Integer.valueOf(R.drawable.key_fore_sym_kata)}, new Object[]{"hira", Integer.valueOf(R.drawable.key_fore_sym_hira)}, new Object[]{"zhuyin_japan", Integer.valueOf(R.drawable.key_fore_sym_zhuyin_japan)}, new Object[]{"icon", Integer.valueOf(R.drawable.key_fore_sym_icon)}};

    /* renamed from: c */
    private static final int[] f11442c = {16842919};

    /* renamed from: o */
    private static final String f11443o = "sk_tab_";

    /* renamed from: a */
    protected int f11444a;

    /* renamed from: p */
    private final int f11445p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ArrayList<Integer> f11446q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public SoftKeyInfo f11447r = new SoftKeyInfo();

    /* renamed from: s */
    private Drawable f11448s;

    /* renamed from: com.cootek.smartinput5.ui.HardSymbolTypeBar$a */
    private final class C2621a implements C2727bG {

        /* renamed from: c */
        private String f11450c;

        /* renamed from: d */
        private Drawable f11451d;

        /* synthetic */ C2621a(HardSymbolTypeBar hardSymbolTypeBar, int i, C2676aP aPVar) {
            this(i);
        }

        private C2621a(int i) {
            Engine.getInstance().updateKey(((Integer) HardSymbolTypeBar.this.f11446q.get(i)).intValue(), HardSymbolTypeBar.this.f11447r);
            this.f11450c = HardSymbolTypeBar.this.f11447r.mainTitle;
            for (int i2 = 0; i2 < HardSymbolTypeBar.f11441b.length; i2++) {
                if (HardSymbolTypeBar.this.f11447r.mainTitle.equals(HardSymbolTypeBar.f11441b[i2][0])) {
                    this.f11451d = HardSymbolTypeBar.this.getContext().getResources().getDrawable(((Integer) HardSymbolTypeBar.f11441b[i2][1]).intValue());
                    return;
                }
            }
        }

        public int getTag() {
            return 0;
        }

        public String getDisplayString() {
            if (this.f11451d != null) {
                return "";
            }
            return this.f11450c;
        }

        /* renamed from: a */
        public Drawable mo8645a() {
            return this.f11451d;
        }

        public boolean hasLongPressIcon() {
            return false;
        }

        public boolean hasAdditionalIcon() {
            return false;
        }
    }

    public HardSymbolTypeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11445p = context.getResources().getInteger(R.integer.HARD_SYMBOL_CURRENT_TAB);
        Settings.getInstance().setIntSetting(Settings.HARD_SYMBOL_CURRENT_TAB, this.f11445p);
        this.f11689j = new C2728bH(this);
        this.f11691l = new C2676aP(this);
        this.f11446q = m11849a(f11443o);
        this.f11447r = new SoftKeyInfo();
        this.f11448s = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.key_fun_ctrl);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i == 8) {
            Settings.getInstance().setIntSetting(Settings.HARD_SYMBOL_CURRENT_TAB, this.f11445p);
            mo8791a(true);
        }
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8637c(int i) {
    }

    /* renamed from: a */
    public C2727bG mo8496a(int i) {
        int i2 = this.f11444a + i;
        if (i2 > this.f11446q.size() - 1) {
            return null;
        }
        return new C2621a(this, i2, (C2676aP) null);
    }

    /* renamed from: a */
    public static ArrayList<Integer> m11849a(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int keyId = Engine.getInstance().getKeyId(str + i);
            if (keyId == -1) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(keyId));
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo8642b(int i) {
        return ((C2621a) mo8496a(this.f11444a + i)).mo8645a().getMinimumWidth();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo8641a(Canvas canvas, int i, int i2, int i3, int i4, int i5, boolean z) {
        int[] iArr;
        Drawable a = ((C2621a) mo8496a(this.f11444a + i)).mo8645a();
        if (this.f11448s == null && a == null) {
            return 1;
        }
        canvas.translate((float) i2, 0.0f);
        if (this.f11448s != null) {
            this.f11448s.setBounds(0, 0, i4 - 1, i5 - 1);
            if (z) {
                iArr = f11442c;
            } else if (Settings.getInstance().getIntSetting(Settings.HARD_SYMBOL_CURRENT_TAB) == i) {
                iArr = FOCUSED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            this.f11448s.setState(iArr);
            this.f11448s.draw(canvas);
        }
        if (a != null) {
            int intrinsicWidth = a.getIntrinsicWidth();
            int intrinsicHeight = a.getIntrinsicHeight();
            int i6 = (i4 - intrinsicWidth) / 2;
            int i7 = (i5 - intrinsicHeight) / 2;
            canvas.translate((float) i6, (float) i7);
            a.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            a.draw(canvas);
            canvas.translate((float) (-i6), (float) (-i7));
        }
        canvas.translate((float) (-i2), 0.0f);
        return 1;
    }

    /* renamed from: d */
    public void mo8643d(int i) {
        boolean z = false;
        if (i == 3145772 || i == 3145773) {
            int intSetting = Settings.getInstance().getIntSetting(Settings.HARD_SYMBOL_CURRENT_TAB);
            if (i == 3145772) {
                intSetting = ((intSetting + this.f11446q.size()) - 1) % this.f11446q.size();
            } else if (i == 3145773) {
                intSetting = (intSetting + 1) % this.f11446q.size();
            }
            this.f11691l.mo8801a(intSetting);
            this.f11689j.mo9004b();
            z = true;
        }
        if (z) {
            mo8791a(true);
        }
    }
}
