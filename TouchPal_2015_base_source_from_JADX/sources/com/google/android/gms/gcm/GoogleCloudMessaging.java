package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";

    /* renamed from: fh */
    static GoogleCloudMessaging f15437fh;

    /* renamed from: fi */
    private Context f15438fi;

    /* renamed from: fj */
    private PendingIntent f15439fj;

    /* renamed from: fk */
    final BlockingQueue<Intent> f15440fk = new LinkedBlockingQueue();

    /* renamed from: fl */
    private Handler f15441fl = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            GoogleCloudMessaging.this.f15440fk.add((Intent) message.obj);
        }
    };

    /* renamed from: fm */
    private Messenger f15442fm = new Messenger(this.f15441fl);

    /* renamed from: aO */
    private void m15576aO() {
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
        this.f15440fk.clear();
        intent.putExtra("google.messenger", this.f15442fm);
        mo11368c(intent);
        this.f15438fi.startService(intent);
    }

    /* renamed from: b */
    private void m15577b(String... strArr) {
        String c = mo11367c(strArr);
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
        intent.putExtra("google.messenger", this.f15442fm);
        mo11368c(intent);
        intent.putExtra("sender", c);
        this.f15438fi.startService(intent);
    }

    public static synchronized GoogleCloudMessaging getInstance(Context context) {
        GoogleCloudMessaging googleCloudMessaging;
        synchronized (GoogleCloudMessaging.class) {
            if (f15437fh == null) {
                f15437fh = new GoogleCloudMessaging();
                f15437fh.f15438fi = context;
            }
            googleCloudMessaging = f15437fh;
        }
        return googleCloudMessaging;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aP */
    public synchronized void mo11366aP() {
        if (this.f15439fj != null) {
            this.f15439fj.cancel();
            this.f15439fj = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo11367c(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(',').append(strArr[i]);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo11368c(Intent intent) {
        if (this.f15439fj == null) {
            this.f15439fj = PendingIntent.getBroadcast(this.f15438fi, 0, new Intent(), 0);
        }
        intent.putExtra(PresentConfigXmlTag.FEATURE_ATTR_SENSITIVE_APPS, this.f15439fj);
    }

    public void close() {
        mo11366aP();
    }

    public String getMessageType(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null ? MESSAGE_TYPE_MESSAGE : stringExtra;
    }

    public String register(String... strArr) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        }
        this.f15440fk.clear();
        m15577b(strArr);
        try {
            Intent poll = this.f15440fk.poll(5000, TimeUnit.MILLISECONDS);
            if (poll == null) {
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            }
            String stringExtra = poll.getStringExtra("registration_id");
            if (stringExtra != null) {
                return stringExtra;
            }
            poll.getStringExtra("error");
            String stringExtra2 = poll.getStringExtra("error");
            if (stringExtra2 != null) {
                throw new IOException(stringExtra2);
            }
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void send(String str, String str2, long j, Bundle bundle) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        } else if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        } else {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            intent.putExtras(bundle);
            mo11368c(intent);
            intent.putExtra("google.to", str);
            intent.putExtra("google.message_id", str2);
            intent.putExtra("google.ttl", Long.toString(j));
            this.f15438fi.sendOrderedBroadcast(intent, (String) null);
        }
    }

    public void send(String str, String str2, Bundle bundle) throws IOException {
        send(str, str2, -1, bundle);
    }

    public void unregister() throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        }
        m15576aO();
        try {
            Intent poll = this.f15440fk.poll(5000, TimeUnit.MILLISECONDS);
            if (poll == null) {
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            } else if (poll.getStringExtra("unregistered") == null) {
                String stringExtra = poll.getStringExtra("error");
                if (stringExtra != null) {
                    throw new IOException(stringExtra);
                }
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            }
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }
}
