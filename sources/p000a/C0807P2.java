package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.P2 */
/* loaded from: classes.dex */
public final class C0807P2 extends AbstractC1790hg {

    /* renamed from: M */
    public final ArrayList f2746M;

    /* renamed from: V */
    public int f2747V;

    /* JADX WARN: Code restructure failed: missing block: B:85:0x001c, code lost:
    
        if (r2.f994Q == r6) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x001e, code lost:
    
        r6 = r2.f993P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x002b, code lost:
    
        if (r2.f994Q == r6) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0807P2(int r5, p000a.C1628ed r6) {
        /*
            r4 = this;
            r4.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.f2746M = r6
            r4.f5625Q = r5
            a.ed r5 = r4.f5627h
        Le:
            int r6 = r4.f5625Q
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L21
            a.FS r6 = r5.f5022C
            a.FS r2 = r6.f994Q
            if (r2 == 0) goto L31
            a.FS r3 = r2.f994Q
            if (r3 != r6) goto L31
        L1e:
            a.ed r6 = r2.f993P
            goto L32
        L21:
            if (r6 != r1) goto L2e
            a.FS r6 = r5.f5074p
            a.FS r2 = r6.f994Q
            if (r2 == 0) goto L31
            a.FS r3 = r2.f994Q
            if (r3 != r6) goto L31
            goto L1e
        L2e:
            r5.getClass()
        L31:
            r6 = r0
        L32:
            if (r6 == 0) goto L36
            r5 = r6
            goto Le
        L36:
            r4.f5627h = r5
            int r6 = r4.f5625Q
            if (r6 != 0) goto L3f
            a.gF r6 = r5.f5039P
            goto L45
        L3f:
            if (r6 != r1) goto L44
            a.Wk r6 = r5.f5037N
            goto L45
        L44:
            r6 = r0
        L45:
            java.util.ArrayList r2 = r4.f2746M
        L47:
            r2.add(r6)
            int r6 = r4.f5625Q
            a.ed r5 = r5.m3099S(r6)
            if (r5 == 0) goto L60
            int r6 = r4.f5625Q
            if (r6 != 0) goto L59
            a.gF r6 = r5.f5039P
            goto L47
        L59:
            if (r6 != r1) goto L5e
            a.Wk r6 = r5.f5037N
            goto L47
        L5e:
            r6 = r0
            goto L47
        L60:
            java.util.Iterator r5 = r2.iterator()
        L64:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L80
            java.lang.Object r6 = r5.next()
            a.hg r6 = (p000a.AbstractC1790hg) r6
            int r0 = r4.f5625Q
            if (r0 != 0) goto L79
            a.ed r6 = r6.f5627h
            r6.f5061h = r4
            goto L64
        L79:
            if (r0 != r1) goto L64
            a.ed r6 = r6.f5627h
            r6.f5081v = r4
            goto L64
        L80:
            int r5 = r4.f5625Q
            if (r5 != 0) goto L90
            a.ed r5 = r4.f5627h
            a.ed r5 = r5.f5020B
            a.cx r5 = (p000a.C1535cx) r5
            boolean r5 = r5.f4750dG
            if (r5 == 0) goto L90
            r5 = r1
            goto L91
        L90:
            r5 = 0
        L91:
            if (r5 == 0) goto La8
            int r5 = r2.size()
            if (r5 <= r1) goto La8
            int r5 = r2.size()
            int r5 = r5 - r1
            java.lang.Object r5 = r2.get(r5)
            a.hg r5 = (p000a.AbstractC1790hg) r5
            a.ed r5 = r5.f5627h
            r4.f5627h = r5
        La8:
            int r5 = r4.f5625Q
            if (r5 != 0) goto Lb1
            a.ed r5 = r4.f5627h
            int r5 = r5.f5025EC
            goto Lb5
        Lb1:
            a.ed r5 = r4.f5627h
            int r5 = r5.f5045U8
        Lb5:
            r4.f2747V = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0807P2.<init>(int, a.ed):void");
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: G */
    public final long mo1909G() {
        ArrayList arrayList = this.f2746M;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.f5626W.f4567Q + ((AbstractC1790hg) arrayList.get(i)).mo1909G() + j + r5.f5628o.f4567Q;
        }
        return j;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: M */
    public final boolean mo1910M() {
        ArrayList arrayList = this.f2746M;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1790hg) arrayList.get(i)).mo1910M()) {
                return false;
            }
        }
        return true;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: N */
    public final void mo1911N() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2746M;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1790hg) arrayList.get(i)).mo1911N();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0069, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009d, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009f, code lost:
    
        p000a.AbstractC1790hg.m3326h(r5, r1, -r0);
     */
    @Override // p000a.AbstractC1790hg
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1912P() {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f2746M
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            a.hg r2 = (p000a.AbstractC1790hg) r2
            r2.mo1912P()
            goto L6
        L16:
            int r1 = r0.size()
            r2 = 1
            if (r1 >= r2) goto L1e
            return
        L1e:
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            a.hg r4 = (p000a.AbstractC1790hg) r4
            a.ed r4 = r4.f5627h
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            a.hg r0 = (p000a.AbstractC1790hg) r0
            a.ed r0 = r0.f5627h
            int r1 = r7.f5625Q
            a.bf r5 = r7.f5626W
            a.bf r6 = r7.f5628o
            if (r1 != 0) goto L6c
            a.FS r1 = r4.f5022C
            a.FS r0 = r0.f5064j
            a.bf r2 = p000a.AbstractC1790hg.m3325W(r1, r3)
            int r1 = r1.m587N()
            a.ed r4 = r7.m1915S()
            if (r4 == 0) goto L50
            a.FS r1 = r4.f5022C
            int r1 = r1.m587N()
        L50:
            if (r2 == 0) goto L55
            p000a.AbstractC1790hg.m3326h(r6, r2, r1)
        L55:
            a.bf r1 = p000a.AbstractC1790hg.m3325W(r0, r3)
            int r0 = r0.m587N()
            a.ed r2 = r7.m1914R()
            if (r2 == 0) goto L69
            a.FS r0 = r2.f5064j
            int r0 = r0.m587N()
        L69:
            if (r1 == 0) goto La3
            goto L9f
        L6c:
            a.FS r1 = r4.f5074p
            a.FS r0 = r0.f5034L
            a.bf r3 = p000a.AbstractC1790hg.m3325W(r1, r2)
            int r1 = r1.m587N()
            a.ed r4 = r7.m1915S()
            if (r4 == 0) goto L84
            a.FS r1 = r4.f5074p
            int r1 = r1.m587N()
        L84:
            if (r3 == 0) goto L89
            p000a.AbstractC1790hg.m3326h(r6, r3, r1)
        L89:
            a.bf r1 = p000a.AbstractC1790hg.m3325W(r0, r2)
            int r0 = r0.m587N()
            a.ed r2 = r7.m1914R()
            if (r2 == 0) goto L9d
            a.FS r0 = r2.f5034L
            int r0 = r0.m587N()
        L9d:
            if (r1 == 0) goto La3
        L9f:
            int r0 = -r0
            p000a.AbstractC1790hg.m3326h(r5, r1, r0)
        La3:
            r6.f4574z = r7
            r5.f4574z = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0807P2.mo1912P():void");
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: Q */
    public final void mo1913Q() {
        this.f5630v = null;
        Iterator it = this.f2746M.iterator();
        while (it.hasNext()) {
            ((AbstractC1790hg) it.next()).mo1913Q();
        }
    }

    /* renamed from: R */
    public final C1628ed m1914R() {
        ArrayList arrayList = this.f2746M;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1628ed c1628ed = ((AbstractC1790hg) arrayList.get(size)).f5627h;
            if (c1628ed.f5046UZ != 8) {
                return c1628ed;
            }
        }
        return null;
    }

    /* renamed from: S */
    public final C1628ed m1915S() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2746M;
            if (i < arrayList.size()) {
                C1628ed c1628ed = ((AbstractC1790hg) arrayList.get(i)).f5627h;
                if (c1628ed.f5046UZ != 8) {
                    return c1628ed;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f5625Q == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f2746M.iterator();
        while (it.hasNext()) {
            AbstractC1790hg abstractC1790hg = (AbstractC1790hg) it.next();
            sb.append("<");
            sb.append(abstractC1790hg);
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:610:0x0399, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x00da  */
    @Override // p000a.InterfaceC1298YI
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1916z(p000a.InterfaceC1298YI r27) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0807P2.mo1916z(a.YI):void");
    }
}
