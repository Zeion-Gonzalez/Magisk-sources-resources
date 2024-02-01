package p000a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/* renamed from: a.X */
/* loaded from: classes.dex */
public final class C1230X extends AbstractC1593e {

    /* renamed from: R */
    public byte[] f3998R;

    /* renamed from: S */
    public final String f3999S;

    public C1230X(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + (i2 & 127);
                if ((i2 & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f3999S = stringBuffer.toString();
        this.f3998R = bArr;
    }

    /* renamed from: E */
    public static void m2526E(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* renamed from: U */
    public static void m2527U(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0015, code lost:
    
        if (r2 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0017, code lost:
    
        if (r2 <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x001f, code lost:
    
        if (r8.charAt(r0 + 1) != '0') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002b, code lost:
    
        return false;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2528s(int r7, java.lang.String r8) {
        /*
            int r0 = r8.length()
            r1 = 0
        L5:
            r2 = r1
        L6:
            int r0 = r0 + (-1)
            r3 = 48
            r4 = 1
            if (r0 < r7) goto L2c
            char r5 = r8.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L22
            if (r2 == 0) goto L21
            if (r2 <= r4) goto L5
            int r2 = r0 + 1
            char r2 = r8.charAt(r2)
            if (r2 != r3) goto L5
        L21:
            return r1
        L22:
            if (r3 > r5) goto L2b
            r3 = 57
            if (r5 > r3) goto L2b
            int r2 = r2 + 1
            goto L6
        L2b:
            return r1
        L2c:
            if (r2 == 0) goto L39
            if (r2 <= r4) goto L38
            int r0 = r0 + r4
            char r7 = r8.charAt(r0)
            if (r7 != r3) goto L38
            goto L39
        L38:
            return r4
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1230X.m2528s(int, java.lang.String):boolean");
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(13, z, m2529y());
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (this == abstractC1593e) {
            return true;
        }
        if (abstractC1593e instanceof C1230X) {
            return this.f3999S.equals(((C1230X) abstractC1593e).f3999S);
        }
        return false;
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return this.f3999S.hashCode();
    }

    public final String toString() {
        return this.f3999S;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(m2529y().length, z);
    }

    /* renamed from: y */
    public final synchronized byte[] m2529y() {
        boolean z;
        String substring;
        if (this.f3998R == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (true) {
                if (i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
                if (i == -1) {
                    substring = null;
                } else {
                    String str = this.f3999S;
                    int indexOf = str.indexOf(46, i);
                    if (indexOf == -1) {
                        substring = str.substring(i);
                        i = -1;
                    } else {
                        substring = str.substring(i, indexOf);
                        i = indexOf + 1;
                    }
                }
                if (substring.length() <= 18) {
                    m2527U(byteArrayOutputStream, Long.parseLong(substring));
                } else {
                    m2526E(byteArrayOutputStream, new BigInteger(substring));
                }
            }
            this.f3998R = byteArrayOutputStream.toByteArray();
        }
        return this.f3998R;
    }
}
