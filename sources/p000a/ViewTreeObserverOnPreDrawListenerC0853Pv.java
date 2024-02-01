package p000a;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: a.Pv */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0853Pv implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: I */
    public final /* synthetic */ ExpandableBehavior f2885I;

    /* renamed from: R */
    public final /* synthetic */ int f2886R;

    /* renamed from: S */
    public final /* synthetic */ View f2887S;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC0880QV f2888w;

    public ViewTreeObserverOnPreDrawListenerC0853Pv(ExpandableBehavior expandableBehavior, View view, int i, InterfaceC0880QV interfaceC0880QV) {
        this.f2885I = expandableBehavior;
        this.f2887S = view;
        this.f2886R = i;
        this.f2888w = interfaceC0880QV;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f2887S;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f2885I;
        if (expandableBehavior.f9551z == this.f2886R) {
            InterfaceC0880QV interfaceC0880QV = this.f2888w;
            expandableBehavior.mo5117g((View) interfaceC0880QV, view, ((FloatingActionButton) interfaceC0880QV).f9368f.f7758z, false);
        }
        return false;
    }
}
