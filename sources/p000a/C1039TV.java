package p000a;

/* renamed from: a.TV */
/* loaded from: classes.dex */
public final class C1039TV extends AbstractC0620Lf {

    /* renamed from: I */
    public int f3441I;

    /* renamed from: k */
    public final /* synthetic */ Object f3442k;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC0559KW f3443q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039TV(InterfaceC1171Vv interfaceC1171Vv, InterfaceC1255XS interfaceC1255XS, InterfaceC0559KW interfaceC0559KW, Object obj) {
        super(interfaceC1171Vv, interfaceC1255XS);
        this.f3443q = interfaceC0559KW;
        this.f3442k = obj;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        int i = this.f3441I;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f3441I = 2;
            AbstractC1292YB.m2664UZ(obj);
            return obj;
        }
        this.f3441I = 1;
        AbstractC1292YB.m2664UZ(obj);
        InterfaceC0559KW interfaceC0559KW = this.f3443q;
        AbstractC0438II.m995G(2, interfaceC0559KW);
        return interfaceC0559KW.mo51o(this.f3442k, this);
    }
}
