package p000a;

import android.view.View;
import java.util.Arrays;
import java.util.List;

/* renamed from: a.Ui */
/* loaded from: classes.dex */
public final class C1105Ui {

    /* renamed from: h */
    public Object f3594h;

    /* renamed from: v */
    public Object f3595v;

    /* renamed from: z */
    public final /* synthetic */ int f3596z;

    public C1105Ui(int i) {
        this.f3596z = i;
        if (i != 1) {
            this.f3594h = new C2698yx();
            this.f3595v = new C1276Xv();
        }
    }

    /* renamed from: G */
    public final void m2275G(int i, int i2) {
        int[] iArr = (int[]) this.f3594h;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            m2277N(i3);
            int[] iArr2 = (int[]) this.f3594h;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.f3594h;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.f3595v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C2690ym c2690ym = (C2690ym) ((List) this.f3595v).get(size);
                    int i4 = c2690ym.f8384S;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.f3595v).remove(size);
                        } else {
                            c2690ym.f8384S = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public final C2402tF m2276M(AbstractC0249El abstractC0249El, int i) {
        C0380HF c0380hf;
        C2402tF c2402tF;
        int m4621N = ((C2698yx) this.f3594h).m4621N(abstractC0249El);
        if (m4621N >= 0 && (c0380hf = (C0380HF) ((C2698yx) this.f3594h).m4620G(m4621N)) != null) {
            int i2 = c0380hf.f1300z;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c0380hf.f1300z = i3;
                if (i == 4) {
                    c2402tF = c0380hf.f1298h;
                } else if (i == 8) {
                    c2402tF = c0380hf.f1299v;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ((C2698yx) this.f3594h).m4624W(m4621N);
                    c0380hf.f1300z = 0;
                    c0380hf.f1298h = null;
                    c0380hf.f1299v = null;
                    C0380HF.f1297P.mo1756h(c0380hf);
                }
                return c2402tF;
            }
        }
        return null;
    }

    /* renamed from: N */
    public final void m2277N(int i) {
        Object obj = this.f3594h;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.f3594h = iArr;
            Arrays.fill(iArr, -1);
        } else if (i >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f3594h = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f3594h;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    /* renamed from: P */
    public final void m2278P() {
        switch (this.f3596z) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C2698yx) this.f3594h).clear();
                ((C1276Xv) this.f3595v).m2605v();
                return;
            default:
                int[] iArr = (int[]) this.f3594h;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f3595v = null;
                return;
        }
    }

    /* renamed from: Q */
    public final View m2279Q(int i, int i2, int i3, int i4) {
        int m1518X;
        int i5;
        View m1550s;
        C2052mg c2052mg = (C2052mg) ((InterfaceC1047Td) this.f3594h);
        int i6 = c2052mg.f6383S;
        Object obj = c2052mg.f6382R;
        switch (i6) {
            case AbstractC0795Op.f2698E /* 0 */:
                m1518X = ((AbstractC0667Md) obj).m1496H();
                break;
            default:
                m1518X = ((AbstractC0667Md) obj).m1518X();
                break;
        }
        int m3684u = ((C2052mg) ((InterfaceC1047Td) this.f3594h)).m3684u();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            C2052mg c2052mg2 = (C2052mg) ((InterfaceC1047Td) this.f3594h);
            int i7 = c2052mg2.f6383S;
            Object obj2 = c2052mg2.f6382R;
            switch (i7) {
                case AbstractC0795Op.f2698E /* 0 */:
                    m1550s = ((AbstractC0667Md) obj2).m1550s(i);
                    break;
                default:
                    m1550s = ((AbstractC0667Md) obj2).m1550s(i);
                    break;
            }
            int m3681Q = ((C2052mg) ((InterfaceC1047Td) this.f3594h)).m3681Q(m1550s);
            int m3680N = ((C2052mg) ((InterfaceC1047Td) this.f3594h)).m3680N(m1550s);
            Object obj3 = this.f3595v;
            C0975SI c0975si = (C0975SI) obj3;
            c0975si.f3293h = m1518X;
            c0975si.f3294v = m3684u;
            c0975si.f3292P = m3681Q;
            c0975si.f3291N = m3680N;
            if (i3 != 0) {
                ((C0975SI) obj3).f3295z = i3 | 0;
                if (((C0975SI) obj3).m2154z()) {
                    return m1550s;
                }
            }
            if (i4 != 0) {
                Object obj4 = this.f3595v;
                ((C0975SI) obj4).f3295z = i4 | 0;
                if (((C0975SI) obj4).m2154z()) {
                    view = m1550s;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: S */
    public final void m2280S(AbstractC0249El abstractC0249El) {
        C1276Xv c1276Xv = (C1276Xv) this.f3595v;
        if (c1276Xv.f4102S) {
            c1276Xv.m2600N();
        }
        int i = c1276Xv.f4100I - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            if (abstractC0249El == ((C1276Xv) this.f3595v).m2603o(i)) {
                C1276Xv c1276Xv2 = (C1276Xv) this.f3595v;
                Object[] objArr = c1276Xv2.f4103w;
                Object obj = objArr[i];
                Object obj2 = C1276Xv.f4099q;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    c1276Xv2.f4102S = true;
                }
            } else {
                i--;
            }
        }
        C0380HF c0380hf = (C0380HF) ((C2698yx) this.f3594h).remove(abstractC0249El);
        if (c0380hf != null) {
            c0380hf.f1300z = 0;
            c0380hf.f1298h = null;
            c0380hf.f1299v = null;
            C0380HF.f1297P.mo1756h(c0380hf);
        }
    }

    /* renamed from: V */
    public final void m2281V(AbstractC0249El abstractC0249El) {
        C0380HF c0380hf = (C0380HF) ((C2698yx) this.f3594h).getOrDefault(abstractC0249El, null);
        if (c0380hf == null) {
            return;
        }
        c0380hf.f1300z &= -2;
    }

    /* renamed from: W */
    public final void m2282W(int i, int i2) {
        int[] iArr = (int[]) this.f3594h;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            m2277N(i3);
            int[] iArr2 = (int[]) this.f3594h;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.f3594h, i, i3, -1);
            List list = (List) this.f3595v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C2690ym c2690ym = (C2690ym) ((List) this.f3595v).get(size);
                    int i4 = c2690ym.f8384S;
                    if (i4 >= i) {
                        c2690ym.f8384S = i4 + i2;
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void m2283h(AbstractC0249El abstractC0249El, C2402tF c2402tF) {
        C0380HF c0380hf = (C0380HF) ((C2698yx) this.f3594h).getOrDefault(abstractC0249El, null);
        if (c0380hf == null) {
            c0380hf = C0380HF.m870z();
            ((C2698yx) this.f3594h).put(abstractC0249El, c0380hf);
        }
        c0380hf.f1299v = c2402tF;
        c0380hf.f1300z |= 8;
    }

    /* renamed from: o */
    public final boolean m2284o(View view) {
        int m1518X;
        C0975SI c0975si = (C0975SI) this.f3595v;
        C2052mg c2052mg = (C2052mg) ((InterfaceC1047Td) this.f3594h);
        int i = c2052mg.f6383S;
        Object obj = c2052mg.f6382R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                m1518X = ((AbstractC0667Md) obj).m1496H();
                break;
            default:
                m1518X = ((AbstractC0667Md) obj).m1518X();
                break;
        }
        int m3684u = ((C2052mg) ((InterfaceC1047Td) this.f3594h)).m3684u();
        int m3681Q = ((C2052mg) ((InterfaceC1047Td) this.f3594h)).m3681Q(view);
        int m3680N = ((C2052mg) ((InterfaceC1047Td) this.f3594h)).m3680N(view);
        c0975si.f3293h = m1518X;
        c0975si.f3294v = m3684u;
        c0975si.f3292P = m3681Q;
        c0975si.f3291N = m3680N;
        Object obj2 = this.f3595v;
        ((C0975SI) obj2).f3295z = 24579 | 0;
        return ((C0975SI) obj2).m2154z();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2285u(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f3594h
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f3595v
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L14
            goto L71
        L14:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1a
            goto L34
        L1a:
            int r0 = r0.size()
            int r0 = r0 + r1
        L1f:
            if (r0 < 0) goto L34
            java.lang.Object r3 = r5.f3595v
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            a.ym r3 = (p000a.C2690ym) r3
            int r4 = r3.f8384S
            if (r4 != r6) goto L31
            r2 = r3
            goto L34
        L31:
            int r0 = r0 + (-1)
            goto L1f
        L34:
            if (r2 == 0) goto L3d
            java.lang.Object r0 = r5.f3595v
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3d:
            java.lang.Object r0 = r5.f3595v
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L46:
            if (r2 >= r0) goto L5a
            java.lang.Object r3 = r5.f3595v
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            a.ym r3 = (p000a.C2690ym) r3
            int r3 = r3.f8384S
            if (r3 < r6) goto L57
            goto L5b
        L57:
            int r2 = r2 + 1
            goto L46
        L5a:
            r2 = r1
        L5b:
            if (r2 == r1) goto L71
            java.lang.Object r0 = r5.f3595v
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            a.ym r0 = (p000a.C2690ym) r0
            java.lang.Object r3 = r5.f3595v
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f8384S
            goto L72
        L71:
            r0 = r1
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f3594h
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f3594h
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f3594h
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.f3594h
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1105Ui.m2285u(int):int");
    }

    /* renamed from: v */
    public final void m2286v(AbstractC0249El abstractC0249El, C2402tF c2402tF) {
        C0380HF c0380hf = (C0380HF) ((C2698yx) this.f3594h).getOrDefault(abstractC0249El, null);
        if (c0380hf == null) {
            c0380hf = C0380HF.m870z();
            ((C2698yx) this.f3594h).put(abstractC0249El, c0380hf);
        }
        c0380hf.f1298h = c2402tF;
        c0380hf.f1300z |= 4;
    }

    /* renamed from: z */
    public final void m2287z(AbstractC0249El abstractC0249El) {
        C0380HF c0380hf = (C0380HF) ((C2698yx) this.f3594h).getOrDefault(abstractC0249El, null);
        if (c0380hf == null) {
            c0380hf = C0380HF.m870z();
            ((C2698yx) this.f3594h).put(abstractC0249El, c0380hf);
        }
        c0380hf.f1300z |= 1;
    }

    public C1105Ui(C2052mg c2052mg) {
        this.f3596z = 2;
        this.f3594h = c2052mg;
        this.f3595v = new C0975SI();
    }
}
