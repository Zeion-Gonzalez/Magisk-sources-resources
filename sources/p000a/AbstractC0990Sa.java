package p000a;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a.Sa */
/* loaded from: classes.dex */
public abstract class AbstractC0990Sa extends C2281qz {

    /* renamed from: L */
    public static final /* synthetic */ int f3334L = 0;

    /* renamed from: j */
    public C1580dj f3335j;

    public AbstractC0990Sa(C1580dj c1580dj) {
        super(c1580dj);
        this.f3335j = c1580dj;
    }

    /* renamed from: g */
    public final void m2164g(float f, float f2, float f3, float f4) {
        RectF rectF = this.f3335j.f4860U;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // p000a.C2281qz, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3335j = new C1580dj(this.f3335j);
        return this;
    }
}
