package p000a;

/* renamed from: a.eO */
/* loaded from: classes.dex */
public final class C1615eO extends AbstractC2233q5 {

    /* renamed from: I */
    public final /* synthetic */ Object f4962I;

    /* renamed from: R */
    public int f4963R;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC0559KW f4964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615eO(Object obj, InterfaceC1171Vv interfaceC1171Vv, InterfaceC0559KW interfaceC0559KW) {
        super(interfaceC1171Vv);
        this.f4964w = interfaceC0559KW;
        this.f4962I = obj;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        int i = this.f4963R;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f4963R = 2;
            AbstractC1292YB.m2664UZ(obj);
            return obj;
        }
        this.f4963R = 1;
        AbstractC1292YB.m2664UZ(obj);
        InterfaceC0559KW interfaceC0559KW = this.f4964w;
        AbstractC0438II.m995G(2, interfaceC0559KW);
        return interfaceC0559KW.mo51o(this.f4962I, this);
    }
}
