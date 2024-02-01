package p000a;

/* renamed from: a.IV */
/* loaded from: classes.dex */
public abstract class AbstractC0447IV extends AbstractC2171ov implements InterfaceC0225EG, InterfaceC0495JL {

    /* renamed from: g */
    public final int f1516g;

    /* renamed from: y */
    public final int f1517y;

    public AbstractC0447IV(int i, Class cls, String str, String str2, int i2) {
        super(C0604LJ.f1965S, cls, str, str2, (i2 & 1) == 1);
        this.f1516g = i;
        this.f1517y = i2 >> 1;
    }

    /* renamed from: G */
    public final String toString() {
        InterfaceC1346ZC interfaceC1346ZC = this.f6653S;
        if (interfaceC1346ZC == null) {
            mo854h();
            this.f6653S = this;
            interfaceC1346ZC = this;
        }
        if (interfaceC1346ZC != this) {
            return interfaceC1346ZC.toString();
        }
        String str = this.f6651I;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return AbstractC2441tz.m4184G("function ", str, " (Kotlin reflection is not available)");
    }

    /* renamed from: N */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0447IV) {
            AbstractC0447IV abstractC0447IV = (AbstractC0447IV) obj;
            if (this.f6651I.equals(abstractC0447IV.f6651I) && this.f6655q.equals(abstractC0447IV.f6655q) && this.f1517y == abstractC0447IV.f1517y && this.f1516g == abstractC0447IV.f1516g && AbstractC1292YB.m2695u(this.f6652R, abstractC0447IV.f6652R) && AbstractC1292YB.m2695u(m3787v(), abstractC0447IV.m3787v())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC0495JL)) {
            return false;
        }
        InterfaceC1346ZC interfaceC1346ZC = this.f6653S;
        if (interfaceC1346ZC == null) {
            mo854h();
            this.f6653S = this;
            interfaceC1346ZC = this;
        }
        return obj.equals(interfaceC1346ZC);
    }

    @Override // p000a.InterfaceC0225EG
    /* renamed from: P */
    public final int mo252P() {
        return this.f1516g;
    }

    @Override // p000a.AbstractC2171ov
    /* renamed from: h */
    public final InterfaceC1346ZC mo854h() {
        AbstractC0274FD.f956z.getClass();
        return this;
    }

    /* renamed from: u */
    public final int hashCode() {
        return this.f6655q.hashCode() + ((this.f6651I.hashCode() + (m3787v() == null ? 0 : m3787v().hashCode() * 31)) * 31);
    }

    public AbstractC0447IV(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f1516g = i;
        this.f1517y = 0;
    }
}
