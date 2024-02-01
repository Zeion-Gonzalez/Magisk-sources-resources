package p000a;

/* renamed from: a.gw */
/* loaded from: classes.dex */
public final class C1752gw extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ AbstractC2499v4 f5518I;

    /* renamed from: R */
    public final /* synthetic */ C1216Wj f5519R;

    /* renamed from: k */
    public final /* synthetic */ C1200WR f5520k;

    /* renamed from: q */
    public final /* synthetic */ boolean f5521q;

    /* renamed from: w */
    public final /* synthetic */ C1216Wj f5522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752gw(C1216Wj c1216Wj, C1216Wj c1216Wj2, AbstractC2499v4 abstractC2499v4, boolean z, C1200WR c1200wr) {
        super(1);
        this.f5519R = c1216Wj;
        this.f5522w = c1216Wj2;
        this.f5518I = abstractC2499v4;
        this.f5521q = z;
        this.f5520k = c1200wr;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        this.f5519R.f3980S = true;
        this.f5522w.f3980S = true;
        boolean z = this.f5521q;
        C1200WR c1200wr = this.f5520k;
        this.f5518I.m4336R((C1553dE) obj, z, c1200wr);
        return C0329GJ.f1115z;
    }
}
