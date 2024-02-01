package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.oR */
/* loaded from: classes.dex */
public final class C2144oR extends InputStream {

    /* renamed from: S */
    public final C2382so f6596S;

    /* renamed from: k */
    public InputStream f6597k;

    /* renamed from: q */
    public InterfaceC0314G f6598q;

    /* renamed from: w */
    public boolean f6599w = true;

    /* renamed from: I */
    public int f6594I = 0;

    /* renamed from: R */
    public final boolean f6595R = false;

    public C2144oR(C2382so c2382so) {
        this.f6596S = c2382so;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f6597k == null) {
            if (!this.f6599w) {
                return -1;
            }
            InterfaceC0314G m3762z = m3762z();
            this.f6598q = m3762z;
            if (m3762z == null) {
                return -1;
            }
            this.f6599w = false;
            this.f6597k = m3762z.mo691v();
        }
        while (true) {
            int read = this.f6597k.read();
            if (read >= 0) {
                return read;
            }
            this.f6594I = this.f6598q.mo690o();
            InterfaceC0314G m3762z2 = m3762z();
            this.f6598q = m3762z2;
            if (m3762z2 == null) {
                this.f6597k = null;
                return -1;
            }
            this.f6597k = m3762z2.mo691v();
        }
    }

    /* renamed from: z */
    public final InterfaceC0314G m3762z() {
        InterfaceC0959S m4103P;
        C2382so c2382so = this.f6596S;
        int read = ((InputStream) c2382so.f7314h).read();
        if (read < 0) {
            m4103P = null;
        } else {
            m4103P = c2382so.m4103P(read);
        }
        if (m4103P == null) {
            if (!this.f6595R || this.f6594I == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f6594I);
        }
        if (m4103P instanceof InterfaceC0314G) {
            if (this.f6594I == 0) {
                return (InterfaceC0314G) m4103P;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + m4103P.getClass());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this.f6597k == null) {
            if (!this.f6599w) {
                return -1;
            }
            InterfaceC0314G m3762z = m3762z();
            this.f6598q = m3762z;
            if (m3762z == null) {
                return -1;
            }
            this.f6599w = false;
            this.f6597k = m3762z.mo691v();
        }
        while (true) {
            int read = this.f6597k.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.f6594I = this.f6598q.mo690o();
                InterfaceC0314G m3762z2 = m3762z();
                this.f6598q = m3762z2;
                if (m3762z2 == null) {
                    this.f6597k = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f6597k = m3762z2.mo691v();
            }
        }
    }
}
