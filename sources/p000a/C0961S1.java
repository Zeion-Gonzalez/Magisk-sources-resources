package p000a;

import java.io.IOException;

/* renamed from: a.S1 */
/* loaded from: classes.dex */
public final class C0961S1 extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ int f3266N;

    /* renamed from: Q */
    public final /* synthetic */ C0669Mf f3267Q;

    /* renamed from: u */
    public final /* synthetic */ Object f3268u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0961S1(String str, C0669Mf c0669Mf, Object obj, int i) {
        super(str, true);
        this.f3266N = i;
        this.f3267Q = c0669Mf;
        this.f3268u = obj;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        switch (this.f3266N) {
            case AbstractC0795Op.f2698E /* 0 */:
                this.f3267Q.f2192R.mo1789z((C1148VU) ((C1640ep) this.f3268u).f5100S);
                return -1L;
            default:
                try {
                    this.f3267Q.f2192R.mo1785h((C0573Kk) this.f3268u);
                } catch (IOException e) {
                    C0799Ov c0799Ov = C0799Ov.f2726z;
                    C0799Ov c0799Ov2 = C0799Ov.f2726z;
                    String str = "Http2Connection.Listener failure for " + this.f3267Q.f2189I;
                    c0799Ov2.getClass();
                    C0799Ov.m1881W(4, str, e);
                    try {
                        ((C0573Kk) this.f3268u).m1305v(EnumC0754O6.f2563w, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}
