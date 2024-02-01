package p000a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: a.XW */
/* loaded from: classes.dex */
public final class C1257XW extends AbstractC2500v5 {

    /* renamed from: o */
    public static final RectF f4073o = new RectF();

    /* renamed from: N */
    public float f4074N;

    /* renamed from: P */
    public float f4075P;

    /* renamed from: Q */
    public float f4076Q;

    /* renamed from: h */
    public float f4077h;

    /* renamed from: u */
    public float f4078u;

    /* renamed from: v */
    public float f4079v;

    public C1257XW(float f, float f2, float f3, float f4) {
        this.f4077h = f;
        this.f4079v = f2;
        this.f4075P = f3;
        this.f4074N = f4;
    }

    @Override // p000a.AbstractC2500v5
    /* renamed from: z */
    public final void mo2151z(Matrix matrix, Path path) {
        Matrix matrix2 = this.f7666z;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f4073o;
        rectF.set(this.f4077h, this.f4079v, this.f4075P, this.f4074N);
        path.arcTo(rectF, this.f4076Q, this.f4078u, false);
        path.transform(matrix);
    }
}
