package p000a;

/* renamed from: a.aG */
/* loaded from: classes.dex */
public final class C1400aG extends AbstractC1176W {

    /* renamed from: I */
    public final int f4406I;

    /* renamed from: q */
    public final AbstractC1176W[] f4407q;

    public C1400aG(int i, byte[] bArr) {
        super(i, bArr);
        this.f4407q = null;
        this.f4406I = 1000;
    }

    /* renamed from: U */
    public static byte[] m2820U(AbstractC1176W[] abstractC1176WArr) {
        int length = abstractC1176WArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC1176WArr[0].f3834S;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = abstractC1176WArr[i3].f3834S;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC1176WArr[i].f3834S;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (AbstractC1176W abstractC1176W : abstractC1176WArr) {
            byte[] bArr4 = abstractC1176W.f3834S;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return this.f4407q != null || this.f3834S.length > this.f4406I;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        boolean mo215R = mo215R();
        byte[] bArr = this.f3834S;
        if (!mo215R) {
            int length = bArr.length;
            c0175dp.m337R(3, z);
            c0175dp.m340W(length);
            c0175dp.m342o(bArr, 0, length);
            return;
        }
        c0175dp.m337R(35, z);
        c0175dp.m343u(128);
        AbstractC1176W[] abstractC1176WArr = this.f4407q;
        if (abstractC1176WArr != null) {
            c0175dp.mo345w(abstractC1176WArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.f4406I - 1;
            while (i > i2) {
                c0175dp.m337R(3, true);
                c0175dp.m340W(i2 + 1);
                c0175dp.m343u(0);
                c0175dp.m342o(bArr, length2 - i, i2);
                i -= i2;
            }
            c0175dp.m337R(3, true);
            c0175dp.m340W(i + 1);
            c0175dp.m343u(b);
            c0175dp.m342o(bArr, length2 - i, i);
        }
        c0175dp.m343u(0);
        c0175dp.m343u(0);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        int i;
        boolean mo215R = mo215R();
        byte[] bArr = this.f3834S;
        if (!mo215R) {
            return C0175DP.m334Q(bArr.length, z);
        }
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        AbstractC1176W[] abstractC1176WArr = this.f4407q;
        if (abstractC1176WArr != null) {
            for (AbstractC1176W abstractC1176W : abstractC1176WArr) {
                i += abstractC1176W.mo151w(true);
            }
            return i;
        }
        if (bArr.length >= 2) {
            int length = bArr.length - 2;
            int i2 = this.f4406I;
            int i3 = length / (i2 - 1);
            return C0175DP.m334Q(bArr.length - ((i2 - 1) * i3), true) + (C0175DP.m334Q(i2, true) * i3) + i;
        }
        return i;
    }

    public C1400aG(AbstractC1176W[] abstractC1176WArr) {
        super(m2820U(abstractC1176WArr));
        this.f4407q = abstractC1176WArr;
        this.f4406I = 1000;
    }
}
