package p000a;

/* renamed from: a.Q6 */
/* loaded from: classes.dex */
public final class C0862Q6 extends C1702g {
    /* renamed from: H */
    public final byte[] m1996H() {
        byte[] bArr = this.f5330S;
        if (bArr[bArr.length - 1] == 90) {
            if (!m3208r()) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                System.arraycopy(AbstractC1878jN.m3497h("0000Z"), 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!m3206Y()) {
                byte[] bArr3 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length - 1);
                System.arraycopy(AbstractC1878jN.m3497h("00Z"), 0, bArr3, bArr.length - 1, 3);
                return bArr3;
            }
            if (m3207f()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr4 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, length);
                    bArr4[length] = 90;
                    return bArr4;
                }
                byte[] bArr5 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr, 0, bArr5, 0, i);
                bArr5[i] = 90;
                return bArr5;
            }
        }
        return bArr;
    }

    @Override // p000a.C1702g, p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(24, z, m1996H());
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.C1702g, p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        return this;
    }

    @Override // p000a.C1702g, p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(m1996H().length, z);
    }
}
