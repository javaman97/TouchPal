package com.yahoo.mobile.client.share.search.controllers;

import android.content.Context;
import android.support.p001v4.app.C0163l;
import android.support.p001v4.app.C0167o;
import android.support.p001v4.app.C0173s;
import android.text.TextUtils;
import com.cootek.geo.AbsGeoLocationItem;
import com.cootek.smartinput5.func.C1389aD;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizer;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizerListener;
import com.yahoo.mobile.client.share.search.interfaces.SpeechError;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.voice.VoiceDialog;
import java.util.HashMap;

public class VoiceController implements IVoiceRecognizerListener, VoiceDialog.VoiceDialogListener {
    public static final String TAG = "VoiceController";
    public static final int VOICE_ERROR = 0;
    public static final int VOICE_PROCESSING = 1;
    public static final int VOICE_RECOGNIZED = 3;
    public static final int VOICE_RECORDING = 2;

    /* renamed from: a */
    protected IVoiceRecognizer f16625a;

    /* renamed from: b */
    protected VoiceDialog f16626b;

    /* renamed from: c */
    protected boolean f16627c = false;

    /* renamed from: d */
    private final C0167o f16628d;

    /* renamed from: e */
    private String f16629e = C1389aD.f4365a;

    /* renamed from: f */
    private Runnable f16630f;

    /* renamed from: g */
    private long f16631g;

    /* renamed from: h */
    private long f16632h;

    /* renamed from: i */
    private IVoiceControllerListener f16633i;

    public interface IVoiceControllerListener {
        void onVoiceDialogDismissed(VoiceController voiceController);

        void onVoiceResult(VoiceController voiceController, SearchQuery searchQuery);
    }

    public VoiceController(C0167o oVar, IVoiceControllerListener iVoiceControllerListener) {
        this.f16628d = oVar;
        this.f16633i = iVoiceControllerListener;
        if (C4129c.m17433a((Context) this.f16628d)) {
            setVoiceSearchLocale();
            this.f16625a = C4129c.m17444i().createVoiceRecognizer(this.f16628d, this.f16629e, this);
        }
    }

    public void startVoiceSearch() {
        this.f16625a.startRecording();
        this.f16627c = true;
        new StringBuilder("Start voice search with provider: ").append(this.f16625a.getVoiceRecognitionProvider());
        this.f16632h = System.currentTimeMillis();
        this.f16628d.setVolumeControlStream(3);
        C0173s supportFragmentManager = this.f16628d.getSupportFragmentManager();
        if (this.f16626b == null) {
            this.f16626b = new VoiceDialog(this.f16628d, this);
        }
        if (!this.f16626b.isResumed() && !this.f16626b.isAdded()) {
            this.f16626b.show(supportFragmentManager, "fragment_voice");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("screen_name", "sch_voice_screen");
        hashMap.put("sch_mthd", this.f16625a.getVoiceRecognitionProvider());
        C4242g.m17773a(980778382, "page_view_classic", hashMap);
    }

    public void setupDialog(int i, String str) {
        if (this.f16626b != null) {
            switch (i) {
                case 0:
                    if (TextUtils.isEmpty(str)) {
                        str = this.f16628d.getResources().getString(C4073a.C4086m.yssdk_voice_error);
                        break;
                    }
                    break;
                case 1:
                    if (TextUtils.isEmpty(str)) {
                        str = this.f16628d.getResources().getString(C4073a.C4086m.yssdk_voice_processing);
                        break;
                    }
                    break;
                case 2:
                    if (TextUtils.isEmpty(str)) {
                        str = this.f16628d.getResources().getString(C4073a.C4086m.yssdk_voice_listening);
                        break;
                    }
                    break;
                case 3:
                    if (TextUtils.isEmpty(str)) {
                        str = this.f16628d.getResources().getString(C4073a.C4086m.yssdk_voice_processing);
                        break;
                    }
                    break;
            }
            this.f16626b.mo15893a(str);
        }
    }

    public boolean isVoiceAvailable() {
        return this.f16625a != null;
    }

    public void setVoiceSearchLocale() {
        this.f16629e = this.f16628d.getResources().getString(C4073a.C4086m.yssdk_locale_voiceSearchLocale);
    }

    public void dismissVoiceDialog() {
        this.f16626b.getView().removeCallbacks(this.f16630f);
        this.f16630f = null;
        C0163l lVar = (C0163l) this.f16628d.getSupportFragmentManager().mo546a("fragment_voice");
        if (lVar != null && lVar.getDialog() != null && lVar.isResumed()) {
            lVar.getDialog().dismiss();
        }
    }

    public void onError(IVoiceRecognizer iVoiceRecognizer, SpeechError speechError) {
        new StringBuilder("Voice Search Error Received: ").append(speechError.getErrorCode()).append(": ").append(speechError.getErrorDetail());
        if (speechError.getErrorCode() != 1) {
            setupDialog(0, (String) null);
            this.f16626b.mo15896d();
            this.f16626b.mo15894b();
        }
    }

    public void onRecordingBegin(IVoiceRecognizer iVoiceRecognizer) {
        setupDialog(2, this.f16628d.getResources().getString(C4073a.C4086m.yssdk_voice_listening));
        if (this.f16632h > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f16632h;
            new StringBuilder("Voice initializing duration: ").append(currentTimeMillis);
            HashMap hashMap = new HashMap(1);
            hashMap.put(AbsGeoLocationItem.LOCATION_PROVIDER, this.f16625a.getVoiceRecognitionProvider());
            C4129c.m17444i().getInstrument().logDurationEvent("voice_initializing", currentTimeMillis, hashMap);
            this.f16632h = 0;
        }
        this.f16630f = new Runnable() {
            public final void run() {
                if (VoiceController.this.f16627c && VoiceController.this.f16626b != null && VoiceController.this.f16625a != null) {
                    new StringBuilder().append(VoiceController.this.f16625a.getAudioLevel());
                    VoiceController.this.f16626b.mo15892a(VoiceController.this.f16625a.getAudioLevel());
                    VoiceController.this.f16626b.getView().postDelayed(this, 10);
                }
            }
        };
        this.f16630f.run();
    }

    public void onRecordingDone(IVoiceRecognizer iVoiceRecognizer) {
        setupDialog(1, this.f16628d.getResources().getString(C4073a.C4086m.yssdk_voice_processing));
        this.f16627c = false;
        this.f16631g = System.currentTimeMillis();
    }

    public void onResults(IVoiceRecognizer iVoiceRecognizer, String str) {
        dismissVoiceDialog();
        this.f16633i.onVoiceResult(this, new SearchQuery(new SearchQuery.Builder().setQueryString(str).isVoiceSearch(true)));
        if (this.f16631g > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f16631g;
            new StringBuilder("Voice processing duration: ").append(currentTimeMillis);
            HashMap hashMap = new HashMap(1);
            hashMap.put(AbsGeoLocationItem.LOCATION_PROVIDER, this.f16625a.getVoiceRecognitionProvider());
            C4129c.m17444i().getInstrument().logDurationEvent("voice_processing", currentTimeMillis, hashMap);
            this.f16631g = 0;
        }
    }

    public void reStartVoiceSearch() {
        this.f16625a.startRecording();
        this.f16627c = true;
        setupDialog(2, this.f16628d.getResources().getString(C4073a.C4086m.yssdk_initializing));
        this.f16626b.mo15891a();
    }

    public void onMicrophonePressed() {
        if (!this.f16627c) {
            reStartVoiceSearch();
            return;
        }
        this.f16625a.stopRecording();
        this.f16626b.mo15894b();
        this.f16626b.mo15895c();
        this.f16627c = false;
    }

    public void onDialogDismissed() {
        this.f16625a.cancel();
        this.f16627c = false;
        this.f16633i.onVoiceDialogDismissed(this);
    }

    public void destroyVoiceRecognizer() {
        if (this.f16625a != null) {
            this.f16625a.destroy();
        }
    }

    public boolean isVoiceSearchVisible() {
        if (this.f16626b == null) {
            return false;
        }
        return this.f16626b.isVisible();
    }
}
