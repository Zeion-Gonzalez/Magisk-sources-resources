package p000a;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: a.m1 */
/* loaded from: classes.dex */
public final class C2022m1 implements TextWatcher {

    /* renamed from: S */
    public final /* synthetic */ InterfaceC0432IC f6280S;

    public C2022m1(C0130CV c0130cv) {
        this.f6280S = c0130cv;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        InterfaceC0432IC interfaceC0432IC = this.f6280S;
        if (interfaceC0432IC != null) {
            interfaceC0432IC.mo258z();
        }
    }
}
