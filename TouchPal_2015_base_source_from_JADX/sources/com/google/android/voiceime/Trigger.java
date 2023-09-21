package com.google.android.voiceime;

interface Trigger {
    void onStartInputView();

    void startVoiceRecognition(String str);
}
