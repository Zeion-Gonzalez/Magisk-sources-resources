package p000a;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* renamed from: a.Dg */
/* loaded from: classes.dex */
public final /* synthetic */ class C0191Dg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: h */
    public final /* synthetic */ Object f591h;

    /* renamed from: v */
    public final /* synthetic */ Object f592v;

    /* renamed from: z */
    public final /* synthetic */ int f593z;

    public /* synthetic */ C0191Dg(Object obj, int i, Object obj2) {
        this.f593z = i;
        this.f591h = obj;
        this.f592v = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f593z;
        Object obj = this.f592v;
        Object obj2 = this.f591h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                C2281qz c2281qz = (C2281qz) obj;
                int i2 = AppBarLayout.f9158i;
                appBarLayout.getClass();
                int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2281qz.setAlpha(floatValue);
                Iterator it = appBarLayout.f9162H.iterator();
                while (it.hasNext()) {
                    AbstractC2441tz.m4202q(it.next());
                    ColorStateList colorStateList = c2281qz.f7021S.f4613v;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(floatValue).getDefaultColor();
                        throw null;
                    }
                }
                return;
            case 1:
                AppBarLayout appBarLayout2 = (AppBarLayout) obj2;
                int i3 = AppBarLayout.f9158i;
                appBarLayout2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((C2281qz) obj).m3935S(floatValue2);
                Drawable drawable = appBarLayout2.f9175p;
                if (drawable instanceof C2281qz) {
                    ((C2281qz) drawable).m3935S(floatValue2);
                }
                Iterator it2 = appBarLayout2.f9162H.iterator();
                if (!it2.hasNext()) {
                    return;
                }
                AbstractC2441tz.m4202q(it2.next());
                throw null;
            default:
                ((View) ((C2285r2) ((C2196pM) obj2).f6755R).f7047N.getParent()).invalidate();
                return;
        }
    }
}
