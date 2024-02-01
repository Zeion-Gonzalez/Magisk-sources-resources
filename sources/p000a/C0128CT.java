package p000a;

import java.io.IOException;

/* renamed from: a.CT */
/* loaded from: classes.dex */
public final class C0128CT extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ int f439N;

    /* renamed from: Q */
    public final /* synthetic */ C0669Mf f440Q;

    /* renamed from: o */
    public final /* synthetic */ Object f441o;

    /* renamed from: u */
    public final /* synthetic */ int f442u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0128CT(String str, C0669Mf c0669Mf, int i, Object obj, int i2) {
        super(str, true);
        this.f439N = i2;
        this.f440Q = c0669Mf;
        this.f442u = i;
        this.f441o = obj;
    }

    /* renamed from: h */
    private void m255h() {
        this.f440Q.f2201f.getClass();
        try {
            this.f440Q.f2191L.m4267x(this.f442u, EnumC0754O6.f2560g);
            synchronized (this.f440Q) {
                this.f440Q.f2199d.remove(Integer.valueOf(this.f442u));
            }
        } catch (IOException unused) {
        }
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        switch (this.f439N) {
            case AbstractC0795Op.f2698E /* 0 */:
                this.f440Q.f2201f.getClass();
                synchronized (this.f440Q) {
                    this.f440Q.f2199d.remove(Integer.valueOf(this.f442u));
                }
                return -1L;
            case 1:
                C0669Mf c0669Mf = this.f440Q;
                try {
                    c0669Mf.f2191L.m4267x(this.f442u, (EnumC0754O6) this.f441o);
                } catch (IOException e) {
                    c0669Mf.m1564h(e);
                }
                return -1L;
            default:
                m255h();
                return -1L;
        }
    }
}
