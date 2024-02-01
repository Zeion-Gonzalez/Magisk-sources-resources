package p000a;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.cx */
/* loaded from: classes.dex */
public final class C1535cx extends AbstractC1139VJ {

    /* renamed from: BX */
    public int f4737BX;

    /* renamed from: d3 */
    public int f4749d3;

    /* renamed from: nB */
    public int f4753nB;

    /* renamed from: oI */
    public final C1174Vy f4754oI = new C1174Vy(this);

    /* renamed from: G5 */
    public final C1667fM f4740G5 = new C1667fM(this);

    /* renamed from: d2 */
    public C0847Pp f4748d2 = null;

    /* renamed from: dG */
    public boolean f4750dG = false;

    /* renamed from: O4 */
    public final C0457If f4743O4 = new C0457If();

    /* renamed from: yF */
    public int f4756yF = 0;

    /* renamed from: tJ */
    public int f4755tJ = 0;

    /* renamed from: EQ */
    public C2592wq[] f4738EQ = new C2592wq[4];

    /* renamed from: Ry */
    public C2592wq[] f4745Ry = new C2592wq[4];

    /* renamed from: Fu */
    public int f4739Fu = 257;

    /* renamed from: Rh */
    public boolean f4744Rh = false;

    /* renamed from: M6 */
    public boolean f4742M6 = false;

    /* renamed from: T0 */
    public WeakReference f4746T0 = null;

    /* renamed from: j5 */
    public WeakReference f4752j5 = null;

    /* renamed from: zd */
    public WeakReference f4757zd = null;

    /* renamed from: fH */
    public WeakReference f4751fH = null;

    /* renamed from: LN */
    public final HashSet f4741LN = new HashSet();

    /* renamed from: W9 */
    public final C0782OY f4747W9 = new C0782OY();

    /* renamed from: x */
    public static void m2976x(C1628ed c1628ed, C0847Pp c0847Pp, C0782OY c0782oy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        if (c0847Pp == null) {
            return;
        }
        if (c1628ed.f5046UZ != 8 && !(c1628ed instanceof C2009ln) && !(c1628ed instanceof C0403Hf)) {
            int[] iArr = c1628ed.f5030Ha;
            c0782oy.f2651z = iArr[0];
            boolean z5 = true;
            c0782oy.f2647h = iArr[1];
            c0782oy.f2650v = c1628ed.m3098R();
            c0782oy.f2644P = c1628ed.m3101V();
            c0782oy.f2646W = false;
            c0782oy.f2642G = 0;
            if (c0782oy.f2651z == 3) {
                z = true;
            } else {
                z = false;
            }
            if (c0782oy.f2647h == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && c1628ed.f5067m > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && c1628ed.f5067m > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && c1628ed.m3112q(0) && c1628ed.f5075q == 0 && !z3) {
                c0782oy.f2651z = 2;
                if (z2 && c1628ed.f5065k == 0) {
                    c0782oy.f2651z = 1;
                }
                z = false;
            }
            if (z2 && c1628ed.m3112q(1) && c1628ed.f5065k == 0 && !z4) {
                c0782oy.f2647h = 2;
                if (z && c1628ed.f5075q == 0) {
                    c0782oy.f2647h = 1;
                }
                z2 = false;
            }
            if (c1628ed.mo903f()) {
                c0782oy.f2651z = 1;
                z = false;
            }
            if (c1628ed.mo904r()) {
                c0782oy.f2647h = 1;
                z2 = false;
            }
            int[] iArr2 = c1628ed.f5060g;
            if (z3) {
                if (iArr2[0] == 4) {
                    c0782oy.f2651z = 1;
                } else if (!z2) {
                    if (c0782oy.f2647h == 1) {
                        i3 = c0782oy.f2644P;
                    } else {
                        c0782oy.f2651z = 2;
                        c0847Pp.m1962h(c1628ed, c0782oy);
                        i3 = c0782oy.f2645Q;
                    }
                    c0782oy.f2651z = 1;
                    c0782oy.f2650v = (int) (c1628ed.f5067m * i3);
                }
            }
            if (z4) {
                if (iArr2[1] == 4) {
                    c0782oy.f2647h = 1;
                } else if (!z) {
                    if (c0782oy.f2651z == 1) {
                        i = c0782oy.f2650v;
                    } else {
                        c0782oy.f2647h = 2;
                        c0847Pp.m1962h(c1628ed, c0782oy);
                        i = c0782oy.f2643N;
                    }
                    c0782oy.f2647h = 1;
                    if (c1628ed.f5066l == -1) {
                        i2 = (int) (i / c1628ed.f5067m);
                    } else {
                        i2 = (int) (c1628ed.f5067m * i);
                    }
                    c0782oy.f2644P = i2;
                }
            }
            c0847Pp.m1962h(c1628ed, c0782oy);
            c1628ed.m3111p(c0782oy.f2643N);
            c1628ed.m3090F(c0782oy.f2645Q);
            c1628ed.f5058e = c0782oy.f2648o;
            int i4 = c0782oy.f2649u;
            c1628ed.f5051Yd = i4;
            if (i4 <= 0) {
                z5 = false;
            }
            c1628ed.f5058e = z5;
            c0782oy.f2642G = 0;
            return;
        }
        c0782oy.f2643N = 0;
        c0782oy.f2645Q = 0;
    }

    /* renamed from: O */
    public final void m2977O(C0457If c0457If) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean m2978T = m2978T(64);
        mo905v(c0457If, m2978T);
        int size = this.f3714Pm.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1628ed c1628ed = (C1628ed) this.f3714Pm.get(i2);
            boolean[] zArr = c1628ed.f5079t;
            zArr[0] = false;
            zArr[1] = false;
            if (c1628ed instanceof C0403Hf) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i3 = 0; i3 < size; i3++) {
                C1628ed c1628ed2 = (C1628ed) this.f3714Pm.get(i3);
                if (c1628ed2 instanceof C0403Hf) {
                    C0403Hf c0403Hf = (C0403Hf) c1628ed2;
                    for (int i4 = 0; i4 < c0403Hf.f4326oI; i4++) {
                        C1628ed c1628ed3 = c0403Hf.f4325Pm[i4];
                        if (c0403Hf.f1363BX || c1628ed3.mo901P()) {
                            int i5 = c0403Hf.f1364G5;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    c1628ed3.f5079t[1] = true;
                                }
                            } else {
                                c1628ed3.f5079t[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f4741LN;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C1628ed c1628ed4 = (C1628ed) this.f3714Pm.get(i6);
            c1628ed4.getClass();
            if (!(c1628ed4 instanceof C2607x4) && !(c1628ed4 instanceof C2009ln)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                if (c1628ed4 instanceof C2607x4) {
                    hashSet.add(c1628ed4);
                } else {
                    c1628ed4.mo905v(c0457If, m2978T);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2607x4 c2607x4 = (C2607x4) ((C1628ed) it.next());
                int i7 = 0;
                while (true) {
                    if (i7 < c2607x4.f4326oI) {
                        if (hashSet.contains(c2607x4.f4325Pm[i7])) {
                            z3 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z3 = false;
                        break;
                    }
                }
                if (z3) {
                    c2607x4.mo905v(c0457If, m2978T);
                    hashSet.remove(c2607x4);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1628ed) it2.next()).mo905v(c0457If, m2978T);
                }
                hashSet.clear();
            }
        }
        if (C0457If.f1527I) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                C1628ed c1628ed5 = (C1628ed) this.f3714Pm.get(i8);
                c1628ed5.getClass();
                if (!(c1628ed5 instanceof C2607x4) && !(c1628ed5 instanceof C2009ln)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    hashSet2.add(c1628ed5);
                }
            }
            if (this.f5030Ha[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            m3108h(this, c0457If, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1628ed c1628ed6 = (C1628ed) it3.next();
                AbstractC2575wW.m4406P(this, c0457If, c1628ed6);
                c1628ed6.mo905v(c0457If, m2978T);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                C1628ed c1628ed7 = (C1628ed) this.f3714Pm.get(i9);
                if (c1628ed7 instanceof C1535cx) {
                    int[] iArr = c1628ed7.f5030Ha;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        c1628ed7.m3104Z(1);
                    }
                    if (i11 == 2) {
                        c1628ed7.m3088C(1);
                    }
                    c1628ed7.mo905v(c0457If, m2978T);
                    if (i10 == 2) {
                        c1628ed7.m3104Z(i10);
                    }
                    if (i11 == 2) {
                        c1628ed7.m3088C(i11);
                    }
                } else {
                    AbstractC2575wW.m4406P(this, c0457If, c1628ed7);
                    if (!(c1628ed7 instanceof C2607x4) && !(c1628ed7 instanceof C2009ln)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        c1628ed7.mo905v(c0457If, m2978T);
                    }
                }
            }
        }
        if (this.f4756yF > 0) {
            AbstractC2575wW.m4432h(this, c0457If, null, 0);
        }
        if (this.f4755tJ > 0) {
            AbstractC2575wW.m4432h(this, c0457If, null, 1);
        }
    }

    /* renamed from: T */
    public final boolean m2978T(int i) {
        return (this.f4739Fu & i) == i;
    }

    @Override // p000a.AbstractC1139VJ, p000a.C1628ed
    /* renamed from: Y */
    public final void mo2336Y() {
        this.f4743O4.m1109s();
        this.f4753nB = 0;
        this.f4749d3 = 0;
        super.mo2336Y();
    }

    /* renamed from: d */
    public final void m2979d(int i, C1628ed c1628ed) {
        if (i == 0) {
            int i2 = this.f4756yF + 1;
            C2592wq[] c2592wqArr = this.f4745Ry;
            if (i2 >= c2592wqArr.length) {
                this.f4745Ry = (C2592wq[]) Arrays.copyOf(c2592wqArr, c2592wqArr.length * 2);
            }
            C2592wq[] c2592wqArr2 = this.f4745Ry;
            int i3 = this.f4756yF;
            c2592wqArr2[i3] = new C2592wq(c1628ed, 0, this.f4750dG);
            this.f4756yF = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f4755tJ + 1;
            C2592wq[] c2592wqArr3 = this.f4738EQ;
            if (i4 >= c2592wqArr3.length) {
                this.f4738EQ = (C2592wq[]) Arrays.copyOf(c2592wqArr3, c2592wqArr3.length * 2);
            }
            C2592wq[] c2592wqArr4 = this.f4738EQ;
            int i5 = this.f4755tJ;
            c2592wqArr4[i5] = new C2592wq(c1628ed, 1, this.f4750dG);
            this.f4755tJ = i5 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1009:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x0601 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1027:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:1038:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:1043:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x067e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:1070:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:1076:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:1133:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:1146:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1157:0x0817 A[LOOP:14: B:1156:0x0815->B:1157:0x0817, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1169:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:1170:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:1173:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:1174:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:1176:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:1188:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:1191:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:1195:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:1261:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // p000a.AbstractC1139VJ
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2337i() {
        /*
            Method dump skipped, instructions count: 2299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1535cx.mo2337i():void");
    }

    @Override // p000a.C1628ed
    /* renamed from: j */
    public final void mo2980j(boolean z, boolean z2) {
        super.mo2980j(z, z2);
        int size = this.f3714Pm.size();
        for (int i = 0; i < size; i++) {
            ((C1628ed) this.f3714Pm.get(i)).mo2980j(z, z2);
        }
    }

    /* renamed from: n */
    public final boolean m2981n(int i, boolean z) {
        boolean z2;
        C2546vv c2546vv;
        int m3101V;
        boolean z3 = true;
        boolean z4 = z & true;
        C1667fM c1667fM = this.f4740G5;
        C1535cx c1535cx = c1667fM.f5209z;
        int m3095M = c1535cx.m3095M(0);
        int m3095M2 = c1535cx.m3095M(1);
        int m3115w = c1535cx.m3115w();
        int m3092I = c1535cx.m3092I();
        ArrayList arrayList = c1667fM.f5202N;
        if (z4 && (m3095M == 2 || m3095M2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1790hg abstractC1790hg = (AbstractC1790hg) it.next();
                if (abstractC1790hg.f5625Q == i && !abstractC1790hg.mo1910M()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m3095M == 2) {
                    c1535cx.m3104Z(1);
                    c1535cx.m3111p(c1667fM.m3159P(c1535cx, 0));
                    c2546vv = c1535cx.f5039P.f5623N;
                    m3101V = c1535cx.m3098R();
                    c2546vv.mo2881P(m3101V);
                }
            } else if (z4 && m3095M2 == 2) {
                c1535cx.m3088C(1);
                c1535cx.m3090F(c1667fM.m3159P(c1535cx, 1));
                c2546vv = c1535cx.f5037N.f5623N;
                m3101V = c1535cx.m3101V();
                c2546vv.mo2881P(m3101V);
            }
        }
        int[] iArr = c1535cx.f5030Ha;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int m3098R = c1535cx.m3098R() + m3115w;
                c1535cx.f5039P.f5626W.mo2881P(m3098R);
                c1535cx.f5039P.f5623N.mo2881P(m3098R - m3115w);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int m3101V2 = c1535cx.m3101V() + m3092I;
                c1535cx.f5037N.f5626W.mo2881P(m3101V2);
                c1535cx.f5037N.f5623N.mo2881P(m3101V2 - m3092I);
                z2 = true;
            }
            z2 = false;
        }
        c1667fM.m3162u();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1790hg abstractC1790hg2 = (AbstractC1790hg) it2.next();
            if (abstractC1790hg2.f5625Q == i && (abstractC1790hg2.f5627h != c1535cx || abstractC1790hg2.f5629u)) {
                abstractC1790hg2.mo1911N();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1790hg abstractC1790hg3 = (AbstractC1790hg) it3.next();
            if (abstractC1790hg3.f5625Q == i && (z2 || abstractC1790hg3.f5627h != c1535cx)) {
                if (!abstractC1790hg3.f5628o.f4563G || !abstractC1790hg3.f5626W.f4563G || (!(abstractC1790hg3 instanceof C0807P2) && !abstractC1790hg3.f5623N.f4563G)) {
                    z3 = false;
                    break;
                }
            }
        }
        c1535cx.m3104Z(m3095M);
        c1535cx.m3088C(m3095M2);
        return z3;
    }
}
