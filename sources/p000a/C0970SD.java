package p000a;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a.SD */
/* loaded from: classes.dex */
public final class C0970SD implements TextWatcher {

    /* renamed from: S */
    public final /* synthetic */ TextInputLayout f3286S;

    public C0970SD(TextInputLayout textInputLayout) {
        this.f3286S = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f3286S;
        textInputLayout.m5102r(!textInputLayout.f9472W9, false);
        if (textInputLayout.f9444E) {
            textInputLayout.m5099k(editable);
        }
        if (textInputLayout.f9442C) {
            textInputLayout.m5094Y(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
