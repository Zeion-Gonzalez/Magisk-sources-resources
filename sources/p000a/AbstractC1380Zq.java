package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Zq */
/* loaded from: classes.dex */
public abstract class AbstractC1380Zq extends C1215Wh implements InterfaceC1279Xy, InterfaceC0732Nl, InterfaceC2364sT {

    /* renamed from: I */
    public C0757O9 f4312I;

    /* renamed from: I */
    public final C0757O9 m2778I() {
        C0757O9 c0757o9 = this.f4312I;
        if (c0757o9 != null) {
            return c0757o9;
        }
        return null;
    }

    public InterfaceC1265Xh getParent() {
        return m2778I();
    }

    @Override // p000a.InterfaceC0732Nl
    /* renamed from: h */
    public final boolean mo758h() {
        return true;
    }

    /* renamed from: q */
    public abstract void mo364q(Throwable th);

    @Override // p000a.C1215Wh
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2575wW.m4418Y(this) + "[job@" + AbstractC2575wW.m4418Y(m2778I()) + ']';
    }

    @Override // p000a.InterfaceC0732Nl
    /* renamed from: u */
    public final C2570wR mo759u() {
        return null;
    }

    @Override // p000a.InterfaceC1279Xy
    /* renamed from: v */
    public final void mo1430v() {
        boolean z;
        C1215Wh c1215Wh;
        boolean z2;
        C0757O9 m2778I = m2778I();
        do {
            Object m1743Y = m2778I.m1743Y();
            z = false;
            if (m1743Y instanceof AbstractC1380Zq) {
                if (m1743Y == this) {
                    C0348Ge c0348Ge = AbstractC0438II.f1460f;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0757O9.f2571S;
                        if (atomicReferenceFieldUpdater.compareAndSet(m2778I, m1743Y, c0348Ge)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(m2778I) != m1743Y) {
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else {
                if (!(m1743Y instanceof InterfaceC0732Nl) || ((InterfaceC0732Nl) m1743Y).mo759u() == null) {
                    return;
                }
                do {
                    Object m2507V = m2507V();
                    if (m2507V instanceof C0273FC) {
                        C1215Wh c1215Wh2 = ((C0273FC) m2507V).f955z;
                        return;
                    }
                    if (m2507V == this) {
                        C1215Wh c1215Wh3 = (C1215Wh) m2507V;
                        return;
                    }
                    c1215Wh = (C1215Wh) m2507V;
                    c1215Wh.getClass();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1215Wh.f3979w;
                    C0273FC c0273fc = (C0273FC) atomicReferenceFieldUpdater2.get(c1215Wh);
                    if (c0273fc == null) {
                        c0273fc = new C0273FC(c1215Wh);
                        atomicReferenceFieldUpdater2.lazySet(c1215Wh, c0273fc);
                    }
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C1215Wh.f3978S;
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, m2507V, c0273fc)) {
                            z2 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != m2507V) {
                            z2 = false;
                            break;
                        }
                    }
                } while (!z2);
                c1215Wh.m2503G();
                return;
            }
        } while (!z);
    }
}
