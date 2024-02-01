package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.WL */
/* loaded from: classes.dex */
public final class C1195WL extends AbstractC0260Ez {

    /* renamed from: E */
    public final AbstractC1062Tx f3883E;

    /* renamed from: J */
    public final AbstractC1062Tx f3885J;

    /* renamed from: R */
    public String f3886R;

    /* renamed from: S */
    public final String f3887S;

    /* renamed from: Y */
    public final AbstractC1062Tx f3889Y;

    /* renamed from: c */
    public final AbstractC1062Tx f3890c;

    /* renamed from: f */
    public final AbstractC1062Tx f3891f;

    /* renamed from: r */
    public final AbstractC1062Tx f3895r;

    /* renamed from: s */
    public boolean f3896s;

    /* renamed from: w */
    public String f3897w;

    /* renamed from: y */
    public C0907R6 f3898y;

    /* renamed from: I */
    public String f3884I = "";

    /* renamed from: q */
    public int f3894q = -1;

    /* renamed from: k */
    public String f3893k = "";

    /* renamed from: g */
    public String f3892g = "";

    /* renamed from: U */
    public String f3888U = "";

    public C1195WL(String str) {
        boolean z;
        this.f3887S = str;
        this.f3886R = "";
        this.f3897w = "";
        C0346Gc.f1163P.getClass();
        this.f3883E = C0382HH.m871z().mo304h(str, "remove");
        this.f3891f = C0382HH.m871z().mo304h(str, "disable");
        this.f3895r = C0382HH.m871z().mo304h(str, "update");
        this.f3889Y = C0382HH.m871z().mo304h(str, "riru");
        AbstractC1062Tx mo304h = C0382HH.m871z().mo304h(str, "zygisk");
        this.f3885J = mo304h;
        AbstractC1026TE m871z = C0382HH.m871z();
        m871z.getClass();
        this.f3890c = m871z.mo304h(mo304h.getPath(), "unloaded");
        try {
            List list = ((C0876QR) AbstractC0017AI.m44z("dos2unix < " + str + "/module.prop").mo781dx()).f2986z;
            m2474N(list == null ? Collections.emptyList() : list);
        } catch (Throwable unused) {
        }
        if (this.f3886R.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f3886R = this.f3887S.substring(AbstractC1269Xn.m2589j5(this.f3887S, '/', 0, 6) + 1);
        }
        if (this.f3897w.length() == 0) {
            this.f3897w = this.f3886R;
        }
    }

    /* renamed from: N */
    public final void m2474N(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List m3557z = new C1939kV("=").m3557z(2, (String) it.next());
            ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(m3557z));
            Iterator it2 = m3557z.iterator();
            while (it2.hasNext()) {
                arrayList.add(AbstractC1269Xn.m2580Uf((String) it2.next()).toString());
            }
            if (arrayList.size() == 2) {
                String str = (String) arrayList.get(0);
                boolean z = true;
                String str2 = (String) arrayList.get(1);
                if (str.length() != 0) {
                    z = false;
                }
                if (!z && str.charAt(0) != '#') {
                    switch (str.hashCode()) {
                        case -1724546052:
                            if (str.equals("description")) {
                                this.f3892g = str2;
                                break;
                            } else {
                                continue;
                            }
                        case -1406328437:
                            if (str.equals("author")) {
                                this.f3893k = str2;
                                break;
                            } else {
                                continue;
                            }
                        case -296219311:
                            if (str.equals("updateJson")) {
                                this.f3888U = str2;
                                break;
                            } else {
                                continue;
                            }
                        case 3355:
                            if (str.equals("id")) {
                                this.f3886R = str2;
                                break;
                            } else {
                                continue;
                            }
                        case 3373707:
                            if (str.equals("name")) {
                                this.f3897w = str2;
                                break;
                            } else {
                                continue;
                            }
                        case 351608024:
                            if (str.equals("version")) {
                                this.f3884I = str2;
                                break;
                            } else {
                                continue;
                            }
                        case 688591589:
                            if (str.equals("versionCode")) {
                                this.f3894q = Integer.parseInt(str2);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0073  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2475P(p000a.InterfaceC1171Vv r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p000a.C1108Ul
            if (r0 == 0) goto L13
            r0 = r13
            a.Ul r0 = (p000a.C1108Ul) r0
            int r1 = r0.f3608g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3608g = r1
            goto L18
        L13:
            a.Ul r0 = new a.Ul
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f3610q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f3608g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            a.WL r0 = r0.f3607I
            p000a.AbstractC1292YB.m2664UZ(r13)     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            goto L57
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L32:
            p000a.AbstractC1292YB.m2664UZ(r13)
            java.lang.String r13 = r12.f3888U
            int r13 = r13.length()
            if (r13 != 0) goto L3f
            r13 = r3
            goto L40
        L3f:
            r13 = r4
        L40:
            if (r13 == 0) goto L45
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L45:
            a.xk r13 = p000a.AbstractC1743gn.m3274v()     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.String r2 = r12.f3888U     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            r0.f3607I = r12     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            r0.f3608g = r3     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.Object r13 = r13.m4541h(r2, r0)     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            if (r13 != r1) goto L56
            return r1
        L56:
            r0 = r12
        L57:
            com.topjohnwu.magisk.core.model.ModuleJson r13 = (com.topjohnwu.magisk.core.model.ModuleJson) r13     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            a.R6 r1 = new a.R6     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.String r6 = r0.f3886R     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.String r7 = r0.f3897w     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.String r8 = r13.f9583z     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            int r2 = r13.f9581h     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.String r10 = r13.f9582v     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.String r11 = r13.f9580P     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            r5 = r1
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            r0.f3898y = r1     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            int r13 = r0.f3894q     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            if (r2 <= r13) goto L73
            goto L74
        L73:
            r3 = r4
        L74:
            r0.f3896s = r3     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch: p000a.C1237X6 -> L79 java.io.IOException -> L7b
            return r13
        L79:
            r13 = move-exception
            goto L7c
        L7b:
            r13 = move-exception
        L7c:
            a.J2 r0 = p000a.AbstractC1530cs.f4727z
            r0.getClass()
            a.K0[] r0 = p000a.AbstractC1530cs.f4726v
            int r1 = r0.length
        L84:
            if (r4 >= r1) goto L8e
            r2 = r0[r4]
            r2.mo1159u(r13)
            int r4 = r4 + 1
            goto L84
        L8e:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1195WL.m2475P(a.Vv):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1195WL) && AbstractC1292YB.m2695u(this.f3887S, ((C1195WL) obj).f3887S);
    }

    @Override // p000a.AbstractC0260Ez
    /* renamed from: h */
    public final String mo558h() {
        return this.f3886R;
    }

    public final int hashCode() {
        return this.f3887S.hashCode();
    }

    public final String toString() {
        return AbstractC2441tz.m4187M(new StringBuilder("LocalModule(path="), this.f3887S, ")");
    }
}
