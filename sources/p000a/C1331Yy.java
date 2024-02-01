package p000a;

import android.os.Build;
import android.view.View;

/* renamed from: a.Yy */
/* loaded from: classes.dex */
public class C1331Yy extends AbstractC0286FR {

    /* renamed from: u */
    public static boolean f4221u = true;

    @Override // p000a.C1219Wm
    /* renamed from: o */
    public void mo2169o(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo2169o(view, i);
        } else if (f4221u) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f4221u = false;
            }
        }
    }
}
