package com.yahoo.mobile.client.share.search.interfaces;

public abstract class SpeechError {
    public static final int QUERY_CANCELLED = 1;
    public static final int VOICE_RECOGNITION_ERROR = 0;

    public abstract int getErrorCode();

    public abstract String getErrorDetail();
}
