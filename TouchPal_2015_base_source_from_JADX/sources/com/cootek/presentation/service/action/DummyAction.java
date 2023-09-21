package com.cootek.presentation.service.action;

import android.os.RemoteException;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public class DummyAction extends PresentAction {
    public DummyAction(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public void dumpSpecial() {
    }

    public void onClick(PresentToast presentToast, boolean z) {
        presentToast.onToastClicked();
        if (presentToast.clickClean) {
            PresentationSystem.getInstance().setCleanType(9);
            try {
                PresentationSystem.getInstance().getActionDriver().close(presentToast.getId());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean meetAction(int i, String[] strArr) {
        return false;
    }
}
