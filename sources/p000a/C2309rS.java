package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: a.rS */
/* loaded from: classes.dex */
public final class C2309rS extends C1420ag {

    /* renamed from: E */
    public String f7127E;

    @Override // p000a.C1420ag
    /* renamed from: G */
    public final void mo86G(Context context, AttributeSet attributeSet) {
        super.mo86G(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1173Vx.f3823h);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f7127E = string;
        }
        obtainAttributes.recycle();
    }

    @Override // p000a.C1420ag
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C2309rS) && super.equals(obj) && AbstractC1292YB.m2695u(this.f7127E, ((C2309rS) obj).f7127E);
    }

    @Override // p000a.C1420ag
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f7127E;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p000a.C1420ag
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f7127E;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        return sb.toString();
    }
}
