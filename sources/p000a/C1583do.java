package p000a;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.do */
/* loaded from: classes.dex */
public final class C1583do {

    /* renamed from: N */
    public boolean f4866N;

    /* renamed from: P */
    public InterfaceC0579Kq f4867P;

    /* renamed from: v */
    public Interpolator f4870v;

    /* renamed from: h */
    public long f4869h = -1;

    /* renamed from: Q */
    public final C1211Wd f4868Q = new C1211Wd(this);

    /* renamed from: z */
    public final ArrayList f4871z = new ArrayList();

    /* renamed from: h */
    public final void m3060h() {
        View view;
        if (this.f4866N) {
            return;
        }
        Iterator it = this.f4871z.iterator();
        while (it.hasNext()) {
            C0831PV c0831pv = (C0831PV) it.next();
            long j = this.f4869h;
            if (j >= 0) {
                c0831pv.m1936v(j);
            }
            Interpolator interpolator = this.f4870v;
            if (interpolator != null && (view = (View) c0831pv.f2816z.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f4867P != null) {
                c0831pv.m1934P(this.f4868Q);
            }
            View view2 = (View) c0831pv.f2816z.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4866N = true;
    }

    /* renamed from: z */
    public final void m3061z() {
        if (this.f4866N) {
            Iterator it = this.f4871z.iterator();
            while (it.hasNext()) {
                ((C0831PV) it.next()).m1935h();
            }
            this.f4866N = false;
        }
    }
}
