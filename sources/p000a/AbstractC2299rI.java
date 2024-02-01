package p000a;

import android.view.ViewGroup;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: a.rI */
/* loaded from: classes.dex */
public abstract class AbstractC2299rI {

    /* renamed from: z */
    public static final C0597LB f7097z = new C0597LB();

    /* renamed from: h */
    public static final ThreadLocal f7095h = new ThreadLocal();

    /* renamed from: v */
    public static final ArrayList f7096v = new ArrayList();

    /* renamed from: h */
    public static C1186WB m3955h() {
        C1186WB c1186wb;
        ThreadLocal threadLocal = f7095h;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1186wb = (C1186WB) weakReference.get()) != null) {
            return c1186wb;
        }
        C1186WB c1186wb2 = new C1186WB();
        threadLocal.set(new WeakReference(c1186wb2));
        return c1186wb2;
    }

    /* renamed from: z */
    public static void m3956z(ViewGroup viewGroup, AbstractC0614LY abstractC0614LY) {
        ArrayList arrayList = f7096v;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC1285Y3.m2635v(viewGroup)) {
                arrayList.add(viewGroup);
                if (abstractC0614LY == null) {
                    abstractC0614LY = f7097z;
                }
                AbstractC0614LY clone = abstractC0614LY.clone();
                ArrayList arrayList2 = (ArrayList) m3955h().getOrDefault(viewGroup, null);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0614LY) it.next()).mo1372Y(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.m1370W(viewGroup, true);
                }
                AbstractC2441tz.m4202q(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null) {
                    ViewTreeObserverOnPreDrawListenerC2015lu viewTreeObserverOnPreDrawListenerC2015lu = new ViewTreeObserverOnPreDrawListenerC2015lu(viewGroup, clone);
                    viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2015lu);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2015lu);
                }
            }
        }
    }
}
