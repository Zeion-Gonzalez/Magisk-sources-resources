package p000a;

import com.topjohnwu.magisk.core.Receiver;

/* renamed from: a.dQ */
/* loaded from: classes.dex */
public final class C1565dQ extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ int f4824g;

    /* renamed from: k */
    public final /* synthetic */ Receiver f4825k;

    /* renamed from: q */
    public int f4826q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565dQ(Receiver receiver, int i, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4825k = receiver;
        this.f4824g = i;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1565dQ(this.f4825k, this.f4824g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4826q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            int i2 = Receiver.f9567z;
            this.f4825k.getClass();
            C0468Ir c0468Ir = AbstractC1743gn.f5493P;
            this.f4826q = 1;
            c0468Ir.getClass();
            if (C0468Ir.m1131dx(this.f4824g, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1565dQ) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
