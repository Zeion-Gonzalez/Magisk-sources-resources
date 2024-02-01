package p000a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: a.m8 */
/* loaded from: classes.dex */
public final class RunnableC2026m8 implements Runnable {

    /* renamed from: R */
    public long f6293R;

    /* renamed from: w */
    public long f6295w;

    /* renamed from: q */
    public static final ThreadLocal f6291q = new ThreadLocal();

    /* renamed from: k */
    public static final C2496v1 f6290k = new C2496v1(2);

    /* renamed from: S */
    public final ArrayList f6294S = new ArrayList();

    /* renamed from: I */
    public final ArrayList f6292I = new ArrayList();

    /* renamed from: v */
    public static AbstractC0249El m3664v(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int m1657o = recyclerView.f9111k.m1657o();
        int i2 = 0;
        while (true) {
            if (i2 < m1657o) {
                AbstractC0249El m4894j = RecyclerView.m4894j(recyclerView.f9111k.m1658u(i2));
                if (m4894j.f864v == i && !m4894j.m530u()) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return null;
        }
        C1578df c1578df = recyclerView.f9128w;
        try {
            recyclerView.m4900B();
            AbstractC0249El m3053V = c1578df.m3053V(i, j);
            if (m3053V != null) {
                if (m3053V.m523Q() && !m3053V.m530u()) {
                    c1578df.m3054W(m3053V.f866z);
                } else {
                    c1578df.m3059z(m3053V, false);
                }
            }
            return m3053V;
        } finally {
            recyclerView.m4912K(false);
        }
    }

    /* renamed from: h */
    public final void m3665h(long j) {
        C1935kO c1935kO;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        C1935kO c1935kO2;
        boolean z;
        ArrayList arrayList = this.f6294S;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C2093nR c2093nR = recyclerView3.f9072G5;
                c2093nR.m3719v(recyclerView3, false);
                i += c2093nR.f6461v;
            }
        }
        ArrayList arrayList2 = this.f6292I;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C2093nR c2093nR2 = recyclerView4.f9072G5;
                int abs = Math.abs(c2093nR2.f6460h) + Math.abs(c2093nR2.f6462z);
                for (int i5 = 0; i5 < c2093nR2.f6461v * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c1935kO2 = new C1935kO();
                        arrayList2.add(c1935kO2);
                    } else {
                        c1935kO2 = (C1935kO) arrayList2.get(i3);
                    }
                    int[] iArr = (int[]) c2093nR2.f6459P;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1935kO2.f6008z = z;
                    c1935kO2.f6006h = abs;
                    c1935kO2.f6007v = i6;
                    c1935kO2.f6005P = recyclerView4;
                    c1935kO2.f6004N = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f6290k);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c1935kO = (C1935kO) arrayList2.get(i7)).f6005P) != null; i7++) {
            if (c1935kO.f6008z) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            AbstractC0249El m3664v = m3664v(recyclerView, c1935kO.f6004N, j2);
            if (m3664v != null && m3664v.f859h != null && m3664v.m523Q() && !m3664v.m530u() && (recyclerView2 = (RecyclerView) m3664v.f859h.get()) != null) {
                if (recyclerView2.f9126t && recyclerView2.f9111k.m1657o() != 0) {
                    C1192WI c1192wi = recyclerView2.f9123qn;
                    if (c1192wi != null) {
                        c1192wi.m2466o();
                    }
                    AbstractC0667Md abstractC0667Md = recyclerView2.f9077J;
                    C1578df c1578df = recyclerView2.f9128w;
                    if (abstractC0667Md != null) {
                        abstractC0667Md.m1515UZ(c1578df);
                        recyclerView2.f9077J.m1539n0(c1578df);
                    }
                    ((ArrayList) c1578df.f4857v).clear();
                    c1578df.m3057u();
                }
                C2093nR c2093nR3 = recyclerView2.f9072G5;
                c2093nR3.m3719v(recyclerView2, true);
                if (c2093nR3.f6461v != 0) {
                    try {
                        int i8 = AbstractC2574wV.f7854z;
                        AbstractC1404aL.m2824z("RV Nested Prefetch");
                        C0496JN c0496jn = recyclerView2.f9064BX;
                        AbstractC0408Hk abstractC0408Hk = recyclerView2.f9124r;
                        c0496jn.f1655P = 1;
                        c0496jn.f1654N = abstractC0408Hk.mo918z();
                        c0496jn.f1663u = false;
                        c0496jn.f1662o = false;
                        c0496jn.f1660W = false;
                        for (int i9 = 0; i9 < c2093nR3.f6461v * 2; i9 += 2) {
                            m3664v(recyclerView2, ((int[]) c2093nR3.f6459P)[i9], j);
                        }
                        AbstractC1404aL.m2823h();
                        c1935kO.f6008z = false;
                        c1935kO.f6006h = 0;
                        c1935kO.f6007v = 0;
                        c1935kO.f6005P = null;
                        c1935kO.f6004N = 0;
                    } catch (Throwable th) {
                        int i10 = AbstractC2574wV.f7854z;
                        AbstractC1404aL.m2823h();
                        throw th;
                    }
                }
            }
            c1935kO.f6008z = false;
            c1935kO.f6006h = 0;
            c1935kO.f6007v = 0;
            c1935kO.f6005P = null;
            c1935kO.f6004N = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC2574wV.f7854z;
            AbstractC1404aL.m2824z("RV Prefetch");
            ArrayList arrayList = this.f6294S;
            if (arrayList.isEmpty()) {
                this.f6293R = 0L;
                AbstractC1404aL.m2823h();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f6293R = 0L;
                AbstractC1404aL.m2823h();
            } else {
                m3665h(TimeUnit.MILLISECONDS.toNanos(j) + this.f6295w);
                this.f6293R = 0L;
                AbstractC1404aL.m2823h();
            }
        } catch (Throwable th) {
            this.f6293R = 0L;
            int i3 = AbstractC2574wV.f7854z;
            AbstractC1404aL.m2823h();
            throw th;
        }
    }

    /* renamed from: z */
    public final void m3666z(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            int[] iArr = RecyclerView.f9056LN;
            if (this.f6293R == 0) {
                this.f6293R = RecyclerView.m4893i();
                recyclerView.post(this);
            }
        }
        C2093nR c2093nR = recyclerView.f9072G5;
        c2093nR.f6462z = i;
        c2093nR.f6460h = i2;
    }
}
