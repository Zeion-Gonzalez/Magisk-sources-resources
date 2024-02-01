package p000a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.qf */
/* loaded from: classes.dex */
public final class C2266qf extends AbstractC0710NO implements InterfaceC2683yf, InterfaceC1171Vv {

    /* renamed from: y */
    public static final AtomicReferenceFieldUpdater f6966y = AtomicReferenceFieldUpdater.newUpdater(C2266qf.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: I */
    public final AbstractC1859j1 f6967I;
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: g */
    public final Object f6968g;

    /* renamed from: k */
    public Object f6969k;

    /* renamed from: q */
    public final InterfaceC1171Vv f6970q;

    public C2266qf(AbstractC1859j1 abstractC1859j1, AbstractC0620Lf abstractC0620Lf) {
        super(-1);
        this.f6967I = abstractC1859j1;
        this.f6970q = abstractC0620Lf;
        this.f6969k = AbstractC2575wW.f7890s;
        this.f6968g = mo315N().mo106x(0, C0582Ku.f1893s);
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: G */
    public final Object mo1642G() {
        Object obj = this.f6969k;
        this.f6969k = AbstractC2575wW.f7890s;
        return obj;
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: N */
    public final InterfaceC1255XS mo315N() {
        return this.f6970q.mo315N();
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: P */
    public final InterfaceC1171Vv mo1643P() {
        return this;
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: h */
    public final void mo1646h(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0372H6) {
            ((C0372H6) obj).f1274h.mo85W(cancellationException);
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f6967I + ", " + AbstractC2575wW.m4425d2(this.f6970q) + ']';
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: u */
    public final void mo320u(Object obj) {
        Object c1663fI;
        boolean z;
        InterfaceC1171Vv interfaceC1171Vv = this.f6970q;
        InterfaceC1255XS mo315N = interfaceC1171Vv.mo315N();
        Throwable m4677z = AbstractC2740zk.m4677z(obj);
        if (m4677z == null) {
            c1663fI = obj;
        } else {
            c1663fI = new C1663fI(m4677z, false);
        }
        AbstractC1859j1 abstractC1859j1 = this.f6967I;
        if (abstractC1859j1.mo3030U8()) {
            this.f6969k = c1663fI;
            this.f2384w = 0;
            abstractC1859j1.mo195C(mo315N, this);
            return;
        }
        AbstractC2738zi m2311z = AbstractC1129V8.m2311z();
        if (m2311z.f8589w >= 4294967296L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6969k = c1663fI;
            this.f2384w = 0;
            C1200WR c1200wr = m2311z.f8588q;
            if (c1200wr == null) {
                c1200wr = new C1200WR();
                m2311z.f8588q = c1200wr;
            }
            c1200wr.m2478N(this);
            return;
        }
        m2311z.m4672dx(true);
        try {
            InterfaceC1255XS mo315N2 = mo315N();
            Object m2663U8 = AbstractC1292YB.m2663U8(mo315N2, this.f6968g);
            try {
                interfaceC1171Vv.mo320u(obj);
                do {
                } while (m2311z.m4671Lq());
            } finally {
                AbstractC1292YB.m2682m(mo315N2, m2663U8);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p000a.InterfaceC2683yf
    /* renamed from: v */
    public final InterfaceC2683yf mo2966v() {
        InterfaceC1171Vv interfaceC1171Vv = this.f6970q;
        if (interfaceC1171Vv instanceof InterfaceC2683yf) {
            return (InterfaceC2683yf) interfaceC1171Vv;
        }
        return null;
    }
}
