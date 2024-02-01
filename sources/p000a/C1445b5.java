package p000a;

import android.content.Context;
import android.graphics.Color;
import com.topjohnwu.magisk.R;

/* renamed from: a.b5 */
/* loaded from: classes.dex */
public final class C1445b5 {

    /* renamed from: Q */
    public static final int f4520Q = (int) Math.round(5.1000000000000005d);

    /* renamed from: N */
    public final float f4521N;

    /* renamed from: P */
    public final int f4522P;

    /* renamed from: h */
    public final int f4523h;

    /* renamed from: v */
    public final int f4524v;

    /* renamed from: z */
    public final boolean f4525z;

    public C1445b5(Context context) {
        boolean m1807EC = AbstractC0795Op.m1807EC(context, R.attr.elevationOverlayEnabled, false);
        int m1836Y = AbstractC0795Op.m1836Y(context, R.attr.elevationOverlayColor, 0);
        int m1836Y2 = AbstractC0795Op.m1836Y(context, R.attr.elevationOverlayAccentColor, 0);
        int m1836Y3 = AbstractC0795Op.m1836Y(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4525z = m1807EC;
        this.f4523h = m1836Y;
        this.f4524v = m1836Y2;
        this.f4522P = m1836Y3;
        this.f4521N = f;
    }

    /* renamed from: z */
    public final int m2865z(int i, float f) {
        boolean z;
        float f2;
        int i2;
        if (this.f4525z) {
            if (AbstractC0106C4.m229v(i, 255) == this.f4522P) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f4521N > 0.0f && f > 0.0f) {
                    f2 = Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f2 = 0.0f;
                }
                int alpha = Color.alpha(i);
                int m1829T = AbstractC0795Op.m1829T(AbstractC0106C4.m229v(i, 255), this.f4523h, f2);
                if (f2 > 0.0f && (i2 = this.f4524v) != 0) {
                    m1829T = AbstractC0106C4.m228h(AbstractC0106C4.m229v(i2, f4520Q), m1829T);
                }
                return AbstractC0106C4.m229v(m1829T, alpha);
            }
            return i;
        }
        return i;
    }
}
