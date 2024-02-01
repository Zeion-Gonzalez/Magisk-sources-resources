package p000a;

import java.io.Closeable;
import java.nio.charset.Charset;

/* renamed from: a.bB */
/* loaded from: classes.dex */
public abstract class AbstractC1449bB implements Closeable {
    /* renamed from: G */
    public abstract InterfaceC0694N7 mo1577G();

    /* renamed from: V */
    public final String m2869V() {
        Charset charset;
        InterfaceC0694N7 mo1577G = mo1577G();
        try {
            C0003A3 mo1578h = mo1578h();
            if (mo1578h == null || (charset = mo1578h.m21z(AbstractC2047ma.f6374z)) == null) {
                charset = AbstractC2047ma.f6374z;
            }
            String mo1623UZ = mo1577G.mo1623UZ(AbstractC1181W6.m2427q(mo1577G, charset));
            AbstractC1292YB.m2659R(mo1577G, null);
            return mo1623UZ;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC1181W6.m2430v(mo1577G());
    }

    /* renamed from: h */
    public abstract C0003A3 mo1578h();

    /* renamed from: z */
    public abstract long mo1579z();
}
