package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000a.C0506JZ;
import p000a.C1848im;
import p000a.C2196pM;
import p000a.C2671yR;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: G */
    public final C2196pM f9415G = new C2196pM(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: g */
    public final boolean mo5002g(View view) {
        this.f9415G.getClass();
        return view instanceof Snackbar$SnackbarLayout;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000a.AbstractC1131VA
    /* renamed from: u */
    public final boolean mo2325u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C2196pM c2196pM = this.f9415G;
        c2196pM.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C2671yR.m4574h().m4575N((C0506JZ) c2196pM.f6755R);
            }
        } else if (coordinatorLayout.m4777I(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C2671yR m4574h = C2671yR.m4574h();
            C0506JZ c0506jz = (C0506JZ) c2196pM.f6755R;
            synchronized (m4574h.f8322z) {
                if (m4574h.m4579v(c0506jz)) {
                    C1848im c1848im = m4574h.f8321v;
                    if (!c1848im.f5771v) {
                        c1848im.f5771v = true;
                        m4574h.f8320h.removeCallbacksAndMessages(c1848im);
                    }
                }
            }
        }
        return super.mo2325u(coordinatorLayout, view, motionEvent);
    }
}
