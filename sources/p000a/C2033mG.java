package p000a;

import java.lang.reflect.Method;

/* renamed from: a.mG */
/* loaded from: classes.dex */
public final class C2033mG extends AbstractC2703z2 {

    /* renamed from: I */
    public final /* synthetic */ Class f6345I;

    /* renamed from: R */
    public final /* synthetic */ Method f6346R;

    /* renamed from: w */
    public final /* synthetic */ Object f6347w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2033mG(Method method, Object obj, Class cls) {
        super(7);
        this.f6346R = method;
        this.f6347w = obj;
        this.f6345I = cls;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Lq */
    public final Object mo3375Lq() {
        return this.f6346R.invoke(this.f6347w, this.f6345I);
    }

    @Override // p000a.AbstractC2703z2
    public final String toString() {
        return this.f6345I.getName();
    }
}
