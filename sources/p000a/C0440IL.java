package p000a;

/* renamed from: a.IL */
/* loaded from: classes.dex */
public final class C0440IL extends AbstractC0209E {

    /* renamed from: S */
    public final AbstractC0102C f1473S;

    public C0440IL(C1281Y c1281y, AbstractC1593e abstractC1593e) {
        C2551w c2551w = new C2551w(2);
        c2551w.m4371z(c1281y);
        c2551w.m4371z(abstractC1593e);
        this.f1473S = new C2420ta(new C1802hw(c2551w));
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        return this.f1473S;
    }

    /* renamed from: S */
    public final C2425th[] m1058S() {
        C2425th c2425th;
        AbstractC0102C abstractC0102C = this.f1473S;
        int length = abstractC0102C.f388S.length;
        C2425th[] c2425thArr = new C2425th[length];
        for (int i = 0; i != length; i++) {
            InterfaceC0959S interfaceC0959S = abstractC0102C.f388S[i];
            if (interfaceC0959S instanceof C2425th) {
                c2425th = (C2425th) interfaceC0959S;
            } else if (interfaceC0959S != null) {
                c2425th = new C2425th(AbstractC1333Z.m2714U(interfaceC0959S));
            } else {
                throw new IllegalArgumentException("null value in getInstance()");
            }
            c2425thArr[i] = c2425th;
        }
        return c2425thArr;
    }

    /* renamed from: V */
    public final C2425th m1059V() {
        InterfaceC0959S[] interfaceC0959SArr = this.f1473S.f388S;
        if (interfaceC0959SArr.length == 0) {
            return null;
        }
        InterfaceC0959S interfaceC0959S = interfaceC0959SArr[0];
        if (interfaceC0959S instanceof C2425th) {
            return (C2425th) interfaceC0959S;
        }
        if (interfaceC0959S != null) {
            return new C2425th(AbstractC1333Z.m2714U(interfaceC0959S));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public C0440IL(AbstractC0102C abstractC0102C) {
        this.f1473S = abstractC0102C;
    }

    public C0440IL(C2425th[] c2425thArr) {
        this.f1473S = new C2420ta(c2425thArr);
    }
}
