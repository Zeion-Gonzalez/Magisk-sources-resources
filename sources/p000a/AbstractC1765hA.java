package p000a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: a.hA */
/* loaded from: classes.dex */
public abstract class AbstractC1765hA {
    /* renamed from: h */
    public static float m3293h(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: v */
    public static float m3294v(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    /* renamed from: z */
    public static EdgeEffect m3295z(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }
}
