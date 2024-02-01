package p000a;

import java.util.ArrayList;

/* renamed from: a.Z1 */
/* loaded from: classes.dex */
public class C1335Z1 {

    /* renamed from: P */
    public InterfaceC0921RL f4226P;

    /* renamed from: z */
    public C2598ww f4229z = null;

    /* renamed from: h */
    public float f4227h = 0.0f;

    /* renamed from: v */
    public final ArrayList f4228v = new ArrayList();

    /* renamed from: N */
    public boolean f4225N = false;

    public C1335Z1(C0525Ju c0525Ju) {
        this.f4226P = new C0713NR(this, c0525Ju);
    }

    /* renamed from: N */
    public boolean mo2180N() {
        return this.f4229z == null && this.f4227h == 0.0f && this.f4226P.mo1662M() == 0;
    }

    /* renamed from: P */
    public C2598ww mo2181P(boolean[] zArr) {
        return m2723Q(zArr, null);
    }

    /* renamed from: Q */
    public final C2598ww m2723Q(boolean[] zArr, C2598ww c2598ww) {
        int i;
        int mo1662M = this.f4226P.mo1662M();
        C2598ww c2598ww2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < mo1662M; i2++) {
            float mo1671z = this.f4226P.mo1671z(i2);
            if (mo1671z < 0.0f) {
                C2598ww mo1665Q = this.f4226P.mo1665Q(i2);
                if ((zArr == null || !zArr[mo1665Q.f7992R]) && mo1665Q != c2598ww && (((i = mo1665Q.f7995f) == 3 || i == 4) && mo1671z < f)) {
                    f = mo1671z;
                    c2598ww2 = mo1665Q;
                }
            }
        }
        return c2598ww2;
    }

    /* renamed from: W */
    public void mo2182W(C0457If c0457If, C1335Z1 c1335z1, boolean z) {
        float mo1667h = this.f4226P.mo1667h(c1335z1, z);
        this.f4227h = (c1335z1.f4227h * mo1667h) + this.f4227h;
        if (z) {
            c1335z1.f4229z.m4478h(this);
        }
        if (this.f4229z == null || this.f4226P.mo1662M() != 0) {
            return;
        }
        this.f4225N = true;
        c0457If.f1543z = true;
    }

    /* renamed from: h */
    public final void m2724h(C2598ww c2598ww, C2598ww c2598ww2, C2598ww c2598ww3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4227h = i;
        }
        if (z) {
            this.f4226P.mo1670v(c2598ww, 1.0f);
            this.f4226P.mo1670v(c2598ww2, -1.0f);
            this.f4226P.mo1670v(c2598ww3, -1.0f);
        } else {
            this.f4226P.mo1670v(c2598ww, -1.0f);
            this.f4226P.mo1670v(c2598ww2, 1.0f);
            this.f4226P.mo1670v(c2598ww3, 1.0f);
        }
    }

    /* renamed from: o */
    public final void m2725o(C0457If c0457If, C2598ww c2598ww, boolean z) {
        if (c2598ww == null || !c2598ww.f7997k) {
            return;
        }
        float mo1666W = this.f4226P.mo1666W(c2598ww);
        this.f4227h = (c2598ww.f7998q * mo1666W) + this.f4227h;
        this.f4226P.mo1668o(c2598ww, z);
        if (z) {
            c2598ww.m4478h(this);
        }
        if (this.f4226P.mo1662M() == 0) {
            this.f4225N = true;
            c0457If.f1543z = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            a.ww r0 = r9.f4229z
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            a.ww r1 = r9.f4229z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = p000a.AbstractC2441tz.m4195W(r0, r1)
            float r1 = r9.f4227h
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f4227h
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            a.RL r5 = r9.f4226P
            int r5 = r5.mo1662M()
        L40:
            if (r4 >= r5) goto Lac
            a.RL r6 = r9.f4226P
            a.ww r6 = r6.mo1665Q(r4)
            if (r6 != 0) goto L4b
            goto La9
        L4b:
            a.RL r7 = r9.f4226P
            float r7 = r7.mo1671z(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto La9
        L56:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L6b
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L8b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L81
        L6b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            if (r8 <= 0) goto L7f
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L8b
        L7f:
            java.lang.String r0 = " - "
        L81:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L8b:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L97
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto La4
        L97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        La4:
            java.lang.String r0 = p000a.AbstractC2441tz.m4187M(r1, r0, r6)
            r1 = r3
        La9:
            int r4 = r4 + 1
            goto L40
        Lac:
            if (r1 != 0) goto Lb4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p000a.AbstractC2441tz.m4195W(r0, r1)
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1335Z1.toString():java.lang.String");
    }

    /* renamed from: u */
    public final void m2726u(C2598ww c2598ww) {
        C2598ww c2598ww2 = this.f4229z;
        if (c2598ww2 != null) {
            this.f4226P.mo1670v(c2598ww2, -1.0f);
            this.f4229z.f8000w = -1;
            this.f4229z = null;
        }
        float mo1668o = this.f4226P.mo1668o(c2598ww, true) * (-1.0f);
        this.f4229z = c2598ww;
        if (mo1668o == 1.0f) {
            return;
        }
        this.f4227h /= mo1668o;
        this.f4226P.mo1669u(mo1668o);
    }

    /* renamed from: v */
    public final void m2727v(C2598ww c2598ww, C2598ww c2598ww2, C2598ww c2598ww3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4227h = i;
        }
        if (z) {
            this.f4226P.mo1670v(c2598ww, 1.0f);
            this.f4226P.mo1670v(c2598ww2, -1.0f);
            this.f4226P.mo1670v(c2598ww3, 1.0f);
        } else {
            this.f4226P.mo1670v(c2598ww, -1.0f);
            this.f4226P.mo1670v(c2598ww2, 1.0f);
            this.f4226P.mo1670v(c2598ww3, -1.0f);
        }
    }

    /* renamed from: z */
    public final void m2728z(C0457If c0457If, int i) {
        this.f4226P.mo1670v(c0457If.m1096M(i), 1.0f);
        this.f4226P.mo1670v(c0457If.m1096M(i), -1.0f);
    }
}
