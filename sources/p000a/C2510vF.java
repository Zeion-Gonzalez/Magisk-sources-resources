package p000a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: a.vF */
/* loaded from: classes.dex */
public final class C2510vF extends C0799Ov {

    /* renamed from: o */
    public static final C2252qQ f7686o = new C2252qQ(12, 0);

    /* renamed from: N */
    public final Method f7687N;

    /* renamed from: P */
    public final Method f7688P;

    /* renamed from: Q */
    public final Class f7689Q;

    /* renamed from: u */
    public final Class f7690u;

    /* renamed from: v */
    public final Method f7691v;

    public C2510vF(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f7691v = method;
        this.f7688P = method2;
        this.f7687N = method3;
        this.f7689Q = cls;
        this.f7690u = cls2;
    }

    @Override // p000a.C0799Ov
    /* renamed from: P */
    public final void mo297P(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f7691v.invoke(null, sSLSocket, Proxy.newProxyInstance(C0799Ov.class.getClassLoader(), new Class[]{this.f7689Q, this.f7690u}, new C2540vp(C2252qQ.m3894v(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: Q */
    public final String mo298Q(SSLSocket sSLSocket) {
        try {
            C2540vp c2540vp = (C2540vp) Proxy.getInvocationHandler(this.f7688P.invoke(null, sSLSocket));
            boolean z = c2540vp.f7772h;
            if (!z && c2540vp.f7773v == null) {
                C0799Ov.m1880G(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z) {
                return null;
            }
            return c2540vp.f7773v;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: z */
    public final void mo1889z(SSLSocket sSLSocket) {
        try {
            this.f7687N.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }
}
