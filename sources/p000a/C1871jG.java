package p000a;

import android.util.Log;
import java.util.Iterator;

/* renamed from: a.jG */
/* loaded from: classes.dex */
public final /* synthetic */ class C1871jG implements InterfaceC1270Xo {

    /* renamed from: R */
    public final /* synthetic */ Object f5843R;

    /* renamed from: S */
    public final /* synthetic */ int f5844S;

    public /* synthetic */ C1871jG(int i, Object obj) {
        this.f5844S = i;
        this.f5843R = obj;
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        boolean z;
        int i = this.f5844S;
        Object obj = this.f5843R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC2499v4 abstractC2499v4 = (AbstractC2499v4) obj;
                abstractC2499v4.f7658q = enumC2241qF.m3881z();
                if (abstractC2499v4.f7662v != null) {
                    Iterator<E> it = abstractC2499v4.f7661u.iterator();
                    while (it.hasNext()) {
                        C1553dE c1553dE = (C1553dE) it.next();
                        c1553dE.getClass();
                        c1553dE.f4789I = enumC2241qF.m3881z();
                        c1553dE.m3021N();
                    }
                    return;
                }
                return;
            case 1:
                C2129oA c2129oA = (C2129oA) obj;
                if (enumC2241qF == EnumC2241qF.ON_DESTROY) {
                    AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = (AbstractComponentCallbacksC2342s3) interfaceC1546d7;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) c2129oA.m4654h().f3093Q.getValue()) {
                        if (AbstractC1292YB.m2695u(((C1553dE) obj3).f4794k, abstractComponentCallbacksC2342s3.f7192L)) {
                            obj2 = obj3;
                        }
                    }
                    C1553dE c1553dE2 = (C1553dE) obj2;
                    if (c1553dE2 != null) {
                        if (C0364Gx.m791p(2)) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + c1553dE2 + " due to fragment " + interfaceC1546d7 + " lifecycle reaching DESTROYED");
                        }
                        c2129oA.m4654h().m2057h(c1553dE2);
                        return;
                    }
                    return;
                }
                return;
            default:
                C1934kN c1934kN = (C1934kN) obj;
                if (enumC2241qF == EnumC2241qF.ON_START) {
                    z = true;
                } else if (enumC2241qF == EnumC2241qF.ON_STOP) {
                    z = false;
                } else {
                    return;
                }
                c1934kN.f6000Q = z;
                return;
        }
    }
}
