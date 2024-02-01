package p000a;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a.o6 */
/* loaded from: classes.dex */
public final class C2126o6 implements InterfaceC0984SS {

    /* renamed from: I */
    public int f6532I;

    /* renamed from: R */
    public int f6533R;

    /* renamed from: S */
    public final InterfaceC0694N7 f6534S;

    /* renamed from: k */
    public int f6535k;

    /* renamed from: q */
    public int f6536q;

    /* renamed from: w */
    public int f6537w;

    public C2126o6(InterfaceC0694N7 interfaceC0694N7) {
        this.f6534S = interfaceC0694N7;
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        int i;
        int mo1620L;
        do {
            int i2 = this.f6536q;
            InterfaceC0694N7 interfaceC0694N7 = this.f6534S;
            if (i2 == 0) {
                interfaceC0694N7.mo1632r(this.f6535k);
                this.f6535k = 0;
                if ((this.f6537w & 4) != 0) {
                    return -1L;
                }
                i = this.f6532I;
                byte[] bArr = AbstractC1181W6.f3860z;
                int mo1616EC = ((interfaceC0694N7.mo1616EC() & 255) << 16) | ((interfaceC0694N7.mo1616EC() & 255) << 8) | (interfaceC0694N7.mo1616EC() & 255);
                this.f6536q = mo1616EC;
                this.f6533R = mo1616EC;
                int mo1616EC2 = interfaceC0694N7.mo1616EC() & 255;
                this.f6537w = interfaceC0694N7.mo1616EC() & 255;
                Logger logger = C2167or.f6641q;
                if (logger.isLoggable(Level.FINE)) {
                    C1623eY c1623eY = AbstractC2367sX.f7273z;
                    logger.fine(AbstractC2367sX.m4092z(this.f6532I, this.f6533R, mo1616EC2, this.f6537w, true));
                }
                mo1620L = interfaceC0694N7.mo1620L() & Integer.MAX_VALUE;
                this.f6532I = mo1620L;
                if (mo1616EC2 != 9) {
                    throw new IOException(mo1616EC2 + " != TYPE_CONTINUATION");
                }
            } else {
                long mo188M = interfaceC0694N7.mo188M(c2361sQ, Math.min(j, i2));
                if (mo188M == -1) {
                    return -1L;
                }
                this.f6536q -= (int) mo188M;
                return mo188M;
            }
        } while (mo1620L == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f6534S.mo189P();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
