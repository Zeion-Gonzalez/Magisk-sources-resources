package p000a;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: a.kR */
/* loaded from: classes.dex */
public final class C1936kR implements TextWatcher {

    /* renamed from: S */
    public final EditText f6010S;

    /* renamed from: R */
    public final boolean f6009R = false;

    /* renamed from: w */
    public boolean f6011w = true;

    public C1936kR(EditText editText) {
        this.f6010S = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (!this.f6010S.isInEditMode()) {
            if (this.f6011w) {
                if (!this.f6009R) {
                    Object obj = AbstractC2473ua.f7574z;
                } else {
                    z = false;
                    if (!z && i2 <= i3 && (charSequence instanceof Spannable)) {
                        AbstractC2473ua.m4249z();
                        throw null;
                    }
                    return;
                }
            }
            z = true;
            if (!z) {
                AbstractC2473ua.m4249z();
                throw null;
            }
        }
    }
}
