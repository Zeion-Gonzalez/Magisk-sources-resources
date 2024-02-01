package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.CG */
/* loaded from: classes.dex */
public final class C0117CG extends AbstractC0399Ha {

    /* renamed from: z */
    public static final AtomicReferenceFieldUpdater f415z = AtomicReferenceFieldUpdater.newUpdater(C0117CG.class, Object.class, "_state");
    private volatile Object _state;

    @Override // p000a.AbstractC0399Ha
    /* renamed from: h */
    public final InterfaceC1171Vv[] mo243h(AbstractC0629Lq abstractC0629Lq) {
        C1277Xw c1277Xw = (C1277Xw) abstractC0629Lq;
        f415z.set(this, null);
        return AbstractC1292YB.f4136P;
    }

    @Override // p000a.AbstractC0399Ha
    /* renamed from: z */
    public final boolean mo244z(AbstractC0629Lq abstractC0629Lq) {
        C1277Xw c1277Xw = (C1277Xw) abstractC0629Lq;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f415z;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1292YB.f4134M);
        return true;
    }
}
