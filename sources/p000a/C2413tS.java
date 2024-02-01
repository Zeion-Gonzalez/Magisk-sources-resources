package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: a.tS */
/* loaded from: classes.dex */
public class C2413tS extends Button implements InterfaceC1984lJ {

    /* renamed from: R */
    public final C1791hh f7390R;

    /* renamed from: S */
    public final C2226py f7391S;

    /* renamed from: w */
    public C1624eZ f7392w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2413tS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1365ZY.m2763z(context);
        AbstractC1757h0.m3289z(this, getContext());
        C2226py c2226py = new C2226py(this);
        this.f7391S = c2226py;
        c2226py.m3864N(attributeSet, i);
        C1791hh c1791hh = new C1791hh(this);
        this.f7390R = c1791hh;
        c1791hh.m3336P(attributeSet, i);
        c1791hh.m3339h();
        if (this.f7392w == null) {
            this.f7392w = new C1624eZ(this, 1);
        }
        this.f7392w.m3085o(attributeSet, i);
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: N */
    public final void mo783N(ColorStateList colorStateList) {
        C1791hh c1791hh = this.f7390R;
        c1791hh.m3333G(colorStateList);
        c1791hh.m3339h();
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: Q */
    public final void mo784Q(PorterDuff.Mode mode) {
        C1791hh c1791hh = this.f7390R;
        c1791hh.m3334M(mode);
        c1791hh.m3339h();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f7391S;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (AbstractC1586ds.f4874h) {
            return super.getAutoSizeMaxTextSize();
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            return Math.round(c1791hh.f5639W.f555N);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (AbstractC1586ds.f4874h) {
            return super.getAutoSizeMinTextSize();
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            return Math.round(c1791hh.f5639W.f556P);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (AbstractC1586ds.f4874h) {
            return super.getAutoSizeStepGranularity();
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            return Math.round(c1791hh.f5639W.f562v);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1586ds.f4874h) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            return c1791hh.f5639W.f557Q;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (AbstractC1586ds.f4874h) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh == null) {
            return 0;
        }
        return c1791hh.f5639W.f563z;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1843ih.m3461tJ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null && !AbstractC1586ds.f4874h) {
            c1791hh.f5639W.m360z();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null && !AbstractC1586ds.f4874h) {
            C0180DU c0180du = c1791hh.f5639W;
            if (c0180du.m356W() && c0180du.f563z != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            c1791hh.f5639W.m360z();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f7392w == null) {
            this.f7392w = new C1624eZ(this, 1);
        }
        this.f7392w.m3081R(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC1586ds.f4874h) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            c1791hh.m3341u(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC1586ds.f4874h) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            c1791hh.m3340o(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC1586ds.f4874h) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            c1791hh.m3338W(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f7391S;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f7391S;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1843ih.m3423Rh(callback, this));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f7392w == null) {
            this.f7392w = new C1624eZ(this, 1);
        }
        super.setFilters(this.f7392w.m3084h(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null) {
            c1791hh.m3335N(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = AbstractC1586ds.f4874h;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        C1791hh c1791hh = this.f7390R;
        if (c1791hh != null && !z2) {
            C0180DU c0180du = c1791hh.f5639W;
            if (c0180du.m356W() && c0180du.f563z != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c0180du.m355Q(i, f);
            }
        }
    }
}
