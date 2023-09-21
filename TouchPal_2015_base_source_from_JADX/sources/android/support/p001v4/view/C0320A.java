package android.support.p001v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: android.support.v4.view.A */
/* compiled from: PagerTitleStripIcs */
class C0320A {
    C0320A() {
    }

    /* renamed from: a */
    public static void m1312a(TextView textView) {
        textView.setTransformationMethod(new C0321a(textView.getContext()));
    }

    /* renamed from: android.support.v4.view.A$a */
    /* compiled from: PagerTitleStripIcs */
    private static class C0321a extends SingleLineTransformationMethod {

        /* renamed from: a */
        private static final String f813a = "SingleLineAllCapsTransform";

        /* renamed from: b */
        private Locale f814b;

        public C0321a(Context context) {
            this.f814b = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f814b);
            }
            return null;
        }
    }
}
