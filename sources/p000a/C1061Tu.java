package p000a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: a.Tu */
/* loaded from: classes.dex */
public final class C1061Tu {

    /* renamed from: I */
    public static final Matrix f3485I = new Matrix();

    /* renamed from: G */
    public float f3486G;

    /* renamed from: M */
    public float f3487M;

    /* renamed from: N */
    public Paint f3488N;

    /* renamed from: P */
    public Paint f3489P;

    /* renamed from: Q */
    public PathMeasure f3490Q;

    /* renamed from: R */
    public Boolean f3491R;

    /* renamed from: S */
    public String f3492S;

    /* renamed from: V */
    public int f3493V;

    /* renamed from: W */
    public float f3494W;

    /* renamed from: h */
    public final Path f3495h;

    /* renamed from: o */
    public float f3496o;

    /* renamed from: u */
    public final C1592dz f3497u;

    /* renamed from: v */
    public final Matrix f3498v;

    /* renamed from: w */
    public final C1186WB f3499w;

    /* renamed from: z */
    public final Path f3500z;

    public C1061Tu() {
        this.f3498v = new Matrix();
        this.f3496o = 0.0f;
        this.f3494W = 0.0f;
        this.f3486G = 0.0f;
        this.f3487M = 0.0f;
        this.f3493V = 255;
        this.f3492S = null;
        this.f3491R = null;
        this.f3499w = new C1186WB();
        this.f3497u = new C1592dz();
        this.f3500z = new Path();
        this.f3495h = new Path();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3493V;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3493V = i;
    }

    /* renamed from: z */
    public final void m2220z(C1592dz c1592dz, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Path.FillType fillType;
        Path.FillType fillType2;
        c1592dz.f4896z.set(matrix);
        Matrix matrix2 = c1592dz.f4896z;
        matrix2.preConcat(c1592dz.f4885G);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = c1592dz.f4892h;
            if (i4 < arrayList.size()) {
                AbstractC0532K1 abstractC0532K1 = (AbstractC0532K1) arrayList.get(i4);
                if (abstractC0532K1 instanceof C1592dz) {
                    m2220z((C1592dz) abstractC0532K1, matrix2, canvas, i, i2);
                } else if (abstractC0532K1 instanceof AbstractC1273Xr) {
                    AbstractC1273Xr abstractC1273Xr = (AbstractC1273Xr) abstractC0532K1;
                    float f3 = i / this.f3486G;
                    float f4 = i2 / this.f3487M;
                    float min = Math.min(f3, f4);
                    Matrix matrix3 = this.f3498v;
                    matrix3.set(matrix2);
                    matrix3.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                    i3 = i4;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    if (max > 0.0f) {
                        f = Math.abs(f5) / max;
                    } else {
                        f = 0.0f;
                    }
                    if (f != 0.0f) {
                        abstractC1273Xr.getClass();
                        Path path = this.f3500z;
                        path.reset();
                        C1992lT[] c1992lTArr = abstractC1273Xr.f4097z;
                        if (c1992lTArr != null) {
                            C1992lT.m3603h(c1992lTArr, path);
                        }
                        Path path2 = this.f3495h;
                        path2.reset();
                        if (abstractC1273Xr instanceof C0753O5) {
                            if (abstractC1273Xr.f4096v == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            C1046Tc c1046Tc = (C1046Tc) abstractC1273Xr;
                            float f6 = c1046Tc.f3457G;
                            if (f6 != 0.0f || c1046Tc.f3458M != 1.0f) {
                                float f7 = c1046Tc.f3463V;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c1046Tc.f3458M + f7) % 1.0f;
                                if (this.f3490Q == null) {
                                    this.f3490Q = new PathMeasure();
                                }
                                this.f3490Q.setPath(path, false);
                                float length = this.f3490Q.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f3490Q.getSegment(f10, length, path, true);
                                    f2 = 0.0f;
                                    this.f3490Q.getSegment(0.0f, f11, path, true);
                                } else {
                                    f2 = 0.0f;
                                    this.f3490Q.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f2, f2);
                            }
                            path2.addPath(path, matrix3);
                            C2382so c2382so = c1046Tc.f3466u;
                            if (((Shader) c2382so.f7314h) != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && c2382so.f7316z == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (this.f3488N == null) {
                                    Paint paint = new Paint(1);
                                    this.f3488N = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f3488N;
                                Object obj = c2382so.f7314h;
                                if (((Shader) obj) != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c1046Tc.f3464W * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i5 = c2382so.f7316z;
                                    float f12 = c1046Tc.f3464W;
                                    PorterDuff.Mode mode = C1430aq.f4478U;
                                    paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (c1046Tc.f4096v == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            C2382so c2382so2 = c1046Tc.f3459N;
                            if (((Shader) c2382so2.f7314h) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3 && c2382so2.f7316z == 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                if (this.f3489P == null) {
                                    z5 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f3489P = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z5 = true;
                                }
                                Paint paint4 = this.f3489P;
                                Paint.Join join = c1046Tc.f3461R;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c1046Tc.f3462S;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c1046Tc.f3467w);
                                Object obj2 = c2382so2.f7314h;
                                if (((Shader) obj2) == null) {
                                    z5 = false;
                                }
                                if (z5) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c1046Tc.f3465o * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i6 = c2382so2.f7316z;
                                    float f13 = c1046Tc.f3465o;
                                    PorterDuff.Mode mode2 = C1430aq.f4478U;
                                    paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c1046Tc.f3460Q * f * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i4 = i3 + 1;
                    c = 0;
                }
                i3 = i4;
                i4 = i3 + 1;
                c = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public C1061Tu(C1061Tu c1061Tu) {
        this.f3498v = new Matrix();
        this.f3496o = 0.0f;
        this.f3494W = 0.0f;
        this.f3486G = 0.0f;
        this.f3487M = 0.0f;
        this.f3493V = 255;
        this.f3492S = null;
        this.f3491R = null;
        C1186WB c1186wb = new C1186WB();
        this.f3499w = c1186wb;
        this.f3497u = new C1592dz(c1061Tu.f3497u, c1186wb);
        this.f3500z = new Path(c1061Tu.f3500z);
        this.f3495h = new Path(c1061Tu.f3495h);
        this.f3496o = c1061Tu.f3496o;
        this.f3494W = c1061Tu.f3494W;
        this.f3486G = c1061Tu.f3486G;
        this.f3487M = c1061Tu.f3487M;
        this.f3493V = c1061Tu.f3493V;
        this.f3492S = c1061Tu.f3492S;
        String str = c1061Tu.f3492S;
        if (str != null) {
            c1186wb.put(str, this);
        }
        this.f3491R = c1061Tu.f3491R;
    }
}
