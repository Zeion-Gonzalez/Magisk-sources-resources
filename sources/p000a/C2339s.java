package p000a;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: a.s */
/* loaded from: classes.dex */
public final class C2339s extends AbstractC1593e {

    /* renamed from: w */
    public static final C2120o f7177w = new C2120o(2, 9, C2339s.class);

    /* renamed from: R */
    public final int f7178R;

    /* renamed from: S */
    public final byte[] f7179S;

    public C2339s(long j) {
        this.f7179S = BigInteger.valueOf(j).toByteArray();
        this.f7178R = 0;
    }

    /* renamed from: y */
    public static C2339s m3996y(Object obj) {
        if (obj == null || (obj instanceof C2339s)) {
            return (C2339s) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
        }
        try {
            return (C2339s) f7177w.m438N((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(2, z, this.f7179S);
    }

    /* renamed from: U */
    public final int m3997U() {
        byte[] bArr = this.f7179S;
        int length = bArr.length;
        int i = this.f7178R;
        if (length - i <= 4) {
            int length2 = bArr.length;
            int max = Math.max(i, length2 - 4);
            int i2 = bArr[max] & (-1);
            while (true) {
                max++;
                if (max < length2) {
                    i2 = (i2 << 8) | (bArr[max] & 255);
                } else {
                    return i2;
                }
            }
        } else {
            throw new ArithmeticException("ASN.1 Integer out of int range");
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C2339s)) {
            return false;
        }
        return Arrays.equals(this.f7179S, ((C2339s) abstractC1593e).f7179S);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f7179S);
    }

    /* renamed from: s */
    public final boolean m3998s(int i) {
        byte[] bArr = this.f7179S;
        int length = bArr.length;
        int i2 = this.f7178R;
        if (length - i2 <= 4) {
            int length2 = bArr.length;
            int max = Math.max(i2, length2 - 4);
            int i3 = bArr[max] & (-1);
            while (true) {
                max++;
                if (max >= length2) {
                    break;
                }
                i3 = (i3 << 8) | (bArr[max] & 255);
            }
            if (i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return new BigInteger(this.f7179S).toString();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f7179S.length, z);
    }

    public C2339s(BigInteger bigInteger) {
        this.f7179S = bigInteger.toByteArray();
        this.f7178R = 0;
    }

    public C2339s(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        boolean z = true;
        if (length != 0 && (length == 1 || bArr[0] != (bArr[1] >> 7) || AbstractC1642et.m3118h("org.bouncycastle.asn1.allow_unsafe_integer"))) {
            z = false;
        }
        if (z) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f7179S = bArr;
        int length2 = bArr.length - 1;
        while (i < length2) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.f7178R = i;
    }
}
