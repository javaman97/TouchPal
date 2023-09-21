package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.Context;
import com.yahoo.mobile.client.share.search.interfaces.IBrowser;
import com.yahoo.mobile.client.share.search.interfaces.IFactory;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoader;
import com.yahoo.mobile.client.share.search.interfaces.IImageProcessor;
import com.yahoo.mobile.client.share.search.interfaces.IImageViewer;
import com.yahoo.mobile.client.share.search.interfaces.IInstrument;
import com.yahoo.mobile.client.share.search.interfaces.ILogger;
import com.yahoo.mobile.client.share.search.interfaces.INetworkAsync;
import com.yahoo.mobile.client.share.search.interfaces.IPartnerManager;
import com.yahoo.mobile.client.share.search.interfaces.IShare;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizer;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizerListener;
import com.yahoo.mobile.client.share.search.voice.AndroidVoiceRecognizer;

public final class Factory implements IFactory {

    /* renamed from: b */
    private static IShare f17397b = new C4266l();

    /* renamed from: c */
    private static ILogger f17398c = new C4256d();

    /* renamed from: d */
    private static IInstrument f17399d = new C4257e();

    /* renamed from: e */
    private static IBrowser f17400e = new C4251a();

    /* renamed from: a */
    private INetworkAsync f17401a;

    /* renamed from: f */
    private IBrowser f17402f = new C4265k();

    /* renamed from: g */
    private IImageViewer f17403g = new C4258f();

    public final IBrowser getBrowser() {
        return f17400e;
    }

    public final IBrowser getWebPreviewer() {
        return this.f17402f;
    }

    public final IImageViewer getImagePreviewer() {
        return this.f17403g;
    }

    public final IImageLoader getImageLoader(Context context) {
        return C4252b.m17808a(context);
    }

    public final IShare getShare() {
        return f17397b;
    }

    public final IInstrument getInstrument() {
        return f17399d;
    }

    public final INetworkAsync getNetwork(Context context) {
        if (this.f17401a == null) {
            this.f17401a = new C4260h(context.getApplicationContext());
        }
        return this.f17401a;
    }

    public final ILogger getLogger() {
        return f17398c;
    }

    public final IImageProcessor getImageProcessor() {
        return null;
    }

    public final IVoiceRecognizer createVoiceRecognizer(Context context, String str, IVoiceRecognizerListener iVoiceRecognizerListener) {
        try {
            return new AndroidVoiceRecognizer(context, str, iVoiceRecognizerListener);
        } catch (RuntimeException e) {
            return null;
        }
    }

    public final IPartnerManager getPartnerManager() {
        return null;
    }

    /* renamed from: a */
    public final void mo15899a(IBrowser iBrowser) {
        f17400e = iBrowser;
    }

    /* renamed from: b */
    public final void mo15901b(IBrowser iBrowser) {
        this.f17402f = iBrowser;
    }

    /* renamed from: a */
    public final void mo15900a(IImageViewer iImageViewer) {
        this.f17403g = iImageViewer;
    }
}
