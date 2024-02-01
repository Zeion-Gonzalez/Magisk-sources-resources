package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.Gu */
/* loaded from: classes.dex */
public final class C0361Gu extends MultiAutoCompleteTextView implements InterfaceC1984lJ {

    /* renamed from: I */
    public static final int[] f1213I = {16843126};

    /* renamed from: R */
    public final C1791hh f1214R;

    /* renamed from: S */
    public final C2226py f1215S;

    /* renamed from: w */
    public final C1624eZ f1216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0361Gu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        AbstractC1365ZY.m2763z(context);
        AbstractC1757h0.m3289z(this, getContext());
        C2709z9 m4639S = C2709z9.m4639S(getContext(), attributeSet, f1213I, R.attr.autoCompleteTextViewStyle);
        if (m4639S.m4645V(0)) {
            setDropDownBackgroundDrawable(m4639S.m4642N(0));
        }
        m4639S.m4651w();
        C2226py c2226py = new C2226py(this);
        this.f1215S = c2226py;
        c2226py.m3864N(attributeSet, R.attr.autoCompleteTextViewStyle);
        C1791hh c1791hh = new C1791hh(this);
        this.f1214R = c1791hh;
        c1791hh.m3336P(attributeSet, R.attr.autoCompleteTextViewStyle);
        c1791hh.m3339h();
        C1624eZ c1624eZ = new C1624eZ((EditText) this);
        this.f1216w = c1624eZ;
        c1624eZ.m3085o(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if ((!(keyListener instanceof NumberKeyListener)) != false) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener m3086v = c1624eZ.m3086v(keyListener);
            if (m3086v != keyListener) {
                super.setKeyListener(m3086v);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: N */
    public final void mo783N(ColorStateList colorStateList) {
        C1791hh c1791hh = this.f1214R;
        c1791hh.m3333G(colorStateList);
        c1791hh.m3339h();
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: Q */
    public final void mo784Q(PorterDuff.Mode mode) {
        C1791hh c1791hh = this.f1214R;
        c1791hh.m3334M(mode);
        c1791hh.m3339h();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f1215S;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C1791hh c1791hh = this.f1214R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC2575wW.m4443nP(this, editorInfo, onCreateInputConnection);
        return this.f1216w.m3083V(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f1215S;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f1215S;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1214R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1214R;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC1843ih.m3431X(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1216w.m3086v(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1791hh c1791hh = this.f1214R;
        if (c1791hh != null) {
            c1791hh.m3335N(context, i);
        }
    }
}
