package p000a;

import android.animation.TypeEvaluator;

/* renamed from: a.ju */
/* loaded from: classes.dex */
public final class C1908ju implements TypeEvaluator {

    /* renamed from: z */
    public static final C1908ju f5950z = new C1908ju();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f) + pow2;
        float pow6 = ((((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3) * f) + pow3;
        float f4 = (((f3 - f2) * f) + f2) * 255.0f;
        return Integer.valueOf((Math.round(((float) Math.pow(((pow4 - pow) * f) + pow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f4) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
