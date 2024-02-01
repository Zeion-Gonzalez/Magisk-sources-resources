package p000a;

import androidx.databinding.AbstractC2760z;
import androidx.lifecycle.AbstractC2764h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: a.UU */
/* loaded from: classes.dex */
public final class C1092UU implements InterfaceC0217E7, InterfaceC2369sa {

    /* renamed from: R */
    public WeakReference f3566R = null;

    /* renamed from: S */
    public final C0376HA f3567S;

    public C1092UU(AbstractC2760z abstractC2760z, int i, ReferenceQueue referenceQueue) {
        this.f3567S = new C0376HA(abstractC2760z, i, this, referenceQueue);
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: M */
    public final void mo2264M(InterfaceC1546d7 interfaceC1546d7) {
        InterfaceC1546d7 interfaceC1546d72;
        WeakReference weakReference = this.f3566R;
        if (weakReference == null) {
            interfaceC1546d72 = null;
        } else {
            interfaceC1546d72 = (InterfaceC1546d7) weakReference.get();
        }
        AbstractC2764h abstractC2764h = (AbstractC2764h) this.f3567S.f1290v;
        if (abstractC2764h != null) {
            if (interfaceC1546d72 != null) {
                abstractC2764h.m4846W(this);
            }
            if (interfaceC1546d7 != null) {
                abstractC2764h.m4843N(interfaceC1546d7, this);
            }
        }
        if (interfaceC1546d7 != null) {
            this.f3566R = new WeakReference(interfaceC1546d7);
        }
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: S */
    public final void mo2265S(Object obj) {
        ((AbstractC2764h) obj).m4846W(this);
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: v */
    public final void mo2266v(Object obj) {
        InterfaceC1546d7 interfaceC1546d7;
        AbstractC2764h abstractC2764h = (AbstractC2764h) obj;
        WeakReference weakReference = this.f3566R;
        if (weakReference == null) {
            interfaceC1546d7 = null;
        } else {
            interfaceC1546d7 = (InterfaceC1546d7) weakReference.get();
        }
        if (interfaceC1546d7 != null) {
            abstractC2764h.m4843N(interfaceC1546d7, this);
        }
    }

    @Override // p000a.InterfaceC0217E7
    /* renamed from: z */
    public final void mo421z(Object obj) {
        C0376HA c0376ha = this.f3567S;
        AbstractC2760z abstractC2760z = (AbstractC2760z) c0376ha.get();
        if (abstractC2760z == null) {
            c0376ha.m866h();
        }
        if (abstractC2760z != null) {
            Object obj2 = c0376ha.f1290v;
            if (!abstractC2760z.f8976J && abstractC2760z.mo16R(c0376ha.f1289h, 0, obj2)) {
                abstractC2760z.m4816I();
            }
        }
    }
}
