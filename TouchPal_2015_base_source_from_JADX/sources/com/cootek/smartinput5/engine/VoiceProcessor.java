package com.cootek.smartinput5.engine;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput.p044a.C0964c;
import com.cootek.smartinput.p044a.C0974m;
import com.cootek.smartinput.p044a.C0975n;
import com.cootek.smartinput.p044a.C0976o;
import com.cootek.smartinput.p044a.C0977p;
import com.cootek.smartinput.p044a.C0978q;
import com.cootek.smartinput.p044a.C0979r;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.C2917du;
import com.emoji.keyboard.touchpal.R;

public class VoiceProcessor {
    private static final String TAG = "VoiceProcessor";
    /* access modifiers changed from: private */
    public Context mContext = this.mEngine.getIms();
    /* access modifiers changed from: private */
    public Engine mEngine;
    private C0974m mImeRecognitionListener;
    /* access modifiers changed from: private */
    public boolean mStarted;
    private C0979r mVoiceInput;

    public VoiceProcessor(Engine engine) {
        this.mEngine = engine;
    }

    public int getRecognitionState() {
        if (this.mImeRecognitionListener == null) {
            return 0;
        }
        return this.mImeRecognitionListener.mo3992a();
    }

    public void startInputVoice() {
        startInputVoice(true, (C0975n) null, (C0977p) null);
    }

    public void startInputVoice(boolean z, C0975n nVar, C0977p pVar) {
        try {
            if (!TextUtils.isEmpty(this.mEngine.getCurrentLanguageId())) {
                TextView textView = (TextView) this.mEngine.getWidgetManager().mo9609O().findViewById(R.id.vi_message);
                if (!C0978q.m5067c()) {
                    textView.setText(C1974m.m9063a(this.mContext, (int) R.string.vi_not_supported));
                    C2917du.m13394I();
                } else if (!C2188Q.m9853a().mo7686f()) {
                    textView.setText(C1974m.m9063a(this.mContext, (int) R.string.vi_not_nonetwork));
                    showNetworkUnavailableDialog();
                } else {
                    if (this.mVoiceInput == null) {
                        this.mVoiceInput = new C0979r(this.mContext);
                    }
                    String inputLanguage = getInputLanguage();
                    C0978q.m5060a(this.mContext, inputLanguage);
                    startListening(inputLanguage, nVar, pVar);
                }
            }
        } catch (VerifyError e) {
            Toast.makeText(this.mContext, C1974m.m9063a(this.mContext, (int) R.string.vi_not_supported), 0).show();
        }
    }

    public void showDownloadVoiceEngineDialog() {
        C2894d.C2895a aVar = new C2894d.C2895a(this.mContext);
        aVar.setMessage(C1974m.m9063a(this.mContext, (int) R.string.vi_need_system_voice));
        aVar.setNegativeButton(C1974m.m9063a(this.mContext, 17039360), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        aVar.setPositiveButton(C1974m.m9063a(this.mContext, 17039379), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.voicesearch"));
                intent.setFlags(Engine.EXCEPTION_ERROR);
                try {
                    VoiceProcessor.this.mContext.startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(VoiceProcessor.this.mContext, C1974m.m9063a(VoiceProcessor.this.mContext, (int) R.string.vi_no_market), 1).show();
                }
            }
        });
        AlertDialog create = aVar.create();
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        window.setAttributes(attributes);
        window.addFlags(131072);
        Engine.getInstance().getDialogManager().showDialog(create);
    }

    public void showNetworkUnavailableDialog() {
        C2894d.C2895a aVar = new C2894d.C2895a(this.mContext);
        aVar.setMessage(C1974m.m9063a(this.mContext, (int) R.string.vi_need_network));
        aVar.setNegativeButton(C1974m.m9063a(this.mContext, 17039360), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        aVar.setPositiveButton(C1974m.m9063a(this.mContext, 17039379), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.settings.WIFI_SETTINGS");
                intent.setFlags(Engine.EXCEPTION_ERROR);
                try {
                    VoiceProcessor.this.mContext.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        AlertDialog create = aVar.create();
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        window.setAttributes(attributes);
        window.addFlags(131072);
        Engine.getInstance().getDialogManager().showDialog(create);
    }

    private void startListening(String str, C0975n nVar, C0977p pVar) {
        this.mVoiceInput.mo4012b(str);
        if (this.mImeRecognitionListener == null) {
            this.mImeRecognitionListener = new C0974m(this.mContext);
            this.mImeRecognitionListener.mo3995a((C0976o) new C0976o() {
                /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void OnRecognitionResults(com.cootek.smartinput.p044a.C0973l r6, java.util.Collection<java.lang.String> r7) {
                    /*
                        r5 = this;
                        r4 = 0
                        r1 = 0
                        if (r7 == 0) goto L_0x0062
                        boolean r0 = r7.isEmpty()
                        if (r0 != 0) goto L_0x0062
                        java.util.Iterator r2 = r7.iterator()
                    L_0x000e:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L_0x0062
                        java.lang.Object r0 = r2.next()
                        java.lang.String r0 = (java.lang.String) r0
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x000e
                    L_0x0020:
                        boolean r1 = android.text.TextUtils.isEmpty(r0)
                        if (r1 != 0) goto L_0x0047
                        com.cootek.smartinput5.engine.Engine r1 = com.cootek.smartinput5.engine.Engine.getInstance()
                        java.lang.String r2 = "D"
                        r1.updateInputOp(r2)
                        com.cootek.smartinput5.engine.VoiceProcessor r1 = com.cootek.smartinput5.engine.VoiceProcessor.this
                        com.cootek.smartinput5.engine.Engine r1 = r1.mEngine
                        r1.fireCommitOperation((java.lang.String) r0)
                        com.cootek.smartinput5.engine.VoiceProcessor r0 = com.cootek.smartinput5.engine.VoiceProcessor.this
                        com.cootek.smartinput5.engine.Engine r0 = r0.mEngine
                        r0.processEvent()
                    L_0x0041:
                        com.cootek.smartinput5.engine.VoiceProcessor r0 = com.cootek.smartinput5.engine.VoiceProcessor.this
                        boolean unused = r0.mStarted = r4
                        return
                    L_0x0047:
                        com.cootek.smartinput5.engine.VoiceProcessor r0 = com.cootek.smartinput5.engine.VoiceProcessor.this
                        android.content.Context r0 = r0.mContext
                        com.cootek.smartinput5.engine.VoiceProcessor r1 = com.cootek.smartinput5.engine.VoiceProcessor.this
                        android.content.Context r1 = r1.mContext
                        r2 = 2131625691(0x7f0e06db, float:1.8878597E38)
                        java.lang.String r1 = com.cootek.smartinput5.func.resource.C1974m.m9063a((android.content.Context) r1, (int) r2)
                        android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r4)
                        r0.show()
                        goto L_0x0041
                    L_0x0062:
                        r0 = r1
                        goto L_0x0020
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.engine.VoiceProcessor.C13135.OnRecognitionResults(com.cootek.smartinput.a.l, java.util.Collection):void");
                }
            });
        }
        this.mImeRecognitionListener.mo3994a(nVar);
        this.mImeRecognitionListener.mo3996a(pVar);
        this.mImeRecognitionListener.mo3993a((C0964c) this.mEngine.getWidgetManager().mo9609O());
        this.mImeRecognitionListener.mo3997a(this.mVoiceInput);
        this.mStarted = true;
    }

    private String getInputLanguage() {
        String stringSetting = Settings.getInstance().getStringSetting(Settings.VOICE_INPUT_LANGUAGE);
        if (!TextUtils.isEmpty(stringSetting)) {
            return stringSetting;
        }
        C1368X.m6320c().mo5842o().mo5914D();
        return C1368X.m6320c().mo5842o().mo5954l(Engine.getInstance().getCurrentLanguageId()).f4732k;
    }

    public void cancelInputVoice() {
        if (this.mImeRecognitionListener != null && this.mVoiceInput != null) {
            this.mImeRecognitionListener.mo3999c(this.mVoiceInput);
            this.mStarted = false;
        }
    }

    public void stopInputVoice() {
        if (this.mImeRecognitionListener != null && this.mVoiceInput != null && this.mStarted) {
            this.mImeRecognitionListener.mo3998b(this.mVoiceInput);
            this.mStarted = false;
        }
    }
}
