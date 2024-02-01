package p000a;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Bx */
/* loaded from: classes.dex */
public final class C0100Bx implements InterfaceC0984SS {

    /* renamed from: I */
    public final /* synthetic */ InterfaceC1432as f382I;

    /* renamed from: R */
    public final /* synthetic */ InterfaceC0694N7 f383R;

    /* renamed from: S */
    public boolean f384S;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2135oG f385w;

    public C0100Bx(InterfaceC0694N7 interfaceC0694N7, C2315ra c2315ra, C0418Hu c0418Hu) {
        this.f383R = interfaceC0694N7;
        this.f385w = c2315ra;
        this.f382I = c0418Hu;
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        try {
            long mo188M = this.f383R.mo188M(c2361sQ, j);
            InterfaceC1432as interfaceC1432as = this.f382I;
            if (mo188M == -1) {
                if (!this.f384S) {
                    this.f384S = true;
                    interfaceC1432as.close();
                }
                return -1L;
            }
            c2361sQ.m4089x(interfaceC1432as.mo947v(), c2361sQ.f7260R - mo188M, mo188M);
            interfaceC1432as.mo941S();
            return mo188M;
        } catch (IOException e) {
            if (!this.f384S) {
                this.f384S = true;
                ((C2315ra) this.f385w).m3974z();
            }
            throw e;
        }
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f383R.mo189P();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!this.f384S) {
            try {
                z = AbstractC1181W6.m2425k(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f384S = true;
                ((C2315ra) this.f385w).m3974z();
            }
        }
        this.f383R.close();
    }
}
