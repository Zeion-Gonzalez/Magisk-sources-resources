package p000a;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a.dj */
/* loaded from: classes.dex */
public final class C1580dj extends C1480br {

    /* renamed from: U */
    public final RectF f4860U;

    public C1580dj(C1580dj c1580dj) {
        super(c1580dj);
        this.f4860U = c1580dj.f4860U;
    }

    @Override // p000a.C1480br, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0052B1 c0052b1 = new C0052B1(this);
        c0052b1.invalidateSelf();
        return c0052b1;
    }

    public C1580dj(C0099Bw c0099Bw, RectF rectF) {
        super(c0099Bw);
        this.f4860U = rectF;
    }
}
