package p000a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: a.Rj */
/* loaded from: classes.dex */
public class C0943Rj implements InterfaceC2391sz {

    /* renamed from: Q */
    public static final C0163DA f3237Q = new C0163DA();

    /* renamed from: N */
    public final Method f3238N;

    /* renamed from: P */
    public final Method f3239P;

    /* renamed from: h */
    public final Method f3240h;

    /* renamed from: v */
    public final Method f3241v;

    /* renamed from: z */
    public final Class f3242z;

    public C0943Rj(Class cls) {
        this.f3242z = cls;
        this.f3240h = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.f3241v = cls.getMethod("setHostname", String.class);
        this.f3239P = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f3238N = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: P */
    public final void mo1166P(SSLSocket sSLSocket, String str, List list) {
        if (mo1169z(sSLSocket)) {
            try {
                this.f3240h.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3241v.invoke(sSLSocket, str);
                }
                Method method = this.f3238N;
                C0799Ov c0799Ov = C0799Ov.f2726z;
                method.invoke(sSLSocket, C2252qQ.m3891o(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: h */
    public final String mo1167h(SSLSocket sSLSocket) {
        if (!mo1169z(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f3239P.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, AbstractC2047ma.f6374z);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && AbstractC1292YB.m2695u(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: v */
    public final boolean mo1168v() {
        return C2529va.f7743N.m3897w();
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: z */
    public final boolean mo1169z(SSLSocket sSLSocket) {
        return this.f3242z.isInstance(sSLSocket);
    }
}
