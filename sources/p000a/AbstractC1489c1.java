package p000a;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.c1 */
/* loaded from: classes.dex */
public abstract class AbstractC1489c1 {

    /* renamed from: z */
    public static final ThreadLocal f4627z = new ThreadLocal();

    /* renamed from: h */
    public static final ThreadLocal f4626h = new ThreadLocal();

    /* renamed from: z */
    public static void m2891z(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m2891z(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
