package p000a;

/* renamed from: a.iO */
/* loaded from: classes.dex */
public final class C1826iO extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C0113CB f5715g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC1634ej f5716k;

    /* renamed from: q */
    public int f5717q;

    /* renamed from: y */
    public final /* synthetic */ InterfaceC1057Tq f5718y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826iO(InterfaceC1634ej interfaceC1634ej, C0113CB c0113cb, InterfaceC1057Tq interfaceC1057Tq, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f5716k = interfaceC1634ej;
        this.f5715g = c0113cb;
        this.f5718y = interfaceC1057Tq;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1826iO(this.f5716k, this.f5715g, this.f5718y, interfaceC1171Vv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.Tq] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.Df] */
    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f5717q;
        ?? r2 = this.f5718y;
        try {
            if (i == 0) {
                AbstractC1292YB.m2664UZ(obj);
                InterfaceC1634ej interfaceC1634ej = this.f5716k;
                C0113CB c0113cb = this.f5715g;
                this.f5717q = 1;
                if (interfaceC1634ej.mo1459z(c0113cb, this) == enumC0464Im) {
                    return enumC0464Im;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1292YB.m2664UZ(obj);
            }
            r2 = (C0190Df) r2;
            r2.m374h();
            return C0329GJ.f1115z;
        } catch (Throwable th) {
            ((C0190Df) r2).m374h();
            throw th;
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1826iO) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
