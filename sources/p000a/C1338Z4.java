package p000a;

import java.util.Arrays;

/* renamed from: a.Z4 */
/* loaded from: classes.dex */
public final class C1338Z4 extends AbstractC1593e implements InterfaceC2175p {

    /* renamed from: S */
    public final byte[] f4232S;

    static {
        new C2120o(25, 7, C1338Z4.class);
    }

    public C1338Z4(byte[] bArr) {
        if (bArr != null) {
            this.f4232S = bArr;
            return;
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        return AbstractC1878jN.m3499z(this.f4232S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(25, z, this.f4232S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C1338Z4)) {
            return false;
        }
        return Arrays.equals(this.f4232S, ((C1338Z4) abstractC1593e).f4232S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f4232S.length, z);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    /* renamed from: y */
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f4232S);
    }
}
