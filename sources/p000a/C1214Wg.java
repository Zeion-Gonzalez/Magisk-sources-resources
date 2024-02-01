package p000a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: a.Wg */
/* loaded from: classes.dex */
public final class C1214Wg extends Animatable2.AnimationCallback {

    /* renamed from: z */
    public final /* synthetic */ C0167DF f3976z;

    public C1214Wg(C0167DF c0167df) {
        this.f3976z = c0167df;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3976z.f525h.f6330J;
        if (colorStateList != null) {
            AbstractC0235ET.m478o(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C2032mF c2032mF = this.f3976z.f525h;
        ColorStateList colorStateList = c2032mF.f6330J;
        if (colorStateList != null) {
            AbstractC0235ET.m479u(drawable, colorStateList.getColorForState(c2032mF.f6328F, colorStateList.getDefaultColor()));
        }
    }
}
