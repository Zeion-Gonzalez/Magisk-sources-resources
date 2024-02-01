package p000a;

/* renamed from: a.pw */
/* loaded from: classes.dex */
public final class C2224pw extends AbstractC0399Ha {

    /* renamed from: h */
    public C1525cm f6839h;

    /* renamed from: z */
    public long f6840z = -1;

    @Override // p000a.AbstractC0399Ha
    /* renamed from: h */
    public final InterfaceC1171Vv[] mo243h(AbstractC0629Lq abstractC0629Lq) {
        long j = this.f6840z;
        this.f6840z = -1L;
        this.f6839h = null;
        return ((C1894jf) abstractC0629Lq).m3535y(j);
    }

    @Override // p000a.AbstractC0399Ha
    /* renamed from: z */
    public final boolean mo244z(AbstractC0629Lq abstractC0629Lq) {
        C1894jf c1894jf = (C1894jf) abstractC0629Lq;
        if (this.f6840z >= 0) {
            return false;
        }
        long j = c1894jf.f5924y;
        if (j < c1894jf.f5923s) {
            c1894jf.f5923s = j;
        }
        this.f6840z = j;
        return true;
    }
}
