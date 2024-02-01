package p000a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2762z;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* renamed from: a.Cc */
/* loaded from: classes.dex */
public final class C0135Cc {

    /* renamed from: N */
    public boolean f455N;

    /* renamed from: P */
    public boolean f456P;

    /* renamed from: h */
    public final ArrayList f457h = new ArrayList();

    /* renamed from: v */
    public final ArrayList f458v = new ArrayList();

    /* renamed from: z */
    public final ViewGroup f459z;

    public C0135Cc(ViewGroup viewGroup) {
        this.f459z = viewGroup;
    }

    /* renamed from: N */
    public static void m265N(C1186WB c1186wb, View view) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        String m2997M = AbstractC1548d9.m2997M(view);
        if (m2997M != null) {
            c1186wb.put(m2997M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m265N(c1186wb, childAt);
                }
            }
        }
    }

    /* renamed from: o */
    public static final C0135Cc m266o(ViewGroup viewGroup, C0364Gx c0364Gx) {
        c0364Gx.m819Z();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0135Cc) {
            return (C0135Cc) tag;
        }
        C0135Cc c0135Cc = new C0135Cc(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0135Cc);
        return c0135Cc;
    }

    /* renamed from: z */
    public static void m267z(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC1150VW.m2361h(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
            } else {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        m267z(arrayList, childAt);
                    }
                }
                return;
            }
        } else if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: G */
    public final void m268G() {
        Iterator it = this.f457h.iterator();
        while (it.hasNext()) {
            AbstractC0204Du abstractC0204Du = (AbstractC0204Du) it.next();
            int i = 2;
            if (abstractC0204Du.f618h == 2) {
                int visibility = abstractC0204Du.f620v.m4013n().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i = 3;
                        } else {
                            throw new IllegalArgumentException(AbstractC2441tz.m4188N("Unknown visibility ", visibility));
                        }
                    }
                }
                abstractC0204Du.m392v(i, 1);
            }
        }
    }

    /* renamed from: P */
    public final void m269P() {
        if (!this.f455N) {
            ViewGroup viewGroup = this.f459z;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (!AbstractC1285Y3.m2633h(viewGroup)) {
                m273u();
                this.f456P = false;
                return;
            }
            synchronized (this.f457h) {
                if ((!this.f457h.isEmpty()) != false) {
                    ArrayList arrayList = new ArrayList(this.f458v);
                    this.f458v.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC0204Du abstractC0204Du = (AbstractC0204Du) it.next();
                        if (C0364Gx.m791p(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + abstractC0204Du);
                        }
                        abstractC0204Du.m393z();
                        if (!abstractC0204Du.f619u) {
                            this.f458v.add(abstractC0204Du);
                        }
                    }
                    m268G();
                    ArrayList arrayList2 = new ArrayList(this.f457h);
                    this.f457h.clear();
                    this.f458v.addAll(arrayList2);
                    if (C0364Gx.m791p(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC0204Du) it2.next()).mo390P();
                    }
                    m274v(arrayList2, this.f456P);
                    this.f456P = false;
                    if (C0364Gx.m791p(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public final AbstractC0204Du m270Q(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        Object obj;
        boolean z;
        Iterator it = this.f457h.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                AbstractC0204Du abstractC0204Du = (AbstractC0204Du) obj;
                if (AbstractC1292YB.m2695u(abstractC0204Du.f620v, abstractComponentCallbacksC2342s3) && !abstractC0204Du.f617Q) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (AbstractC0204Du) obj;
    }

    /* renamed from: W */
    public final void m271W() {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3;
        Object obj;
        boolean z;
        synchronized (this.f457h) {
            m268G();
            ArrayList arrayList = this.f457h;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                abstractComponentCallbacksC2342s3 = null;
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    AbstractC0204Du abstractC0204Du = (AbstractC0204Du) obj;
                    int m3420P = AbstractC1843ih.m3420P(abstractC0204Du.f620v.f7222t);
                    if (abstractC0204Du.f621z == 2 && m3420P != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AbstractC0204Du abstractC0204Du2 = (AbstractC0204Du) obj;
            if (abstractC0204Du2 != null) {
                abstractComponentCallbacksC2342s3 = abstractC0204Du2.f620v;
            }
            if (abstractComponentCallbacksC2342s3 != null) {
                C1614eM c1614eM = abstractComponentCallbacksC2342s3.f7184D;
            }
            this.f455N = false;
        }
    }

    /* renamed from: h */
    public final void m272h(int i, int i2, C2762z c2762z) {
        synchronized (this.f457h) {
            C1251XO c1251xo = new C1251XO();
            AbstractC0204Du m270Q = m270Q(c2762z.f8996v);
            if (m270Q != null) {
                m270Q.m392v(i, i2);
            } else {
                final C2715zF c2715zF = new C2715zF(i, i2, c2762z, c1251xo);
                this.f457h.add(c2715zF);
                final int i3 = 0;
                c2715zF.f616P.add(new Runnable(this) { // from class: a.I6

                    /* renamed from: R */
                    public final /* synthetic */ C0135Cc f1406R;

                    {
                        this.f1406R = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i3;
                        C2715zF c2715zF2 = c2715zF;
                        C0135Cc c0135Cc = this.f1406R;
                        switch (i42) {
                            case AbstractC0795Op.f2698E /* 0 */:
                                if (c0135Cc.f457h.contains(c2715zF2)) {
                                    AbstractC2441tz.m4209z(c2715zF2.f621z, c2715zF2.f620v.f7222t);
                                    return;
                                }
                                return;
                            default:
                                c0135Cc.f457h.remove(c2715zF2);
                                c0135Cc.f458v.remove(c2715zF2);
                                return;
                        }
                    }
                });
                final int i4 = 1;
                c2715zF.f616P.add(new Runnable(this) { // from class: a.I6

                    /* renamed from: R */
                    public final /* synthetic */ C0135Cc f1406R;

                    {
                        this.f1406R = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i4;
                        C2715zF c2715zF2 = c2715zF;
                        C0135Cc c0135Cc = this.f1406R;
                        switch (i42) {
                            case AbstractC0795Op.f2698E /* 0 */:
                                if (c0135Cc.f457h.contains(c2715zF2)) {
                                    AbstractC2441tz.m4209z(c2715zF2.f621z, c2715zF2.f620v.f7222t);
                                    return;
                                }
                                return;
                            default:
                                c0135Cc.f457h.remove(c2715zF2);
                                c0135Cc.f458v.remove(c2715zF2);
                                return;
                        }
                    }
                });
            }
        }
    }

    /* renamed from: u */
    public final void m273u() {
        String str;
        String str2;
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f459z;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        boolean m2633h = AbstractC1285Y3.m2633h(viewGroup);
        synchronized (this.f457h) {
            m268G();
            Iterator it = this.f457h.iterator();
            while (it.hasNext()) {
                ((AbstractC0204Du) it.next()).mo390P();
            }
            Iterator it2 = new ArrayList(this.f458v).iterator();
            while (it2.hasNext()) {
                AbstractC0204Du abstractC0204Du = (AbstractC0204Du) it2.next();
                if (C0364Gx.m791p(2)) {
                    if (m2633h) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f459z + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + abstractC0204Du);
                }
                abstractC0204Du.m393z();
            }
            Iterator it3 = new ArrayList(this.f457h).iterator();
            while (it3.hasNext()) {
                AbstractC0204Du abstractC0204Du2 = (AbstractC0204Du) it3.next();
                if (C0364Gx.m791p(2)) {
                    if (m2633h) {
                        str = "";
                    } else {
                        str = "Container " + this.f459z + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + abstractC0204Du2);
                }
                abstractC0204Du2.m393z();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:602:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x050a  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m274v(java.util.ArrayList r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 2258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0135Cc.m274v(java.util.ArrayList, boolean):void");
    }
}
