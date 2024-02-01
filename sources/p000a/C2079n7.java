package p000a;

import android.animation.ValueAnimator;

/* renamed from: a.n7 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2079n7 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: h */
    public final /* synthetic */ Object f6442h;

    /* renamed from: z */
    public final /* synthetic */ int f6443z;

    public /* synthetic */ C2079n7(int i, Object obj) {
        this.f6443z = i;
        this.f6442h = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f6443z;
        Object obj = this.f6442h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1724gS c1724gS = (C1724gS) obj;
                c1724gS.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1724gS.f5410G.setAlpha((int) (255.0f * floatValue));
                c1724gS.f5421f = floatValue;
                return;
            default:
                C1132VC c1132vc = (C1132VC) obj;
                c1132vc.getClass();
                c1132vc.f2149P.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
