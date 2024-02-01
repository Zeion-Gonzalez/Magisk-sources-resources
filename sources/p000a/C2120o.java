package p000a;

/* renamed from: a.o */
/* loaded from: classes.dex */
public final class C2120o extends AbstractC0227EK {

    /* renamed from: P */
    public final /* synthetic */ int f6525P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2120o(int i, int i2, Class cls) {
        super(cls, i);
        this.f6525P = i2;
    }

    @Override // p000a.AbstractC0227EK
    /* renamed from: Q */
    public final AbstractC1593e mo440Q(AbstractC1333Z abstractC1333Z) {
        switch (this.f6525P) {
            case 1:
                return abstractC1333Z.mo150r();
            case 14:
                return abstractC1333Z.mo145Y();
            case 17:
                return abstractC1333Z;
            case 18:
                return abstractC1333Z.mo143J();
            default:
                super.mo440Q(abstractC1333Z);
                throw null;
        }
    }

    @Override // p000a.AbstractC0227EK
    /* renamed from: u */
    public final AbstractC1593e mo445u(C1745gp c1745gp) {
        switch (this.f6525P) {
            case 1:
                return AbstractC1176W.m2405y(c1745gp.f1591S);
            case 2:
                return C0637M.m1428y(c1745gp.f1591S);
            case 7:
                return new C1338Z4(c1745gp.f1591S);
            case 9:
                return new C2339s(c1745gp.f1591S);
            case 13:
                byte[] bArr = c1745gp.f1591S;
                C2120o c2120o = C1281Y.f4114w;
                C1281Y c1281y = (C1281Y) C1281Y.f4113I.get(new C2282r(bArr));
                if (c1281y == null) {
                    return new C1281Y(bArr, false);
                }
                return c1281y;
            case 14:
                return c1745gp;
            default:
                super.mo445u(c1745gp);
                throw null;
        }
    }
}
