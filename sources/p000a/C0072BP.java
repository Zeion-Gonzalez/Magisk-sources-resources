package p000a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: a.BP */
/* loaded from: classes.dex */
public final class C0072BP extends AbstractC1333Z {

    /* renamed from: w */
    public byte[] f308w;

    public C0072BP(byte[] bArr) {
        this.f308w = bArr;
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: E */
    public final InterfaceC0959S mo142E(int i) {
        m146c();
        return this.f4224S[i];
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: J */
    public final AbstractC0102C mo143J() {
        return ((AbstractC1333Z) mo148g()).mo143J();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f308w;
        }
        if (bArr != null) {
            c0175dp.m336M(48, z, bArr);
        } else {
            super.mo148g().mo144S(c0175dp, z);
        }
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: Y */
    public final AbstractC0477J mo145Y() {
        return ((AbstractC1333Z) mo148g()).mo145Y();
    }

    /* renamed from: c */
    public final synchronized void m146c() {
        C2551w c2551w;
        if (this.f308w != null) {
            int i = 0;
            C2651y c2651y = new C2651y(this.f308w, 0);
            try {
                AbstractC1593e m4554C = c2651y.m4554C();
                if (m4554C == null) {
                    c2551w = new C2551w(0);
                } else {
                    C2551w c2551w2 = new C2551w();
                    do {
                        c2551w2.m4371z(m4554C);
                        m4554C = c2651y.m4554C();
                    } while (m4554C != null);
                    c2551w = c2551w2;
                }
                c2651y.close();
                this.f4224S = c2551w.m4369P();
                this.f308w = null;
            } catch (IOException e) {
                throw new C0367H(i, "malformed ASN.1: " + e, e);
            }
        }
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: f */
    public final Enumeration mo147f() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f308w;
        }
        if (bArr != null) {
            return new C0664Ma(bArr);
        }
        return super.mo147f();
    }

    @Override // p000a.AbstractC1333Z, p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        m146c();
        return super.mo148g();
    }

    @Override // p000a.AbstractC1333Z, p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        m146c();
        return super.hashCode();
    }

    @Override // p000a.AbstractC1333Z, java.lang.Iterable
    public final Iterator iterator() {
        m146c();
        return super.iterator();
    }

    @Override // p000a.AbstractC1333Z, p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        m146c();
        return super.mo149k();
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: r */
    public final AbstractC1176W mo150r() {
        return ((AbstractC1333Z) mo148g()).mo150r();
    }

    @Override // p000a.AbstractC1333Z
    public final int size() {
        m146c();
        return this.f4224S.length;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f308w;
        }
        if (bArr != null) {
            return C0175DP.m334Q(bArr.length, z);
        }
        return super.mo148g().mo151w(z);
    }
}
