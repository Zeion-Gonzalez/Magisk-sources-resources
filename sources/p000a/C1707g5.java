package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: a.g5 */
/* loaded from: classes.dex */
public class C1707g5 extends CheckBox implements InterfaceC1984lJ {

    /* renamed from: I */
    public C1624eZ f5368I;

    /* renamed from: R */
    public final C2226py f5369R;

    /* renamed from: S */
    public final C0375H9 f5370S;

    /* renamed from: w */
    public final C1791hh f5371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707g5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1365ZY.m2763z(context);
        AbstractC1757h0.m3289z(this, getContext());
        C0375H9 c0375h9 = new C0375H9(this, 1);
        this.f5370S = c0375h9;
        c0375h9.m864v(attributeSet, i);
        C2226py c2226py = new C2226py(this);
        this.f5369R = c2226py;
        c2226py.m3864N(attributeSet, i);
        C1791hh c1791hh = new C1791hh(this);
        this.f5371w = c1791hh;
        c1791hh.m3336P(attributeSet, i);
        if (this.f5368I == null) {
            this.f5368I = new C1624eZ(this, 1);
        }
        this.f5368I.m3085o(attributeSet, i);
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: N */
    public final void mo783N(ColorStateList colorStateList) {
        C1791hh c1791hh = this.f5371w;
        c1791hh.m3333G(colorStateList);
        c1791hh.m3339h();
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: Q */
    public final void mo784Q(PorterDuff.Mode mode) {
        C1791hh c1791hh = this.f5371w;
        c1791hh.m3334M(mode);
        c1791hh.m3339h();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f5369R;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C1791hh c1791hh = this.f5371w;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0375H9 c0375h9 = this.f5370S;
        if (c0375h9 != null) {
            c0375h9.getClass();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f5368I == null) {
            this.f5368I = new C1624eZ(this, 1);
        }
        this.f5368I.m3081R(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f5369R;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f5369R;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC1843ih.m3431X(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f5371w;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f5371w;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f5368I == null) {
            this.f5368I = new C1624eZ(this, 1);
        }
        super.setFilters(this.f5368I.m3084h(inputFilterArr));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0375H9 c0375h9 = this.f5370S;
        if (c0375h9 != null) {
            if (c0375h9.f1284Q) {
                c0375h9.f1284Q = false;
            } else {
                c0375h9.f1284Q = true;
                c0375h9.m865z();
            }
        }
    }
}
