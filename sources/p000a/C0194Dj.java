package p000a;

import java.util.Arrays;

/* renamed from: a.Dj */
/* loaded from: classes.dex */
public final class C0194Dj extends AbstractC1593e implements InterfaceC2175p {

    /* renamed from: S */
    public final byte[] f594S;

    public C0194Dj(String str) {
        this.f594S = AbstractC1878jN.m3497h(str);
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        return AbstractC1878jN.m3499z(this.f594S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(19, z, this.f594S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C0194Dj)) {
            return false;
        }
        return Arrays.equals(this.f594S, ((C0194Dj) abstractC1593e).f594S);
    }

    public final String toString() {
        return mo380Q();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f594S.length, z);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    /* renamed from: y */
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f594S);
    }

    public C0194Dj(byte[] bArr) {
        this.f594S = bArr;
    }
}
