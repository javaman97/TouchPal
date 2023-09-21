package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1624bv;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.settings.FontDialogPreference */
public class FontDialogPreference extends CustomizableDialogPreference {
    private LayoutInflater mInflater;

    public FontDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        updateSummary();
    }

    private void updateSummary() {
        int i;
        if (Settings.getInstance().getBoolSetting(Settings.USE_SYSTEM_DEFAULT_FONT)) {
            i = R.string.font_system_default;
        } else {
            i = R.string.font_touchpal_default;
        }
        setSummary(getResString(i));
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        ListView listView = (ListView) getDialog().findViewById(R.id.font_list);
        if (listView != null) {
            updateFontList(listView);
        }
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        updateSummary();
    }

    private void updateFontList(ListView listView) {
        C2957a aVar = new C2957a(this, (C3038ax) null);
        ArrayList unused = aVar.f13442b = getFontItems();
        listView.setAdapter(aVar);
        listView.setChoiceMode(1);
    }

    private ArrayList<C2958b> getFontItems() {
        ArrayList<C2958b> arrayList = new ArrayList<>();
        arrayList.addAll(getLocalItems());
        return arrayList;
    }

    private ArrayList<C2958b> getLocalItems() {
        ArrayList<C2958b> arrayList = new ArrayList<>();
        C2958b bVar = new C2958b(this, (C3038ax) null);
        boolean unused = bVar.f13444b = false;
        String unused2 = bVar.f13445c = getResString(R.string.font_touchpal_default);
        Typeface unused3 = bVar.f13446d = C1624bv.m7424d();
        arrayList.add(bVar);
        C2958b bVar2 = new C2958b(this, (C3038ax) null);
        boolean unused4 = bVar2.f13444b = true;
        String unused5 = bVar2.f13445c = getResString(R.string.font_system_default);
        Typeface unused6 = bVar2.f13446d = Typeface.DEFAULT;
        arrayList.add(bVar2);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public View getFontView(View view, C2958b bVar) {
        boolean z;
        if (Settings.getInstance().getBoolSetting(Settings.USE_SYSTEM_DEFAULT_FONT)) {
            z = bVar.f13444b;
        } else {
            z = !bVar.f13444b;
        }
        if (view == null) {
            if (this.mInflater == null) {
                this.mInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
            }
            view = this.mInflater.inflate(R.layout.font_selector_item, (ViewGroup) null);
        }
        CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.title);
        checkedTextView.setText(bVar.f13445c);
        checkedTextView.setTypeface(bVar.f13446d);
        checkedTextView.setChecked(z);
        checkedTextView.setOnClickListener(new C3038ax(this, bVar));
        return view;
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.FontDialogPreference$b */
    private class C2958b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f13444b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f13445c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Typeface f13446d;

        private C2958b() {
        }

        /* synthetic */ C2958b(FontDialogPreference fontDialogPreference, C3038ax axVar) {
            this();
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.FontDialogPreference$a */
    private class C2957a extends BaseAdapter {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ArrayList<C2958b> f13442b;

        private C2957a() {
        }

        /* synthetic */ C2957a(FontDialogPreference fontDialogPreference, C3038ax axVar) {
            this();
        }

        public int getCount() {
            return this.f13442b.size();
        }

        public Object getItem(int i) {
            return this.f13442b.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return FontDialogPreference.this.getFontView(view, this.f13442b.get(i));
        }
    }
}
