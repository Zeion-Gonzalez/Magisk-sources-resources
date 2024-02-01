package p000a;

import java.io.IOException;

/* renamed from: a.ie */
/* loaded from: classes.dex */
public final class C1840ie extends AbstractC2099nZ {

    /* renamed from: R */
    public final InterfaceC2364sT f5742R;

    /* renamed from: w */
    public boolean f5743w;

    public C1840ie(C0292FY c0292fy, InterfaceC2364sT interfaceC2364sT) {
        super(c0292fy);
        this.f5742R = interfaceC2364sT;
    }

    @Override // p000a.AbstractC2099nZ, p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        if (this.f5743w) {
            c2361sQ.mo1632r(j);
            return;
        }
        try {
            super.mo608Q(c2361sQ, j);
        } catch (IOException e) {
            this.f5743w = true;
            this.f5742R.mo85W(e);
        }
    }

    @Override // p000a.AbstractC2099nZ, p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5743w) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f5743w = true;
            this.f5742R.mo85W(e);
        }
    }

    @Override // p000a.AbstractC2099nZ, p000a.InterfaceC2578wb, java.io.Flushable
    public final void flush() {
        if (this.f5743w) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f5743w = true;
            this.f5742R.mo85W(e);
        }
    }
}
