package p000a;

import android.view.View;
import android.view.Window;

/* renamed from: a.BU */
/* loaded from: classes.dex */
public final class C0077BU extends C1160Vj {
    @Override // p000a.C1665fK
    /* renamed from: U */
    public final void mo159U(boolean z) {
        if (z) {
            Window window = this.f1809R;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        m1262H(16);
    }
}
