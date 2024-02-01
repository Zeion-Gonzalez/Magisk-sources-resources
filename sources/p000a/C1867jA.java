package p000a;

import android.animation.TypeEvaluator;

/* renamed from: a.jA */
/* loaded from: classes.dex */
public final class C1867jA implements TypeEvaluator {

    /* renamed from: h */
    public static final C1867jA f5836h = new C1867jA();

    /* renamed from: z */
    public final C2716zG f5837z = new C2716zG();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C2716zG c2716zG = (C2716zG) obj;
        C2716zG c2716zG2 = (C2716zG) obj2;
        float f2 = c2716zG.f8548z;
        float f3 = 1.0f - f;
        float f4 = (c2716zG2.f8548z * f) + (f2 * f3);
        float f5 = c2716zG.f8546h;
        float f6 = (c2716zG2.f8546h * f) + (f5 * f3);
        float f7 = c2716zG.f8547v;
        float f8 = (f * c2716zG2.f8547v) + (f3 * f7);
        C2716zG c2716zG3 = this.f5837z;
        c2716zG3.f8548z = f4;
        c2716zG3.f8546h = f6;
        c2716zG3.f8547v = f8;
        return c2716zG3;
    }
}
