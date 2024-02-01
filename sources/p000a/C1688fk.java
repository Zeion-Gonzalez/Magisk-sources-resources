package p000a;

import android.util.SparseArray;
import com.topjohnwu.magisk.R;

/* renamed from: a.fk */
/* loaded from: classes.dex */
public final class C1688fk extends AbstractC2439tx {

    /* renamed from: Y */
    public String f5289Y;

    /* renamed from: f */
    public final SparseArray f5290f;

    /* renamed from: g */
    public final C1835iY f5291g;

    /* renamed from: r */
    public final C1517cb f5292r;

    /* renamed from: y */
    public boolean f5294y = true;

    /* renamed from: s */
    public final C1851ir f5293s = new C1851ir(R.string.log_data_none);

    /* renamed from: U */
    public final C1851ir f5288U = new C1851ir(R.string.log_data_magisk_none);

    /* renamed from: E */
    public final C1517cb f5287E = new C1517cb();

    public C1688fk(C1835iY c1835iY) {
        this.f5291g = c1835iY;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(43, this);
        this.f5290f = sparseArray;
        this.f5292r = new C1517cb();
        this.f5289Y = " ";
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bb  */
    @Override // p000a.AbstractC2439tx
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1139I(p000a.InterfaceC1171Vv r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p000a.C1481bs
            if (r0 == 0) goto L13
            r0 = r11
            a.bs r0 = (p000a.C1481bs) r0
            int r1 = r0.f4618g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4618g = r1
            goto L18
        L13:
            a.bs r0 = new a.bs
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f4620q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f4618g
            r3 = 22
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            a.fk r0 = r0.f4617I
            p000a.AbstractC1292YB.m2664UZ(r11)
            goto L53
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            p000a.AbstractC1292YB.m2664UZ(r11)
            boolean r11 = r10.f5294y
            if (r11 == r4) goto L3f
            r10.f5294y = r4
            r10.mo1709Q(r3)
        L3f:
            a.UE r11 = p000a.AbstractC0037Al.f179z
            a.J1 r2 = new a.J1
            r5 = 0
            r2.<init>(r10, r5)
            r0.f4617I = r10
            r0.f4618g = r4
            java.lang.Object r11 = p000a.AbstractC0438II.m1021ZH(r11, r2, r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            r0 = r10
        L53:
            a.Bc r11 = (p000a.C0084Bc) r11
            java.lang.Object r1 = r11.f329S
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r11 = r11.f328R
            a.Ra r11 = (p000a.C0934Ra) r11
            a.cb r2 = r0.f5287E
            java.lang.Object r2 = p000a.AbstractC2486us.m4293nB(r2)
            a.Wl r2 = (p000a.C1218Wl) r2
            r5 = 41
            r6 = 0
            if (r2 != 0) goto L6b
            goto L74
        L6b:
            boolean r7 = r2.f3983I
            if (r7 == 0) goto L74
            r2.f3983I = r6
            r2.mo1709Q(r5)
        L74:
            a.cb r2 = r0.f5287E
            java.lang.Object r7 = p000a.AbstractC2486us.m4277Fu(r2)
            a.Wl r7 = (p000a.C1218Wl) r7
            r8 = 2
            if (r7 != 0) goto L80
            goto L89
        L80:
            boolean r9 = r7.f3985q
            if (r9 == 0) goto L89
            r7.f3985q = r6
            r7.mo1709Q(r8)
        L89:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            r2.f4694S = r7
            r11.m2106z(r2)
            java.lang.Object r11 = p000a.AbstractC2486us.m4293nB(r2)
            a.Wl r11 = (p000a.C1218Wl) r11
            if (r11 != 0) goto L9c
            goto La5
        L9c:
            boolean r1 = r11.f3983I
            if (r1 == r4) goto La5
            r11.f3983I = r4
            r11.mo1709Q(r5)
        La5:
            java.lang.Object r11 = p000a.AbstractC2486us.m4277Fu(r2)
            a.Wl r11 = (p000a.C1218Wl) r11
            if (r11 != 0) goto Lae
            goto Lb7
        Lae:
            boolean r1 = r11.f3985q
            if (r1 == r4) goto Lb7
            r11.f3985q = r4
            r11.mo1709Q(r8)
        Lb7:
            boolean r11 = r0.f5294y
            if (r11 == 0) goto Lc0
            r0.f5294y = r6
            r0.mo1709Q(r3)
        Lc0:
            a.GJ r11 = p000a.C0329GJ.f1115z
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1688fk.mo1139I(a.Vv):java.lang.Object");
    }
}
