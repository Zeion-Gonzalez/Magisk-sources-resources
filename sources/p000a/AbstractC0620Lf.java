package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Lf */
/* loaded from: classes.dex */
public abstract class AbstractC0620Lf extends AbstractC2097nW {

    /* renamed from: R */
    public final InterfaceC1255XS f2025R;

    /* renamed from: w */
    public transient InterfaceC1171Vv f2026w;

    public AbstractC0620Lf(InterfaceC1171Vv interfaceC1171Vv) {
        this(interfaceC1171Vv, interfaceC1171Vv != null ? interfaceC1171Vv.mo315N() : null);
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: N */
    public InterfaceC1255XS mo315N() {
        return this.f2025R;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: S */
    public void mo1387S() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1525cm c1525cm;
        InterfaceC1171Vv interfaceC1171Vv = this.f2026w;
        if (interfaceC1171Vv != null && interfaceC1171Vv != this) {
            InterfaceC1255XS mo315N = mo315N();
            int i = InterfaceC2741zl.f8595W;
            ((AbstractC1859j1) ((InterfaceC2741zl) mo315N.mo107y(C1710g8.f5377R))).getClass();
            C2266qf c2266qf = (C2266qf) interfaceC1171Vv;
            do {
                atomicReferenceFieldUpdater = C2266qf.f6966y;
            } while (atomicReferenceFieldUpdater.get(c2266qf) == AbstractC2575wW.f7870U);
            Object obj = atomicReferenceFieldUpdater.get(c2266qf);
            if (obj instanceof C1525cm) {
                c1525cm = (C1525cm) obj;
            } else {
                c1525cm = null;
            }
            if (c1525cm != null) {
                c1525cm.m2967w();
            }
        }
        this.f2026w = C1793hj.f5645S;
    }

    public AbstractC0620Lf(InterfaceC1171Vv interfaceC1171Vv, InterfaceC1255XS interfaceC1255XS) {
        super(interfaceC1171Vv);
        this.f2025R = interfaceC1255XS;
    }
}
