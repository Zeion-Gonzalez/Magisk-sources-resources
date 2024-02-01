package p000a;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: a.uL */
/* loaded from: classes.dex */
public final class C2459uL extends C2718zJ {

    /* renamed from: q */
    public static final C2621xJ f7541q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f7541q = C2621xJ.m4514o(null, windowInsets);
    }

    public C2459uL(C2621xJ c2621xJ, WindowInsets windowInsets) {
        super(c2621xJ, windowInsets);
    }

    @Override // p000a.AbstractC2010lo, p000a.C2194pK
    /* renamed from: P */
    public final void mo3645P(View view) {
    }

    @Override // p000a.AbstractC2010lo, p000a.C2194pK
    /* renamed from: Q */
    public C2739zj mo3646Q(int i) {
        Insets insets;
        insets = this.f6251v.getInsets(AbstractC1128V7.m2310z(i));
        return C2739zj.m4674v(insets);
    }
}
