package p000a;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: a.Cd */
/* loaded from: classes.dex */
public abstract class AbstractC0136Cd {
    /* renamed from: h */
    public static void m275h(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }

    /* renamed from: z */
    public static void m276z(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }
}
