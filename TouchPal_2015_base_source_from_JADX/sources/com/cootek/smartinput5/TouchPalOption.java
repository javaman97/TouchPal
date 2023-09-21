package com.cootek.smartinput5;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.TJavascriptHandler;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1413aW;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1623bu;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.RateUsActivity;
import com.cootek.smartinput5.p066ui.settings.SpecialThanksActivity;
import com.cootek.smartinput5.teaching.TutorialActivity;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class TouchPalOption extends C1623bu {

    /* renamed from: com.cootek.smartinput5.TouchPalOption$a */
    public interface C1045a {
        /* renamed from: a */
        void mo4221a();

        /* renamed from: a */
        void mo4222a(int i);

        /* renamed from: b */
        int mo4223b();

        /* renamed from: c */
        String mo4224c();
    }

    /* renamed from: com.cootek.smartinput5.TouchPalOption$d */
    interface C1048d {
        /* renamed from: a */
        void mo4237a(ArrayList<Preference> arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4219a(Bundle bundle) {
        Intent intent;
        C1368X.m6317b((Context) this);
        if (C1593bR.m7162a().f5075a) {
            intent = new Intent(this, TouchPalOptionInte.class);
        } else {
            intent = new Intent(this, TouchPalOptionMainland.class);
        }
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4218a() {
        finish();
    }

    /* renamed from: b */
    public void mo4220b() {
        C1056a.m5588a().mo4266b();
        C1060e.m5598b().mo4276c();
        C1368X.m6325e();
        System.gc();
    }

    /* renamed from: a */
    public static void m5429a(CheckBoxPreference checkBoxPreference, int i, int i2, String str) {
        if (checkBoxPreference != null && Settings.isInitialized()) {
            checkBoxPreference.setChecked(Settings.getInstance().getBoolSetting(i, i2, str, (Config) null));
            checkBoxPreference.setOnPreferenceClickListener(new C1110ag(str, i, i2));
        }
    }

    /* renamed from: a */
    public static void m5428a(CheckBoxPreference checkBoxPreference, int i) {
        if (i == 52) {
            m5429a(checkBoxPreference, i, 13, C1368X.m6320c().mo5835h().getLanguageCategory(C1549b.f4833d, 13));
        } else {
            m5430a(checkBoxPreference, i, (ArrayList<Preference>) null, (C1048d) null);
        }
    }

    /* renamed from: a */
    public static void m5430a(CheckBoxPreference checkBoxPreference, int i, ArrayList<Preference> arrayList, C1048d dVar) {
        boolean z = false;
        if (checkBoxPreference != null && Settings.isInitialized()) {
            if (i == 9) {
                if (Settings.getInstance().getIntSetting(9) != 1) {
                    z = true;
                }
                checkBoxPreference.setChecked(z);
            } else if (i == 33) {
                if (Settings.getInstance().getIntSetting(33) != 1) {
                    z = true;
                }
                checkBoxPreference.setChecked(z);
            } else {
                checkBoxPreference.setChecked(Settings.getInstance().getBoolSetting(i));
            }
            checkBoxPreference.setOnPreferenceClickListener(new C1111ah(i, arrayList, dVar));
            if (arrayList != null && !arrayList.contains(checkBoxPreference)) {
                arrayList.add(checkBoxPreference);
            }
        }
    }

    /* renamed from: a */
    public static Intent m5422a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(1073741824);
        return intent;
    }

    /* renamed from: a */
    public static Intent m5421a(Context context) {
        Intent intent = new Intent();
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.setClass(context, RateUsActivity.class);
        return intent;
    }

    /* renamed from: b */
    public static Intent m5435b(Context context) {
        Intent intent = new Intent();
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.setClass(context, TutorialActivity.class);
        return intent;
    }

    /* renamed from: b */
    public static Intent m5436b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.addFlags(1073741824);
        return intent;
    }

    /* renamed from: c */
    public static Intent m5439c(Context context) {
        return m5423a(context, (String) null, (String) null, C1593bR.m7162a().mo6233a(context, 0));
    }

    /* renamed from: a */
    public static Intent m5423a(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(C1974m.m9063a(context, (int) R.string.optpage_feedback_message));
        sb.append("(");
        sb.append(C1974m.m9063a(context, (int) R.string.optpage_version_summary));
        sb.append(")");
        if (C1593bR.m7162a().f5076b) {
            sb.append("[M]");
        }
        if (str != null) {
            sb.append(str);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--------------------------------");
        sb2.append("\nBRAND: ");
        sb2.append(Build.BRAND);
        sb2.append("\nModel: ");
        sb2.append(Build.MODEL);
        sb2.append("\nRelease: ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("\nVersion: ").append(C1974m.m9063a(context, (int) R.string.optpage_version_summary));
        sb2.append(C0911j.f2473c);
        if (str2 != null) {
            sb2.append(str2);
        }
        sb2.append("--------------------------------\n");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + str3));
        intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str3});
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.addFlags(1073741824);
        return intent;
    }

    /* renamed from: d */
    public static Intent m5440d(Context context) {
        Intent intent = new Intent();
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.setClass(context, SpecialThanksActivity.class);
        return intent;
    }

    /* renamed from: com.cootek.smartinput5.TouchPalOption$b */
    public static class C1046b extends AsyncTask<String, String, Integer> {

        /* renamed from: a */
        private ProgressDialog f2867a = null;

        /* renamed from: b */
        private Context f2868b;

        /* renamed from: c */
        private C1045a f2869c;

        public C1046b(Context context, C1045a aVar, boolean z) {
            this.f2868b = context;
            this.f2867a = new ProgressDialog(this.f2868b);
            this.f2867a.setCancelable(z);
            this.f2869c = aVar;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            if (!this.f2867a.isShowing()) {
                this.f2867a.show();
            }
            if (this.f2869c != null) {
                this.f2869c.mo4221a();
                this.f2867a.setMessage(this.f2869c.mo4224c());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            if (this.f2869c != null) {
                return Integer.valueOf(this.f2869c.mo4223b());
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (this.f2869c != null) {
                this.f2869c.mo4222a(num.intValue());
            }
            if (this.f2867a.isShowing()) {
                try {
                    this.f2867a.dismiss();
                } catch (IllegalStateException e) {
                }
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.TouchPalOption$c */
    public static class C1047c extends AsyncTask<String, String, Float> {

        /* renamed from: a */
        public static final long f2870a = 5242880;

        /* renamed from: b */
        ProgressDialog f2871b = null;

        /* renamed from: c */
        Intent f2872c = null;

        /* renamed from: d */
        Context f2873d = null;

        public C1047c(Context context, Intent intent) {
            this.f2873d = context;
            this.f2871b = new ProgressDialog(context);
            this.f2871b.setMessage(C1974m.m9063a(context, (int) R.string.msg_generating_report));
            this.f2872c = intent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Float f) {
            m5455b();
            File file = new File(Environment.getExternalStorageDirectory(), "touchpal_data.zip");
            if (file.length() < f2870a) {
                String absolutePath = file.getAbsolutePath();
                this.f2872c.setAction("android.intent.action.SEND");
                String[] stringArrayExtra = this.f2872c.getStringArrayExtra("android.intent.extra.EMAIL");
                if (stringArrayExtra.length == 0) {
                    stringArrayExtra = new String[]{C1593bR.m7162a().mo6233a(this.f2873d, 0)};
                }
                this.f2872c.setType("application/zip");
                this.f2872c.putExtra("android.intent.extra.EMAIL", stringArrayExtra);
                this.f2872c.putExtra("android.intent.extra.STREAM", Uri.parse("file://" + absolutePath));
            }
            try {
                this.f2873d.startActivity(this.f2872c);
            } catch (ActivityNotFoundException e) {
                mo4231a();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f2871b.show();
        }

        /* renamed from: a */
        public void mo4231a() {
            Toast.makeText(this.f2873d, C1974m.m9063a(this.f2873d, (int) R.string.mailclient_not_found), 0).show();
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            m5455b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Float doInBackground(String... strArr) {
            TouchPalOption.m5445i(this.f2873d);
            return null;
        }

        /* renamed from: b */
        private void m5455b() {
            if (this.f2871b != null && this.f2871b.isShowing()) {
                try {
                    this.f2871b.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m5445i(Context context) {
        String[] strArr = {"language", "skin", C1358O.f4192c, C1413aW.f4515a, C1466av.f4699h};
        String[] strArr2 = {".rom", ".so"};
        String absolutePath = C1466av.m6848a(context).getAbsolutePath();
        File a = C1358O.m6234a(C1358O.f4191b);
        if (a != null) {
            String absolutePath2 = a.getAbsolutePath();
            String absolutePath3 = new File(a, "files.zip").getAbsolutePath();
            File file = new File(Environment.getExternalStorageDirectory(), "touchpal_data.zip");
            String absolutePath4 = file.getAbsolutePath();
            if (file.exists()) {
                file.delete();
            }
            m5437b(context, a);
            m5427a(context, a);
            if (Settings.getInstance().getBoolSetting(63)) {
                m5438b(a);
            }
            C0990F.m5127a(absolutePath, absolutePath3, strArr, strArr2);
            C0990F.m5127a(absolutePath2, absolutePath4, strArr, strArr2);
        }
    }

    /* renamed from: a */
    private static void m5427a(Context context, File file) {
        if (Settings.isInitialized()) {
            File file2 = new File(file, "TouchPalOptions.xml");
            if (file2.exists()) {
                file2.delete();
            }
            try {
                file2.createNewFile();
                m5431a(file2);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    private static void m5431a(File file) throws FileNotFoundException {
        String a;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Map<String, Object> preferenceMap = Settings.getInstance().getPreferenceMap();
        try {
            fileOutputStream.write("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n<map>\n".getBytes());
        } catch (IOException e) {
        }
        Object[] array = preferenceMap.keySet().toArray();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= array.length) {
                break;
            }
            String str = (String) array[i2];
            Object obj = preferenceMap.get(str);
            if (!(obj == null || (a = m5425a(str, obj)) == null)) {
                try {
                    fileOutputStream.write(a.getBytes());
                } catch (IOException e2) {
                }
            }
            i = i2 + 1;
        }
        try {
            fileOutputStream.write("</map>".getBytes());
        } catch (IOException e3) {
        }
        try {
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e4) {
        }
    }

    /* renamed from: a */
    private static String m5425a(String str, Object obj) {
        String str2;
        String str3 = null;
        if (obj instanceof String) {
            str3 = "string";
            str2 = (String) obj;
        } else if (obj instanceof Long) {
            str3 = "long";
            str2 = String.valueOf(obj);
        } else if (obj instanceof Integer) {
            str3 = TJavascriptHandler.SETTING_TYPE_INT;
            str2 = String.valueOf(obj);
        } else if (obj instanceof Boolean) {
            str3 = C1132b.f3179k;
            str2 = String.valueOf(obj);
        } else {
            str2 = null;
        }
        return m5426a(str, str3, str2);
    }

    /* renamed from: a */
    private static String m5426a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("    ").append("<").append(str2).append(" name=\"").append(str).append("\"");
        if ("string".equals(str2)) {
            sb.append(">").append(str3).append("</string>");
        } else {
            sb.append(" value=\"").append(str3).append("\" />");
        }
        sb.append(C0911j.f2473c);
        return sb.toString();
    }

    /* renamed from: b */
    private static void m5437b(Context context, File file) {
        File filesDir = context.getFilesDir();
        String[] strArr = {"history.json", "present.statistic", PresentConfigXmlTag.PRESENT_FILE_NAME, "tp_promo.xml.etag"};
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            m5432a(filesDir.getAbsolutePath() + "/" + strArr[i], file);
        }
    }

    /* renamed from: b */
    private static void m5438b(File file) {
        File a = C1358O.m6234a(C1358O.f4203n);
        if (a != null) {
            m5432a(new File(a, C1466av.f4715x).getAbsolutePath(), file);
        }
    }

    /* renamed from: a */
    private static void m5432a(String str, File file) {
        File file2 = new File(str);
        File file3 = new File(file, file2.getName());
        if (file2.exists()) {
            C0997e.m5173a(file2, file3);
        }
    }

    /* renamed from: e */
    public static void m5441e(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.privacy_policy_url)));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        C1584bI.m7130a(context, intent, 0);
    }

    /* renamed from: f */
    public static void m5442f(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.privacy_dialog, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.tv_privacy_msg)).setMovementMethod(ScrollingMovementMethod.getInstance());
        C2894d.C2895a aVar = new C2894d.C2895a(context);
        aVar.setIcon(R.drawable.icon_small);
        aVar.setTitle(C1974m.m9063a(context, (int) R.string.paopao_privacy_policy_title));
        aVar.setPositiveButton(C1974m.m9063a(context, (int) R.string.ok), new C1112ai((CheckBox) inflate.findViewById(R.id.cb_agree_privacy)));
        aVar.setOnCancelListener(new C1113aj());
        aVar.setView(inflate);
        aVar.create().show();
    }

    /* renamed from: a */
    public static boolean m5434a(Menu menu) {
        return false;
    }

    /* renamed from: a */
    public static boolean m5433a(Context context, MenuItem menuItem) {
        return false;
    }

    /* renamed from: a */
    public static String m5424a(Context context, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        if (context == null || j <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < 0) {
            return null;
        }
        if (currentTimeMillis < Utils.MINUTE_MILLIS) {
            return C1974m.m9063a(context, (int) R.string.just_now);
        }
        if (currentTimeMillis < 3600000) {
            int i5 = (int) (currentTimeMillis / Utils.MINUTE_MILLIS);
            if (i5 < 2) {
                i4 = R.string.humanize_time_one_minute_ago;
            } else {
                i4 = R.string.humanize_time_many_minutes_ago;
            }
            int i6 = i5;
            i2 = i4;
            i = i6;
        } else if (currentTimeMillis < 86400000) {
            int i7 = (int) (currentTimeMillis / 3600000);
            if (i7 < 2) {
                i3 = R.string.humanize_time_one_hour_ago;
            } else {
                i3 = R.string.humanize_time_many_hours_ago;
            }
            int i8 = i7;
            i2 = i3;
            i = i8;
        } else {
            i = (int) (currentTimeMillis / 86400000);
            if (i < 2) {
                i2 = R.string.humanize_time_one_day_ago;
            } else {
                i2 = R.string.humanize_time_many_days_ago;
            }
        }
        if (i < 2) {
            return C1974m.m9063a(context, i2);
        }
        return C1974m.m9064a(context, i2, Integer.valueOf(i));
    }

    /* renamed from: g */
    public static void m5443g(Context context) {
        int i = -1;
        String str = "NOT FOUND";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            i = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
        }
        String h = C1132b.m5654a(context).mo4414h();
        String c = C2225al.m10063c(context);
        Toast.makeText(context, String.format("channel code: %s\nrecommend channel code: %s\nversion code: %d\nversion name: %s\nime version code: %s\nocean version code: %s\nokinawa version code: %s", new Object[]{h, C1132b.m5654a(context).mo4415i(), Integer.valueOf(i), str, c, C1974m.m9063a(context, (int) R.string.optpage_ocean_version), C1974m.m9063a(context, (int) R.string.optpage_okinawa_version)}), 1).show();
    }
}
