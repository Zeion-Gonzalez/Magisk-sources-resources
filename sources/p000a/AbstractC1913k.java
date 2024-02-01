package p000a;

/* renamed from: a.k */
/* loaded from: classes.dex */
public abstract class AbstractC1913k extends AbstractC1593e {

    /* renamed from: I */
    public final int f5969I;

    /* renamed from: R */
    public final C2339s f5970R;

    /* renamed from: S */
    public final C1281Y f5971S;

    /* renamed from: q */
    public final AbstractC1593e f5972q;

    /* renamed from: w */
    public final AbstractC1593e f5973w;

    public AbstractC1913k(C1281Y c1281y, C2339s c2339s, AbstractC1593e abstractC1593e, int i, AbstractC1593e abstractC1593e2) {
        C2120o c2120o;
        this.f5971S = c1281y;
        this.f5970R = c2339s;
        this.f5973w = abstractC1593e;
        if (i >= 0 && i <= 2) {
            this.f5969I = i;
            if (i != 1) {
                c2120o = i == 2 ? AbstractC1176W.f3832R : c2120o;
                this.f5972q = abstractC1593e2;
                return;
            }
            c2120o = AbstractC0477J.f1589R;
            c2120o.m447z(abstractC1593e2);
            this.f5972q = abstractC1593e2;
            return;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4188N("invalid encoding value: ", i));
    }

    /* renamed from: s */
    public static AbstractC1593e m3545s(AbstractC1333Z abstractC1333Z, int i) {
        if (abstractC1333Z.size() > i) {
            return abstractC1333Z.mo142E(i).mo302N();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return true;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m337R(40, z);
        mo580y().mo144S(c0175dp, false);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (this == abstractC1593e) {
            return true;
        }
        if (!(abstractC1593e instanceof AbstractC1913k)) {
            return false;
        }
        AbstractC1913k abstractC1913k = (AbstractC1913k) abstractC1593e;
        return AbstractC1292YB.m2658Q(this.f5971S, abstractC1913k.f5971S) && AbstractC1292YB.m2658Q(this.f5970R, abstractC1913k.f5970R) && AbstractC1292YB.m2658Q(this.f5973w, abstractC1913k.f5973w) && this.f5969I == abstractC1913k.f5969I && this.f5972q.m3068I(abstractC1913k.f5972q);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        C1281Y c1281y = this.f5971S;
        if (c1281y == null) {
            hashCode = 0;
        } else {
            hashCode = c1281y.hashCode();
        }
        C2339s c2339s = this.f5970R;
        if (c2339s == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2339s.hashCode();
        }
        int i2 = hashCode ^ hashCode2;
        AbstractC1593e abstractC1593e = this.f5973w;
        if (abstractC1593e != null) {
            i = abstractC1593e.hashCode();
        }
        return ((i ^ i2) ^ this.f5969I) ^ this.f5972q.hashCode();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return mo580y().mo151w(z);
    }

    /* renamed from: y */
    public abstract AbstractC1333Z mo580y();

    public AbstractC1913k(AbstractC1333Z abstractC1333Z) {
        int i;
        AbstractC1593e N;
        AbstractC1593e m3545s = m3545s(abstractC1333Z, 0);
        if (m3545s instanceof C1281Y) {
            this.f5971S = (C1281Y) m3545s;
            m3545s = m3545s(abstractC1333Z, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (m3545s instanceof C2339s) {
            this.f5970R = (C2339s) m3545s;
            i++;
            m3545s = m3545s(abstractC1333Z, i);
        }
        if (!(m3545s instanceof AbstractC1857j)) {
            this.f5973w = m3545s;
            i++;
            m3545s = m3545s(abstractC1333Z, i);
        }
        if (abstractC1333Z.size() != i + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (m3545s instanceof AbstractC1857j) {
            AbstractC1857j abstractC1857j = (AbstractC1857j) m3545s;
            int i2 = abstractC1857j.f5794w;
            if (i2 >= 0 && i2 <= 2) {
                this.f5969I = i2;
                int i3 = abstractC1857j.f5792R;
                if (128 == i3) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            N = (AbstractC0477J) AbstractC0477J.f1589R.m442W(abstractC1857j, false);
                        } else if (i2 == 2) {
                            N = (AbstractC1176W) AbstractC1176W.f3832R.m442W(abstractC1857j, false);
                        } else {
                            throw new IllegalArgumentException("invalid tag: " + AbstractC1843ih.m3436d(i3, i2));
                        }
                    } else if (abstractC1857j.m3474U()) {
                        InterfaceC0959S interfaceC0959S = abstractC1857j.f5791I;
                        N = (interfaceC0959S instanceof AbstractC0209E ? (AbstractC0209E) interfaceC0959S : interfaceC0959S.mo302N()).mo302N();
                    } else {
                        throw new IllegalStateException("object implicit - explicit expected.");
                    }
                    this.f5972q = N;
                    return;
                }
                throw new IllegalArgumentException("invalid tag: " + AbstractC1843ih.m3436d(i3, i2));
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("invalid encoding value: ", i2));
        }
        throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
    }
}
