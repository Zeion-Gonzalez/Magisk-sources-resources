package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* renamed from: a.hX */
/* loaded from: classes.dex */
public abstract class AbstractC1783hX {
    /* renamed from: N */
    public static void m3309N(View view, ContentCaptureSession contentCaptureSession) {
        view.setContentCaptureSession(contentCaptureSession);
    }

    /* renamed from: P */
    public static void m3310P(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* renamed from: Q */
    public static void m3311Q(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    /* renamed from: h */
    public static ContentCaptureSession m3312h(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: v */
    public static List<Rect> m3313v(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: z */
    public static View.AccessibilityDelegate m3314z(View view) {
        return view.getAccessibilityDelegate();
    }
}
