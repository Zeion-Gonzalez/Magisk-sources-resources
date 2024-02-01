package p000a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: a.LY */
/* loaded from: classes.dex */
public abstract class AbstractC0614LY implements Cloneable {

    /* renamed from: F */
    public AbstractC1500cH f1996F;

    /* renamed from: f */
    public ArrayList f2008f;

    /* renamed from: r */
    public ArrayList f2012r;

    /* renamed from: C */
    public static final int[] f1992C = {2, 1, 3, 4};

    /* renamed from: p */
    public static final C1219Wm f1994p = new C1219Wm();

    /* renamed from: j */
    public static final ThreadLocal f1993j = new ThreadLocal();

    /* renamed from: S */
    public final String f2001S = getClass().getName();

    /* renamed from: R */
    public long f2000R = -1;

    /* renamed from: w */
    public long f2014w = -1;

    /* renamed from: I */
    public TimeInterpolator f1998I = null;

    /* renamed from: q */
    public final ArrayList f2011q = new ArrayList();

    /* renamed from: k */
    public final ArrayList f2010k = new ArrayList();

    /* renamed from: g */
    public ArrayList f2009g = null;

    /* renamed from: y */
    public C0525Ju f2015y = new C0525Ju(4);

    /* renamed from: s */
    public C0525Ju f2013s = new C0525Ju(4);

    /* renamed from: U */
    public C2524vT f2002U = null;

    /* renamed from: E */
    public final int[] f1995E = f1992C;

    /* renamed from: Y */
    public final ArrayList f2004Y = new ArrayList();

    /* renamed from: J */
    public int f1999J = 0;

    /* renamed from: c */
    public boolean f2006c = false;

    /* renamed from: H */
    public boolean f1997H = false;

    /* renamed from: e */
    public ArrayList f2007e = null;

    /* renamed from: X */
    public ArrayList f2003X = new ArrayList();

    /* renamed from: Z */
    public C1219Wm f2005Z = f1994p;

    /* renamed from: P */
    public static void m1356P(C0525Ju c0525Ju, View view, C2495v0 c2495v0) {
        ((C1186WB) c0525Ju.f1765h).put(view, c2495v0);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) c0525Ju.f1766v).indexOfKey(id) >= 0) {
                ((SparseArray) c0525Ju.f1766v).put(id, null);
            } else {
                ((SparseArray) c0525Ju.f1766v).put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        String m2997M = AbstractC1548d9.m2997M(view);
        if (m2997M != null) {
            if (((C1186WB) c0525Ju.f1763N).containsKey(m2997M)) {
                ((C1186WB) c0525Ju.f1763N).put(m2997M, null);
            } else {
                ((C1186WB) c0525Ju.f1763N).put(m2997M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1276Xv c1276Xv = (C1276Xv) c0525Ju.f1764P;
                if (c1276Xv.f4102S) {
                    c1276Xv.m2600N();
                }
                if (AbstractC0438II.m1015V(c1276Xv.f4101R, c1276Xv.f4100I, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((C1276Xv) c0525Ju.f1764P).m2602Q(itemIdAtPosition, null);
                    if (view2 != null) {
                        AbstractC2397t8.m4125k(view2, false);
                        ((C1276Xv) c0525Ju.f1764P).m2604u(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                AbstractC2397t8.m4125k(view, true);
                ((C1276Xv) c0525Ju.f1764P).m2604u(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: g */
    public static C1186WB m1357g() {
        ThreadLocal threadLocal = f1993j;
        C1186WB c1186wb = (C1186WB) threadLocal.get();
        if (c1186wb != null) {
            return c1186wb;
        }
        C1186WB c1186wb2 = new C1186WB();
        threadLocal.set(c1186wb2);
        return c1186wb2;
    }

    /* renamed from: r */
    public static boolean m1358r(C2495v0 c2495v0, C2495v0 c2495v02, String str) {
        Object obj = c2495v0.f7632z.get(str);
        Object obj2 = c2495v02.f7632z.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: C */
    public void mo1359C(C1219Wm c1219Wm) {
        if (c1219Wm == null) {
            c1219Wm = f1994p;
        }
        this.f2005Z = c1219Wm;
    }

    /* renamed from: E */
    public boolean mo1360E(C2495v0 c2495v0, C2495v0 c2495v02) {
        if (c2495v0 == null || c2495v02 == null) {
            return false;
        }
        String[] mo296s = mo296s();
        if (mo296s != null) {
            for (String str : mo296s) {
                if (!m1358r(c2495v0, c2495v02, str)) {
                }
            }
            return false;
        }
        Iterator it = c2495v0.f7632z.keySet().iterator();
        while (it.hasNext()) {
            if (m1358r(c2495v0, c2495v02, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: F */
    public void mo1361F(AbstractC1500cH abstractC1500cH) {
        this.f1996F = abstractC1500cH;
    }

    /* renamed from: H */
    public void mo1362H(ViewGroup viewGroup) {
        if (this.f2006c) {
            if (!this.f1997H) {
                ArrayList arrayList = this.f2004Y;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((Animator) arrayList.get(size)).resume();
                    }
                }
                ArrayList arrayList2 = this.f2007e;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f2007e.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((InterfaceC2728zV) arrayList3.get(i)).mo1083N();
                    }
                }
            }
            this.f2006c = false;
        }
    }

    /* renamed from: I */
    public final void m1363I() {
        int i = this.f1999J - 1;
        this.f1999J = i;
        if (i == 0) {
            ArrayList arrayList = this.f2007e;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2007e.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC2728zV) arrayList2.get(i2)).mo231P(this);
                }
            }
            int i3 = 0;
            while (true) {
                C1276Xv c1276Xv = (C1276Xv) this.f2015y.f1764P;
                if (c1276Xv.f4102S) {
                    c1276Xv.m2600N();
                }
                if (i3 >= c1276Xv.f4100I) {
                    break;
                }
                View view = (View) ((C1276Xv) this.f2015y.f1764P).m2603o(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC2397t8.m4125k(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                C1276Xv c1276Xv2 = (C1276Xv) this.f2013s.f1764P;
                if (c1276Xv2.f4102S) {
                    c1276Xv2.m2600N();
                }
                if (i4 < c1276Xv2.f4100I) {
                    View view2 = (View) ((C1276Xv) this.f2013s.f1764P).m2603o(i4);
                    if (view2 != null) {
                        WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                        AbstractC2397t8.m4125k(view2, false);
                    }
                    i4++;
                } else {
                    this.f1997H = true;
                    return;
                }
            }
        }
    }

    /* renamed from: J */
    public void mo1364J(InterfaceC2728zV interfaceC2728zV) {
        ArrayList arrayList = this.f2007e;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC2728zV);
        if (this.f2007e.size() == 0) {
            this.f2007e = null;
        }
    }

    /* renamed from: L */
    public final void m1365L() {
        if (this.f1999J == 0) {
            ArrayList arrayList = this.f2007e;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2007e.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC2728zV) arrayList2.get(i)).mo1084h(this);
                }
            }
            this.f1997H = false;
        }
        this.f1999J++;
    }

    /* renamed from: M */
    public final void m1366M(boolean z) {
        C0525Ju c0525Ju;
        if (z) {
            ((C1186WB) this.f2015y.f1765h).clear();
            ((SparseArray) this.f2015y.f1766v).clear();
            c0525Ju = this.f2015y;
        } else {
            ((C1186WB) this.f2013s.f1765h).clear();
            ((SparseArray) this.f2013s.f1766v).clear();
            c0525Ju = this.f2013s;
        }
        ((C1276Xv) c0525Ju.f1764P).m2605v();
    }

    /* renamed from: N */
    public abstract void mo292N(C2495v0 c2495v0);

    /* renamed from: Q */
    public final void m1367Q(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f2009g;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            if (view.getParent() instanceof ViewGroup) {
                C2495v0 c2495v0 = new C2495v0(view);
                if (z) {
                    mo295o(c2495v0);
                } else {
                    mo292N(c2495v0);
                }
                c2495v0.f7631v.add(this);
                mo1382u(c2495v0);
                m1356P(z ? this.f2015y : this.f2013s, view, c2495v0);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m1367Q(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: R */
    public Animator mo293R(ViewGroup viewGroup, C2495v0 c2495v0, C2495v0 c2495v02) {
        return null;
    }

    @Override // 
    /* renamed from: S */
    public AbstractC0614LY clone() {
        try {
            AbstractC0614LY abstractC0614LY = (AbstractC0614LY) super.clone();
            abstractC0614LY.f2003X = new ArrayList();
            abstractC0614LY.f2015y = new C0525Ju(4);
            abstractC0614LY.f2013s = new C0525Ju(4);
            abstractC0614LY.f2008f = null;
            abstractC0614LY.f2012r = null;
            return abstractC0614LY;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: U */
    public final C2495v0 m1369U(View view, boolean z) {
        C0525Ju c0525Ju;
        C2524vT c2524vT = this.f2002U;
        if (c2524vT != null) {
            return c2524vT.m1369U(view, z);
        }
        if (z) {
            c0525Ju = this.f2015y;
        } else {
            c0525Ju = this.f2013s;
        }
        return (C2495v0) ((C1186WB) c0525Ju.f1765h).getOrDefault(view, null);
    }

    /* renamed from: W */
    public final void m1370W(ViewGroup viewGroup, boolean z) {
        m1366M(z);
        ArrayList arrayList = this.f2011q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2010k;
        if (size <= 0 && arrayList2.size() <= 0) {
            m1367Q(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C2495v0 c2495v0 = new C2495v0(findViewById);
                if (z) {
                    mo295o(c2495v0);
                } else {
                    mo292N(c2495v0);
                }
                c2495v0.f7631v.add(this);
                mo1382u(c2495v0);
                m1356P(z ? this.f2015y : this.f2013s, findViewById, c2495v0);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C2495v0 c2495v02 = new C2495v0(view);
            if (z) {
                mo295o(c2495v02);
            } else {
                mo292N(c2495v02);
            }
            c2495v02.f7631v.add(this);
            mo1382u(c2495v02);
            m1356P(z ? this.f2015y : this.f2013s, view, c2495v02);
        }
    }

    /* renamed from: X */
    public void mo1371X(long j) {
        this.f2014w = j;
    }

    /* renamed from: Y */
    public void mo1372Y(View view) {
        if (!this.f1997H) {
            ArrayList arrayList = this.f2004Y;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.f2007e;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.f2007e.clone();
                int size2 = arrayList3.size();
                for (int i = 0; i < size2; i++) {
                    ((InterfaceC2728zV) arrayList3.get(i)).mo1085v();
                }
            }
            this.f2006c = true;
        }
    }

    /* renamed from: Z */
    public void mo1373Z(TimeInterpolator timeInterpolator) {
        this.f1998I = timeInterpolator;
    }

    /* renamed from: c */
    public void mo1374c(View view) {
        this.f2010k.remove(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f2004Y;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((Animator) arrayList.get(size)).cancel();
            }
        }
        ArrayList arrayList2 = this.f2007e;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f2007e.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC2728zV) arrayList3.get(i)).mo1086z();
        }
    }

    /* renamed from: e */
    public void mo1375e() {
        m1365L();
        C1186WB m1357g = m1357g();
        Iterator it = this.f2003X.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m1357g.containsKey(animator)) {
                m1365L();
                if (animator != null) {
                    animator.addListener(new C1644ev(this, 0, m1357g));
                    long j = this.f2014w;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f2000R;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f1998I;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C2558wC(1, this));
                    animator.start();
                }
            }
        }
        this.f2003X.clear();
        m1363I();
    }

    /* renamed from: f */
    public final boolean m1376f(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2009g;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList2 = this.f2011q;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.f2010k;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }

    /* renamed from: i */
    public String mo1377i(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2014w != -1) {
            str2 = str2 + "dur(" + this.f2014w + ") ";
        }
        if (this.f2000R != -1) {
            str2 = str2 + "dly(" + this.f2000R + ") ";
        }
        if (this.f1998I != null) {
            str2 = str2 + "interp(" + this.f1998I + ") ";
        }
        ArrayList arrayList = this.f2011q;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2010k;
        if (size > 0 || arrayList2.size() > 0) {
            String m4195W = AbstractC2441tz.m4195W(str2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        m4195W = AbstractC2441tz.m4195W(m4195W, ", ");
                    }
                    m4195W = m4195W + arrayList.get(i);
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        m4195W = AbstractC2441tz.m4195W(m4195W, ", ");
                    }
                    m4195W = m4195W + arrayList2.get(i2);
                }
            }
            return AbstractC2441tz.m4195W(m4195W, ")");
        }
        return str2;
    }

    /* renamed from: j */
    public void mo1378j(long j) {
        this.f2000R = j;
    }

    /* renamed from: k */
    public final C2495v0 m1379k(View view, boolean z) {
        C2524vT c2524vT = this.f2002U;
        if (c2524vT != null) {
            return c2524vT.m1379k(view, z);
        }
        ArrayList arrayList = z ? this.f2008f : this.f2012r;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C2495v0 c2495v0 = (C2495v0) arrayList.get(i);
            if (c2495v0 == null) {
                return null;
            }
            if (c2495v0.f7630h == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C2495v0) (z ? this.f2012r : this.f2008f).get(i);
        }
        return null;
    }

    /* renamed from: o */
    public abstract void mo295o(C2495v0 c2495v0);

    /* renamed from: p */
    public void mo1380p() {
    }

    /* renamed from: q */
    public void mo1381q() {
        ArrayList arrayList = this.f2009g;
        Integer valueOf = Integer.valueOf((int) R.id.main_toolbar);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(valueOf)) {
            arrayList.add(valueOf);
        }
        this.f2009g = arrayList;
    }

    /* renamed from: s */
    public String[] mo296s() {
        return null;
    }

    public final String toString() {
        return mo1377i("");
    }

    /* renamed from: u */
    public void mo1382u(C2495v0 c2495v0) {
    }

    /* renamed from: v */
    public void mo1383v(View view) {
        this.f2010k.add(view);
    }

    /* renamed from: w */
    public void mo1384w(ViewGroup viewGroup, C0525Ju c0525Ju, C0525Ju c0525Ju2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        Animator mo293R;
        View view;
        Animator animator;
        C2495v0 c2495v0;
        Animator animator2;
        C2495v0 c2495v02;
        ViewGroup viewGroup2 = viewGroup;
        C1186WB m1357g = m1357g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C2495v0 c2495v03 = (C2495v0) arrayList.get(i);
            C2495v0 c2495v04 = (C2495v0) arrayList2.get(i);
            if (c2495v03 != null && !c2495v03.f7631v.contains(this)) {
                c2495v03 = null;
            }
            if (c2495v04 != null && !c2495v04.f7631v.contains(this)) {
                c2495v04 = null;
            }
            if (c2495v03 != null || c2495v04 != null) {
                if (c2495v03 != null && c2495v04 != null && !mo1360E(c2495v03, c2495v04)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (mo293R = mo293R(viewGroup2, c2495v03, c2495v04)) != null) {
                    if (c2495v04 != null) {
                        String[] mo296s = mo296s();
                        view = c2495v04.f7630h;
                        if (mo296s != null && mo296s.length > 0) {
                            c2495v02 = new C2495v0(view);
                            C2495v0 c2495v05 = (C2495v0) ((C1186WB) c0525Ju2.f1765h).getOrDefault(view, null);
                            if (c2495v05 != null) {
                                int i2 = 0;
                                while (i2 < mo296s.length) {
                                    HashMap hashMap = c2495v02.f7632z;
                                    Animator animator3 = mo293R;
                                    String str = mo296s[i2];
                                    hashMap.put(str, c2495v05.f7632z.get(str));
                                    i2++;
                                    mo293R = animator3;
                                    mo296s = mo296s;
                                }
                            }
                            Animator animator4 = mo293R;
                            int i3 = m1357g.f8517w;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    C0912RB c0912rb = (C0912RB) m1357g.getOrDefault((Animator) m1357g.m4626o(i4), null);
                                    if (c0912rb.f3125v != null && c0912rb.f3126z == view && c0912rb.f3124h.equals(this.f2001S) && c0912rb.f3125v.equals(c2495v02)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = mo293R;
                            c2495v02 = null;
                        }
                        animator = animator2;
                        c2495v0 = c2495v02;
                    } else {
                        view = c2495v03.f7630h;
                        animator = mo293R;
                        c2495v0 = null;
                    }
                    if (animator != null) {
                        String str2 = this.f2001S;
                        C1331Yy c1331Yy = AbstractC0043At.f188z;
                        m1357g.put(animator, new C0912RB(view, str2, this, new C0333GO(viewGroup2), c2495v0));
                        this.f2003X.add(animator);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = (Animator) this.f2003X.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: z */
    public void mo1385z(InterfaceC2728zV interfaceC2728zV) {
        if (this.f2007e == null) {
            this.f2007e = new ArrayList();
        }
        this.f2007e.add(interfaceC2728zV);
    }
}
