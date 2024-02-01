package p000a;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: a.j */
/* loaded from: classes.dex */
public abstract class AbstractC1857j extends AbstractC1593e implements InterfaceC2200pR {

    /* renamed from: I */
    public final InterfaceC0959S f5791I;

    /* renamed from: R */
    public final int f5792R;

    /* renamed from: S */
    public final int f5793S;

    /* renamed from: w */
    public final int f5794w;

    public AbstractC1857j(int i, int i2, int i3, InterfaceC0959S interfaceC0959S) {
        if (interfaceC0959S == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("invalid tag class: ", i2));
        }
        this.f5793S = interfaceC0959S instanceof InterfaceC1121V ? 1 : i;
        this.f5792R = i2;
        this.f5794w = i3;
        this.f5791I = interfaceC0959S;
    }

    /* renamed from: s */
    public static AbstractC1857j m3472s(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1857j)) {
            if (obj instanceof InterfaceC0959S) {
                AbstractC1593e mo302N = ((InterfaceC0959S) obj).mo302N();
                if (mo302N instanceof AbstractC1857j) {
                    return (AbstractC1857j) mo302N;
                }
            } else if (obj instanceof byte[]) {
                try {
                    AbstractC1593e m3067q = AbstractC1593e.m3067q((byte[]) obj);
                    if (m3067q instanceof AbstractC1857j) {
                        return (AbstractC1857j) m3067q;
                    }
                    throw new IllegalStateException("unexpected object: ".concat(m3067q.getClass().getName()));
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
        }
        return (AbstractC1857j) obj;
    }

    /* renamed from: y */
    public static C1524cl m3473y(int i, int i2, C2551w c2551w) {
        C1524cl c1524cl;
        boolean z = true;
        if (c2551w.f7796h != 1) {
            z = false;
        }
        if (z) {
            c1524cl = new C1524cl(3, i, i2, c2551w.m4370v(0), 1);
        } else {
            c1524cl = new C1524cl(4, i, i2, AbstractC1768hF.m3296z(c2551w), 1);
        }
        return c1524cl;
    }

    /* renamed from: E */
    public abstract AbstractC1333Z mo2950E(AbstractC1593e abstractC1593e);

    /* renamed from: U */
    public final boolean m3474U() {
        int i = this.f5793S;
        return i == 1 || i == 3;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof AbstractC1857j)) {
            return false;
        }
        AbstractC1857j abstractC1857j = (AbstractC1857j) abstractC1593e;
        if (this.f5794w != abstractC1857j.f5794w || this.f5792R != abstractC1857j.f5792R) {
            return false;
        }
        if (this.f5793S != abstractC1857j.f5793S && m3474U() != abstractC1857j.m3474U()) {
            return false;
        }
        AbstractC1593e mo302N = this.f5791I.mo302N();
        AbstractC1593e mo302N2 = abstractC1857j.f5791I.mo302N();
        if (mo302N == mo302N2) {
            return true;
        }
        if (!m3474U()) {
            try {
                return Arrays.equals(m416G(), abstractC1857j.m416G());
            } catch (IOException unused) {
                return false;
            }
        }
        return mo302N.mo216V(mo302N2);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public AbstractC1593e mo148g() {
        return new C1524cl(this.f5793S, this.f5792R, this.f5794w, this.f5791I, 1);
    }

    @Override // p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        return this;
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return (((this.f5792R * 7919) ^ this.f5794w) ^ (m3474U() ? 15 : 240)) ^ this.f5791I.mo302N().hashCode();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public AbstractC1593e mo149k() {
        return new C1524cl(this.f5793S, this.f5792R, this.f5794w, this.f5791I, 0);
    }

    public final String toString() {
        return AbstractC1843ih.m3436d(this.f5792R, this.f5794w) + this.f5791I;
    }

    public AbstractC1857j(boolean z, int i, InterfaceC0959S interfaceC0959S) {
        this(z ? 1 : 2, 128, i, interfaceC0959S);
    }
}
