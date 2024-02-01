package p000a;

import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: a.oo */
/* loaded from: classes.dex */
public final class C2164oo extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ List f6635g;

    /* renamed from: k */
    public final /* synthetic */ PackageManager f6636k;

    /* renamed from: q */
    public /* synthetic */ Object f6637q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2164oo(InterfaceC1171Vv interfaceC1171Vv, PackageManager packageManager, List list) {
        super(interfaceC1171Vv);
        this.f6636k = packageManager;
        this.f6635g = list;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C2164oo c2164oo = new C2164oo(interfaceC1171Vv, this.f6636k, this.f6635g);
        c2164oo.f6637q = obj;
        return c2164oo;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        return new C1807i2(new C0721NZ(this.f6637q, null, this.f6636k, this.f6635g));
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2164oo) mo49G(obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
