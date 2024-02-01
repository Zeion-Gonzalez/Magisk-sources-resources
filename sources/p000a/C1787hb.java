package p000a;

/* renamed from: a.hb */
/* loaded from: classes.dex */
public final class C1787hb extends AbstractC0477J {

    /* renamed from: I */
    public final int f5616I;

    /* renamed from: q */
    public final AbstractC0477J[] f5617q;

    public C1787hb(byte[] bArr) {
        super(bArr);
        this.f5617q = null;
        this.f5616I = 1000;
    }

    /* renamed from: s */
    public static byte[] m3324s(AbstractC0477J[] abstractC0477JArr) {
        int length = abstractC0477JArr.length;
        if (length == 0) {
            return AbstractC0477J.f1590w;
        }
        if (length == 1) {
            return abstractC0477JArr[0].f1591S;
        }
        int i = 0;
        for (AbstractC0477J abstractC0477J : abstractC0477JArr) {
            i += abstractC0477J.f1591S.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (AbstractC0477J abstractC0477J2 : abstractC0477JArr) {
            byte[] bArr2 = abstractC0477J2.f1591S;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return true;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m337R(36, z);
        c0175dp.m343u(128);
        AbstractC0477J[] abstractC0477JArr = this.f5617q;
        if (abstractC0477JArr != null) {
            c0175dp.mo345w(abstractC0477JArr);
        } else {
            int i = 0;
            while (true) {
                byte[] bArr = this.f1591S;
                if (i >= bArr.length) {
                    break;
                }
                int min = Math.min(bArr.length - i, this.f5616I);
                c0175dp.m337R(4, true);
                c0175dp.m340W(min);
                c0175dp.m342o(bArr, i, min);
                i += min;
            }
        }
        c0175dp.m343u(0);
        c0175dp.m343u(0);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        AbstractC0477J[] abstractC0477JArr = this.f5617q;
        if (abstractC0477JArr != null) {
            for (AbstractC0477J abstractC0477J : abstractC0477JArr) {
                i += abstractC0477J.mo151w(true);
            }
            return i;
        }
        byte[] bArr = this.f1591S;
        int length = bArr.length;
        int i2 = this.f5616I;
        int i3 = length / i2;
        int m334Q = i + (C0175DP.m334Q(i2, true) * i3);
        int length2 = bArr.length - (i3 * i2);
        if (length2 > 0) {
            return m334Q + C0175DP.m334Q(length2, true);
        }
        return m334Q;
    }

    public C1787hb(byte[] bArr, AbstractC0477J[] abstractC0477JArr) {
        super(bArr);
        this.f5617q = abstractC0477JArr;
        this.f5616I = 1000;
    }

    public C1787hb(AbstractC0477J[] abstractC0477JArr) {
        this(m3324s(abstractC0477JArr), abstractC0477JArr);
    }
}
