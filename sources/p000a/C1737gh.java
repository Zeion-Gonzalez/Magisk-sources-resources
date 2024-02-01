package p000a;

/* renamed from: a.gh */
/* loaded from: classes.dex */
public final class C1737gh extends AbstractC0438II {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0060 A[LOOP:0: B:47:0x005e->B:48:0x0060, LOOP_END] */
    @Override // p000a.AbstractC0438II
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo362f(p000a.InterfaceC1171Vv r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000a.C0522Jp
            if (r0 == 0) goto L13
            r0 = r5
            a.Jp r0 = (p000a.C0522Jp) r0
            int r1 = r0.f1742k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1742k = r1
            goto L18
        L13:
            a.Jp r0 = new a.Jp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1741I
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f1742k
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000a.AbstractC1292YB.m2664UZ(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            p000a.AbstractC1292YB.m2664UZ(r5)
            a.xk r5 = p000a.AbstractC1743gn.m3274v()
            com.topjohnwu.magisk.core.model.UpdateInfo r2 = p000a.C1910jw.f5956P
            com.topjohnwu.magisk.core.model.MagiskJson r2 = r2.f9587z
            java.lang.String r2 = r2.f9572I
            r0.f1742k = r3
            java.lang.Object r5 = r5.m4542v(r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = (java.lang.String) r5
            android.content.Context r0 = p000a.AbstractC1743gn.m3275z()
            java.io.File r0 = r0.getCacheDir()
            a.kW r1 = new a.kW
            r1.<init>(r3)
            java.io.File[] r0 = r0.listFiles(r1)
            r1 = 0
            if (r0 != 0) goto L5d
            java.io.File[] r0 = new java.io.File[r1]
        L5d:
            int r2 = r0.length
        L5e:
            if (r1 >= r2) goto L68
            r3 = r0[r1]
            r3.delete()
            int r1 = r1 + 1
            goto L5e
        L68:
            java.io.File r0 = new java.io.File
            android.content.Context r1 = p000a.AbstractC1743gn.m3275z()
            java.io.File r1 = r1.getCacheDir()
            com.topjohnwu.magisk.core.model.UpdateInfo r2 = p000a.C1910jw.f5956P
            com.topjohnwu.magisk.core.model.MagiskJson r2 = r2.f9587z
            int r2 = r2.f9573R
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ".md"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r1, r2)
            p000a.AbstractC1292YB.m2677he(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1737gh.mo362f(a.Vv):java.lang.Object");
    }

    @Override // p000a.AbstractC0438II, p000a.InterfaceC1435aw
    /* renamed from: h */
    public final void mo363h(DialogC2727zU dialogC2727zU) {
        super.mo363h(dialogC2727zU);
        dialogC2727zU.setCancelable(true);
        dialogC2727zU.m4657W(EnumC1224Wr.f3992S, new C1068U2(dialogC2727zU, 3));
        dialogC2727zU.m4657W(EnumC1224Wr.f3993w, C1980lF.f6137j);
    }
}
