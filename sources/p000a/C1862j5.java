package p000a;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: a.j5 */
/* loaded from: classes.dex */
public final class C1862j5 {

    /* renamed from: G */
    public static final C1862j5 f5820G;

    /* renamed from: M */
    public static final C1862j5 f5821M;

    /* renamed from: N */
    public static final C1862j5 f5822N;

    /* renamed from: Q */
    public static final C1862j5 f5823Q;

    /* renamed from: V */
    public static final C1862j5 f5824V;

    /* renamed from: W */
    public static final C1862j5 f5825W;

    /* renamed from: o */
    public static final C1862j5 f5826o;

    /* renamed from: u */
    public static final C1862j5 f5827u;

    /* renamed from: P */
    public final InterfaceC0491JG f5828P;

    /* renamed from: h */
    public final int f5829h;

    /* renamed from: v */
    public final Class f5830v;

    /* renamed from: z */
    public final Object f5831z;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        new C1862j5(1);
        new C1862j5(2);
        new C1862j5(4);
        new C1862j5(8);
        f5822N = new C1862j5(16);
        new C1862j5(32);
        new C1862j5(64);
        new C1862j5(128);
        new C1862j5(256, AbstractC2019lz.class);
        new C1862j5(512, AbstractC2019lz.class);
        new C1862j5(1024, AbstractC1686fi.class);
        new C1862j5(2048, AbstractC1686fi.class);
        f5823Q = new C1862j5(4096);
        f5827u = new C1862j5(8192);
        new C1862j5(16384);
        new C1862j5(32768);
        new C1862j5(65536);
        new C1862j5(131072, AbstractC0275FE.class);
        f5826o = new C1862j5(262144);
        f5825W = new C1862j5(524288);
        f5820G = new C1862j5(1048576);
        new C1862j5(2097152, AbstractC2606x3.class);
        int i = Build.VERSION.SDK_INT;
        new C1862j5(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new C1862j5(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, AbstractC1102Uf.class);
        f5821M = new C1862j5(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new C1862j5(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        f5824V = new C1862j5(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new C1862j5(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        new C1862j5(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
        if (i >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new C1862j5(accessibilityAction, 16908359, null, null, null);
        new C1862j5(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
        if (i >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new C1862j5(accessibilityAction2, 16908361, null, null, null);
        new C1862j5(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        if (i >= 24) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new C1862j5(accessibilityAction3, 16908349, null, null, AbstractC1119Ux.class);
        new C1862j5(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, AbstractC2537vk.class);
        if (i >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new C1862j5(accessibilityAction4, 16908356, null, null, null);
        if (i >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new C1862j5(accessibilityAction5, 16908357, null, null, null);
        new C1862j5(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
        if (i >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new C1862j5(accessibilityAction6, 16908372, null, null, null);
        new C1862j5(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
        if (i >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new C1862j5(accessibilityAction7, 16908374, null, null, null);
        if (i >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new C1862j5(accessibilityAction8, 16908375, null, null, null);
        if (i >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new C1862j5(accessibilityAction9, 16908376, null, null, null);
        new C1862j5(i >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, 16908382, null, null, null);
    }

    public C1862j5(int i) {
        this(null, i, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1862j5)) {
            return false;
        }
        Object obj2 = ((C1862j5) obj).f5831z;
        Object obj3 = this.f5831z;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f5831z;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String m3344P = C1799hs.m3344P(this.f5829h);
        if (m3344P.equals("ACTION_UNKNOWN")) {
            Object obj = this.f5831z;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                m3344P = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(m3344P);
        return sb.toString();
    }

    /* renamed from: z */
    public final int m3486z() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f5831z).getId();
    }

    public C1862j5(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C1862j5(Object obj, int i, String str, InterfaceC0491JG interfaceC0491JG, Class cls) {
        this.f5829h = i;
        this.f5828P = interfaceC0491JG;
        this.f5831z = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, str) : obj;
        this.f5830v = cls;
    }
}
