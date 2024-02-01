package p000a;

import androidx.databinding.AbstractC2760z;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractList;

/* renamed from: a.mo */
/* loaded from: classes.dex */
public final class C2059mo extends AbstractC1193WJ implements InterfaceC2369sa {

    /* renamed from: R */
    public final Object f6400R;

    /* renamed from: S */
    public final /* synthetic */ int f6401S = 1;

    public C2059mo(C1694fs c1694fs) {
        this.f6400R = c1694fs;
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: M */
    public final void mo2264M(InterfaceC1546d7 interfaceC1546d7) {
    }

    @Override // p000a.AbstractC1193WJ
    /* renamed from: N */
    public final void mo2468N(InterfaceC0133Ca interfaceC0133Ca, int i, int i2, int i3) {
        switch (this.f6401S) {
            case AbstractC0795Op.f2698E /* 0 */:
                mo2472z(interfaceC0133Ca);
                return;
            default:
                C1694fs c1694fs = (C1694fs) this.f6400R;
                int m3195P = C1694fs.m3195P(c1694fs, interfaceC0133Ca, 0);
                int i4 = i + m3195P;
                int i5 = m3195P + i2;
                C0503JV c0503jv = c1694fs.f5307R;
                c0503jv.getClass();
                c0503jv.m1195M(c1694fs, 3, C0503JV.m1194W(i4, i5, i3));
                return;
        }
    }

    @Override // p000a.AbstractC1193WJ
    /* renamed from: P */
    public final void mo2469P(InterfaceC0133Ca interfaceC0133Ca, int i, int i2) {
        int i3;
        int unused;
        switch (this.f6401S) {
            case AbstractC0795Op.f2698E /* 0 */:
                mo2472z(interfaceC0133Ca);
                return;
            default:
                C1694fs c1694fs = (C1694fs) this.f6400R;
                i3 = ((AbstractList) c1694fs).modCount;
                ((AbstractList) c1694fs).modCount = i3 + 1;
                unused = ((AbstractList) c1694fs).modCount;
                int m3195P = C1694fs.m3195P(c1694fs, interfaceC0133Ca, i);
                C0503JV c0503jv = c1694fs.f5307R;
                c0503jv.getClass();
                c0503jv.m1195M(c1694fs, 2, C0503JV.m1194W(m3195P, 0, i2));
                return;
        }
    }

    @Override // p000a.AbstractC1193WJ
    /* renamed from: Q */
    public final void mo2470Q(InterfaceC0133Ca interfaceC0133Ca, int i, int i2) {
        int i3;
        int unused;
        switch (this.f6401S) {
            case AbstractC0795Op.f2698E /* 0 */:
                mo2472z(interfaceC0133Ca);
                return;
            default:
                C1694fs c1694fs = (C1694fs) this.f6400R;
                i3 = ((AbstractList) c1694fs).modCount;
                ((AbstractList) c1694fs).modCount = i3 + 1;
                unused = ((AbstractList) c1694fs).modCount;
                int m3195P = C1694fs.m3195P(c1694fs, interfaceC0133Ca, i);
                C0503JV c0503jv = c1694fs.f5307R;
                c0503jv.getClass();
                c0503jv.m1195M(c1694fs, 4, C0503JV.m1194W(m3195P, 0, i2));
                return;
        }
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: S */
    public final void mo2265S(Object obj) {
        ((InterfaceC0133Ca) obj).mo263z(this);
    }

    @Override // p000a.AbstractC1193WJ
    /* renamed from: h */
    public final void mo2471h(InterfaceC0133Ca interfaceC0133Ca, int i, int i2) {
        switch (this.f6401S) {
            case AbstractC0795Op.f2698E /* 0 */:
                mo2472z(interfaceC0133Ca);
                return;
            default:
                C1694fs c1694fs = (C1694fs) this.f6400R;
                C0503JV c0503jv = c1694fs.f5307R;
                int m3195P = C1694fs.m3195P(c1694fs, interfaceC0133Ca, i);
                c0503jv.getClass();
                c0503jv.m1195M(c1694fs, 1, C0503JV.m1194W(m3195P, 0, i2));
                return;
        }
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: v */
    public final void mo2266v(Object obj) {
        ((InterfaceC0133Ca) obj).mo262u(this);
    }

    @Override // p000a.AbstractC1193WJ
    /* renamed from: z */
    public final void mo2472z(InterfaceC0133Ca interfaceC0133Ca) {
        int i;
        InterfaceC0133Ca interfaceC0133Ca2;
        int unused;
        int i2 = this.f6401S;
        Object obj = this.f6400R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0376HA c0376ha = (C0376HA) obj;
                AbstractC2760z abstractC2760z = (AbstractC2760z) c0376ha.get();
                if (abstractC2760z == null) {
                    c0376ha.m866h();
                }
                if (abstractC2760z != null && (interfaceC0133Ca2 = (InterfaceC0133Ca) c0376ha.f1290v) == interfaceC0133Ca && !abstractC2760z.f8976J && abstractC2760z.mo16R(c0376ha.f1289h, 0, interfaceC0133Ca2)) {
                    abstractC2760z.m4816I();
                    return;
                }
                return;
            default:
                C1694fs c1694fs = (C1694fs) obj;
                i = ((AbstractList) c1694fs).modCount;
                ((AbstractList) c1694fs).modCount = i + 1;
                unused = ((AbstractList) c1694fs).modCount;
                c1694fs.f5307R.m1195M(c1694fs, 0, null);
                return;
        }
    }

    public C2059mo(AbstractC2760z abstractC2760z, int i, ReferenceQueue referenceQueue) {
        this.f6400R = new C0376HA(abstractC2760z, i, this, referenceQueue);
    }
}
