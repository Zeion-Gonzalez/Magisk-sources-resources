package p000a;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: a.DQ */
/* loaded from: classes.dex */
public final class C0176DQ implements TypeEvaluator {

    /* renamed from: z */
    public final FloatEvaluator f543z = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.f543z.evaluate(f, (Number) ((Float) obj), (Number) ((Float) obj2)).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
