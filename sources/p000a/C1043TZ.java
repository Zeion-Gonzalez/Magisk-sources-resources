package p000a;

import java.util.LinkedHashMap;

/* renamed from: a.TZ */
/* loaded from: classes.dex */
public final class C1043TZ extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C2106ng f3446g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0806P1 f3447k;

    /* renamed from: q */
    public int f3448q;

    /* renamed from: y */
    public final /* synthetic */ int f3449y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043TZ(InterfaceC0806P1 interfaceC0806P1, C2106ng c2106ng, int i, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3447k = interfaceC0806P1;
        this.f3446g = c2106ng;
        this.f3449y = i;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1043TZ(this.f3447k, this.f3446g, this.f3449y, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f3448q;
        C0329GJ c0329gj = C0329GJ.f1115z;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ((C1212We) this.f3447k).getClass();
            C2119nz c2119nz = AbstractC1743gn.f5492N;
            String str = this.f3446g.f6504S;
            this.f3448q = 1;
            c2119nz.getClass();
            C0084Bc c0084Bc = new C0084Bc("key", str);
            C0084Bc[] c0084BcArr = {c0084Bc, new C0084Bc("value", new Integer(this.f3449y))};
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0438II.m990C(2));
            for (int i2 = 0; i2 < 2; i2++) {
                C0084Bc c0084Bc2 = c0084BcArr[i2];
                linkedHashMap.put(c0084Bc2.f329S, c0084Bc2.f328R);
            }
            Object m2675f = AbstractC1292YB.m2675f(AbstractC2441tz.m4200k("REPLACE INTO settings ", AbstractC1292YB.m2684n0(linkedHashMap)), new C0090Bj(null), this);
            if (m2675f != enumC0464Im) {
                m2675f = c0329gj;
            }
            if (m2675f == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return c0329gj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1043TZ) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
