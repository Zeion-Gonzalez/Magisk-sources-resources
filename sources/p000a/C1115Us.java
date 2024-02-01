package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.Us */
/* loaded from: classes.dex */
public final class C1115Us extends InputStream {

    /* renamed from: R */
    public boolean f3618R = true;

    /* renamed from: S */
    public final C2382so f3619S;

    /* renamed from: w */
    public InputStream f3620w;

    public C1115Us(C2382so c2382so) {
        this.f3619S = c2382so;
    }

    @Override // java.io.InputStream
    public final int read() {
        InterfaceC1487c m2295z;
        if (this.f3620w == null) {
            if (!this.f3618R || (m2295z = m2295z()) == null) {
                return -1;
            }
            this.f3618R = false;
            this.f3620w = m2295z.mo1155P();
        }
        while (true) {
            int read = this.f3620w.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC1487c m2295z2 = m2295z();
            if (m2295z2 == null) {
                this.f3620w = null;
                return -1;
            }
            this.f3620w = m2295z2.mo1155P();
        }
    }

    /* renamed from: z */
    public final InterfaceC1487c m2295z() {
        InterfaceC0959S m4103P;
        C2382so c2382so = this.f3619S;
        int read = ((InputStream) c2382so.f7314h).read();
        if (read < 0) {
            m4103P = null;
        } else {
            m4103P = c2382so.m4103P(read);
        }
        if (m4103P == null) {
            return null;
        }
        if (m4103P instanceof InterfaceC1487c) {
            return (InterfaceC1487c) m4103P;
        }
        throw new IOException("unknown object encountered: " + m4103P.getClass());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC1487c m2295z;
        int i3 = 0;
        if (this.f3620w == null) {
            if (!this.f3618R || (m2295z = m2295z()) == null) {
                return -1;
            }
            this.f3618R = false;
            this.f3620w = m2295z.mo1155P();
        }
        while (true) {
            int read = this.f3620w.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                InterfaceC1487c m2295z2 = m2295z();
                if (m2295z2 == null) {
                    this.f3620w = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f3620w = m2295z2.mo1155P();
            }
        }
    }
}
