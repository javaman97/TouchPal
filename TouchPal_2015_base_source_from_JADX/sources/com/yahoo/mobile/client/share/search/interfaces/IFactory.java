package com.yahoo.mobile.client.share.search.interfaces;

import android.content.Context;

public interface IFactory {
    IVoiceRecognizer createVoiceRecognizer(Context context, String str, IVoiceRecognizerListener iVoiceRecognizerListener);

    IBrowser getBrowser();

    IImageLoader getImageLoader(Context context);

    IImageViewer getImagePreviewer();

    IImageProcessor getImageProcessor();

    IInstrument getInstrument();

    ILogger getLogger();

    INetworkAsync getNetwork(Context context);

    IPartnerManager getPartnerManager();

    IShare getShare();

    IBrowser getWebPreviewer();
}
