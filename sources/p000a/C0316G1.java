package p000a;

import android.util.SparseArray;
import android.view.View;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;

/* renamed from: a.G1 */
/* loaded from: classes.dex */
public final class C0316G1 extends AbstractC2615xD {

    /* renamed from: g */
    public final SparseArray f1077g;

    /* renamed from: k */
    public final ArrayList f1078k;

    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0316G1() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0316G1.<init>():void");
    }

    /* renamed from: I */
    public final void m692I(View view, AbstractC0928RS abstractC0928RS) {
        boolean z;
        InterfaceC1725gU m4424d;
        InterfaceC0559KW c0393hs;
        if (AbstractC1292YB.m2695u(abstractC0928RS, C2557wB.f7809I)) {
            C1985lK c1985lK = C1985lK.f6153I;
            c1985lK.mo2844k();
            if (c1985lK.f6780R) {
                C1212We c1212We = C1212We.f3969z;
                c1212We.getClass();
                if (AbstractC1269Xn.m2579T0(C1212We.f3964s.m2853O4(c1212We, C1212We.f3959h[16]))) {
                    c1985lK.mo1575I(view, this);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC0928RS instanceof C2360sP) {
            m4424d = AbstractC2575wW.m4424d(this);
            c0393hs = new C1243XC(view, abstractC0928RS, null);
        } else if (AbstractC1292YB.m2695u(abstractC0928RS, C1382Zs.f4317w)) {
            m4424d = AbstractC2575wW.m4424d(this);
            c0393hs = new C0393HS(view, null);
        } else {
            if (AbstractC1292YB.m2695u(abstractC0928RS, C0599LD.f1922I)) {
                C1212We c1212We2 = C1212We.f3969z;
                c1212We2.getClass();
                if (Boolean.valueOf(C1212We.f3944J.m2370z(c1212We2, C1212We.f3959h[22]).booleanValue()).booleanValue() != C1910jw.f5961W) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m4500S(new C0805P0((int) R.string.reboot_apply_change));
                    return;
                }
                return;
            }
            return;
        }
        AbstractC0438II.m994F(m4424d, null, c0393hs, 3);
    }

    /* renamed from: q */
    public final void m693q(AbstractC2207pZ abstractC2207pZ, InterfaceC1459bP interfaceC1459bP) {
        boolean m2695u;
        AbstractC0231EP c2128o9;
        C1832iU c1832iU;
        String str;
        C0466Io c0466Io;
        if (AbstractC1292YB.m2695u(abstractC2207pZ, C1676fV.f5244I)) {
            c1832iU = new C1832iU(this, interfaceC1459bP, 0);
            str = "android.permission.WRITE_EXTERNAL_STORAGE";
        } else if (AbstractC1292YB.m2695u(abstractC2207pZ, C0854Pw.f2889I)) {
            c1832iU = new C1832iU(this, interfaceC1459bP, 2);
            str = "android.permission.POST_NOTIFICATIONS";
        } else {
            if (AbstractC1292YB.m2695u(abstractC2207pZ, C1416ab.f4434I)) {
                c2128o9 = new C0259Ey(interfaceC1459bP);
            } else {
                if (AbstractC1292YB.m2695u(abstractC2207pZ, C0482J4.f1598w)) {
                    c0466Io = new C0466Io(R.id.action_settingsFragment_to_themeFragment);
                } else if (AbstractC1292YB.m2695u(abstractC2207pZ, C1855iy.f5788w)) {
                    c0466Io = new C0466Io(R.id.action_settingsFragment_to_denyFragment);
                } else {
                    if (AbstractC1292YB.m2695u(abstractC2207pZ, C0813P9.f2763w)) {
                        AbstractC0017AI.m44z("add_hosts_module").m4631d2(new C1447b9(6));
                        return;
                    }
                    int i = 1;
                    if (AbstractC1292YB.m2695u(abstractC2207pZ, C2360sP.f7255I)) {
                        m2695u = true;
                    } else {
                        m2695u = AbstractC1292YB.m2695u(abstractC2207pZ, C1382Zs.f4317w);
                    }
                    if (m2695u) {
                        c1832iU = new C1832iU(this, interfaceC1459bP, i);
                        str = "android.permission.REQUEST_INSTALL_PACKAGES";
                    } else if (AbstractC1292YB.m2695u(abstractC2207pZ, C1169Vs.f3821w)) {
                        c2128o9 = new C2128o9();
                    } else {
                        interfaceC1459bP.mo93z();
                        return;
                    }
                }
                AbstractC2615xD.m4498W(this, c0466Io);
                return;
            }
            m4500S(c2128o9);
            return;
        }
        m4501w(str, c1832iU);
    }
}
