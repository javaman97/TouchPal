package com.cootek.smartinput5.urlnavigator;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import com.cootek.smartinput5.engine.Editor;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.urlnavigator.C3265f;
import com.cootek.smartinput5.urlnavigator.FavoritesItemEditDialog;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.urlnavigator.g */
/* compiled from: FavoritesView */
public class C3267g implements C3265f.C3266a {

    /* renamed from: a */
    private static final String f14370a = "index";

    /* renamed from: b */
    private Context f14371b;

    /* renamed from: c */
    private GridView f14372c;

    /* renamed from: d */
    private List<Map<String, Object>> f14373d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3265f f14374e;

    /* renamed from: f */
    private C3260a f14375f;

    /* renamed from: a */
    public void mo10456a(Context context, View view) {
        this.f14371b = context;
        this.f14372c = (GridView) view;
        this.f14374e = new C3265f(context);
        this.f14374e.mo10447a((C3265f.C3266a) this);
        this.f14375f = new C3260a(this.f14374e);
        this.f14372c.setNumColumns(4);
        this.f14372c.setBackgroundDrawable(new ColorDrawable());
        this.f14372c.setCacheColorHint(Color.argb(0, 0, 0, 0));
        this.f14373d = new ArrayList();
        Context context2 = context;
        SimpleAdapter simpleAdapter = new SimpleAdapter(context2, this.f14373d, R.layout.url_navigator_favicon_item, new String[]{f14370a, C3265f.f14362c, "description"}, new int[]{R.id.root, R.id.imageView, R.id.textView});
        simpleAdapter.setViewBinder(new C3268h(this));
        this.f14372c.setAdapter(simpleAdapter);
        m14517e();
    }

    /* renamed from: b */
    public void mo10458b() {
        this.f14372c.destroyDrawingCache();
        this.f14374e.mo10450b((C3265f.C3266a) this);
        this.f14375f.mo10434c();
    }

    /* renamed from: a */
    public void mo10455a() {
        m14517e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14513a(View view, int i) {
        Map map = (Map) this.f14372c.getItemAtPosition(i);
        String str = (String) map.get("url");
        String str2 = (String) map.get("description");
        if (str == null || str2 == null) {
            Editor editor = Engine.getInstance().getEditor();
            CharSequence selectedText = editor.getSelectedText();
            int i2 = 0;
            if (editor.getEditorInfo() != null) {
                i2 = editor.getEditorInfo().inputType;
            }
            if ((i2 & 15) == 1 && (i2 & 4080) == 16) {
                editor.onKeyClick(Engine.KEYCODE_EDIT_SELECTALL);
                editor.getEditText();
            }
            if (TextUtils.isEmpty(selectedText)) {
                selectedText = "http://";
            }
            m14512a(i, selectedText.toString(), "");
            return;
        }
        new RecommendedURLHandler().onClick(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m14515b(View view, int i) {
        Map map = (Map) this.f14372c.getItemAtPosition(i);
        String str = (String) map.get("url");
        String str2 = (String) map.get("description");
        if (str == null || str2 == null) {
            m14513a(view, i);
        } else {
            int[] iArr = {R.string.url_navigator_edit, R.string.url_navigator_remove};
            String[] strArr = new String[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                strArr[i2] = this.f14371b.getString(iArr[i2]);
            }
            AlertDialog create = new C2894d.C2895a(this.f14371b).setTitle(str2).setItems(strArr, new C3271k(this, iArr, i)).create();
            Window window = create.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = C2261Q.f9802h;
            window.setAttributes(attributes);
            window.addFlags(131072);
            Engine.getInstance().getDialogManager().showDialog(create);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo10457a(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        Map map = (Map) this.f14372c.getItemAtPosition(intValue);
        String str = (String) map.get("url");
        String str2 = (String) map.get("description");
        if (i == R.string.url_navigator_edit) {
            m14512a(intValue, str, str2);
            return true;
        } else if (i == R.string.url_navigator_remove) {
            m14511a(intValue, str2);
            return true;
        } else {
            if (i == R.string.url_navigator_open) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(Engine.EXCEPTION_ERROR);
                Engine.getInstance().getIms().startActivity(intent);
            }
            return false;
        }
    }

    /* renamed from: e */
    private void m14517e() {
        boolean z;
        String str;
        String str2;
        this.f14373d.clear();
        ArrayList<C3262c> d = this.f14374e.mo10454d();
        for (int i = 0; i < d.size(); i++) {
            C3262c cVar = d.get(i);
            HashMap hashMap = new HashMap();
            if (cVar == null || !cVar.mo10439a()) {
                z = false;
            } else {
                z = true;
            }
            hashMap.put(f14370a, Integer.valueOf(i));
            if (z) {
                str = cVar.f14354c;
            } else {
                str = null;
            }
            hashMap.put("url", str);
            if (z) {
                str2 = cVar.f14355d;
            } else {
                str2 = null;
            }
            hashMap.put("description", str2);
            hashMap.put(C3265f.f14362c, z ? cVar.mo10440a(this.f14374e) ? Drawable.createFromPath(cVar.mo10441b(this.f14374e).getPath()) : C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.url_navigator_web) : C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.url_navigator_add));
            this.f14373d.add(hashMap);
        }
        ((SimpleAdapter) this.f14372c.getAdapter()).notifyDataSetChanged();
        this.f14375f.mo10433b();
    }

    /* renamed from: a */
    private void m14512a(int i, String str, String str2) {
        Intent intent = new Intent(this.f14371b, FavoritesItemEditDialog.class);
        intent.putExtra("url", str);
        intent.putExtra("description", str2);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f14371b.startActivity(intent);
        FavoritesItemEditDialog.m14474a((FavoritesItemEditDialog.C3259a) new C3272l(this, i));
    }

    /* renamed from: a */
    private void m14511a(int i, String str) {
        AlertDialog create = new C2894d.C2895a(this.f14371b).setTitle(str).setMessage(C1974m.m9063a(this.f14371b, (int) R.string.url_navigator_remove_query)).setPositiveButton(C1974m.m9063a(this.f14371b, 17039370), new C3273m(this, i)).setNegativeButton(C1974m.m9063a(this.f14371b, 17039360), (DialogInterface.OnClickListener) null).create();
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        window.setAttributes(attributes);
        window.addFlags(131072);
        Engine.getInstance().getDialogManager().showDialog(create);
    }

    /* renamed from: c */
    public void mo10459c() {
        this.f14372c.onKeyDown(93, new KeyEvent(0, 93));
    }

    /* renamed from: d */
    public void mo10460d() {
        this.f14372c.onKeyDown(92, new KeyEvent(0, 92));
    }
}
