package p000a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: a.gj */
/* loaded from: classes.dex */
public class C1739gj extends AbstractC0119CI {
    @Override // p000a.AbstractC0119CI
    /* renamed from: G */
    public final Object mo163G(Object obj, Object obj2) {
        C2524vT c2524vT = new C2524vT();
        if (obj != null) {
            c2524vT.m4358d((AbstractC0614LY) obj);
        }
        c2524vT.m4358d((AbstractC0614LY) obj2);
        return c2524vT;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: I */
    public final void mo164I(Object obj, View view, ArrayList arrayList) {
        C2524vT c2524vT = (C2524vT) obj;
        ArrayList arrayList2 = c2524vT.f2010k;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0119CI.m245P((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo172h(c2524vT, arrayList);
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: M */
    public final void mo165M(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0614LY) obj).mo1385z(new C0666Mc(view, arrayList));
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: N */
    public final boolean mo166N(Object obj) {
        return obj instanceof AbstractC0614LY;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: Q */
    public final Object mo167Q(Object obj) {
        if (obj != null) {
            return ((AbstractC0614LY) obj).clone();
        }
        return null;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: R */
    public final void mo168R(Object obj, Rect rect) {
        ((AbstractC0614LY) obj).mo1361F(new C1443b3());
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: S */
    public final void mo169S(View view, Object obj) {
        if (view != null) {
            AbstractC0119CI.m247u(view, new Rect());
            ((AbstractC0614LY) obj).mo1361F(new C1443b3());
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: V */
    public final void mo170V(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC0614LY) obj).mo1385z(new C2063ms(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: W */
    public final Object mo171W(Object obj, Object obj2, Object obj3) {
        AbstractC0614LY abstractC0614LY = (AbstractC0614LY) obj;
        AbstractC0614LY abstractC0614LY2 = (AbstractC0614LY) obj2;
        AbstractC0614LY abstractC0614LY3 = (AbstractC0614LY) obj3;
        if (abstractC0614LY != null && abstractC0614LY2 != null) {
            C2524vT c2524vT = new C2524vT();
            c2524vT.m4358d(abstractC0614LY);
            c2524vT.m4358d(abstractC0614LY2);
            c2524vT.m4360x(1);
            abstractC0614LY = c2524vT;
        } else if (abstractC0614LY == null) {
            abstractC0614LY = abstractC0614LY2 != null ? abstractC0614LY2 : null;
        }
        if (abstractC0614LY3 == null) {
            return abstractC0614LY;
        }
        C2524vT c2524vT2 = new C2524vT();
        if (abstractC0614LY != null) {
            c2524vT2.m4358d(abstractC0614LY);
        }
        c2524vT2.m4358d(abstractC0614LY3);
        return c2524vT2;
    }

    /* renamed from: g */
    public final void m3268g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int size;
        AbstractC0614LY abstractC0614LY;
        AbstractC0614LY abstractC0614LY2 = (AbstractC0614LY) obj;
        int i = 0;
        if (abstractC0614LY2 instanceof C2524vT) {
            C2524vT c2524vT = (C2524vT) abstractC0614LY2;
            int size2 = c2524vT.f7729L.size();
            while (i < size2) {
                if (i >= 0 && i < c2524vT.f7729L.size()) {
                    abstractC0614LY = (AbstractC0614LY) c2524vT.f7729L.get(i);
                } else {
                    abstractC0614LY = null;
                }
                m3268g(abstractC0614LY, arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (AbstractC0119CI.m246o(abstractC0614LY2.f2011q) && AbstractC0119CI.m246o(null) && AbstractC0119CI.m246o(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ArrayList arrayList3 = abstractC0614LY2.f2010k;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    abstractC0614LY2.mo1383v((View) arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        abstractC0614LY2.mo1374c((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: h */
    public final void mo172h(Object obj, ArrayList arrayList) {
        boolean z;
        AbstractC0614LY abstractC0614LY;
        AbstractC0614LY abstractC0614LY2 = (AbstractC0614LY) obj;
        if (abstractC0614LY2 == null) {
            return;
        }
        int i = 0;
        if (abstractC0614LY2 instanceof C2524vT) {
            C2524vT c2524vT = (C2524vT) abstractC0614LY2;
            int size = c2524vT.f7729L.size();
            while (i < size) {
                if (i >= 0 && i < c2524vT.f7729L.size()) {
                    abstractC0614LY = (AbstractC0614LY) c2524vT.f7729L.get(i);
                } else {
                    abstractC0614LY = null;
                }
                mo172h(abstractC0614LY, arrayList);
                i++;
            }
            return;
        }
        if (AbstractC0119CI.m246o(abstractC0614LY2.f2011q) && AbstractC0119CI.m246o(null) && AbstractC0119CI.m246o(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && AbstractC0119CI.m246o(abstractC0614LY2.f2010k)) {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC0614LY2.mo1383v((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: k */
    public final Object mo173k(Object obj) {
        if (obj == null) {
            return null;
        }
        C2524vT c2524vT = new C2524vT();
        c2524vT.m4358d((AbstractC0614LY) obj);
        return c2524vT;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: q */
    public final void mo174q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C2524vT c2524vT = (C2524vT) obj;
        if (c2524vT != null) {
            ArrayList arrayList3 = c2524vT.f2010k;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m3268g(c2524vT, arrayList, arrayList2);
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: v */
    public final void mo175v(ViewGroup viewGroup, Object obj) {
        AbstractC2299rI.m3956z(viewGroup, (AbstractC0614LY) obj);
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: w */
    public final void mo176w(Object obj, C1251XO c1251xo, RunnableC1547d8 runnableC1547d8) {
        AbstractC0614LY abstractC0614LY = (AbstractC0614LY) obj;
        c1251xo.m2556h(new C1624eZ(this, abstractC0614LY, 8));
        abstractC0614LY.mo1385z(new C0449IX(runnableC1547d8));
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: z */
    public final void mo178z(View view, Object obj) {
        ((AbstractC0614LY) obj).mo1383v(view);
    }
}
