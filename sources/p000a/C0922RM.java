package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.RM */
/* loaded from: classes.dex */
public final class C0922RM extends InputStream {

    /* renamed from: R */
    public final /* synthetic */ InterfaceC0694N7 f3168R;

    /* renamed from: S */
    public final /* synthetic */ int f3169S;

    public /* synthetic */ C0922RM(InterfaceC0694N7 interfaceC0694N7, int i) {
        this.f3169S = i;
        this.f3168R = interfaceC0694N7;
    }

    @Override // java.io.InputStream
    public final int available() {
        long min;
        int i = this.f3169S;
        InterfaceC0694N7 interfaceC0694N7 = this.f3168R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                min = Math.min(((C2361sQ) interfaceC0694N7).f7260R, Integer.MAX_VALUE);
                break;
            default:
                C2323ri c2323ri = (C2323ri) interfaceC0694N7;
                if (!c2323ri.f7153w) {
                    min = Math.min(c2323ri.f7151R.f7260R, Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3169S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return;
            default:
                ((C2323ri) this.f3168R).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f3169S;
        InterfaceC0694N7 interfaceC0694N7 = this.f3168R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2361sQ c2361sQ = (C2361sQ) interfaceC0694N7;
                if (c2361sQ.f7260R > 0) {
                    return c2361sQ.mo1616EC() & 255;
                }
                return -1;
            default:
                C2323ri c2323ri = (C2323ri) interfaceC0694N7;
                if (c2323ri.f7153w) {
                    throw new IOException("closed");
                }
                C2361sQ c2361sQ2 = c2323ri.f7151R;
                if (c2361sQ2.f7260R == 0 && c2323ri.f7152S.mo188M(c2361sQ2, 8192L) == -1) {
                    return -1;
                }
                return c2361sQ2.mo1616EC() & 255;
        }
    }

    public final String toString() {
        int i = this.f3169S;
        InterfaceC0694N7 interfaceC0694N7 = this.f3168R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C2361sQ) interfaceC0694N7) + ".inputStream()";
            default:
                return ((C2323ri) interfaceC0694N7) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f3169S;
        InterfaceC0694N7 interfaceC0694N7 = this.f3168R;
        switch (i3) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C2361sQ) interfaceC0694N7).m4080ZH(bArr, i, i2);
            default:
                C2323ri c2323ri = (C2323ri) interfaceC0694N7;
                if (c2323ri.f7153w) {
                    throw new IOException("closed");
                }
                AbstractC0795Op.m1872u(bArr.length, i, i2);
                C2361sQ c2361sQ = c2323ri.f7151R;
                if (c2361sQ.f7260R == 0 && c2323ri.f7152S.mo188M(c2361sQ, 8192L) == -1) {
                    return -1;
                }
                return c2361sQ.m4080ZH(bArr, i, i2);
        }
    }
}
