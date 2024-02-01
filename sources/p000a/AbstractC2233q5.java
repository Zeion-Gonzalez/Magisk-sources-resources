package p000a;

/* renamed from: a.q5 */
/* loaded from: classes.dex */
public abstract class AbstractC2233q5 extends AbstractC2097nW {
    public AbstractC2233q5(InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        if (interfaceC1171Vv != null) {
            if (!(interfaceC1171Vv.mo315N() == C0070BN.f302S)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: N */
    public final InterfaceC1255XS mo315N() {
        return C0070BN.f302S;
    }
}
