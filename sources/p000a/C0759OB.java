package p000a;

/* renamed from: a.OB */
/* loaded from: classes.dex */
public final class C0759OB extends C1095UY {

    /* renamed from: P */
    public final Object f2575P;

    public C0759OB(int i) {
        super(i, 1);
        this.f2575P = new Object();
    }

    @Override // p000a.C1095UY
    /* renamed from: h */
    public final boolean mo1756h(Object obj) {
        boolean mo1756h;
        synchronized (this.f2575P) {
            mo1756h = super.mo1756h(obj);
        }
        return mo1756h;
    }

    @Override // p000a.C1095UY
    /* renamed from: z */
    public final Object mo1757z() {
        Object mo1757z;
        synchronized (this.f2575P) {
            mo1757z = super.mo1757z();
        }
        return mo1757z;
    }
}
