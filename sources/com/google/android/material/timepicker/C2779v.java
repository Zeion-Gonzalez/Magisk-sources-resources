package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.topjohnwu.magisk.R;
import p000a.C0963S3;
import p000a.C1555dG;
import p000a.C1799hs;
import p000a.C1862j5;

/* renamed from: com.google.android.material.timepicker.v */
/* loaded from: classes.dex */
public final class C2779v extends C1555dG {

    /* renamed from: P */
    public final /* synthetic */ ClockFaceView f9549P;

    public C2779v(ClockFaceView clockFaceView) {
        this.f9549P = clockFaceView;
    }

    @Override // p000a.C1555dG
    /* renamed from: P */
    public final void mo373P(View view, C1799hs c1799hs) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4810z;
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f9549P.f9523i.get(intValue - 1));
        }
        c1799hs.m3345G(C0963S3.m2147z(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c1799hs.m3350h(C1862j5.f5822N);
    }

    @Override // p000a.C1555dG
    /* renamed from: u */
    public final boolean mo1133u(View view, int i, Bundle bundle) {
        if (i == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f9549P;
            view.getHitRect(clockFaceView.f9527p);
            float centerX = clockFaceView.f9527p.centerX();
            float centerY = clockFaceView.f9527p.centerY();
            clockFaceView.f9516C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f9516C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.mo1133u(view, i, bundle);
    }
}
