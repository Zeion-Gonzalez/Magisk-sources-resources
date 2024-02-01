package p000a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: a.Dq */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0201Dq implements View.OnTouchListener {

    /* renamed from: S */
    public final /* synthetic */ GestureDetector f607S;

    public ViewOnTouchListenerC0201Dq(GestureDetector gestureDetector) {
        this.f607S = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f607S.onTouchEvent(motionEvent);
        }
        return false;
    }
}
