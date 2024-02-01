package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.AbstractC1131VA;
import p000a.AbstractC1285Y3;
import p000a.AbstractC2446u3;
import p000a.InterfaceC0880QV;
import p000a.ViewTreeObserverOnPreDrawListenerC0853Pv;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC1131VA {

    /* renamed from: z */
    public int f9551z;

    public ExpandableBehavior() {
        this.f9551z = 0;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: P */
    public final boolean mo2316P(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z;
        InterfaceC0880QV interfaceC0880QV = (InterfaceC0880QV) view2;
        boolean z2 = ((FloatingActionButton) interfaceC0880QV).f9368f.f7758z;
        int i = 2;
        int i2 = this.f9551z;
        if (!z2 ? i2 != 1 : i2 != 0 && i2 != 2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (z2) {
            i = 1;
        }
        this.f9551z = i;
        mo5117g((View) interfaceC0880QV, view, z2, true);
        return true;
    }

    /* renamed from: g */
    public abstract void mo5117g(View view, View view2, boolean z, boolean z2);

    @Override // p000a.AbstractC1131VA
    /* renamed from: h */
    public abstract boolean mo2321h(View view, View view2);

    @Override // p000a.AbstractC1131VA
    /* renamed from: o */
    public final boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC0880QV interfaceC0880QV;
        boolean z;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (!AbstractC1285Y3.m2635v(view)) {
            ArrayList m4778M = coordinatorLayout.m4778M(view);
            int size = m4778M.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    View view2 = (View) m4778M.get(i2);
                    if (mo2321h(view, view2)) {
                        interfaceC0880QV = (InterfaceC0880QV) view2;
                        break;
                    }
                    i2++;
                } else {
                    interfaceC0880QV = null;
                    break;
                }
            }
            if (interfaceC0880QV != null) {
                boolean z2 = ((FloatingActionButton) interfaceC0880QV).f9368f.f7758z;
                int i3 = 2;
                int i4 = this.f9551z;
                if (!z2 ? i4 != 1 : i4 != 0 && i4 != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (z2) {
                        i3 = 1;
                    }
                    this.f9551z = i3;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0853Pv(this, view, i3, interfaceC0880QV));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f9551z = 0;
    }
}
