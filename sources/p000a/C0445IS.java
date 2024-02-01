package p000a;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: a.IS */
/* loaded from: classes.dex */
public final class C0445IS {

    /* renamed from: N */
    public final int f1483N;

    /* renamed from: Q */
    public final /* synthetic */ StaggeredGridLayoutManager f1485Q;

    /* renamed from: z */
    public final ArrayList f1488z = new ArrayList();

    /* renamed from: h */
    public int f1486h = Integer.MIN_VALUE;

    /* renamed from: v */
    public int f1487v = Integer.MIN_VALUE;

    /* renamed from: P */
    public int f1484P = 0;

    public C0445IS(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f1485Q = staggeredGridLayoutManager;
        this.f1483N = i;
    }

    /* renamed from: o */
    public static C1018T5 m1062o(View view) {
        return (C1018T5) view.getLayoutParams();
    }

    /* renamed from: N */
    public final int m1063N(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1485Q;
        int mo571o = staggeredGridLayoutManager.f9150k.mo571o();
        int mo567Q = staggeredGridLayoutManager.f9150k.mo567Q();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) this.f1488z.get(i);
            int mo566P = staggeredGridLayoutManager.f9150k.mo566P(view);
            int mo570h = staggeredGridLayoutManager.f9150k.mo570h(view);
            boolean z2 = false;
            if (mo566P <= mo567Q) {
                z = true;
            } else {
                z = false;
            }
            if (mo570h >= mo571o) {
                z2 = true;
            }
            if (z && z2 && (mo566P < mo571o || mo570h > mo567Q)) {
                return AbstractC0667Md.m1483F(view);
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: P */
    public final int m1064P() {
        return this.f1485Q.f9135E ? m1063N(0, this.f1488z.size()) : m1063N(r1.size() - 1, -1);
    }

    /* renamed from: Q */
    public final int m1065Q(int i) {
        int i2 = this.f1487v;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f1488z.size() == 0) {
            return i;
        }
        m1070z();
        return this.f1487v;
    }

    /* renamed from: W */
    public final int m1066W(int i) {
        int i2 = this.f1486h;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f1488z;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C1018T5 m1062o = m1062o(view);
        this.f1486h = this.f1485Q.f9150k.mo566P(view);
        m1062o.getClass();
        return this.f1486h;
    }

    /* renamed from: h */
    public final void m1067h() {
        this.f1488z.clear();
        this.f1486h = Integer.MIN_VALUE;
        this.f1487v = Integer.MIN_VALUE;
        this.f1484P = 0;
    }

    /* renamed from: u */
    public final View m1068u(int i, int i2) {
        ArrayList arrayList = this.f1488z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f1485Q;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f9135E && AbstractC0667Md.m1483F(view2) >= i) || ((!staggeredGridLayoutManager.f9135E && AbstractC0667Md.m1483F(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f9135E && AbstractC0667Md.m1483F(view3) <= i) || ((!staggeredGridLayoutManager.f9135E && AbstractC0667Md.m1483F(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    /* renamed from: v */
    public final int m1069v() {
        return this.f1485Q.f9135E ? m1063N(r1.size() - 1, -1) : m1063N(0, this.f1488z.size());
    }

    /* renamed from: z */
    public final void m1070z() {
        View view = (View) this.f1488z.get(r0.size() - 1);
        C1018T5 m1062o = m1062o(view);
        this.f1487v = this.f1485Q.f9150k.mo570h(view);
        m1062o.getClass();
    }
}
