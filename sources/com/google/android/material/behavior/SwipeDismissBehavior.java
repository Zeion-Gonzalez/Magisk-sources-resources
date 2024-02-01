package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p000a.AbstractC1131VA;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0737Nq;
import p000a.C1399aF;
import p000a.C1862j5;
import p000a.C2196pM;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC1131VA {

    /* renamed from: P */
    public boolean f9218P;

    /* renamed from: h */
    public C2196pM f9221h;

    /* renamed from: v */
    public boolean f9224v;

    /* renamed from: z */
    public C0737Nq f9225z;

    /* renamed from: N */
    public int f9217N = 2;

    /* renamed from: Q */
    public final float f9219Q = 0.5f;

    /* renamed from: u */
    public float f9223u = 0.0f;

    /* renamed from: o */
    public float f9222o = 0.5f;

    /* renamed from: W */
    public final C1399aF f9220W = new C1399aF(this);

    /* renamed from: g */
    public boolean mo5002g(View view) {
        return true;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: k */
    public final boolean mo2322k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f9225z == null) {
            return false;
        }
        if (this.f9218P && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f9225z.m1691M(motionEvent);
        return true;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: o */
    public final boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC2397t8.m4129v(view) == 0) {
            AbstractC2397t8.m4123g(view, 1);
            AbstractC2446u3.m4222W(view, 1048576);
            AbstractC2446u3.m4225u(view, 0);
            if (mo5002g(view)) {
                AbstractC2446u3.m4214G(view, C1862j5.f5820G, new C2196pM(18, this));
            }
        }
        return false;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: u */
    public boolean mo2325u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f9224v;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f9224v = false;
            }
        } else {
            z = coordinatorLayout.m4777I(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9224v = z;
        }
        if (!z) {
            return false;
        }
        if (this.f9225z == null) {
            this.f9225z = new C0737Nq(coordinatorLayout.getContext(), coordinatorLayout, this.f9220W);
        }
        if (!this.f9218P && this.f9225z.m1701k(motionEvent)) {
            return true;
        }
        return false;
    }
}
