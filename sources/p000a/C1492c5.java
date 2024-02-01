package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.c5 */
/* loaded from: classes.dex */
public final class C1492c5 extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ C2744zq f4630k;

    /* renamed from: q */
    public int f4631q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492c5(C2744zq c2744zq, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4630k = c2744zq;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1492c5(this.f4630k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4631q;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC1292YB.m2664UZ(obj);
                    return C0329GJ.f1115z;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1292YB.m2664UZ(obj);
        } else {
            AbstractC1292YB.m2664UZ(obj);
            this.f4631q = 1;
            obj = AbstractC0438II.m1021ZH(AbstractC0037Al.f178h, new C1970l3(null), this);
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0374H8((C1195WL) it.next()));
        }
        C1517cb c1517cb = this.f4630k.f8604y;
        this.f4631q = 2;
        if (c1517cb.m2943G(arrayList, this) == enumC0464Im) {
            return enumC0464Im;
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1492c5) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
