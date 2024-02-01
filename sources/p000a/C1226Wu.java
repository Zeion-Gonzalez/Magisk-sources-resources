package p000a;

import java.util.Arrays;

/* renamed from: a.Wu */
/* loaded from: classes.dex */
public final class C1226Wu extends AbstractC1593e implements InterfaceC2175p {

    /* renamed from: S */
    public final byte[] f3994S;

    public C1226Wu(byte[] bArr) {
        this.f3994S = bArr;
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        return AbstractC1878jN.m3499z(this.f3994S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(18, z, this.f3994S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C1226Wu)) {
            return false;
        }
        return Arrays.equals(this.f3994S, ((C1226Wu) abstractC1593e).f3994S);
    }

    public final String toString() {
        return mo380Q();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f3994S.length, z);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    /* renamed from: y */
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f3994S);
    }
}
