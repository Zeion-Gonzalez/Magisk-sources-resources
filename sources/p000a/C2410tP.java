package p000a;

import com.topjohnwu.magisk.R;
import java.util.List;

/* renamed from: a.tP */
/* loaded from: classes.dex */
public final class C2410tP extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: U */
    public final /* synthetic */ List f7366U;

    /* renamed from: g */
    public final /* synthetic */ boolean f7367g;

    /* renamed from: k */
    public int f7368k;

    /* renamed from: q */
    public int f7369q;

    /* renamed from: s */
    public final /* synthetic */ C1353ZK f7370s;

    /* renamed from: y */
    public final /* synthetic */ C1608eG f7371y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2410tP(boolean z, C1608eG c1608eG, C1353ZK c1353zk, List list, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f7367g = z;
        this.f7371y = c1608eG;
        this.f7370s = c1353zk;
        this.f7366U = list;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2410tP(this.f7367g, this.f7371y, this.f7370s, this.f7366U, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        int i;
        int i2;
        int i3;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i4 = this.f7368k;
        C1353ZK c1353zk = this.f7370s;
        C1608eG c1608eG = this.f7371y;
        if (i4 != 0) {
            if (i4 == 1) {
                i3 = this.f7369q;
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            boolean z = this.f7367g;
            if (z) {
                i = R.string.su_snack_grant;
            } else {
                i = R.string.su_snack_deny;
            }
            C2531vd c2531vd = c1608eG.f4931w;
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            c2531vd.f7749h = i2;
            C0468Ir c0468Ir = c1353zk.f4256g;
            this.f7369q = i;
            this.f7368k = 1;
            c0468Ir.getClass();
            if (C0468Ir.m1130Lq(c2531vd, this) == enumC0464Im) {
                return enumC0464Im;
            }
            i3 = i;
        }
        for (C1608eG c1608eG2 : this.f7366U) {
            c1608eG2.getClass();
            AbstractC0795Op.m1801B(c1608eG2, 9);
        }
        c1353zk.m4500S(new C0805P0(AbstractC1292YB.m2687o(i3, c1608eG.f4928g)));
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2410tP) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
