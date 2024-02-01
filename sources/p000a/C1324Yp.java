package p000a;

import java.util.ArrayList;

/* renamed from: a.Yp */
/* loaded from: classes.dex */
public final class C1324Yp extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1353ZK f4197g;

    /* renamed from: k */
    public int f4198k;

    /* renamed from: q */
    public ArrayList f4199q;

    /* renamed from: y */
    public final /* synthetic */ C1608eG f4200y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324Yp(C1353ZK c1353zk, C1608eG c1608eG, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4197g = c1353zk;
        this.f4200y = c1608eG;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1324Yp(this.f4197g, this.f4200y, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        ArrayList arrayList;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4198k;
        C1608eG c1608eG = this.f4200y;
        C1353ZK c1353zk = this.f4197g;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    arrayList = this.f4199q;
                    AbstractC1292YB.m2664UZ(obj);
                    if (arrayList.isEmpty() && c1353zk.f4258s.isEmpty()) {
                        c1353zk.f4258s.add(c1353zk.f4259y);
                    }
                    return C0329GJ.f1115z;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1292YB.m2664UZ(obj);
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C0468Ir c0468Ir = c1353zk.f4256g;
            int i2 = c1608eG.f4931w.f7751z;
            this.f4198k = 1;
            c0468Ir.getClass();
            if (C0468Ir.m1131dx(i2, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        ArrayList arrayList2 = new ArrayList(c1353zk.f4254U);
        AbstractC2708z8.m4635BX(arrayList2, new C2670yQ(11, c1608eG));
        C1517cb c1517cb = c1353zk.f4254U;
        this.f4199q = arrayList2;
        this.f4198k = 2;
        if (c1517cb.m2943G(arrayList2, this) == enumC0464Im) {
            return enumC0464Im;
        }
        arrayList = arrayList2;
        if (arrayList.isEmpty()) {
            c1353zk.f4258s.add(c1353zk.f4259y);
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1324Yp) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
