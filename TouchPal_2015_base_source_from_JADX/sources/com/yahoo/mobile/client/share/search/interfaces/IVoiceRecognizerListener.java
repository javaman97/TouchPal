package com.yahoo.mobile.client.share.search.interfaces;

public interface IVoiceRecognizerListener {
    void onError(IVoiceRecognizer iVoiceRecognizer, SpeechError speechError);

    void onRecordingBegin(IVoiceRecognizer iVoiceRecognizer);

    void onRecordingDone(IVoiceRecognizer iVoiceRecognizer);

    void onResults(IVoiceRecognizer iVoiceRecognizer, String str);
}
