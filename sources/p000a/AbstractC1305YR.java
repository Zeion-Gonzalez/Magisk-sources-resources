package p000a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: a.YR */
/* loaded from: classes.dex */
public abstract class AbstractC1305YR extends AbstractC0913RC {

    /* renamed from: J */
    public boolean f4159J;

    /* renamed from: Y */
    public AbstractC2324rj f4160Y;

    @Override // p000a.AbstractC0913RC, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p000a.AbstractC0913RC, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f4159J) {
            super.mutate();
            this.f4160Y.mo3602N();
            this.f4159J = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
