package com.cootek.smartinput5.func.smileypanel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.smileypanel.p056a.C2006a;
import com.cootek.smartinput5.func.smileypanel.p056a.C2007b;
import com.cootek.smartinput5.func.smileypanel.p056a.C2009d;
import com.cootek.smartinput5.func.smileypanel.p057b.C2011a;
import com.cootek.smartinput5.func.smileypanel.p057b.C2029c;
import com.cootek.smartinput5.func.smileypanel.p057b.C2030d;
import com.cootek.smartinput5.func.smileypanel.p057b.p058a.C2018g;
import com.cootek.smartinput5.func.smileypanel.p057b.p059b.C2028g;
import com.cootek.smartinput5.func.smileypanel.p060c.C2036a;
import com.cootek.smartinput5.func.smileypanel.p060c.C2038c;
import com.cootek.smartinput5.func.smileypanel.p060c.C2039d;
import com.cootek.smartinput5.func.smileypanel.p061d.C2050g;
import com.cootek.smartinput5.func.smileypanel.p062e.C2052a;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.SmileyCategoryScroll;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2878v;
import com.cootek.smartinput5.p066ui.settings.OnlineShopActivity;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SmileyListView extends LinearLayout {

    /* renamed from: A */
    private static int[] f6861A = null;

    /* renamed from: a */
    public static final float f6862a = 0.25f;

    /* renamed from: b */
    public static final int f6863b = 2;

    /* renamed from: c */
    public static final String f6864c = "emoticon";

    /* renamed from: d */
    public static final String f6865d = "emojiArt";

    /* renamed from: e */
    public static final String f6866e = "emotion";

    /* renamed from: f */
    public static final String f6867f = "sticker";

    /* renamed from: m */
    public static final int f6868m = 260;

    /* renamed from: n */
    private static final float f6869n = 0.7f;

    /* renamed from: o */
    private static final float f6870o = 0.18f;

    /* renamed from: p */
    private static final int f6871p = 173;

    /* renamed from: q */
    private static final int[] f6872q = {R.drawable.tie, R.drawable.chrismas_tree, R.drawable.gift};

    /* renamed from: r */
    private static final int f6873r = 0;

    /* renamed from: s */
    private static final int f6874s = 1;

    /* renamed from: t */
    private static final int f6875t = 2;

    /* renamed from: z */
    private static int[] f6876z;

    /* renamed from: B */
    private int f6877B;

    /* renamed from: C */
    private int f6878C;

    /* renamed from: D */
    private Drawable f6879D;

    /* renamed from: E */
    private Drawable f6880E;

    /* renamed from: F */
    private ListView f6881F;

    /* renamed from: G */
    private View f6882G;

    /* renamed from: H */
    private LinearLayout f6883H;

    /* renamed from: I */
    private SmileyCategoryScroll f6884I = null;

    /* renamed from: J */
    private LayoutInflater f6885J;

    /* renamed from: K */
    private LinearLayout f6886K;

    /* renamed from: L */
    private LinearLayout f6887L;

    /* renamed from: M */
    private C2826E f6888M;

    /* renamed from: N */
    private int f6889N;

    /* renamed from: O */
    private int f6890O;

    /* renamed from: P */
    private C1602bh f6891P;

    /* renamed from: Q */
    private View.OnClickListener f6892Q;

    /* renamed from: R */
    private View.OnTouchListener f6893R = new C2058h(this);

    /* renamed from: S */
    private final float f6894S;

    /* renamed from: T */
    private C2030d f6895T;

    /* renamed from: g */
    protected final int f6896g;

    /* renamed from: h */
    protected final int f6897h;

    /* renamed from: i */
    protected final int f6898i;

    /* renamed from: j */
    protected int f6899j;

    /* renamed from: k */
    protected int f6900k;

    /* renamed from: l */
    protected int f6901l;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Context f6902u;

    /* renamed from: v */
    private int f6903v;

    /* renamed from: w */
    private int f6904w;

    /* renamed from: x */
    private int f6905x;

    /* renamed from: y */
    private int f6906y;

    public SmileyListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6902u = context;
        this.f6888M = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f6891P = C1368X.m6320c().mo5841n();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int o = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.SoftKeyboard);
        this.f6896g = C2878v.m13321a(obtainStyledAttributes, 4, i, 0);
        this.f6897h = C2878v.m13321a(obtainStyledAttributes, 3, o, 0);
        this.f6894S = ((float) this.f6897h) / ((float) o);
        this.f6898i = C2878v.m13321a(obtainStyledAttributes, 7, i, 0);
        obtainStyledAttributes.recycle();
        this.f6880E = this.f6902u.getResources().getDrawable(R.drawable.smiley_divider_vertical);
        this.f6877B = this.f6902u.getResources().getColor(R.color.smiley_list_text_color);
        this.f6878C = (int) this.f6902u.getResources().getDimension(R.dimen.keyboard_main_only_text_size);
        this.f6879D = this.f6902u.getResources().getDrawable(R.drawable.smiley_divider_horizontal);
        m9227x();
    }

    /* renamed from: e */
    private void m9208e() {
        SmileyCategoryScroll smileyCategoryScroll = getSmileyCategoryScroll();
        this.f6883H.addView(smileyCategoryScroll, new LinearLayout.LayoutParams(smileyCategoryScroll.getDisplayWidth(), smileyCategoryScroll.getDisplayHeight()));
        this.f6884I = smileyCategoryScroll;
    }

    private SmileyCategoryScroll getSmileyCategoryScroll() {
        SmileyCategoryScroll smileyCategoryScroll = new SmileyCategoryScroll(this.f6902u);
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB);
        if (f6864c.equals(stringSetting)) {
            smileyCategoryScroll.setCategories(C2009d.values());
        } else if (f6865d.equals(stringSetting)) {
            smileyCategoryScroll.setCategories(C2006a.values());
        } else if (f6866e.equals(stringSetting)) {
            smileyCategoryScroll.setCategories(C2007b.values());
        }
        smileyCategoryScroll.setSmileyListView(this);
        smileyCategoryScroll.mo8687a();
        return smileyCategoryScroll;
    }

    /* renamed from: a */
    private void m9196a(View view, int i) {
        if (view != null) {
            m9206b(view, i);
            m9199a((LinearLayout) view.findViewById(R.id.emoji_examples), i);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.download_btn);
            linearLayout.setOnClickListener(m9223t());
            m9197a((ViewGroup) linearLayout);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m9209f() {
        if (C1584bI.m7154g(this.f6902u)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m9206b(View view, int i) {
        LinearLayout linearLayout;
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.download_btn)) != null) {
            linearLayout.addView(m9193a(R.drawable.download_emoji, i, (int) (((float) i) * f6869n)), 0);
        }
    }

    /* renamed from: a */
    private void m9199a(LinearLayout linearLayout, int i) {
        if (linearLayout != null) {
            int i2 = (int) (((float) i) * f6869n);
            for (int a : f6872q) {
                linearLayout.addView(m9193a(a, i, i2));
            }
        }
    }

    /* renamed from: a */
    private View m9193a(int i, int i2, int i3) {
        ImageView imageView = new ImageView(this.f6902u);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        imageView.setBackgroundResource(i);
        imageView.measure(0, 0);
        int measuredHeight = imageView.getMeasuredHeight();
        if (this.f6888M.mo9253k() > 1.0d) {
            i3 = (int) (((double) i3) / this.f6888M.mo9253k());
        }
        int j = (int) (((double) i3) * this.f6888M.mo9252j());
        layoutParams.height = j;
        layoutParams.width = (int) ((((float) j) / ((float) measuredHeight)) * ((float) imageView.getMeasuredWidth()));
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    /* renamed from: c */
    private void m9207c(View view, int i) {
        LinearLayout linearLayout;
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.close)) != null) {
            linearLayout.addView(m9193a(R.drawable.emoji_download_close, i, (int) (((float) i) * f6869n)));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            linearLayout.setLayoutParams(layoutParams);
            m9197a((ViewGroup) linearLayout);
            linearLayout.setOnClickListener(new C2059i(this));
        }
    }

    /* renamed from: a */
    private void m9197a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        m9197a((ViewGroup) childAt);
                    }
                    childAt.setFocusable(false);
                    childAt.setClickable(false);
                }
            }
        }
    }

    /* renamed from: g */
    private void m9210g() {
        View inflate = ((LayoutInflater) this.f6902u.getSystemService("layout_inflater")).inflate(R.layout.emoji_download_title, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.emoji_download_title);
        textView.setTextSize(0, (float) (((double) textView.getTextSize()) * this.f6888M.mo9252j()));
        int i = (int) (((float) this.f6889N) * f6870o);
        m9196a(inflate, i);
        m9207c(inflate, i);
        this.f6883H.addView(inflate, new LinearLayout.LayoutParams(-1, i));
    }

    /* renamed from: a */
    private void m9198a(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            if (viewGroup.getBackground() != null) {
                viewGroup.getBackground().setAlpha(i);
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        m9198a((ViewGroup) childAt, i);
                    }
                    if (childAt.getBackground() != null) {
                        childAt.getBackground().setAlpha(i);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private boolean m9211h() {
        this.f6884I = null;
        if (this.f6883H != null) {
            this.f6883H.removeAllViews();
            if (m9221r()) {
                m9210g();
            }
            m9208e();
        }
        return true;
    }

    /* renamed from: i */
    private boolean m9212i() {
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB);
        if (f6864c.equals(stringSetting) || f6865d.equals(stringSetting)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m9213j() {
        if (f6864c.equals(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB))) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m9214k() {
        if (this.f6883H == null) {
            return;
        }
        if (m9211h()) {
            this.f6883H.setVisibility(0);
            this.f6883H.measure(0, 0);
            this.f6900k = this.f6883H.getMeasuredHeight();
            return;
        }
        m9215l();
    }

    /* renamed from: l */
    private void m9215l() {
        if (this.f6883H != null) {
            this.f6883H.setVisibility(8);
            this.f6900k = 0;
        }
    }

    /* renamed from: m */
    private void m9216m() {
        if (m9212i()) {
            m9214k();
        } else {
            m9215l();
        }
    }

    /* renamed from: n */
    private void m9217n() {
        this.f6890O = (int) (((double) this.f6896g) * this.f6888M.mo9250h());
        setMinimumWidth(this.f6890O);
        this.f6889N = (int) (((float) Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o()) * this.f6894S);
        setMinimumHeight(this.f6889N);
        setBackgroundColor(0);
        m9214k();
        this.f6901l = 0;
        this.f6899j = (this.f6889N - this.f6901l) - this.f6900k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f6901l;
        layoutParams.height = this.f6899j;
        this.f6881F.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static int m9191a(int i) {
        m9218o();
        return f6876z[i];
    }

    /* renamed from: b */
    public static int m9203b(int i) {
        m9218o();
        return f6861A[i];
    }

    /* renamed from: a */
    public void mo7313a() {
        if (this.f6883H != null) {
            this.f6883H.removeAllViews();
        }
    }

    /* renamed from: o */
    private static void m9218o() {
        if (f6876z == null || f6861A == null) {
            f6876z = new int[]{R.dimen.smiley_list_item_width_small, R.dimen.smiley_list_item_width_middle, R.dimen.smiley_list_item_width_large};
            f6861A = new int[]{R.dimen.smiley_list_item_height_small, R.dimen.smiley_list_item_height_middle, R.dimen.smiley_list_item_height_large};
            for (int i = 0; i < f6876z.length; i++) {
                f6876z[i] = C1368X.m6313b().getResources().getDimensionPixelSize(f6876z[i]);
                f6861A[i] = C1368X.m6313b().getResources().getDimensionPixelSize(f6861A[i]);
            }
        }
    }

    private int getCurrentTabSizeType() {
        return m9192a(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB));
    }

    /* renamed from: a */
    public static int m9192a(String str) {
        if (f6866e.equals(str)) {
            return 1;
        }
        if (f6864c.equals(str)) {
            return 0;
        }
        if (f6867f.equals(str)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    public void mo7314b() {
        int currentTabSizeType = getCurrentTabSizeType();
        int a = m9191a(currentTabSizeType);
        int b = m9203b(currentTabSizeType);
        this.f6904w = (int) Math.ceil((double) (((float) this.f6890O) / ((float) a)));
        this.f6903v = (int) (((float) this.f6889N) / ((float) b));
        this.f6905x = this.f6890O / this.f6904w;
        this.f6906y = this.f6889N / this.f6903v;
        this.f6895T = new C2030d(this.f6902u);
        this.f6881F.setAdapter(this.f6895T);
        this.f6895T.mo7383a(getDisplayLines());
        if (m9220q()) {
            m9222s();
        } else {
            if (this.f6886K != null) {
                this.f6886K.setVisibility(8);
            }
            m9219p();
        }
        m9200a(this.f6881F);
        this.f6895T.notifyDataSetChanged();
        this.f6881F.setSelection(0);
    }

    /* renamed from: p */
    private void m9219p() {
        if (f6865d.equals(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB))) {
            this.f6887L.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = this.f6901l;
            layoutParams.height = this.f6899j;
            this.f6887L.setLayoutParams(layoutParams);
            m9224u();
            this.f6881F.setVisibility(8);
            return;
        }
        this.f6881F.setVisibility(0);
        this.f6887L.setVisibility(8);
    }

    /* renamed from: q */
    private boolean m9220q() {
        return !C2003a.m9262c().mo7355j() && m9212i() && !C1351J.m6188a().mo5653m();
    }

    /* renamed from: r */
    private boolean m9221r() {
        return Settings.getInstance().getBoolSetting(Settings.COLORFUL_EMOJI_BUTTON_SHOW) && !C2003a.m9262c().mo7355j() && m9213j() && C1351J.m6188a().mo5653m() && !C1351J.m6188a().mo5654n();
    }

    /* renamed from: s */
    private void m9222s() {
        this.f6886K = (LinearLayout) findViewById(R.id.emoji_download_panel);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f6901l;
        layoutParams.height = this.f6889N - this.f6901l;
        this.f6886K.setLayoutParams(layoutParams);
        ((ImageButton) this.f6886K.findViewById(R.id.download_btn)).setOnClickListener(m9223t());
        this.f6881F.setVisibility(8);
        this.f6887L.setVisibility(8);
        m9215l();
        this.f6886K.setVisibility(0);
    }

    /* renamed from: t */
    private View.OnClickListener m9223t() {
        if (this.f6892Q == null) {
            this.f6892Q = new C2060j(this);
        }
        return this.f6892Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7315c() {
        if (C1132b.m5654a(this.f6902u).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            C1368X.m6320c().mo5825K().launchShop(4, OnlineShopActivity.f13565l);
        } else if (C1351J.m6196h()) {
            C2361q.m10797b().mo8005b(C1974m.m9063a(this.f6902u, (int) R.string.app_id_emoji_plugin), C1974m.m9063a(this.f6902u, (int) R.string.full_emoji_download_btn_title), C1974m.m9063a(this.f6902u, (int) R.string.EMOJI_PLUGIN_TARGET_VERSION));
        } else {
            C1351J.m6189a(this.f6902u);
        }
    }

    /* renamed from: u */
    private void m9224u() {
        ListView listView = (ListView) findViewById(R.id.emoji_art_grid);
        ArrayList<C2038c> a = m9195a(getEmojiArtStrings());
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            listView.setAdapter(new C2036a(this.f6902u, a));
            listView.setDivider((Drawable) null);
            return;
        }
        ((C2036a) adapter).mo7390a(a);
        m9200a(listView);
        listView.setSelection(0);
    }

    private int getColumnCount() {
        Resources resources = this.f6902u.getResources();
        int i = resources.getDisplayMetrics().heightPixels;
        int i2 = resources.getDisplayMetrics().widthPixels;
        int min = this.f6890O / Math.min(Math.min(i, i2) / 2, Math.max(i, i2) / 4);
        if (min < 2) {
            return 2;
        }
        return min;
    }

    /* renamed from: a */
    private ArrayList<C2038c> m9195a(ArrayList<String> arrayList) {
        ArrayList<C2038c> arrayList2 = new ArrayList<>();
        int columnCount = getColumnCount();
        int i = this.f6899j;
        int i2 = this.f6890O / columnCount;
        C2038c cVar = new C2038c(columnCount, 2);
        arrayList2.add(cVar);
        int i3 = 0;
        while (true) {
            C2038c cVar2 = cVar;
            if (i3 >= arrayList.size()) {
                return arrayList2;
            }
            C2039d dVar = new C2039d(this.f6902u, this, arrayList.get(i3), i2, i, i3);
            if (!cVar2.mo7398a(dVar)) {
                cVar2 = new C2038c(columnCount, 2);
                cVar2.mo7398a(dVar);
                arrayList2.add(cVar2);
            }
            cVar = cVar2;
            i3++;
        }
    }

    private String getEmojiArtFileName() {
        return Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_CATEGORY, 22, C1351J.m6188a().mo5645d(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB)), (Config) null) + ".txt";
    }

    private ArrayList<String> getEmojiArtStrings() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C1460o.m6799b().mo6099a(this.f6902u, getEmojiArtFileName())));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains("-----")) {
                    arrayList.add(new String(sb.delete(sb.length() - 1, sb.length())));
                    sb.delete(0, sb.length());
                } else {
                    sb.append(readLine).append(C0911j.f2473c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: v */
    private void m9225v() {
        this.f6883H = (LinearLayout) findViewById(R.id.category_list);
        this.f6883H.setBackgroundDrawable(this.f6891P.mo6249a((int) R.drawable.smiley_category_bar_bg));
    }

    /* renamed from: w */
    private void m9226w() {
        this.f6881F = (ListView) findViewById(R.id.smiley_list_frame);
        this.f6881F.setCacheColorHint(0);
        this.f6881F.setDivider((Drawable) null);
        this.f6881F.setVerticalScrollBarEnabled(true);
        this.f6881F.setVerticalFadingEdgeEnabled(true);
        this.f6881F.setSoundEffectsEnabled(false);
        this.f6881F.setBackgroundColor(this.f6891P.mo6260b((int) R.color.smiley_list_bg_color));
    }

    /* renamed from: x */
    private void m9227x() {
        m9229z();
        m9218o();
        m9225v();
        m9226w();
        m9228y();
        setViewAlpha(0);
    }

    /* renamed from: y */
    private void m9228y() {
        this.f6887L = (LinearLayout) findViewById(R.id.emoji_art_list);
        this.f6887L.setBackgroundResource(R.color.smiley_list_bg_color);
    }

    /* renamed from: z */
    private void m9229z() {
        this.f6885J = (LayoutInflater) this.f6902u.getSystemService("layout_inflater");
        this.f6882G = this.f6885J.inflate(R.layout.smiley_panel_content, (ViewGroup) null);
        addView(this.f6882G);
    }

    public int getDisplayHeight() {
        return this.f6889N;
    }

    public int getDisplayWidth() {
        return this.f6890O;
    }

    public int getHorizontalGap() {
        return this.f6898i;
    }

    public int getLeftMargin() {
        return 0;
    }

    public int getRightMargin() {
        return 0;
    }

    public int getTopMargin() {
        return 0;
    }

    public int getBottomMargin() {
        return 0;
    }

    /* renamed from: d */
    public void mo7316d() {
        if (Engine.isInitialized()) {
            setViewAlpha(255);
        }
        m9188A();
    }

    /* renamed from: A */
    private void m9188A() {
        m9217n();
        m9190C();
        mo7314b();
    }

    private int getMaxItemCountPerLine() {
        return this.f6904w;
    }

    private ArrayList<C2029c> getDisplayLines() {
        C2029c cVar;
        ArrayList<C2029c> arrayList = new ArrayList<>();
        C2043d category = getCategory();
        if (category != null) {
            C2051e[] a = category.mo7367a();
            int maxItemCountPerLine = getMaxItemCountPerLine();
            C2029c cVar2 = new C2029c(maxItemCountPerLine, this.f6890O);
            arrayList.add(cVar2);
            int length = a.length;
            int i = 0;
            while (i < length) {
                C2051e eVar = a[i];
                if (!m9202a(eVar)) {
                    cVar = cVar2;
                } else {
                    C2011a aVar = new C2011a(eVar, this.f6905x, this.f6906y, this.f6877B, this.f6878C);
                    if (!cVar2.mo7381a(aVar)) {
                        C2029c cVar3 = new C2029c(maxItemCountPerLine, this.f6890O);
                        arrayList.add(cVar3);
                        cVar3.mo7381a(aVar);
                        cVar = cVar3;
                    } else {
                        cVar = cVar2;
                    }
                }
                i++;
                cVar2 = cVar;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m9202a(C2051e eVar) {
        if (eVar.mo7374e() && C1351J.m6188a().mo5641b() == 2 && C2052a.m9410a(eVar.mo7373d()) == null) {
            return false;
        }
        return true;
    }

    private C2043d getCategory() {
        Settings instance = Settings.getInstance();
        String stringSetting = instance.getStringSetting(Settings.CURRENT_SMILEY_TAB);
        return m9194a(instance.getStringSetting(Settings.CURRENT_SMILEY_CATEGORY, 22, m9205b(stringSetting), (Config) null), stringSetting);
    }

    /* renamed from: b */
    public static String m9205b(String str) {
        if (TextUtils.equals(str, f6864c)) {
            return "emoticon_full";
        }
        return str;
    }

    /* renamed from: a */
    private C2043d m9194a(String str, String str2) {
        if (TextUtils.equals(str2, f6864c)) {
            if (m9189B()) {
                return C2018g.m9323a(str);
            }
            return C2028g.m9345a(str);
        } else if (TextUtils.equals(str2, f6866e)) {
            return C2050g.m9403a(str);
        } else {
            return null;
        }
    }

    /* renamed from: B */
    private boolean m9189B() {
        if (!C2003a.m9262c().mo7355j() && Build.VERSION.SDK_INT > 15 && Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m9200a(ListView listView) {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        listView.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public void setViewAlpha(int i) {
        if (this.f6880E != null) {
            this.f6880E.setAlpha(i);
        }
        if (this.f6879D != null) {
            this.f6879D.setAlpha(i);
        }
        if (this.f6895T != null) {
            this.f6895T.mo7382a(i);
            this.f6895T.notifyDataSetChanged();
        }
        if (this.f6883H != null) {
            if (i == 0) {
                m9198a((ViewGroup) this.f6883H, i);
            } else {
                m9198a((ViewGroup) this.f6883H, 173);
            }
            if (this.f6884I != null) {
                this.f6884I.setViewAlpha(i);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: C */
    private void m9190C() {
        int i;
        int i2;
        View findViewById = findViewById(R.id.virtual_drag_zone);
        if (findViewById != null) {
            if (Engine.getInstance().getWidgetManager().mo9618X().mo7422a()) {
                i2 = this.f6902u.getResources().getDimensionPixelSize(R.dimen.smiley_drag_bar_height);
                i = this.f6890O;
            } else {
                i = 0;
                i2 = 0;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(i, i2);
            }
            layoutParams.width = i;
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setBackgroundColor(0);
            findViewById.setOnTouchListener(this.f6893R);
        }
    }
}
