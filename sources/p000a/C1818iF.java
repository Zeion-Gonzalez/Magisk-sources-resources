package p000a;

import java.lang.reflect.Method;

/* renamed from: a.iF */
/* loaded from: classes.dex */
public final class C1818iF extends AbstractC2703z2 {

    /* renamed from: I */
    public final /* synthetic */ int f5682I;

    /* renamed from: R */
    public final /* synthetic */ Method f5683R;

    /* renamed from: w */
    public final /* synthetic */ Class f5684w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818iF(Method method, Class cls, int i) {
        super(7);
        this.f5683R = method;
        this.f5684w = cls;
        this.f5682I = i;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Lq */
    public final Object mo3375Lq() {
        return this.f5683R.invoke(null, this.f5684w, Integer.valueOf(this.f5682I));
    }

    @Override // p000a.AbstractC2703z2
    public final String toString() {
        return this.f5684w.getName();
    }
}
