package p000a;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: a.rf */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2320rf implements View.OnTouchListener {

    /* renamed from: S */
    public final /* synthetic */ C0660MU f7148S;

    public ViewOnTouchListenerC2320rf(C0660MU c0660mu) {
        this.f7148S = c0660mu;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1630ef c1630ef;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0660MU c0660mu = this.f7148S;
        if (action == 0 && (c1630ef = c0660mu.f2138i) != null && c1630ef.isShowing() && x >= 0) {
            C1630ef c1630ef2 = c0660mu.f2138i;
            if (x < c1630ef2.getWidth() && y >= 0 && y < c1630ef2.getHeight()) {
                c0660mu.f2121C.postDelayed(c0660mu.f2135e, 250L);
                return false;
            }
        }
        if (action != 1) {
            return false;
        }
        c0660mu.f2121C.removeCallbacks(c0660mu.f2135e);
        return false;
    }
}
