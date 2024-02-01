package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* renamed from: a.lH */
/* loaded from: classes.dex */
public final class C1982lH {

    /* renamed from: h */
    public static final PorterDuff.Mode f6149h = PorterDuff.Mode.SRC_IN;

    /* renamed from: v */
    public static C1982lH f6150v;

    /* renamed from: z */
    public C0763OF f6151z;

    /* renamed from: N */
    public static void m3594N(Drawable drawable, C2380sl c2380sl, int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C0763OF.f2585o;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC1888jY.f5902z;
        if (drawable.mutate() == drawable) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c2380sl.f7311h;
        if (!z2 && !c2380sl.f7313z) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z2) {
                colorStateList = (ColorStateList) c2380sl.f7312v;
            } else {
                colorStateList = null;
            }
            if (c2380sl.f7313z) {
                mode = (PorterDuff.Mode) c2380sl.f7310P;
            } else {
                mode = C0763OF.f2585o;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = C0763OF.m1761o(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: P */
    public static synchronized void m3595P() {
        synchronized (C1982lH.class) {
            if (f6150v == null) {
                C1982lH c1982lH = new C1982lH();
                f6150v = c1982lH;
                c1982lH.f6151z = C0763OF.m1760P();
                f6150v.f6151z.m1766V(new C1364ZX());
            }
        }
    }

    /* renamed from: v */
    public static synchronized PorterDuffColorFilter m3596v(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1761o;
        synchronized (C1982lH.class) {
            m1761o = C0763OF.m1761o(i, mode);
        }
        return m1761o;
    }

    /* renamed from: z */
    public static synchronized C1982lH m3597z() {
        C1982lH c1982lH;
        synchronized (C1982lH.class) {
            if (f6150v == null) {
                m3595P();
            }
            c1982lH = f6150v;
        }
        return c1982lH;
    }

    /* renamed from: h */
    public final synchronized Drawable m3598h(Context context, int i) {
        return this.f6151z.m1764Q(context, i);
    }
}
