package p000a;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.EL */
/* loaded from: classes.dex */
public final class RunnableC0228EL implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ ArrayList f744R;

    /* renamed from: S */
    public final /* synthetic */ int f745S;

    /* renamed from: w */
    public final /* synthetic */ C1192WI f746w;

    public /* synthetic */ RunnableC0228EL(C1192WI c1192wi, ArrayList arrayList, int i) {
        this.f745S = i;
        this.f746w = c1192wi;
        this.f744R = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        long j;
        int i = this.f745S;
        C1192WI c1192wi = this.f746w;
        ArrayList arrayList = this.f744R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C2212ph c2212ph = (C2212ph) it.next();
                    AbstractC0249El abstractC0249El = c2212ph.f6804z;
                    c1192wi.getClass();
                    View view3 = abstractC0249El.f866z;
                    int i2 = c2212ph.f6801P - c2212ph.f6802h;
                    int i3 = c2212ph.f6800N - c2212ph.f6803v;
                    if (i2 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i3 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    c1192wi.f3872I.add(abstractC0249El);
                    animate.setDuration(c1192wi.f8607N).setListener(new C1254XR(c1192wi, abstractC0249El, i2, view3, i3, animate)).start();
                }
                arrayList.clear();
                c1192wi.f3875S.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1418ae c1418ae = (C1418ae) it2.next();
                    c1192wi.getClass();
                    AbstractC0249El abstractC0249El2 = c1418ae.f4442z;
                    if (abstractC0249El2 == null) {
                        view = null;
                    } else {
                        view = abstractC0249El2.f866z;
                    }
                    AbstractC0249El abstractC0249El3 = c1418ae.f4440h;
                    if (abstractC0249El3 != null) {
                        view2 = abstractC0249El3.f866z;
                    } else {
                        view2 = null;
                    }
                    ArrayList arrayList2 = c1192wi.f3878k;
                    long j2 = c1192wi.f8609Q;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j2);
                        arrayList2.add(c1418ae.f4442z);
                        duration.translationX(c1418ae.f4437N - c1418ae.f4441v);
                        duration.translationY(c1418ae.f4439Q - c1418ae.f4438P);
                        j = j2;
                        duration.alpha(0.0f).setListener(new C2201pS(c1192wi, c1418ae, duration, view, 0)).start();
                    } else {
                        j = j2;
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList2.add(c1418ae.f4440h);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C2201pS(c1192wi, c1418ae, animate2, view2, 1)).start();
                    }
                }
                arrayList.clear();
                c1192wi.f3874R.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    AbstractC0249El abstractC0249El4 = (AbstractC0249El) it3.next();
                    c1192wi.getClass();
                    View view4 = abstractC0249El4.f866z;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c1192wi.f3881w.add(abstractC0249El4);
                    animate3.alpha(1.0f).setDuration(c1192wi.f8612v).setListener(new C2187pC(c1192wi, abstractC0249El4, view4, animate3)).start();
                }
                arrayList.clear();
                c1192wi.f3876V.remove(arrayList);
                return;
        }
    }
}
