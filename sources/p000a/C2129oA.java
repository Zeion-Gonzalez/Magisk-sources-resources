package p000a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

@InterfaceC2240qD("fragment")
/* renamed from: a.oA */
/* loaded from: classes.dex */
public class C2129oA extends AbstractC2719zK {

    /* renamed from: N */
    public final int f6556N;

    /* renamed from: P */
    public final C0364Gx f6557P;

    /* renamed from: v */
    public final Context f6562v;

    /* renamed from: Q */
    public final LinkedHashSet f6558Q = new LinkedHashSet();

    /* renamed from: u */
    public final ArrayList f6561u = new ArrayList();

    /* renamed from: o */
    public final C1871jG f6560o = new C1871jG(1, this);

    /* renamed from: W */
    public final C2670yQ f6559W = new C2670yQ(2, this);

    public C2129oA(Context context, C0364Gx c0364Gx, int i) {
        this.f6562v = context;
        this.f6557P = c0364Gx;
        this.f6556N = i;
    }

    /* renamed from: M */
    public static void m3746M(C2129oA c2129oA, String str, boolean z, int i) {
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        int i2 = 1;
        if ((i & 4) != 0) {
            z2 = true;
        }
        ArrayList arrayList = c2129oA.f6561u;
        if (z2) {
            AbstractC2708z8.m4635BX(arrayList, new C1747gr(i2, str));
        }
        arrayList.add(new C0084Bc(str, Boolean.valueOf(z)));
    }

    /* renamed from: V */
    public static void m3747V(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, C1553dE c1553dE, C0904R3 c0904r3) {
        C2145oS mo1569G = abstractComponentCallbacksC2342s3.mo1569G();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2564wJ(AbstractC0274FD.m575z(C0950Rr.class).mo1318z(), C1980lF.f6133e));
        C2564wJ[] c2564wJArr = (C2564wJ[]) arrayList.toArray(new C2564wJ[0]);
        ((C0950Rr) new C1174Vy(mo1569G, new C1591dy((C2564wJ[]) Arrays.copyOf(c2564wJArr, c2564wJArr.length)), C2720zL.f8556h).m2397S(C0950Rr.class)).f3247I = new WeakReference(new C2663yE(0, c1553dE, c0904r3, abstractComponentCallbacksC2342s3));
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: N */
    public final void mo3748N(final C0904R3 c0904r3) {
        super.mo3748N(c0904r3);
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        InterfaceC0115CE interfaceC0115CE = new InterfaceC0115CE() { // from class: a.yl
            @Override // p000a.InterfaceC0115CE
            /* renamed from: z */
            public final void mo238z(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
                Object obj;
                C0904R3 c0904r32 = C0904R3.this;
                List list = (List) c0904r32.f3091N.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (AbstractC1292YB.m2695u(((C1553dE) obj).f4794k, abstractComponentCallbacksC2342s3.f7192L)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C1553dE c1553dE = (C1553dE) obj;
                boolean m791p = C0364Gx.m791p(2);
                C2129oA c2129oA = this;
                if (m791p) {
                    Log.v("FragmentNavigator", "Attaching fragment " + abstractComponentCallbacksC2342s3 + " associated with entry " + c1553dE + " to FragmentManager " + c2129oA.f6557P);
                }
                if (c1553dE != null) {
                    abstractComponentCallbacksC2342s3.f7188HL.m4843N(abstractComponentCallbacksC2342s3, new C1104Uh(1, new C0903R2(1, c2129oA, abstractComponentCallbacksC2342s3, c1553dE)));
                    abstractComponentCallbacksC2342s3.f7200Yd.mo728z(c2129oA.f6560o);
                    C2129oA.m3747V(abstractComponentCallbacksC2342s3, c1553dE, c0904r32);
                }
            }
        };
        C0364Gx c0364Gx = this.f6557P;
        c0364Gx.f1239R.add(interfaceC0115CE);
        C2256qU c2256qU = new C2256qU(c0904r3, this);
        if (c0364Gx.f1242V == null) {
            c0364Gx.f1242V = new ArrayList();
        }
        c0364Gx.f1242V.add(c2256qU);
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: P */
    public final void mo2294P(List list, C0815PB c0815pb) {
        boolean z;
        C0364Gx c0364Gx = this.f6557P;
        if (c0364Gx.m806O()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1553dE c1553dE = (C1553dE) it.next();
            boolean isEmpty = ((List) m4654h().f3091N.getValue()).isEmpty();
            int i = 0;
            if (c0815pb != null && !isEmpty && c0815pb.f2770h && this.f6558Q.remove(c1553dE.f4794k)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c0364Gx.m812U(new C0146Cp(c0364Gx, c1553dE.f4794k, i), false);
            } else {
                C0398HY m3750S = m3750S(c1553dE, c0815pb);
                if (!isEmpty) {
                    C1553dE c1553dE2 = (C1553dE) AbstractC2486us.m4277Fu((List) m4654h().f3091N.getValue());
                    if (c1553dE2 != null) {
                        m3746M(this, c1553dE2.f4794k, false, 6);
                    }
                    String str = c1553dE.f4794k;
                    m3746M(this, str, false, 6);
                    if (m3750S.f1341o) {
                        m3750S.f1343u = true;
                        m3750S.f1337W = str;
                    } else {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                }
                m3750S.m892P(false);
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + c1553dE);
                }
            }
            m4654h().m2058o(c1553dE);
        }
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: Q */
    public final void mo3749Q(C1553dE c1553dE) {
        C0364Gx c0364Gx = this.f6557P;
        if (c0364Gx.m806O()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0398HY m3750S = m3750S(c1553dE, null);
        List list = (List) m4654h().f3091N.getValue();
        if (list.size() > 1) {
            C1553dE c1553dE2 = (C1553dE) AbstractC2486us.m4288d3(AbstractC1292YB.m2642C(list) - 1, list);
            if (c1553dE2 != null) {
                m3746M(this, c1553dE2.f4794k, false, 6);
            }
            String str = c1553dE.f4794k;
            m3746M(this, str, true, 4);
            c0364Gx.m812U(new C2646xu(c0364Gx, str, -1), false);
            m3746M(this, str, false, 2);
            if (m3750S.f1341o) {
                m3750S.f1343u = true;
                m3750S.f1337W = str;
            } else {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
        }
        m3750S.m892P(false);
        m4654h().m2060v(c1553dE);
    }

    /* renamed from: S */
    public final C0398HY m3750S(C1553dE c1553dE, C0815PB c0815pb) {
        int i;
        int i2;
        int i3;
        int i4;
        C2309rS c2309rS = (C2309rS) c1553dE.f4790R;
        Bundle m3023v = c1553dE.m3023v();
        String str = c2309rS.f7127E;
        if (str != null) {
            int i5 = 0;
            char charAt = str.charAt(0);
            Context context = this.f6562v;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            C0364Gx c0364Gx = this.f6557P;
            C1448bA m796F = c0364Gx.m796F();
            context.getClassLoader();
            AbstractComponentCallbacksC2342s3 m2868z = m796F.m2868z(str);
            m2868z.m4017t(m3023v);
            C0398HY c0398hy = new C0398HY(c0364Gx);
            if (c0815pb != null) {
                i = c0815pb.f2768Q;
            } else {
                i = -1;
            }
            if (c0815pb != null) {
                i2 = c0815pb.f2772u;
            } else {
                i2 = -1;
            }
            if (c0815pb != null) {
                i3 = c0815pb.f2771o;
            } else {
                i3 = -1;
            }
            if (c0815pb != null) {
                i4 = c0815pb.f2769W;
            } else {
                i4 = -1;
            }
            if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
                if (i == -1) {
                    i = 0;
                }
                if (i2 == -1) {
                    i2 = 0;
                }
                if (i3 == -1) {
                    i3 = 0;
                }
                if (i4 != -1) {
                    i5 = i4;
                }
                c0398hy.f1339h = i;
                c0398hy.f1344v = i2;
                c0398hy.f1332P = i3;
                c0398hy.f1331N = i5;
            }
            int i6 = this.f6556N;
            if (i6 != 0) {
                c0398hy.m891N(i6, m2868z, c1553dE.f4794k, 2);
                c0398hy.m895u(m2868z);
                c0398hy.f1329I = true;
                return c0398hy;
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: W */
    public final void mo3751W(C1553dE c1553dE, boolean z) {
        C0364Gx c0364Gx = this.f6557P;
        if (c0364Gx.m806O()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) m4654h().f3091N.getValue();
        int indexOf = list.indexOf(c1553dE);
        List subList = list.subList(indexOf, list.size());
        C1553dE c1553dE2 = (C1553dE) AbstractC2486us.m4281O4(list);
        int i = 1;
        if (z) {
            for (C1553dE c1553dE3 : AbstractC2486us.m4292j5(subList)) {
                if (AbstractC1292YB.m2695u(c1553dE3, c1553dE2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c1553dE3);
                } else {
                    c0364Gx.m812U(new C0146Cp(c0364Gx, c1553dE3.f4794k, i), false);
                    this.f6558Q.add(c1553dE3.f4794k);
                }
            }
        } else {
            c0364Gx.m812U(new C2646xu(c0364Gx, c1553dE.f4794k, -1), false);
        }
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + c1553dE + " with savedState " + z);
        }
        C1553dE c1553dE4 = (C1553dE) AbstractC2486us.m4288d3(indexOf - 1, list);
        if (c1553dE4 != null) {
            m3746M(this, c1553dE4.f4794k, false, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            if ((!AbstractC1292YB.m2695u(((C1553dE) obj).f4794k, c1553dE2.f4794k)) != false) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m3746M(this, ((C1553dE) it.next()).f4794k, true, 4);
        }
        m4654h().m2056Q(c1553dE, z);
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: o */
    public final Bundle mo3752o() {
        LinkedHashSet linkedHashSet = this.f6558Q;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC1843ih.m3422Q(new C0084Bc("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: u */
    public final void mo3753u(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f6558Q;
            linkedHashSet.clear();
            AbstractC2708z8.m4637oI(stringArrayList, linkedHashSet);
        }
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: z */
    public final C1420ag mo636z() {
        return new C2309rS(this);
    }
}
