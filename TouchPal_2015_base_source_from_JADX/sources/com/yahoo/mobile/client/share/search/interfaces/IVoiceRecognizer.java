package com.yahoo.mobile.client.share.search.interfaces;

public interface IVoiceRecognizer {
    void cancel();

    void destroy();

    float getAudioLevel();

    String getVoiceRecognitionProvider();

    void startRecording();

    void stopRecording();
}
