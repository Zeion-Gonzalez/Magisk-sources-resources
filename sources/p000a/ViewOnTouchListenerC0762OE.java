package p000a;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: a.OE */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0762OE implements View.OnTouchListener {

    /* renamed from: I */
    public final int f2579I;

    /* renamed from: R */
    public final int f2580R;

    /* renamed from: S */
    public final Dialog f2581S;

    /* renamed from: w */
    public final int f2582w;

    public ViewOnTouchListenerC0762OE(Dialog dialog, Rect rect) {
        this.f2581S = dialog;
        this.f2580R = rect.left;
        this.f2582w = rect.top;
        this.f2579I = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f2580R;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f2582w, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f2579I;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f2581S.onTouchEvent(obtain);
    }
}
