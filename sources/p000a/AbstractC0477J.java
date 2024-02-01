package p000a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: a.J */
/* loaded from: classes.dex */
public abstract class AbstractC0477J extends AbstractC1593e implements InterfaceC1487c {

    /* renamed from: R */
    public static final C2120o f1589R = new C2120o(4, 14, AbstractC0477J.class);

    /* renamed from: w */
    public static final byte[] f1590w = new byte[0];

    /* renamed from: S */
    public final byte[] f1591S;

    public AbstractC0477J(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f1591S = bArr;
    }

    /* renamed from: y */
    public static AbstractC0477J m1154y(Object obj) {
        if (obj == null || (obj instanceof AbstractC0477J)) {
            return (AbstractC0477J) obj;
        }
        if (obj instanceof InterfaceC0959S) {
            AbstractC1593e mo302N = ((InterfaceC0959S) obj).mo302N();
            if (mo302N instanceof AbstractC0477J) {
                return (AbstractC0477J) mo302N;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC0477J) f1589R.m438N((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
    }

    @Override // p000a.InterfaceC1487c
    /* renamed from: P */
    public final InputStream mo1155P() {
        return new ByteArrayInputStream(this.f1591S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof AbstractC0477J)) {
            return false;
        }
        return Arrays.equals(this.f1591S, ((AbstractC0477J) abstractC1593e).f1591S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public AbstractC1593e mo148g() {
        return new C1745gp(this.f1591S);
    }

    @Override // p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        return this;
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f1591S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public AbstractC1593e mo149k() {
        return new C1745gp(this.f1591S);
    }

    public final String toString() {
        C1998lZ c1998lZ = AbstractC2166oq.f6640z;
        byte[] bArr = this.f1591S;
        return "#".concat(AbstractC1878jN.m3499z(AbstractC2166oq.m3778z(bArr, bArr.length)));
    }
}
