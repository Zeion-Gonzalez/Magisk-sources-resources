package p000a;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: a.j6 */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1863j6 implements View.OnTouchListener {

    /* renamed from: S */
    public final InterfaceC0684Mx f5832S;

    public ViewOnTouchListenerC1863j6(InterfaceC0684Mx interfaceC0684Mx) {
        this.f5832S = interfaceC0684Mx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C1885jV c1885jV = (C1885jV) ((C1240X9) this.f5832S).f2595B;
        if (c1885jV != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1885jV.f5888J.cancel();
            C2521vQ c2521vQ = c1885jV.f5889U;
            if (c2521vQ.f7720h != 0) {
                c2521vQ.f7720h = 0;
                c2521vQ.f7721v.mo1709Q(7);
            }
        }
        return false;
    }
}
