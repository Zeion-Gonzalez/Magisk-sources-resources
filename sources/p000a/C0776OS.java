package p000a;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: a.OS */
/* loaded from: classes.dex */
public final class C0776OS extends FilterInputStream {
    public C0776OS(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* renamed from: z */
    public final void m1791z() {
        ((FilterInputStream) this).in.close();
    }
}
