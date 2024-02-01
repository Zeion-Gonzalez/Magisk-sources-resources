package p000a;

import android.content.Context;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.download.DownloadService;

/* renamed from: a.DY */
/* loaded from: classes.dex */
public final class C0183DY extends AbstractC0438II {

    /* renamed from: e */
    public final C0907R6 f568e;

    public C0183DY(C0907R6 c0907r6) {
        this.f568e = c0907r6;
    }

    /* renamed from: G5 */
    public static final void m361G5(C0183DY c0183dy, DialogC2727zU dialogC2727zU, boolean z) {
        EnumC0340GV enumC0340GV;
        if (z) {
            enumC0340GV = EnumC0340GV.f1150S;
        } else {
            enumC0340GV = EnumC0340GV.f1149R;
        }
        C0012AD c0012ad = new C0012AD(c0183dy.f568e, enumC0340GV, AbstractC0392HR.f1319h.incrementAndGet());
        int i = DownloadService.f9570q;
        C1219Wm.m2513W((AbstractActivityC0402He) dialogC2727zU.getOwnerActivity(), c0012ad);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // p000a.AbstractC0438II
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo362f(p000a.InterfaceC1171Vv r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000a.C1154Vb
            if (r0 == 0) goto L13
            r0 = r5
            a.Vb r0 = (p000a.C1154Vb) r0
            int r1 = r0.f3746k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3746k = r1
            goto L18
        L13:
            a.Vb r0 = new a.Vb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3745I
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f3746k
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000a.AbstractC1292YB.m2664UZ(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            p000a.AbstractC1292YB.m2664UZ(r5)
            a.xk r5 = p000a.AbstractC1743gn.m3274v()
            a.R6 r2 = r4.f568e
            java.lang.String r2 = r2.f3111k
            r0.f3746k = r3
            java.lang.Object r5 = r5.m4542v(r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.length()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L52
            r0 = 0
            java.lang.String r5 = r5.substring(r0, r1)
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0183DY.mo362f(a.Vv):java.lang.Object");
    }

    @Override // p000a.AbstractC0438II, p000a.InterfaceC1435aw
    /* renamed from: h */
    public final void mo363h(DialogC2727zU dialogC2727zU) {
        super.mo363h(dialogC2727zU);
        Context context = dialogC2727zU.getContext();
        C0907R6 c0907r6 = this.f568e;
        dialogC2727zU.setTitle(context.getString(R.string.repo_install_title, c0907r6.f3109R, c0907r6.f3113w, Integer.valueOf(c0907r6.f3108I)));
        dialogC2727zU.setCancelable(true);
        dialogC2727zU.m4657W(EnumC1224Wr.f3993w, new C2058mm(this, dialogC2727zU, 1));
        dialogC2727zU.m4657W(EnumC1224Wr.f3992S, new C2058mm(this, dialogC2727zU, 3));
        dialogC2727zU.m4657W(EnumC1224Wr.f3991R, C1980lF.f6127L);
    }
}
