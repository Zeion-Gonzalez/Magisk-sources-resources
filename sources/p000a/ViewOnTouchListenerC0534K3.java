package p000a;

import android.view.MotionEvent;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.K3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0534K3 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if ((motionEvent.getFlags() & 1) == 0 && (motionEvent.getFlags() & 2) == 0) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            AbstractC0795Op.m1871tJ(AbstractC1743gn.m3275z(), R.string.touch_filtered_warning, 0);
        }
        return C1212We.f3969z.m2497P();
    }
}
