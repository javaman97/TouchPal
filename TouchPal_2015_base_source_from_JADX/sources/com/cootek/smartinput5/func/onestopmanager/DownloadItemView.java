package com.cootek.smartinput5.func.onestopmanager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.R;

public class DownloadItemView extends LinearLayout {

    /* renamed from: a */
    public CheckBox f6448a;

    /* renamed from: b */
    private TextView f6449b;

    /* renamed from: c */
    private TextView f6450c;

    public DownloadItemView(Context context) {
        super(context);
    }

    public DownloadItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static DownloadItemView m8743a(Context context) {
        DownloadItemView downloadItemView = new DownloadItemView(context);
        inflate(context, R.layout.download_item_view, downloadItemView);
        downloadItemView.f6449b = (TextView) downloadItemView.findViewById(R.id.download_item_title);
        downloadItemView.f6448a = (CheckBox) downloadItemView.findViewById(R.id.download_item_checkbox);
        return downloadItemView;
    }

    /* access modifiers changed from: protected */
    public void setText(String str) {
        this.f6449b.setText(str);
    }

    /* access modifiers changed from: protected */
    public void setText(int i) {
        this.f6449b.setText(i);
    }
}
