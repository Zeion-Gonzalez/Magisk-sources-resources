package p000a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: a.Du */
/* loaded from: classes.dex */
public abstract class AbstractC0204Du {

    /* renamed from: Q */
    public boolean f617Q;

    /* renamed from: h */
    public int f618h;

    /* renamed from: u */
    public boolean f619u;

    /* renamed from: v */
    public final AbstractComponentCallbacksC2342s3 f620v;

    /* renamed from: z */
    public int f621z;

    /* renamed from: P */
    public final ArrayList f616P = new ArrayList();

    /* renamed from: N */
    public final LinkedHashSet f615N = new LinkedHashSet();

    public AbstractC0204Du(int i, int i2, AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, C1251XO c1251xo) {
        this.f621z = i;
        this.f618h = i2;
        this.f620v = abstractComponentCallbacksC2342s3;
        c1251xo.m2556h(new C0024AR(1, this));
    }

    /* renamed from: P */
    public abstract void mo390P();

    /* renamed from: h */
    public abstract void mo391h();

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + AbstractC2441tz.m4196Y(this.f621z) + " lifecycleImpact = " + AbstractC2441tz.m4203r(this.f618h) + " fragment = " + this.f620v + '}';
    }

    /* renamed from: v */
    public final void m392v(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = this.f620v;
        if (i3 == 0) {
            if (this.f621z != 1) {
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2342s3 + " mFinalState = " + AbstractC2441tz.m4196Y(this.f621z) + " -> " + AbstractC2441tz.m4196Y(i) + '.');
                }
                this.f621z = i;
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (this.f621z == 1) {
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2342s3 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC2441tz.m4203r(this.f618h) + " to ADDING.");
                }
                this.f621z = 2;
                this.f618h = 2;
                return;
            }
            return;
        }
        if (i3 != 2) {
            return;
        }
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC2342s3 + " mFinalState = " + AbstractC2441tz.m4196Y(this.f621z) + " -> REMOVED. mLifecycleImpact  = " + AbstractC2441tz.m4203r(this.f618h) + " to REMOVING.");
        }
        this.f621z = 1;
        this.f618h = 3;
    }

    /* renamed from: z */
    public final void m393z() {
        if (this.f617Q) {
            return;
        }
        this.f617Q = true;
        LinkedHashSet linkedHashSet = this.f615N;
        if (linkedHashSet.isEmpty()) {
            mo391h();
            return;
        }
        Iterator it = new LinkedHashSet(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((C1251XO) it.next()).m2557z();
        }
    }
}
