package android.support.p001v4.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.app.C0127ag;

/* renamed from: android.support.v4.app.af */
/* compiled from: RemoteInputCompatApi20 */
class C0126af {
    C0126af() {
    }

    /* renamed from: a */
    static C0127ag.C0128a[] m490a(RemoteInput[] remoteInputArr, C0127ag.C0128a.C0129a aVar) {
        if (remoteInputArr == null) {
            return null;
        }
        C0127ag.C0128a[] b = aVar.mo403b(remoteInputArr.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= remoteInputArr.length) {
                return b;
            }
            RemoteInput remoteInput = remoteInputArr[i2];
            b[i2] = aVar.mo402b(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras());
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    static RemoteInput[] m489a(C0127ag.C0128a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            C0127ag.C0128a aVar = aVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(aVar.mo387a()).setLabel(aVar.mo388b()).setChoices(aVar.mo389c()).setAllowFreeFormInput(aVar.mo390d()).addExtras(aVar.mo391e()).build();
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    static Bundle m487a(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    /* renamed from: a */
    static void m488a(C0127ag.C0128a[] aVarArr, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent(m489a(aVarArr), intent, bundle);
    }
}
