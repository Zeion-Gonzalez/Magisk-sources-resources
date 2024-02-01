package p000a;

import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.concurrent.Callable;

/* renamed from: a.Nh */
/* loaded from: classes.dex */
public final class RunnableC0729Nh implements Runnable {

    /* renamed from: I */
    public final Object f2456I;

    /* renamed from: R */
    public final Object f2457R;

    /* renamed from: S */
    public final /* synthetic */ int f2458S;

    /* renamed from: w */
    public final Object f2459w;

    public /* synthetic */ RunnableC0729Nh(int i, Object obj, Object obj2, Object obj3) {
        this.f2458S = i;
        this.f2456I = obj;
        this.f2457R = obj2;
        this.f2459w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AbstractC2527vY abstractC2527vY;
        OverScroller overScroller;
        int i = this.f2458S;
        Object obj2 = this.f2456I;
        Object obj3 = this.f2459w;
        Object obj4 = this.f2457R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Typeface typeface = (Typeface) obj3;
                AbstractC2703z2 abstractC2703z2 = (AbstractC2703z2) ((C2196pM) obj4).f6755R;
                if (abstractC2703z2 != null) {
                    abstractC2703z2.mo777oI(typeface);
                    return;
                }
                return;
            case 1:
                ((InterfaceC1617eQ) obj4).mo2146z(obj3);
                return;
            case 2:
                try {
                    obj = ((Callable) obj4).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) obj2).post(new RunnableC0729Nh(1, this, (InterfaceC1617eQ) obj3, obj));
                return;
            case 3:
                View view = (View) obj3;
                if (view != null && (overScroller = (abstractC2527vY = (AbstractC2527vY) obj2).f7736P) != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj4;
                    if (overScroller.computeScrollOffset()) {
                        abstractC2527vY.m4361E(coordinatorLayout, view, abstractC2527vY.f7736P.getCurrY());
                        AbstractC2397t8.m4120S(view, this);
                        return;
                    }
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    ((AppBarLayout.BaseBehavior) abstractC2527vY).m4997c(coordinatorLayout, appBarLayout);
                    if (appBarLayout.f9168U) {
                        appBarLayout.m4982G(appBarLayout.m4983M(AppBarLayout.BaseBehavior.m4993r(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((C1773hL) obj2).m3303o((View) obj4, (FrameLayout) obj3);
                return;
        }
    }
}
