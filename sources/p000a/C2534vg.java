package p000a;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: a.vg */
/* loaded from: classes.dex */
public final class C2534vg implements TypeEvaluator {

    /* renamed from: h */
    public C1992lT[] f7759h;

    /* renamed from: z */
    public final /* synthetic */ int f7760z;

    public /* synthetic */ C2534vg(int i) {
        this.f7760z = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.f7760z) {
            case AbstractC0795Op.f2698E /* 0 */:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i = rect.left + ((int) ((rect2.left - r0) * f));
                int i2 = rect.top + ((int) ((rect2.top - r1) * f));
                int i3 = rect.right + ((int) ((rect2.right - r2) * f));
                int i4 = rect.bottom + ((int) ((rect2.bottom - r10) * f));
                Rect rect3 = (Rect) this.f7759h;
                if (rect3 == null) {
                    return new Rect(i, i2, i3, i4);
                }
                rect3.set(i, i2, i3, i4);
                return (Rect) this.f7759h;
            default:
                C1992lT[] c1992lTArr = (C1992lT[]) obj;
                C1992lT[] c1992lTArr2 = (C1992lT[]) obj2;
                if (AbstractC1843ih.m3462u(c1992lTArr, c1992lTArr2)) {
                    if (!AbstractC1843ih.m3462u(this.f7759h, c1992lTArr)) {
                        this.f7759h = AbstractC1843ih.m3459s(c1992lTArr);
                    }
                    for (int i5 = 0; i5 < c1992lTArr.length; i5++) {
                        C1992lT c1992lT = this.f7759h[i5];
                        C1992lT c1992lT2 = c1992lTArr[i5];
                        C1992lT c1992lT3 = c1992lTArr2[i5];
                        c1992lT.getClass();
                        c1992lT.f6172z = c1992lT2.f6172z;
                        int i6 = 0;
                        while (true) {
                            float[] fArr = c1992lT2.f6171h;
                            if (i6 < fArr.length) {
                                c1992lT.f6171h[i6] = (c1992lT3.f6171h[i6] * f) + ((1.0f - f) * fArr[i6]);
                                i6++;
                            }
                        }
                    }
                    return this.f7759h;
                }
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
