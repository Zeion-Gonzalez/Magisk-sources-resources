package p000a;

/* renamed from: a.UV */
/* loaded from: classes.dex */
public final class C1093UV {

    /* renamed from: M */
    public static final C1093UV f3568M;

    /* renamed from: G */
    public final float f3569G;

    /* renamed from: N */
    public final float f3570N;

    /* renamed from: P */
    public final float f3571P;

    /* renamed from: Q */
    public final float f3572Q;

    /* renamed from: W */
    public final float f3573W;

    /* renamed from: h */
    public final float f3574h;

    /* renamed from: o */
    public final float f3575o;

    /* renamed from: u */
    public final float[] f3576u;

    /* renamed from: v */
    public final float f3577v;

    /* renamed from: z */
    public final float f3578z;

    static {
        float f;
        float f2;
        float[] fArr = AbstractC2575wW.f7863M;
        float m4453tJ = (float) ((AbstractC2575wW.m4453tJ() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC2575wW.f7872W;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f3;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f3 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f11 = f + f2;
        float exp = (1.0f - (((float) Math.exp(((-m4453tJ) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * m4453tJ) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(m4453tJ * 5.0d))) + (f13 * m4453tJ);
        float m4453tJ2 = AbstractC2575wW.m4453tJ() / fArr[1];
        double d2 = m4453tJ2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f10) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f9) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        f3568M = new C1093UV(m4453tJ2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f))) * pow, pow, pow, f11, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C1093UV(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f3572Q = f;
        this.f3578z = f2;
        this.f3574h = f3;
        this.f3577v = f4;
        this.f3571P = f5;
        this.f3570N = f6;
        this.f3576u = fArr;
        this.f3575o = f7;
        this.f3573W = f8;
        this.f3569G = f9;
    }
}
