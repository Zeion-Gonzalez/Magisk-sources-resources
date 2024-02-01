package p000a;

/* renamed from: a.Ga */
/* loaded from: classes.dex */
public final class C0344Ga extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ C1453bH f1156k;

    /* renamed from: q */
    public int f1157q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0344Ga(C1453bH c1453bH, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1156k = c1453bH;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0344Ga(this.f1156k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f1157q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C1453bH c1453bH = this.f1156k;
            C0707NL c0707nl = new C0707NL(c1453bH, c1453bH, 1);
            this.f1157q = 1;
            obj = AbstractC0328GI.m729q(c0707nl, this);
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return obj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0344Ga) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
