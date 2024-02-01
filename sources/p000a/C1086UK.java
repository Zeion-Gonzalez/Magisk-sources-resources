package p000a;

import android.content.SharedPreferences;

/* renamed from: a.UK */
/* loaded from: classes.dex */
public final class C1086UK implements InterfaceC2491ux, InterfaceC1428ao {

    /* renamed from: S */
    public static final C1086UK f3556S = new C1086UK();

    /* renamed from: R */
    public static final C1086UK f3555R = new C1086UK();

    @Override // p000a.InterfaceC1428ao
    /* renamed from: N */
    public AbstractC1952kk mo1121N(Class cls, C0945Rm c0945Rm) {
        return mo1123z(cls);
    }

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public Object mo329P(Object obj) {
        AbstractC1449bB abstractC1449bB = (AbstractC1449bB) obj;
        try {
            C2361sQ c2361sQ = new C2361sQ();
            abstractC1449bB.mo1577G().mo1618I(c2361sQ);
            return new C0679Mq(abstractC1449bB.mo1578h(), abstractC1449bB.mo1579z(), c2361sQ);
        } finally {
            abstractC1449bB.close();
        }
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: z */
    public AbstractC1952kk mo1123z(Class cls) {
        if (AbstractC1292YB.m2695u(cls, C0471Iu.class)) {
            return new C0471Iu(AbstractC1743gn.m3274v());
        }
        if (AbstractC1292YB.m2695u(cls, C1688fk.class)) {
            return new C1688fk((C1835iY) AbstractC1743gn.f5498o.getValue());
        }
        if (AbstractC1292YB.m2695u(cls, C1353ZK.class)) {
            return new C1353ZK(AbstractC1743gn.f5493P);
        }
        if (AbstractC1292YB.m2695u(cls, C1650f1.class)) {
            return new C1650f1(AbstractC1743gn.m3274v(), (C2594ws) AbstractC1743gn.f5491M.getValue());
        }
        if (AbstractC1292YB.m2695u(cls, C1885jV.class)) {
            return new C1885jV(AbstractC1743gn.f5493P, (SharedPreferences) AbstractC1743gn.f5500v.getValue());
        }
        return (AbstractC1952kk) cls.newInstance();
    }
}
