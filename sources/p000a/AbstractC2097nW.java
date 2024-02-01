package p000a;

import java.io.Serializable;

/* renamed from: a.nW */
/* loaded from: classes.dex */
public abstract class AbstractC2097nW implements InterfaceC1171Vv, InterfaceC2683yf, Serializable {

    /* renamed from: S */
    public final InterfaceC1171Vv f6471S;

    public AbstractC2097nW(InterfaceC1171Vv interfaceC1171Vv) {
        this.f6471S = interfaceC1171Vv;
    }

    /* renamed from: G */
    public InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: M */
    public void mo3723M() {
    }

    /* renamed from: S */
    public void mo1387S() {
    }

    /* renamed from: V */
    public abstract Object mo50V(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        mo3723M();
        sb.append((Object) getClass().getName());
        return sb.toString();
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: u */
    public final void mo320u(Object obj) {
        InterfaceC1171Vv interfaceC1171Vv = this;
        while (true) {
            AbstractC2097nW abstractC2097nW = (AbstractC2097nW) interfaceC1171Vv;
            InterfaceC1171Vv interfaceC1171Vv2 = abstractC2097nW.f6471S;
            try {
                obj = abstractC2097nW.mo50V(obj);
                if (obj == EnumC0464Im.f1557S) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C1019T6(th);
            }
            abstractC2097nW.mo1387S();
            if (interfaceC1171Vv2 instanceof AbstractC2097nW) {
                interfaceC1171Vv = interfaceC1171Vv2;
            } else {
                interfaceC1171Vv2.mo320u(obj);
                return;
            }
        }
    }

    @Override // p000a.InterfaceC2683yf
    /* renamed from: v */
    public InterfaceC2683yf mo2966v() {
        InterfaceC1171Vv interfaceC1171Vv = this.f6471S;
        if (interfaceC1171Vv instanceof InterfaceC2683yf) {
            return (InterfaceC2683yf) interfaceC1171Vv;
        }
        return null;
    }
}
