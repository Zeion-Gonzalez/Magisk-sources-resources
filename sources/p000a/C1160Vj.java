package p000a;

import android.view.View;
import android.view.Window;

/* renamed from: a.Vj */
/* loaded from: classes.dex */
public class C1160Vj extends AbstractC0552KO {
    @Override // p000a.C1665fK
    /* renamed from: E */
    public final void mo2374E(boolean z) {
        if (z) {
            Window window = this.f1809R;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        m1262H(8192);
    }
}
