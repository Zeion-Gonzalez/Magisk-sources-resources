package p000a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: a.NZ */
/* loaded from: classes.dex */
public final class C0721NZ extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ Object f2421g;

    /* renamed from: k */
    public /* synthetic */ Object f2422k;

    /* renamed from: q */
    public int f2423q;

    /* renamed from: s */
    public final /* synthetic */ List f2424s;

    /* renamed from: y */
    public final /* synthetic */ PackageManager f2425y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721NZ(Object obj, InterfaceC1171Vv interfaceC1171Vv, PackageManager packageManager, List list) {
        super(interfaceC1171Vv);
        this.f2421g = obj;
        this.f2425y = packageManager;
        this.f2424s = list;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C0721NZ c0721nz = new C0721NZ(this.f2421g, interfaceC1171Vv, this.f2425y, this.f2424s);
        c0721nz.f2422k = obj;
        return c0721nz;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f2423q;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            InterfaceC2445u2 interfaceC2445u2 = (InterfaceC2445u2) this.f2422k;
            C0826PP c0826pp = new C0826PP((ApplicationInfo) this.f2421g, this.f2425y, this.f2424s);
            this.f2423q = 1;
            if (interfaceC2445u2.mo237h(c0826pp, this) == enumC0464Im) {
                return enumC0464Im;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1292YB.m2664UZ(obj);
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0721NZ) mo49G((InterfaceC2445u2) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
