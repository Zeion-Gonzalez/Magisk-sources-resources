package p000a;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: a.nx */
/* loaded from: classes.dex */
public final class C2118nx extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ long f6522g;

    /* renamed from: k */
    public final /* synthetic */ C0895Qs f6523k;

    /* renamed from: q */
    public int f6524q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2118nx(C0895Qs c0895Qs, long j, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6523k = c0895Qs;
        this.f6522g = j;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2118nx(this.f6523k, this.f6522g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        C0895Qs c0895Qs = this.f6523k;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f6524q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C2531vd c2531vd = null;
            try {
                File file = c0895Qs.f3081v;
                if (file == null) {
                    file = null;
                }
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
                try {
                    C2531vd c2531vd2 = c0895Qs.f3079P;
                    if (c2531vd2 == null) {
                        c2531vd2 = null;
                    }
                    dataOutputStream.writeInt(c2531vd2.f7749h);
                    dataOutputStream.flush();
                    AbstractC1292YB.m2659R(dataOutputStream, null);
                } finally {
                }
            } catch (IOException e) {
                AbstractC1530cs.f4727z.mo1160v(e);
            }
            if (this.f6522g >= 0) {
                C0468Ir c0468Ir = c0895Qs.f3080h;
                C2531vd c2531vd3 = c0895Qs.f3079P;
                if (c2531vd3 != null) {
                    c2531vd = c2531vd3;
                }
                this.f6524q = 1;
                c0468Ir.getClass();
                if (C0468Ir.m1130Lq(c2531vd, this) == enumC0464Im) {
                    return enumC0464Im;
                }
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2118nx) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
