package p000a;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: a.zo */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC2743zo implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: z */
    public final /* synthetic */ CoordinatorLayout f8598z;

    public ViewGroupOnHierarchyChangeListenerC2743zo(CoordinatorLayout coordinatorLayout) {
        this.f8598z = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f8598z.f8906e;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f8598z;
        coordinatorLayout.m4786q(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f8906e;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
