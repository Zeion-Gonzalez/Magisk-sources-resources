package p000a;

import android.text.Editable;

/* renamed from: a.f3 */
/* loaded from: classes.dex */
public final class C1652f3 extends AbstractC2117nw {

    /* renamed from: S */
    public final /* synthetic */ C1997lY f5121S;

    public C1652f3(C1997lY c1997lY) {
        this.f5121S = c1997lY;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f5121S.m3618h().mo1480z();
    }

    @Override // p000a.AbstractC2117nw, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f5121S.m3618h().mo623h();
    }
}
