package p000a;

import java.util.Arrays;

/* renamed from: a.zZ */
/* loaded from: classes.dex */
public final class C2732zZ extends AbstractC1593e implements InterfaceC2175p {

    /* renamed from: S */
    public final byte[] f8577S;

    public C2732zZ(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f8577S = AbstractC1878jN.m3497h(str);
    }

    @Override // p000a.InterfaceC2175p
    /* renamed from: Q */
    public final String mo380Q() {
        return AbstractC1878jN.m3499z(this.f8577S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(22, z, this.f8577S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C2732zZ)) {
            return false;
        }
        return Arrays.equals(this.f8577S, ((C2732zZ) abstractC1593e).f8577S);
    }

    public final String toString() {
        return mo380Q();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f8577S.length, z);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    /* renamed from: y */
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f8577S);
    }

    public C2732zZ(byte[] bArr) {
        this.f8577S = bArr;
    }
}
