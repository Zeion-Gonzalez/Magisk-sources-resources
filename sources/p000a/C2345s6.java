package p000a;

import android.content.Context;
import android.util.Log;
import androidx.navigation.fragment.DialogFragmentNavigator$observer$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p000a.AbstractC0258Ex;
import p000a.AbstractC1292YB;
import p000a.AbstractC2486us;
import p000a.C1553dE;
import p000a.C2345s6;
import p000a.DialogInterfaceOnCancelListenerC0137Ce;
import p000a.EnumC2241qF;
import p000a.InterfaceC1546d7;

@InterfaceC2240qD("dialog")
/* renamed from: a.s6 */
/* loaded from: classes.dex */
public final class C2345s6 extends AbstractC2719zK {

    /* renamed from: P */
    public final C0364Gx f7229P;

    /* renamed from: v */
    public final Context f7232v;

    /* renamed from: N */
    public final LinkedHashSet f7228N = new LinkedHashSet();

    /* renamed from: Q */
    public final DialogFragmentNavigator$observer$1 f7230Q = new InterfaceC1270Xo() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1
        @Override // p000a.InterfaceC1270Xo
        /* renamed from: Q */
        public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
            int i;
            int i2 = AbstractC0258Ex.f920z[enumC2241qF.ordinal()];
            boolean z = true;
            C2345s6 c2345s6 = C2345s6.this;
            if (i2 != 1) {
                Object obj = null;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = (DialogInterfaceOnCancelListenerC0137Ce) interfaceC1546d7;
                            for (Object obj2 : (Iterable) c2345s6.m4654h().f3093Q.getValue()) {
                                if (AbstractC1292YB.m2695u(((C1553dE) obj2).f4794k, dialogInterfaceOnCancelListenerC0137Ce.f7192L)) {
                                    obj = obj2;
                                }
                            }
                            C1553dE c1553dE = (C1553dE) obj;
                            if (c1553dE != null) {
                                c2345s6.m4654h().m2057h(c1553dE);
                            }
                            dialogInterfaceOnCancelListenerC0137Ce.f7200Yd.mo724h(this);
                            return;
                        }
                        return;
                    }
                    DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce2 = (DialogInterfaceOnCancelListenerC0137Ce) interfaceC1546d7;
                    if (!dialogInterfaceOnCancelListenerC0137Ce2.m278D().isShowing()) {
                        List list = (List) c2345s6.m4654h().f3091N.getValue();
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                if (AbstractC1292YB.m2695u(((C1553dE) listIterator.previous()).f4794k, dialogInterfaceOnCancelListenerC0137Ce2.f7192L)) {
                                    i = listIterator.nextIndex();
                                    break;
                                }
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        C1553dE c1553dE2 = (C1553dE) AbstractC2486us.m4288d3(i, list);
                        if (!AbstractC1292YB.m2695u(AbstractC2486us.m4277Fu(list), c1553dE2)) {
                            Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0137Ce2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                        }
                        if (c1553dE2 != null) {
                            c2345s6.m4022V(i, c1553dE2, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce3 = (DialogInterfaceOnCancelListenerC0137Ce) interfaceC1546d7;
                for (Object obj3 : (Iterable) c2345s6.m4654h().f3093Q.getValue()) {
                    if (AbstractC1292YB.m2695u(((C1553dE) obj3).f4794k, dialogInterfaceOnCancelListenerC0137Ce3.f7192L)) {
                        obj = obj3;
                    }
                }
                C1553dE c1553dE3 = (C1553dE) obj;
                if (c1553dE3 != null) {
                    c2345s6.m4654h().m2057h(c1553dE3);
                    return;
                }
                return;
            }
            DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce4 = (DialogInterfaceOnCancelListenerC0137Ce) interfaceC1546d7;
            Iterable iterable = (Iterable) c2345s6.m4654h().f3091N.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (AbstractC1292YB.m2695u(((C1553dE) it.next()).f4794k, dialogInterfaceOnCancelListenerC0137Ce4.f7192L)) {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                dialogInterfaceOnCancelListenerC0137Ce4.m277B(false, false);
            }
        }
    };

    /* renamed from: u */
    public final LinkedHashMap f7231u = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public C2345s6(Context context, C0364Gx c0364Gx) {
        this.f7232v = context;
        this.f7229P = c0364Gx;
    }

    /* renamed from: M */
    public final DialogInterfaceOnCancelListenerC0137Ce m4021M(C1553dE c1553dE) {
        C0038Am c0038Am = (C0038Am) c1553dE.f4790R;
        String str = c0038Am.f180E;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.f7232v;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            C1448bA m796F = this.f7229P.m796F();
            context.getClassLoader();
            AbstractComponentCallbacksC2342s3 m2868z = m796F.m2868z(str);
            if (DialogInterfaceOnCancelListenerC0137Ce.class.isAssignableFrom(m2868z.getClass())) {
                DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = (DialogInterfaceOnCancelListenerC0137Ce) m2868z;
                dialogInterfaceOnCancelListenerC0137Ce.m4017t(c1553dE.m3023v());
                dialogInterfaceOnCancelListenerC0137Ce.f7200Yd.mo728z(this.f7230Q);
                this.f7231u.put(c1553dE.f4794k, dialogInterfaceOnCancelListenerC0137Ce);
                return dialogInterfaceOnCancelListenerC0137Ce;
            }
            StringBuilder sb = new StringBuilder("Dialog destination ");
            String str2 = c0038Am.f180E;
            if (str2 != null) {
                throw new IllegalArgumentException(AbstractC2441tz.m4187M(sb, str2, " is not an instance of DialogFragment").toString());
            }
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }
        throw new IllegalStateException("DialogFragment class was not set".toString());
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: N */
    public final void mo3748N(C0904R3 c0904r3) {
        C0326GG c0326gg;
        super.mo3748N(c0904r3);
        Iterator it = ((List) c0904r3.f3091N.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0364Gx c0364Gx = this.f7229P;
            if (hasNext) {
                C1553dE c1553dE = (C1553dE) it.next();
                DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = (DialogInterfaceOnCancelListenerC0137Ce) c0364Gx.m822e(c1553dE.f4794k);
                if (dialogInterfaceOnCancelListenerC0137Ce != null && (c0326gg = dialogInterfaceOnCancelListenerC0137Ce.f7200Yd) != null) {
                    c0326gg.mo728z(this.f7230Q);
                } else {
                    this.f7228N.add(c1553dE.f4794k);
                }
            } else {
                c0364Gx.f1239R.add(new InterfaceC0115CE() { // from class: a.E1
                    @Override // p000a.InterfaceC0115CE
                    /* renamed from: z */
                    public final void mo238z(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
                        C2345s6 c2345s6 = C2345s6.this;
                        LinkedHashSet linkedHashSet = c2345s6.f7228N;
                        String str = abstractComponentCallbacksC2342s3.f7192L;
                        AbstractC0438II.m1038o(linkedHashSet);
                        if (linkedHashSet.remove(str)) {
                            abstractComponentCallbacksC2342s3.f7200Yd.mo728z(c2345s6.f7230Q);
                        }
                        LinkedHashMap linkedHashMap = c2345s6.f7231u;
                        String str2 = abstractComponentCallbacksC2342s3.f7192L;
                        AbstractC0438II.m1016W(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
        }
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: P */
    public final void mo2294P(List list, C0815PB c0815pb) {
        C0364Gx c0364Gx = this.f7229P;
        if (c0364Gx.m806O()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1553dE c1553dE = (C1553dE) it.next();
            DialogInterfaceOnCancelListenerC0137Ce m4021M = m4021M(c1553dE);
            m4021M.f470d2 = false;
            m4021M.f471dG = true;
            C0398HY c0398hy = new C0398HY(c0364Gx);
            c0398hy.f1329I = true;
            c0398hy.m891N(0, m4021M, c1553dE.f4794k, 1);
            c0398hy.m892P(false);
            C1553dE c1553dE2 = (C1553dE) AbstractC2486us.m4277Fu((List) m4654h().f3091N.getValue());
            boolean m4287d2 = AbstractC2486us.m4287d2((Iterable) m4654h().f3093Q.getValue(), c1553dE2);
            m4654h().m2058o(c1553dE);
            if (c1553dE2 != null && !m4287d2) {
                m4654h().m2057h(c1553dE2);
            }
        }
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: Q */
    public final void mo3749Q(C1553dE c1553dE) {
        C0364Gx c0364Gx = this.f7229P;
        if (c0364Gx.m806O()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f7231u;
        String str = c1553dE.f4794k;
        DialogInterfaceOnCancelListenerC0137Ce dialogInterfaceOnCancelListenerC0137Ce = (DialogInterfaceOnCancelListenerC0137Ce) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC0137Ce == null) {
            AbstractComponentCallbacksC2342s3 m822e = c0364Gx.m822e(str);
            if (m822e instanceof DialogInterfaceOnCancelListenerC0137Ce) {
                dialogInterfaceOnCancelListenerC0137Ce = (DialogInterfaceOnCancelListenerC0137Ce) m822e;
            } else {
                dialogInterfaceOnCancelListenerC0137Ce = null;
            }
        }
        if (dialogInterfaceOnCancelListenerC0137Ce != null) {
            dialogInterfaceOnCancelListenerC0137Ce.f7200Yd.mo724h(this.f7230Q);
            dialogInterfaceOnCancelListenerC0137Ce.m277B(false, false);
        }
        DialogInterfaceOnCancelListenerC0137Ce m4021M = m4021M(c1553dE);
        m4021M.f470d2 = false;
        m4021M.f471dG = true;
        C0398HY c0398hy = new C0398HY(c0364Gx);
        c0398hy.f1329I = true;
        c0398hy.m891N(0, m4021M, str, 1);
        c0398hy.m892P(false);
        C0904R3 m4654h = m4654h();
        List list = (List) m4654h.f3091N.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C1553dE c1553dE2 = (C1553dE) listIterator.previous();
            if (AbstractC1292YB.m2695u(c1553dE2.f4794k, str)) {
                C1277Xw c1277Xw = m4654h.f3097v;
                c1277Xw.m2607u(AbstractC1658fB.m3130Ha(AbstractC1658fB.m3130Ha((Set) c1277Xw.getValue(), c1553dE2), c1553dE));
                m4654h.m2060v(c1553dE);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    /* renamed from: V */
    public final void m4022V(int i, C1553dE c1553dE, boolean z) {
        C1553dE c1553dE2 = (C1553dE) AbstractC2486us.m4288d3(i - 1, (List) m4654h().f3091N.getValue());
        boolean m4287d2 = AbstractC2486us.m4287d2((Iterable) m4654h().f3093Q.getValue(), c1553dE2);
        m4654h().m2056Q(c1553dE, z);
        if (c1553dE2 != null && !m4287d2) {
            m4654h().m2057h(c1553dE2);
        }
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: W */
    public final void mo3751W(C1553dE c1553dE, boolean z) {
        C0364Gx c0364Gx = this.f7229P;
        if (c0364Gx.m806O()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) m4654h().f3091N.getValue();
        int indexOf = list.indexOf(c1553dE);
        Iterator it = AbstractC2486us.m4292j5(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2342s3 m822e = c0364Gx.m822e(((C1553dE) it.next()).f4794k);
            if (m822e != null) {
                ((DialogInterfaceOnCancelListenerC0137Ce) m822e).m277B(false, false);
            }
        }
        m4022V(indexOf, c1553dE, z);
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: z */
    public final C1420ag mo636z() {
        return new C0038Am(this);
    }
}
