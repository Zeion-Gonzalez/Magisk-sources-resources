package p000a;

import java.io.IOException;

/* renamed from: a.TY */
/* loaded from: classes.dex */
public final class C1042TY extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public final /* synthetic */ C2638xi f3445q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042TY(C2638xi c2638xi, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3445q = c2638xi;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1042TY(this.f3445q, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        C0357Gq m44z;
        C2638xi c2638xi = this.f3445q;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        boolean z = false;
        try {
            try {
                if (!C2638xi.m4539z(c2638xi)) {
                    c2638xi.f8227h.add("! Installation failed");
                } else {
                    z = true;
                }
                m44z = AbstractC0017AI.m44z("cd /", "rm -rf " + c2638xi.f8226P + " /dev/tmp");
            } catch (IOException e) {
                AbstractC1530cs.f4727z.mo1160v(e);
                m44z = AbstractC0017AI.m44z("cd /", "rm -rf " + c2638xi.f8226P + " /dev/tmp");
            }
            m44z.m4631d2(null);
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            AbstractC0017AI.m44z("cd /", "rm -rf " + c2638xi.f8226P + " /dev/tmp").m4631d2(null);
            throw th;
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1042TY) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
