package p000a;

/* renamed from: a.hP */
/* loaded from: classes.dex */
public abstract class AbstractC1776hP extends AbstractC2171ov implements InterfaceC0609LP {

    /* renamed from: g */
    public final boolean f5599g;

    public AbstractC1776hP(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f5599g = (i & 2) == 2;
    }

    /* renamed from: N */
    public final InterfaceC1346ZC m3306N() {
        if (this.f5599g) {
            return this;
        }
        InterfaceC1346ZC interfaceC1346ZC = this.f6653S;
        if (interfaceC1346ZC == null) {
            InterfaceC1346ZC mo854h = mo854h();
            this.f6653S = mo854h;
            return mo854h;
        }
        return interfaceC1346ZC;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1776hP) {
            AbstractC1776hP abstractC1776hP = (AbstractC1776hP) obj;
            return m3787v().equals(abstractC1776hP.m3787v()) && this.f6651I.equals(abstractC1776hP.f6651I) && this.f6655q.equals(abstractC1776hP.f6655q) && AbstractC1292YB.m2695u(this.f6652R, abstractC1776hP.f6652R);
        }
        if (obj instanceof InterfaceC0609LP) {
            return obj.equals(m3306N());
        }
        return false;
    }

    public final int hashCode() {
        return this.f6655q.hashCode() + ((this.f6651I.hashCode() + (m3787v().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC1346ZC m3306N = m3306N();
        if (m3306N != this) {
            return m3306N.toString();
        }
        return AbstractC2441tz.m4187M(new StringBuilder("property "), this.f6651I, " (Kotlin reflection is not available)");
    }
}
