package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: a.Am */
/* loaded from: classes.dex */
public final class C0038Am extends C1420ag implements InterfaceC0015AG {

    /* renamed from: E */
    public String f180E;

    @Override // p000a.C1420ag
    /* renamed from: G */
    public final void mo86G(Context context, AttributeSet attributeSet) {
        super.mo86G(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1173Vx.f3825z);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f180E = string;
        }
        obtainAttributes.recycle();
    }

    @Override // p000a.C1420ag
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C0038Am) && super.equals(obj) && AbstractC1292YB.m2695u(this.f180E, ((C0038Am) obj).f180E);
    }

    @Override // p000a.C1420ag
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f180E;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
