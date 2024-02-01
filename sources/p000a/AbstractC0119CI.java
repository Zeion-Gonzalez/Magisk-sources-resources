package p000a;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a.CI */
/* loaded from: classes.dex */
public abstract class AbstractC0119CI {
    /* renamed from: P */
    public static void m245P(View view, List list) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (list.get(i) == view) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC1548d9.m2997M(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            }
                            i4++;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2 && AbstractC1548d9.m2997M(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public static boolean m246o(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: u */
    public static void m247u(View view, Rect rect) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (!AbstractC1285Y3.m2633h(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: G */
    public abstract Object mo163G(Object obj, Object obj2);

    /* renamed from: I */
    public abstract void mo164I(Object obj, View view, ArrayList arrayList);

    /* renamed from: M */
    public abstract void mo165M(Object obj, View view, ArrayList arrayList);

    /* renamed from: N */
    public abstract boolean mo166N(Object obj);

    /* renamed from: Q */
    public abstract Object mo167Q(Object obj);

    /* renamed from: R */
    public abstract void mo168R(Object obj, Rect rect);

    /* renamed from: S */
    public abstract void mo169S(View view, Object obj);

    /* renamed from: V */
    public abstract void mo170V(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* renamed from: W */
    public abstract Object mo171W(Object obj, Object obj2, Object obj3);

    /* renamed from: h */
    public abstract void mo172h(Object obj, ArrayList arrayList);

    /* renamed from: k */
    public abstract Object mo173k(Object obj);

    /* renamed from: q */
    public abstract void mo174q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: v */
    public abstract void mo175v(ViewGroup viewGroup, Object obj);

    /* renamed from: w */
    public abstract void mo176w(Object obj, C1251XO c1251xo, RunnableC1547d8 runnableC1547d8);

    /* renamed from: z */
    public abstract void mo178z(View view, Object obj);
}
