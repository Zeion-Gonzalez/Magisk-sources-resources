package p000a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* renamed from: a.rz */
/* loaded from: classes.dex */
public abstract class AbstractC2338rz {
    /* renamed from: N */
    public static void m3991N(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* renamed from: P */
    public static boolean m3992P(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* renamed from: h */
    public static Drawable m3993h(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    /* renamed from: v */
    public static Drawable m3994v(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    /* renamed from: z */
    public static int m3995z(Drawable drawable) {
        return drawable.getAlpha();
    }
}
