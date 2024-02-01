package p000a;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: a.e */
/* loaded from: classes.dex */
public abstract class AbstractC1593e extends AbstractC0209E {
    /* renamed from: q */
    public static AbstractC1593e m3067q(byte[] bArr) {
        C2651y c2651y = new C2651y(bArr);
        try {
            AbstractC1593e m4554C = c2651y.m4554C();
            if (c2651y.available() == 0) {
                return m4554C;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* renamed from: I */
    public final boolean m3068I(AbstractC1593e abstractC1593e) {
        return this == abstractC1593e || mo216V(abstractC1593e);
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        return this;
    }

    /* renamed from: R */
    public abstract boolean mo215R();

    /* renamed from: S */
    public abstract void mo144S(C0175DP c0175dp, boolean z);

    /* renamed from: V */
    public abstract boolean mo216V(AbstractC1593e abstractC1593e);

    @Override // p000a.AbstractC0209E
    /* renamed from: W */
    public final void mo418W(OutputStream outputStream) {
        mo149k().mo144S(new C0242Ec(outputStream), true);
    }

    @Override // p000a.AbstractC0209E
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0959S) && mo216V(((InterfaceC0959S) obj).mo302N());
    }

    /* renamed from: g */
    public AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC0209E
    public abstract int hashCode();

    /* renamed from: k */
    public AbstractC1593e mo149k() {
        return this;
    }

    /* renamed from: w */
    public abstract int mo151w(boolean z);
}
