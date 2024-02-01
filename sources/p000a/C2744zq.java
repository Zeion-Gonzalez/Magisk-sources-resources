package p000a;

import android.util.SparseArray;
import com.topjohnwu.magisk.R;

/* renamed from: a.zq */
/* loaded from: classes.dex */
public final class C2744zq extends AbstractC2439tx {

    /* renamed from: f */
    public static final C1112Up f8599f = new C1112Up();

    /* renamed from: E */
    public boolean f8600E;

    /* renamed from: U */
    public final SparseArray f8601U;

    /* renamed from: g */
    public final int[] f8602g = {R.id.module_update, R.id.module_remove};

    /* renamed from: y */
    public final C1517cb f8604y = new C1517cb();

    /* renamed from: s */
    public final C1694fs f8603s = new C1694fs();

    public C2744zq() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(43, this);
        this.f8601U = sparseArray;
        this.f8600E = true;
    }

    @Override // p000a.AbstractC2615xD
    /* renamed from: G */
    public final void mo1138G() {
        m4181q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0075, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ab  */
    @Override // p000a.AbstractC2439tx
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1139I(p000a.InterfaceC1171Vv r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p000a.C2547vw
            if (r0 == 0) goto L13
            r0 = r11
            a.vw r0 = (p000a.C2547vw) r0
            int r1 = r0.f7791g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7791g = r1
            goto L18
        L13:
            a.vw r0 = new a.vw
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f7793q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f7791g
            a.GJ r3 = p000a.C0329GJ.f1115z
            r4 = 22
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L48
            if (r2 == r9) goto L42
            if (r2 == r7) goto L3c
            if (r2 != r6) goto L34
            p000a.AbstractC1292YB.m2664UZ(r11)
            goto Lc6
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            a.zq r2 = r0.f7790I
            p000a.AbstractC1292YB.m2664UZ(r11)
            goto L95
        L42:
            a.zq r2 = r0.f7790I
            p000a.AbstractC1292YB.m2664UZ(r11)
            goto L6f
        L48:
            p000a.AbstractC1292YB.m2664UZ(r11)
            boolean r11 = r10.f8600E
            if (r11 == r9) goto L54
            r10.f8600E = r9
            r10.mo1709Q(r4)
        L54:
            a.Hm r11 = p000a.C1910jw.m3543z()
            boolean r11 = r11.f1382N
            if (r11 == 0) goto L78
            a.Bp r11 = p000a.AbstractC0037Al.f178h
            a.sD r2 = new a.sD
            r2.<init>(r8)
            r0.f7790I = r10
            r0.f7791g = r9
            java.lang.Object r11 = p000a.AbstractC0438II.m1021ZH(r11, r2, r0)
            if (r11 != r1) goto L6e
            return r1
        L6e:
            r2 = r10
        L6f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L79
            goto L7a
        L78:
            r2 = r10
        L79:
            r9 = r5
        L7a:
            if (r9 == 0) goto La7
            r0.f7790I = r2
            r0.f7791g = r7
            r2.getClass()
            a.UE r11 = p000a.AbstractC0037Al.f179z
            a.c5 r7 = new a.c5
            r7.<init>(r2, r8)
            java.lang.Object r11 = p000a.AbstractC0438II.m1021ZH(r11, r7, r0)
            if (r11 != r1) goto L91
            goto L92
        L91:
            r11 = r3
        L92:
            if (r11 != r1) goto L95
            return r1
        L95:
            a.fs r11 = r2.f8603s
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto La7
            a.fs r11 = r2.f8603s
            r11.m3198N()
            a.cb r7 = r2.f8604y
            r11.m3199Q(r7)
        La7:
            boolean r11 = r2.f8600E
            if (r11 == 0) goto Lb0
            r2.f8600E = r5
            r2.mo1709Q(r4)
        Lb0:
            r0.f7790I = r8
            r0.f7791g = r6
            a.Bp r11 = p000a.AbstractC0037Al.f178h
            a.V0 r4 = new a.V0
            r4.<init>(r2, r8)
            java.lang.Object r11 = p000a.AbstractC0438II.m1021ZH(r11, r4, r0)
            if (r11 != r1) goto Lc2
            goto Lc3
        Lc2:
            r11 = r3
        Lc3:
            if (r11 != r1) goto Lc6
            return r1
        Lc6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2744zq.mo1139I(a.Vv):java.lang.Object");
    }
}
