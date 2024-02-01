package p000a;

import java.io.IOException;

/* renamed from: a.F8 */
/* loaded from: classes.dex */
public final class C0269F8 extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ C0669Mf f950N;

    /* renamed from: Q */
    public final /* synthetic */ int f951Q;

    /* renamed from: o */
    public final /* synthetic */ int f952o;

    /* renamed from: u */
    public final /* synthetic */ C2361sQ f953u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0269F8(String str, C0669Mf c0669Mf, int i, C2361sQ c2361sQ, int i2, boolean z) {
        super(str, true);
        this.f950N = c0669Mf;
        this.f951Q = i;
        this.f953u = c2361sQ;
        this.f952o = i2;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        try {
            C1710g8 c1710g8 = this.f950N.f2201f;
            C2361sQ c2361sQ = this.f953u;
            int i = this.f952o;
            c1710g8.getClass();
            c2361sQ.mo1632r(i);
            this.f950N.f2191L.m4267x(this.f951Q, EnumC0754O6.f2560g);
            synchronized (this.f950N) {
                this.f950N.f2199d.remove(Integer.valueOf(this.f951Q));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
