package com.cootek.smartinput5.p045a;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.a.c */
/* compiled from: ActionFlowCollector */
class C1058c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1056a f3004a;

    C1058c(C1056a aVar) {
        this.f3004a = aVar;
    }

    public void run() {
        if (Settings.isInitialized()) {
            Map<String, Object> preferenceMap = Settings.getInstance().getPreferenceMap();
            File file = new File(C1358O.m6234a(C1358O.f4204o), "settings");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    return;
                }
            }
            if (preferenceMap != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("settings", new JSONObject(preferenceMap));
                } catch (Exception e2) {
                }
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.append(jSONObject.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception e3) {
                }
            }
        }
    }
}
