package p000a;

import android.content.Intent;
import com.topjohnwu.magisk.p001ui.MainActivity;
import java.io.File;

/* renamed from: a.eo */
/* loaded from: classes.dex */
public final class C1639eo extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public final /* synthetic */ MainActivity f5099q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639eo(MainActivity mainActivity, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f5099q = mainActivity;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1639eo(this.f5099q, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        MainActivity mainActivity = this.f5099q;
        File file = new File(mainActivity.getApplicationInfo().sourceDir);
        CharSequence charSequence = mainActivity.getApplicationInfo().nonLocalizedLabel;
        String packageName = mainActivity.getPackageName();
        Intent intent = null;
        C0858Q m1014UZ = AbstractC0438II.m1014UZ(mainActivity, null, null, null);
        C0687N m1991h = m1014UZ.m1991h(mainActivity);
        try {
            boolean m3235r = C1710g8.m3235r(mainActivity, file, m1991h, packageName, charSequence);
            AbstractC1292YB.m2659R(m1991h, null);
            if (m3235r) {
                intent = m1014UZ.m1992v();
            }
            if (intent != null) {
                mainActivity.startActivity(intent);
            }
            return C0329GJ.f1115z;
        } finally {
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C1639eo c1639eo = (C1639eo) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c1639eo.mo50V(c0329gj);
        return c0329gj;
    }
}
