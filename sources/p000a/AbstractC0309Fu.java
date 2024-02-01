package p000a;

import android.content.res.loader.ResourcesLoader;
import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: a.Fu */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0309Fu {
    /* renamed from: I */
    public static /* synthetic */ void m657I() {
    }

    /* renamed from: M */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m659M(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* renamed from: N */
    public static /* synthetic */ ResourcesLoader m660N() {
        return new ResourcesLoader();
    }

    /* renamed from: S */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m664S(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* renamed from: V */
    public static /* synthetic */ WindowInsetsAnimation m666V(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }
}
