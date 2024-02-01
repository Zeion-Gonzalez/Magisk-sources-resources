package p000a;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: a.wk */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2587wk implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: R */
    public final /* synthetic */ Object f7916R;

    /* renamed from: S */
    public final /* synthetic */ int f7917S;

    public /* synthetic */ ViewTreeObserverOnPreDrawListenerC2587wk(int i, Object obj) {
        this.f7917S = i;
        this.f7916R = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.f7917S;
        Object obj = this.f7916R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((CoordinatorLayout) obj).m4786q(0);
                return true;
            default:
                AbstractC0251En abstractC0251En = (AbstractC0251En) obj;
                float rotation = abstractC0251En.f893k.getRotation();
                if (abstractC0251En.f885R != rotation) {
                    abstractC0251En.f885R = rotation;
                    abstractC0251En.mo539R();
                }
                return true;
        }
    }
}
