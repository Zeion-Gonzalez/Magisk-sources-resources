package p000a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: a.f0 */
/* loaded from: classes.dex */
public final class C1649f0 extends Drawable.ConstantState {

    /* renamed from: h */
    public final Object f5111h;

    /* renamed from: z */
    public final /* synthetic */ int f5112z = 1;

    public C1649f0(C2251qP c2251qP) {
        this.f5111h = c2251qP;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        switch (this.f5112z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((Drawable.ConstantState) this.f5111h).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f5112z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((Drawable.ConstantState) this.f5111h).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.f5112z;
        Object obj = this.f5111h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1152VY c1152vy = new C1152VY(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                c1152vy.f1387S = newDrawable;
                newDrawable.setCallback(c1152vy.f3741k);
                return c1152vy;
            default:
                return (C2251qP) obj;
        }
    }

    public /* synthetic */ C1649f0(C2251qP c2251qP, int i) {
        this(c2251qP);
    }

    public C1649f0(Drawable.ConstantState constantState) {
        this.f5111h = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f5112z) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1152VY c1152vy = new C1152VY(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f5111h).newDrawable(resources);
                c1152vy.f1387S = newDrawable;
                newDrawable.setCallback(c1152vy.f3741k);
                return c1152vy;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f5112z) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1152VY c1152vy = new C1152VY(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f5111h).newDrawable(resources, theme);
                c1152vy.f1387S = newDrawable;
                newDrawable.setCallback(c1152vy.f3741k);
                return c1152vy;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
