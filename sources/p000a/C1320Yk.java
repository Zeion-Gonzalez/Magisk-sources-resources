package p000a;

import android.app.Activity;
import android.content.Intent;
import java.io.File;
import java.io.IOException;

/* renamed from: a.Yk */
/* loaded from: classes.dex */
public final class C1320Yk extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ File f4191g;

    /* renamed from: k */
    public final /* synthetic */ Activity f4192k;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2442u f4193q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1320Yk(InterfaceC2442u interfaceC2442u, Activity activity, File file, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4193q = interfaceC2442u;
        this.f4192k = activity;
        this.f4191g = file;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1320Yk(this.f4193q, this.f4192k, this.f4191g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        C0329GJ c0329gj;
        Activity activity = this.f4192k;
        InterfaceC2442u interfaceC2442u = this.f4193q;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        try {
            ((C0858Q) interfaceC2442u).m1993z(activity, this.f4191g);
            Intent m1992v = ((C0858Q) interfaceC2442u).m1992v();
            if (m1992v != null) {
                activity.startActivity(m1992v);
                c0329gj = C0329GJ.f1115z;
            } else {
                c0329gj = null;
            }
            if (c0329gj == null) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        } catch (IOException e) {
            AbstractC1530cs.f4727z.mo1160v(e);
            return Boolean.FALSE;
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1320Yk) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
