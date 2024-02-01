package p000a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* renamed from: a.Su */
/* loaded from: classes.dex */
public final class C1008Su {

    /* renamed from: z */
    public final C0116CF[] f3387z = new C0116CF[4];

    /* renamed from: h */
    public final Matrix[] f3383h = new Matrix[4];

    /* renamed from: v */
    public final Matrix[] f3386v = new Matrix[4];

    /* renamed from: P */
    public final PointF f3379P = new PointF();

    /* renamed from: N */
    public final Path f3378N = new Path();

    /* renamed from: Q */
    public final Path f3380Q = new Path();

    /* renamed from: u */
    public final C0116CF f3385u = new C0116CF();

    /* renamed from: o */
    public final float[] f3384o = new float[2];

    /* renamed from: W */
    public final float[] f3382W = new float[2];

    /* renamed from: G */
    public final Path f3376G = new Path();

    /* renamed from: M */
    public final Path f3377M = new Path();

    /* renamed from: V */
    public final boolean f3381V = true;

    public C1008Su() {
        for (int i = 0; i < 4; i++) {
            this.f3387z[i] = new C0116CF();
            this.f3383h[i] = new Matrix();
            this.f3386v[i] = new Matrix();
        }
    }

    /* renamed from: h */
    public final boolean m2183h(Path path, int i) {
        Path path2 = this.f3377M;
        path2.reset();
        this.f3387z[i].m240h(this.f3383h[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: z */
    public final void m2184z(C0099Bw c0099Bw, float f, RectF rectF, C2196pM c2196pM, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C0116CF[] c0116cfArr;
        float centerX;
        float f2;
        C1665fK c1665fK;
        char c;
        InterfaceC1722gQ interfaceC1722gQ;
        AbstractC1500cH abstractC1500cH;
        float f3;
        float f4;
        float f5;
        float f6;
        C1008Su c1008Su = this;
        RectF rectF2 = rectF;
        C2196pM c2196pM2 = c2196pM;
        Path path2 = path;
        path.rewind();
        Path path3 = c1008Su.f3378N;
        path3.rewind();
        Path path4 = c1008Su.f3380Q;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = c1008Su.f3386v;
            fArr = c1008Su.f3384o;
            matrixArr2 = c1008Su.f3383h;
            c0116cfArr = c1008Su.f3387z;
            if (i2 >= 4) {
                break;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        interfaceC1722gQ = c0099Bw.f374Q;
                    } else {
                        interfaceC1722gQ = c0099Bw.f372N;
                    }
                } else {
                    interfaceC1722gQ = c0099Bw.f378o;
                }
            } else {
                interfaceC1722gQ = c0099Bw.f379u;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        abstractC1500cH = c0099Bw.f377h;
                    } else {
                        abstractC1500cH = c0099Bw.f381z;
                    }
                } else {
                    abstractC1500cH = c0099Bw.f373P;
                }
            } else {
                abstractC1500cH = c0099Bw.f380v;
            }
            C0116CF c0116cf = c0116cfArr[i2];
            abstractC1500cH.getClass();
            abstractC1500cH.mo2904M(f, interfaceC1722gQ.mo2191z(rectF2), c0116cf);
            int i3 = i2 + 1;
            float f7 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = c1008Su.f3379P;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        f6 = rectF2.right;
                    } else {
                        f6 = rectF2.left;
                    }
                    f4 = f6;
                    f5 = rectF2.top;
                    pointF.set(f4, f5);
                    matrixArr2[i2].setTranslate(pointF.x, pointF.y);
                    matrixArr2[i2].preRotate(f7);
                    C0116CF c0116cf2 = c0116cfArr[i2];
                    fArr[0] = c0116cf2.f413v;
                    fArr[1] = c0116cf2.f408P;
                    matrixArr2[i2].mapPoints(fArr);
                    matrixArr[i2].reset();
                    matrixArr[i2].setTranslate(fArr[0], fArr[1]);
                    matrixArr[i2].preRotate(f7);
                    rectF2 = rectF;
                    i2 = i3;
                } else {
                    f3 = rectF2.left;
                }
            } else {
                f3 = rectF2.right;
            }
            f4 = f3;
            f5 = rectF2.bottom;
            pointF.set(f4, f5);
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f7);
            C0116CF c0116cf22 = c0116cfArr[i2];
            fArr[0] = c0116cf22.f413v;
            fArr[1] = c0116cf22.f408P;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f7);
            rectF2 = rectF;
            i2 = i3;
        }
        char c2 = 1;
        char c3 = 0;
        int i4 = 0;
        while (i4 < i) {
            C0116CF c0116cf3 = c0116cfArr[i4];
            fArr[c3] = c0116cf3.f414z;
            fArr[c2] = c0116cf3.f410h;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path2.moveTo(fArr[c3], fArr[c2]);
            } else {
                path2.lineTo(fArr[c3], fArr[c2]);
            }
            c0116cfArr[i4].m240h(matrixArr2[i4], path2);
            if (c2196pM2 != null) {
                C0116CF c0116cf4 = c0116cfArr[i4];
                Matrix matrix = matrixArr2[i4];
                BitSet bitSet = ((C2281qz) c2196pM2.f6755R).f7018I;
                c0116cf4.getClass();
                bitSet.set(i4, false);
                AbstractC1476bl[] abstractC1476blArr = ((C2281qz) c2196pM2.f6755R).f7020R;
                c0116cf4.m242z(c0116cf4.f409Q);
                abstractC1476blArr[i4] = new C2182p6(new ArrayList(c0116cf4.f411o), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C0116CF c0116cf5 = c0116cfArr[i4];
            fArr[0] = c0116cf5.f413v;
            fArr[1] = c0116cf5.f408P;
            matrixArr2[i4].mapPoints(fArr);
            C0116CF c0116cf6 = c0116cfArr[i6];
            float f8 = c0116cf6.f414z;
            float[] fArr2 = c1008Su.f3382W;
            fArr2[0] = f8;
            fArr2[1] = c0116cf6.f410h;
            matrixArr2[i6].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C0116CF c0116cf7 = c0116cfArr[i4];
            fArr[0] = c0116cf7.f413v;
            fArr[1] = c0116cf7.f408P;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 != 1 && i4 != 3) {
                centerX = rectF.centerY();
                f2 = fArr[1];
            } else {
                centerX = rectF.centerX();
                f2 = fArr[0];
            }
            Math.abs(centerX - f2);
            C0116CF c0116cf8 = c1008Su.f3385u;
            c0116cf8.m239P(0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        c1665fK = c0099Bw.f370G;
                    } else {
                        c1665fK = c0099Bw.f376W;
                    }
                } else {
                    c1665fK = c0099Bw.f375V;
                }
            } else {
                c1665fK = c0099Bw.f371M;
            }
            c1665fK.getClass();
            c0116cf8.m241v(max, 0.0f);
            Path path5 = c1008Su.f3376G;
            path5.reset();
            c0116cf8.m240h(matrixArr[i4], path5);
            if (c1008Su.f3381V && (c1008Su.m2183h(path5, i4) || c1008Su.m2183h(path5, i6))) {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = c0116cf8.f414z;
                fArr[1] = c0116cf8.f410h;
                matrixArr[i4].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                c0116cf8.m240h(matrixArr[i4], path3);
                c2196pM2 = c2196pM;
                path2 = path;
            } else {
                path2 = path;
                c0116cf8.m240h(matrixArr[i4], path2);
                c2196pM2 = c2196pM;
            }
            if (c2196pM2 != null) {
                Matrix matrix2 = matrixArr[i4];
                c = 0;
                ((C2281qz) c2196pM2.f6755R).f7018I.set(i4 + 4, false);
                AbstractC1476bl[] abstractC1476blArr2 = ((C2281qz) c2196pM2.f6755R).f7034w;
                c0116cf8.m242z(c0116cf8.f409Q);
                abstractC1476blArr2[i4] = new C2182p6(new ArrayList(c0116cf8.f411o), new Matrix(matrix2));
            } else {
                c = 0;
            }
            c3 = c;
            i4 = i5;
            c2 = 1;
            i = 4;
            c1008Su = this;
        }
        path.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }
}
