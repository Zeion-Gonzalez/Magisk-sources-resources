package p000a;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a.je */
/* loaded from: classes.dex */
public final class C1893je implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: h */
    public final /* synthetic */ Object f5915h;

    /* renamed from: z */
    public final /* synthetic */ int f5916z;

    public /* synthetic */ C1893je(int i, Object obj) {
        this.f5916z = i;
        this.f5915h = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f5916z;
        Object obj = this.f5915h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2281qz c2281qz = ((BottomSheetBehavior) obj).f9248W;
                if (c2281qz != null) {
                    C1480br c1480br = c2281qz.f7021S;
                    if (c1480br.f4596G != floatValue) {
                        c1480br.f4596G = floatValue;
                        c2281qz.f7031q = true;
                        c2281qz.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj).f9468T0.m4M(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
