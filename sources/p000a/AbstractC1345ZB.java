package p000a;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* renamed from: a.ZB */
/* loaded from: classes.dex */
public abstract class AbstractC1345ZB {
    /* renamed from: N */
    public static boolean m2730N(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }

    /* renamed from: P */
    public static void m2731P(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* renamed from: Q */
    public static void m2732Q(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    /* renamed from: h */
    public static void m2733h(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    /* renamed from: v */
    public static void m2734v(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* renamed from: z */
    public static void m2735z(View view) {
        view.cancelDragAndDrop();
    }
}
