package p000a;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* renamed from: a.zK */
/* loaded from: classes.dex */
public abstract class AbstractC2719zK {

    /* renamed from: h */
    public boolean f8554h;

    /* renamed from: z */
    public C0904R3 f8555z;

    /* renamed from: G */
    public boolean mo634G() {
        return true;
    }

    /* renamed from: N */
    public void mo3748N(C0904R3 c0904r3) {
        this.f8555z = c0904r3;
        this.f8554h = true;
    }

    /* renamed from: P */
    public void mo2294P(List list, C0815PB c0815pb) {
        C0923RN c0923rn = new C0923RN(new C2211pf(new C1831iT(new C1228Wy(1, list), new C0903R2(0, this, c0815pb, null), 2), false, C0741Nu.f2537i));
        while (c0923rn.hasNext()) {
            m4654h().m2059u((C1553dE) c0923rn.next());
        }
    }

    /* renamed from: Q */
    public void mo3749Q(C1553dE c1553dE) {
        C1420ag c1420ag = c1553dE.f4790R;
        if (!(c1420ag instanceof C1420ag)) {
            c1420ag = null;
        }
        if (c1420ag == null) {
            return;
        }
        mo635v(c1420ag, null, AbstractC1843ih.m3401D(C1980lF.f6124H));
        m4654h().m2060v(c1553dE);
    }

    /* renamed from: W */
    public void mo3751W(C1553dE c1553dE, boolean z) {
        List list = (List) m4654h().f3091N.getValue();
        if (list.contains(c1553dE)) {
            ListIterator listIterator = list.listIterator(list.size());
            C1553dE c1553dE2 = null;
            while (mo634G()) {
                c1553dE2 = (C1553dE) listIterator.previous();
                if (AbstractC1292YB.m2695u(c1553dE2, c1553dE)) {
                    break;
                }
            }
            if (c1553dE2 != null) {
                m4654h().m2055P(c1553dE2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + c1553dE + " which does not exist in back stack " + list).toString());
    }

    /* renamed from: h */
    public final C0904R3 m4654h() {
        C0904R3 c0904r3 = this.f8555z;
        if (c0904r3 != null) {
            return c0904r3;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* renamed from: o */
    public Bundle mo3752o() {
        return null;
    }

    /* renamed from: u */
    public void mo3753u(Bundle bundle) {
    }

    /* renamed from: v */
    public C1420ag mo635v(C1420ag c1420ag, Bundle bundle, C0815PB c0815pb) {
        return c1420ag;
    }

    /* renamed from: z */
    public abstract C1420ag mo636z();
}
