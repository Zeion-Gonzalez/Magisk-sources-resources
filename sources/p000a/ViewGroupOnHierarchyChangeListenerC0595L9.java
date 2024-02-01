package p000a;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;

/* renamed from: a.L9 */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC0595L9 implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: h */
    public final /* synthetic */ Activity f1917h;

    /* renamed from: z */
    public final /* synthetic */ C0005A5 f1918z;

    public ViewGroupOnHierarchyChangeListenerC0595L9(C0005A5 c0005a5, Activity activity) {
        this.f1918z = c0005a5;
        this.f1917h = activity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        if (AbstractC0804P.m1904q(view2)) {
            SplashScreenView m1890G = AbstractC0804P.m1890G(view2);
            C0005A5 c0005a5 = this.f1918z;
            c0005a5.getClass();
            build = AbstractC0957Ry.m2137o().build();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = m1890G.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
            c0005a5.getClass();
            ((ViewGroup) this.f1917h.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
