package p000a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.BW */
/* loaded from: classes.dex */
public final class C0079BW extends AbstractC0119CI {
    /* renamed from: g */
    public static boolean m162g(Transition transition) {
        return (AbstractC0119CI.m246o(transition.getTargetIds()) && AbstractC0119CI.m246o(transition.getTargetNames()) && AbstractC0119CI.m246o(transition.getTargetTypes())) ? false : true;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: G */
    public final Object mo163G(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: I */
    public final void mo164I(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0119CI.m245P((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo172h(transitionSet, arrayList);
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: M */
    public final void mo165M(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C1861j4(view, arrayList));
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: N */
    public final boolean mo166N(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: Q */
    public final Object mo167Q(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: R */
    public final void mo168R(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C0013AE(rect, 1));
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: S */
    public final void mo169S(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC0119CI.m247u(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0013AE(rect, 0));
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: V */
    public final void mo170V(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C0942Ri(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: W */
    public final Object mo171W(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: h */
    public final void mo172h(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo172h(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m162g(transition) || !AbstractC0119CI.m246o(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: k */
    public final Object mo173k(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: q */
    public final void mo174q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m177y(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: v */
    public final void mo175v(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: w */
    public final void mo176w(Object obj, C1251XO c1251xo, RunnableC1547d8 runnableC1547d8) {
        ((Transition) obj).addListener(new C1572dZ(runnableC1547d8));
    }

    /* renamed from: y */
    public final void m177y(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m177y(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m162g(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // p000a.AbstractC0119CI
    /* renamed from: z */
    public final void mo178z(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }
}
