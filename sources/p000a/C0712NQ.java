package p000a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.NQ */
/* loaded from: classes.dex */
public final class C0712NQ {

    /* renamed from: N */
    public View f2390N;

    /* renamed from: P */
    public int f2391P = 0;

    /* renamed from: h */
    public final C2353sH f2392h = new C2353sH();

    /* renamed from: v */
    public final ArrayList f2393v = new ArrayList();

    /* renamed from: z */
    public final C0872QL f2394z;

    public C0712NQ(C0872QL c0872ql) {
        this.f2394z = c0872ql;
    }

    /* renamed from: G */
    public final boolean m1650G(View view) {
        return this.f2393v.contains(view);
    }

    /* renamed from: M */
    public final void m1651M(View view) {
        if (this.f2393v.remove(view)) {
            C0872QL c0872ql = this.f2394z;
            c0872ql.getClass();
            AbstractC0249El m4894j = RecyclerView.m4894j(view);
            if (m4894j != null) {
                int i = m4894j.f849I;
                RecyclerView recyclerView = c0872ql.f2961z;
                if (recyclerView.m4938n()) {
                    m4894j.f862q = i;
                    recyclerView.f9086Rh.add(m4894j);
                } else {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC2397t8.m4123g(m4894j.f866z, i);
                }
                m4894j.f849I = 0;
            }
        }
    }

    /* renamed from: N */
    public final int m1652N() {
        return this.f2394z.m2008v() - this.f2393v.size();
    }

    /* renamed from: P */
    public final View m1653P(int i) {
        return this.f2394z.f2961z.getChildAt(m1654Q(i));
    }

    /* renamed from: Q */
    public final int m1654Q(int i) {
        if (i < 0) {
            return -1;
        }
        int m2008v = this.f2394z.m2008v();
        int i2 = i;
        while (i2 < m2008v) {
            C2353sH c2353sH = this.f2392h;
            int m4059h = i - (i2 - c2353sH.m4059h(i2));
            if (m4059h == 0) {
                while (c2353sH.m4057P(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m4059h;
        }
        return -1;
    }

    /* renamed from: W */
    public final void m1655W(View view) {
        this.f2393v.add(view);
        C0872QL c0872ql = this.f2394z;
        c0872ql.getClass();
        AbstractC0249El m4894j = RecyclerView.m4894j(view);
        if (m4894j != null) {
            int i = m4894j.f862q;
            View view2 = m4894j.f866z;
            if (i == -1) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                i = AbstractC2397t8.m4129v(view2);
            }
            m4894j.f849I = i;
            RecyclerView recyclerView = c0872ql.f2961z;
            if (recyclerView.m4938n()) {
                m4894j.f862q = 4;
                recyclerView.f9086Rh.add(m4894j);
            } else {
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                AbstractC2397t8.m4123g(view2, 4);
            }
        }
    }

    /* renamed from: h */
    public final void m1656h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m1654Q;
        C0872QL c0872ql = this.f2394z;
        if (i < 0) {
            m1654Q = c0872ql.m2008v();
        } else {
            m1654Q = m1654Q(i);
        }
        this.f2392h.m4056N(m1654Q, z);
        if (z) {
            m1655W(view);
        }
        c0872ql.getClass();
        AbstractC0249El m4894j = RecyclerView.m4894j(view);
        RecyclerView recyclerView = c0872ql.f2961z;
        if (m4894j != null) {
            if (!m4894j.m520M() && !m4894j.m532w()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + m4894j + recyclerView.m4923Y());
            }
            m4894j.f848G &= -257;
        }
        recyclerView.attachViewToParent(view, m1654Q, layoutParams);
    }

    /* renamed from: o */
    public final int m1657o() {
        return this.f2394z.m2008v();
    }

    public final String toString() {
        return this.f2392h.toString() + ", hidden list:" + this.f2393v.size();
    }

    /* renamed from: u */
    public final View m1658u(int i) {
        return this.f2394z.f2961z.getChildAt(i);
    }

    /* renamed from: v */
    public final void m1659v(int i) {
        int m1654Q = m1654Q(i);
        this.f2392h.m4058Q(m1654Q);
        C0872QL c0872ql = this.f2394z;
        View childAt = c0872ql.f2961z.getChildAt(m1654Q);
        RecyclerView recyclerView = c0872ql.f2961z;
        if (childAt != null) {
            AbstractC0249El m4894j = RecyclerView.m4894j(childAt);
            if (m4894j != null) {
                if (m4894j.m520M() && !m4894j.m532w()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m4894j + recyclerView.m4923Y());
                }
                m4894j.m528h(256);
            }
        } else {
            int[] iArr = RecyclerView.f9056LN;
        }
        recyclerView.detachViewFromParent(m1654Q);
    }

    /* renamed from: z */
    public final void m1660z(View view, int i, boolean z) {
        int m1654Q;
        C0872QL c0872ql = this.f2394z;
        if (i < 0) {
            m1654Q = c0872ql.m2008v();
        } else {
            m1654Q = m1654Q(i);
        }
        this.f2392h.m4056N(m1654Q, z);
        if (z) {
            m1655W(view);
        }
        c0872ql.f2961z.addView(view, m1654Q);
        RecyclerView.m4894j(view);
    }
}
