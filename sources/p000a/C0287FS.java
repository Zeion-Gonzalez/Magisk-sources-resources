package p000a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.FS */
/* loaded from: classes.dex */
public final class C0287FS {

    /* renamed from: N */
    public final EnumC0494JK f992N;

    /* renamed from: P */
    public final C1628ed f993P;

    /* renamed from: Q */
    public C0287FS f994Q;

    /* renamed from: W */
    public C2598ww f995W;

    /* renamed from: h */
    public int f996h;

    /* renamed from: v */
    public boolean f999v;

    /* renamed from: z */
    public HashSet f1000z = null;

    /* renamed from: u */
    public int f998u = 0;

    /* renamed from: o */
    public int f997o = Integer.MIN_VALUE;

    public C0287FS(C1628ed c1628ed, EnumC0494JK enumC0494JK) {
        this.f993P = c1628ed;
        this.f992N = enumC0494JK;
    }

    /* renamed from: G */
    public final void m585G() {
        HashSet hashSet;
        C0287FS c0287fs = this.f994Q;
        if (c0287fs != null && (hashSet = c0287fs.f1000z) != null) {
            hashSet.remove(this);
            if (this.f994Q.f1000z.size() == 0) {
                this.f994Q.f1000z = null;
            }
        }
        this.f1000z = null;
        this.f994Q = null;
        this.f998u = 0;
        this.f997o = Integer.MIN_VALUE;
        this.f999v = false;
        this.f996h = 0;
    }

    /* renamed from: M */
    public final void m586M() {
        C2598ww c2598ww = this.f995W;
        if (c2598ww == null) {
            this.f995W = new C2598ww(1);
        } else {
            c2598ww.m4479v();
        }
    }

    /* renamed from: N */
    public final int m587N() {
        C0287FS c0287fs;
        if (this.f993P.f5046UZ == 8) {
            return 0;
        }
        int i = this.f997o;
        if (i != Integer.MIN_VALUE && (c0287fs = this.f994Q) != null && c0287fs.f993P.f5046UZ == 8) {
            return i;
        }
        return this.f998u;
    }

    /* renamed from: P */
    public final int m588P() {
        if (this.f999v) {
            return this.f996h;
        }
        return 0;
    }

    /* renamed from: Q */
    public final C0287FS m589Q() {
        EnumC0494JK enumC0494JK = this.f992N;
        int ordinal = enumC0494JK.ordinal();
        C1628ed c1628ed = this.f993P;
        switch (ordinal) {
            case AbstractC0795Op.f2698E /* 0 */:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1628ed.f5064j;
            case 2:
                return c1628ed.f5034L;
            case 3:
                return c1628ed.f5022C;
            case 4:
                return c1628ed.f5074p;
            default:
                throw new AssertionError(enumC0494JK.name());
        }
    }

    /* renamed from: V */
    public final void m590V(int i) {
        this.f996h = i;
        this.f999v = true;
    }

    /* renamed from: W */
    public final boolean m591W(C0287FS c0287fs) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c0287fs == null) {
            return false;
        }
        EnumC0494JK enumC0494JK = EnumC0494JK.f1649q;
        EnumC0494JK enumC0494JK2 = this.f992N;
        C1628ed c1628ed = c0287fs.f993P;
        EnumC0494JK enumC0494JK3 = c0287fs.f992N;
        if (enumC0494JK3 == enumC0494JK2) {
            if (enumC0494JK2 == enumC0494JK && (!c1628ed.f5058e || !this.f993P.f5058e)) {
                return false;
            }
            return true;
        }
        int ordinal = enumC0494JK2.ordinal();
        EnumC0494JK enumC0494JK4 = EnumC0494JK.f1651y;
        EnumC0494JK enumC0494JK5 = EnumC0494JK.f1650w;
        EnumC0494JK enumC0494JK6 = EnumC0494JK.f1647g;
        EnumC0494JK enumC0494JK7 = EnumC0494JK.f1646S;
        switch (ordinal) {
            case AbstractC0795Op.f2698E /* 0 */:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (enumC0494JK3 != enumC0494JK7 && enumC0494JK3 != enumC0494JK5) {
                    z = false;
                } else {
                    z = true;
                }
                if (c1628ed instanceof C2009ln) {
                    if (z || enumC0494JK3 == enumC0494JK6) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 2:
            case 4:
                if (enumC0494JK3 != EnumC0494JK.f1645R && enumC0494JK3 != EnumC0494JK.f1644I) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (c1628ed instanceof C2009ln) {
                    if (z2 || enumC0494JK3 == enumC0494JK4) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case 5:
                if (enumC0494JK3 == enumC0494JK7 || enumC0494JK3 == enumC0494JK5) {
                    return false;
                }
                return true;
            case 6:
                if (enumC0494JK3 == enumC0494JK || enumC0494JK3 == enumC0494JK6 || enumC0494JK3 == enumC0494JK4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(enumC0494JK2.name());
        }
    }

    /* renamed from: h */
    public final boolean m592h(C0287FS c0287fs, int i, int i2, boolean z) {
        if (c0287fs == null) {
            m585G();
            return true;
        }
        if (!z && !m591W(c0287fs)) {
            return false;
        }
        this.f994Q = c0287fs;
        if (c0287fs.f1000z == null) {
            c0287fs.f1000z = new HashSet();
        }
        HashSet hashSet = this.f994Q.f1000z;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f998u = i;
        this.f997o = i2;
        return true;
    }

    /* renamed from: o */
    public final boolean m593o() {
        return this.f994Q != null;
    }

    public final String toString() {
        return this.f993P.f5069n0 + ":" + this.f992N.toString();
    }

    /* renamed from: u */
    public final boolean m594u() {
        HashSet hashSet = this.f1000z;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0287FS) it.next()).m589Q().m593o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m595v(int i, C0368H0 c0368h0, ArrayList arrayList) {
        HashSet hashSet = this.f1000z;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1843ih.m3458r(((C0287FS) it.next()).f993P, i, arrayList, c0368h0);
            }
        }
    }

    /* renamed from: z */
    public final void m596z(C0287FS c0287fs, int i) {
        m592h(c0287fs, i, Integer.MIN_VALUE, false);
    }
}
