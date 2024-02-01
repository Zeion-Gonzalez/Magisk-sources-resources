package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Xw */
/* loaded from: classes.dex */
public final class C1277Xw extends AbstractC0629Lq implements InterfaceC0101Bz, InterfaceC1634ej {

    /* renamed from: q */
    public static final AtomicReferenceFieldUpdater f4104q = AtomicReferenceFieldUpdater.newUpdater(C1277Xw.class, Object.class, "_state");

    /* renamed from: I */
    public int f4105I;
    private volatile Object _state;

    public C1277Xw(Object obj) {
        this._state = obj;
    }

    @Override // p000a.AbstractC0629Lq
    /* renamed from: N */
    public final AbstractC0399Ha[] mo1392N() {
        return new C0117CG[2];
    }

    @Override // p000a.AbstractC0629Lq
    /* renamed from: P */
    public final AbstractC0399Ha mo1393P() {
        return new C0117CG();
    }

    @Override // p000a.InterfaceC0103C1
    public final Object getValue() {
        C0175DP c0175dp = AbstractC0438II.f1464r;
        Object obj = f4104q.get(this);
        if (obj == c0175dp) {
            return null;
        }
        return obj;
    }

    @Override // p000a.InterfaceC2445u2
    /* renamed from: h */
    public final Object mo237h(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        m2607u(obj);
        return C0329GJ.f1115z;
    }

    /* renamed from: u */
    public final void m2607u(Object obj) {
        int i;
        AbstractC0399Ha[] abstractC0399HaArr;
        C0175DP c0175dp;
        boolean z;
        boolean z2;
        if (obj == null) {
            obj = AbstractC0438II.f1464r;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4104q;
            if (!AbstractC1292YB.m2695u(atomicReferenceFieldUpdater.get(this), obj)) {
                atomicReferenceFieldUpdater.set(this, obj);
                int i2 = this.f4105I;
                if ((i2 & 1) == 0) {
                    int i3 = i2 + 1;
                    this.f4105I = i3;
                    AbstractC0399Ha[] abstractC0399HaArr2 = this.f2043S;
                    while (true) {
                        C0117CG[] c0117cgArr = (C0117CG[]) abstractC0399HaArr2;
                        if (c0117cgArr != null) {
                            for (C0117CG c0117cg : c0117cgArr) {
                                if (c0117cg != null) {
                                    while (true) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0117CG.f415z;
                                        Object obj2 = atomicReferenceFieldUpdater2.get(c0117cg);
                                        if (obj2 != null && obj2 != (c0175dp = AbstractC1292YB.f4139V)) {
                                            C0175DP c0175dp2 = AbstractC1292YB.f4134M;
                                            if (obj2 == c0175dp2) {
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(c0117cg, obj2, c0175dp)) {
                                                        z = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(c0117cg) != obj2) {
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                                if (z) {
                                                    break;
                                                }
                                            } else {
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(c0117cg, obj2, c0175dp2)) {
                                                        z2 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(c0117cg) != obj2) {
                                                        z2 = false;
                                                        break;
                                                    }
                                                }
                                                if (z2) {
                                                    ((C1525cm) obj2).mo320u(C0329GJ.f1115z);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i = this.f4105I;
                            if (i == i3) {
                                break;
                            } else {
                                abstractC0399HaArr = this.f2043S;
                            }
                        }
                        abstractC0399HaArr2 = abstractC0399HaArr;
                        i3 = i;
                    }
                    this.f4105I = i3 + 1;
                } else {
                    this.f4105I = i2 + 2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bb A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:81:0x003a, B:93:0x0078, B:95:0x0080, B:97:0x0085, B:107:0x00a6, B:112:0x00bb, B:113:0x00d3, B:118:0x00e3, B:120:0x00e7, B:121:0x00ea, B:116:0x00dd, B:99:0x008b, B:103:0x0092, B:86:0x0050, B:89:0x005a, B:92:0x006b), top: B:129:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0080 A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:81:0x003a, B:93:0x0078, B:95:0x0080, B:97:0x0085, B:107:0x00a6, B:112:0x00bb, B:113:0x00d3, B:118:0x00e3, B:120:0x00e7, B:121:0x00ea, B:116:0x00dd, B:99:0x008b, B:103:0x0092, B:86:0x0050, B:89:0x005a, B:92:0x006b), top: B:129:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0085 A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:81:0x003a, B:93:0x0078, B:95:0x0080, B:97:0x0085, B:107:0x00a6, B:112:0x00bb, B:113:0x00d3, B:118:0x00e3, B:120:0x00e7, B:121:0x00ea, B:116:0x00dd, B:99:0x008b, B:103:0x0092, B:86:0x0050, B:89:0x005a, B:92:0x006b), top: B:129:0x0028 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x00b9 -> B:93:0x0078). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x00f3 -> B:93:0x0078). Please submit an issue!!! */
    @Override // p000a.InterfaceC1634ej
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1459z(p000a.InterfaceC2445u2 r18, p000a.InterfaceC1171Vv r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1277Xw.mo1459z(a.u2, a.Vv):java.lang.Object");
    }
}
