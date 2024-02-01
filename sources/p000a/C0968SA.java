package p000a;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: a.SA */
/* loaded from: classes.dex */
public final class C0968SA extends AbstractC2500v5 {

    /* renamed from: h */
    public float f3283h;

    /* renamed from: v */
    public float f3284v;

    @Override // p000a.AbstractC2500v5
    /* renamed from: z */
    public final void mo2151z(Matrix matrix, Path path) {
        Matrix matrix2 = this.f7666z;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3283h, this.f3284v);
        path.transform(matrix);
    }
}
