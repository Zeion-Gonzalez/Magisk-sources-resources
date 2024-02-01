package p000a;

/* renamed from: a.ct */
/* loaded from: classes.dex */
public final class C1531ct implements InterfaceC1279Xy {

    /* renamed from: I */
    public final InterfaceC1171Vv f4728I;

    /* renamed from: R */
    public final long f4729R;

    /* renamed from: S */
    public final C1894jf f4730S;

    /* renamed from: w */
    public final Object f4731w;

    public C1531ct(C1894jf c1894jf, long j, Object obj, C1525cm c1525cm) {
        this.f4730S = c1894jf;
        this.f4729R = j;
        this.f4731w = obj;
        this.f4728I = c1525cm;
    }

    @Override // p000a.InterfaceC1279Xy
    /* renamed from: v */
    public final void mo1430v() {
        C1894jf c1894jf = this.f4730S;
        synchronized (c1894jf) {
            if (this.f4729R >= c1894jf.m3527S()) {
                Object[] objArr = c1894jf.f5920g;
                long j = this.f4729R;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    objArr[((int) j) & (objArr.length - 1)] = AbstractC1292YB.f4133G;
                    c1894jf.m3531o();
                }
            }
        }
    }
}
