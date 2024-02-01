package p000a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: a.mb */
/* loaded from: classes.dex */
public final class C2048mb extends Drawable.ConstantState {

    /* renamed from: z */
    public final Drawable.ConstantState f6375z;

    public C2048mb(Drawable.ConstantState constantState) {
        this.f6375z = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f6375z.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f6375z.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1430aq c1430aq = new C1430aq();
        c1430aq.f1387S = (VectorDrawable) this.f6375z.newDrawable();
        return c1430aq;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1430aq c1430aq = new C1430aq();
        c1430aq.f1387S = (VectorDrawable) this.f6375z.newDrawable(resources);
        return c1430aq;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1430aq c1430aq = new C1430aq();
        c1430aq.f1387S = (VectorDrawable) this.f6375z.newDrawable(resources, theme);
        return c1430aq;
    }
}
