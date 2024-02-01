package p000a;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a.jY */
/* loaded from: classes.dex */
public abstract class AbstractC1888jY {

    /* renamed from: z */
    public static final int[] f5902z = {16842912};

    /* renamed from: h */
    public static final int[] f5900h = new int[0];

    /* renamed from: v */
    public static final Rect f5901v = new Rect();

    /* renamed from: h */
    public static Rect m3507h(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Insets m2845z = AbstractC1417ad.m2845z(drawable);
            i = m2845z.left;
            i2 = m2845z.top;
            i3 = m2845z.right;
            i4 = m2845z.bottom;
            return new Rect(i, i2, i3, i4);
        }
        if (drawable instanceof InterfaceC2517vM) {
            ((AbstractC1486bz) ((InterfaceC2517vM) drawable)).getClass();
            drawable = null;
        }
        if (i5 < 29) {
            if (AbstractC0940Rg.f3229z) {
                try {
                    Object invoke = AbstractC0940Rg.f3227h.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(AbstractC0940Rg.f3228v.getInt(invoke), AbstractC0940Rg.f3225P.getInt(invoke), AbstractC0940Rg.f3224N.getInt(invoke), AbstractC0940Rg.f3226Q.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z = AbstractC0940Rg.f3229z;
        }
        return f5901v;
    }

    /* renamed from: v */
    public static PorterDuff.Mode m3508v(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: z */
    public static void m3509z(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f5900h);
            } else {
                drawable.setState(f5902z);
            }
            drawable.setState(state);
        }
    }
}
