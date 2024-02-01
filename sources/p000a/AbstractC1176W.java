package p000a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.W */
/* loaded from: classes.dex */
public abstract class AbstractC1176W extends AbstractC1593e implements InterfaceC2175p, InterfaceC0314G {

    /* renamed from: R */
    public static final C2120o f3832R = new C2120o(3, 1, AbstractC1176W.class);

    /* renamed from: w */
    public static final char[] f3833w = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: S */
    public final byte[] f3834S;

    public AbstractC1176W(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.f3834S = bArr2;
    }

    /* renamed from: s */
    public static AbstractC1176W m2404s(Object obj) {
        if (obj == null || (obj instanceof AbstractC1176W)) {
            return (AbstractC1176W) obj;
        }
        if (obj instanceof InterfaceC0959S) {
            AbstractC1593e mo302N = ((InterfaceC0959S) obj).mo302N();
            if (mo302N instanceof AbstractC1176W) {
                return (AbstractC1176W) mo302N;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC1176W) f3832R.m438N((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
    }

    /* renamed from: y */
    public static C0781OX m2405y(byte[] bArr) {
        int length = bArr.length;
        int i = 1;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i2 = 0;
        int i3 = bArr[0] & 255;
        if (i3 > 0) {
            if (i3 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((255 << i3) & b))) {
                return new C0781OX(i, bArr);
            }
        }
        return new C0781OX(i2, bArr);
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        int i = 0;
        try {
            byte[] m416G = m416G();
            StringBuffer stringBuffer = new StringBuffer((m416G.length * 2) + 1);
            stringBuffer.append('#');
            while (i != m416G.length) {
                byte b = m416G[i];
                char[] cArr = f3833w;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
                i++;
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C0367H(i, "Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof AbstractC1176W)) {
            return false;
        }
        byte[] bArr = ((AbstractC1176W) abstractC1593e).f3834S;
        byte[] bArr2 = this.f3834S;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public AbstractC1593e mo148g() {
        return new C0781OX(1, this.f3834S);
    }

    @Override // p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        return this;
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        byte[] bArr = this.f3834S;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length - 1;
        byte b = (byte) ((255 << i2) & bArr[length]);
        if (bArr != null) {
            int i3 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i3 = (i3 * 257) ^ bArr[0 + length];
            }
            i = i3;
        }
        return (i * 257) ^ b;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public AbstractC1593e mo149k() {
        return new C0781OX(0, this.f3834S);
    }

    @Override // p000a.InterfaceC0314G
    /* renamed from: o */
    public final int mo690o() {
        return this.f3834S[0] & 255;
    }

    public final String toString() {
        return mo380Q();
    }

    @Override // p000a.InterfaceC0314G
    /* renamed from: v */
    public final InputStream mo691v() {
        byte[] bArr = this.f3834S;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public AbstractC1176W(byte[] bArr) {
        this.f3834S = bArr;
    }
}
