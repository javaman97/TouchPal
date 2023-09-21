package com.cootek.smartinput5.engine;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.cootek.smartinput5.func.C1368X;
import java.util.ArrayList;
import java.util.Iterator;

public class SettingsService extends Service {
    /* access modifiers changed from: private */
    public static ArrayList<Messenger> mClients = new ArrayList<>();
    private static ArrayList<Messenger> mDeadClients = new ArrayList<>();
    final Messenger mMessenger = new Messenger(new InComingHandler());

    class InComingHandler extends Handler {
        InComingHandler() {
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    SettingsService.mClients.add(message.replyTo);
                    return;
                case 2:
                    SettingsService.mClients.remove(message.replyTo);
                    return;
                case 3:
                    SettingsService.this.handleSettingsChanged(message.getData());
                    return;
                case 4:
                    SettingsService.this.handleExtralAction(message.getData());
                    return;
                case 7:
                    Message obtain = Message.obtain();
                    obtain.what = message.getData().getInt(IPCManager.WHAT_NOTIFY_OTHER_PROCESS);
                    obtain.setData(message.getData());
                    SettingsService.doNotifyClients(obtain);
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    public static void notifyClients(Message message) {
        Message obtain = Message.obtain((Handler) null, 7);
        Bundle bundle = new Bundle(message.getData());
        bundle.putInt(IPCManager.WHAT_NOTIFY_OTHER_PROCESS, message.what);
        obtain.setData(bundle);
        try {
            C1368X.m6320c().mo5839l().sendMessage(obtain);
        } catch (RemoteException e) {
        }
    }

    public static void doNotifyClients(Message message) {
        if (mClients != null) {
            Iterator<Messenger> it = mClients.iterator();
            while (it.hasNext()) {
                Messenger next = it.next();
                try {
                    next.send(Message.obtain(message));
                } catch (RemoteException e) {
                    mDeadClients.add(next);
                }
            }
            if (!mDeadClients.isEmpty()) {
                Iterator<Messenger> it2 = mDeadClients.iterator();
                while (it2.hasNext()) {
                    mClients.remove(it2.next());
                }
                mDeadClients.clear();
            }
        }
    }

    public void handleSettingsChanged(Bundle bundle) {
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5839l().handleSettingsChanged(bundle);
        }
    }

    public void handleExtralAction(Bundle bundle) {
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5839l().handleExtralAction(bundle);
        }
    }
}
