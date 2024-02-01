package p000a;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: a.df */
/* loaded from: classes.dex */
public final class C1578df {

    /* renamed from: N */
    public Object f4851N;

    /* renamed from: P */
    public Object f4852P;

    /* renamed from: Q */
    public Object f4853Q;

    /* renamed from: h */
    public int f4854h;

    /* renamed from: o */
    public final RecyclerView f4855o;

    /* renamed from: u */
    public Object f4856u;

    /* renamed from: v */
    public final Object f4857v;

    /* renamed from: z */
    public int f4858z;

    public C1578df(RecyclerView recyclerView) {
        this.f4855o = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4857v = arrayList;
        this.f4852P = null;
        this.f4851N = new ArrayList();
        this.f4853Q = Collections.unmodifiableList(arrayList);
        this.f4858z = 2;
        this.f4854h = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x008a, code lost:
    
        if (r6 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x008c, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x008e, code lost:
    
        if (r5 < 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0090, code lost:
    
        r6 = ((p000a.AbstractC0249El) ((java.util.ArrayList) r11.f4851N).get(r5)).f864v;
        r7 = r2.f9072G5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00a2, code lost:
    
        if (((int[]) r7.f6459P) == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00a4, code lost:
    
        r8 = r7.f6461v * 2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00a9, code lost:
    
        if (r9 >= r8) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00b1, code lost:
    
        if (((int[]) r7.f6459P)[r9] != r6) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00b3, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00b5, code lost:
    
        r9 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00b8, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00b9, code lost:
    
        if (r6 != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00bb, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00cf  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3046G(p000a.AbstractC0249El r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1578df.m3046G(a.El):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0048  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3047M(android.view.View r6) {
        /*
            r5 = this;
            a.El r6 = androidx.recyclerview.widget.RecyclerView.m4894j(r6)
            int r0 = r6.f848G
            r1 = 12
            r1 = r1 & r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r3
        L10:
            androidx.recyclerview.widget.RecyclerView r4 = r5.f4855o
            if (r1 != 0) goto L5c
            r0 = r0 & 2
            if (r0 == 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r3
        L1b:
            if (r0 == 0) goto L5c
            a.WI r0 = r4.f9123qn
            if (r0 == 0) goto L44
            java.util.List r1 = r6.m522P()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3e
            boolean r0 = r0.f8611u
            if (r0 == 0) goto L38
            boolean r0 = r6.m530u()
            if (r0 == 0) goto L36
            goto L38
        L36:
            r0 = r3
            goto L39
        L38:
            r0 = r2
        L39:
            if (r0 == 0) goto L3c
            goto L3e
        L3c:
            r0 = r3
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L42
            goto L44
        L42:
            r0 = r3
            goto L45
        L44:
            r0 = r2
        L45:
            if (r0 == 0) goto L48
            goto L5c
        L48:
            java.lang.Object r0 = r5.f4852P
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L55
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f4852P = r0
        L55:
            r6.f854R = r5
            r6.f865w = r2
            java.lang.Object r0 = r5.f4852P
            goto L8d
        L5c:
            boolean r0 = r6.m530u()
            if (r0 == 0) goto L87
            boolean r0 = r6.m527W()
            if (r0 != 0) goto L87
            a.Hk r0 = r4.f9124r
            boolean r0 = r0.f1374h
            if (r0 == 0) goto L6f
            goto L87
        L6f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r1)
            java.lang.String r1 = r4.m4923Y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L87:
            r6.f854R = r5
            r6.f865w = r3
            java.lang.Object r0 = r5.f4857v
        L8d:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1578df.m3047M(android.view.View):void");
    }

    /* renamed from: N */
    public final void m3048N() {
        if (((C2382so) this.f4856u) != null) {
            RecyclerView recyclerView = this.f4855o;
            if (recyclerView.f9124r != null && recyclerView.isAttachedToWindow()) {
                C2382so c2382so = (C2382so) this.f4856u;
                ((Set) c2382so.f7315v).add(recyclerView.f9124r);
            }
        }
    }

    /* renamed from: P */
    public final View m3049P(int i) {
        return m3053V(i, Long.MAX_VALUE).f866z;
    }

    /* renamed from: Q */
    public final void m3050Q(AbstractC0408Hk abstractC0408Hk, boolean z) {
        Object obj = this.f4856u;
        if (((C2382so) obj) != null) {
            C2382so c2382so = (C2382so) obj;
            Set set = (Set) c2382so.f7315v;
            set.remove(abstractC0408Hk);
            if (set.size() == 0 && !z) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = (SparseArray) c2382so.f7314h;
                    if (i < sparseArray.size()) {
                        ArrayList arrayList = ((C2247qL) sparseArray.get(sparseArray.keyAt(i))).f6914z;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            AbstractC0795Op.m1821N(((AbstractC0249El) arrayList.get(i2)).f866z);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: R */
    public final void m3051R() {
        AbstractC0667Md abstractC0667Md = this.f4855o.f9077J;
        this.f4854h = this.f4858z + (abstractC0667Md != null ? abstractC0667Md.f2160G : 0);
        int size = ((ArrayList) this.f4851N).size();
        while (true) {
            size--;
            if (size < 0 || ((ArrayList) this.f4851N).size() <= this.f4854h) {
                return;
            } else {
                m3056o(size);
            }
        }
    }

    /* renamed from: S */
    public final void m3052S(AbstractC0249El abstractC0249El) {
        Object obj;
        if (abstractC0249El.f865w) {
            obj = this.f4852P;
        } else {
            obj = this.f4857v;
        }
        ((ArrayList) obj).remove(abstractC0249El);
        abstractC0249El.f854R = null;
        abstractC0249El.f865w = false;
        abstractC0249El.f848G &= -33;
    }

    /* JADX WARN: Code restructure failed: missing block: B:611:0x045f, code lost:
    
        if (r7.m530u() == false) goto L613;
     */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x05b1 A[ADDED_TO_REGION] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.AbstractC0249El m3053V(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1578df.m3053V(int, long):a.El");
    }

    /* renamed from: W */
    public final void m3054W(View view) {
        AbstractC0249El m4894j = RecyclerView.m4894j(view);
        boolean m520M = m4894j.m520M();
        RecyclerView recyclerView = this.f4855o;
        if (m520M) {
            recyclerView.removeDetachedView(view, false);
        }
        if (m4894j.m518G()) {
            m4894j.f854R.m3052S(m4894j);
        } else if (m4894j.m519I()) {
            m4894j.f848G &= -33;
        }
        m3046G(m4894j);
        if (recyclerView.f9123qn != null && !m4894j.m529o()) {
            recyclerView.f9123qn.m2467u(m4894j);
        }
    }

    /* renamed from: h */
    public final int m3055h(int i) {
        RecyclerView recyclerView = this.f4855o;
        if (i >= 0 && i < recyclerView.f9064BX.m1190h()) {
            if (!recyclerView.f9064BX.f1663u) {
                return i;
            }
            return recyclerView.f9122q.m2612Q(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f9064BX.m1190h() + recyclerView.m4923Y());
    }

    /* renamed from: o */
    public final void m3056o(int i) {
        int[] iArr = RecyclerView.f9056LN;
        m3059z((AbstractC0249El) ((ArrayList) this.f4851N).get(i), true);
        ((ArrayList) this.f4851N).remove(i);
    }

    /* renamed from: u */
    public final void m3057u() {
        for (int size = ((ArrayList) this.f4851N).size() - 1; size >= 0; size--) {
            m3056o(size);
        }
        ((ArrayList) this.f4851N).clear();
        if (RecyclerView.f9055KM) {
            C2093nR c2093nR = this.f4855o.f9072G5;
            int[] iArr = (int[]) c2093nR.f6459P;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c2093nR.f6461v = 0;
        }
    }

    /* renamed from: v */
    public final C2382so m3058v() {
        if (((C2382so) this.f4856u) == null) {
            this.f4856u = new C2382so();
            m3048N();
        }
        return (C2382so) this.f4856u;
    }

    /* renamed from: z */
    public final void m3059z(AbstractC0249El abstractC0249El, boolean z) {
        C1555dG c1555dG;
        RecyclerView.m4890V(abstractC0249El);
        RecyclerView recyclerView = this.f4855o;
        C0469Is c0469Is = recyclerView.f9100d3;
        View view = abstractC0249El.f866z;
        if (c0469Is != null) {
            C1638en c1638en = c0469Is.f1561N;
            if (c1638en instanceof C1638en) {
                c1555dG = (C1555dG) c1638en.f5097N.remove(view);
            } else {
                c1555dG = null;
            }
            AbstractC2446u3.m4221V(view, c1555dG);
        }
        if (z) {
            recyclerView.getClass();
            ArrayList arrayList = recyclerView.f9097c;
            if (arrayList.size() <= 0) {
                if (recyclerView.f9064BX != null) {
                    recyclerView.f9106g.m2280S(abstractC0249El);
                }
            } else {
                AbstractC2441tz.m4202q(arrayList.get(0));
                throw null;
            }
        }
        abstractC0249El.f858g = null;
        abstractC0249El.f860k = null;
        C2382so m3058v = m3058v();
        m3058v.getClass();
        int i = abstractC0249El.f853Q;
        ArrayList arrayList2 = m3058v.m4109v(i).f6914z;
        if (((C2247qL) ((SparseArray) m3058v.f7314h).get(i)).f6912h <= arrayList2.size()) {
            AbstractC0795Op.m1821N(view);
        } else {
            abstractC0249El.m525S();
            arrayList2.add(abstractC0249El);
        }
    }
}
