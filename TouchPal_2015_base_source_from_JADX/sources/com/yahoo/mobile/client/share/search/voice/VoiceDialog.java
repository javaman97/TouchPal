package com.yahoo.mobile.client.share.search.voice;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.app.C0163l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.interfaces.IImageProcessor;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4241f;
import com.yahoo.mobile.client.share.search.util.C4247l;
import com.yahoo.mobile.client.share.search.util.ColorUtils;

public class VoiceDialog extends C0163l implements View.OnClickListener {

    /* renamed from: a */
    public static final String f17385a = VoiceDialog.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f17386b;

    /* renamed from: c */
    private View f17387c;

    /* renamed from: d */
    private RelativeLayout f17388d;

    /* renamed from: e */
    private ImageView f17389e;

    /* renamed from: f */
    private TextView f17390f;

    /* renamed from: g */
    private View f17391g;

    /* renamed from: h */
    private String f17392h;

    /* renamed from: i */
    private AnimatedCircleView f17393i;

    /* renamed from: j */
    private ScreenshotListener f17394j;

    /* renamed from: k */
    private VoiceDialogListener f17395k;

    public interface ScreenshotListener {
        Bitmap takeScreenshot();
    }

    public interface VoiceDialogListener {
        void onDialogDismissed();

        void onMicrophonePressed();
    }

    public VoiceDialog() {
    }

    @SuppressLint({"ValidFragment"})
    public VoiceDialog(Context context, VoiceDialogListener voiceDialogListener) {
        this(context, voiceDialogListener, (byte) 0);
    }

    @SuppressLint({"ValidFragment"})
    private VoiceDialog(Context context, VoiceDialogListener voiceDialogListener, byte b) {
        this.f17386b = context;
        this.f17394j = new ScreenshotListener() {
            public final Bitmap takeScreenshot() {
                return C4241f.m17770a((Activity) VoiceDialog.this.f17386b);
            }
        };
        this.f17395k = voiceDialogListener;
        setStyle(1, 16973840);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IImageProcessor imageProcessor;
        Bitmap takeScreenshot;
        Bitmap blur;
        if (bundle != null) {
            if (isResumed()) {
                dismiss();
            }
            return null;
        }
        this.f17387c = layoutInflater.inflate(C4073a.C4083j.yssdk_listening, viewGroup, false);
        this.f17390f = (TextView) this.f17387c.findViewById(C4073a.C4081h.microphone);
        this.f17390f.setText(getString(C4073a.C4086m.yssdk_mic_icon));
        this.f17390f.setTypeface(C4247l.m17792a(this.f17386b));
        this.f17390f.setOnClickListener(this);
        this.f17391g = this.f17387c.findViewById(C4073a.C4081h.cancel_button);
        this.f17391g.setClickable(true);
        this.f17391g.setOnClickListener(this);
        ColorUtils.ThemeColor themeColor = new ColorUtils.ThemeColor(getResources().getColor(C4073a.C4078e.translucent_white), getResources().getColor(C4073a.C4078e.white));
        View[] viewArr = {this.f17391g};
        int i = themeColor.f17312a;
        int i2 = themeColor.f17313b;
        for (View view : viewArr) {
            if (view != null) {
                if (view instanceof Button) {
                    StateListDrawable stateListDrawable = (StateListDrawable) ((Button) view).getBackground();
                    stateListDrawable.selectDrawable(0);
                    ((GradientDrawable) stateListDrawable.getCurrent().mutate()).setColor(i2);
                    stateListDrawable.selectDrawable(1);
                    ((GradientDrawable) stateListDrawable.getCurrent().mutate()).setColor(i);
                } else if (view instanceof TextView) {
                    ((TextView) view).setTextColor(i2);
                }
            }
        }
        this.f17388d = (RelativeLayout) this.f17387c.findViewById(C4073a.C4081h.listening_dialog);
        this.f17389e = (ImageView) this.f17387c.findViewById(C4073a.C4081h.voice_background);
        this.f17389e.setBackgroundColor(-67108865);
        if (!(!C4129c.m17447l() || Build.VERSION.SDK_INT < 11 || (imageProcessor = C4129c.m17444i().getImageProcessor()) == null || (takeScreenshot = this.f17394j.takeScreenshot()) == null || (blur = imageProcessor.blur(takeScreenshot, 14, takeScreenshot.getWidth() / 6, takeScreenshot.getHeight() / 6, true)) == null)) {
            this.f17389e.setImageDrawable(new BitmapDrawable(getResources(), blur));
        }
        mo15893a(getResources().getString(C4073a.C4086m.yssdk_initializing));
        mo15891a();
        return this.f17387c;
    }

    public void onStart() {
        super.onStart();
        if (getDialog() != null) {
            getDialog().getWindow().setWindowAnimations(C4073a.C4087n.DialogAnimationFade);
        }
    }

    /* renamed from: a */
    public final void mo15891a() {
        this.f17393i = new AnimatedCircleView(this.f17386b);
        this.f17393i.setVisibility(4);
        if (this.f17388d != null) {
            this.f17388d.addView(this.f17393i);
            this.f17390f.bringToFront();
        }
    }

    /* renamed from: a */
    public final void mo15893a(String str) {
        this.f17392h = str;
        TextView textView = (TextView) this.f17387c.findViewById(C4073a.C4081h.text_listeningStatus);
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: b */
    public final void mo15894b() {
        ((RelativeLayout) this.f17387c.findViewById(C4073a.C4081h.listening_dialog)).removeView(this.f17393i);
        this.f17393i = null;
    }

    /* renamed from: a */
    public final void mo15892a(float f) {
        if (this.f17393i != null) {
            this.f17393i.setVisibility(0);
            this.f17393i.mo15889a((int) f);
        }
    }

    /* renamed from: c */
    public final void mo15895c() {
        this.f17390f.setEnabled(false);
    }

    /* renamed from: d */
    public final void mo15896d() {
        this.f17390f.setEnabled(true);
    }

    public void onClick(View view) {
        if (view == this.f17391g) {
            dismiss();
        } else if (view == this.f17390f) {
            this.f17395k.onMicrophonePressed();
        }
    }

    public void onPause() {
        if (this.f17386b != null) {
            ((Activity) this.f17386b).setVolumeControlStream(2);
        }
        dismiss();
        super.onPause();
    }

    public void dismiss() {
        this.f17395k.onDialogDismissed();
        if (isResumed()) {
            super.dismiss();
        }
    }
}
