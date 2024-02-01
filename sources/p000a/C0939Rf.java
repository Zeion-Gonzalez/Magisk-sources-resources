package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.Rf */
/* loaded from: classes.dex */
public final class C0939Rf implements InterfaceC1827iP {

    /* renamed from: R */
    public final Object f3222R;

    /* renamed from: S */
    public final /* synthetic */ int f3223S;

    public /* synthetic */ C0939Rf(int i, Object obj) {
        this.f3223S = i;
        this.f3222R = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3223S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return;
            default:
                try {
                    ((InputStream) this.f3222R).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
        }
    }
}
