package p000a;

import android.util.SparseArray;
import com.topjohnwu.magisk.R;

/* renamed from: a.ZK */
/* loaded from: classes.dex */
public final class C1353ZK extends AbstractC2439tx {

    /* renamed from: E */
    public final C1694fs f4253E;

    /* renamed from: U */
    public final C1517cb f4254U;

    /* renamed from: f */
    public final SparseArray f4255f;

    /* renamed from: g */
    public final C0468Ir f4256g;

    /* renamed from: r */
    public boolean f4257r;

    /* renamed from: s */
    public final C1587dt f4258s;

    /* renamed from: y */
    public final C1851ir f4259y = new C1851ir(R.string.superuser_policy_none);

    public C1353ZK(C0468Ir c0468Ir) {
        this.f4256g = c0468Ir;
        C1587dt c1587dt = new C1587dt();
        this.f4258s = c1587dt;
        C1517cb c1517cb = new C1517cb();
        this.f4254U = c1517cb;
        C1694fs c1694fs = new C1694fs();
        c1694fs.m3199Q(c1587dt);
        c1694fs.m3199Q(c1517cb);
        this.f4253E = c1694fs;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(21, this);
        this.f4255f = sparseArray;
        this.f4257r = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0086  */
    @Override // p000a.AbstractC2439tx
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1139I(p000a.InterfaceC1171Vv r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p000a.C0936Rc
            if (r0 == 0) goto L13
            r0 = r9
            a.Rc r0 = (p000a.C0936Rc) r0
            int r1 = r0.f3213g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3213g = r1
            goto L18
        L13:
            a.Rc r0 = new a.Rc
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f3215q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f3213g
            a.GJ r3 = p000a.C0329GJ.f1115z
            r4 = 22
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L36
            if (r2 != r6) goto L2e
            a.ZK r0 = r0.f3212I
            p000a.AbstractC1292YB.m2664UZ(r9)
            goto L68
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            p000a.AbstractC1292YB.m2664UZ(r9)
            a.jw r9 = p000a.C1910jw.f5967z
            boolean r9 = p000a.C1910jw.m3542v()
            if (r9 != 0) goto L4b
            boolean r9 = r8.f4257r
            if (r9 == 0) goto L4a
            r8.f4257r = r5
            r8.mo1709Q(r4)
        L4a:
            return r3
        L4b:
            boolean r9 = r8.f4257r
            if (r9 == r6) goto L54
            r8.f4257r = r6
            r8.mo1709Q(r4)
        L54:
            a.Bp r9 = p000a.AbstractC0037Al.f178h
            a.tp r2 = new a.tp
            r7 = 0
            r2.<init>(r8, r7)
            r0.f3212I = r8
            r0.f3213g = r6
            java.lang.Object r9 = p000a.AbstractC0438II.m1021ZH(r9, r2, r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            r0 = r8
        L68:
            a.cb r9 = r0.f4254U
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r6
            a.dt r1 = r0.f4258s
            if (r9 == 0) goto L77
            r1.clear()
            goto L82
        L77:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L82
            a.ir r9 = r0.f4259y
            r1.add(r9)
        L82:
            boolean r9 = r0.f4257r
            if (r9 == 0) goto L8b
            r0.f4257r = r5
            r0.mo1709Q(r4)
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1353ZK.mo1139I(a.Vv):java.lang.Object");
    }
}
