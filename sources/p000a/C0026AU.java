package p000a;

import android.graphics.Color;

/* renamed from: a.AU */
/* loaded from: classes.dex */
public final class C0026AU {

    /* renamed from: N */
    public final float f144N;

    /* renamed from: P */
    public final float f145P;

    /* renamed from: Q */
    public final float f146Q;

    /* renamed from: h */
    public final float f147h;

    /* renamed from: v */
    public final float f148v;

    /* renamed from: z */
    public final float f149z;

    public C0026AU(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f149z = f;
        this.f147h = f2;
        this.f148v = f3;
        this.f145P = f4;
        this.f144N = f5;
        this.f146Q = f6;
    }

    /* renamed from: h */
    public static C0026AU m61h(float f, float f2, float f3) {
        C1093UV c1093uv = C1093UV.f3568M;
        float f4 = c1093uv.f3571P;
        Math.sqrt(f / 100.0d);
        float f5 = c1093uv.f3578z + 4.0f;
        float f6 = c1093uv.f3573W * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c1093uv.f3571P) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C0026AU(f3, f2, f, f7, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    /* renamed from: z */
    public static C0026AU m62z(int i) {
        float f;
        C1093UV c1093uv = C1093UV.f3568M;
        float m4386B = AbstractC2575wW.m4386B(Color.red(i));
        float m4386B2 = AbstractC2575wW.m4386B(Color.green(i));
        float m4386B3 = AbstractC2575wW.m4386B(Color.blue(i));
        float[][] fArr = AbstractC2575wW.f7871V;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * m4386B3) + (fArr2[1] * m4386B2) + (fArr2[0] * m4386B);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * m4386B3) + (fArr3[1] * m4386B2) + (fArr3[0] * m4386B);
        float[] fArr4 = fArr[2];
        float f4 = (m4386B3 * fArr4[2]) + (m4386B2 * fArr4[1]) + (m4386B * fArr4[0]);
        float[][] fArr5 = AbstractC2575wW.f7872W;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = c1093uv.f3576u;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float abs = Math.abs(f8);
        float f11 = c1093uv.f3575o;
        float pow = (float) Math.pow((abs * f11) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f9) * f11) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f10) * f11) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f12 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f13 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = ((21.0f * signum3) + ((signum * 20.0f) + f14)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = atan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * c1093uv.f3574h;
        float f20 = c1093uv.f3578z;
        double d2 = f19 / f20;
        float f21 = c1093uv.f3569G;
        float f22 = c1093uv.f3571P;
        float pow4 = ((float) Math.pow(d2, f21 * f22)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f23 = f20 + 4.0f;
        if (f17 < 20.14d) {
            f = 360.0f + f17;
        } else {
            f = f17;
        }
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c1093uv.f3572Q), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c1093uv.f3570N) * c1093uv.f3577v) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d));
        float f24 = c1093uv.f3573W * sqrt;
        Math.sqrt((r3 * f22) / f23);
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f24 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f18;
        return new C0026AU(f17, sqrt, pow4, f25, ((float) Math.cos(d3)) * log, log * ((float) Math.sin(d3)));
    }

    /* renamed from: v */
    public final int m63v(C1093UV c1093uv) {
        float f;
        float f2 = this.f147h;
        double d = f2;
        float f3 = this.f148v;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c1093uv.f3572Q), 0.73d), 1.1111111111111112d);
                double d3 = (this.f149z * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = c1093uv.f3578z * ((float) Math.pow(f3 / 100.0d, (1.0d / c1093uv.f3571P) / c1093uv.f3569G));
                float f4 = cos * 3846.1538f * c1093uv.f3570N * c1093uv.f3577v;
                float f5 = pow2 / c1093uv.f3574h;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f6 = (((0.305f + f5) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f4 * 23.0f)));
                float f7 = cos2 * f6;
                float f8 = f6 * sin;
                float f9 = f5 * 460.0f;
                float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
                float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
                float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
                float signum = Math.signum(f10);
                float f13 = 100.0f / c1093uv.f3575o;
                float pow3 = signum * f13 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f11) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float signum3 = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float[] fArr = c1093uv.f3576u;
                float f14 = pow3 / fArr[0];
                float f15 = signum2 / fArr[1];
                float f16 = signum3 / fArr[2];
                float[][] fArr2 = AbstractC2575wW.f7858G;
                float[] fArr3 = fArr2[0];
                float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
                float[] fArr4 = fArr2[1];
                float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
                float[] fArr5 = fArr2[2];
                return AbstractC0106C4.m230z(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c1093uv.f3572Q), 0.73d), 1.1111111111111112d);
        double d32 = (this.f149z * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = c1093uv.f3578z * ((float) Math.pow(f3 / 100.0d, (1.0d / c1093uv.f3571P) / c1093uv.f3569G));
        float f42 = cos3 * 3846.1538f * c1093uv.f3570N * c1093uv.f3577v;
        float f52 = pow22 / c1093uv.f3574h;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f62 = (((0.305f + f52) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f42 * 23.0f)));
        float f72 = cos22 * f62;
        float f82 = f62 * sin2;
        float f92 = f52 * 460.0f;
        float f102 = ((288.0f * f82) + ((451.0f * f72) + f92)) / 1403.0f;
        float f112 = ((f92 - (891.0f * f72)) - (261.0f * f82)) / 1403.0f;
        float f122 = ((f92 - (f72 * 220.0f)) - (f82 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102)));
        float signum4 = Math.signum(f102);
        float f132 = 100.0f / c1093uv.f3575o;
        float pow32 = signum4 * f132 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f112) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float signum32 = Math.signum(f122) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float[] fArr6 = c1093uv.f3576u;
        float f142 = pow32 / fArr6[0];
        float f152 = signum22 / fArr6[1];
        float f162 = signum32 / fArr6[2];
        float[][] fArr22 = AbstractC2575wW.f7858G;
        float[] fArr32 = fArr22[0];
        float f172 = (fArr32[2] * f162) + (fArr32[1] * f152) + (fArr32[0] * f142);
        float[] fArr42 = fArr22[1];
        float f182 = (fArr42[2] * f162) + (fArr42[1] * f152) + (fArr42[0] * f142);
        float[] fArr52 = fArr22[2];
        return AbstractC0106C4.m230z(f172, f182, (f162 * fArr52[2]) + (f152 * fArr52[1]) + (f142 * fArr52[0]));
    }
}
