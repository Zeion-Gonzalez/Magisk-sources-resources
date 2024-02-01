package p000a;

import android.content.ActivityNotFoundException;
import com.topjohnwu.magisk.R;

/* renamed from: a.So */
/* loaded from: classes.dex */
public final class C1003So extends AbstractC0231EP implements InterfaceC2030mD {

    /* renamed from: h */
    public final String f3367h;

    /* renamed from: v */
    public final Object f3368v;

    /* renamed from: z */
    public final /* synthetic */ int f3369z = 1;

    public C1003So(String str, InterfaceC2711zB interfaceC2711zB) {
        this.f3367h = str;
        this.f3368v = interfaceC2711zB;
    }

    @Override // p000a.InterfaceC2030mD
    /* renamed from: h */
    public final void mo557h(AbstractActivityC0819PG abstractActivityC0819PG) {
        int i = this.f3369z;
        Object obj = this.f3368v;
        String str = this.f3367h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                InterfaceC2711zB interfaceC2711zB = (InterfaceC2711zB) obj;
                abstractActivityC0819PG.f1361t = interfaceC2711zB;
                try {
                    abstractActivityC0819PG.f1354B.m3957O4(str);
                    interfaceC2711zB.mo2260v();
                    return;
                } catch (ActivityNotFoundException unused) {
                    AbstractC0795Op.m1871tJ(abstractActivityC0819PG, R.string.app_not_found, 0);
                    return;
                }
            default:
                abstractActivityC0819PG.m899q(str, (InterfaceC2364sT) obj);
                return;
        }
    }

    public C1003So(String str, InterfaceC2364sT interfaceC2364sT) {
        this.f3367h = str;
        this.f3368v = interfaceC2364sT;
    }
}
