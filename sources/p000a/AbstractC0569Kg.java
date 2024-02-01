package p000a;

import android.view.View;
import android.view.WindowInsetsController;

/* renamed from: a.Kg */
/* loaded from: classes.dex */
public abstract class AbstractC0569Kg {
    /* renamed from: N */
    public static void m1285N(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* renamed from: P */
    public static boolean m1286P(View view) {
        return view.isImportantForContentCapture();
    }

    /* renamed from: Q */
    public static void m1287Q(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    /* renamed from: h */
    public static CharSequence m1288h(View view) {
        return view.getStateDescription();
    }

    /* renamed from: v */
    public static C0935Rb m1289v(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new C0935Rb(windowInsetsController);
        }
        return null;
    }

    /* renamed from: z */
    public static int m1290z(View view) {
        return view.getImportantForContentCapture();
    }
}
