package p000a;

import android.util.SparseArray;
import com.topjohnwu.magisk.R;

/* renamed from: a.Iu */
/* loaded from: classes.dex */
public final class C0471Iu extends AbstractC2439tx {

    /* renamed from: J */
    public static boolean f1565J;

    /* renamed from: E */
    public EnumC2302rL f1566E;

    /* renamed from: U */
    public boolean f1567U;

    /* renamed from: Y */
    public final SparseArray f1568Y;

    /* renamed from: f */
    public AbstractC2222pt f1569f;

    /* renamed from: g */
    public final C2640xk f1570g;

    /* renamed from: r */
    public int f1571r;

    /* renamed from: y */
    public final int[] f1573y = {R.id.home_magisk_icon, R.id.home_magisk_title, R.id.home_magisk_button};

    /* renamed from: s */
    public final int[] f1572s = {R.id.home_manager_icon, R.id.home_manager_title, R.id.home_manager_button};

    public C0471Iu(C2640xk c2640xk) {
        this.f1570g = c2640xk;
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        this.f1567U = C1212We.f3949R.m3358O4(c1212We, C1212We.f3959h[8]).booleanValue();
        this.f1566E = EnumC2302rL.f7104S;
        this.f1569f = new C0639M1(R.string.loading);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(43, this);
        this.f1568Y = sparseArray;
    }

    /* renamed from: g */
    public static EnumC2302rL m1137g() {
        if (!C1910jw.f5958R || !C1910jw.m3543z().f1383P) {
            if (!C1910jw.m3543z().f1382N) {
                return EnumC2302rL.f7103R;
            }
            if (C1910jw.m3543z().f1385v >= 26400) {
                return EnumC2302rL.f7102I;
            }
        }
        return EnumC2302rL.f7105w;
    }

    @Override // p000a.AbstractC2615xD
    /* renamed from: G */
    public final void mo1138G() {
        m4181q();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c0  */
    @Override // p000a.AbstractC2439tx
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1139I(p000a.InterfaceC1171Vv r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0471Iu.mo1139I(a.Vv):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1140k(p000a.InterfaceC1171Vv r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000a.C1118Uv
            if (r0 == 0) goto L13
            r0 = r8
            a.Uv r0 = (p000a.C1118Uv) r0
            int r1 = r0.f3655g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3655g = r1
            goto L18
        L13:
            a.Uv r0 = new a.Uv
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3657q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f3655g
            a.GJ r3 = p000a.C0329GJ.f1115z
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            a.Iu r0 = r0.f3654I
            p000a.AbstractC1292YB.m2664UZ(r8)
            goto L79
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            p000a.AbstractC1292YB.m2664UZ(r8)
            a.rL r8 = m1137g()
            a.rL r2 = p000a.EnumC2302rL.f7103R
            if (r8 == r2) goto L8b
            boolean r8 = p000a.C0471Iu.f1565J
            if (r8 == 0) goto L43
            goto L8b
        L43:
            a.Hm r8 = p000a.C1910jw.m3543z()
            java.lang.String r8 = r8.f1386z
            a.Hm r2 = p000a.C1910jw.m3543z()
            int r2 = r2.f1385v
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "env_check "
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r8 = " "
            r5.append(r8)
            r5.append(r2)
            java.lang.String r8 = r5.toString()
            java.lang.String[] r8 = new java.lang.String[]{r8}
            a.Gq r8 = p000a.AbstractC0017AI.m44z(r8)
            r0.f3654I = r7
            r0.f3655g = r4
            java.lang.Object r8 = p000a.AbstractC0795Op.m1824P(r8, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            r0 = r7
        L79:
            a.iK r8 = (p000a.AbstractC1823iK) r8
            a.QR r8 = (p000a.C0876QR) r8
            int r8 = r8.f2985v
            if (r8 == 0) goto L89
            a.kn r1 = new a.kn
            r1.<init>(r0, r8)
            r0.m4499R(r1)
        L89:
            p000a.C0471Iu.f1565J = r4
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0471Iu.m1140k(a.Vv):java.lang.Object");
    }

    /* renamed from: s */
    public final void m1141s() {
        C0805P0 c0805p0;
        int ordinal = this.f1566E.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                m4501w("android.permission.WRITE_EXTERNAL_STORAGE", new C2031mE(this, this, i));
                return;
            }
            c0805p0 = new C0805P0((int) R.string.no_connection);
        } else {
            c0805p0 = new C0805P0((int) R.string.loading);
        }
        m4500S(c0805p0);
    }

    /* renamed from: y */
    public final void m1142y() {
        m4501w("android.permission.WRITE_EXTERNAL_STORAGE", new C2031mE(this, this, 0));
    }
}
