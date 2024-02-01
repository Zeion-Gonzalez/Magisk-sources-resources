package p000a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: a.yb */
/* loaded from: classes.dex */
public final class C2679yb implements TypeEvaluator {

    /* renamed from: P */
    public final /* synthetic */ AbstractC0251En f8359P;

    /* renamed from: z */
    public final float[] f8362z = new float[9];

    /* renamed from: h */
    public final float[] f8360h = new float[9];

    /* renamed from: v */
    public final Matrix f8361v = new Matrix();

    public C2679yb(AbstractC0251En abstractC0251En) {
        this.f8359P = abstractC0251En;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        this.f8359P.f899w = f;
        float[] fArr = this.f8362z;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f8360h;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = ((f2 - f3) * f) + f3;
        }
        Matrix matrix = this.f8361v;
        matrix.setValues(fArr2);
        return matrix;
    }
}
