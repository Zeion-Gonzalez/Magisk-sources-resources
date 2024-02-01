package p000a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: a.E */
/* loaded from: classes.dex */
public abstract class AbstractC0209E implements InterfaceC0959S {
    /* renamed from: G */
    public final byte[] m416G() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC1593e N = mo302N();
        N.getClass();
        N.mo144S(new C0175DP(5, byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: M */
    public final byte[] m417M() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC1593e N = mo302N();
        N.getClass();
        N.mo149k().mo144S(new C0242Ec(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: W */
    public void mo418W(OutputStream outputStream) {
        AbstractC1593e N = mo302N();
        N.getClass();
        N.mo149k().mo144S(new C0242Ec(outputStream), true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC0959S) {
            return mo302N().m3068I(((InterfaceC0959S) obj).mo302N());
        }
        return false;
    }

    public int hashCode() {
        return mo302N().hashCode();
    }
}
