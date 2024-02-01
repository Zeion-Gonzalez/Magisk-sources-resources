package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: a.N8 */
/* loaded from: classes.dex */
public final class C0695N8 extends ToggleButton implements InterfaceC1984lJ {

    /* renamed from: R */
    public final C1791hh f2345R;

    /* renamed from: S */
    public final C2226py f2346S;

    /* renamed from: w */
    public C1624eZ f2347w;

    public C0695N8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        AbstractC1757h0.m3289z(this, getContext());
        C2226py c2226py = new C2226py(this);
        this.f2346S = c2226py;
        c2226py.m3864N(attributeSet, 16842827);
        C1791hh c1791hh = new C1791hh(this);
        this.f2345R = c1791hh;
        c1791hh.m3336P(attributeSet, 16842827);
        if (this.f2347w == null) {
            this.f2347w = new C1624eZ(this, 1);
        }
        this.f2347w.m3085o(attributeSet, 16842827);
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: N */
    public final void mo783N(ColorStateList colorStateList) {
        C1791hh c1791hh = this.f2345R;
        c1791hh.m3333G(colorStateList);
        c1791hh.m3339h();
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: Q */
    public final void mo784Q(PorterDuff.Mode mode) {
        C1791hh c1791hh = this.f2345R;
        c1791hh.m3334M(mode);
        c1791hh.m3339h();
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f2346S;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C1791hh c1791hh = this.f2345R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f2347w == null) {
            this.f2347w = new C1624eZ(this, 1);
        }
        this.f2347w.m3081R(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f2346S;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f2346S;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f2345R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f2345R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f2347w == null) {
            this.f2347w = new C1624eZ(this, 1);
        }
        super.setFilters(this.f2347w.m3084h(inputFilterArr));
    }
}
