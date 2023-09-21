package com.cootek.smartinput5.plugin.typingrace;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.G */
/* compiled from: RankList */
class C2430G implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RankList f10616a;

    C2430G(RankList rankList) {
        this.f10616a = rankList;
    }

    public void onClick(View view) {
        Dialog dialog = new Dialog(this.f10616a);
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(this.f10616a.getResources().getDrawable(R.drawable.race_title_bg));
        dialog.setContentView(R.layout.alert_message);
        Button button = (Button) dialog.findViewById(R.id.ok);
        Button button2 = (Button) dialog.findViewById(R.id.cancel);
        ((TextView) dialog.findViewById(R.id.message)).setText(this.f10616a.getResString(R.string.race_share_to_weibo_query));
        button.setBackgroundResource(R.drawable.race_btn_bg);
        button.setText(this.f10616a.getResString(R.string.race_send));
        button.setOnClickListener(new C2432H(this));
        button2.setBackgroundResource(R.drawable.race_btn_bg);
        button2.setText(this.f10616a.getResString(R.string.race_cancel));
        button2.setOnClickListener(new C2433I(this));
        Dialog unused = this.f10616a.f10703s = dialog;
        if (!dialog.isShowing()) {
            dialog.show();
        }
    }
}
