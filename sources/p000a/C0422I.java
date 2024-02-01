package p000a;

import java.util.Arrays;

/* renamed from: a.I */
/* loaded from: classes.dex */
public final class C0422I extends AbstractC1593e {

    /* renamed from: R */
    public static final C0422I[] f1398R = new C0422I[12];

    /* renamed from: S */
    public final byte[] f1399S;

    public C0422I(byte[] bArr, boolean z) {
        byte[] bArr2;
        C2120o c2120o = C2339s.f7177w;
        int length = bArr.length;
        boolean z2 = true;
        int i = 0;
        if (length != 0 && (length == 1 || bArr[0] != (bArr[1] >> 7) || AbstractC1642et.m3118h("org.bouncycastle.asn1.allow_unsafe_integer"))) {
            z2 = false;
        }
        if (!z2) {
            if ((bArr[0] & 128) == 0) {
                if (z) {
                    bArr2 = AbstractC0438II.m1049w(bArr);
                } else {
                    bArr2 = bArr;
                }
                this.f1399S = bArr2;
                int length2 = bArr.length - 1;
                while (i < length2) {
                    byte b = bArr[i];
                    i++;
                    if (b != (bArr[i] >> 7)) {
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(10, z, this.f1399S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C0422I)) {
            return false;
        }
        return Arrays.equals(this.f1399S, ((C0422I) abstractC1593e).f1399S);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f1399S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f1399S.length, z);
    }
}
