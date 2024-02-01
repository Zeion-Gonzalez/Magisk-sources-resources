package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.IZ */
/* loaded from: classes.dex */
public final class C0451IZ implements InterfaceC0314G {

    /* renamed from: R */
    public int f1520R = 0;

    /* renamed from: S */
    public final C1312YZ f1521S;

    public C0451IZ(C1312YZ c1312yz) {
        this.f1521S = c1312yz;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        try {
            return mo953h();
        } catch (IOException e) {
            throw new C0367H(0, "IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        return AbstractC1176W.m2405y(this.f1521S.m2707h());
    }

    @Override // p000a.InterfaceC0314G
    /* renamed from: o */
    public final int mo690o() {
        return this.f1520R;
    }

    @Override // p000a.InterfaceC0314G
    /* renamed from: v */
    public final InputStream mo691v() {
        C1312YZ c1312yz = this.f1521S;
        int i = c1312yz.f4175I;
        if (i >= 1) {
            int read = c1312yz.read();
            this.f1520R = read;
            if (read > 0) {
                if (i >= 2) {
                    if (read > 7) {
                        throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
                    }
                } else {
                    throw new IllegalStateException("zero length data with non-zero pad bits");
                }
            }
            return c1312yz;
        }
        throw new IllegalStateException("content octets cannot be empty");
    }
}
