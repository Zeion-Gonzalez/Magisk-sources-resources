package p000a;

import com.topjohnwu.magisk.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.MS */
/* loaded from: classes.dex */
public final class C0658MS extends AbstractC1881jR {

    /* renamed from: g */
    public static final List f2113g;

    /* renamed from: y */
    public static int f2116y;

    /* renamed from: I */
    public static final C0658MS f2112I = new C0658MS();

    /* renamed from: q */
    public static final C0639M1 f2115q = new C0639M1(R.string.request_timeout);

    /* renamed from: k */
    public static final int f2114k = R.array.request_timeout;

    static {
        boolean z;
        List m2661T = AbstractC1292YB.m2661T(10, 15, 20, 30, 45, 60);
        f2113g = m2661T;
        Iterator it = m2661T.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                C1212We c1212We = C1212We.f3969z;
                c1212We.getClass();
                if (intValue == ((Number) C1212We.f3941G.m2368h(c1212We, C1212We.f3959h[4])).intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        f2116y = i;
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: R */
    public final AbstractC2222pt mo30R() {
        return f2115q;
    }

    @Override // p000a.AbstractC1881jR
    /* renamed from: r */
    public final int mo1461r() {
        return f2114k;
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: s */
    public final void mo235s(Object obj) {
        int intValue = ((Number) obj).intValue();
        f2116y = intValue;
        C1212We c1212We = C1212We.f3969z;
        int intValue2 = ((Number) f2113g.get(intValue)).intValue();
        c1212We.getClass();
        C1212We.f3941G.mo2367P(c1212We, C1212We.f3959h[4], Integer.valueOf(intValue2));
    }

    @Override // p000a.AbstractC0928RS
    /* renamed from: y */
    public final Object mo236y() {
        return Integer.valueOf(f2116y);
    }
}
