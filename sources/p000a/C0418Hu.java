package p000a;

import java.nio.ByteBuffer;

/* renamed from: a.Hu */
/* loaded from: classes.dex */
public final class C0418Hu implements InterfaceC1432as {

    /* renamed from: R */
    public final C2361sQ f1391R = new C2361sQ();

    /* renamed from: S */
    public final InterfaceC2578wb f1392S;

    /* renamed from: w */
    public boolean f1393w;

    public C0418Hu(InterfaceC2578wb interfaceC2578wb) {
        this.f1392S = interfaceC2578wb;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: D */
    public final InterfaceC1432as mo936D(C1623eY c1623eY) {
        if ((!this.f1393w) != false) {
            C2361sQ c2361sQ = this.f1391R;
            c2361sQ.getClass();
            c1623eY.mo1983V(c2361sQ, c1623eY.mo1980P());
            mo941S();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: H */
    public final InterfaceC1432as mo937H(int i) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4070EQ(i);
        mo941S();
        return this;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: K */
    public final InterfaceC1432as mo938K(String str) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4071Fu(str);
        mo941S();
        return this;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: N */
    public final InterfaceC1432as mo939N(byte[] bArr) {
        if ((!this.f1393w) != false) {
            C2361sQ c2361sQ = this.f1391R;
            c2361sQ.getClass();
            c2361sQ.m4083dG(bArr, 0, bArr.length);
            mo941S();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: P */
    public final C1819iG mo607P() {
        return this.f1392S.mo607P();
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.mo608Q(c2361sQ, j);
        mo941S();
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: R */
    public final InterfaceC1432as mo940R(long j) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4090yF(j);
        mo941S();
        return this;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: S */
    public final InterfaceC1432as mo941S() {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        C2361sQ c2361sQ = this.f1391R;
        long m4069C = c2361sQ.m4069C();
        if (m4069C > 0) {
            this.f1392S.mo608Q(c2361sQ, m4069C);
        }
        return this;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: c */
    public final InterfaceC1432as mo942c(int i, int i2, String str) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4078Ry(i, i2, str);
        mo941S();
        return this;
    }

    @Override // p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC2578wb interfaceC2578wb = this.f1392S;
        if (!this.f1393w) {
            try {
                C2361sQ c2361sQ = this.f1391R;
                long j = c2361sQ.f7260R;
                if (j > 0) {
                    interfaceC2578wb.mo608Q(c2361sQ, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                interfaceC2578wb.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f1393w = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // p000a.InterfaceC1432as, p000a.InterfaceC2578wb, java.io.Flushable
    public final void flush() {
        if ((!this.f1393w) != false) {
            C2361sQ c2361sQ = this.f1391R;
            long j = c2361sQ.f7260R;
            InterfaceC2578wb interfaceC2578wb = this.f1392S;
            if (j > 0) {
                interfaceC2578wb.mo608Q(c2361sQ, j);
            }
            interfaceC2578wb.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: i */
    public final InterfaceC1432as mo943i(int i) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4088tJ(i);
        mo941S();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1393w;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: m */
    public final InterfaceC1432as mo944m(long j) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4082d3(j);
        mo941S();
        return this;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: qn */
    public final InterfaceC1432as mo945qn(int i) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4086nB(i);
        mo941S();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f1392S + ')';
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: u */
    public final InterfaceC1432as mo946u(byte[] bArr, int i, int i2) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        this.f1391R.m4083dG(bArr, i, i2);
        mo941S();
        return this;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: v */
    public final C2361sQ mo947v() {
        return this.f1391R;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if ((!this.f1393w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f1391R.write(byteBuffer);
        mo941S();
        return write;
    }
}
