package p000a;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a.Sb */
/* loaded from: classes.dex */
public final class C0991Sb extends C1331Yy {
    @Override // p000a.AbstractC2257qV
    /* renamed from: G */
    public final float mo2165G(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p000a.AbstractC2257qV
    /* renamed from: M */
    public final void mo2166M(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000a.AbstractC0286FR
    /* renamed from: R */
    public final void mo584R(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000a.AbstractC2100na
    /* renamed from: S */
    public final void mo2167S(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p000a.AbstractC2100na
    /* renamed from: V */
    public final void mo2168V(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000a.C1331Yy, p000a.C1219Wm
    /* renamed from: o */
    public final void mo2169o(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
