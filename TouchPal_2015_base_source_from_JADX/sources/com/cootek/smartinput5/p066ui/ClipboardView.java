package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.cootek.smartinput5.engine.ClipBoardItem;
import com.cootek.smartinput5.engine.ClipboardBackend;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.TTextView;
import com.cootek.smartinput5.p066ui.C2939q;
import com.cootek.smartinput5.p066ui.ClipboardListView;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2878v;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.cootek.smartinput5.ui.ClipboardView */
public class ClipboardView extends LinearLayout implements ClipboardListView.C2611a, C2939q.C2940a {

    /* renamed from: e */
    static final String f11183e = "text";

    /* renamed from: f */
    static final String f11184f = "islocked";

    /* renamed from: g */
    static final String f11185g = "first_notification";

    /* renamed from: h */
    static final String f11186h = "premium_notification";

    /* renamed from: a */
    protected int f11187a;

    /* renamed from: b */
    protected int f11188b;

    /* renamed from: c */
    protected int f11189c;

    /* renamed from: d */
    protected TypedArray f11190d;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f11191i;

    /* renamed from: j */
    private C2826E f11192j;

    /* renamed from: k */
    private ClipboardListView f11193k;

    /* renamed from: l */
    private C2939q f11194l;

    /* renamed from: m */
    private List<Map<String, Object>> f11195m;

    /* renamed from: n */
    private Button f11196n;

    /* renamed from: o */
    private TranslateAnimation f11197o;

    /* renamed from: p */
    private TranslateAnimation f11198p;

    /* renamed from: q */
    private View f11199q;

    public ClipboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2917du widgetManager;
        SoftKeyboardView g;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        if (!(!Engine.isInitialized() || (widgetManager = Engine.getInstance().getWidgetManager()) == null || (g = widgetManager.mo9648g()) == null || g.getKeyboard() == null)) {
            this.f11187a = g.getKeyboard().mo9134g();
        }
        this.f11190d = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.SoftKeyboard);
        this.f11188b = C2878v.m13322b(this.f11190d, 5, i, 0);
        this.f11189c = C2878v.m13322b(this.f11190d, 6, this.f11187a, 0);
        m11605a(context);
    }

    /* renamed from: a */
    private void m11605a(Context context) {
        this.f11191i = context;
        this.f11192j = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f11193k = (ClipboardListView) findViewById(R.id.clip_list);
        this.f11197o = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        this.f11198p = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
        this.f11197o.setDuration(1000);
        this.f11198p.setDuration(500);
    }

    public int getDisplayHeight() {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        int g = widgetManager.mo9648g().getKeyboard().mo9134g();
        if (this.f11187a != g) {
            this.f11187a = g;
            this.f11189c = C2878v.m13322b(this.f11190d, 6, this.f11187a, 0);
        }
        return (int) Math.ceil(widgetManager.mo9630ad().mo9251i() * ((double) this.f11189c));
    }

    public int getDisplayWidth() {
        return (int) Math.ceil(Engine.getInstance().getWidgetManager().mo9630ad().mo9250h() * ((double) this.f11188b));
    }

    /* renamed from: d */
    public void mo8510d() {
    }

    /* renamed from: e */
    public void mo8511e() {
        if (ClipboardBackend.getInstance() != null) {
            if (this.f11193k != null) {
                this.f11193k.setRemoveListener(this);
                if (this.f11195m != null) {
                    this.f11195m.clear();
                }
                this.f11193k.postInvalidate();
            }
            try {
                ClipboardBackend.getInstance().refreshClipboardSlot();
                this.f11193k = (ClipboardListView) findViewById(R.id.clip_list);
                this.f11199q = findViewById(R.id.clipboard_view_empty_notification);
                this.f11196n = (Button) findViewById(R.id.clipboard_view_back);
                this.f11196n.setOnClickListener(new C2617G(this));
                m11609g();
                m11611i();
                m11610h();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    private void m11609g() {
        C1602bh n = C1368X.m6320c().mo5841n();
        int c = (int) (((double) n.mo6265c((int) R.dimen.clipboard_empty_title_text_size)) * this.f11192j.mo9252j());
        ((TTextView) findViewById(R.id.clipboard_empty_message_view)).setTextSize(0, (float) ((int) (((double) n.mo6265c((int) R.dimen.clipboard_empty_message_text_size)) * this.f11192j.mo9252j())));
        ((TTextView) findViewById(R.id.clipboard_empty_title_view)).setTextSize(0, (float) c);
    }

    /* renamed from: h */
    private void m11610h() throws IOException, JSONException, NullPointerException {
        List<ClipBoardItem> readClipBoardItems = ClipboardBackend.getInstance().readClipBoardItems();
        this.f11195m = new ArrayList();
        if (m11612j()) {
            HashMap hashMap = new HashMap();
            hashMap.put("text", (Object) null);
            hashMap.put(f11184f, false);
            hashMap.put(f11185g, true);
            this.f11195m.add(hashMap);
        }
        int i = 0;
        while (i < readClipBoardItems.size() && i < ClipboardBackend.clipboardSlotNum) {
            ClipBoardItem clipBoardItem = readClipBoardItems.get(i);
            String str = clipBoardItem.text;
            if (!TextUtils.isEmpty(clipBoardItem.text)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", str);
                hashMap2.put(f11184f, Boolean.valueOf(clipBoardItem.locked));
                this.f11195m.add(hashMap2);
            }
            i++;
        }
        if (m11613k()) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("text", (Object) null);
            hashMap3.put(f11184f, false);
            hashMap3.put(f11186h, true);
            this.f11195m.add(hashMap3);
        }
        this.f11194l = new C2939q(this.f11191i, this.f11195m, R.layout.clipboard_item_view, new String[]{"text", f11184f}, new int[]{R.id.item_text, R.id.item_checkbox});
        this.f11194l.mo9736a((C2939q.C2940a) this);
        this.f11193k.setAdapter(this.f11194l);
        this.f11193k.postInvalidate();
    }

    /* renamed from: i */
    private void m11611i() {
        ClipboardBackend.getInstance().refreshClipboardSlot();
        if (ClipboardBackend.getInstance().getClipboardSlots() == 0) {
            this.f11199q.setVisibility(0);
        } else {
            this.f11199q.setVisibility(4);
        }
    }

    /* renamed from: j */
    private boolean m11612j() {
        return !Settings.getInstance().getBoolSetting(Settings.CLIPBOARD_NOTIFICATION_SHOWN) && ClipboardBackend.getInstance().getClipboardSlots() > 0;
    }

    /* renamed from: k */
    private boolean m11613k() {
        if (C1593bR.m7162a().f5076b) {
            return false;
        }
        int clipboardSlots = ClipboardBackend.getInstance().getClipboardSlots();
        int i = ClipboardBackend.clipboardSlotNum;
        int i2 = C2939q.f13346a;
        int i3 = ClipboardBackend.CLIP_BOARD_EXPANDED_SLOT;
        if (clipboardSlots < i - i2 || i == i3) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m11614l() {
        int i = ClipboardBackend.clipboardSlotNum;
        if (Settings.getInstance().getBoolSetting(Settings.CLIPBOARD_SLOT_EXPANDED_TOAST_SHOWN) || i != ClipboardBackend.CLIP_BOARD_EXPANDED_SLOT) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo8512f() {
        if (m11614l()) {
            Toast.makeText(this.f11191i, C1974m.m9063a(this.f11191i, (int) R.string.clipboard_slot_expanded_text), 1).show();
            Settings.getInstance().setBoolSetting(Settings.CLIPBOARD_SLOT_EXPANDED_TOAST_SHOWN, true);
        }
    }

    /* renamed from: c */
    private boolean m11606c(int i) {
        return i >= this.f11193k.getFirstVisiblePosition() && i <= this.f11193k.getLastVisiblePosition();
    }

    /* renamed from: d */
    private boolean m11607d(int i) {
        return i == this.f11193k.getLastVisiblePosition() && i != this.f11193k.getFirstVisiblePosition();
    }

    /* renamed from: e */
    private boolean m11608e(int i) {
        Resources resources = this.f11191i.getResources();
        int lastVisiblePosition = this.f11193k.getLastVisiblePosition() - 1;
        int firstVisiblePosition = this.f11193k.getFirstVisiblePosition();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.clipboard_item_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.clipboard_view_menu_height);
        int top = this.f11193k.getChildAt(i - firstVisiblePosition).getTop();
        if (i != lastVisiblePosition || getDisplayHeight() - top >= dimensionPixelSize2 + dimensionPixelSize) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo8504a() {
        m11611i();
    }

    /* renamed from: a */
    public void mo8507a(int i) {
        Resources resources = this.f11191i.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.clipboard_item_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.clipboard_view_menu_height);
        if (m11607d(i)) {
            this.f11193k.setSelectionFromTop(i, (getDisplayHeight() - dimensionPixelSize) - dimensionPixelSize2);
        } else if (m11608e(i)) {
            this.f11193k.setSelectionFromTop(i, (getDisplayHeight() - dimensionPixelSize) - dimensionPixelSize2);
        } else if (i == this.f11193k.getFirstVisiblePosition()) {
            this.f11193k.setSelection(i);
        }
    }

    /* renamed from: b */
    public void mo8508b(int i) {
        View childAt;
        int firstVisiblePosition = i - this.f11193k.getFirstVisiblePosition();
        if (m11606c(i) && (childAt = this.f11193k.getChildAt(firstVisiblePosition)) != null) {
            childAt.setVisibility(8);
        }
        if (i == this.f11193k.getCount() - 1) {
            if (i != 0) {
                this.f11193k.setSelection(i - this.f11193k.getChildCount());
            }
        } else if (i != 0) {
            this.f11193k.setSelection((i - firstVisiblePosition) - 1);
        }
    }

    /* renamed from: a */
    public void mo8505a(int i, int i2) {
        this.f11193k.scrollBy(i, i2);
        this.f11193k.mo8501a();
        this.f11194l.notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo8506b() {
        if (!Settings.getInstance().getBoolSetting(Settings.CLIPBOARD_NOTIFICATION_SHOWN) && this.f11194l.mo9740e() >= 0) {
            this.f11194l.mo9732a();
        }
    }

    /* renamed from: c */
    public void mo8509c() {
        Settings.getInstance().setBoolSetting(Settings.CLIPBOARD_NOTIFICATION_SHOWN, true);
    }
}
