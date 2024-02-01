package p000a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: a.Ol */
/* loaded from: classes.dex */
public final class C0791Ol extends AbstractC1476bl {

    /* renamed from: N */
    public final float f2692N;

    /* renamed from: P */
    public final float f2693P;

    /* renamed from: v */
    public final C0968SA f2694v;

    public C0791Ol(C0968SA c0968sa, float f, float f2) {
        this.f2694v = c0968sa;
        this.f2693P = f;
        this.f2692N = f2;
    }

    /* renamed from: h */
    public final float m1797h() {
        C0968SA c0968sa = this.f2694v;
        return (float) Math.toDegrees(Math.atan((c0968sa.f3284v - this.f2692N) / (c0968sa.f3283h - this.f2693P)));
    }

    @Override // p000a.AbstractC1476bl
    /* renamed from: z */
    public final void mo1798z(Matrix matrix, C1883jT c1883jT, int i, Canvas canvas) {
        C0968SA c0968sa = this.f2694v;
        float f = c0968sa.f3284v;
        float f2 = this.f2692N;
        float f3 = c0968sa.f3283h;
        float f4 = this.f2693P;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f4588z;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m1797h());
        c1883jT.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C1883jT.f5869W;
        iArr[0] = c1883jT.f5872Q;
        iArr[1] = c1883jT.f5870N;
        iArr[2] = c1883jT.f5871P;
        Paint paint = c1883jT.f5876v;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C1883jT.f5866G, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
