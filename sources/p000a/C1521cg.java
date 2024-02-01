package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: a.cg */
/* loaded from: classes.dex */
public final class C1521cg extends AbstractC1292YB {

    /* renamed from: R */
    public final /* synthetic */ int f4698R;

    /* renamed from: w */
    public final /* synthetic */ Object f4699w;

    public /* synthetic */ C1521cg(int i, Object obj) {
        this.f4698R = i;
        this.f4699w = obj;
    }

    @Override // p000a.AbstractC1292YB, p000a.InterfaceC0579Kq
    /* renamed from: v */
    public final void mo1310v() {
        int i = this.f4698R;
        Object obj = this.f4699w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((RunnableC0874QP) obj).f2962R.f4340C.setVisibility(0);
                return;
            case 1:
                LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = (LayoutInflaterFactory2C1392a6) obj;
                layoutInflaterFactory2C1392a6.f4340C.setVisibility(0);
                if (layoutInflaterFactory2C1392a6.f4340C.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1392a6.f4340C.getParent();
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1589dw.m3064v(view);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p000a.InterfaceC0579Kq
    /* renamed from: z */
    public final void mo1311z() {
        int i = this.f4698R;
        Object obj = this.f4699w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                RunnableC0874QP runnableC0874QP = (RunnableC0874QP) obj;
                runnableC0874QP.f2962R.f4340C.setAlpha(1.0f);
                LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = runnableC0874QP.f2962R;
                layoutInflaterFactory2C1392a6.f4350L.m1934P(null);
                layoutInflaterFactory2C1392a6.f4350L = null;
                return;
            case 1:
                LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a62 = (LayoutInflaterFactory2C1392a6) obj;
                layoutInflaterFactory2C1392a62.f4340C.setAlpha(1.0f);
                layoutInflaterFactory2C1392a62.f4350L.m1934P(null);
                layoutInflaterFactory2C1392a62.f4350L = null;
                return;
            default:
                C1394a8 c1394a8 = (C1394a8) obj;
                c1394a8.f4393h.f4340C.setVisibility(8);
                LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a63 = c1394a8.f4393h;
                PopupWindow popupWindow = layoutInflaterFactory2C1392a63.f4380p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1392a63.f4340C.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1392a63.f4340C.getParent();
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1589dw.m3064v(view);
                }
                layoutInflaterFactory2C1392a63.f4340C.m4704N();
                layoutInflaterFactory2C1392a63.f4350L.m1934P(null);
                layoutInflaterFactory2C1392a63.f4350L = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1392a63.f4365d;
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                AbstractC1589dw.m3064v(viewGroup);
                return;
        }
    }
}
