package p000a;

import android.widget.PopupWindow;

/* renamed from: a.Xb */
/* loaded from: classes.dex */
public abstract class AbstractC1259Xb {
    /* renamed from: P */
    public static void m2559P(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    /* renamed from: h */
    public static int m2560h(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    /* renamed from: v */
    public static void m2561v(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    /* renamed from: z */
    public static boolean m2562z(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }
}
