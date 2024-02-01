package p000a;

import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: a.X7 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1238X7 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: R */
    public final /* synthetic */ Object f4019R;

    /* renamed from: S */
    public final /* synthetic */ int f4020S;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1238X7(int i, Object obj) {
        this.f4020S = i;
        this.f4019R = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        int i = this.f4020S;
        Object obj = this.f4019R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2184p9 c2184p9 = (C2184p9) obj;
                if (!c2184p9.f6688k.mo2210h()) {
                    c2184p9.f6688k.mo2205N(AbstractC1263Xf.m2564h(c2184p9), AbstractC1263Xf.m2566z(c2184p9));
                }
                ViewTreeObserver viewTreeObserver = c2184p9.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC2617xF.m4510z(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                C2178p2 c2178p2 = (C2178p2) obj;
                C2184p9 c2184p92 = c2178p2.f6672K;
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC1285Y3.m2633h(c2184p92) && c2184p92.getGlobalVisibleRect(c2178p2.f6674t)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    c2178p2.dismiss();
                    return;
                } else {
                    c2178p2.m3790g();
                    c2178p2.mo396Q();
                    return;
                }
        }
    }
}
