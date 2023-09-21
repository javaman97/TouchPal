package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageSharePreference */
public class LanguageSharePreference extends CustomizablePreference {
    private ShareFrame mContent;
    private Context mContext;
    private int mCount;
    private String mTitle;

    public LanguageSharePreference(Context context) {
        super(context);
        init(context);
    }

    public LanguageSharePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        setLayoutResource(R.layout.share_frame);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.mContent = (ShareFrame) view.findViewById(R.id.share_content);
        doUpdateTitle();
    }

    private void doUpdateTitle() {
        if (this.mContent != null) {
            this.mContent.setTitle(this.mTitle);
            this.mContent.mo9959a(this.mCount);
        }
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        int layoutResource = super.getLayoutResource();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(layoutResource, viewGroup, false);
        this.customFunc.mo9809a((View) viewGroup);
        layoutInflater.inflate(R.layout.custom_checkbox_preference, (ViewGroup) inflate.findViewById(16908312));
        return inflate;
    }

    public void updateLimitTitle() {
        String resString;
        int a = C1368X.m6320c().mo5827M().mo5986a(0);
        if (a > 0) {
            resString = getResString(R.string.optpage_language_limitation, Integer.valueOf(a));
        } else {
            resString = getResString(R.string.optpage_reach_limitation);
        }
        this.mCount = a;
        this.mTitle = resString;
        doUpdateTitle();
    }
}
