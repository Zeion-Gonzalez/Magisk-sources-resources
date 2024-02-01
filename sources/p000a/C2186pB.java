package p000a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* renamed from: a.pB */
/* loaded from: classes.dex */
public final class C2186pB extends AbstractC0614LY {
    @Override // p000a.AbstractC0614LY
    /* renamed from: N */
    public final void mo292N(C2495v0 c2495v0) {
        View view = c2495v0.f7630h;
        if (view instanceof TextView) {
            c2495v0.f7632z.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: R */
    public final Animator mo293R(ViewGroup viewGroup, C2495v0 c2495v0, C2495v0 c2495v02) {
        if (c2495v0 == null || c2495v02 == null || !(c2495v0.f7630h instanceof TextView)) {
            return null;
        }
        View view = c2495v02.f7630h;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = c2495v0.f7632z;
        HashMap hashMap2 = c2495v02.f7632z;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new C0585Kx(0, textView, this));
        return ofFloat;
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: o */
    public final void mo295o(C2495v0 c2495v0) {
        View view = c2495v0.f7630h;
        if (view instanceof TextView) {
            c2495v0.f7632z.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }
}
