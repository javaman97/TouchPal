package com.cootek.smartinput5.func.smileypanel.p057b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.smileypanel.SmileyListView;
import com.cootek.smartinput5.func.smileypanel.p057b.p058a.C2020i;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.d */
/* compiled from: EmojiDisplayAdapter */
public class C2030d extends BaseAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f7057a;

    /* renamed from: b */
    private int f7058b = 255;

    /* renamed from: c */
    private ArrayList<C2029c> f7059c;

    public C2030d(Context context) {
        this.f7057a = context;
    }

    /* renamed from: a */
    public void mo7383a(ArrayList<C2029c> arrayList) {
        this.f7059c = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo7382a(int i) {
        this.f7058b = i;
    }

    public int getCount() {
        int i = 0;
        if (this.f7059c != null) {
            i = this.f7059c.size();
        }
        return i + m9349a();
    }

    public Object getItem(int i) {
        if (this.f7059c == null) {
            return null;
        }
        return this.f7059c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i == getCount() - 1 && m9352b()) {
            return m9355d();
        }
        if (this.f7059c != null) {
            return this.f7059c.get(i).mo7380a(this.f7057a, view, this.f7058b);
        }
        return null;
    }

    /* renamed from: a */
    private int m9349a() {
        if (m9352b()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private boolean m9352b() {
        return (C2020i.m9332a().mo7377b().size() > 0) && Settings.getInstance().getBoolSetting(Settings.SHOW_EMOJI_WORKING_TIPS) && m9354c() && C1351J.m6188a().mo5651j();
    }

    /* renamed from: c */
    private boolean m9354c() {
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB);
        if (SmileyListView.f6864c.equals(stringSetting) || SmileyListView.f6865d.equals(stringSetting)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private View m9355d() {
        C1602bh n = C1368X.m6320c().mo5841n();
        View inflate = ((LayoutInflater) this.f7057a.getSystemService("layout_inflater")).inflate(R.layout.emoji_working_feedback, (ViewGroup) null);
        int t = Engine.getInstance().getWidgetManager().mo9630ad().mo9262t() / 3;
        inflate.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        inflate.setPadding(t / 2, 0, t / 2, 0);
        ((TextView) inflate.findViewById(R.id.emoji_working_title)).setTextColor(n.mo6260b((int) R.color.emoji_work_title_color));
        Button button = (Button) inflate.findViewById(R.id.emoji_fine_btn);
        button.setBackgroundDrawable(n.mo6249a((int) R.drawable.selector_emoji_work_fine));
        button.setTextColor(n.mo6260b((int) R.color.emoji_work_btn_text_color));
        Button button2 = (Button) inflate.findViewById(R.id.emoji_wrong_btn);
        button2.setBackgroundDrawable(n.mo6249a((int) R.drawable.selector_emoji_work_wrong));
        button2.setTextColor(n.mo6260b((int) R.color.emoji_work_btn_text_color));
        button.setOnClickListener(new C2031e(this));
        button2.setOnClickListener(new C2032f(this));
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9356e() {
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m9357f() {
        Settings.getInstance().setBoolSetting(Settings.SHOW_EMOJI_WORKING_TIPS, false);
    }
}
