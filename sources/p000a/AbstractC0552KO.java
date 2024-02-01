package p000a;

import android.view.View;
import android.view.Window;

/* renamed from: a.KO */
/* loaded from: classes.dex */
public abstract class AbstractC0552KO extends C1665fK {

    /* renamed from: R */
    public final Window f1809R;

    /* renamed from: w */
    public final C2196pM f1810w;

    public AbstractC0552KO(Window window, C2196pM c2196pM) {
        super(9);
        this.f1809R = window;
        this.f1810w = c2196pM;
    }

    /* renamed from: H */
    public final void m1262H(int i) {
        View decorView = this.f1809R.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // p000a.C1665fK
    /* renamed from: Y */
    public final void mo1263Y() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((8 & i) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 8) {
                            ((C1665fK) this.f1810w.f6755R).mo2267r();
                        }
                    } else {
                        m1262H(2);
                    }
                } else {
                    m1262H(4);
                    this.f1809R.clearFlags(1024);
                }
            }
        }
    }
}
