package p000a;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: a.zQ */
/* loaded from: classes.dex */
public final class C2725zQ extends C1665fK {

    /* renamed from: I */
    public final Window f8564I;

    /* renamed from: R */
    public final WindowInsetsController f8565R;

    /* renamed from: w */
    public final C2196pM f8566w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2725zQ(android.view.Window r2, p000a.C2196pM r3) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = p000a.AbstractC2637xh.m4537v(r2)
            r1.<init>(r0, r3)
            r1.f8564I = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2725zQ.<init>(android.view.Window, a.pM):void");
    }

    @Override // p000a.C1665fK
    /* renamed from: E */
    public final void mo2374E(boolean z) {
        WindowInsetsController windowInsetsController = this.f8565R;
        Window window = this.f8564I;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // p000a.C1665fK
    /* renamed from: U */
    public final void mo159U(boolean z) {
        WindowInsetsController windowInsetsController = this.f8565R;
        Window window = this.f8564I;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // p000a.C1665fK
    /* renamed from: Y */
    public final void mo1263Y() {
        ((C1665fK) this.f8566w.f6755R).mo2267r();
        this.f8565R.show(0);
    }

    public C2725zQ(WindowInsetsController windowInsetsController, C2196pM c2196pM) {
        super(9);
        this.f8565R = windowInsetsController;
        this.f8566w = c2196pM;
    }
}
