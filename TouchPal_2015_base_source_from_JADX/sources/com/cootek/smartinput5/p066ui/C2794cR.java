package com.cootek.smartinput5.p066ui;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1713e;
import com.cootek.smartinput5.func.component.ContactProvider;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.ui.cR */
/* compiled from: UserWordDialog */
public class C2794cR extends C2869n {

    /* renamed from: a */
    ArrayList<C2796b> f12413a = new ArrayList<>();

    /* renamed from: b */
    private LinearLayout f12414b;

    /* renamed from: c */
    private ContentResolver f12415c;

    /* renamed from: d */
    private int f12416d;

    /* renamed from: e */
    private int f12417e;

    /* renamed from: f */
    private int f12418f;

    /* renamed from: g */
    private ContactProvider f12419g;

    /* renamed from: h */
    private View.OnClickListener f12420h = new C2801cW(this);

    /* renamed from: i */
    private View.OnClickListener f12421i = new C2802cX(this);

    /* renamed from: j */
    private View.OnClickListener f12422j = new C2803cY(this);

    public C2794cR(Context context) {
        super(context, true, false);
        this.f12415c = context.getContentResolver();
        this.f12419g = ContactProvider.createContactProvider();
    }

    /* renamed from: a */
    public void mo9122a(CandidateItem candidateItem) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!mo9536c_() && candidateItem != null && !candidateItem.isBigram()) {
            this.f12417e = mo9539i().getResources().getDimensionPixelSize(R.dimen.dialog_item_padding_horizontal);
            this.f12416d = mo9539i().getResources().getDimensionPixelSize(R.dimen.dialog_item_padding_vertical);
            this.f12418f = mo9539i().getResources().getDimensionPixelSize(R.dimen.adjust_userword_priority_title);
            mo9528a((CharSequence) mo9538e(R.string.edit_userword) + " \"" + candidateItem.word + "\"");
            View inflate = ((LayoutInflater) mo9539i().getSystemService("layout_inflater")).inflate(R.layout.user_word_dlg, (ViewGroup) null, false);
            ((Button) inflate.findViewById(R.id.higher)).setOnClickListener(new C2797cS(this, candidateItem));
            ((Button) inflate.findViewById(R.id.lower)).setOnClickListener(new C2798cT(this, candidateItem));
            ((Button) inflate.findViewById(R.id.delete)).setOnClickListener(new C2799cU(this, candidateItem));
            if (candidateItem.canAdjustPriority()) {
                z = true;
                z2 = true;
            } else {
                inflate.findViewById(R.id.higher).setVisibility(8);
                inflate.findViewById(R.id.adjust_userword_divider).setVisibility(8);
                inflate.findViewById(R.id.lower).setVisibility(8);
                z = false;
                z2 = false;
            }
            if (candidateItem.canDeleteWord()) {
                z3 = true;
                z2 = true;
            } else {
                inflate.findViewById(R.id.delete).setVisibility(8);
                z3 = false;
            }
            if (!z || !z3) {
                inflate.findViewById(R.id.edit_userword_divider).setVisibility(8);
            }
            View findViewById = inflate.findViewById(R.id.edit_userword_frame);
            if (findViewById != null && !z && !z3) {
                findViewById.setVisibility(8);
            }
            View findViewById2 = inflate.findViewById(R.id.advertisement_frame);
            if (findViewById2 != null) {
                if (candidateItem.isAd()) {
                    C1713e.C1715a a = C1368X.m6320c().mo5853z().mo6626a(Engine.getInstance().getCandidateItemPredictText(candidateItem.index));
                    if (a != null) {
                        findViewById2.findViewById(R.id.divider);
                        TextView textView = (TextView) findViewById2.findViewById(R.id.advertisement);
                        textView.setTag(a);
                        m12722a(textView);
                        z4 = true;
                    } else {
                        Engine.getInstance().fireDeleteAdOperation(candidateItem.word);
                        Engine.getInstance().processEvent();
                        findViewById2.setVisibility(8);
                        z4 = z2;
                    }
                    z2 = z4;
                } else {
                    findViewById2.setVisibility(8);
                }
            }
            this.f12413a.clear();
            this.f12414b = (LinearLayout) inflate.findViewById(R.id.contact_info_frame);
            if (this.f12414b == null || !candidateItem.isContact()) {
                ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.contact_frame_scroll);
                if (scrollView != null) {
                    scrollView.setVisibility(8);
                }
            } else if (m12727a(Engine.getInstance().getCandidateItemPredictText(candidateItem.index))) {
                m12731h();
                if (Settings.getInstance().getConfig().getOrientation() == 2) {
                    ScrollView scrollView2 = (ScrollView) inflate.findViewById(R.id.contact_frame_scroll);
                    ViewGroup.LayoutParams layoutParams = scrollView2.getLayoutParams();
                    scrollView2.setFadingEdgeLength(30);
                    scrollView2.setVerticalScrollBarEnabled(true);
                    scrollView2.setVerticalFadingEdgeEnabled(true);
                    scrollView2.setLayoutParams(layoutParams);
                }
            } else {
                candidateItem.deleteUserWord(false);
            }
            if (z2) {
                mo9526a(inflate);
                super.mo7053a();
                Engine.getInstance().feedback(true);
            }
        }
    }

    /* renamed from: a */
    private void m12722a(TextView textView) {
        C1713e.C1715a aVar = (C1713e.C1715a) textView.getTag();
        textView.setText(aVar.mo6629a());
        textView.setTextSize(0, (float) this.f12418f);
        textView.setOnClickListener(new C2800cV(this, aVar));
    }

    /* renamed from: com.cootek.smartinput5.ui.cR$b */
    /* compiled from: UserWordDialog */
    private static class C2796b {

        /* renamed from: a */
        public long f12426a;

        /* renamed from: b */
        public String f12427b;

        /* renamed from: c */
        public Map<String, C2795a> f12428c;

        private C2796b() {
        }

        /* synthetic */ C2796b(C2797cS cSVar) {
            this();
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof C2796b) {
                C2796b bVar = (C2796b) obj;
                if (!(this.f12427b == null || !this.f12427b.equals(bVar.f12427b) || this.f12428c == null || bVar.f12428c == null)) {
                    for (String next : this.f12428c.keySet()) {
                        C2795a aVar = this.f12428c.get(next);
                        C2795a aVar2 = bVar.f12428c.get(next);
                        if (aVar2 == null) {
                            return false;
                        }
                        if (!aVar.f12424b.equals(aVar2.f12424b)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.cR$a */
    /* compiled from: UserWordDialog */
    private static class C2795a {

        /* renamed from: a */
        public String f12423a;

        /* renamed from: b */
        public String f12424b;

        /* renamed from: c */
        public String f12425c;

        private C2795a() {
        }

        /* synthetic */ C2795a(C2797cS cSVar) {
            this();
        }
    }

    /* renamed from: a */
    private Cursor m12718a(ContentResolver contentResolver, long j) {
        return this.f12419g.getPhoneNumberCursor(contentResolver, j);
    }

    /* renamed from: a */
    private Cursor m12719a(ContentResolver contentResolver, String str) {
        return this.f12419g.getContactNameCursor(contentResolver, str);
    }

    /* renamed from: a */
    private boolean m12727a(String str) {
        boolean z = true;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f12413a.clear();
        if (this.f12419g == null) {
            this.f12419g = ContactProvider.createContactProvider();
            if (this.f12419g == null) {
                return false;
            }
        }
        Cursor a = m12719a(this.f12415c, str);
        if (a == null || a.getCount() == 0) {
            return false;
        }
        if (a != null) {
            if (a.moveToFirst()) {
                do {
                    C2796b bVar = new C2796b((C2797cS) null);
                    bVar.f12426a = a.getLong(0);
                    bVar.f12427b = a.getString(1);
                    if (Engine.getInstance().isWordContact(str, bVar.f12427b)) {
                        if (a.getInt(2) > 0) {
                            Cursor a2 = m12718a(this.f12415c, bVar.f12426a);
                            if (a2 != null) {
                                try {
                                    if (a2.moveToFirst()) {
                                        bVar.f12428c = new HashMap();
                                        do {
                                            C2795a aVar = new C2795a((C2797cS) null);
                                            aVar.f12423a = bVar.f12427b;
                                            aVar.f12424b = a2.getString(1);
                                            aVar.f12425c = this.f12419g.getPhoneTypeName(mo9539i(), a2);
                                            bVar.f12428c.put(aVar.f12424b, aVar);
                                        } while (a2.moveToNext());
                                    }
                                } catch (Throwable th) {
                                    if (a != null) {
                                        a.close();
                                    }
                                    throw th;
                                }
                            }
                            if (a2 != null) {
                                try {
                                    a2.close();
                                } catch (Exception e) {
                                }
                            }
                        }
                        if (bVar.f12428c != null && !m12725a(bVar)) {
                            this.f12413a.add(bVar);
                        }
                    }
                } while (a.moveToNext());
            }
        }
        if (a != null) {
            a.close();
        }
        if (this.f12413a.isEmpty()) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m12725a(C2796b bVar) {
        if (this.f12413a == null) {
            return false;
        }
        Iterator<C2796b> it = this.f12413a.iterator();
        while (it.hasNext()) {
            if (it.next().equals(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m12730g() {
        return this.f12413a != null && !this.f12413a.isEmpty();
    }

    /* renamed from: h */
    private void m12731h() {
        this.f12414b.removeAllViews();
        if (m12730g()) {
            List<ResolveInfo> queryIntentActivities = mo9539i().getPackageManager().queryIntentActivities(new Intent("com.cootek.smartdialer.action.VIEW_DETAIL"), 32);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f12413a.size()) {
                    break;
                }
                C2796b bVar = this.f12413a.get(i2);
                if (bVar.f12428c != null) {
                    for (C2795a a : bVar.f12428c.values()) {
                        this.f12414b.addView(m12720a(a));
                        mo9531b((ViewGroup) this.f12414b);
                    }
                    if (!queryIntentActivities.isEmpty()) {
                        this.f12414b.addView(m12728b(bVar));
                        if (i2 < this.f12413a.size() - 1) {
                            mo9531b((ViewGroup) this.f12414b);
                        }
                    }
                }
                i = i2 + 1;
            }
            if (queryIntentActivities.isEmpty()) {
                this.f12414b.addView(m12733l());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m12732k() {
        return true;
    }

    /* renamed from: a */
    private View m12720a(C2795a aVar) {
        LinearLayout linearLayout = new LinearLayout(mo9539i());
        linearLayout.setOrientation(0);
        linearLayout.setTag(aVar);
        linearLayout.setBackgroundDrawable(mo9539i().getResources().getDrawable(R.drawable.bg_dialog_btn_ctrl));
        linearLayout.setOnClickListener(this.f12420h);
        linearLayout.setPadding(this.f12417e, 0, this.f12416d, 0);
        LinearLayout linearLayout2 = new LinearLayout(mo9539i());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(mo9539i());
        if (TextUtils.isEmpty(aVar.f12425c)) {
            textView.setText(String.format("%s \"%s\"", new Object[]{mo9538e(R.string.insert_contact_info), aVar.f12423a}));
        } else {
            textView.setText(String.format("%s \"%s(%s)\"", new Object[]{mo9538e(R.string.insert_contact_info), aVar.f12423a, aVar.f12425c}));
        }
        textView.setTextSize(0, (float) mo9539i().getResources().getDimensionPixelSize(R.dimen.adjust_userword_priority_title));
        textView.setTextColor(mo9539i().getResources().getColor(R.color.dlg_list_item_title_textcolor));
        TextView textView2 = new TextView(mo9539i());
        textView2.setText(aVar.f12424b);
        textView2.setTextSize(0, (float) this.f12418f);
        textView2.setTextColor(mo9539i().getResources().getColor(R.color.dlg_list_item_summary_textcolor));
        linearLayout2.addView(textView);
        linearLayout2.addView(textView2);
        linearLayout2.setPadding(0, this.f12416d, 0, this.f12416d);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* renamed from: b */
    private View m12728b(C2796b bVar) {
        TextView textView = new TextView(mo9539i());
        textView.setText(mo9538e(R.string.dialer_view_detail));
        textView.setTextSize(0, (float) this.f12418f);
        textView.setTextColor(mo9539i().getResources().getColor(R.color.dlg_list_item_title_textcolor));
        textView.setTag(Long.valueOf(bVar.f12426a));
        textView.setOnClickListener(this.f12421i);
        textView.setBackgroundDrawable(mo9539i().getResources().getDrawable(R.drawable.bg_dialog_btn_ctrl));
        textView.setPadding(this.f12417e, this.f12416d, 0, this.f12416d);
        return textView;
    }

    /* renamed from: l */
    private View m12733l() {
        TextView textView = new TextView(mo9539i());
        textView.setText(mo9538e(R.string.dialer_install));
        textView.setTextSize(0, (float) this.f12418f);
        textView.setTextColor(mo9539i().getResources().getColor(R.color.dlg_list_item_title_textcolor));
        textView.setOnClickListener(this.f12422j);
        textView.setBackgroundDrawable(mo9539i().getResources().getDrawable(R.drawable.bg_dialog_btn_ctrl));
        textView.setPadding(this.f12417e, this.f12416d, 0, this.f12416d);
        return textView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12724a(Long l) {
        Bundle bundle = new Bundle();
        bundle.putLongArray("view_detail_extra_contact_id", new long[]{l.longValue()});
        Intent intent = new Intent();
        intent.setAction("com.cootek.smartdialer.action.VIEW_DETAIL");
        bundle.putString("view_detail_extra_tab_tags", "contact");
        bundle.putLong("view_detail_extra_contact_id", l.longValue());
        intent.putExtra("view_detail_extra", bundle);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        mo9539i().startActivity(intent);
    }
}
