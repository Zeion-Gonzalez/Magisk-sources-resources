package p000a;

import android.view.View;

/* renamed from: a.qV */
/* loaded from: classes.dex */
public abstract class AbstractC2257qV extends C1219Wm {

    /* renamed from: v */
    public static boolean f6947v = true;

    public AbstractC2257qV() {
        super((AbstractC1050Tg) null);
    }

    /* renamed from: G */
    public float mo2165G(View view) {
        float transitionAlpha;
        if (f6947v) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f6947v = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: M */
    public void mo2166M(View view, float f) {
        if (f6947v) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f6947v = false;
            }
        }
        view.setAlpha(f);
    }
}
