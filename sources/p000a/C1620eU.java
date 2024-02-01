package p000a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: a.eU */
/* loaded from: classes.dex */
public final class C1620eU extends AbstractC1476bl {

    /* renamed from: v */
    public final C1257XW f5005v;

    public C1620eU(C1257XW c1257xw) {
        this.f5005v = c1257xw;
    }

    @Override // p000a.AbstractC1476bl
    /* renamed from: z */
    public final void mo1798z(Matrix matrix, C1883jT c1883jT, int i, Canvas canvas) {
        boolean z;
        C1257XW c1257xw = this.f5005v;
        float f = c1257xw.f4076Q;
        float f2 = c1257xw.f4078u;
        RectF rectF = new RectF(c1257xw.f4077h, c1257xw.f4079v, c1257xw.f4075P, c1257xw.f4074N);
        c1883jT.getClass();
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = c1883jT.f5875u;
        int[] iArr = C1883jT.f5867M;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c1883jT.f5872Q;
            iArr[2] = c1883jT.f5870N;
            iArr[3] = c1883jT.f5871P;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c1883jT.f5871P;
            iArr[2] = c1883jT.f5870N;
            iArr[3] = c1883jT.f5872Q;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (i / width);
            float[] fArr = C1883jT.f5868V;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = c1883jT.f5873h;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c1883jT.f5874o);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
