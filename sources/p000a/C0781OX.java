package p000a;

/* renamed from: a.OX */
/* loaded from: classes.dex */
public final class C0781OX extends AbstractC1176W {

    /* renamed from: I */
    public final /* synthetic */ int f2641I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0781OX(int i, byte[] bArr) {
        super(bArr);
        this.f2641I = i;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        int i = this.f2641I;
        byte[] bArr = this.f3834S;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = bArr[0] & 255;
                int length = bArr.length - 1;
                byte b = bArr[length];
                byte b2 = (byte) ((255 << i2) & b);
                if (b == b2) {
                    c0175dp.m336M(3, z, bArr);
                    return;
                }
                c0175dp.m337R(3, z);
                c0175dp.m340W(length + 1);
                c0175dp.m342o(bArr, 0, length);
                c0175dp.m343u(b2);
                return;
            default:
                c0175dp.m336M(3, z, bArr);
                return;
        }
    }

    @Override // p000a.AbstractC1176W, p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC1176W, p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        switch (this.f2641I) {
            case AbstractC0795Op.f2698E /* 0 */:
                return this;
            default:
                return super.mo149k();
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        int i = this.f2641I;
        byte[] bArr = this.f3834S;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return C0175DP.m334Q(bArr.length, z);
            default:
                return C0175DP.m334Q(bArr.length, z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0781OX(byte[] bArr) {
        this(bArr, 0);
        this.f2641I = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0781OX(byte[] bArr, int i) {
        super(0, bArr);
        this.f2641I = 0;
    }
}
