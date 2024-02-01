package p000a;

/* renamed from: a.M */
/* loaded from: classes.dex */
public final class C0637M extends AbstractC1593e {

    /* renamed from: S */
    public final byte f2062S;

    /* renamed from: R */
    public static final C2120o f2060R = new C2120o(1, 2, C0637M.class);

    /* renamed from: w */
    public static final C0637M f2061w = new C0637M((byte) 0);

    /* renamed from: I */
    public static final C0637M f2059I = new C0637M((byte) -1);

    public C0637M(byte b) {
        this.f2062S = b;
    }

    /* renamed from: y */
    public static C0637M m1428y(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b != -1 ? b != 0 ? new C0637M(b) : f2061w : f2059I;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m337R(1, z);
        c0175dp.m340W(1);
        c0175dp.m343u(this.f2062S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        return (abstractC1593e instanceof C0637M) && m1429s() == ((C0637M) abstractC1593e).m1429s();
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return m1429s() ? 1 : 0;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        return m1429s() ? f2059I : f2061w;
    }

    /* renamed from: s */
    public final boolean m1429s() {
        return this.f2062S != 0;
    }

    public final String toString() {
        return m1429s() ? "TRUE" : "FALSE";
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(1, z);
    }
}
