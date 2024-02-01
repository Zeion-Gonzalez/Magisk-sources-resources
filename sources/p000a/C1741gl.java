package p000a;

/* renamed from: a.gl */
/* loaded from: classes.dex */
public final class C1741gl extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ int f5484g;

    /* renamed from: k */
    public final /* synthetic */ C1885jV f5485k;

    /* renamed from: q */
    public int f5486q;

    /* renamed from: y */
    public final /* synthetic */ int f5487y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741gl(C1885jV c1885jV, int i, int i2, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f5485k = c1885jV;
        this.f5484g = i;
        this.f5487y = i2;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1741gl(this.f5485k, this.f5484g, this.f5487y, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f5486q;
        C1885jV c1885jV = this.f5485k;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C0895Qs c0895Qs = c1885jV.f5890Y;
            int i3 = AbstractC1292YB.f4137Q[this.f5487y];
            this.f5486q = 1;
            if (c0895Qs.m2046h(this.f5484g, i3, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        c1885jV.m4500S(new C1366ZZ(i2));
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1741gl) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
