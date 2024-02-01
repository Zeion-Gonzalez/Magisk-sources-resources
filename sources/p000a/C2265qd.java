package p000a;

import com.topjohnwu.magisk.R;
import java.util.Iterator;

/* renamed from: a.qd */
/* loaded from: classes.dex */
public final class C2265qd extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1608eG f6963g;

    /* renamed from: k */
    public final /* synthetic */ C1353ZK f6964k;

    /* renamed from: q */
    public int f6965q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265qd(C1353ZK c1353zk, C1608eG c1608eG, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6964k = c1353zk;
        this.f6963g = c1608eG;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2265qd(this.f6964k, this.f6963g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        int i;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i2 = this.f6965q;
        C1608eG c1608eG = this.f6963g;
        C1353ZK c1353zk = this.f6964k;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C0468Ir c0468Ir = c1353zk.f4256g;
            C2531vd c2531vd = c1608eG.f4931w;
            this.f6965q = 1;
            c0468Ir.getClass();
            if (C0468Ir.m1130Lq(c2531vd, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        if (c1608eG.f4931w.f7747N) {
            i = R.string.su_snack_notif_on;
        } else {
            i = R.string.su_snack_notif_off;
        }
        Iterator it = c1353zk.f4254U.iterator();
        while (it.hasNext()) {
            C1608eG c1608eG2 = (C1608eG) it.next();
            if (c1608eG2.f4931w.f7751z == c1608eG.f4931w.f7751z) {
                AbstractC0795Op.m1801B(c1608eG2, 33);
            }
        }
        c1353zk.m4500S(new C0805P0(AbstractC1292YB.m2687o(i, c1608eG.f4928g)));
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2265qd) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
