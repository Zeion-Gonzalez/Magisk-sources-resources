package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.u3 */
/* loaded from: classes.dex */
public abstract class AbstractC2446u3 {

    /* renamed from: N */
    public static final C2109nl f7483N;

    /* renamed from: P */
    public static final int[] f7484P;

    /* renamed from: Q */
    public static final ViewTreeObserverOnGlobalLayoutListenerC2337ry f7485Q;

    /* renamed from: h */
    public static Field f7486h;

    /* renamed from: v */
    public static boolean f7487v;

    /* renamed from: z */
    public static WeakHashMap f7488z;

    static {
        new AtomicInteger(1);
        f7488z = null;
        f7487v = false;
        f7484P = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f7483N = new C2109nl();
        f7485Q = new ViewTreeObserverOnGlobalLayoutListenerC2337ry();
    }

    /* renamed from: G */
    public static void m4214G(View view, C1862j5 c1862j5, InterfaceC0491JG interfaceC0491JG) {
        C1555dG c1555dG;
        C1862j5 c1862j52 = new C1862j5(null, c1862j5.f5829h, null, interfaceC0491JG, c1862j5.f5830v);
        View.AccessibilityDelegate m4226v = m4226v(view);
        if (m4226v == null) {
            c1555dG = null;
        } else if (m4226v instanceof C0080BX) {
            c1555dG = ((C0080BX) m4226v).f313z;
        } else {
            c1555dG = new C1555dG(m4226v);
        }
        if (c1555dG == null) {
            c1555dG = new C1555dG();
        }
        m4221V(view, c1555dG);
        m4222W(view, c1862j52.m3486z());
        m4216N(view).add(c1862j52);
        m4225u(view, 0);
    }

    /* renamed from: M */
    public static void m4215M(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1783hX.m3310P(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: N */
    public static ArrayList m4216N(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: P */
    public static CharSequence m4217P(View view) {
        return (CharSequence) new C2588wm(R.id.tag_accessibility_pane_title, 8, 28, 1).m2971h(view);
    }

    /* renamed from: Q */
    public static String[] m4218Q(View view) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC1283Y1.m2627z(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: R */
    public static void m4219R(View view, C2196pM c2196pM) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            if (c2196pM != null) {
                pointerIcon = (PointerIcon) c2196pM.f6755R;
            } else {
                pointerIcon = null;
            }
            AbstractC1345ZB.m2731P(view, AbstractC1334Z0.m2718P(pointerIcon));
        }
    }

    /* renamed from: S */
    public static void m4220S(View view, CharSequence charSequence) {
        boolean z = true;
        new C2588wm(R.id.tag_accessibility_pane_title, 8, 28, z ? 1 : 0).m2972v(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC2337ry viewTreeObserverOnGlobalLayoutListenerC2337ry = f7485Q;
        if (charSequence != null) {
            WeakHashMap weakHashMap = viewTreeObserverOnGlobalLayoutListenerC2337ry.f7176S;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2337ry);
            if (AbstractC1285Y3.m2633h(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2337ry);
                return;
            }
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC2337ry.f7176S.remove(view);
        view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2337ry);
        AbstractC2397t8.m4130w(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC2337ry);
    }

    /* renamed from: V */
    public static void m4221V(View view, C1555dG c1555dG) {
        C0080BX c0080bx;
        if (c1555dG == null && (m4226v(view) instanceof C0080BX)) {
            c1555dG = new C1555dG();
        }
        if (AbstractC2397t8.m4129v(view) == 0) {
            AbstractC2397t8.m4123g(view, 1);
        }
        if (c1555dG == null) {
            c0080bx = null;
        } else {
            c0080bx = c1555dG.f4809h;
        }
        view.setAccessibilityDelegate(c0080bx);
    }

    /* renamed from: W */
    public static void m4222W(View view, int i) {
        ArrayList m4216N = m4216N(view);
        for (int i2 = 0; i2 < m4216N.size(); i2++) {
            if (((C1862j5) m4216N.get(i2)).m3486z() == i) {
                m4216N.remove(i2);
                return;
            }
        }
    }

    /* renamed from: h */
    public static boolean m4223h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C1924kB.f5984P;
        C1924kB c1924kB = (C1924kB) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c1924kB == null) {
            c1924kB = new C1924kB();
            view.setTag(R.id.tag_unhandled_key_event_manager, c1924kB);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c1924kB.f5987z;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C1924kB.f5984P;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (c1924kB.f5987z == null) {
                        c1924kB.f5987z = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = C1924kB.f5984P;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            c1924kB.f5987z.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c1924kB.f5987z.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m3549z = c1924kB.m3549z(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m3549z != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c1924kB.f5985h == null) {
                    c1924kB.f5985h = new SparseArray();
                }
                c1924kB.f5985h.put(keyCode, new WeakReference(m3549z));
            }
        }
        if (m3549z == null) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static C0671Mh m4224o(View view, C0671Mh c0671Mh) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0671Mh + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1283Y1.m2625h(view, c0671Mh);
        }
        InterfaceC0076BT interfaceC0076BT = (InterfaceC0076BT) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2138oK interfaceC2138oK = f7483N;
        if (interfaceC0076BT != null) {
            C0671Mh m4020z = ((C2344s5) interfaceC0076BT).m4020z(view, c0671Mh);
            if (m4020z == null) {
                return null;
            }
            if (view instanceof InterfaceC2138oK) {
                interfaceC2138oK = (InterfaceC2138oK) view;
            }
            return interfaceC2138oK.mo3169z(m4020z);
        }
        if (view instanceof InterfaceC2138oK) {
            interfaceC2138oK = (InterfaceC2138oK) view;
        }
        return interfaceC2138oK.mo3169z(c0671Mh);
    }

    /* renamed from: u */
    public static void m4225u(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (m4217P(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (AbstractC1285Y3.m2636z(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                AbstractC1285Y3.m2634u(obtain, i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(m4217P(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    AbstractC1285Y3.m2630N(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = 2048;
        }
        obtain2.setEventType(i2);
        AbstractC1285Y3.m2634u(obtain2, i);
        if (z) {
            obtain2.getText().add(m4217P(view));
            if (AbstractC2397t8.m4129v(view) == 0) {
                AbstractC2397t8.m4123g(view, 1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* renamed from: v */
    public static View.AccessibilityDelegate m4226v(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1783hX.m3314z(view);
        }
        if (f7487v) {
            return null;
        }
        if (f7486h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7486h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7487v = true;
                return null;
            }
        }
        Object obj = f7486h.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    /* renamed from: z */
    public static C0831PV m4227z(View view) {
        if (f7488z == null) {
            f7488z = new WeakHashMap();
        }
        C0831PV c0831pv = (C0831PV) f7488z.get(view);
        if (c0831pv != null) {
            return c0831pv;
        }
        C0831PV c0831pv2 = new C0831PV(view);
        f7488z.put(view, c0831pv2);
        return c0831pv2;
    }
}
