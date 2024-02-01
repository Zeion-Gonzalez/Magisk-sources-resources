package p000a;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: a.PA */
/* loaded from: classes.dex */
public final class RunnableC0814PA implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ RecyclerView f2764R;

    /* renamed from: S */
    public final /* synthetic */ int f2765S;

    public /* synthetic */ RunnableC0814PA(RecyclerView recyclerView, int i) {
        this.f2765S = i;
        this.f2764R = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        long j;
        int i = this.f2765S;
        RecyclerView recyclerView = this.f2764R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (recyclerView.f9109j && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f9065C) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.f9098d) {
                        recyclerView.f9108i = true;
                        return;
                    } else {
                        recyclerView.m4910I();
                        return;
                    }
                }
                return;
            default:
                C1192WI c1192wi = recyclerView.f9123qn;
                if (c1192wi != null) {
                    ArrayList arrayList = c1192wi.f3879o;
                    boolean z2 = !arrayList.isEmpty();
                    ArrayList arrayList2 = c1192wi.f3871G;
                    boolean z3 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c1192wi.f3873M;
                    boolean z4 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c1192wi.f3877W;
                    boolean z5 = !arrayList4.isEmpty();
                    if (z2 || z3 || z5 || z4) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j2 = c1192wi.f8608P;
                            if (hasNext) {
                                AbstractC0249El abstractC0249El = (AbstractC0249El) it.next();
                                View view = abstractC0249El.f866z;
                                ViewPropertyAnimator animate = view.animate();
                                c1192wi.f3880q.add(abstractC0249El);
                                animate.setDuration(j2).alpha(0.0f).setListener(new C2187pC(c1192wi, abstractC0249El, animate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (z3) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1192wi.f3875S.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0228EL runnableC0228EL = new RunnableC0228EL(c1192wi, arrayList5, 0);
                                    if (z2) {
                                        View view2 = ((C2212ph) arrayList5.get(0)).f6804z.f866z;
                                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                                        AbstractC2397t8.m4119R(view2, runnableC0228EL, j2);
                                    } else {
                                        runnableC0228EL.run();
                                    }
                                }
                                if (z4) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1192wi.f3874R.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0228EL runnableC0228EL2 = new RunnableC0228EL(c1192wi, arrayList6, 1);
                                    if (z2) {
                                        View view3 = ((C1418ae) arrayList6.get(0)).f4442z.f866z;
                                        WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                                        AbstractC2397t8.m4119R(view3, runnableC0228EL2, j2);
                                    } else {
                                        runnableC0228EL2.run();
                                    }
                                }
                                if (z5) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1192wi.f3876V.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0228EL runnableC0228EL3 = new RunnableC0228EL(c1192wi, arrayList7, 2);
                                    if (!z2 && !z3 && !z4) {
                                        runnableC0228EL3.run();
                                    } else {
                                        long j3 = 0;
                                        if (!z2) {
                                            j2 = 0;
                                        }
                                        if (z3) {
                                            j = c1192wi.f8607N;
                                        } else {
                                            j = 0;
                                        }
                                        if (z4) {
                                            j3 = c1192wi.f8609Q;
                                        }
                                        long max = Math.max(j, j3) + j2;
                                        z = false;
                                        View view4 = ((AbstractC0249El) arrayList7.get(0)).f866z;
                                        WeakHashMap weakHashMap3 = AbstractC2446u3.f7488z;
                                        AbstractC2397t8.m4119R(view4, runnableC0228EL3, max);
                                        recyclerView.f9116nB = z;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
                recyclerView.f9116nB = z;
                return;
        }
    }
}
