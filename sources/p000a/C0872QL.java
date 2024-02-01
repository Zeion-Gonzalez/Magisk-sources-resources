package p000a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: a.QL */
/* loaded from: classes.dex */
public final class C0872QL {

    /* renamed from: z */
    public final /* synthetic */ RecyclerView f2961z;

    public /* synthetic */ C0872QL(RecyclerView recyclerView) {
        this.f2961z = recyclerView;
    }

    /* renamed from: N */
    public final void m2003N(int i, int i2) {
        RecyclerView recyclerView = this.f2961z;
        int m1657o = recyclerView.f9111k.m1657o();
        for (int i3 = 0; i3 < m1657o; i3++) {
            AbstractC0249El m4894j = RecyclerView.m4894j(recyclerView.f9111k.m1658u(i3));
            if (m4894j != null && !m4894j.m532w() && m4894j.f864v >= i) {
                m4894j.m526V(i2, false);
                recyclerView.f9064BX.f1656Q = true;
            }
        }
        C1578df c1578df = recyclerView.f9128w;
        int size = ((ArrayList) c1578df.f4851N).size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0249El abstractC0249El = (AbstractC0249El) ((ArrayList) c1578df.f4851N).get(i4);
            if (abstractC0249El != null && abstractC0249El.f864v >= i) {
                abstractC0249El.m526V(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f9101dG = true;
    }

    /* renamed from: P */
    public final void m2004P(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2961z;
        int m1657o = recyclerView.f9111k.m1657o();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m1657o; i6++) {
            View m1658u = recyclerView.f9111k.m1658u(i6);
            AbstractC0249El m4894j = RecyclerView.m4894j(m1658u);
            if (m4894j != null && !m4894j.m532w() && (i4 = m4894j.f864v) >= i && i4 < i5) {
                m4894j.m528h(2);
                m4894j.m533z(obj);
                ((C0419Hv) m1658u.getLayoutParams()).f1396v = true;
            }
        }
        C1578df c1578df = recyclerView.f9128w;
        int size = ((ArrayList) c1578df.f4851N).size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC0249El abstractC0249El = (AbstractC0249El) ((ArrayList) c1578df.f4851N).get(size);
                if (abstractC0249El != null && (i3 = abstractC0249El.f864v) >= i && i3 < i5) {
                    abstractC0249El.m528h(2);
                    c1578df.m3056o(size);
                }
            } else {
                recyclerView.f9083O4 = true;
                return;
            }
        }
    }

    /* renamed from: Q */
    public final void m2005Q(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2961z;
        int m1657o = recyclerView.f9111k.m1657o();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < m1657o; i11++) {
            AbstractC0249El m4894j = RecyclerView.m4894j(recyclerView.f9111k.m1658u(i11));
            if (m4894j != null && (i9 = m4894j.f864v) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    m4894j.m526V(i2 - i, false);
                } else {
                    m4894j.m526V(i5, false);
                }
                recyclerView.f9064BX.f1656Q = true;
            }
        }
        C1578df c1578df = recyclerView.f9128w;
        c1578df.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = ((ArrayList) c1578df.f4851N).size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0249El abstractC0249El = (AbstractC0249El) ((ArrayList) c1578df.f4851N).get(i12);
            if (abstractC0249El != null && (i8 = abstractC0249El.f864v) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0249El.m526V(i2 - i, false);
                } else {
                    abstractC0249El.m526V(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f9101dG = true;
    }

    /* renamed from: h */
    public final AbstractC0249El m2006h(int i) {
        RecyclerView recyclerView = this.f2961z;
        int m1657o = recyclerView.f9111k.m1657o();
        int i2 = 0;
        AbstractC0249El abstractC0249El = null;
        while (true) {
            if (i2 >= m1657o) {
                break;
            }
            AbstractC0249El m4894j = RecyclerView.m4894j(recyclerView.f9111k.m1658u(i2));
            if (m4894j != null && !m4894j.m527W() && m4894j.f864v == i) {
                if (recyclerView.f9111k.m1650G(m4894j.f866z)) {
                    abstractC0249El = m4894j;
                } else {
                    abstractC0249El = m4894j;
                    break;
                }
            }
            i2++;
        }
        if (abstractC0249El == null) {
            return null;
        }
        if (recyclerView.f9111k.m1650G(abstractC0249El.f866z)) {
            int[] iArr = RecyclerView.f9056LN;
            return null;
        }
        return abstractC0249El;
    }

    /* renamed from: u */
    public final void m2007u(int i) {
        RecyclerView recyclerView = this.f2961z;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m4894j(childAt);
            AbstractC0408Hk abstractC0408Hk = recyclerView.f9124r;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* renamed from: v */
    public final int m2008v() {
        return this.f2961z.getChildCount();
    }

    /* renamed from: z */
    public final void m2009z(C0093Bo c0093Bo) {
        int i = c0093Bo.f353z;
        RecyclerView recyclerView = this.f2961z;
        if (i == 1) {
            recyclerView.f9077J.mo1537m(c0093Bo.f351h, c0093Bo.f350P);
            return;
        }
        if (i == 2) {
            recyclerView.f9077J.mo1542nP(c0093Bo.f351h, c0093Bo.f350P);
        } else if (i == 4) {
            recyclerView.f9077J.mo1520Yd(c0093Bo.f351h, c0093Bo.f350P);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f9077J.mo1522b(c0093Bo.f351h, c0093Bo.f350P);
        }
    }
}
