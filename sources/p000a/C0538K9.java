package p000a;

import java.util.Arrays;

/* renamed from: a.K9 */
/* loaded from: classes.dex */
public final class C0538K9 extends AbstractC1593e implements InterfaceC2175p {

    /* renamed from: R */
    public static final char[] f1787R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: S */
    public final byte[] f1788S;

    public C0538K9(byte[] bArr) {
        this.f1788S = bArr;
    }

    /* renamed from: y */
    public static void m1250y(StringBuffer stringBuffer, int i) {
        char[] cArr = f1787R;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        byte[] bArr = this.f1788S;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((C0175DP.m333N(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            m1250y(stringBuffer, length);
        } else {
            byte[] bArr2 = new byte[5];
            int i = length;
            int i2 = 5;
            do {
                i2--;
                bArr2[i2] = (byte) i;
                i >>>= 8;
            } while (i != 0);
            int i3 = 5 - i2;
            int i4 = i2 - 1;
            bArr2[i4] = (byte) (128 | i3);
            while (true) {
                int i5 = i4 + 1;
                m1250y(stringBuffer, bArr2[i4]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            m1250y(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(28, z, this.f1788S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C0538K9)) {
            return false;
        }
        return Arrays.equals(this.f1788S, ((C0538K9) abstractC1593e).f1788S);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    /* renamed from: s */
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f1788S);
    }

    public final String toString() {
        return mo380Q();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f1788S.length, z);
    }
}
