package p000a;

import android.graphics.drawable.Drawable;

/* renamed from: a.QX */
/* loaded from: classes.dex */
public final class C0881QX implements Drawable.Callback {

    /* renamed from: R */
    public Object f3041R;

    /* renamed from: S */
    public final /* synthetic */ int f3042S = 0;

    public C0881QX() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f3042S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return;
            default:
                ((C1152VY) this.f3041R).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f3042S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Drawable.Callback callback = (Drawable.Callback) this.f3041R;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            default:
                ((C1152VY) this.f3041R).scheduleSelf(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f3042S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Drawable.Callback callback = (Drawable.Callback) this.f3041R;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((C1152VY) this.f3041R).unscheduleSelf(runnable);
                return;
        }
    }

    public C0881QX(C1152VY c1152vy) {
        this.f3041R = c1152vy;
    }
}
