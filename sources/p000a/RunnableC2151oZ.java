package p000a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.oZ */
/* loaded from: classes.dex */
public final class RunnableC2151oZ implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ AbstractViewOnTouchListenerC0233ER f6615R;

    /* renamed from: S */
    public final /* synthetic */ int f6616S;

    public /* synthetic */ RunnableC2151oZ(AbstractViewOnTouchListenerC0233ER abstractViewOnTouchListenerC0233ER, int i) {
        this.f6616S = i;
        this.f6615R = abstractViewOnTouchListenerC0233ER;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6616S;
        AbstractViewOnTouchListenerC0233ER abstractViewOnTouchListenerC0233ER = this.f6615R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ViewParent parent = abstractViewOnTouchListenerC0233ER.f749I.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                abstractViewOnTouchListenerC0233ER.m472z();
                View view = abstractViewOnTouchListenerC0233ER.f749I;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0233ER.mo471v()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0233ER.f752g = true;
                    return;
                }
                return;
        }
    }
}
