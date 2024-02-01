package p000a;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: a.C */
/* loaded from: classes.dex */
public abstract class AbstractC0102C extends AbstractC1593e implements Iterable {

    /* renamed from: w */
    public static final C2120o f386w = new C2120o(17, 18, AbstractC0102C.class);

    /* renamed from: R */
    public InterfaceC0959S[] f387R;

    /* renamed from: S */
    public final InterfaceC0959S[] f388S;

    public AbstractC0102C() {
        InterfaceC0959S[] interfaceC0959SArr = C2551w.f7795P;
        this.f388S = interfaceC0959SArr;
        this.f387R = interfaceC0959SArr;
    }

    /* renamed from: U */
    public static void m212U(InterfaceC0959S[] interfaceC0959SArr) {
        int length = interfaceC0959SArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC0959S interfaceC0959S = interfaceC0959SArr[0];
        InterfaceC0959S interfaceC0959S2 = interfaceC0959SArr[1];
        byte[] m214y = m214y(interfaceC0959S);
        byte[] m214y2 = m214y(interfaceC0959S2);
        if (m213s(m214y2, m214y)) {
            interfaceC0959S2 = interfaceC0959S;
            interfaceC0959S = interfaceC0959S2;
        } else {
            m214y2 = m214y;
            m214y = m214y2;
        }
        for (int i = 2; i < length; i++) {
            InterfaceC0959S interfaceC0959S3 = interfaceC0959SArr[i];
            byte[] m214y3 = m214y(interfaceC0959S3);
            if (m213s(m214y, m214y3)) {
                interfaceC0959SArr[i - 2] = interfaceC0959S;
                interfaceC0959S = interfaceC0959S2;
                m214y2 = m214y;
                interfaceC0959S2 = interfaceC0959S3;
                m214y = m214y3;
            } else if (m213s(m214y2, m214y3)) {
                interfaceC0959SArr[i - 2] = interfaceC0959S;
                interfaceC0959S = interfaceC0959S3;
                m214y2 = m214y3;
            } else {
                int i2 = i - 1;
                while (true) {
                    i2--;
                    if (i2 <= 0) {
                        break;
                    }
                    InterfaceC0959S interfaceC0959S4 = interfaceC0959SArr[i2 - 1];
                    if (m213s(m214y(interfaceC0959S4), m214y3)) {
                        break;
                    } else {
                        interfaceC0959SArr[i2] = interfaceC0959S4;
                    }
                }
                interfaceC0959SArr[i2] = interfaceC0959S3;
            }
        }
        interfaceC0959SArr[length - 2] = interfaceC0959S;
        interfaceC0959SArr[length - 1] = interfaceC0959S2;
    }

    /* renamed from: s */
    public static boolean m213s(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    /* renamed from: y */
    public static byte[] m214y(InterfaceC0959S interfaceC0959S) {
        try {
            return interfaceC0959S.mo302N().m417M();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return true;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof AbstractC0102C)) {
            return false;
        }
        AbstractC0102C abstractC0102C = (AbstractC0102C) abstractC1593e;
        int length = this.f388S.length;
        if (abstractC0102C.f388S.length != length) {
            return false;
        }
        C2420ta c2420ta = (C2420ta) mo149k();
        C2420ta c2420ta2 = (C2420ta) abstractC0102C.mo149k();
        for (int i = 0; i < length; i++) {
            AbstractC1593e mo302N = c2420ta.f388S[i].mo302N();
            AbstractC1593e mo302N2 = c2420ta2.f388S[i].mo302N();
            if (mo302N != mo302N2 && !mo302N.mo216V(mo302N2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public AbstractC1593e mo148g() {
        return new C0152Cy(this.f388S, this.f387R);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        InterfaceC0959S[] interfaceC0959SArr = this.f388S;
        int length = interfaceC0959SArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += interfaceC0959SArr[length].mo302N().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1626eb(C2551w.m4368h(this.f388S));
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public AbstractC1593e mo149k() {
        if (this.f387R == null) {
            InterfaceC0959S[] interfaceC0959SArr = (InterfaceC0959S[]) this.f388S.clone();
            this.f387R = interfaceC0959SArr;
            m212U(interfaceC0959SArr);
        }
        return new C2420ta(this.f387R, 0);
    }

    public final String toString() {
        InterfaceC0959S[] interfaceC0959SArr = this.f388S;
        int length = interfaceC0959SArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(interfaceC0959SArr[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC0102C(C2551w c2551w, boolean z) {
        InterfaceC0959S[] m4369P;
        int i;
        if (c2551w == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z || (i = c2551w.f7796h) < 2) {
            m4369P = c2551w.m4369P();
        } else {
            if (i == 0) {
                m4369P = C2551w.f7795P;
            } else {
                InterfaceC0959S[] interfaceC0959SArr = new InterfaceC0959S[i];
                System.arraycopy(c2551w.f7798z, 0, interfaceC0959SArr, 0, i);
                m4369P = interfaceC0959SArr;
            }
            m212U(m4369P);
        }
        this.f388S = m4369P;
        if (!z && m4369P.length >= 2) {
            m4369P = null;
        }
        this.f387R = m4369P;
    }

    public AbstractC0102C(AbstractC0209E abstractC0209E) {
        InterfaceC0959S[] interfaceC0959SArr = {abstractC0209E};
        this.f388S = interfaceC0959SArr;
        this.f387R = interfaceC0959SArr;
    }

    public AbstractC0102C(boolean z, InterfaceC0959S[] interfaceC0959SArr) {
        this.f388S = interfaceC0959SArr;
        if (!z && interfaceC0959SArr.length >= 2) {
            interfaceC0959SArr = null;
        }
        this.f387R = interfaceC0959SArr;
    }

    public AbstractC0102C(InterfaceC0959S[] interfaceC0959SArr, boolean z) {
        boolean z2 = true;
        if (interfaceC0959SArr != null) {
            int length = interfaceC0959SArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = false;
                    break;
                } else if (interfaceC0959SArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z2) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        InterfaceC0959S[] m4368h = C2551w.m4368h(interfaceC0959SArr);
        if (z && m4368h.length >= 2) {
            m212U(m4368h);
        }
        this.f388S = m4368h;
        if (!z && m4368h.length >= 2) {
            interfaceC0959SArr = null;
        }
        this.f387R = interfaceC0959SArr;
    }

    public AbstractC0102C(InterfaceC0959S[] interfaceC0959SArr, InterfaceC0959S[] interfaceC0959SArr2) {
        this.f388S = interfaceC0959SArr;
        this.f387R = interfaceC0959SArr2;
    }
}
