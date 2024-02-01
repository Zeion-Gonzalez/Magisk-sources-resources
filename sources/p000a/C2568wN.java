package p000a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.wN */
/* loaded from: classes.dex */
public final class C2568wN extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public int f7847q;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2568wN(interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f7847q;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            PackageManager packageManager = AbstractC1743gn.m3275z().getPackageManager();
            List list = ((C0876QR) AbstractC0017AI.m44z("magisk --denylist ls").mo781dx()).f2986z;
            if (list == null) {
                list = Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1242XB((String) it.next()));
            }
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(8192);
            InterfaceC1634ej m3432Y = AbstractC1843ih.m3432Y(new C2163on(AbstractC1843ih.m3432Y(new C2163on(new C1807i2(installedApplications), 0), new C2164oo(null, packageManager, arrayList)), i2), new C0450IY(null));
            ArrayList arrayList2 = new ArrayList(installedApplications.size());
            this.f7847q = 1;
            obj = AbstractC1843ih.m3419O4(m3432Y, arrayList2, this);
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        ArrayList arrayList3 = (ArrayList) obj;
        if (arrayList3.size() > 1) {
            Collections.sort(arrayList3);
        }
        return arrayList3;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) obj;
        return new C2568wN((InterfaceC1171Vv) obj2).mo50V(C0329GJ.f1115z);
    }
}
