package p000a;

import android.util.SparseArray;
import android.view.LayoutInflater;
import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: a.sc */
/* loaded from: classes.dex */
public final class C2371sc extends AbstractC0408Hk {

    /* renamed from: N */
    public final SparseArray f7289N;

    /* renamed from: P */
    public final List f7290P;

    /* renamed from: Q */
    public InterfaceC1546d7 f7291Q;

    /* renamed from: o */
    public final InterfaceC1841if f7292o;

    /* renamed from: u */
    public RecyclerView f7293u;

    public C2371sc(List list, SparseArray sparseArray) {
        this.f7290P = list;
        this.f7289N = sparseArray;
        int i = EnumC0511Je.f1697S;
        this.f7292o = AbstractC0438II.m1020Z(new C1407aQ(9, this));
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: N */
    public final void mo912N(AbstractC0249El abstractC0249El, int i) {
        AbstractC0769OL abstractC0769OL = (AbstractC0769OL) this.f7290P.get(i);
        AbstractC2760z abstractC2760z = ((C2147oV) abstractC0249El).f6604s;
        abstractC2760z.mo19k(20, abstractC0769OL);
        SparseArray sparseArray = this.f7289N;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                abstractC2760z.mo19k(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
        abstractC2760z.mo2815q(this.f7291Q);
        abstractC2760z.m4817W();
        RecyclerView recyclerView = this.f7293u;
        if (recyclerView != null && (abstractC0769OL instanceof InterfaceC1163Vm)) {
            ((InterfaceC1163Vm) abstractC0769OL).mo1192W(abstractC2760z, recyclerView);
        }
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: P */
    public final void mo913P(RecyclerView recyclerView) {
        Object next;
        C0923RN c0923rn = new C0923RN(new C2211pf(new C1831iT(AbstractC0873QM.m2010BX(recyclerView, C1980lF.f6125I), C1980lF.f6140q, 2), false, C0741Nu.f2537i));
        if (!c0923rn.hasNext()) {
            next = null;
        } else {
            next = c0923rn.next();
        }
        this.f7291Q = (InterfaceC1546d7) next;
        this.f7293u = recyclerView;
        List list = this.f7290P;
        if (list instanceof InterfaceC0133Ca) {
            ((InterfaceC0133Ca) list).mo262u((C1337Z3) this.f7292o.getValue());
        }
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: Q */
    public final AbstractC0249El mo914Q(RecyclerView recyclerView, int i) {
        return new C2147oV(AbstractC2307rQ.m3967v(LayoutInflater.from(recyclerView.getContext()), i, recyclerView, false));
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: u */
    public final void mo916u() {
        this.f7291Q = null;
        this.f7293u = null;
        List list = this.f7290P;
        if (list instanceof InterfaceC0133Ca) {
            ((InterfaceC0133Ca) list).mo263z((C1337Z3) this.f7292o.getValue());
        }
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: v */
    public final int mo917v(int i) {
        return ((AbstractC0769OL) this.f7290P.get(i)).mo553G();
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: z */
    public final int mo918z() {
        return this.f7290P.size();
    }
}
