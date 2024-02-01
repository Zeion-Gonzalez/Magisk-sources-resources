package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: a.LT */
/* loaded from: classes.dex */
public class C0610LT extends TextView implements InterfaceC1984lJ {

    /* renamed from: I */
    public C1624eZ f1973I;

    /* renamed from: R */
    public final C1791hh f1974R;

    /* renamed from: S */
    public final C2226py f1975S;

    /* renamed from: k */
    public C0035Aj f1976k;

    /* renamed from: q */
    public boolean f1977q;

    /* renamed from: w */
    public final C1624eZ f1978w;

    public C0610LT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: I */
    public final C0035Aj m1352I() {
        C0035Aj c0035Aj;
        if (this.f1976k == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                c0035Aj = new C1175Vz(this);
            } else if (i >= 26) {
                c0035Aj = new C0035Aj(this, 2);
            }
            this.f1976k = c0035Aj;
        }
        return this.f1976k;
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: N */
    public final void mo783N(ColorStateList colorStateList) {
        C1791hh c1791hh = this.f1974R;
        c1791hh.m3333G(colorStateList);
        c1791hh.m3339h();
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: Q */
    public final void mo784Q(PorterDuff.Mode mode) {
        C1791hh c1791hh = this.f1974R;
        c1791hh.m3334M(mode);
        c1791hh.m3339h();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f1975S;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (AbstractC1586ds.f4874h) {
            return super.getAutoSizeMaxTextSize();
        }
        C1791hh c1791hh = this.f1974R;
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
        C1791hh c1791hh = this.f1974R;
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
        C1791hh c1791hh = this.f1974R;
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
        C1791hh c1791hh = this.f1974R;
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
        C1791hh c1791hh = this.f1974R;
        if (c1791hh == null) {
            return 0;
        }
        return c1791hh.f5639W.f563z;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1843ih.m3461tJ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        C1624eZ c1624eZ;
        if (Build.VERSION.SDK_INT < 28 && (c1624eZ = this.f1978w) != null) {
            TextClassifier textClassifier = (TextClassifier) c1624eZ.f5015w;
            if (textClassifier == null) {
                return AbstractC0214E4.m419z((TextView) c1624eZ.f5013R);
            }
            return textClassifier;
        }
        C0035Aj m1352I = m1352I();
        int i = m1352I.f176S;
        View view = m1352I.f175R;
        switch (i) {
            case 1:
                return super/*android.widget.EditText*/.getTextClassifier();
            default:
                return super.getTextClassifier();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1974R.getClass();
        C1791hh.m3331Q(this, onCreateInputConnection, editorInfo);
        AbstractC2575wW.m4443nP(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null && !AbstractC1586ds.f4874h) {
            c1791hh.f5639W.m360z();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        C1791hh c1791hh = this.f1974R;
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
        if (this.f1973I == null) {
            this.f1973I = new C1624eZ(this, 1);
        }
        this.f1973I.m3081R(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC1586ds.f4874h) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1791hh c1791hh = this.f1974R;
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
        C1791hh c1791hh = this.f1974R;
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
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3338W(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f1975S;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f1975S;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC1843ih.m3431X(context, i) : null, i2 != 0 ? AbstractC1843ih.m3431X(context, i2) : null, i3 != 0 ? AbstractC1843ih.m3431X(context, i3) : null, i4 != 0 ? AbstractC1843ih.m3431X(context, i4) : null);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC1843ih.m3431X(context, i) : null, i2 != 0 ? AbstractC1843ih.m3431X(context, i2) : null, i3 != 0 ? AbstractC1843ih.m3431X(context, i3) : null, i4 != 0 ? AbstractC1843ih.m3431X(context, i4) : null);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1843ih.m3423Rh(callback, this));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.f1973I == null) {
            this.f1973I = new C1624eZ(this, 1);
        }
        super.setFilters(this.f1973I.m3084h(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            m1352I().mo84z(i);
        } else {
            AbstractC1843ih.m3403EC(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            m1352I().mo83h(i);
        } else {
            AbstractC1843ih.m3427U8(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        AbstractC1843ih.m3430W(i);
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3335N(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        C1624eZ c1624eZ;
        if (Build.VERSION.SDK_INT < 28 && (c1624eZ = this.f1978w) != null) {
            c1624eZ.f5015w = textClassifier;
            return;
        }
        C0035Aj m1352I = m1352I();
        int i = m1352I.f176S;
        View view = m1352I.f175R;
        switch (i) {
            case 1:
                super/*android.widget.EditText*/.setTextClassifier(textClassifier);
                return;
            default:
                super.setTextClassifier(textClassifier);
                return;
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
        C1791hh c1791hh = this.f1974R;
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f1977q) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            C2196pM c2196pM = AbstractC1731gb.f5459z;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f1977q = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1977q = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610LT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1365ZY.m2763z(context);
        this.f1977q = false;
        this.f1976k = null;
        AbstractC1757h0.m3289z(this, getContext());
        C2226py c2226py = new C2226py(this);
        this.f1975S = c2226py;
        c2226py.m3864N(attributeSet, i);
        C1791hh c1791hh = new C1791hh(this);
        this.f1974R = c1791hh;
        c1791hh.m3336P(attributeSet, i);
        c1791hh.m3339h();
        this.f1978w = new C1624eZ(this, 2);
        if (this.f1973I == null) {
            this.f1973I = new C1624eZ(this, 1);
        }
        this.f1973I.m3085o(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1974R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }
}
