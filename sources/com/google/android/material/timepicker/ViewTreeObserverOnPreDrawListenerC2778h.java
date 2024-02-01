package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.h */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2778h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: S */
    public final /* synthetic */ ClockFaceView f9548S;

    public ViewTreeObserverOnPreDrawListenerC2778h(ClockFaceView clockFaceView) {
        this.f9548S = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f9548S;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f9516C.f9531I) - clockFaceView.f9529x;
        if (height != clockFaceView.f3121e) {
            clockFaceView.f3121e = height;
            clockFaceView.mo2065V();
            int i = clockFaceView.f3121e;
            ClockHandView clockHandView = clockFaceView.f9516C;
            clockHandView.f9535f = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
