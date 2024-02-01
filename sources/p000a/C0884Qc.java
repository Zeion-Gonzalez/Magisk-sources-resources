package p000a;

import java.util.Arrays;

/* renamed from: a.Qc */
/* loaded from: classes.dex */
public final class C0884Qc extends AbstractC1593e implements InterfaceC2175p {

    /* renamed from: S */
    public final char[] f3047S;

    public C0884Qc(char[] cArr) {
        this.f3047S = cArr;
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        return new String(this.f3047S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        char[] cArr = this.f3047S;
        int length = cArr.length;
        c0175dp.m337R(30, z);
        c0175dp.m340W(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            c0175dp.m342o(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 = i4 + 1;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            c0175dp.m342o(bArr, 0, i3);
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C0884Qc)) {
            return false;
        }
        return Arrays.equals(this.f3047S, ((C0884Qc) abstractC1593e).f3047S);
    }

    public final String toString() {
        return mo380Q();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f3047S.length * 2, z);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    /* renamed from: y */
    public final int hashCode() {
        char[] cArr = this.f3047S;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ cArr[length];
            } else {
                return i;
            }
        }
    }
}
