package p000a;

import java.util.ArrayList;

/* renamed from: a.ln */
/* loaded from: classes.dex */
public final class C2009ln extends C1628ed {

    /* renamed from: dG */
    public boolean f6240dG;

    /* renamed from: Pm */
    public float f6238Pm = -1.0f;

    /* renamed from: oI */
    public int f6241oI = -1;

    /* renamed from: G5 */
    public int f6237G5 = -1;

    /* renamed from: BX */
    public C0287FS f6236BX = this.f5074p;

    /* renamed from: d2 */
    public int f6239d2 = 0;

    public C2009ln() {
        this.f5043T.clear();
        this.f5043T.add(this.f6236BX);
        int length = this.f5083x.length;
        for (int i = 0; i < length; i++) {
            this.f5083x[i] = this.f6236BX;
        }
    }

    @Override // p000a.C1628ed
    /* renamed from: G */
    public final C0287FS mo3091G(EnumC0494JK enumC0494JK) {
        int ordinal = enumC0494JK.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f6239d2 == 0) {
                return this.f6236BX;
            }
            return null;
        }
        if (this.f6239d2 == 1) {
            return this.f6236BX;
        }
        return null;
    }

    @Override // p000a.C1628ed
    /* renamed from: L */
    public final void mo3094L(C0457If c0457If, boolean z) {
        if (this.f5020B == null) {
            return;
        }
        C0287FS c0287fs = this.f6236BX;
        c0457If.getClass();
        int m1093w = C0457If.m1093w(c0287fs);
        if (this.f6239d2 == 1) {
            this.f5054b = m1093w;
            this.f5071nP = 0;
            m3090F(this.f5020B.m3101V());
            m3111p(0);
            return;
        }
        this.f5054b = 0;
        this.f5071nP = m1093w;
        m3111p(this.f5020B.m3098R());
        m3090F(0);
    }

    @Override // p000a.C1628ed
    /* renamed from: P */
    public final boolean mo901P() {
        return true;
    }

    @Override // p000a.C1628ed
    /* renamed from: f */
    public final boolean mo903f() {
        return this.f6240dG;
    }

    /* renamed from: i */
    public final void m3637i(int i) {
        if (this.f6239d2 == i) {
            return;
        }
        this.f6239d2 = i;
        ArrayList arrayList = this.f5043T;
        arrayList.clear();
        this.f6236BX = this.f6239d2 == 1 ? this.f5022C : this.f5074p;
        arrayList.add(this.f6236BX);
        C0287FS[] c0287fsArr = this.f5083x;
        int length = c0287fsArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0287fsArr[i2] = this.f6236BX;
        }
    }

    @Override // p000a.C1628ed
    /* renamed from: r */
    public final boolean mo904r() {
        return this.f6240dG;
    }

    @Override // p000a.C1628ed
    /* renamed from: v */
    public final void mo905v(C0457If c0457If, boolean z) {
        boolean z2;
        C1535cx c1535cx = (C1535cx) this.f5020B;
        if (c1535cx == null) {
            return;
        }
        Object mo3091G = c1535cx.mo3091G(EnumC0494JK.f1646S);
        Object mo3091G2 = c1535cx.mo3091G(EnumC0494JK.f1650w);
        C1628ed c1628ed = this.f5020B;
        boolean z3 = true;
        if (c1628ed != null && c1628ed.f5030Ha[0] == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f6239d2 == 0) {
            mo3091G = c1535cx.mo3091G(EnumC0494JK.f1645R);
            mo3091G2 = c1535cx.mo3091G(EnumC0494JK.f1644I);
            C1628ed c1628ed2 = this.f5020B;
            if (c1628ed2 == null || c1628ed2.f5030Ha[1] != 2) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.f6240dG) {
            C0287FS c0287fs = this.f6236BX;
            if (c0287fs.f999v) {
                C2598ww m1102V = c0457If.m1102V(c0287fs);
                c0457If.m1098P(m1102V, this.f6236BX.m588P());
                if (this.f6241oI != -1) {
                    if (z2) {
                        c0457If.m1099Q(c0457If.m1102V(mo3091G2), m1102V, 0, 5);
                    }
                } else if (this.f6237G5 != -1 && z2) {
                    C2598ww m1102V2 = c0457If.m1102V(mo3091G2);
                    c0457If.m1099Q(m1102V, c0457If.m1102V(mo3091G), 0, 5);
                    c0457If.m1099Q(m1102V2, m1102V, 0, 5);
                }
                this.f6240dG = false;
                return;
            }
        }
        if (this.f6241oI != -1) {
            C2598ww m1102V3 = c0457If.m1102V(this.f6236BX);
            c0457If.m1097N(m1102V3, c0457If.m1102V(mo3091G), this.f6241oI, 8);
            if (z2) {
                c0457If.m1099Q(c0457If.m1102V(mo3091G2), m1102V3, 0, 5);
                return;
            }
            return;
        }
        if (this.f6237G5 != -1) {
            C2598ww m1102V4 = c0457If.m1102V(this.f6236BX);
            C2598ww m1102V5 = c0457If.m1102V(mo3091G2);
            c0457If.m1097N(m1102V4, m1102V5, -this.f6237G5, 8);
            if (z2) {
                c0457If.m1099Q(m1102V4, c0457If.m1102V(mo3091G), 0, 5);
                c0457If.m1099Q(m1102V5, m1102V4, 0, 5);
                return;
            }
            return;
        }
        if (this.f6238Pm != -1.0f) {
            C2598ww m1102V6 = c0457If.m1102V(this.f6236BX);
            C2598ww m1102V7 = c0457If.m1102V(mo3091G2);
            float f = this.f6238Pm;
            C1335Z1 m1101S = c0457If.m1101S();
            m1101S.f4226P.mo1670v(m1102V6, -1.0f);
            m1101S.f4226P.mo1670v(m1102V7, f);
            c0457If.m1111v(m1101S);
        }
    }
}
