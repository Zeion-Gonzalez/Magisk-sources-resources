package p000a;

import androidx.databinding.AbstractC2760z;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: a.HA */
/* loaded from: classes.dex */
public final class C0376HA extends WeakReference {

    /* renamed from: h */
    public final int f1289h;

    /* renamed from: v */
    public Object f1290v;

    /* renamed from: z */
    public final InterfaceC2369sa f1291z;

    public C0376HA(AbstractC2760z abstractC2760z, int i, InterfaceC2369sa interfaceC2369sa, ReferenceQueue referenceQueue) {
        super(abstractC2760z, referenceQueue);
        this.f1289h = i;
        this.f1291z = interfaceC2369sa;
    }

    /* renamed from: h */
    public final boolean m866h() {
        boolean z;
        Object obj = this.f1290v;
        if (obj != null) {
            this.f1291z.mo2265S(obj);
            z = true;
        } else {
            z = false;
        }
        this.f1290v = null;
        return z;
    }

    /* renamed from: z */
    public final void m867z(InterfaceC1546d7 interfaceC1546d7) {
        this.f1291z.mo2264M(interfaceC1546d7);
    }
}
