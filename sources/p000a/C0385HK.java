package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.HK */
/* loaded from: classes.dex */
public final class C0385HK extends CheckedTextView implements InterfaceC1984lJ {

    /* renamed from: I */
    public C1624eZ f1306I;

    /* renamed from: R */
    public final C2226py f1307R;

    /* renamed from: S */
    public final C0375H9 f1308S;

    /* renamed from: w */
    public final C1791hh f1309w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385HK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC1365ZY.m2763z(context);
        AbstractC1757h0.m3289z(this, getContext());
        C1791hh c1791hh = new C1791hh(this);
        this.f1309w = c1791hh;
        c1791hh.m3336P(attributeSet, R.attr.checkedTextViewStyle);
        c1791hh.m3339h();
        C2226py c2226py = new C2226py(this);
        this.f1307R = c2226py;
        c2226py.m3864N(attributeSet, R.attr.checkedTextViewStyle);
        C0375H9 c0375h9 = new C0375H9(this, 0);
        this.f1308S = c0375h9;
        c0375h9.m864v(attributeSet, R.attr.checkedTextViewStyle);
        if (this.f1306I == null) {
            this.f1306I = new C1624eZ(this, 1);
        }
        this.f1306I.m3085o(attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: N */
    public final void mo783N(ColorStateList colorStateList) {
        C1791hh c1791hh = this.f1309w;
        c1791hh.m3333G(colorStateList);
        c1791hh.m3339h();
    }

    @Override // p000a.InterfaceC1984lJ
    /* renamed from: Q */
    public final void mo784Q(PorterDuff.Mode mode) {
        C1791hh c1791hh = this.f1309w;
        c1791hh.m3334M(mode);
        c1791hh.m3339h();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1791hh c1791hh = this.f1309w;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
        C2226py c2226py = this.f1307R;
        if (c2226py != null) {
            c2226py.m3871z();
        }
        C0375H9 c0375h9 = this.f1308S;
        if (c0375h9 != null) {
            c0375h9.m863h();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1843ih.m3461tJ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC2575wW.m4443nP(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f1306I == null) {
            this.f1306I = new C1624eZ(this, 1);
        }
        this.f1306I.m3081R(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f1307R;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f1307R;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC1843ih.m3431X(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1309w;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1791hh c1791hh = this.f1309w;
        if (c1791hh != null) {
            c1791hh.m3339h();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1843ih.m3423Rh(callback, this));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1791hh c1791hh = this.f1309w;
        if (c1791hh != null) {
            c1791hh.m3335N(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0375H9 c0375h9 = this.f1308S;
        if (c0375h9 != null) {
            if (c0375h9.f1284Q) {
                c0375h9.f1284Q = false;
            } else {
                c0375h9.f1284Q = true;
                c0375h9.m863h();
            }
        }
    }
}
