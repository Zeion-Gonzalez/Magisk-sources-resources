package p000a;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: a.wi */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2585wi implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: R */
    public final /* synthetic */ View f7911R;

    /* renamed from: S */
    public final /* synthetic */ int f7912S;

    /* renamed from: w */
    public final /* synthetic */ C0489JE f7913w;

    public /* synthetic */ ViewTreeObserverOnPreDrawListenerC2585wi(C0489JE c0489je, View view, int i) {
        this.f7912S = i;
        this.f7913w = c0489je;
        this.f7911R = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z;
        boolean z2;
        int i = this.f7912S;
        View view = this.f7911R;
        C0489JE c0489je = this.f7913w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                switch (((C1447b9) c0489je.f1640h).f4529S) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        z2 = false;
                        break;
                    default:
                        z2 = !AbstractActivityC2427tj.f7429nP;
                        break;
                }
                if (z2) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                switch (((C1447b9) ((C0005A5) c0489je).f1640h).f4529S) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        z = false;
                        break;
                    default:
                        z = !AbstractActivityC2427tj.f7429nP;
                        break;
                }
                if (z) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
