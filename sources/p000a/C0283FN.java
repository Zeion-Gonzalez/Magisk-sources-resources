package p000a;

/* renamed from: a.FN */
/* loaded from: classes.dex */
public final class C0283FN extends AbstractC1913k {

    /* renamed from: k */
    public final /* synthetic */ int f987k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283FN(C1281Y c1281y, C2339s c2339s, AbstractC1593e abstractC1593e, int i, AbstractC1593e abstractC1593e2) {
        super(c1281y, c2339s, abstractC1593e, i, abstractC1593e2);
        this.f987k = 0;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        switch (this.f987k) {
            case AbstractC0795Op.f2698E /* 0 */:
                return this;
            default:
                return new C0283FN(this.f5971S, this.f5970R, this.f5973w, this.f5969I, this.f5972q);
        }
    }

    @Override // p000a.AbstractC1913k
    /* renamed from: y */
    public final AbstractC1333Z mo580y() {
        int i = this.f987k;
        AbstractC1593e abstractC1593e = this.f5972q;
        boolean z = true;
        int i2 = this.f5969I;
        boolean z2 = false;
        AbstractC1593e abstractC1593e2 = this.f5973w;
        C2339s c2339s = this.f5970R;
        C1281Y c1281y = this.f5971S;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2551w c2551w = new C2551w(4);
                if (c1281y != null) {
                    c2551w.m4371z(c1281y);
                }
                if (c2339s != null) {
                    c2551w.m4371z(c2339s);
                }
                if (abstractC1593e2 != null) {
                    c2551w.m4371z(abstractC1593e2.mo149k());
                }
                if (i2 != 0) {
                    z = false;
                }
                c2551w.m4371z(new C1524cl(i2, z2 ? 1 : 0, abstractC1593e, z));
                return new C1802hw(c2551w);
            default:
                C2551w c2551w2 = new C2551w(4);
                if (c1281y != null) {
                    c2551w2.m4371z(c1281y);
                }
                if (c2339s != null) {
                    c2551w2.m4371z(c2339s);
                }
                if (abstractC1593e2 != null) {
                    c2551w2.m4371z(abstractC1593e2.mo148g());
                }
                if (i2 == 0) {
                    z2 = true;
                }
                c2551w2.m4371z(new C1524cl(i2, z ? 1 : 0, abstractC1593e, z2));
                return new C0423I1(c2551w2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0283FN(AbstractC1333Z abstractC1333Z, int i) {
        super(abstractC1333Z);
        this.f987k = i;
    }
}
