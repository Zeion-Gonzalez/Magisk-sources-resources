package p000a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: a.rM */
/* loaded from: classes.dex */
public final class C2303rM extends AbstractC1593e implements InterfaceC2175p {

    /* renamed from: S */
    public final byte[] f7106S;

    public C2303rM(String str) {
        int i = AbstractC1878jN.f5861z;
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC1878jN.m3496P(charArray, byteArrayOutputStream);
            this.f7106S = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        int i = AbstractC1878jN.f5861z;
        byte[] bArr = this.f7106S;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = AbstractC0389HO.f1311z;
        int length2 = bArr.length + 0;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i2 < length2) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                if (i3 < length) {
                    cArr[i3] = (char) b;
                    i2 = i4;
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            } else {
                short s = AbstractC0389HO.f1311z[b & Byte.MAX_VALUE];
                int i5 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i4 >= length2) {
                            break loop0;
                        }
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        i5 = (i5 << 6) | (b3 & 63);
                        b2 = AbstractC0389HO.f1310h[b2 + ((b3 & 255) >>> 4)];
                        i4 = i6;
                    } else if (b2 != -2) {
                        if (i5 <= 65535) {
                            if (i3 < length) {
                                cArr[i3] = (char) i5;
                                i3++;
                                i2 = i4;
                            }
                        } else if (i3 < length - 1) {
                            int i7 = i3 + 1;
                            cArr[i3] = (char) ((i5 >>> 10) + 55232);
                            i3 = i7 + 1;
                            cArr[i7] = (char) ((i5 & 1023) | 56320);
                            i2 = i4;
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            return new String(cArr, 0, i3);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(12, z, this.f7106S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C2303rM)) {
            return false;
        }
        return Arrays.equals(this.f7106S, ((C2303rM) abstractC1593e).f7106S);
    }

    public final String toString() {
        return mo380Q();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f7106S.length, z);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    /* renamed from: y */
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f7106S);
    }

    public C2303rM(byte[] bArr) {
        this.f7106S = bArr;
    }
}
