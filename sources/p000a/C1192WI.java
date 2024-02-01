package p000a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: a.WI */
/* loaded from: classes.dex */
public final class C1192WI extends AbstractC2747zu {

    /* renamed from: g */
    public static TimeInterpolator f3870g;

    /* renamed from: o */
    public final ArrayList f3879o = new ArrayList();

    /* renamed from: W */
    public final ArrayList f3877W = new ArrayList();

    /* renamed from: G */
    public final ArrayList f3871G = new ArrayList();

    /* renamed from: M */
    public final ArrayList f3873M = new ArrayList();

    /* renamed from: V */
    public final ArrayList f3876V = new ArrayList();

    /* renamed from: S */
    public final ArrayList f3875S = new ArrayList();

    /* renamed from: R */
    public final ArrayList f3874R = new ArrayList();

    /* renamed from: w */
    public final ArrayList f3881w = new ArrayList();

    /* renamed from: I */
    public final ArrayList f3872I = new ArrayList();

    /* renamed from: q */
    public final ArrayList f3880q = new ArrayList();

    /* renamed from: k */
    public final ArrayList f3878k = new ArrayList();

    /* renamed from: N */
    public static void m2459N(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC0249El) arrayList.get(size)).f866z.animate().cancel();
            }
        }
    }

    /* renamed from: G */
    public final boolean m2460G(C1418ae c1418ae, AbstractC0249El abstractC0249El) {
        if (c1418ae.f4440h == abstractC0249El) {
            c1418ae.f4440h = null;
        } else if (c1418ae.f4442z == abstractC0249El) {
            c1418ae.f4442z = null;
        } else {
            return false;
        }
        abstractC0249El.f866z.setAlpha(1.0f);
        View view = abstractC0249El.f866z;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m4679v(abstractC0249El);
        return true;
    }

    /* renamed from: M */
    public final boolean m2461M() {
        return (this.f3877W.isEmpty() && this.f3873M.isEmpty() && this.f3871G.isEmpty() && this.f3879o.isEmpty() && this.f3872I.isEmpty() && this.f3880q.isEmpty() && this.f3881w.isEmpty() && this.f3878k.isEmpty() && this.f3875S.isEmpty() && this.f3876V.isEmpty() && this.f3874R.isEmpty()) ? false : true;
    }

    /* renamed from: P */
    public final boolean m2462P(AbstractC0249El abstractC0249El, int i, int i2, int i3, int i4) {
        View view = abstractC0249El.f866z;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0249El.f866z.getTranslationY());
        m2464V(abstractC0249El);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m4679v(abstractC0249El);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f3871G.add(new C2212ph(abstractC0249El, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: Q */
    public final void m2463Q() {
        if (!m2461M()) {
            ArrayList arrayList = this.f8610h;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                AbstractC2441tz.m4202q(arrayList.get(0));
                throw null;
            }
        }
    }

    /* renamed from: V */
    public final void m2464V(AbstractC0249El abstractC0249El) {
        if (f3870g == null) {
            f3870g = new ValueAnimator().getInterpolator();
        }
        abstractC0249El.f866z.animate().setInterpolator(f3870g);
        m2467u(abstractC0249El);
    }

    /* renamed from: W */
    public final void m2465W(AbstractC0249El abstractC0249El, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C1418ae c1418ae = (C1418ae) arrayList.get(size);
            if (m2460G(c1418ae, abstractC0249El) && c1418ae.f4442z == null && c1418ae.f4440h == null) {
                arrayList.remove(c1418ae);
            }
        }
    }

    /* renamed from: o */
    public final void m2466o() {
        ArrayList arrayList = this.f3871G;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C2212ph c2212ph = (C2212ph) arrayList.get(size);
            View view = c2212ph.f6804z.f866z;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4679v(c2212ph.f6804z);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3879o;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m4679v((AbstractC0249El) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3877W;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0249El abstractC0249El = (AbstractC0249El) arrayList3.get(size3);
            abstractC0249El.f866z.setAlpha(1.0f);
            m4679v(abstractC0249El);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3873M;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C1418ae c1418ae = (C1418ae) arrayList4.get(size4);
            AbstractC0249El abstractC0249El2 = c1418ae.f4442z;
            if (abstractC0249El2 != null) {
                m2460G(c1418ae, abstractC0249El2);
            }
            AbstractC0249El abstractC0249El3 = c1418ae.f4440h;
            if (abstractC0249El3 != null) {
                m2460G(c1418ae, abstractC0249El3);
            }
        }
        arrayList4.clear();
        if (!m2461M()) {
            return;
        }
        ArrayList arrayList5 = this.f3875S;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C2212ph c2212ph2 = (C2212ph) arrayList6.get(size6);
                    View view2 = c2212ph2.f6804z.f866z;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m4679v(c2212ph2.f6804z);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f3876V;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    AbstractC0249El abstractC0249El4 = (AbstractC0249El) arrayList8.get(size8);
                    abstractC0249El4.f866z.setAlpha(1.0f);
                    m4679v(abstractC0249El4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f3874R;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    C1418ae c1418ae2 = (C1418ae) arrayList10.get(size10);
                    AbstractC0249El abstractC0249El5 = c1418ae2.f4442z;
                    if (abstractC0249El5 != null) {
                        m2460G(c1418ae2, abstractC0249El5);
                    }
                    AbstractC0249El abstractC0249El6 = c1418ae2.f4440h;
                    if (abstractC0249El6 != null) {
                        m2460G(c1418ae2, abstractC0249El6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        m2459N(this.f3880q);
        m2459N(this.f3872I);
        m2459N(this.f3881w);
        m2459N(this.f3878k);
        ArrayList arrayList11 = this.f8610h;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            AbstractC2441tz.m4202q(arrayList11.get(0));
            throw null;
        }
    }

    /* renamed from: u */
    public final void m2467u(AbstractC0249El abstractC0249El) {
        View view = abstractC0249El.f866z;
        view.animate().cancel();
        ArrayList arrayList = this.f3871G;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C2212ph) arrayList.get(size)).f6804z == abstractC0249El) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4679v(abstractC0249El);
                arrayList.remove(size);
            }
        }
        m2465W(abstractC0249El, this.f3873M);
        if (this.f3879o.remove(abstractC0249El)) {
            view.setAlpha(1.0f);
            m4679v(abstractC0249El);
        }
        if (this.f3877W.remove(abstractC0249El)) {
            view.setAlpha(1.0f);
            m4679v(abstractC0249El);
        }
        ArrayList arrayList2 = this.f3874R;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m2465W(abstractC0249El, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3875S;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((C2212ph) arrayList5.get(size4)).f6804z == abstractC0249El) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4679v(abstractC0249El);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.f3876V;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(abstractC0249El)) {
                    view.setAlpha(1.0f);
                    m4679v(abstractC0249El);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f3880q.remove(abstractC0249El);
                this.f3881w.remove(abstractC0249El);
                this.f3878k.remove(abstractC0249El);
                this.f3872I.remove(abstractC0249El);
                m2463Q();
                return;
            }
        }
    }
}
