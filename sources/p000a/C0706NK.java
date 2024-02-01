package p000a;

import android.util.SparseIntArray;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.NK */
/* loaded from: classes.dex */
public final class C0706NK extends AbstractC2693yq implements InterfaceC1221Wo {

    /* renamed from: qn */
    public static final SparseIntArray f2373qn;

    /* renamed from: Yd */
    public long f2374Yd;

    /* renamed from: b */
    public final ViewOnClickListenerC0574Kl f2375b;

    /* renamed from: l */
    public final ViewOnClickListenerC0574Kl f2376l;

    /* renamed from: m */
    public final ViewOnClickListenerC0574Kl f2377m;

    /* renamed from: nP */
    public final C0130CV f2378nP;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2373qn = sparseIntArray;
        sparseIntArray.put(R.id.module_divider, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0706NK(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0706NK.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f2374Yd != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f2374Yd = 64L;
        }
        m4816I();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15N() {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0706NK.mo15N():void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            C2744zq c2744zq = (C2744zq) obj;
            return m1641s(i2);
        }
        C0374H8 c0374h8 = (C0374H8) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f2374Yd |= 1;
            }
        } else if (i2 == 29) {
            synchronized (this) {
                this.f2374Yd |= 4;
            }
        } else if (i2 == 9) {
            synchronized (this) {
                this.f2374Yd |= 8;
            }
        } else if (i2 == 35) {
            synchronized (this) {
                this.f2374Yd |= 16;
            }
        } else {
            if (i2 != 42) {
                return false;
            }
            synchronized (this) {
                this.f2374Yd |= 32;
            }
        }
        return true;
    }

    /* renamed from: U */
    public final void m1640U(C2744zq c2744zq) {
        m4818g(1, c2744zq);
        this.f8429D = c2744zq;
        synchronized (this) {
            this.f2374Yd |= 2;
        }
        m2861Q(43);
        m4816I();
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        boolean z2;
        C0357Gq m44z;
        int i2 = 0;
        boolean z3 = true;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                if (i == 3) {
                    C0374H8 c0374h8 = this.f8430K;
                    if (c0374h8 == null) {
                        z3 = false;
                    }
                    if (z3) {
                        boolean z4 = c0374h8.f1279k;
                        boolean z5 = !z4;
                        int[] iArr = {29, 42};
                        if (z4 != z5) {
                            c0374h8.f1279k = z5;
                            while (i2 < 2) {
                                AbstractC0795Op.m1801B(c0374h8, iArr[i2]);
                                i2++;
                            }
                            C1195WL c1195wl = c0374h8.f1277R;
                            AbstractC1062Tx abstractC1062Tx = c1195wl.f3883E;
                            if (z5) {
                                if (!c1195wl.f3895r.exists()) {
                                    abstractC1062Tx.createNewFile();
                                    m44z = AbstractC0017AI.m44z("copy_preinit_files");
                                } else {
                                    return;
                                }
                            } else {
                                abstractC1062Tx.delete();
                                m44z = AbstractC0017AI.m44z("copy_preinit_files");
                            }
                            m44z.m4631d2(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C0374H8 c0374h82 = this.f8430K;
            C2744zq c2744zq = this.f8429D;
            if (c2744zq != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (c0374h82 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C1195WL c1195wl2 = c0374h82.f1277R;
                    if (c1195wl2 != null) {
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        C0907R6 c0907r6 = c1195wl2.f3898y;
                        c2744zq.getClass();
                        if (c0907r6 != null && AbstractC1292YB.m2695u(C1910jw.f5953I.m4844P(), Boolean.TRUE)) {
                            c2744zq.m4501w("android.permission.WRITE_EXTERNAL_STORAGE", new C0903R2(i3, c2744zq, c2744zq, c0907r6));
                            return;
                        } else {
                            c2744zq.m4500S(new C0805P0((int) R.string.no_connection));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        C0374H8 c0374h83 = this.f8430K;
        if (c0374h83 != null) {
            i2 = 1;
        }
        if (i2 != 0) {
            c0374h83.m862M(!c0374h83.f1280q);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            C0374H8 c0374h8 = (C0374H8) obj;
            m4818g(0, c0374h8);
            this.f8430K = c0374h8;
            synchronized (this) {
                this.f2374Yd |= 1;
            }
            m2861Q(20);
            m4816I();
        } else {
            if (43 != i) {
                return false;
            }
            m1640U((C2744zq) obj);
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m1641s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f2374Yd |= 2;
        }
        return true;
    }
}
