package p000a;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: a.Jz */
/* loaded from: classes.dex */
public final class C0529Jz extends FilterOutputStream {
    public C0529Jz(OutputStream outputStream) {
        super(outputStream instanceof BufferedOutputStream ? outputStream : new BufferedOutputStream(outputStream));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }

    /* renamed from: z */
    public final void m1244z() {
        super.close();
    }
}
