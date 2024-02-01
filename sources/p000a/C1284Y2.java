package p000a;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* renamed from: a.Y2 */
/* loaded from: classes.dex */
public final class C1284Y2 implements Closeable, Flushable {

    /* renamed from: S */
    public final C0437IH f4118S;

    public C1284Y2(File file) {
        this.f4118S = new C0437IH(file, C0634Lw.f2051o);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4118S.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f4118S.flush();
    }

    /* renamed from: h */
    public final synchronized void m2628h() {
    }

    /* renamed from: z */
    public final void m2629z(C1364ZX c1364zx) {
        C0437IH c0437ih = this.f4118S;
        String m96P = C0054B3.m96P((C2658y7) c1364zx.f4279h);
        synchronized (c0437ih) {
            c0437ih.m986y();
            c0437ih.m987z();
            C0437IH.m974Ha(m96P);
            C0878QT c0878qt = (C0878QT) c0437ih.f1448s.get(m96P);
            if (c0878qt != null) {
                c0437ih.m981ZH(c0878qt);
                if (c0437ih.f1444g <= c0437ih.f1449w) {
                    c0437ih.f1435J = false;
                }
            }
        }
    }
}
