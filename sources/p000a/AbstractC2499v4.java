package p000a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.v4 */
/* loaded from: classes.dex */
public abstract class AbstractC2499v4 {

    /* renamed from: E */
    public InterfaceC2364sT f7637E;

    /* renamed from: G */
    public final LinkedHashMap f7638G;

    /* renamed from: H */
    public final C1894jf f7639H;

    /* renamed from: I */
    public final CopyOnWriteArrayList f7640I;

    /* renamed from: J */
    public final ArrayList f7641J;

    /* renamed from: M */
    public final LinkedHashMap f7642M;

    /* renamed from: N */
    public Parcelable[] f7643N;

    /* renamed from: P */
    public Bundle f7644P;

    /* renamed from: Q */
    public boolean f7645Q;

    /* renamed from: R */
    public InterfaceC1546d7 f7646R;

    /* renamed from: S */
    public final LinkedHashMap f7647S;

    /* renamed from: U */
    public final LinkedHashMap f7648U;

    /* renamed from: V */
    public final LinkedHashMap f7649V;

    /* renamed from: W */
    public final C1277Xw f7650W;

    /* renamed from: Y */
    public int f7651Y;

    /* renamed from: c */
    public final C1146VR f7652c;

    /* renamed from: f */
    public InterfaceC2364sT f7653f;

    /* renamed from: g */
    public final C1385Zw f7654g;

    /* renamed from: h */
    public final Activity f7655h;

    /* renamed from: k */
    public final C1871jG f7656k;

    /* renamed from: o */
    public final C1277Xw f7657o;

    /* renamed from: q */
    public EnumC1632eh f7658q;

    /* renamed from: r */
    public final LinkedHashMap f7659r;

    /* renamed from: s */
    public final C1931kK f7660s;

    /* renamed from: u */
    public final C1200WR f7661u;

    /* renamed from: v */
    public C1951kj f7662v;

    /* renamed from: w */
    public C0401Hd f7663w;

    /* renamed from: y */
    public final boolean f7664y;

    /* renamed from: z */
    public final Context f7665z;

    public AbstractC2499v4(Context context) {
        Object obj;
        this.f7665z = context;
        Iterator it = AbstractC0873QM.m2010BX(context, C1980lF.f6135g).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f7655h = (Activity) obj;
        this.f7661u = new C1200WR();
        C1239X8 c1239x8 = C1239X8.f4021S;
        this.f7657o = new C1277Xw(c1239x8);
        this.f7650W = new C1277Xw(c1239x8);
        this.f7638G = new LinkedHashMap();
        this.f7642M = new LinkedHashMap();
        this.f7649V = new LinkedHashMap();
        this.f7647S = new LinkedHashMap();
        this.f7640I = new CopyOnWriteArrayList();
        this.f7658q = EnumC1632eh.f5088R;
        this.f7656k = new C1871jG(0, this);
        this.f7654g = new C1385Zw(this);
        this.f7664y = true;
        C1931kK c1931kK = new C1931kK();
        this.f7660s = c1931kK;
        this.f7648U = new LinkedHashMap();
        this.f7659r = new LinkedHashMap();
        c1931kK.m3550z(new C1114Ur(c1931kK));
        c1931kK.m3550z(new C1326Yr(this.f7665z));
        this.f7641J = new ArrayList();
        this.f7652c = new C1146VR(new C1407aQ(1, this));
        this.f7639H = new C1894jf(1, 1, 2);
    }

    /* renamed from: w */
    public static /* synthetic */ void m4329w(AbstractC2499v4 abstractC2499v4, C1553dE c1553dE) {
        abstractC2499v4.m4336R(c1553dE, false, new C1200WR());
    }

    /* renamed from: G */
    public final void m4330G(InterfaceC2438tw interfaceC2438tw) {
        C1420ag c1420ag;
        int i;
        C0815PB c0815pb;
        boolean z;
        int mo1129z = interfaceC2438tw.mo1129z();
        Bundle mo1128h = interfaceC2438tw.mo1128h();
        C1200WR c1200wr = this.f7661u;
        if (c1200wr.isEmpty()) {
            c1420ag = this.f7662v;
        } else {
            c1420ag = ((C1553dE) c1200wr.m2476G()).f4790R;
        }
        if (c1420ag != null) {
            C2060mp m2846N = c1420ag.m2846N(mo1129z);
            Bundle bundle = null;
            if (m2846N != null) {
                c0815pb = m2846N.f6402h;
                Bundle bundle2 = m2846N.f6403v;
                i = m2846N.f6404z;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    bundle.putAll(bundle2);
                }
            } else {
                i = mo1129z;
                c0815pb = null;
            }
            if (mo1128h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putAll(mo1128h);
            }
            boolean z2 = false;
            if (i == 0 && c0815pb != null) {
                c0815pb.getClass();
                int i2 = c0815pb.f2773v;
                if (i2 != -1) {
                    boolean z3 = c0815pb.f2767P;
                    if (i2 != -1 && m4332M(i2, z3, false)) {
                        m4340h();
                        return;
                    }
                    return;
                }
            }
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C1420ag m4334P = m4334P(i);
                if (m4334P == null) {
                    int i3 = C1420ag.f4446U;
                    Context context = this.f7665z;
                    String m3149V = C1665fK.m3149V(context, i);
                    if (m2846N == null) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("Navigation destination " + m3149V + " referenced from action " + C1665fK.m3149V(context, mo1129z) + " cannot be found from the current destination " + c1420ag).toString());
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + m3149V + " cannot be found from the current destination " + c1420ag);
                }
                m4338W(m4334P, bundle, c0815pb);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
    }

    /* renamed from: I */
    public final ArrayList m4331I() {
        EnumC1632eh enumC1632eh;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7648U.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC1632eh = EnumC1632eh.f5087I;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C0904R3) it.next()).f3093Q.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C1553dE c1553dE = (C1553dE) obj;
                if (!arrayList.contains(c1553dE) && !c1553dE.f4788E.m3117z(enumC1632eh)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            AbstractC2708z8.m4637oI(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f7661u.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C1553dE c1553dE2 = (C1553dE) next;
            if (!arrayList.contains(c1553dE2) && c1553dE2.f4788E.m3117z(enumC1632eh)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(next);
            }
        }
        AbstractC2708z8.m4637oI(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if ((!(((C1553dE) next2).f4790R instanceof C1951kj)) != false) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* renamed from: M */
    public final boolean m4332M(int i, boolean z, boolean z2) {
        C1420ag c1420ag;
        C1200WR c1200wr = this.f7661u;
        if (c1200wr.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC2486us.m4292j5(c1200wr).iterator();
        while (true) {
            if (it.hasNext()) {
                c1420ag = ((C1553dE) it.next()).f4790R;
                AbstractC2719zK mo2533h = this.f7660s.mo2533h(c1420ag.f4449S);
                if (z || c1420ag.f4455y != i) {
                    arrayList.add(mo2533h);
                }
                if (c1420ag.f4455y == i) {
                    break;
                }
            } else {
                c1420ag = null;
                break;
            }
        }
        if (c1420ag == null) {
            int i2 = C1420ag.f4446U;
            Log.i("NavController", "Ignoring popBackStack to destination " + C1665fK.m3149V(this.f7665z, i) + " as it was not found on the current back stack");
            return false;
        }
        return m4346v(arrayList, c1420ag, z, z2);
    }

    /* renamed from: N */
    public final C1553dE m4333N(int i) {
        Object obj;
        boolean z;
        C1200WR c1200wr = this.f7661u;
        ListIterator<E> listIterator = c1200wr.listIterator(c1200wr.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((C1553dE) obj).f4790R.f4455y == i) {
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
        C1553dE c1553dE = (C1553dE) obj;
        if (c1553dE != null) {
            return c1553dE;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + m4335Q()).toString());
    }

    /* renamed from: P */
    public final C1420ag m4334P(int i) {
        C1420ag c1420ag;
        C1951kj c1951kj;
        C1951kj c1951kj2 = this.f7662v;
        if (c1951kj2 == null) {
            return null;
        }
        if (c1951kj2.f4455y == i) {
            return c1951kj2;
        }
        C1553dE c1553dE = (C1553dE) this.f7661u.m2477M();
        if (c1553dE == null || (c1420ag = c1553dE.f4790R) == null) {
            c1420ag = this.f7662v;
        }
        if (c1420ag.f4455y != i) {
            if (c1420ag instanceof C1951kj) {
                c1951kj = (C1951kj) c1420ag;
            } else {
                c1951kj = c1420ag.f4448R;
            }
            return c1951kj.m3572V(i, true);
        }
        return c1420ag;
    }

    /* renamed from: Q */
    public final C1420ag m4335Q() {
        C1553dE c1553dE = (C1553dE) this.f7661u.m2477M();
        if (c1553dE != null) {
            return c1553dE.f4790R;
        }
        return null;
    }

    /* renamed from: R */
    public final void m4336R(C1553dE c1553dE, boolean z, C1200WR c1200wr) {
        boolean z2;
        C0401Hd c0401Hd;
        C2145oS c2145oS;
        C1323Yo c1323Yo;
        Set set;
        C1200WR c1200wr2 = this.f7661u;
        C1553dE c1553dE2 = (C1553dE) c1200wr2.m2476G();
        if (AbstractC1292YB.m2695u(c1553dE2, c1553dE)) {
            c1200wr2.m2481R();
            C0904R3 c0904r3 = (C0904R3) this.f7648U.get(this.f7660s.mo2533h(c1553dE2.f4790R.f4449S));
            boolean z3 = true;
            if (c0904r3 != null && (c1323Yo = c0904r3.f3093Q) != null && (set = (Set) c1323Yo.getValue()) != null && set.contains(c1553dE2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !this.f7642M.containsKey(c1553dE2)) {
                z3 = false;
            }
            EnumC1632eh enumC1632eh = c1553dE2.f4798y.f1105P;
            EnumC1632eh enumC1632eh2 = EnumC1632eh.f5092w;
            if (enumC1632eh.m3117z(enumC1632eh2)) {
                if (z) {
                    c1553dE2.m3022P(enumC1632eh2);
                    c1200wr.m2479P(new C0359Gs(c1553dE2));
                }
                if (!z3) {
                    c1553dE2.m3022P(EnumC1632eh.f5089S);
                    m4339g(c1553dE2);
                } else {
                    c1553dE2.m3022P(enumC1632eh2);
                }
            }
            if (!z && !z3 && (c0401Hd = this.f7663w) != null && (c2145oS = (C2145oS) c0401Hd.f1353I.remove(c1553dE2.f4794k)) != null) {
                c2145oS.m3763z();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + c1553dE.f4790R + ", which is not the top of the back stack (" + c1553dE2.f4790R + ')').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00b2 A[EDGE_INSN: B:126:0x00b2->B:117:0x00b2 BREAK  A[LOOP:0: B:73:0x001d->B:129:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[LOOP:0: B:73:0x001d->B:129:?, LOOP_END, SYNTHETIC] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4337V(java.lang.String r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            a.WR r3 = r0.f7661u
            boolean r4 = r3.isEmpty()
            r5 = 0
            if (r4 == 0) goto L10
            return r5
        L10:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r3.mo1150h()
            java.util.ListIterator r3 = r3.listIterator(r6)
        L1d:
            boolean r6 = r3.hasPrevious()
            r7 = 0
            if (r6 == 0) goto Lb1
            java.lang.Object r6 = r3.previous()
            r8 = r6
            a.dE r8 = (p000a.C1553dE) r8
            a.ag r9 = r8.f4790R
            android.os.Bundle r10 = r8.m3023v()
            java.lang.String r11 = r9.f4453s
            boolean r11 = p000a.AbstractC1292YB.m2695u(r11, r1)
            if (r11 == 0) goto L3b
            goto L97
        L3b:
            a.Rt r11 = r9.m2849W(r1)
            if (r11 == 0) goto L44
            a.ag r12 = r11.f3250S
            goto L45
        L44:
            r12 = r7
        L45:
            boolean r9 = p000a.AbstractC1292YB.m2695u(r9, r12)
            if (r9 != 0) goto L4c
            goto L9c
        L4c:
            if (r10 == 0) goto L99
            android.os.Bundle r9 = r11.f3249R
            if (r9 != 0) goto L53
            goto L9c
        L53:
            java.util.Set r12 = r9.keySet()
            java.util.Iterator r12 = r12.iterator()
        L5b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L97
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = r10.containsKey(r13)
            if (r14 != 0) goto L6e
            goto L9c
        L6e:
            a.ag r14 = r11.f3250S
            java.util.Map r14 = r14.m2848Q()
            java.lang.Object r14 = r14.get(r13)
            a.tZ r14 = (p000a.C2419tZ) r14
            if (r14 == 0) goto L7f
            a.RT r14 = r14.f7408z
            goto L80
        L7f:
            r14 = r7
        L80:
            if (r14 == 0) goto L87
            java.lang.Object r15 = r14.mo1956z(r13, r9)
            goto L88
        L87:
            r15 = r7
        L88:
            if (r14 == 0) goto L8f
            java.lang.Object r13 = r14.mo1956z(r13, r10)
            goto L90
        L8f:
            r13 = r7
        L90:
            boolean r13 = p000a.AbstractC1292YB.m2695u(r15, r13)
            if (r13 != 0) goto L5b
            goto L9c
        L97:
            r9 = 1
            goto L9d
        L99:
            r11.getClass()
        L9c:
            r9 = r5
        L9d:
            if (r2 != 0) goto La1
            if (r9 != 0) goto Lae
        La1:
            a.ag r8 = r8.f4790R
            java.lang.String r8 = r8.f4449S
            a.kK r10 = r0.f7660s
            a.zK r8 = r10.mo2533h(r8)
            r4.add(r8)
        Lae:
            if (r9 == 0) goto L1d
            goto Lb2
        Lb1:
            r6 = r7
        Lb2:
            a.dE r6 = (p000a.C1553dE) r6
            if (r6 == 0) goto Lb8
            a.ag r7 = r6.f4790R
        Lb8:
            if (r7 != 0) goto Ld3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ignoring popBackStack to route "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " as it was not found on the current back stack"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "NavController"
            android.util.Log.i(r2, r1)
            return r5
        Ld3:
            r1 = r19
            boolean r1 = r0.m4346v(r4, r7, r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2499v4.m4337V(java.lang.String, boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01b9 A[LOOP:1: B:175:0x01b3->B:177:0x01b9, LOOP_END] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4338W(p000a.C1420ag r25, android.os.Bundle r26, p000a.C0815PB r27) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2499v4.m4338W(a.ag, android.os.Bundle, a.PB):void");
    }

    /* renamed from: g */
    public final void m4339g(C1553dE c1553dE) {
        Integer num;
        C1553dE c1553dE2 = (C1553dE) this.f7638G.remove(c1553dE);
        if (c1553dE2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f7642M;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c1553dE2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C0904R3 c0904r3 = (C0904R3) this.f7648U.get(this.f7660s.mo2533h(c1553dE2.f4790R.f4449S));
            if (c0904r3 != null) {
                c0904r3.m2057h(c1553dE2);
            }
            linkedHashMap.remove(c1553dE2);
        }
    }

    /* renamed from: h */
    public final boolean m4340h() {
        C1200WR c1200wr;
        while (true) {
            c1200wr = this.f7661u;
            if (c1200wr.isEmpty() || !(((C1553dE) c1200wr.m2476G()).f4790R instanceof C1951kj)) {
                break;
            }
            m4329w(this, (C1553dE) c1200wr.m2476G());
        }
        C1553dE c1553dE = (C1553dE) c1200wr.m2477M();
        ArrayList arrayList = this.f7641J;
        if (c1553dE != null) {
            arrayList.add(c1553dE);
        }
        this.f7651Y++;
        m4347y();
        int i = this.f7651Y - 1;
        this.f7651Y = i;
        if (i == 0) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C1553dE c1553dE2 = (C1553dE) it.next();
                Iterator it2 = this.f7640I.iterator();
                while (it2.hasNext()) {
                    C1488c0 c1488c0 = (C1488c0) it2.next();
                    C1420ag c1420ag = c1553dE2.f4790R;
                    c1553dE2.m3023v();
                    c1488c0.m2890z(c1420ag);
                }
                this.f7639H.m3534w(c1553dE2);
            }
            this.f7657o.m2607u(new ArrayList(c1200wr));
            this.f7650W.m2607u(m4331I());
        }
        if (c1553dE != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:364:0x01d0, code lost:
    
        if (r10 != false) goto L365;
     */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x03a3  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4341k(p000a.C1951kj r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2499v4.m4341k(a.kj, android.os.Bundle):void");
    }

    /* renamed from: o */
    public final void m4342o(C1553dE c1553dE, C1553dE c1553dE2) {
        this.f7638G.put(c1553dE, c1553dE2);
        LinkedHashMap linkedHashMap = this.f7642M;
        if (linkedHashMap.get(c1553dE2) == null) {
            linkedHashMap.put(c1553dE2, new AtomicInteger(0));
        }
        ((AtomicInteger) linkedHashMap.get(c1553dE2)).incrementAndGet();
    }

    /* renamed from: q */
    public final boolean m4343q(int i, Bundle bundle, C0815PB c0815pb) {
        C1420ag c1420ag;
        C1553dE c1553dE;
        C1420ag c1420ag2;
        C1951kj c1951kj;
        C1420ag m3572V;
        LinkedHashMap linkedHashMap = this.f7649V;
        int i2 = 0;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        AbstractC2708z8.m4636G5(linkedHashMap.values(), new C1747gr(i2, str), true);
        LinkedHashMap linkedHashMap2 = this.f7647S;
        AbstractC0438II.m1016W(linkedHashMap2);
        C1200WR c1200wr = (C1200WR) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        C1553dE c1553dE2 = (C1553dE) this.f7661u.m2477M();
        if ((c1553dE2 != null && (c1420ag = c1553dE2.f4790R) != null) || (c1420ag = this.f7662v) != null) {
            if (c1200wr != null) {
                Iterator it = c1200wr.iterator();
                while (it.hasNext()) {
                    C0359Gs c0359Gs = (C0359Gs) it.next();
                    int i3 = c0359Gs.f1210R;
                    if (c1420ag.f4455y == i3) {
                        m3572V = c1420ag;
                    } else {
                        if (c1420ag instanceof C1951kj) {
                            c1951kj = (C1951kj) c1420ag;
                        } else {
                            c1951kj = c1420ag.f4448R;
                        }
                        m3572V = c1951kj.m3572V(i3, true);
                    }
                    Context context = this.f7665z;
                    if (m3572V != null) {
                        arrayList.add(c0359Gs.m782h(context, m3572V, m4345u(), this.f7663w));
                        c1420ag = m3572V;
                    } else {
                        int i4 = C1420ag.f4446U;
                        throw new IllegalStateException(("Restore State failed: destination " + C1665fK.m3149V(context, c0359Gs.f1210R) + " cannot be found from the current destination " + c1420ag).toString());
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!(((C1553dE) next).f4790R instanceof C1951kj)) {
                    arrayList3.add(next);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (true) {
                String str2 = null;
                if (!it3.hasNext()) {
                    break;
                }
                C1553dE c1553dE3 = (C1553dE) it3.next();
                List list = (List) AbstractC2486us.m4277Fu(arrayList2);
                if (list != null && (c1553dE = (C1553dE) AbstractC2486us.m4283Ry(list)) != null && (c1420ag2 = c1553dE.f4790R) != null) {
                    str2 = c1420ag2.f4449S;
                }
                if (AbstractC1292YB.m2695u(str2, c1553dE3.f4790R.f4449S)) {
                    list.add(c1553dE3);
                } else {
                    arrayList2.add(AbstractC1292YB.m2694t(c1553dE3));
                }
            }
            C1216Wj c1216Wj = new C1216Wj();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                List list2 = (List) it4.next();
                AbstractC2719zK mo2533h = this.f7660s.mo2533h(((C1553dE) AbstractC2486us.m4281O4(list2)).f4790R.f4449S);
                this.f7637E = new C0603LI(c1216Wj, arrayList, new C1909jv(), this, bundle);
                mo2533h.mo2294P(list2, c0815pb);
                this.f7637E = null;
            }
            return c1216Wj.f3980S;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    /* renamed from: s */
    public final void m4344s() {
        int i;
        boolean z = false;
        if (this.f7664y) {
            C1200WR c1200wr = this.f7661u;
            if ((c1200wr instanceof Collection) && c1200wr.isEmpty()) {
                i = 0;
            } else {
                Iterator it = c1200wr.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!(((C1553dE) it.next()).f4790R instanceof C1951kj)) != false && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i > 1) {
                z = true;
            }
        }
        this.f7654g.m778z(z);
    }

    /* renamed from: u */
    public final EnumC1632eh m4345u() {
        return this.f7646R == null ? EnumC1632eh.f5092w : this.f7658q;
    }

    /* renamed from: v */
    public final boolean m4346v(ArrayList arrayList, C1420ag c1420ag, boolean z, boolean z2) {
        String str;
        Object obj;
        String str2;
        C1216Wj c1216Wj = new C1216Wj();
        C1200WR c1200wr = new C1200WR();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2719zK abstractC2719zK = (AbstractC2719zK) it.next();
            C1216Wj c1216Wj2 = new C1216Wj();
            C1553dE c1553dE = (C1553dE) this.f7661u.m2476G();
            this.f7653f = new C1752gw(c1216Wj2, c1216Wj, this, z2, c1200wr);
            abstractC2719zK.mo3751W(c1553dE, z2);
            this.f7653f = null;
            if (!c1216Wj2.f3980S) {
                break;
            }
        }
        if (z2) {
            LinkedHashMap linkedHashMap = this.f7649V;
            int i = 1;
            if (!z) {
                Iterator it2 = new C1831iT(AbstractC0873QM.m2010BX(c1420ag, C1980lF.f6142s), new C0704NI(this, 0), 1).iterator();
                while (it2.hasNext()) {
                    Integer valueOf = Integer.valueOf(((C1420ag) it2.next()).f4455y);
                    if (c1200wr.isEmpty()) {
                        obj = null;
                    } else {
                        obj = c1200wr.f3906R[c1200wr.f3907S];
                    }
                    C0359Gs c0359Gs = (C0359Gs) obj;
                    if (c0359Gs != null) {
                        str2 = c0359Gs.f1211S;
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put(valueOf, str2);
                }
            }
            if ((!c1200wr.isEmpty()) != false) {
                C0359Gs c0359Gs2 = (C0359Gs) c1200wr.m2484W();
                Iterator it3 = new C1831iT(AbstractC0873QM.m2010BX(m4334P(c0359Gs2.f1210R), C1980lF.f6128U), new C0704NI(this, i), 1).iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    str = c0359Gs2.f1211S;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((C1420ag) it3.next()).f4455y), str);
                }
                this.f7647S.put(str, c1200wr);
            }
        }
        m4344s();
        return c1216Wj.f3980S;
    }

    /* renamed from: y */
    public final void m4347y() {
        Boolean bool;
        boolean z;
        C1323Yo c1323Yo;
        Set set;
        ArrayList arrayList = new ArrayList(this.f7661u);
        if (arrayList.isEmpty()) {
            return;
        }
        C1420ag c1420ag = ((C1553dE) AbstractC2486us.m4283Ry(arrayList)).f4790R;
        ArrayList arrayList2 = new ArrayList();
        if (c1420ag instanceof InterfaceC0015AG) {
            Iterator it = AbstractC2486us.m4292j5(arrayList).iterator();
            while (it.hasNext()) {
                C1420ag c1420ag2 = ((C1553dE) it.next()).f4790R;
                arrayList2.add(c1420ag2);
                if (!(c1420ag2 instanceof InterfaceC0015AG) && !(c1420ag2 instanceof C1951kj)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C1553dE c1553dE : AbstractC2486us.m4292j5(arrayList)) {
            EnumC1632eh enumC1632eh = c1553dE.f4788E;
            C1420ag c1420ag3 = c1553dE.f4790R;
            EnumC1632eh enumC1632eh2 = EnumC1632eh.f5091q;
            EnumC1632eh enumC1632eh3 = EnumC1632eh.f5087I;
            boolean z2 = true;
            if (c1420ag != null && c1420ag3.f4455y == c1420ag.f4455y) {
                if (enumC1632eh != enumC1632eh2) {
                    C0904R3 c0904r3 = (C0904R3) this.f7648U.get(this.f7660s.mo2533h(c1420ag3.f4449S));
                    if (c0904r3 != null && (c1323Yo = c0904r3.f3093Q) != null && (set = (Set) c1323Yo.getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(c1553dE));
                    } else {
                        bool = null;
                    }
                    if (!AbstractC1292YB.m2695u(bool, Boolean.TRUE)) {
                        AtomicInteger atomicInteger = (AtomicInteger) this.f7642M.get(c1553dE);
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            hashMap.put(c1553dE, enumC1632eh2);
                        }
                    }
                    hashMap.put(c1553dE, enumC1632eh3);
                }
                C1420ag c1420ag4 = (C1420ag) AbstractC2486us.m4293nB(arrayList2);
                if (c1420ag4 == null || c1420ag4.f4455y != c1420ag3.f4455y) {
                    z2 = false;
                }
                if (z2) {
                    if (!arrayList2.isEmpty()) {
                        arrayList2.remove(0);
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                }
                c1420ag = c1420ag.f4448R;
            } else if ((true ^ arrayList2.isEmpty()) && c1420ag3.f4455y == ((C1420ag) AbstractC2486us.m4281O4(arrayList2)).f4455y) {
                if (!arrayList2.isEmpty()) {
                    C1420ag c1420ag5 = (C1420ag) arrayList2.remove(0);
                    if (enumC1632eh == enumC1632eh2) {
                        c1553dE.m3022P(enumC1632eh3);
                    } else if (enumC1632eh != enumC1632eh3) {
                        hashMap.put(c1553dE, enumC1632eh3);
                    }
                    C1951kj c1951kj = c1420ag5.f4448R;
                    if (c1951kj != null && !arrayList2.contains(c1951kj)) {
                        arrayList2.add(c1951kj);
                    }
                } else {
                    throw new NoSuchElementException("List is empty.");
                }
            } else {
                c1553dE.m3022P(EnumC1632eh.f5092w);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1553dE c1553dE2 = (C1553dE) it2.next();
            EnumC1632eh enumC1632eh4 = (EnumC1632eh) hashMap.get(c1553dE2);
            if (enumC1632eh4 != null) {
                c1553dE2.m3022P(enumC1632eh4);
            } else {
                c1553dE2.m3021N();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0008, code lost:
    
        if (r1 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x000e, code lost:
    
        if (r4.isEmpty() != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x001a, code lost:
    
        if ((((p000a.C1553dE) r4.m2476G()).f4790R instanceof p000a.InterfaceC0015AG) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x002a, code lost:
    
        if (m4332M(((p000a.C1553dE) r4.m2476G()).f4790R.f4455y, true, false) != false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x002c, code lost:
    
        r1 = new p000a.C1200WR();
        r5 = r12 instanceof p000a.C1951kj;
        r6 = r11.f7665z;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0036, code lost:
    
        if (r5 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0038, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0039, code lost:
    
        r5 = r5.f4448R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x003b, code lost:
    
        if (r5 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x003d, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0049, code lost:
    
        if (r8.hasPrevious() == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x004b, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0058, code lost:
    
        if (p000a.AbstractC1292YB.m2695u(((p000a.C1553dE) r9).f4790R, r5) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x005b, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x005c, code lost:
    
        r9 = (p000a.C1553dE) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x005e, code lost:
    
        if (r9 != null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0060, code lost:
    
        r8 = p000a.C1553dE.f4787f;
        r9 = p000a.C1665fK.m3153u(r6, r5, r13, m4345u(), r11.f7663w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x006c, code lost:
    
        r1.m2479P(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0074, code lost:
    
        if ((!r4.isEmpty()) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x007e, code lost:
    
        if (((p000a.C1553dE) r4.m2476G()).f4790R != r5) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0080, code lost:
    
        m4329w(r11, (p000a.C1553dE) r4.m2476G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0089, code lost:
    
        if (r5 == null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x008b, code lost:
    
        if (r5 != r12) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0091, code lost:
    
        if (r1.isEmpty() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0093, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0095, code lost:
    
        r5 = ((p000a.C1553dE) r1.m2484W()).f4790R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x009d, code lost:
    
        if (r5 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x00a5, code lost:
    
        if (m4334P(r5.f4455y) == r5) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00a7, code lost:
    
        r5 = r5.f4448R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00a9, code lost:
    
        if (r5 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00ab, code lost:
    
        if (r13 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00b1, code lost:
    
        if (r13.isEmpty() != r3) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00b4, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00b5, code lost:
    
        if (r3 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00b7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00b9, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00ba, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00c6, code lost:
    
        if (r8.hasPrevious() == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00c8, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00d5, code lost:
    
        if (p000a.AbstractC1292YB.m2695u(((p000a.C1553dE) r9).f4790R, r5) == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00d8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00d9, code lost:
    
        r9 = (p000a.C1553dE) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00db, code lost:
    
        if (r9 != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00dd, code lost:
    
        r8 = p000a.C1553dE.f4787f;
        r9 = p000a.C1665fK.m3153u(r6, r5, r5.m2852v(r3), m4345u(), r11.f7663w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00ed, code lost:
    
        r1.m2479P(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00f0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00f6, code lost:
    
        if (r1.isEmpty() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00f9, code lost:
    
        r0 = ((p000a.C1553dE) r1.m2484W()).f4790R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0105, code lost:
    
        if (r4.isEmpty() != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0111, code lost:
    
        if ((((p000a.C1553dE) r4.m2476G()).f4790R instanceof p000a.C1951kj) == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0123, code lost:
    
        if (((p000a.C1951kj) ((p000a.C1553dE) r4.m2476G()).f4790R).m3572V(r0.f4455y, false) != null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0125, code lost:
    
        m4329w(r11, (p000a.C1553dE) r4.m2476G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0133, code lost:
    
        if (r4.isEmpty() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0135, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0137, code lost:
    
        r0 = r4.f3906R[r4.f3907S];
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x013d, code lost:
    
        r0 = (p000a.C1553dE) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x013f, code lost:
    
        if (r0 != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0145, code lost:
    
        if (r1.isEmpty() == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0147, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0149, code lost:
    
        r0 = r1.f3906R[r1.f3907S];
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x014f, code lost:
    
        r0 = (p000a.C1553dE) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0151, code lost:
    
        if (r0 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0153, code lost:
    
        r0 = r0.f4790R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0156, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x015d, code lost:
    
        if (p000a.AbstractC1292YB.m2695u(r0, r11.f7662v) != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x015f, code lost:
    
        r15 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x016b, code lost:
    
        if (r15.hasPrevious() == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x016d, code lost:
    
        r0 = r15.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x017c, code lost:
    
        if (p000a.AbstractC1292YB.m2695u(((p000a.C1553dE) r0).f4790R, r11.f7662v) == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x017e, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x017f, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0181, code lost:
    
        if (r7 != null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0183, code lost:
    
        r15 = p000a.C1553dE.f4787f;
        r15 = r11.f7662v;
        r7 = p000a.C1665fK.m3153u(r6, r15, r15.m2852v(r13), m4345u(), r11.f7663w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0195, code lost:
    
        r1.m2479P(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0198, code lost:
    
        r13 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01a0, code lost:
    
        if (r13.hasNext() == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01a2, code lost:
    
        r15 = (p000a.C1553dE) r13.next();
        r0 = r11.f7648U.get(r11.f7660s.mo2533h(r15.f4790R.f4449S));
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01b8, code lost:
    
        if (r0 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01ba, code lost:
    
        ((p000a.C0904R3) r0).m2061z(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01d8, code lost:
    
        throw new java.lang.IllegalStateException(p000a.AbstractC2441tz.m4187M(new java.lang.StringBuilder("NavigatorBackStack for "), r12.f4449S, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01d9, code lost:
    
        r4.addAll(r1);
        r4.m2478N(r14);
        r12 = p000a.AbstractC2486us.m4285T0(r1, r14).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01eb, code lost:
    
        if (r12.hasNext() == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01ed, code lost:
    
        r13 = (p000a.C1553dE) r12.next();
        r14 = r13.f4790R.f4448R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01f7, code lost:
    
        if (r14 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01f9, code lost:
    
        m4342o(r13, m4333N(r14.f4455y));
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0203, code lost:
    
        return;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4348z(p000a.C1420ag r12, android.os.Bundle r13, p000a.C1553dE r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2499v4.m4348z(a.ag, android.os.Bundle, a.dE, java.util.List):void");
    }
}
